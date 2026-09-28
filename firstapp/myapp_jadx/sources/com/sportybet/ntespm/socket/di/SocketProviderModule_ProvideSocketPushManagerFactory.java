package com.sportybet.ntespm.socket.di;

import com.sportybet.ntespm.socket.ISocketPushManager;
import defpackage.jm20;
import defpackage.l730;

/* JADX INFO: loaded from: classes6.dex */
public final class SocketProviderModule_ProvideSocketPushManagerFactory implements l730 {

    public static final class InstanceHolder {
        static final SocketProviderModule_ProvideSocketPushManagerFactory INSTANCE = new SocketProviderModule_ProvideSocketPushManagerFactory();

        private InstanceHolder() {
        }
    }

    public static SocketProviderModule_ProvideSocketPushManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ISocketPushManager provideSocketPushManager() {
        ISocketPushManager iSocketPushManagerProvideSocketPushManager = SocketProviderModule.INSTANCE.provideSocketPushManager();
        jm20.a(iSocketPushManagerProvideSocketPushManager);
        return iSocketPushManagerProvideSocketPushManager;
    }

    @Override // defpackage.m730
    public ISocketPushManager get() {
        return provideSocketPushManager();
    }
}
