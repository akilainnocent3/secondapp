package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @zq.h
    private final String f69725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f69726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f69727c;

    public h(@zq.h String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f69725a = str;
        this.f69726b = j10;
        this.f69727c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f69726b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f69725a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f69727c;
    }
}
