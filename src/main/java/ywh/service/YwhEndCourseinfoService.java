package ywh.service;

import ywh.entity.Ywh_end_courseinfo;

import java.util.List;

public interface YwhEndCourseinfoService {
    List<Ywh_end_courseinfo> findYwh_end_courseinfoById(Integer cid);
}
