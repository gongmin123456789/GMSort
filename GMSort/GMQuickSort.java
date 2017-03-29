package com.oppo.oppomediacontrol.util.GMSort;

import java.util.List;

/**
 * Created by 80066158 on 2017-03-24.
 */

public class GMQuickSort<T> extends GMSortMethod {

    public GMQuickSort(List<T> dataList, GMComparator<T> comparator) {
        super(dataList, comparator);
    }

    @Override
    public void start() {
        quickSort(dataList, 0, dataList.size() - 1);
    }

    private int getMiddle(List<T> dataList, int low, int high) {
        T temp = dataList.get(low);

        while (low < high) {
            while (low < high && comparator.compare(dataList.get(high), temp) >= 0) {
                high--;
            }
            dataList.set(low, dataList.get(high));
            while (low < high && comparator.compare(dataList.get(low), temp) <= 0) {
                low++;
            }
            dataList.set(high, dataList.get(low));
        }

        dataList.set(low, temp);

        return low;
    }

    private void quickSort(List<T> dataList, int low, int high) {
        if (low < high) {
            int middle = getMiddle(dataList, low, high);
            quickSort(dataList, low, middle - 1);
            quickSort(dataList, middle + 1, high);
        }
    }

}
