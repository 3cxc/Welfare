package nc.umtpcm.welfare.Logger;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class logger {
    /**
     * 使用LoggerFactory创建一个Logger对象
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


//    /**
//     * 存储警告到文件
//     * @param input 警告内容
//     * 注意,该警告已废弃
//     */
//    public void Log_warn(String input){
//        logger.warn(input);
//    }

    /**
     * 存储错误到文件
     * @param input 错误内容
     */
    public void Log_error(String input){
        logger.error(input);
    }
}
