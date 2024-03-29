package com.example.permission.util;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author CookiesEason
 * 2019/01/19 16:16
 */
public class StringUtil {

    public static List<Integer> splitToListInt(String str) {
        List<String> strList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str);
        return strList.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

}
