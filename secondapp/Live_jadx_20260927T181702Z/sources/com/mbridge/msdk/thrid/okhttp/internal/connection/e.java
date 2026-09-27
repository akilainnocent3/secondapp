package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f69677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f69678b;

    public e(IOException iOException) {
        super(iOException);
        this.f69677a = iOException;
        this.f69678b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f69677a, (Throwable) iOException);
        this.f69678b = iOException;
    }

    public IOException d() {
        return this.f69677a;
    }

    public IOException g() {
        return this.f69678b;
    }
}
