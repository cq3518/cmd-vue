package com.cmd.business.controller;

import com.cmd.business.domain.CqTest;
import com.cmd.business.service.ICqTestService;
import com.cmd.common.annotation.Log;
import com.cmd.common.core.controller.BaseController;
import com.cmd.common.core.domain.AjaxResult;
import com.cmd.common.core.page.TableDataInfo;
import com.cmd.common.enums.BusinessType;
import com.cmd.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 测试Controller
 *
 * @author cq
 * @date 2021-02-19
 */
@RestController
@RequestMapping("/business/business")
public class CqTestController extends BaseController {
    @Autowired
    private ICqTestService cqTestService;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('business:business:list')")
    @GetMapping("/list")
    public TableDataInfo list(CqTest cqTest) {
        startPage();
        List<CqTest> list = cqTestService.selectCqTestList(cqTest);
        return getDataTable(list);
    }

    /**
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('business:business:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CqTest cqTest) {
        List<CqTest> list = cqTestService.selectCqTestList(cqTest);
        ExcelUtil<CqTest> util = new ExcelUtil<CqTest>(CqTest.class);
        return util.exportExcel(list, "business");
    }

    /**
     * 获取测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('business:business:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(cqTestService.selectCqTestById(id));
    }

    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('business:business:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CqTest cqTest) {
        return toAjax(cqTestService.insertCqTest(cqTest));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('business:business:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CqTest cqTest) {
        return toAjax(cqTestService.updateCqTest(cqTest));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('business:business:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(cqTestService.deleteCqTestByIds(ids));
    }
}
