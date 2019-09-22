package cmo.qf.pictures.service.impl;


import cmo.qf.pictures.core.oss.OssUtil;
import cmo.qf.pictures.core.util.FileUtil;
import cmo.qf.pictures.service.PricturesService;
import com.qf.common.util.RUtil;
import com.qf.common.vo.R;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PricturesServiceImpl implements PricturesService {
    @Override
    public R<String> imageUp(MultipartFile file) throws IOException {
        //获取上传文件的名字
        String f=FileUtil.renameFile(file.getOriginalFilename());
        String u=OssUtil.sendByte("YiGo", f, file.getBytes());
        if (u != null && u.length() > 0) {
            return RUtil.setOK("OK", u);
        } else {
            return RUtil.setERROR("上传失败");
        }
    }

    @Override
    public R<String> imageUps(MultipartFile [] files) throws IOException {
        List<String> urls=new ArrayList<>();
        for(MultipartFile file:files){
            String f= FileUtil.renameFile(file.getOriginalFilename());
            String u=OssUtil.sendByte("YiGo",f,file.getBytes());
            if(u!=null && u.length()>0){
                urls.add(u);
            }
        }
        return RUtil.setOK("OK",urls);
    }
}

