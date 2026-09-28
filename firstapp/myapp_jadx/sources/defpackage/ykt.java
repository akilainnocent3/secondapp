package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ykt extends xkt implements vhv {
    public final ywx E;
    public LinkedHashMap G;
    public biv I;
    public long F = 0;
    public final zkt H = new zkt(this);
    public final dtw<kt> J = zby.a();

    public ykt(ywx ywxVar) {
        this.E = ywxVar;
    }

    @Override // defpackage.xkt
    public final xkt K0() {
        ywx ywxVar = this.E.H;
        if (ywxVar != null) {
            return ywxVar.x1();
        }
        return null;
    }

    @Override // defpackage.xkt
    public final boolean N0() {
        return this.I != null;
    }

    @Override // defpackage.xkt
    public final biv O0() {
        biv bivVar = this.I;
        if (bivVar != null) {
            return bivVar;
        }
        throw w20.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.xkt
    public final xkt Q0() {
        ywx ywxVar = this.E.I;
        if (ywxVar != null) {
            return ywxVar.x1();
        }
        return null;
    }

    @Override // defpackage.xkt
    public final long R0() {
        return this.F;
    }

    @Override // defpackage.xkt, defpackage.civ
    public final tsr T1() {
        return this.E.E;
    }

    @Override // defpackage.xkt
    public final void W0() {
        t0(this.F, 0.0f, null);
    }

    public final long Y0() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    @Override // defpackage.xkt
    public final urr f1() {
        return this.H;
    }

    @Override // defpackage.eiv, defpackage.mzo
    public final Object g() {
        return this.E.g();
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.E.getDensity();
    }

    @Override // defpackage.nzo
    public final asr getLayoutDirection() {
        return this.E.E.O;
    }

    public void h1() {
        O0().l();
    }

    public final void i1(long j) {
        if (!iwo.b(this.F, j)) {
            this.F = j;
            ywx ywxVar = this.E;
            blt bltVar = ywxVar.E.V.q;
            if (bltVar != null) {
                bltVar.I0();
            }
            xkt.T0(ywxVar);
        }
        if (this.z) {
            return;
        }
        J0(O0());
    }

    public final long k1(ykt yktVar, boolean z) {
        long jD = 0;
        while (!this.equals(yktVar)) {
            if (!this.w || !z) {
                jD = iwo.d(jD, this.F);
            }
            ywx ywxVar = this.E.I;
            ywxVar.getClass();
            this = ywxVar.x1();
            this.getClass();
        }
        return jD;
    }

    public final void m1(biv bivVar) {
        LinkedHashMap linkedHashMap;
        if (bivVar != null) {
            u0((((long) bivVar.b()) & 4294967295L) | (((long) bivVar.c()) << 32));
        } else {
            u0(0L);
        }
        if (!Intrinsics.g(this.I, bivVar) && bivVar != null && ((((linkedHashMap = this.G) != null && !linkedHashMap.isEmpty()) || !bivVar.s().isEmpty()) && !Intrinsics.g(bivVar.s(), this.G))) {
            blt bltVar = this.E.E.V.q;
            bltVar.getClass();
            bltVar.H.g();
            LinkedHashMap linkedHashMap2 = this.G;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.G = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(bivVar.s());
        }
        this.I = bivVar;
    }

    @Override // defpackage.xkt, defpackage.nzo
    public final boolean q0() {
        return true;
    }

    @Override // androidx.compose.ui.layout.y
    public final void t0(long j, float f, Function1<? super a7l, Unit> function1) {
        i1(j);
        if (this.y) {
            return;
        }
        h1();
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.E.y1();
    }
}
