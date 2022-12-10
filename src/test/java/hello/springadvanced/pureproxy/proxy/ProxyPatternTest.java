package hello.springadvanced.pureproxy.proxy;

import hello.springadvanced.pureproxy.proxy.code.CacheProxy;
import hello.springadvanced.pureproxy.proxy.code.ProxyPatternClient;
import hello.springadvanced.pureproxy.proxy.code.RealSubject;
import hello.springadvanced.pureproxy.proxy.code.Subject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }

    @Test
    void cacheProxyTest() {
        Subject realSubject = new RealSubject();
        Subject cacheProxy = new CacheProxy(realSubject);
        ProxyPatternClient client = new ProxyPatternClient(cacheProxy);
        client.execute();
        client.execute();
        client.execute();
    }

}
