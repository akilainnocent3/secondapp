package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3416pZ implements AnonymousClass24 {
    public final int A00;
    public final C3423pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = C5C.A0h(0);
    public static final String A09 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(3);
    public static final String A06 = C5C.A0h(4);
    public static final AnonymousClass23<C3416pZ> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C3416pZ.A00(bundle);
        }
    };

    public C3416pZ(C3423pg c3423pg, boolean z10, int[] iArr, boolean[] zArr) {
        this.A00 = c3423pg.A01;
        boolean z11 = false;
        AbstractC16843y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c3423pg;
        if (z10 && this.A00 > 1) {
            z11 = true;
        }
        this.A02 = z11;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C3416pZ A00(Bundle bundle) {
        C3423pg c3423pg = (C3423pg) C3423pg.A06.A6f((Bundle) AbstractC16843y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC3123ka.A00(bundle.getIntArray(A09), new int[c3423pg.A01]);
        boolean[] selected = (boolean[]) AbstractC3123ka.A00(bundle.getBooleanArray(A08), new boolean[c3423pg.A01]);
        return new C3416pZ(c3423pg, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3416pZ c3416pZ = (C3416pZ) obj;
        if (this.A02 == c3416pZ.A02 && this.A01.equals(c3416pZ.A01) && Arrays.equals(this.A03, c3416pZ.A03) && Arrays.equals(this.A04, c3416pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
