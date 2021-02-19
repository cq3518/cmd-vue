package com.cmd.common.exception.user;

import com.cmd.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author cmd
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
