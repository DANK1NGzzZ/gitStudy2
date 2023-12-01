package ywh.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywh.entity.Ywh_end_courseinfo;
import ywh.mapper.YwhEndCourseinfoMapper;

import java.util.List;

@Service
public class YwhEndCourseinfoServiceImpl implements  YwhEndCourseinfoService {
    @Autowired
    YwhEndCourseinfoMapper ywhEndCourseinfoMapper;


    @Override
    public List<Ywh_end_courseinfo> findYwh_end_courseinfoById(Integer cid) {
        List<Ywh_end_courseinfo> ywh_end_courseinfo = ywhEndCourseinfoMapper.findYwh_end_courseinfoById(cid);

        return  ywh_end_courseinfo;
    }
}
