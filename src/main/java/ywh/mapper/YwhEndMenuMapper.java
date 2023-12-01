package ywh.mapper;

import org.springframework.stereotype.Repository;
import ywh.entity.Ywh_end_menu;
import ywh.entity.Ywh_end_role;

import java.util.List;
@Repository
public interface YwhEndMenuMapper {
    List<Ywh_end_menu> findYwh_end_menu_ById(Integer mid);
}
