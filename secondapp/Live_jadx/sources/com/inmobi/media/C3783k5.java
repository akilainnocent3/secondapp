package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3783k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56795c;

    public C3783k5(Context context, ArrayList tableInfos, int i10) {
        kotlin.jvm.internal.m0.p("com.im_11.1.0.db", "name");
        kotlin.jvm.internal.m0.p(tableInfos, "tableInfos");
        this.f56793a = context;
        this.f56794b = tableInfos;
        this.f56795c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3783k5)) {
            return false;
        }
        C3783k5 c3783k5 = (C3783k5) obj;
        return kotlin.jvm.internal.m0.g(this.f56793a, c3783k5.f56793a) && kotlin.jvm.internal.m0.g("com.im_11.1.0.db", "com.im_11.1.0.db") && kotlin.jvm.internal.m0.g(this.f56794b, c3783k5.f56794b) && this.f56795c == c3783k5.f56795c && kotlin.jvm.internal.m0.g(null, null);
    }

    public final int hashCode() {
        Context context = this.f56793a;
        return AbstractC3671fi.a(this.f56795c, (this.f56794b.hashCode() + AbstractC3671fi.a(1, (((context == null ? 0 : context.hashCode()) * 31) - 2016312295) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f56793a + ", name=com.im_11.1.0.db, version=1, tableInfos=" + this.f56794b + ", journalMode=" + this.f56795c + ", transactionExecutor=" + ((Object) null) + gi.j.f86771d;
    }
}
