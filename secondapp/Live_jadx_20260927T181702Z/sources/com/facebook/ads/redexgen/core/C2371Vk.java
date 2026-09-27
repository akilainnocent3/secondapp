package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.signals.SignalKey;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2371Vk {
    public final InterfaceC2369Vi A0B;
    public final boolean A0F;
    public final String A0C = C2371Vk.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = SignalKey.EVENT_ID;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C2370Vj> A0D = new LinkedList();

    public C2371Vk(T8 t10, InterfaceC2369Vi interfaceC2369Vi) {
        int nativeViewabilityHistorySamplingRate = AbstractC2352Ur.A0D(t10);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = t10.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC2369Vi;
    }

    private int A00() {
        return this.A0B.A7d();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C2370Vj c2370Vj) {
        synchronized (this.A0D) {
            this.A0D.add(c2370Vj);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C2370Vj(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 102, A00(), null));
    }

    public final void A0C(T8 t10, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C2370Vj(A01(), 103, A00(), null));
        YG.A06.execute(new RunnableC2368Vh(this, str, t10));
    }
}
