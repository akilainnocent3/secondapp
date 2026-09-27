package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f65353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f65356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65357e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f65358f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f65359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f65360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f65361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f65362j;

    public b(T t10, String str, String str2, int i10) {
        this.f65353a = t10;
        this.f65359g = str2;
        this.f65354b = i10;
        try {
            URL url = new URL(str);
            this.f65355c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resourceUrl: ");
            sb2.append(this.f65355c);
            q0.a("DownloadMessage", sb2.toString());
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f65356d == null) {
            this.f65356d = new HashMap(4);
        }
        this.f65356d.put(str, obj);
    }

    public float b() {
        return this.f65362j;
    }

    public int c() {
        return this.f65354b;
    }

    public String d() {
        return this.f65355c;
    }

    public String e() {
        return this.f65359g;
    }

    public String f() {
        return this.f65358f;
    }

    public boolean g() {
        return this.f65360h;
    }

    public void a(String str) {
        this.f65358f = str;
    }

    public void a(boolean z10) {
        this.f65360h = z10;
    }

    public long a() {
        return this.f65361i;
    }

    public void a(long j10) {
        this.f65361i = j10;
    }

    public void a(float f10) {
        this.f65362j = f10;
    }
}
