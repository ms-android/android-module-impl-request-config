package com.ms.module.impl.request;

import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.request.IRequestConfigAdapter;

public class RequestSettingImpl extends IRequestConfigAdapter {

    public RequestSettingImpl() {
    }

    private int connectTimeout = 10;
    private int readTimeout = 10;
    private int writeTimeout = 10;
    private boolean logOut = false;

    @Override
    public void setConnectTimeout(int value) {
        this.connectTimeout = value;
    }

    @Override
    public int getConnectTimeout() {
        return connectTimeout;
    }

    @Override
    public void setReadTimeout(int value) {
        this.readTimeout = value;
    }

    @Override
    public int getReadTimeout() {
        return readTimeout;
    }

    @Override
    public void setWriteTimeout(int value) {
        this.writeTimeout = value;
    }

    @Override
    public int getWriteTimeout() {
        return writeTimeout;
    }

    @Override
    public void setRequestLogOut(boolean flag) {
        this.logOut = flag;
    }

    @Override
    public boolean getRequestLogOut() {
        return logOut;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public String dependencies() {
        return null;
    }

    @Override
    public String releaseDate() {
        return null;
    }
}