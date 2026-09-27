package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f65403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b<T> f65404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.c f65405c = com.mbridge.msdk.config.component.load.downloader.c.MEDIUM;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.h f65406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f65407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f65408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f65409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f65410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f65411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f65412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f65413k;

    public e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f65404b = bVar;
    }

    public e<T> a(long j10) {
        this.f65403a = j10;
        return this;
    }

    public e<T> b(long j10) {
        this.f65409g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d<T> build() {
        return d.a(this);
    }

    public p<T> c(long j10) {
        this.f65413k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> withTimeout(long j10) {
        this.f65411i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<T> withHttpRetryCounter(int i10) {
        this.f65410h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar) {
        this.f65406d = hVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar) {
        this.f65405c = cVar;
        return this;
    }
}
