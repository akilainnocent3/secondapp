package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f65177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f65178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f65180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f65181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f65182f;

    public String a() {
        return this.f65179c + this.f65177a;
    }

    public void b(String str) {
        this.f65177a = str;
    }

    public void c(String str) {
        this.f65178b = str;
    }

    public String d() {
        return this.f65181e;
    }

    public void e(String str) {
        this.f65181e = str;
    }

    @NonNull
    public String toString() {
        return "FileDescription{fileName='" + this.f65177a + "', fileType='" + this.f65178b + "', dirPath='" + this.f65179c + "', unZipDirPath='" + this.f65180d + "', unZipFilePath='" + this.f65181e + "', fileExists=" + this.f65182f + fw.b.f85383j;
    }

    public void a(String str) {
        this.f65179c = str;
    }

    public String b() {
        return this.f65178b;
    }

    public String c() {
        return this.f65180d;
    }

    public void d(String str) {
        this.f65180d = str;
    }

    public boolean e() {
        return this.f65182f;
    }

    public void a(boolean z10) {
        this.f65182f = z10;
    }
}
