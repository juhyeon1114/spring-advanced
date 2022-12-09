package hello.springadvanced.app.v3;

import hello.springadvanced.trace.TraceStatus;
import hello.springadvanced.trace.logtrace.FieldLogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderRepository;
    private final FieldLogTrace trace;

    public void orderItem(String itemId) {

        TraceStatus status = null;

        try {
            status = trace.begin("OrderService.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

    }

}
