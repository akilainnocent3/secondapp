package androidx.compose.ui.layout;

import defpackage.a7l;
import defpackage.asr;
import defpackage.eiv;
import defpackage.iwo;
import defpackage.jxo;
import defpackage.kxa;
import defpackage.mmd;
import defpackage.urr;
import defpackage.v6l;
import defpackage.x5w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements eiv {
    public int a;
    public int b;
    public long c = 0;
    public long d = z.b;
    public long e = 0;

    public static abstract class a implements mmd {
        public boolean a;

        public static void A(a aVar, y yVar, int i, int i2) {
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (aVar.g() == asr.a || aVar.i() == 0) {
                aVar.o(yVar);
                yVar.t0(iwo.d(j, yVar.e), 0.0f, null);
            } else {
                int i3 = (aVar.i() - yVar.a) - ((int) (j >> 32));
                aVar.o(yVar);
                yVar.t0(iwo.d((((long) i3) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), yVar.e), 0.0f, null);
            }
        }

        public static void C(a aVar, y yVar, int i, int i2) {
            z.a aVar2 = z.a;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (aVar.g() == asr.a || aVar.i() == 0) {
                aVar.o(yVar);
                yVar.t0(iwo.d(j, yVar.e), 0.0f, aVar2);
            } else {
                int i3 = (aVar.i() - yVar.a) - ((int) (j >> 32));
                aVar.o(yVar);
                yVar.t0(iwo.d((((long) i3) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), yVar.e), 0.0f, aVar2);
            }
        }

        public static void D(a aVar, y yVar, long j) {
            z.a aVar2 = z.a;
            if (aVar.g() == asr.a || aVar.i() == 0) {
                aVar.o(yVar);
                yVar.t0(iwo.d(j, yVar.e), 0.0f, aVar2);
            } else {
                int i = (aVar.i() - yVar.a) - ((int) (j >> 32));
                aVar.o(yVar);
                yVar.t0(iwo.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) i) << 32), yVar.e), 0.0f, aVar2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void J(a aVar, y yVar, int i, int i2, Function1 function1, int i3) {
            if ((i3 & 8) != 0) {
                function1 = z.a;
            }
            aVar.E(yVar, i, i2, 0.0f, function1);
        }

        public static void M(a aVar, y yVar, long j) {
            z.a aVar2 = z.a;
            aVar.o(yVar);
            yVar.t0(iwo.d(j, yVar.e), 0.0f, aVar2);
        }

        public static void x(a aVar, y yVar, long j) {
            aVar.o(yVar);
            yVar.t0(iwo.d(j, yVar.e), 0.0f, null);
        }

        public final void E(y yVar, int i, int i2, float f, Function1<? super a7l, Unit> function1) {
            o(yVar);
            yVar.t0(iwo.d((((long) i2) & 4294967295L) | (((long) i) << 32), yVar.e), f, function1);
        }

        public float e(b0 b0Var, float f) {
            return f;
        }

        public urr f1() {
            return null;
        }

        public abstract asr g();

        @Override // defpackage.mmd
        public float getDensity() {
            return 1.0f;
        }

        public abstract int i();

        /* JADX WARN: Multi-variable type inference failed */
        public final void o(y yVar) {
            if (yVar instanceof x5w) {
                ((x5w) yVar).E(this.a);
            }
        }

        public final void s(y yVar, int i, int i2, float f) {
            o(yVar);
            yVar.t0(iwo.d((((long) i2) & 4294967295L) | (((long) i) << 32), yVar.e), f, null);
        }

        @Override // defpackage.mmd
        public float y1() {
            return 1.0f;
        }
    }

    public int l0() {
        return (int) (this.c & 4294967295L);
    }

    public int o0() {
        return (int) (this.c >> 32);
    }

    public final void p0() {
        this.a = kotlin.ranges.f.e((int) (this.c >> 32), kxa.k(this.d), kxa.i(this.d));
        int iE = kotlin.ranges.f.e((int) (this.c & 4294967295L), kxa.j(this.d), kxa.h(this.d));
        this.b = iE;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iE - ((int) (j & 4294967295L))) / 2)));
    }

    public void r0(long j, float f, v6l v6lVar) {
        t0(j, f, null);
    }

    public abstract void t0(long j, float f, Function1<? super a7l, Unit> function1);

    public final void u0(long j) {
        if (jxo.b(this.c, j)) {
            return;
        }
        this.c = j;
        p0();
    }

    public final void w0(long j) {
        if (kxa.c(this.d, j)) {
            return;
        }
        this.d = j;
        p0();
    }
}
