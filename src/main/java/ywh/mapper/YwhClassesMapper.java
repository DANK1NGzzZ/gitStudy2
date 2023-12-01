package ywh.mapper;

import ywh.entity.Classes;

import java.util.List;

public interface YwhClassesMapper {
    List<Classes> findClassesById(Integer cid);
}
