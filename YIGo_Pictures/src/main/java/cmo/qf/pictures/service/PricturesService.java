package cmo.qf.pictures.service;

import com.qf.common.vo.R;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PricturesService {
    //上传单个文件
    R<String> imageUp(MultipartFile file) throws IOException;
    //上传多个文件
    R<String> imageUps(MultipartFile [] files) throws IOException;
}
