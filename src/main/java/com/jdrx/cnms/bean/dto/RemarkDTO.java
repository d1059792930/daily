package com.jdrx.cnms.bean.dto;


import java.util.Date;

/**
 * Created by aw on 2017/8/29.
 */
public class RemarkDTO {
    private String remark;
    // 日报id"  
    private String id;
    // 内容"  
    private String speed_av_cmnet;
    // 内容"  
    private String speed_av__thirdparty;
    // 内容"  
    private String speed_av_tietong;
    // 内容"  
    private String speed_av_resource_local;
    // 内容"  
    private String speed_av_jlyd;
    // 内容"  
    private String speed_av_mobile;
    // 内容"  
    private String speed_av_cpe;
    // 内容"  
    private String speed_av_special_line;
    // 内容"  
    private String speed_av_user_tietong;
    // 内容"  
    private String speed_av_wlan;
    // 内容"  
    private String speed_av_familywide;
    // 内容"  
    private String speed_av_cache;
    // 内容"  
    private String speed_av_idc;
    // 内容"  
    private String rate_fuwulocal_idc;
    // 内容"  
    private String speed_av_cdn;
    // 内容"  
    private String speed_fuwulocal_cdn;
    // 内容"  
    private String speed_av_other_yd;
    // 内容"  
    private String speed_av_bnet;
    // 内容"  
    private String speed_av_international;
    // 内容"  
    private String speed_av_bnet_settlement;
    // 内容"  
    private String ratio_exceed_cmnet;
    // 内容"  
    private String ratio_abnorma_cmnet;
    // 内容"  
    private String ratio_flows_pay;
    // 内容"  
    private String ratio_bnet_p2p;
    // 内容"  
    private String ratio_flows_video_busy;
    // 内容"  
    private String ratio_flows_communication_busy;
    // 内容"  
    private String speed_peak_bnet;
    // 内容"  
    private String delay_bnet_networklayer;
    // 内容"  
    private String rate_lostpacket;
    // 内容"  
    private String surate_show_web_bnet;
    // 内容"  
    private String delay_web_bnet;
    // 内容"  
    private String rate_flows_local;
    // 内容"  
    private String rate_re_local;
    // 内容"  
    private String rate_re_local_mobile;
    // 内容"  
    private String rate_content_loacl;
    // 内容"  
    private String rate_content_loacl_cache;
    // 内容"  
    private String rate_accurate_scheduling;
    // 内容"  
    private String ratio_flows_cdn_cdn;
    // 内容"  
    private String ratio_flows_cdn_jlyd;
    // 内容"  
    private String rate_bandwidth_cmnet;
    // 内容"  
    private String rate_bandwidth_area;
    // 内容"  
    private String ratio_link_hload;
    // 内容"  
    private String peak_dns_re;
    // 内容"  
    private String mean_dns_re;
    // 内容"  
    private String parsing_rate_su;
    // 内容"  
    private String ratio_cache_huawei_small;
    // 内容"  
    private String ratio_cache_huawei_big;
    // 内容"  
    private String count_caton_iqiyi;
    // 内容"  
    private String delay_load_iqiyi;
    // 内容"  
    private String delay_caton_iqiyi;
    // 内容"  
    private String count_caton_letv;
    // 内容"  
    private String delay_load_letv;
    // 内容"  
    private String delay_caton_letv;
    // 内容"  
    private String count_caton_youku;
    // 内容"  
    private String delay_load_youku;
    // 内容"  
    private String delay_caton_youku;
    // 内容"  
    private String count_caton_tencent;
    // 内容"  
    private String delay_load_tencent;
    // 内容"  
    private String delay_caton_tencent;
    // 内容"  
    private String delay_fist_web_top100;
    // 内容"  
    private String rate_conform_web_top100;
    // 内容"  
    private String delay_fist_web_top20;
    // 内容"  
    private String rate_conform_web_top20;
    // 内容"  
    private String count_caton_video_top10;
    // 内容"  
    private String ratio_delay_load_video_top10;
    // 内容"  
    private String count_caton_video_top10_pc;
    // 内容"  
    private String ratio_delay_load_video_top10_pc;
    // 内容"  
    private String count_caton_video_top10_mb;
    // 内容"  
    private String ratio_delay_load_video_top10_mb;
    // 内容"  
    private String delay_ping_game_top5;
    // 内容"  
    private String rate_lostpacket_game_top5;
    // 内容"  
    private String shake_game_top5;
    // 内容"  
    private String delay_first_financial_top10;
    // 内容"  
    private String delay_idc;
    // 内容"  
    private String lostpacket_idc;
    // 内容"  
    private String shake_idc;
    // 内容"  
    private String lostpacket_link_bras;
    // 内容"  
    private String shake_link_bras;
    // 内容"  
    private String delay_play_migu;
    // 内容"  
    private String count_caton_migu;
    // 内容"  
    private String ratio_delay_migu;
    // 内容"  
    private String speed_download_mm;
    // 内容"  
    private String lostpacket_thirdparty;
    // 内容"  
    private String delay_thirdparty;
    // 内容"  
    private String rate_chinanetcenter;
    // 内容"  
    private String rate_chinanetcenter_2;
    // 内容"  
    private String delay_chinanetcenter;
    // 内容"  
    private String delay_chinanetcenter_2;
    // 内容"  
    private String count_ntv_online;
    // 内容"  
    private String count_ntv;
    // 内容"  
    private String count_homenet;
    // 内容"  
    private String count_homenet_cmcc;
    // 内容"  
    private String count_user_peak_3a_changchun;
    // 内容"  
    private String count_user_peak_3a_jilin;
    // 内容"  
    private String count_user_peak_3a_siping;
    // 内容"  
    private String count_user_peak_3a_liaoyuan;
    // 内容"  
    private String count_user_peak_3a_tonghua;
    // 内容"  
    private String count_user_peak_3a_baishan;
    // 内容"  
    private String count_user_peak_3a_songyuan;
    // 内容"  
    private String count_user_peak_3a_baicheng;
    // 内容"  
    private String count_user_peak_3a_yanbian;
    // 内容"  
    private String utilization_bras_changchun;
    // 内容"  
    private String utilization_bras_jilin;
    // 内容"  
    private String utilization_bras_siping;
    // 内容"  
    private String utilization_bras_liaoyuan;
    // 内容"  
    private String utilization_bras_tonghua;
    // 内容"  
    private String utilization_bras_baishan;
    // 内容"  
    private String utilization_bras_songyuan;
    // 内容"  
    private String utilization_bras_baicheng;
    // 内容"  
    private String utilization_bras_yanbian;
    // 时间"  
    private Date editTime;
    // 编辑者"  
    private String editor;

    public String getSpeed_av_cmnet() {
        return speed_av_cmnet;
    }

    public void setSpeed_av_cmnet(String speed_av_cmnet) {
        this.speed_av_cmnet = speed_av_cmnet;
    }

    public String getSpeed_av__thirdparty() {
        return speed_av__thirdparty;
    }

    public void setSpeed_av__thirdparty(String speed_av__thirdparty) {
        this.speed_av__thirdparty = speed_av__thirdparty;
    }

    public String getSpeed_av_tietong() {
        return speed_av_tietong;
    }

    public void setSpeed_av_tietong(String speed_av_tietong) {
        this.speed_av_tietong = speed_av_tietong;
    }

    public String getSpeed_av_resource_local() {
        return speed_av_resource_local;
    }

    public void setSpeed_av_resource_local(String speed_av_resource_local) {
        this.speed_av_resource_local = speed_av_resource_local;
    }

    public String getSpeed_av_jlyd() {
        return speed_av_jlyd;
    }

    public void setSpeed_av_jlyd(String speed_av_jlyd) {
        this.speed_av_jlyd = speed_av_jlyd;
    }

    public String getSpeed_av_mobile() {
        return speed_av_mobile;
    }

    public void setSpeed_av_mobile(String speed_av_mobile) {
        this.speed_av_mobile = speed_av_mobile;
    }

    public String getSpeed_av_cpe() {
        return speed_av_cpe;
    }

    public void setSpeed_av_cpe(String speed_av_cpe) {
        this.speed_av_cpe = speed_av_cpe;
    }

    public String getSpeed_av_special_line() {
        return speed_av_special_line;
    }

    public void setSpeed_av_special_line(String speed_av_special_line) {
        this.speed_av_special_line = speed_av_special_line;
    }

    public String getSpeed_av_user_tietong() {
        return speed_av_user_tietong;
    }

    public void setSpeed_av_user_tietong(String speed_av_user_tietong) {
        this.speed_av_user_tietong = speed_av_user_tietong;
    }

    public String getSpeed_av_wlan() {
        return speed_av_wlan;
    }

    public void setSpeed_av_wlan(String speed_av_wlan) {
        this.speed_av_wlan = speed_av_wlan;
    }

    public String getSpeed_av_familywide() {
        return speed_av_familywide;
    }

    public void setSpeed_av_familywide(String speed_av_familywide) {
        this.speed_av_familywide = speed_av_familywide;
    }

    public String getSpeed_av_cache() {
        return speed_av_cache;
    }

    public void setSpeed_av_cache(String speed_av_cache) {
        this.speed_av_cache = speed_av_cache;
    }

    public String getSpeed_av_idc() {
        return speed_av_idc;
    }

    public void setSpeed_av_idc(String speed_av_idc) {
        this.speed_av_idc = speed_av_idc;
    }

    public String getRate_fuwulocal_idc() {
        return rate_fuwulocal_idc;
    }

    public void setRate_fuwulocal_idc(String rate_fuwulocal_idc) {
        this.rate_fuwulocal_idc = rate_fuwulocal_idc;
    }

    public String getSpeed_av_cdn() {
        return speed_av_cdn;
    }

    public void setSpeed_av_cdn(String speed_av_cdn) {
        this.speed_av_cdn = speed_av_cdn;
    }

    public String getSpeed_fuwulocal_cdn() {
        return speed_fuwulocal_cdn;
    }

    public void setSpeed_fuwulocal_cdn(String speed_fuwulocal_cdn) {
        this.speed_fuwulocal_cdn = speed_fuwulocal_cdn;
    }

    public String getSpeed_av_other_yd() {
        return speed_av_other_yd;
    }

    public void setSpeed_av_other_yd(String speed_av_other_yd) {
        this.speed_av_other_yd = speed_av_other_yd;
    }

    public String getSpeed_av_bnet() {
        return speed_av_bnet;
    }

    public void setSpeed_av_bnet(String speed_av_bnet) {
        this.speed_av_bnet = speed_av_bnet;
    }

    public String getSpeed_av_international() {
        return speed_av_international;
    }

    public void setSpeed_av_international(String speed_av_international) {
        this.speed_av_international = speed_av_international;
    }

    public String getSpeed_av_bnet_settlement() {
        return speed_av_bnet_settlement;
    }

    public void setSpeed_av_bnet_settlement(String speed_av_bnet_settlement) {
        this.speed_av_bnet_settlement = speed_av_bnet_settlement;
    }

    public String getRatio_exceed_cmnet() {
        return ratio_exceed_cmnet;
    }

    public void setRatio_exceed_cmnet(String ratio_exceed_cmnet) {
        this.ratio_exceed_cmnet = ratio_exceed_cmnet;
    }

    public String getRatio_abnorma_cmnet() {
        return ratio_abnorma_cmnet;
    }

    public void setRatio_abnorma_cmnet(String ratio_abnorma_cmnet) {
        this.ratio_abnorma_cmnet = ratio_abnorma_cmnet;
    }

    public String getRatio_flows_pay() {
        return ratio_flows_pay;
    }

    public void setRatio_flows_pay(String ratio_flows_pay) {
        this.ratio_flows_pay = ratio_flows_pay;
    }

    public String getRatio_bnet_p2p() {
        return ratio_bnet_p2p;
    }

    public void setRatio_bnet_p2p(String ratio_bnet_p2p) {
        this.ratio_bnet_p2p = ratio_bnet_p2p;
    }

    public String getRatio_flows_video_busy() {
        return ratio_flows_video_busy;
    }

    public void setRatio_flows_video_busy(String ratio_flows_video_busy) {
        this.ratio_flows_video_busy = ratio_flows_video_busy;
    }

    public String getRatio_flows_communication_busy() {
        return ratio_flows_communication_busy;
    }

    public void setRatio_flows_communication_busy(String ratio_flows_communication_busy) {
        this.ratio_flows_communication_busy = ratio_flows_communication_busy;
    }

    public String getSpeed_peak_bnet() {
        return speed_peak_bnet;
    }

    public void setSpeed_peak_bnet(String speed_peak_bnet) {
        this.speed_peak_bnet = speed_peak_bnet;
    }

    public String getDelay_bnet_networklayer() {
        return delay_bnet_networklayer;
    }

    public void setDelay_bnet_networklayer(String delay_bnet_networklayer) {
        this.delay_bnet_networklayer = delay_bnet_networklayer;
    }

    public String getRate_lostpacket() {
        return rate_lostpacket;
    }

    public void setRate_lostpacket(String rate_lostpacket) {
        this.rate_lostpacket = rate_lostpacket;
    }

    public String getSurate_show_web_bnet() {
        return surate_show_web_bnet;
    }

    public void setSurate_show_web_bnet(String surate_show_web_bnet) {
        this.surate_show_web_bnet = surate_show_web_bnet;
    }

    public String getDelay_web_bnet() {
        return delay_web_bnet;
    }

    public void setDelay_web_bnet(String delay_web_bnet) {
        this.delay_web_bnet = delay_web_bnet;
    }

    public String getRate_flows_local() {
        return rate_flows_local;
    }

    public void setRate_flows_local(String rate_flows_local) {
        this.rate_flows_local = rate_flows_local;
    }

    public String getRate_re_local() {
        return rate_re_local;
    }

    public void setRate_re_local(String rate_re_local) {
        this.rate_re_local = rate_re_local;
    }

    public String getRate_re_local_mobile() {
        return rate_re_local_mobile;
    }

    public void setRate_re_local_mobile(String rate_re_local_mobile) {
        this.rate_re_local_mobile = rate_re_local_mobile;
    }

    public String getRate_content_loacl() {
        return rate_content_loacl;
    }

    public void setRate_content_loacl(String rate_content_loacl) {
        this.rate_content_loacl = rate_content_loacl;
    }

    public String getRate_content_loacl_cache() {
        return rate_content_loacl_cache;
    }

    public void setRate_content_loacl_cache(String rate_content_loacl_cache) {
        this.rate_content_loacl_cache = rate_content_loacl_cache;
    }

    public String getRate_accurate_scheduling() {
        return rate_accurate_scheduling;
    }

    public void setRate_accurate_scheduling(String rate_accurate_scheduling) {
        this.rate_accurate_scheduling = rate_accurate_scheduling;
    }

    public String getRatio_flows_cdn_cdn() {
        return ratio_flows_cdn_cdn;
    }

    public void setRatio_flows_cdn_cdn(String ratio_flows_cdn_cdn) {
        this.ratio_flows_cdn_cdn = ratio_flows_cdn_cdn;
    }

    public String getRatio_flows_cdn_jlyd() {
        return ratio_flows_cdn_jlyd;
    }

    public void setRatio_flows_cdn_jlyd(String ratio_flows_cdn_jlyd) {
        this.ratio_flows_cdn_jlyd = ratio_flows_cdn_jlyd;
    }

    public String getRate_bandwidth_cmnet() {
        return rate_bandwidth_cmnet;
    }

    public void setRate_bandwidth_cmnet(String rate_bandwidth_cmnet) {
        this.rate_bandwidth_cmnet = rate_bandwidth_cmnet;
    }

    public String getRate_bandwidth_area() {
        return rate_bandwidth_area;
    }

    public void setRate_bandwidth_area(String rate_bandwidth_area) {
        this.rate_bandwidth_area = rate_bandwidth_area;
    }

    public String getRatio_link_hload() {
        return ratio_link_hload;
    }

    public void setRatio_link_hload(String ratio_link_hload) {
        this.ratio_link_hload = ratio_link_hload;
    }

    public String getPeak_dns_re() {
        return peak_dns_re;
    }

    public void setPeak_dns_re(String peak_dns_re) {
        this.peak_dns_re = peak_dns_re;
    }

    public String getMean_dns_re() {
        return mean_dns_re;
    }

    public void setMean_dns_re(String mean_dns_re) {
        this.mean_dns_re = mean_dns_re;
    }

    public String getParsing_rate_su() {
        return parsing_rate_su;
    }

    public void setParsing_rate_su(String parsing_rate_su) {
        this.parsing_rate_su = parsing_rate_su;
    }

    public String getRatio_cache_huawei_small() {
        return ratio_cache_huawei_small;
    }

    public void setRatio_cache_huawei_small(String ratio_cache_huawei_small) {
        this.ratio_cache_huawei_small = ratio_cache_huawei_small;
    }

    public String getRatio_cache_huawei_big() {
        return ratio_cache_huawei_big;
    }

    public void setRatio_cache_huawei_big(String ratio_cache_huawei_big) {
        this.ratio_cache_huawei_big = ratio_cache_huawei_big;
    }

    public String getCount_caton_iqiyi() {
        return count_caton_iqiyi;
    }

    public void setCount_caton_iqiyi(String count_caton_iqiyi) {
        this.count_caton_iqiyi = count_caton_iqiyi;
    }

    public String getDelay_load_iqiyi() {
        return delay_load_iqiyi;
    }

    public void setDelay_load_iqiyi(String delay_load_iqiyi) {
        this.delay_load_iqiyi = delay_load_iqiyi;
    }

    public String getDelay_caton_iqiyi() {
        return delay_caton_iqiyi;
    }

    public void setDelay_caton_iqiyi(String delay_caton_iqiyi) {
        this.delay_caton_iqiyi = delay_caton_iqiyi;
    }

    public String getCount_caton_letv() {
        return count_caton_letv;
    }

    public void setCount_caton_letv(String count_caton_letv) {
        this.count_caton_letv = count_caton_letv;
    }

    public String getDelay_load_letv() {
        return delay_load_letv;
    }

    public void setDelay_load_letv(String delay_load_letv) {
        this.delay_load_letv = delay_load_letv;
    }

    public String getDelay_caton_letv() {
        return delay_caton_letv;
    }

    public void setDelay_caton_letv(String delay_caton_letv) {
        this.delay_caton_letv = delay_caton_letv;
    }

    public String getCount_caton_youku() {
        return count_caton_youku;
    }

    public void setCount_caton_youku(String count_caton_youku) {
        this.count_caton_youku = count_caton_youku;
    }

    public String getDelay_load_youku() {
        return delay_load_youku;
    }

    public void setDelay_load_youku(String delay_load_youku) {
        this.delay_load_youku = delay_load_youku;
    }

    public String getDelay_caton_youku() {
        return delay_caton_youku;
    }

    public void setDelay_caton_youku(String delay_caton_youku) {
        this.delay_caton_youku = delay_caton_youku;
    }

    public String getCount_caton_tencent() {
        return count_caton_tencent;
    }

    public void setCount_caton_tencent(String count_caton_tencent) {
        this.count_caton_tencent = count_caton_tencent;
    }

    public String getDelay_load_tencent() {
        return delay_load_tencent;
    }

    public void setDelay_load_tencent(String delay_load_tencent) {
        this.delay_load_tencent = delay_load_tencent;
    }

    public String getDelay_caton_tencent() {
        return delay_caton_tencent;
    }

    public void setDelay_caton_tencent(String delay_caton_tencent) {
        this.delay_caton_tencent = delay_caton_tencent;
    }

    public String getDelay_fist_web_top100() {
        return delay_fist_web_top100;
    }

    public void setDelay_fist_web_top100(String delay_fist_web_top100) {
        this.delay_fist_web_top100 = delay_fist_web_top100;
    }

    public String getRate_conform_web_top100() {
        return rate_conform_web_top100;
    }

    public void setRate_conform_web_top100(String rate_conform_web_top100) {
        this.rate_conform_web_top100 = rate_conform_web_top100;
    }

    public String getDelay_fist_web_top20() {
        return delay_fist_web_top20;
    }

    public void setDelay_fist_web_top20(String delay_fist_web_top20) {
        this.delay_fist_web_top20 = delay_fist_web_top20;
    }

    public String getRate_conform_web_top20() {
        return rate_conform_web_top20;
    }

    public void setRate_conform_web_top20(String rate_conform_web_top20) {
        this.rate_conform_web_top20 = rate_conform_web_top20;
    }

    public String getCount_caton_video_top10() {
        return count_caton_video_top10;
    }

    public void setCount_caton_video_top10(String count_caton_video_top10) {
        this.count_caton_video_top10 = count_caton_video_top10;
    }

    public String getRatio_delay_load_video_top10() {
        return ratio_delay_load_video_top10;
    }

    public void setRatio_delay_load_video_top10(String ratio_delay_load_video_top10) {
        this.ratio_delay_load_video_top10 = ratio_delay_load_video_top10;
    }

    public String getCount_caton_video_top10_pc() {
        return count_caton_video_top10_pc;
    }

    public void setCount_caton_video_top10_pc(String count_caton_video_top10_pc) {
        this.count_caton_video_top10_pc = count_caton_video_top10_pc;
    }

    public String getRatio_delay_load_video_top10_pc() {
        return ratio_delay_load_video_top10_pc;
    }

    public void setRatio_delay_load_video_top10_pc(String ratio_delay_load_video_top10_pc) {
        this.ratio_delay_load_video_top10_pc = ratio_delay_load_video_top10_pc;
    }

    public String getCount_caton_video_top10_mb() {
        return count_caton_video_top10_mb;
    }

    public void setCount_caton_video_top10_mb(String count_caton_video_top10_mb) {
        this.count_caton_video_top10_mb = count_caton_video_top10_mb;
    }

    public String getRatio_delay_load_video_top10_mb() {
        return ratio_delay_load_video_top10_mb;
    }

    public void setRatio_delay_load_video_top10_mb(String ratio_delay_load_video_top10_mb) {
        this.ratio_delay_load_video_top10_mb = ratio_delay_load_video_top10_mb;
    }

    public String getDelay_ping_game_top5() {
        return delay_ping_game_top5;
    }

    public void setDelay_ping_game_top5(String delay_ping_game_top5) {
        this.delay_ping_game_top5 = delay_ping_game_top5;
    }

    public String getRate_lostpacket_game_top5() {
        return rate_lostpacket_game_top5;
    }

    public void setRate_lostpacket_game_top5(String rate_lostpacket_game_top5) {
        this.rate_lostpacket_game_top5 = rate_lostpacket_game_top5;
    }

    public String getShake_game_top5() {
        return shake_game_top5;
    }

    public void setShake_game_top5(String shake_game_top5) {
        this.shake_game_top5 = shake_game_top5;
    }

    public String getDelay_first_financial_top10() {
        return delay_first_financial_top10;
    }

    public void setDelay_first_financial_top10(String delay_first_financial_top10) {
        this.delay_first_financial_top10 = delay_first_financial_top10;
    }

    public String getDelay_idc() {
        return delay_idc;
    }

    public void setDelay_idc(String delay_idc) {
        this.delay_idc = delay_idc;
    }

    public String getLostpacket_idc() {
        return lostpacket_idc;
    }

    public void setLostpacket_idc(String lostpacket_idc) {
        this.lostpacket_idc = lostpacket_idc;
    }

    public String getShake_idc() {
        return shake_idc;
    }

    public void setShake_idc(String shake_idc) {
        this.shake_idc = shake_idc;
    }

    public String getLostpacket_link_bras() {
        return lostpacket_link_bras;
    }

    public void setLostpacket_link_bras(String lostpacket_link_bras) {
        this.lostpacket_link_bras = lostpacket_link_bras;
    }

    public String getShake_link_bras() {
        return shake_link_bras;
    }

    public void setShake_link_bras(String shake_link_bras) {
        this.shake_link_bras = shake_link_bras;
    }

    public String getDelay_play_migu() {
        return delay_play_migu;
    }

    public void setDelay_play_migu(String delay_play_migu) {
        this.delay_play_migu = delay_play_migu;
    }

    public String getCount_caton_migu() {
        return count_caton_migu;
    }

    public void setCount_caton_migu(String count_caton_migu) {
        this.count_caton_migu = count_caton_migu;
    }

    public String getRatio_delay_migu() {
        return ratio_delay_migu;
    }

    public void setRatio_delay_migu(String ratio_delay_migu) {
        this.ratio_delay_migu = ratio_delay_migu;
    }

    public String getSpeed_download_mm() {
        return speed_download_mm;
    }

    public void setSpeed_download_mm(String speed_download_mm) {
        this.speed_download_mm = speed_download_mm;
    }

    public String getLostpacket_thirdparty() {
        return lostpacket_thirdparty;
    }

    public void setLostpacket_thirdparty(String lostpacket_thirdparty) {
        this.lostpacket_thirdparty = lostpacket_thirdparty;
    }

    public String getDelay_thirdparty() {
        return delay_thirdparty;
    }

    public void setDelay_thirdparty(String delay_thirdparty) {
        this.delay_thirdparty = delay_thirdparty;
    }

    public String getRate_chinanetcenter() {
        return rate_chinanetcenter;
    }

    public void setRate_chinanetcenter(String rate_chinanetcenter) {
        this.rate_chinanetcenter = rate_chinanetcenter;
    }

    public String getRate_chinanetcenter_2() {
        return rate_chinanetcenter_2;
    }

    public void setRate_chinanetcenter_2(String rate_chinanetcenter_2) {
        this.rate_chinanetcenter_2 = rate_chinanetcenter_2;
    }

    public String getDelay_chinanetcenter() {
        return delay_chinanetcenter;
    }

    public void setDelay_chinanetcenter(String delay_chinanetcenter) {
        this.delay_chinanetcenter = delay_chinanetcenter;
    }

    public String getDelay_chinanetcenter_2() {
        return delay_chinanetcenter_2;
    }

    public void setDelay_chinanetcenter_2(String delay_chinanetcenter_2) {
        this.delay_chinanetcenter_2 = delay_chinanetcenter_2;
    }

    public String getCount_ntv_online() {
        return count_ntv_online;
    }

    public void setCount_ntv_online(String count_ntv_online) {
        this.count_ntv_online = count_ntv_online;
    }

    public String getCount_ntv() {
        return count_ntv;
    }

    public void setCount_ntv(String count_ntv) {
        this.count_ntv = count_ntv;
    }

    public String getCount_homenet() {
        return count_homenet;
    }

    public void setCount_homenet(String count_homenet) {
        this.count_homenet = count_homenet;
    }

    public String getCount_homenet_cmcc() {
        return count_homenet_cmcc;
    }

    public void setCount_homenet_cmcc(String count_homenet_cmcc) {
        this.count_homenet_cmcc = count_homenet_cmcc;
    }

    public String getCount_user_peak_3a_changchun() {
        return count_user_peak_3a_changchun;
    }

    public void setCount_user_peak_3a_changchun(String count_user_peak_3a_changchun) {
        this.count_user_peak_3a_changchun = count_user_peak_3a_changchun;
    }

    public String getCount_user_peak_3a_jilin() {
        return count_user_peak_3a_jilin;
    }

    public void setCount_user_peak_3a_jilin(String count_user_peak_3a_jilin) {
        this.count_user_peak_3a_jilin = count_user_peak_3a_jilin;
    }

    public String getCount_user_peak_3a_siping() {
        return count_user_peak_3a_siping;
    }

    public void setCount_user_peak_3a_siping(String count_user_peak_3a_siping) {
        this.count_user_peak_3a_siping = count_user_peak_3a_siping;
    }

    public String getCount_user_peak_3a_liaoyuan() {
        return count_user_peak_3a_liaoyuan;
    }

    public void setCount_user_peak_3a_liaoyuan(String count_user_peak_3a_liaoyuan) {
        this.count_user_peak_3a_liaoyuan = count_user_peak_3a_liaoyuan;
    }

    public String getCount_user_peak_3a_tonghua() {
        return count_user_peak_3a_tonghua;
    }

    public void setCount_user_peak_3a_tonghua(String count_user_peak_3a_tonghua) {
        this.count_user_peak_3a_tonghua = count_user_peak_3a_tonghua;
    }

    public String getCount_user_peak_3a_baishan() {
        return count_user_peak_3a_baishan;
    }

    public void setCount_user_peak_3a_baishan(String count_user_peak_3a_baishan) {
        this.count_user_peak_3a_baishan = count_user_peak_3a_baishan;
    }

    public String getCount_user_peak_3a_songyuan() {
        return count_user_peak_3a_songyuan;
    }

    public void setCount_user_peak_3a_songyuan(String count_user_peak_3a_songyuan) {
        this.count_user_peak_3a_songyuan = count_user_peak_3a_songyuan;
    }

    public String getCount_user_peak_3a_baicheng() {
        return count_user_peak_3a_baicheng;
    }

    public void setCount_user_peak_3a_baicheng(String count_user_peak_3a_baicheng) {
        this.count_user_peak_3a_baicheng = count_user_peak_3a_baicheng;
    }

    public String getCount_user_peak_3a_yanbian() {
        return count_user_peak_3a_yanbian;
    }

    public void setCount_user_peak_3a_yanbian(String count_user_peak_3a_yanbian) {
        this.count_user_peak_3a_yanbian = count_user_peak_3a_yanbian;
    }

    public String getUtilization_bras_changchun() {
        return utilization_bras_changchun;
    }

    public void setUtilization_bras_changchun(String utilization_bras_changchun) {
        this.utilization_bras_changchun = utilization_bras_changchun;
    }

    public String getUtilization_bras_jilin() {
        return utilization_bras_jilin;
    }

    public void setUtilization_bras_jilin(String utilization_bras_jilin) {
        this.utilization_bras_jilin = utilization_bras_jilin;
    }

    public String getUtilization_bras_siping() {
        return utilization_bras_siping;
    }

    public void setUtilization_bras_siping(String utilization_bras_siping) {
        this.utilization_bras_siping = utilization_bras_siping;
    }

    public String getUtilization_bras_liaoyuan() {
        return utilization_bras_liaoyuan;
    }

    public void setUtilization_bras_liaoyuan(String utilization_bras_liaoyuan) {
        this.utilization_bras_liaoyuan = utilization_bras_liaoyuan;
    }

    public String getUtilization_bras_tonghua() {
        return utilization_bras_tonghua;
    }

    public void setUtilization_bras_tonghua(String utilization_bras_tonghua) {
        this.utilization_bras_tonghua = utilization_bras_tonghua;
    }

    public String getUtilization_bras_baishan() {
        return utilization_bras_baishan;
    }

    public void setUtilization_bras_baishan(String utilization_bras_baishan) {
        this.utilization_bras_baishan = utilization_bras_baishan;
    }

    public String getUtilization_bras_songyuan() {
        return utilization_bras_songyuan;
    }

    public void setUtilization_bras_songyuan(String utilization_bras_songyuan) {
        this.utilization_bras_songyuan = utilization_bras_songyuan;
    }

    public String getUtilization_bras_baicheng() {
        return utilization_bras_baicheng;
    }

    public void setUtilization_bras_baicheng(String utilization_bras_baicheng) {
        this.utilization_bras_baicheng = utilization_bras_baicheng;
    }

    public String getUtilization_bras_yanbian() {
        return utilization_bras_yanbian;
    }

    public void setUtilization_bras_yanbian(String utilization_bras_yanbian) {
        this.utilization_bras_yanbian = utilization_bras_yanbian;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
