package com.chartboost.sdk.impl;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c8 f40423a;

    public p8(c8 fileCaching) {
        kotlin.jvm.internal.m0.p(fileCaching, "fileCaching");
        this.f40423a = fileCaching;
    }

    public final File a(u6 u6Var) {
        return v6.a(u6Var, this.f40423a.c());
    }

    public final File b(u6 u6Var) {
        return v6.a(u6Var, this.f40423a.a());
    }

    public final void c(u6 download) throws IOException {
        kotlin.jvm.internal.m0.p(download, "download");
        if (jg.f39648a.d()) {
            b(download).createNewFile();
        }
    }

    public final void d(u6 download) {
        kotlin.jvm.internal.m0.p(download, "download");
        if (jg.f39648a.d()) {
            a(download).delete();
            b(download).delete();
        }
    }

    public final void e(u6 download) throws IOException {
        kotlin.jvm.internal.m0.p(download, "download");
        if (jg.f39648a.d()) {
            b(download).delete();
            a(download).createNewFile();
        }
    }
}
