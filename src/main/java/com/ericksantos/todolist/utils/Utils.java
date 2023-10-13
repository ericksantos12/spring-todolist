package com.ericksantos.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    /**
     * Copies non-null properties from the source object to the target object.
     *
     * @param source the source object from which properties will be copied
     * @param target the target object to which properties will be copied
     */
    public static void copyNonNullProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }

    /**
     * Retrieves the names of properties that have a null value in the given object.
     *
     * @param source the object to retrieve the property names from
     * @return an array of property names with null values
     */
    public static String[] getNullPropertyNames(Object source) {
        // Create a BeanWrapper object to access the properties of the given object
        final BeanWrapper src = new BeanWrapperImpl(source);

        // Get all the property descriptors of the given object
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        // Create a set to store the names of properties with null values
        Set<String> emptyNames = new HashSet<>();

        // Iterate over the property descriptors
        for (PropertyDescriptor pd : pds) {
            // Get the value of the property
            Object srcValue = src.getPropertyValue(pd.getName());

            // If the value is null, add the property name to the set
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }

        // Convert the set of property names into an array and return it
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
