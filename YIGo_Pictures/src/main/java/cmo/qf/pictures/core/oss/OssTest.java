package cmo.qf.pictures.core.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.ByteArrayInputStream;

/**
 * @program: TalentShow
 * @description: 基于阿里云的OSS 实现文件上传相关操作的封装
 * @create: 2019-09-11 14:54
 */
public class OssTest {
    public static void test1(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIhTvqTSmlmjeQ";
        String accessKeySecret = "X7X9w0Ck5GEIWgP9tl0Q6sgmFjQuMv";
        String bucketName = "zzjava1904";
        String objectName = "str1904";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
        String content = "Hello OSS";
        //上传
        ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));
        // 关闭OSSClient。
        ossClient.shutdown();
    }

    public static void main(String[] args) {
        test1();
    }
}
