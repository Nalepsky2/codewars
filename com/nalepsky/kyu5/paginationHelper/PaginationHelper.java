package com.nalepsky.kyu5.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {
    //https://www.codewars.com/kata/515bb423de843ea99400000a
    final List<I> collection;
    final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        final int additionalPage = (itemCount() % itemsPerPage == 0) ? 0 : 1;
        return itemCount()/itemsPerPage + additionalPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if(pageIndex < 0 || pageIndex > pageCount() - 1){
            return -1;
        }

        return (pageIndex < pageCount() - 1) ? itemsPerPage : itemCount() - itemsPerPage * (pageCount() - 1);
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex < 0 || itemIndex > collection.size() - 1){
            return -1;
        }
        return itemIndex / itemsPerPage;
    }
}