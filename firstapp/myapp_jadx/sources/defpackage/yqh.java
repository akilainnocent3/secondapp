package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes4.dex */
public final class yqh implements l730 {
    @Override // defpackage.m730
    public final Object get() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        jm20.a(remoteConfigManager);
        return remoteConfigManager;
    }
}
