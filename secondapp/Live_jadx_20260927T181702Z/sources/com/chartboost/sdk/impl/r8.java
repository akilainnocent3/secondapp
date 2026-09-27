package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f40752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f40753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f40754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f40755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f40756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f40757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f40758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final File f40759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f40760i;

    public r8(File file) {
        File file2 = new File(file, ".chartboost");
        this.f40752a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f40753b = a(file2, "css");
        this.f40754c = a(file2, "html");
        this.f40755d = a(file2, "images");
        this.f40756e = a(file2, "js");
        this.f40757f = a(file2, "templates");
        this.f40758g = a(file2, "videos");
        this.f40759h = a(file2, "precache");
        this.f40760i = a(file2, "precache_queue");
    }

    public File a() {
        return this.f40752a;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
