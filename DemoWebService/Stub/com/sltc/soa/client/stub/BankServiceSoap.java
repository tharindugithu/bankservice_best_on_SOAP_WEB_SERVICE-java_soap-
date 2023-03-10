
package com.sltc.soa.client.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "bank_serviceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankServiceSoap {


    /**
     * 
     * @param depositMoney
     * @param accoutBalance
     * @return
     *     returns double
     */
    @WebMethod(operationName = "DepositMoney", action = "http://tempuri.org/DepositMoney")
    @WebResult(name = "DepositMoneyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DepositMoney", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.DepositMoney")
    @ResponseWrapper(localName = "DepositMoneyResponse", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.DepositMoneyResponse")
    public double depositMoney(
        @WebParam(name = "accout_balance", targetNamespace = "http://tempuri.org/")
        double accoutBalance,
        @WebParam(name = "deposit_money", targetNamespace = "http://tempuri.org/")
        double depositMoney);

    /**
     * 
     * @param withdrawMoney
     * @param accoutBalance
     * @return
     *     returns double
     */
    @WebMethod(operationName = "WithdrawMoney", action = "http://tempuri.org/WithdrawMoney")
    @WebResult(name = "WithdrawMoneyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "WithdrawMoney", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.WithdrawMoney")
    @ResponseWrapper(localName = "WithdrawMoneyResponse", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.WithdrawMoneyResponse")
    public double withdrawMoney(
        @WebParam(name = "accout_balance", targetNamespace = "http://tempuri.org/")
        double accoutBalance,
        @WebParam(name = "withdraw_money", targetNamespace = "http://tempuri.org/")
        double withdrawMoney);

    /**
     * 
     * @param transferMoney
     * @param accoutBalance
     * @return
     *     returns double
     */
    @WebMethod(operationName = "TransferMoney", action = "http://tempuri.org/TransferMoney")
    @WebResult(name = "TransferMoneyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TransferMoney", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.TransferMoney")
    @ResponseWrapper(localName = "TransferMoneyResponse", targetNamespace = "http://tempuri.org/", className = "com.sltc.soa.client.stub.TransferMoneyResponse")
    public double transferMoney(
        @WebParam(name = "accout_balance", targetNamespace = "http://tempuri.org/")
        double accoutBalance,
        @WebParam(name = "transfer_money", targetNamespace = "http://tempuri.org/")
        double transferMoney);

}
