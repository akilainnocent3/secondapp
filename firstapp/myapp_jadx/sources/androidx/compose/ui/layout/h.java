package androidx.compose.ui.layout;

import defpackage.asr;
import defpackage.biv;
import defpackage.kt;
import defpackage.nzo;
import defpackage.r160;
import defpackage.wkn;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t, nzo {
    public final /* synthetic */ nzo a;
    public final asr b;

    public static final class a implements biv {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Map<kt, Integer> c;
        public final /* synthetic */ Function1<r160, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<kt, Integer> map, Function1<? super r160, Unit> function1) {
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

    public h(nzo nzoVar, asr asrVar) {
        this.a = nzoVar;
        this.b = asrVar;
    }

    @Override // defpackage.mmd
    public final float C1(float f) {
        return this.a.C1(f);
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
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wkn.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, function1);
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
        return this.b;
    }

    @Override // defpackage.nzo
    public final boolean q0() {
        return this.a.q0();
    }

    @Override // defpackage.mmd
    public final float u1(int i) {
        return this.a.u1(i);
    }

    @Override // defpackage.mmd
    public final float v1(float f) {
        return this.a.v1(f);
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
