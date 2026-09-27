package com.startapp.sdk.internal;

import android.content.pm.Signature;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class o0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Signature) obj).toCharsString().compareTo(((Signature) obj2).toCharsString());
    }
}
