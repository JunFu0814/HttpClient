package com.study.httpclient;

import javax.ws.rs.client.Client;

public interface RequestHandler<T> {

    /**
     * ����http request����Ļص�
     * @param client
     * @return
     * @throws Exception
     */
    T callback(Client client) throws Exception;
}