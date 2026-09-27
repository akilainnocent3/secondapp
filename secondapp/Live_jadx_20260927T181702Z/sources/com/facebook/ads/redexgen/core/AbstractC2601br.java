package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2601br {
    public static final int A00 = YB.A00();

    public static void A00(C2900gi c2900gi, ViewGroup viewGroup, String str) {
        new LM(viewGroup, c2900gi).A07(str);
        View view = new View(c2900gi);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        YB.A0U(view, c2900gi);
        viewGroup.addView(view, 0);
    }
}
