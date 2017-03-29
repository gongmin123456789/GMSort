package com.oppo.oppomediacontrol.util.GMSort;

/**
 * Created by 80066158 on 2017-03-23.
 */

public class GMSort<T> {
    private GMSortMethod<T> sortMethod = null;

    public GMSort(GMSortMethod<T> sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void start() {
        sortMethod.start();
    }
}
