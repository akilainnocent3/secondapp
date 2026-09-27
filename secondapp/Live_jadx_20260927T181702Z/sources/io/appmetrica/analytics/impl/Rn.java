package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hn f96421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f96422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f96423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f96425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f96426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f96427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f96428h;

    public Rn(Hn hn2, V v10, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f96421a = hn2;
        this.f96422b = v10;
        this.f96423c = arrayList;
        this.f96424d = str;
        this.f96425e = str2;
        this.f96426f = map;
        this.f96427g = str3;
        this.f96428h = bool;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Hn hn2 = this.f96421a;
        if (hn2 != null) {
            for (El el2 : hn2.f95918c) {
                sb2.append("at " + el2.f95792a + androidx.media3.session.fe.F + el2.f95796e + gi.j.f86770c + el2.f95793b + ":" + el2.f95794c + ":" + el2.f95795d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f96421a + IOUtils.LINE_SEPARATOR_UNIX + sb2.toString() + fw.b.f85383j;
    }
}
