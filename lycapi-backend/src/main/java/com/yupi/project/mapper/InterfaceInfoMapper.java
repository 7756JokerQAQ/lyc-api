package com.yupi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.yupicommon.model.entity.InterfaceInfo;


public interface InterfaceInfoMapper extends BaseMapper<InterfaceInfo> {
    public String getLastString(long id);
}




