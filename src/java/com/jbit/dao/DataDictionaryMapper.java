package com.jbit.dao;

import com.jbit.entity.DataDictionary;

public interface DataDictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    int insert(DataDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    int insertSelective(DataDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    DataDictionary selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DataDictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_dictionary
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DataDictionary record);
}