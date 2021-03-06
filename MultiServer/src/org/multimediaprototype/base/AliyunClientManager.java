package org.multimediaprototype.base;

import com.aliyun.api.AliyunClient;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.oss.OSSClient;

/**
 * Created by dx.yang on 15/11/13.
 */

public interface AliyunClientManager {
    void setup();

    AliyunClient getMtsClient();

    OSSClient getOssClient();

    MNSClient getMnsClient();
}
