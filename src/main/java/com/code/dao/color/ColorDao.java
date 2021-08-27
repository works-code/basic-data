package com.code.dao.color;

import com.code.vo.Code;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ColorDao {

    @Select("SELECT code, name FROM TB_COLOR WHERE code = #{code}")
    Code.response selectColorByCode(Code.request request);

    @Select("SELECT code, name FROM TB_COLOR")
    List<Code.response> selectColor();

}
