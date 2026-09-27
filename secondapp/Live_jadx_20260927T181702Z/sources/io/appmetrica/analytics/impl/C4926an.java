package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4926an implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C5204lh c5204lh) {
        return !TextUtils.isEmpty(o10.f96265b) ? StringUtils.getUTF8Bytes(o10.f96265b) : new byte[0];
    }
}
