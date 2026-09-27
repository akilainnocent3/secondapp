package com.google.gson;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f52390d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f52391e = new e(IOUtils.LINE_SEPARATOR_UNIX, vb.q.a.f140822e, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52394c;

    public e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f52392a = str;
        this.f52393b = str2;
        this.f52394c = z10;
    }

    public String a() {
        return this.f52393b;
    }

    public String b() {
        return this.f52392a;
    }

    public boolean c() {
        return this.f52394c;
    }

    public e d(String str) {
        return new e(this.f52392a, str, this.f52394c);
    }

    public e e(String str) {
        return new e(str, this.f52393b, this.f52394c);
    }

    public e f(boolean z10) {
        return new e(this.f52392a, this.f52393b, z10);
    }
}
