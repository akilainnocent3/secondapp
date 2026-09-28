package defpackage;

import android.graphics.Bitmap;
import androidx.compose.runtime.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uvh0 extends ath0 {
    public final b8l b;
    public String c;
    public boolean d;
    public final mcf e;
    public Function0<Unit> f;
    public final ytw g;
    public gf4 h;
    public final ytw i;
    public long j;
    public float k;
    public float l;
    public final b m;

    public static final class a extends qlr implements Function1<ath0, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ath0 ath0Var) {
            uvh0 uvh0Var = uvh0.this;
            uvh0Var.d = true;
            uvh0Var.f.invoke();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function1<tcf, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(tcf tcfVar) {
            tcf tcfVar2 = tcfVar;
            uvh0 uvh0Var = uvh0.this;
            b8l b8lVar = uvh0Var.b;
            float f = uvh0Var.k;
            float f2 = uvh0Var.l;
            qc6.b bVarF1 = tcfVar2.F1();
            long jD = bVarF1.d();
            bVarF1.a().p();
            try {
                bVarF1.a.g(f, f2, 0L);
                b8lVar.a(tcfVar2);
                return Unit.a;
            } finally {
                hrh.a(bVarF1, jD);
            }
        }
    }

    public static final class c extends qlr implements Function0<Unit> {
        public static final c a = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            return Unit.a;
        }
    }

    public uvh0(b8l b8lVar) {
        this.b = b8lVar;
        b8lVar.i = new a();
        this.c = "";
        this.d = true;
        this.e = new mcf();
        this.f = c.a;
        this.g = m.b(null);
        this.i = m.b(new yw90(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new b();
    }

    @Override // defpackage.ath0
    public final void a(tcf tcfVar) {
        e(tcfVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    public final void e(tcf tcfVar, float f, l58 l58Var) {
        int i;
        gf4 gf4Var;
        long jCeil;
        t70 t70VarA;
        h40 h40Var;
        h40 h40VarA;
        long jC;
        l58 l58Var2;
        int i2;
        int i3;
        b8l b8lVar = this.b;
        boolean z = b8lVar.d;
        ytw ytwVar = this.g;
        if (!z || b8lVar.e == 16) {
            i = 0;
        } else {
            l58 l58Var3 = (l58) ((x5a0) ytwVar).getValue();
            m2g m2gVar = lwh0.a;
            if (!(l58Var3 instanceof gf4) ? l58Var3 == null : (i3 = ((gf4) l58Var3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(l58Var instanceof gf4) ? l58Var == null : (i2 = ((gf4) l58Var).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        mcf mcfVar = this.e;
        if (z2 || !yw90.a(this.j, tcfVar.d())) {
            if (i == 1) {
                jC = b8lVar.e;
                m2g m2gVar2 = lwh0.a;
                if (j58.d(jC) != 1.0f) {
                    jC = j58.c(1.0f, jC);
                }
                gf4Var = new gf4(jC, 5);
            } else {
                gf4Var = null;
            }
            this.h = gf4Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
            ytw ytwVar2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar2).getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar2).getValue()).a & 4294967295L));
            jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tcfVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L))))) & 4294967295L);
            asr layoutDirection = tcfVar.getLayoutDirection();
            mcfVar.c = tcfVar;
            t70VarA = mcfVar.a;
            h40Var = mcfVar.b;
            if (t70VarA != null) {
                Bitmap bitmap = t70VarA.a;
                if (h40Var != null || ((int) (jCeil >> 32)) > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || mcfVar.e != i) {
                    t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                    h40VarA = i40.a(t70VarA);
                    mcfVar.a = t70VarA;
                    mcfVar.b = h40VarA;
                    mcfVar.e = i;
                } else {
                    h40VarA = h40Var;
                }
            } else {
                t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                h40VarA = i40.a(t70VarA);
                mcfVar.a = t70VarA;
                mcfVar.b = h40VarA;
                mcfVar.e = i;
            }
            mcfVar.d = jCeil;
            qc6 qc6Var = mcfVar.f;
            qc6.a aVar = qc6Var.a;
            long jD = kc6.d(jCeil);
            mmd mmdVar = aVar.a;
            asr asrVar = aVar.b;
            lc6 lc6Var = aVar.c;
            long j = aVar.d;
            aVar.a = tcfVar;
            aVar.b = layoutDirection;
            aVar.c = h40VarA;
            aVar.d = jD;
            h40VarA.p();
            tcf.m0(qc6Var, j58.b, 0L, 0L, 0.0f, null, 0, 62);
            this.m.invoke(qc6Var);
            h40VarA.f();
            aVar.a = mmdVar;
            aVar.b = asrVar;
            aVar.c = lc6Var;
            aVar.d = j;
            t70VarA.d();
            this.d = false;
            this.j = tcfVar.d();
        } else {
            t70 t70Var = mcfVar.a;
            if (i != (t70Var != null ? t70Var.a() : 0)) {
                if (i == 1) {
                    jC = b8lVar.e;
                    m2g m2gVar3 = lwh0.a;
                    if (j58.d(jC) != 1.0f) {
                        jC = j58.c(1.0f, jC);
                    }
                    gf4Var = new gf4(jC, 5);
                } else {
                    gf4Var = null;
                }
                this.h = gf4Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                ytw ytwVar3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar3).getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) / Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar3).getValue()).a & 4294967295L));
                jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tcfVar.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L))))) & 4294967295L);
                asr layoutDirection2 = tcfVar.getLayoutDirection();
                mcfVar.c = tcfVar;
                t70VarA = mcfVar.a;
                h40Var = mcfVar.b;
                if (t70VarA != null) {
                    Bitmap bitmap2 = t70VarA.a;
                    if (h40Var != null) {
                        t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                        h40VarA = i40.a(t70VarA);
                        mcfVar.a = t70VarA;
                        mcfVar.b = h40VarA;
                        mcfVar.e = i;
                    } else {
                        t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                        h40VarA = i40.a(t70VarA);
                        mcfVar.a = t70VarA;
                        mcfVar.b = h40VarA;
                        mcfVar.e = i;
                    }
                } else {
                    t70VarA = e8n.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i, 24);
                    h40VarA = i40.a(t70VarA);
                    mcfVar.a = t70VarA;
                    mcfVar.b = h40VarA;
                    mcfVar.e = i;
                }
                mcfVar.d = jCeil;
                qc6 qc6Var2 = mcfVar.f;
                qc6.a aVar2 = qc6Var2.a;
                long jD2 = kc6.d(jCeil);
                mmd mmdVar2 = aVar2.a;
                asr asrVar2 = aVar2.b;
                lc6 lc6Var2 = aVar2.c;
                long j2 = aVar2.d;
                aVar2.a = tcfVar;
                aVar2.b = layoutDirection2;
                aVar2.c = h40VarA;
                aVar2.d = jD2;
                h40VarA.p();
                tcf.m0(qc6Var2, j58.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.invoke(qc6Var2);
                h40VarA.f();
                aVar2.a = mmdVar2;
                aVar2.b = asrVar2;
                aVar2.c = lc6Var2;
                aVar2.d = j2;
                t70VarA.d();
                this.d = false;
                this.j = tcfVar.d();
            }
        }
        if (l58Var != null) {
            l58Var2 = l58Var;
        } else {
            l58Var2 = ((l58) ((x5a0) ytwVar).getValue()) != null ? (l58) ((x5a0) ytwVar).getValue() : this.h;
        }
        t70 t70Var2 = mcfVar.a;
        if (t70Var2 == null) {
            wkn.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        tcf.J1(tcfVar, t70Var2, 0L, mcfVar.d, 0L, 0L, f, null, l58Var2, 0, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        ytw ytwVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar).getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((yw90) ((x5a0) ytwVar).getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
