package ywh.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywh.entity.Ywh_end_menu;
import ywh.mapper.YwhEndMenuMapper;

import java.util.List;

@Service
public class YwhEndMenuServiceImpl implements YwhEndMenuService {
    @Autowired
    YwhEndMenuMapper ywhEndMenuMapper;


    @Override
    public List<Ywh_end_menu> findYwh_end_menu_ById(Integer mid) {
        List<Ywh_end_menu> ywh_end_menu = ywhEndMenuMapper.findYwh_end_menu_ById(mid);

        return  ywh_end_menu;
    }
}
