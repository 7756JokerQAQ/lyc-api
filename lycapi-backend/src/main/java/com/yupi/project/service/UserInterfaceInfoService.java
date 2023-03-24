package com.yupi.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicommon.model.entity.UserInterfaceInfo;

/**
* @author lenovo
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
* @createDate 2023-01-15 15:16:57
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);

    /**
     * 查询用户是否含有调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean isHasLeftCount(long interfaceInfoId ,long userId);
}
