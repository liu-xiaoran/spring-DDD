package cn.lxr.springcloud.Service;

import cn.lxr.springcloud.entities.Payment;

/**
 * @author lhx
 * @create 2020/12/9
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
