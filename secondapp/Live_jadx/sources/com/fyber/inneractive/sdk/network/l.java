package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f45326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f45327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f45329f = new ArrayList();

    public l() {
    }

    public void a() {
        InputStream inputStream = this.f45326c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) {
        this.f45326c = filterInputStream;
        this.f45324a = i10;
        this.f45325b = str;
        this.f45327d = map;
        this.f45328e = str2;
    }
}
