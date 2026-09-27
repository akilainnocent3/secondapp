package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5350re implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f98231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kg f98232b;

    public C5350re(@oy.l File file, @oy.l Kg kg2) {
        this.f98231a = file;
        this.f98232b = kg2;
    }

    @Override // io.appmetrica.analytics.impl.J6
    @oy.l
    public final File a(@oy.l Context context, @oy.l String str) {
        return new File(this.f98231a, this.f98232b.a(str));
    }
}
