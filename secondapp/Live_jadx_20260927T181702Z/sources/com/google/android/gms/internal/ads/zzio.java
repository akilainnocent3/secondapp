package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzio extends IllegalStateException {
    public zzio(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21 + String.valueOf(i11).length() + 1);
        sb2.append("Buffer too small (");
        sb2.append(i10);
        sb2.append(" < ");
        sb2.append(i11);
        sb2.append(gi.j.f86771d);
        super(sb2.toString());
    }
}
