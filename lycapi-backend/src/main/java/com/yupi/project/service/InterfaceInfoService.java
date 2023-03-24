package com.yupi.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicommon.model.entity.InterfaceInfo;

/**
* @author lenovo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-01-12 22:53:42
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 取出url地址的最后一个字符
     * @param id
     * @return
     */
    String getLastStr(long id);


}
