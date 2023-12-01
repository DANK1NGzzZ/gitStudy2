package ywh.mapper;

import ywh.entity.Ywh_end_course;
import ywh.entity.Ywh_end_courseinfo;

import java.util.List;

public interface YwhEndCourseMapper {
    List<Ywh_end_course> findYwh_end_courseById(Integer uid);
}
