package com.sky.service;


import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * 数据统计服务
 */
public interface ReportService {

    /**
     * 指定时间范围的营业额统计
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
