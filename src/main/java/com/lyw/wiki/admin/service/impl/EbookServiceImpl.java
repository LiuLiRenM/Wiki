package com.lyw.wiki.admin.service.impl;

import com.lyw.wiki.admin.entity.Ebook;
import com.lyw.wiki.admin.dao.EbookDao;
import com.lyw.wiki.admin.service.EbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电子书(Ebook)表服务实现类
 *
 * @author LiuYaoWen
 * @since 2021-08-10 15:01:44
 */
@Service("ebookService")
public class EbookServiceImpl implements EbookService {
    @Resource
    private EbookDao ebookDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Ebook queryById(Long id) {
        return this.ebookDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Ebook> queryAllByLimit(int offset, int limit) {
        return this.ebookDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    @Override
    public Ebook insert(Ebook ebook) {
        this.ebookDao.insert(ebook);
        return ebook;
    }

    /**
     * 修改数据
     *
     * @param ebook 实例对象
     * @return 实例对象
     */
    @Override
    public Ebook update(Ebook ebook) {
        this.ebookDao.update(ebook);
        return this.queryById(ebook.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.ebookDao.deleteById(id) > 0;
    }
}
