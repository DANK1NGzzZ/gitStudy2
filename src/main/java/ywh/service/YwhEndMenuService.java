package ywh.service;

import ywh.entity.Ywh_end_menu;

import java.util.List;

public interface YwhEndMenuService {

    public List<Ywh_end_menu> findYwh_end_menu_ById(Integer mid);
}
