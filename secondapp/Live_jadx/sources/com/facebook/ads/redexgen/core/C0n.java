package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.facebook.ads.redexgen.core.C2216Pg
    public final C2231Py A07(View view, C2231Py c2231Py) {
        WindowInsets result = (WindowInsets) C2231Py.A01(c2231Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2231Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C2216Pg
    public final C2231Py A08(View view, C2231Py c2231Py) {
        WindowInsets result = (WindowInsets) C2231Py.A01(c2231Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2231Py.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C2216Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C2216Pg
    public final void A0E(View view, PR pr2) {
        if (pr2 == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2215Pf(this, pr2));
        }
    }
}
