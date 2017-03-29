package com.oppo.oppomediacontrol.util.GMSort;

import java.util.List;

/**
 * Created by 80066158 on 2017-03-23.
 */

public class GMInsertionSort<T> extends GMSortMethod {
    public GMInsertionSort(List<T> dataList, GMComparator<T> comparator) {
        super(dataList, comparator);
    }

    @Override
    public void start() {
        int dataCount = dataList.size();
        for (int i = 1; i < dataCount; i++) {
            merge(i);
        }
    }

    private void merge(int index) {
        for (int i = 0; i < index; i++) {
            if (comparator.compare(dataList.get(index), dataList.get(i)) <= 0) {
                Object temp = dataList.get(index);
                for (int j = index; j > i; j--) {
                    dataList.set(j, dataList.get(j - 1));
                }
                dataList.set(i, temp);
            }
        }
    }
}
