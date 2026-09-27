package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f29299a = new StringBuilder();

    public void a(w0 w0Var, long j10) {
        if (w0Var.d() == w0.b.DECISION) {
            return;
        }
        a(a(w0Var), j10);
    }

    public void b() {
        a("Invalid Activity");
    }

    public String toString() {
        return this.f29299a.toString();
    }

    public void b(String str) {
        a("Invalid state: " + str);
    }

    public void a(w0 w0Var, boolean z10, long j10) {
        a(a(w0Var) + ": " + z10, j10);
    }

    public void a() {
        this.f29299a.setLength(0);
    }

    private void a(String str, long j10) {
        a(str + " after " + j10 + "ms");
    }

    private void a(String str) {
        StringBuilder sb2 = this.f29299a;
        sb2.append(str);
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    private String a(w0 w0Var) {
        w0.b bVarD = w0Var.d();
        if (bVarD == w0.b.EVENT) {
            return ((z0) w0Var).g();
        }
        if (bVarD == w0.b.DECISION) {
            return StringUtils.emptyIfNull(w0Var.b());
        }
        return StringUtils.emptyIfNull(w0Var.e());
    }
}
