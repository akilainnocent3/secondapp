package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Wm extends Di {
    public Wm(@NonNull Context context, @NonNull String str) {
        super(context, str, "string");
    }

    @Override // io.appmetrica.analytics.impl.Di
    @Nullable
    public final Object a(int i10) {
        return this.f95734a.getString(i10);
    }

    @Nullable
    public final String b(int i10) {
        return this.f95734a.getString(i10);
    }
}
