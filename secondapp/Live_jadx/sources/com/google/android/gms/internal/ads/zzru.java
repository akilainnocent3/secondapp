package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzru extends Exception {
    public zzru(long j10, long j11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb2.append("Unexpected audio track timestamp discontinuity: expected ");
        sb2.append(j11);
        sb2.append(", got ");
        sb2.append(j10);
        super(sb2.toString());
    }
}
