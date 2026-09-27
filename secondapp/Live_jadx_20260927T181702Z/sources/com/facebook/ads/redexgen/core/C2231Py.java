package com.facebook.ads.redexgen.core;

import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2231Py {
    public final Object A00;

    public C2231Py(Object obj) {
        this.A00 = obj;
    }

    public static C2231Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C2231Py(obj);
    }

    public static Object A01(C2231Py c2231Py) {
        if (c2231Py == null) {
            return null;
        }
        return c2231Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C2231Py A06(int i10, int i11, int i12, int i13) {
        return new C2231Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i10, i11, i12, i13));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2231Py c2231Py = (C2231Py) obj;
        if (this.A00 == null) {
            return c2231Py.A00 == null;
        }
        return this.A00.equals(c2231Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
