package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5543z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ja f98695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98696b = "";

    public C5543z7(Ja ja2) {
        this.f98695a = ja2;
    }

    public final void a(String str, boolean z10) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.m0.g(this.f98696b, str)) {
                return;
            }
            this.f98696b = str;
            this.f98695a.a(str, z10);
        }
    }
}
