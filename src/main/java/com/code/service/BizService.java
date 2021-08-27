package com.code.service;

import com.code.dao.color.ColorDao;
import com.code.dao.device.DeviceDao;
import com.code.enums.RtnCode;
import com.code.vo.Code;
import com.code.vo.Error;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BizService {

    @Autowired
    private ColorDao colorDao;

    @Autowired
    private DeviceDao deviceDao;

    public Object getColorByCode(Code.request request){
        Code.response response = colorDao.selectColorByCode(request);
        if (ObjectUtils.isEmpty(response)){
            return new Error(){{
                setCode(RtnCode.E001);
            }};
        }
        return response;
    }

    public Object getColor(){
        List<Code.response> response = colorDao.selectColor();
        if (ObjectUtils.isEmpty(response)){
            return new Error(){{
                setCode(RtnCode.E001);
            }};
        }
        return response;
    }

    public Object getDeviceByCode(Code.request request){
        Code.response response = deviceDao.selectDeviceByCode(request);
        if (ObjectUtils.isEmpty(response)){
            return new Error(){{
                setCode(RtnCode.E001);
            }};
        }
        return response;
    }

    public Object getDevice(){
        List<Code.response> response = deviceDao.selectDevice();
        if (ObjectUtils.isEmpty(response)){
            return new Error(){{
                setCode(RtnCode.E001);
            }};
        }
        return response;
    }

}
