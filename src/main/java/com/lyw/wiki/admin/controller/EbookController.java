package com.lyw.wiki.admin.controller;

import com.lyw.wiki.admin.entity.Ebook;
import com.lyw.wiki.admin.service.EbookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 电子书(Ebook)表控制层
 *
 * @author LiuYaoWen
 * @since 2021-08-10 15:01:45
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    /**
     * 服务对象
     */
    @Resource
    private EbookService ebookService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Ebook selectOne(@PathVariable Long id) {
        return this.ebookService.queryById(id);
    }

}
