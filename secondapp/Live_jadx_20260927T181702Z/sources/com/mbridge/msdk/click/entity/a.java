package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f64926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f64927h;

    public String a() {
        return "statusCode=" + this.f64925f + ", location=" + this.f64920a + ", contentType=" + this.f64921b + ", contentLength=" + this.f64924e + ", contentEncoding=" + this.f64922c + ", referer=" + this.f64923d;
    }

    @NonNull
    public String toString() {
        return "ClickResponseHeader{location='" + this.f64920a + "', contentType='" + this.f64921b + "', contentEncoding='" + this.f64922c + "', referer='" + this.f64923d + "', contentLength=" + this.f64924e + ", statusCode=" + this.f64925f + ", url='" + this.f64926g + "', exception='" + this.f64927h + '\'' + fw.b.f85383j;
    }
}
