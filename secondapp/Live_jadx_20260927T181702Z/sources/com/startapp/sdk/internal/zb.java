package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class zb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zb f75977d = new zb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb f75979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75980c;

    public zb(Locale primary, LinkedHashSet linkedHashSet) {
        kotlin.jvm.internal.m0.p(primary, "primary");
        this.f75978a = primary.toString();
        this.f75979b = new xb(linkedHashSet);
        this.f75980c = yb.a(primary, linkedHashSet, fw.b.f85380g);
    }

    public zb() {
        this.f75978a = null;
        this.f75979b = null;
        this.f75980c = null;
    }
}
