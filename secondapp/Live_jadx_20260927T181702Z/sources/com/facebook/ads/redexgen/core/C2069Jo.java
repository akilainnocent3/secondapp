package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2069Jo {
    public static final Comparator<C2069Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C2069Jo) obj2).A00, ((C2069Jo) obj).A00);
        }
    };
    public final int A00;
    public final C3410pT A01;

    public C2069Jo(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        C16743o cueBuilder = new C16743o().A0G(charSequence).A0F(alignment).A07(f10, i10).A09(i11).A04(f11).A0A(i12).A06(f12);
        if (z10) {
            cueBuilder.A0C(i13);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i14;
    }
}
