package nf;

import eh.h0;
import java.nio.ByteBuffer;
import re.n2;
import te.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f116597d = 529;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116598e = "C2Mp3TimestampTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f116599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f116600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116601c;

    public final long a(long j10) {
        return this.f116599a + Math.max(0L, ((this.f116600b - 529) * 1000000) / j10);
    }

    public long b(n2 n2Var) {
        return a(n2Var.A);
    }

    public void c() {
        this.f116599a = 0L;
        this.f116600b = 0L;
        this.f116601c = false;
    }

    public long d(n2 n2Var, ye.i iVar) {
        if (this.f116600b == 0) {
            this.f116599a = iVar.f159200g;
        }
        if (this.f116601c) {
            return iVar.f159200g;
        }
        ByteBuffer byteBuffer = (ByteBuffer) eh.a.g(iVar.f159198e);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iM = o0.m(i10);
        if (iM != -1) {
            long jA = a(n2Var.A);
            this.f116600b += (long) iM;
            return jA;
        }
        this.f116601c = true;
        this.f116600b = 0L;
        this.f116599a = iVar.f159200g;
        h0.n(f116598e, "MPEG audio header is invalid.");
        return iVar.f159200g;
    }
}
