package com.konai.kurong.faketee.vacation.repository.vac_info;

import com.konai.kurong.faketee.vacation.entity.VacInfo;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VacInfoCustomRepository {

    List<VacInfo> findAllByEmpId(@Param("empId") Long empId);
    List<VacInfo> findAllByCorId(@Param("corId") Long corId);
    List<VacInfo> findAllByDepId(@Param("depId") Long depId);

}
