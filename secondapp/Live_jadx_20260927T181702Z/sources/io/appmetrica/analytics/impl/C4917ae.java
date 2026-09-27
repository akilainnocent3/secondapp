package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4917ae implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96946a;

    public C4917ae(@NonNull String str) {
        this.f96946a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f96946a + " is empty.");
    }
}
