package ywh.mapper;

import ywh.entity.Classes;
import ywh.entity.Ywh_end_role;

import java.util.List;

public interface YwhEndRoleMapper {
    List<Ywh_end_role> findYwh_end_role_ById(Integer rid);
}
