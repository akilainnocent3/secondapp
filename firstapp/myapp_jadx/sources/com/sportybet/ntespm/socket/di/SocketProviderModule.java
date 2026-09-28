package com.sportybet.ntespm.socket.di;

import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.SocketPushManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005H\u0007b\u0002\b\u0006Ê\u0001\u0002\b\bÊ\u0001\u0010\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\t0\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/sportybet/ntespm/socket/di/SocketProviderModule;", "", "<init>", "()V", "provideSocketPushManager", "Lcom/sportybet/ntespm/socket/ISocketPushManager;", "Ldagger/Provides;", "africa-bet-android", "Ldagger/Module;", "Ldagger/hilt/InstallIn;", "value", "Ldagger/hilt/components/SingletonComponent;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SocketProviderModule {
    public static final int $stable = 0;
    public static final SocketProviderModule INSTANCE = new SocketProviderModule();

    private SocketProviderModule() {
    }

    public final ISocketPushManager provideSocketPushManager() {
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        socketPushManager.getClass();
        return socketPushManager;
    }
}
