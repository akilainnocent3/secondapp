package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Mf implements uo, InterfaceC5544z8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5544z8
    public final int a(@NonNull J8 j10) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C5204lh c5204lh) {
        return TextUtils.isEmpty(o10.f96265b) ? new byte[0] : Base64.decode(o10.f96265b, 0);
    }
}
