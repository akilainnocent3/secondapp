package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C17677d {
    public int A00;
    public int A01;
    public Looper A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Timeline A0A;
    public final AnonymousClass45 A0B;
    public final InterfaceC17657b A0C;
    public final InterfaceC17667c A0D;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C17677d(InterfaceC17657b interfaceC17657b, InterfaceC17667c interfaceC17667c, Timeline timeline, int i10, AnonymousClass45 anonymousClass45, Looper looper) {
        this.A0C = interfaceC17657b;
        this.A0D = interfaceC17667c;
        this.A0A = timeline;
        this.A03 = looper;
        this.A0B = anonymousClass45;
        this.A00 = i10;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Looper A03() {
        return this.A03;
    }

    public final Timeline A04() {
        return this.A0A;
    }

    public final InterfaceC17667c A05() {
        return this.A0D;
    }

    public final C17677d A06() {
        AbstractC16843y.A08(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            AbstractC16843y.A07(this.A05);
        }
        this.A09 = true;
        this.A0C.AJC(this);
        return this;
    }

    public final C17677d A07(int i10) {
        AbstractC16843y.A08(!this.A09);
        this.A01 = i10;
        return this;
    }

    public final C17677d A08(Object obj) {
        AbstractC16843y.A08(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z10) {
        this.A07 |= z10;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        AbstractC16843y.A08(this.A09);
        AbstractC16843y.A08(this.A03.getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
