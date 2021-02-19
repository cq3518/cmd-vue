package com.cmd.business.service.Impl;

import com.cmd.business.domain.CqTest;
import com.cmd.business.mapper.CqTestMapper;
import com.cmd.business.service.ICqTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 测试Service业务层处理
 *
 * @author cq
 * @date 2021-02-19
 */
@Service
public class CqTestServiceImpl implements ICqTestService {
    @Autowired
    private CqTestMapper cqTestMapper;

    /**
     * 查询测试
     *
     * @param id 测试ID
     * @return 测试
     */
    @Override
    public CqTest selectCqTestById(Long id) {
        return cqTestMapper.selectCqTestById(id);
    }

    /**
     * 查询测试列表
     *
     * @param cqTest 测试
     * @return 测试
     */
    @Override
    public List<CqTest> selectCqTestList(CqTest cqTest) {
        return cqTestMapper.selectCqTestList(cqTest);
    }

    /**
     * 新增测试
     *
     * @param cqTest 测试
     * @return 结果
     */
    @Override
    public int insertCqTest(CqTest cqTest) {
        return cqTestMapper.insertCqTest(cqTest);
    }

    /**
     * 修改测试
     *
     * @param cqTest 测试
     * @return 结果
     */
    @Override
    public int updateCqTest(CqTest cqTest) {
        return cqTestMapper.updateCqTest(cqTest);
    }

    /**
     * 批量删除测试
     *
     * @param ids 需要删除的测试ID
     * @return 结果
     */
    @Override
    public int deleteCqTestByIds(Long[] ids) {
        return cqTestMapper.deleteCqTestByIds(ids);
    }

    /**
     * 删除测试信息
     *
     * @param id 测试ID
     * @return 结果
     */
    @Override
    public int deleteCqTestById(Long id) {
        return cqTestMapper.deleteCqTestById(id);
    }
}
