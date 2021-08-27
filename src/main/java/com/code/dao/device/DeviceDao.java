package com.code.dao.device;

import com.code.vo.Code;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeviceDao {

    @Select("SELECT code, name FROM TB_DEVICE WHERE code = #{code}")
    Code.response selectDeviceByCode(Code.request request);

    @Select("SELECT code, name FROM TB_DEVICE")
    List<Code.response> selectDevice();

}
