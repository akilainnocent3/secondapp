package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3731i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56635d;

    public AbstractC3731i2(String eventType, String str) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        this.f56632a = eventType;
        this.f56633b = str;
        this.f56634c = System.currentTimeMillis();
    }
}
