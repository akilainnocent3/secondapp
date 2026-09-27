package jg;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100445e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100446f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100447g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100448h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100449i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f100450j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100451k = 6;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100452l = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100453m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100454n = 9;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100455o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100456p = 11;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100457q = 12;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f100458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.rtsp.e f100460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f100461d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public w(Uri uri, int i10, com.google.android.exoplayer2.source.rtsp.e eVar, String str) {
        this.f100458a = uri;
        this.f100459b = i10;
        this.f100460c = eVar;
        this.f100461d = str;
    }
}
