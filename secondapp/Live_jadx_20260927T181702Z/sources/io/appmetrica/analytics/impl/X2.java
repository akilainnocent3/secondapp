package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class X2 extends Di {
    public X2(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Di
    @Nullable
    public final Object a(int i10) {
        return Boolean.valueOf(this.f95734a.getResources().getBoolean(i10));
    }

    @Nullable
    public final Boolean b(int i10) {
        return Boolean.valueOf(this.f95734a.getResources().getBoolean(i10));
    }
}
