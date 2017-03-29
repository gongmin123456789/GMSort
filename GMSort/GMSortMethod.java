package com.oppo.oppomediacontrol.util.GMSort;

import java.util.List;

/**
 * Created by 80066158 on 2017-03-23.
 */

public abstract class GMSortMethod<T> {
    protected List<T> dataList = null;
    protected GMComparator<T> comparator = null;

    public abstract void start();

    public GMSortMethod(List<T> dataList, GMComparator<T> comparator) {
        this.dataList = dataList;
        this.comparator = comparator;
    }
}
