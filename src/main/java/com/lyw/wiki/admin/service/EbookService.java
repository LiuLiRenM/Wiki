package com.lyw.wiki.admin.service;

import com.lyw.wiki.admin.entity.Ebook;

import java.util.List;

/**
 * 电子书(Ebook)表服务接口
 *
 * @author LiuYaoWen
 * @since 2021-08-10 15:01:44
 */
public interface EbookService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ebook queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Ebook> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    Ebook insert(Ebook ebook);

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    Ebook update(Ebook ebook);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
