package com.lyw.wiki.admin.dao;

import com.lyw.wiki.admin.entity.Ebook;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 电子书(Ebook)表数据库访问层
 *
 * @author LiuYaoWen
 * @since 2021-08-10 15:01:43
 */
public interface EbookDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ebook queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Ebook> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ebook 实例对象
     * @return 对象列表
     */
    List<Ebook> queryAll(Ebook ebook);

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 影响行数
     */
    int insert(Ebook ebook);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Ebook> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Ebook> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Ebook> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Ebook> entities);

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 影响行数
     */
    int update(Ebook ebook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

