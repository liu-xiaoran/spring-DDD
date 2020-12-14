package cn.lxr.springcloud.Service.Impl;

import cn.lxr.springcloud.Service.PaymentService;
import cn.lxr.springcloud.dao.PaymentDao;
import cn.lxr.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lhx
 * @create 2020/12/9
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
