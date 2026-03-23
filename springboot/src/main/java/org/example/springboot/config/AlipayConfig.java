package org.example.springboot.config;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 支付宝配置类
 */
@Data
@Component
public class AlipayConfig {

    /**
     * 沙箱appId
     */
    public static final String APPID = "9021000158690721";

    /**
     * 请求网关 - 沙箱环境
     */
    public static final String URL = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    /**
     * 编码格式
     */
    public static final String CHARSET = "UTF-8";

    /**
     * 返回格式
     */
    public static final String FORMAT = "json";

    /**
     * 签名方式
     */
    public static final String SIGNTYPE = "RSA2";

    /**
     * 异步通知地址
     */
    public static final String NOTIFY_URL = "http://" + PropertiesUtil.getDomain() + "/alipay/notify";

    /**
     * 同步地址
     */
    public static final String RETURN_URL = "http://" + PropertiesUtil.getDomain() + "/alipay/success";

    /**
     * 应用私钥 (pkcs8格式)
     * 注意：这是示例密钥，实际使用时需要替换为支付宝开放平台获取的应用私钥
     */
    public static final String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDSBxQKHdznDpS40Wlp91xqNFuE4hsdu3IO0QU1acd4XGr4lAxSY3H7W+P8nXLI3Zew5B+iX7lf5UlPsewNKLE+MIbcJan9UJjVrrUcXR7YMOqGqBBS/pJbP5rZKYh3ushp83lM2z3HKGhO2if9vXMsI3Oe8BP9fKhbQfxy3QMyU6VACMSh5aJvXt32t38prfVWB2CWWwLwkgLxm1i19KQiEsySnsagZc6PE7KNHDgDDls18yXP1xlplFIGNyvxy7DtEp9CUqPzqPgAE+6yF5XoRIFK3v9kfdFD/vZonUMf/jkv40QYF8E4pkPnD7YZL1Id41YkACCqWeljNBN+UgT/AgMBAAECggEBAKF0J4ePZV2J6/IXqX14VmaeUSxZ1JaKniedru9cnaZ9BQ6KYN6E6/5aqWxsbOzUy+ODun3MMGjzjePh1qBXA8nW7BUYLxE4gATkBP4E580x7VgOol3qrP/QaW0/bFT+FUq9jCX09AzBl03mjo+Ur5Div+MSk4tt5M4ib7qtA+QO3G2xNlv0rb20ZAXa0U2OTyACW5JyKIcElPGOUsDoY5zWPNzlqdaSlzlMQQcxYDrZVj2HgfUjDT1MGia+A8vCK8zxDvWuuO+lqWWxU69fEhZuKv+FZl/XQwOtC2vrd3voZFlSY3i156xIT+BXF60Zl/x5IjwSqv9BcTcFoNb1xKECgYEA72pCM1PjvfWMju0w/kuVArgAkufPU3RzXzxg39zUNEI74xzcoEr+2dg3V7AQiQoBtImeC5BTWO9GJkakwHvveoG0AP0JZDu0oDJeXTv+biqIhdMPMlwY2oWjgqzvya9Jd1fKX/OfsrsFitMc+UDtfwF5mV7JPQve6ovuLWtGMXsCgYEA4JOrMFiU4Mjq6gc8CPHv6DLnTQ7MbXD0kNr00J4gRZIa9ANqGyIOxk/K7JR4ps0EMKs/DUwm6cHS9dnU6Xg6cacKfcv+w0tCu7TwXOqR4aavEX4HgOhKxSJmMESOLRSXZ+Ucqu5A+PRzb9d8KJGuMeDftpsIy6pzMCX1gxDWeU0CgYEA6VUmL+ASlZA67RE+Lph7Iasy4/oIlc1oo+i0gXk3V7c1pqL6Yz60IpwXU97EPssB3nJBFgQTNxn7xFIVP4OKYlsGk/AItyd5Yqe0UCmoTrYlWEfbB7m6fz6/nRvulyG++BEXq2xEuGyNej9GfaZJ0P4fBNrcRiLLnsvB1YI3ZwECgYBALBIjy3wnS2JNI2oVSET8fec4Tr09nKRV7Cs+naCtIJXRGlSskivUoSJkPfzH9Rd4bMaknxkTfM4ycF91o2RX65qE3dDbr1rPVmHEu0aaS04FWpT8UeRjtnOq4TwbR6IIDyEE+vXX7co6sEGLOi2jlRV4EY8O25L0tDQWkq4mlQKBgB+2Hn8gb3luwN08NVpd/mA1YEObUY5rHNNzDQrfjdvhMOIiWcJoeLDkzQkw2BigmzbY7p5r0HPAk3Glxzl7SU7oG0TUUKJ0LqJG4cXTBCrGE2T1R/QwI6rphJsHGk5WIrCSVUTfY/CtrDrmwcgMlA1imhTwOfEBXWMsTG3L2uU0";

    /**
     * 支付宝公钥
     * 注意：这是示例密钥，实际使用时需要替换为支付宝开放平台获取的支付宝公钥
     */
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlCCvUTvIzDg0jkKAPxekO+G6/v6RoVfNrTA5RbvdrzsSchxZ4X9hOIVa6I1uU5B+Z9XLSRgtgXJTFdVzqlNYa7AS9/uXaLLcdESS5wpLvTeCnGmCqE9xd1b5j7/HnmEnWF6uqQQ2TRRznnRxSp0yRrSb9OW+Up4+bW59ObXI0tg4jI29pqmdEC+tECB8O9x9QPHtdZMahZoHVFArsOOuO5T3/DX0aE+j7g7oRJqUQuVbuFe77Ai4cOJGlHW5UAnxfV3jdk0A4FoOk5nSw+7rIhpcb3LMkXCLOB96CGQfk1D8GX1uy0TOfQWSmPU02z253O+K5zix9uks+elP4Kb9HwIDAQAB";
}
