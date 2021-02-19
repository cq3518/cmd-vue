package com.cmd.business.mapper;

import com.cmd.business.domain.CqTest;

import java.util.List;

/**
 * 测试Mapper接口
 *
 * @author cq
 * @date 2021-02-18
 */
public interface CqTestMapper {

    /**
     * 查询测试
     *
     * @param id 测试ID
     * @return 测试
     */
    public CqTest selectCqTestById(Long id);

    /**
     * 查询测试列表
     *
     * @param cqTest 测试
     * @return 测试集合
     */
    public List<CqTest> selectCqTestList(CqTest cqTest);

    /**
     * 新增测试
     *
     * @param cqTest 测试
     * @return 结果
     */
    public int insertCqTest(CqTest cqTest);

    /**
     * 修改测试
     *
     * @param cqTest 测试
     * @return 结果
     */
    public int updateCqTest(CqTest cqTest);

    /**
     * 删除测试
     *
     * @param id 测试ID
     * @return 结果
     */
    public int deleteCqTestById(Long id);

    /**
     * 批量删除测试
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCqTestByIds(Long[] ids);
}
