package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
public final class K6 implements J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Kg f96046a;

    public K6(@oy.l Kg kg2) {
        this.f96046a = kg2;
    }

    @Override // io.appmetrica.analytics.impl.J6
    @oy.l
    public File a(@oy.l Context context, @oy.l String str) {
        return new File(context.getNoBackupFilesDir(), this.f96046a.a(str));
    }
}
