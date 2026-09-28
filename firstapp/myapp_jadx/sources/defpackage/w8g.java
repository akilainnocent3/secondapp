package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w8g extends rsr {
    public dtg0<w7g> D;
    public dtg0<w7g>.a<jxo, jj0> E;
    public dtg0<w7g>.a<iwo, jj0> F;
    public dtg0<w7g>.a<iwo, jj0> G;
    public s9g H;
    public androidx.compose.animation.g I;
    public Function0<Boolean> J;
    public x6l K;
    public long L = -9223372034707292160L;
    public ht M;
    public final h N;
    public final i O;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            aVar.s(this.a, 0, 0, 0.0f);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Function1<a7l, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(y yVar, long j, long j2, Function1<? super a7l, Unit> function1) {
            super(1);
            this.a = yVar;
            this.b = j;
            this.c = j2;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            long j = this.b;
            long j2 = this.c;
            aVar.E(this.a, ((int) (j >> 32)) + ((int) (j2 >> 32)), ((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)), 0.0f, this.d);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y yVar) {
            super(1);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            aVar.s(this.a, 0, 0, 0.0f);
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function1<w7g, jxo> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(1);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final jxo invoke(w7g w7gVar) {
            Function1<jxo, jxo> function1;
            Function1<jxo, jxo> function2;
            int iOrdinal = w7gVar.ordinal();
            w8g w8gVar = w8g.this;
            long j = this.b;
            if (iOrdinal == 0) {
                x57 x57Var = w8gVar.H.a().c;
                if (x57Var != null && (function1 = x57Var.b) != null) {
                    j = function1.invoke(new jxo(j)).a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                x57 x57Var2 = w8gVar.I.a().c;
                if (x57Var2 != null && (function2 = x57Var2.b) != null) {
                    j = function2.invoke(new jxo(j)).a;
                }
            }
            return new jxo(j);
        }
    }

    public static final class e extends qlr implements Function1<dtg0.b<w7g>, goh<iwo>> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final goh<iwo> invoke(dtg0.b<w7g> bVar) {
            return androidx.compose.animation.f.c;
        }
    }

    public static final class f extends qlr implements Function1<w7g, iwo> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j) {
            super(1);
            this.b = j;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0067  */
        @Override // kotlin.jvm.functions.Function1
        public final iwo invoke(w7g w7gVar) {
            long jC;
            int iOrdinal;
            w7g w7gVar2 = w7gVar;
            w8g w8gVar = w8g.this;
            if (w8gVar.M == null || w8gVar.p2() == null || Intrinsics.g(w8gVar.M, w8gVar.p2()) || (iOrdinal = w7gVar2.ordinal()) == 0 || iOrdinal == 1) {
                jC = 0;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                x57 x57Var = w8gVar.I.a().c;
                if (x57Var != null) {
                    Function1<jxo, jxo> function1 = x57Var.b;
                    long j = this.b;
                    long j2 = function1.invoke(new jxo(j)).a;
                    ht htVarP2 = w8gVar.p2();
                    htVarP2.getClass();
                    asr asrVar = asr.a;
                    long jA = ((n54) htVarP2).a(j, j2, asrVar);
                    ht htVar = w8gVar.M;
                    htVar.getClass();
                    jC = iwo.c(jA, htVar.a(j, j2, asrVar));
                } else {
                    jC = 0;
                }
            }
            return new iwo(jC);
        }
    }

    public static final class g extends qlr implements Function1<w7g, iwo> {
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j) {
            super(1);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final iwo invoke(w7g w7gVar) {
            w7g w7gVar2 = w7gVar;
            w8g w8gVar = w8g.this;
            xy90 xy90Var = w8gVar.H.a().b;
            long j = this.b;
            long j2 = 0;
            long j3 = xy90Var != null ? xy90Var.a.invoke(new jxo(j)).a : 0L;
            xy90 xy90Var2 = w8gVar.I.a().b;
            long j4 = xy90Var2 != null ? xy90Var2.a.invoke(new jxo(j)).a : 0L;
            int iOrdinal = w7gVar2.ordinal();
            if (iOrdinal == 0) {
                j2 = j3;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                j2 = j4;
            }
            return new iwo(j2);
        }
    }

    public static final class h extends qlr implements Function1<dtg0.b<w7g>, goh<jxo>> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final goh<jxo> invoke(dtg0.b<w7g> bVar) {
            dtg0.b<w7g> bVar2 = bVar;
            w7g w7gVar = w7g.a;
            w7g w7gVar2 = w7g.b;
            boolean zD = bVar2.d(w7gVar, w7gVar2);
            goh<jxo> gohVar = null;
            w8g w8gVar = w8g.this;
            if (zD) {
                x57 x57Var = w8gVar.H.a().c;
                if (x57Var != null) {
                    gohVar = x57Var.c;
                }
            } else if (bVar2.d(w7gVar2, w7g.c)) {
                x57 x57Var2 = w8gVar.I.a().c;
                if (x57Var2 != null) {
                    gohVar = x57Var2.c;
                }
            } else {
                gohVar = androidx.compose.animation.f.d;
            }
            return gohVar == null ? androidx.compose.animation.f.d : gohVar;
        }
    }

    public static final class i extends qlr implements Function1<dtg0.b<w7g>, goh<iwo>> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final goh<iwo> invoke(dtg0.b<w7g> bVar) {
            goh<iwo> gohVar;
            goh<iwo> gohVar2;
            dtg0.b<w7g> bVar2 = bVar;
            w7g w7gVar = w7g.a;
            w7g w7gVar2 = w7g.b;
            boolean zD = bVar2.d(w7gVar, w7gVar2);
            w8g w8gVar = w8g.this;
            if (zD) {
                xy90 xy90Var = w8gVar.H.a().b;
                return (xy90Var == null || (gohVar2 = xy90Var.b) == null) ? androidx.compose.animation.f.c : gohVar2;
            }
            if (!bVar2.d(w7gVar2, w7g.c)) {
                return androidx.compose.animation.f.c;
            }
            xy90 xy90Var2 = w8gVar.I.a().b;
            return (xy90Var2 == null || (gohVar = xy90Var2.b) == null) ? androidx.compose.animation.f.c : gohVar;
        }
    }

    public w8g(dtg0<w7g> dtg0Var, dtg0<w7g>.a<jxo, jj0> aVar, dtg0<w7g>.a<iwo, jj0> aVar2, dtg0<w7g>.a<iwo, jj0> aVar3, s9g s9gVar, androidx.compose.animation.g gVar, Function0<Boolean> function0, x6l x6lVar) {
        this.D = dtg0Var;
        this.E = aVar;
        this.F = aVar2;
        this.G = aVar3;
        this.H = s9gVar;
        this.I = gVar;
        this.J = function0;
        this.K = x6lVar;
        oxa.b(0, 0, 0, 15);
        this.N = new h();
        this.O = new i();
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        long j2;
        long j3;
        long j4;
        dtg0.a.C0505a c0505aA = null;
        if (this.D.a.V() == ((x5a0) this.D.d).getValue()) {
            this.M = null;
        } else if (this.M == null) {
            ht htVarP2 = p2();
            if (htVarP2 == null) {
                htVarP2 = ht.a.a;
            }
            this.M = htVarP2;
        }
        if (tVar.q0()) {
            y yVarD0 = vhvVar.d0(j);
            long j5 = (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L);
            this.L = j5;
            return t.z1(tVar, (int) (j5 >> 32), (int) (j5 & 4294967295L), new a(yVarD0));
        }
        if (!this.J.invoke().booleanValue()) {
            y yVarD1 = vhvVar.d0(j);
            return t.z1(tVar, yVarD1.a, yVarD1.b, new c(yVarD1));
        }
        b8g b8gVarA = this.K.a();
        y yVarD2 = vhvVar.d0(j);
        long j6 = (((long) yVarD2.a) << 32) | (((long) yVarD2.b) & 4294967295L);
        long j7 = androidx.compose.animation.e.b(this.L) ? this.L : j6;
        dtg0<w7g>.a<jxo, jj0> aVar = this.E;
        if (aVar != null) {
            c0505aA = aVar.a(this.N, new d(j7));
        }
        if (c0505aA != null) {
            j6 = ((jxo) c0505aA.getValue()).a;
        }
        long jD = oxa.d(j, j6);
        dtg0<w7g>.a<iwo, jj0> aVar2 = this.F;
        long jA = 0;
        if (aVar2 != null) {
            j2 = ((iwo) aVar2.a(e.a, new f(j7)).getValue()).a;
        } else {
            j2 = 0;
        }
        dtg0<w7g>.a<iwo, jj0> aVar3 = this.G;
        if (aVar3 != null) {
            j3 = ((iwo) aVar3.a(this.O, new g(j7)).getValue()).a;
        } else {
            j3 = 0;
        }
        ht htVar = this.M;
        if (htVar != null) {
            long j8 = j7;
            j4 = j3;
            jA = htVar.a(j8, jD, asr.a);
        } else {
            j4 = j3;
        }
        return t.z1(tVar, (int) (jD >> 32), (int) (jD & 4294967295L), new b(yVarD2, iwo.d(jA, j4), j2, b8gVarA));
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        this.L = -9223372034707292160L;
    }

    public final ht p2() {
        if (this.D.f().d(w7g.a, w7g.b)) {
            x57 x57Var = this.H.a().c;
            if (x57Var != null) {
                return x57Var.a;
            }
            x57 x57Var2 = this.I.a().c;
            if (x57Var2 != null) {
                return x57Var2.a;
            }
            return null;
        }
        x57 x57Var3 = this.I.a().c;
        if (x57Var3 != null) {
            return x57Var3.a;
        }
        x57 x57Var4 = this.H.a().c;
        if (x57Var4 != null) {
            return x57Var4.a;
        }
        return null;
    }
}
