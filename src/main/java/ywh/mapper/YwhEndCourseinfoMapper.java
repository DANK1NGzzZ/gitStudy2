package ywh.mapper;

import ywh.entity.Ywh_end_courseinfo;

import java.util.List;

public interface YwhEndCourseinfoMapper {
    List<Ywh_end_courseinfo> findYwh_end_courseinfoById(Integer cid);
}
