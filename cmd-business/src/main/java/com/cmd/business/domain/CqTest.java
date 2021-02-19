package com.cmd.business.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.cmd.common.annotation.Excel;
import com.cmd.common.core.domain.BaseEntity;

/**
 * 测试对象 cq_test
 * 
 * @author cq
 * @date 2021-02-18
 */
public class CqTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .toString();
    }
}
