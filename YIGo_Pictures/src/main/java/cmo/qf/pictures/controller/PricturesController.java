package cmo.qf.pictures.controller;

import cmo.qf.pictures.service.PricturesService;
import com.qf.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
public class PricturesController {
    @Autowired
    private PricturesService pricturesService;
    @PostMapping("/provider/resource/imgfileup.do")
    public R fileUp(MultipartFile file) throws IOException {
        return pricturesService.imageUp(file);
    }
    @PostMapping("/provider/resource/batchimgfileup.do")
    public R fileUp(MultipartFile[] files) throws IOException {
        return pricturesService.imageUps(files);
    }

}
