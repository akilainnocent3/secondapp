package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3400pJ implements C4X {
    public static final List<C3401pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C3400pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C3401pK A00() {
        C3401pK c3401pK;
        synchronized (A01) {
            c3401pK = A01.isEmpty() ? new C3401pK() : A01.remove(A01.size() - 1);
        }
        return c3401pK;
    }

    public static void A01(C3401pK c3401pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c3401pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean A9n(int i10) {
        return this.A00.hasMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C3401pK ACg(int i10) {
        return A00().A01(this.A00.obtainMessage(i10), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C3401pK ACh(int i10, int i11, int i12) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C3401pK ACi(int i10, int i11, int i12, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C3401pK ACj(int i10, Object obj) {
        return A00().A01(this.A00.obtainMessage(i10, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final void AIT(int i10) {
        this.A00.removeMessages(i10);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJA(int i10) {
        return this.A00.sendEmptyMessage(i10);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJB(int i10, long j10) {
        return this.A00.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C3401pK) c4w).A03(this.A00);
    }
}
