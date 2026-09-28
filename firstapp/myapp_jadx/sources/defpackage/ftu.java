package defpackage;

import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ftu extends d.c implements psr, qcf, w3i {
    public int D;
    public int E;
    public int F;
    public float G;
    public jvd0 K;
    public v6l L;
    public final ytw M;
    public final mae P;
    public final osw H = k.a(0);
    public final osw I = k.a(0);
    public final ytw J = m.b(Boolean.FALSE);
    public final ytw N = m.b(new atu());
    public final wd0<Float, ij0> O = ee0.a(0.0f);

    @c0d(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {379, 380}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c9p b;
        public final /* synthetic */ ftu c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c9p c9pVar, ftu ftuVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = c9pVar;
            this.c = ftuVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r5 == r0) goto L23;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r6)
                goto L49
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L17:
                defpackage.uj50.b(r6)
                goto L2b
            L1b:
                defpackage.uj50.b(r6)
                c9p r6 = r5.b
                if (r6 == 0) goto L2b
                r5.a = r4
                java.lang.Object r6 = r6.join(r5)
                if (r6 != r0) goto L2b
                goto L48
            L2b:
                r5.a = r3
                ftu r6 = r5.c
                int r1 = r6.D
                if (r1 > 0) goto L36
                kotlin.Unit r5 = kotlin.Unit.a
                goto L46
            L36:
                htu r1 = new htu
                r1.<init>(r6, r2)
                tth r6 = defpackage.tth.a
                java.lang.Object r5 = defpackage.ej5.d(r6, r1, r5)
                if (r5 != r0) goto L44
                goto L46
            L44:
                kotlin.Unit r5 = kotlin.Unit.a
            L46:
                if (r5 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ftu.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ftu(int i, int i2, int i3, itu ituVar, float f) {
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = f;
        this.M = m.b(ituVar);
        this.P = a6a0.b(new etu(0, ituVar, this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:16:0x0086  */
    @Override // defpackage.qcf
    public final void A(final wsr wsrVar) {
        boolean z;
        int iQ2;
        long j;
        qc6 qc6Var = wsrVar.a;
        wd0<Float, ij0> wd0Var = this.O;
        float fP2 = p2() * wd0Var.d().floatValue();
        float fP3 = p2();
        osw oswVar = this.I;
        osw oswVar2 = this.H;
        boolean z2 = fP3 != 1.0f ? wd0Var.d().floatValue() < ((float) ((u5a0) oswVar).D()) : wd0Var.d().floatValue() < ((float) ((u5a0) oswVar2).D());
        if (p2() == 1.0f) {
            if (wd0Var.d().floatValue() > (q2() + ((u5a0) oswVar2).D()) - ((u5a0) oswVar).D()) {
                z = true;
            } else {
                z = false;
            }
        } else if (wd0Var.d().floatValue() > q2()) {
            z = true;
        } else {
            z = false;
        }
        if (p2() == 1.0f) {
            iQ2 = q2() + ((u5a0) oswVar2).D();
        } else {
            iQ2 = (-((u5a0) oswVar2).D()) - q2();
        }
        float f = iQ2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qc6Var.d() & 4294967295L));
        v6l v6lVar = this.L;
        if (v6lVar != null) {
            j = 4294967295L;
            wsrVar.L((((long) ycv.b(fIntBitsToFloat)) & 4294967295L) | (((long) ((u5a0) oswVar2).D()) << 32), v6lVar, new Function1() { // from class: ctu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wsrVar.b2();
                    return Unit.a;
                }
            });
        } else {
            j = 4294967295L;
        }
        float fD = fP2 + ((u5a0) oswVar).D();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qc6Var.d() & j));
        qc6.b bVar = qc6Var.b;
        long jD = bVar.d();
        bVar.a().p();
        try {
            bVar.a.b(fP2, 0.0f, fD, fIntBitsToFloat2, 1);
            v6l v6lVar2 = this.L;
            if (v6lVar2 != null) {
                if (z2) {
                    y6l.a(wsrVar, v6lVar2);
                }
                if (z) {
                    qc6Var.b.a.i(f, 0.0f);
                    try {
                        y6l.a(wsrVar, v6lVar2);
                        qc6Var.b.a.i(-f, -0.0f);
                    } catch (Throwable th) {
                        qc6Var.b.a.i(-f, -0.0f);
                        throw th;
                    }
                }
            } else {
                if (z2) {
                    wsrVar.b2();
                }
                if (z) {
                    qc6Var.b.a.i(f, 0.0f);
                    try {
                        wsrVar.b2();
                        qc6Var.b.a.i(-f, -0.0f);
                    } catch (Throwable th2) {
                        qc6Var.b.a.i(-f, -0.0f);
                        throw th2;
                    }
                }
            }
            hrh.a(bVar, jD);
        } catch (Throwable th3) {
            hrh.a(bVar, jD);
            throw th3;
        }
    }

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.b0(i);
    }

    @Override // defpackage.w3i
    public final void E1(j5i j5iVar) {
        ((x5a0) this.J).setValue(Boolean.valueOf(j5iVar.b()));
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(kxa.b(0, Reader.READ_DONE, 0, 0, 13, j));
        int iG = oxa.g(yVarD0.a, j);
        u5a0 u5a0Var = (u5a0) this.I;
        u5a0Var.k(iG);
        ((u5a0) this.H).k(yVarD0.a);
        return t.z1(tVar, u5a0Var.D(), yVarD0.b, new Function1() { // from class: dtu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                ftu ftuVar = this;
                y.a.J(aVar, yVarD0, ycv.b(ftuVar.p2() * (-ftuVar.O.d().floatValue())), 0, null, 12);
                return Unit.a;
            }
        });
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        v6l v6lVar = this.L;
        t6l graphicsContext = pkd.g(this).getGraphicsContext();
        if (v6lVar != null) {
            graphicsContext.a(v6lVar);
        }
        this.L = graphicsContext.c();
        r2();
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        jvd0 jvd0Var = this.K;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.K = null;
        v6l v6lVar = this.L;
        if (v6lVar != null) {
            pkd.g(this).getGraphicsContext().a(v6lVar);
            this.L = null;
        }
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        return 0;
    }

    public final float p2() {
        float fSignum = Math.signum(this.G);
        int iOrdinal = pkd.f(this).O.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                uhc.a();
                return 0.0f;
            }
            i = -1;
        }
        return fSignum * i;
    }

    public final int q2() {
        return ((Number) this.P.getValue()).intValue();
    }

    public final void r2() {
        jvd0 jvd0Var = this.K;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        if (this.C) {
            this.K = ej5.c(d2(), null, null, new a(jvd0Var, this, null), 3);
        }
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.x(Reader.READ_DONE);
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        return mzoVar.R(Reader.READ_DONE);
    }
}
