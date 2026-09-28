package androidx.compose.ui.layout;

import defpackage.asr;
import defpackage.biv;
import defpackage.fkd;
import defpackage.glt;
import defpackage.kt;
import defpackage.ov0;
import defpackage.qsr;
import defpackage.r160;
import defpackage.urr;
import defpackage.wkn;
import defpackage.ykt;
import defpackage.ywx;
import defpackage.zkt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ov0, t, glt {
    public final qsr a;
    public b b;
    public boolean c;

    public static final class a implements biv {
        public final int a;
        public final int b;
        public final Map<kt, Integer> c;
        public final Function1<r160, Unit> d;
        public final /* synthetic */ Function1<y.a, Unit> e;
        public final /* synthetic */ c f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2, c cVar) {
            this.e = function2;
            this.f = cVar;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = function1;
        }

        @Override // defpackage.biv
        public final int b() {
            return this.b;
        }

        @Override // defpackage.biv
        public final int c() {
            return this.a;
        }

        @Override // defpackage.biv
        public final void l() {
            this.e.invoke(this.f.a.A);
        }

        @Override // defpackage.biv
        public final Function1<r160, Unit> m() {
            return this.d;
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.c;
        }
    }

    public c(qsr qsrVar, b bVar) {
        this.a = qsrVar;
        this.b = bVar;
    }

    @Override // defpackage.mmd
    public final float C1(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.mmd
    public final float D0(long j) {
        return this.a.D0(j);
    }

    @Override // defpackage.mmd
    public final int I1(long j) {
        return this.a.I1(j);
    }

    @Override // androidx.compose.ui.layout.t
    public final biv K1(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1, Function1<? super y.a, Unit> function2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wkn.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1, function2, this);
    }

    @Override // defpackage.mmd
    public final long N(float f) {
        return this.a.N(f);
    }

    @Override // defpackage.mmd
    public final long O(long j) {
        return this.a.O(j);
    }

    @Override // defpackage.mmd
    public final long U1(long j) {
        return this.a.U1(j);
    }

    @Override // defpackage.mmd
    public final float X(long j) {
        return this.a.X(j);
    }

    @Override // defpackage.glt
    public final urr e(urr urrVar) {
        zkt zktVar;
        if (urrVar instanceof zkt) {
            return urrVar;
        }
        if (urrVar instanceof ywx) {
            ykt yktVarX1 = ((ywx) urrVar).x1();
            return (yktVarX1 == null || (zktVar = yktVarX1.H) == null) ? urrVar : zktVar;
        }
        wkn.b("Unsupported LayoutCoordinates");
        fkd.a();
        return null;
    }

    @Override // androidx.compose.ui.layout.t
    public final biv e1(int i, int i2, Map<kt, Integer> map, Function1<? super y.a, Unit> function1) {
        return this.a.K1(i, i2, map, null, function1);
    }

    @Override // defpackage.mmd
    public final long g0(float f) {
        return this.a.g0(f);
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.nzo
    public final asr getLayoutDirection() {
        return this.a.E.O;
    }

    @Override // defpackage.nzo
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.mmd
    public final float u1(int i) {
        return this.a.u1(i);
    }

    @Override // defpackage.mmd
    public final float v1(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.mmd
    public final int y0(float f) {
        return this.a.y0(f);
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.a.y1();
    }
}
