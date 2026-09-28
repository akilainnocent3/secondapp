package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b8l extends ath0 {
    public float[] b;
    public j90 h;
    public Function1<? super ath0, Unit> i;
    public float l;
    public float m;
    public float n;
    public float q;
    public float r;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = j58.m;
    public List<? extends qxz> f = lwh0.a;
    public boolean g = true;
    public final a j = new a();
    public String k = "";
    public float o = 1.0f;
    public float p = 1.0f;
    public boolean s = true;

    public static final class a extends qlr implements Function1<ath0, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ath0 ath0Var) {
            ath0 ath0Var2 = ath0Var;
            b8l b8lVar = b8l.this;
            b8lVar.g(ath0Var2);
            Function1<? super ath0, Unit> function1 = b8lVar.i;
            if (function1 != null) {
                function1.invoke(ath0Var2);
            }
            return Unit.a;
        }
    }

    @Override // defpackage.ath0
    public final void a(tcf tcfVar) {
        if (this.s) {
            float[] fArrA = this.b;
            if (fArrA == null) {
                fArrA = ddv.a();
                this.b = fArrA;
            } else {
                ddv.d(fArrA);
            }
            ddv.h(fArrA, this.q + this.m, this.r + this.n);
            ddv.f(this.l, fArrA);
            float f = this.o;
            float f2 = this.p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f;
                fArrA[1] = fArrA[1] * f;
                fArrA[2] = fArrA[2] * f;
                fArrA[3] = fArrA[3] * f;
                fArrA[4] = fArrA[4] * f2;
                fArrA[5] = fArrA[5] * f2;
                fArrA[6] = fArrA[6] * f2;
                fArrA[7] = fArrA[7] * f2;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            ddv.h(fArrA, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                j90 j90VarA = this.h;
                if (j90VarA == null) {
                    j90VarA = m90.a();
                    this.h = j90VarA;
                }
                uxz.b(this.f, j90VarA);
            }
            this.g = false;
        }
        qc6.b bVarF1 = tcfVar.F1();
        long jD = bVarF1.d();
        bVarF1.a().p();
        try {
            rc6 rc6Var = bVarF1.a;
            float[] fArr = this.b;
            if (fArr != null) {
                rc6Var.h(fArr);
            }
            j90 j90Var = this.h;
            if (!this.f.isEmpty() && j90Var != null) {
                rc6Var.a(j90Var, 1);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ath0) arrayList.get(i)).a(tcfVar);
            }
        } finally {
            hrh.a(bVarF1, jD);
        }
    }

    @Override // defpackage.ath0
    public final Function1<ath0, Unit> b() {
        return this.i;
    }

    @Override // defpackage.ath0
    public final void d(a aVar) {
        this.i = aVar;
    }

    public final void e(int i, ath0 ath0Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, ath0Var);
        } else {
            arrayList.add(ath0Var);
        }
        g(ath0Var);
        ath0Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            m2g m2gVar = lwh0.a;
            if (j58.h(j2) == j58.h(j) && j58.g(j2) == j58.g(j) && j58.e(j2) == j58.e(j)) {
                return;
            }
            this.d = false;
            this.e = j58.m;
        }
    }

    public final void g(ath0 ath0Var) {
        if (!(ath0Var instanceof gxz)) {
            if (ath0Var instanceof b8l) {
                b8l b8lVar = (b8l) ath0Var;
                if (b8lVar.d && this.d) {
                    f(b8lVar.e);
                    return;
                } else {
                    this.d = false;
                    this.e = j58.m;
                    return;
                }
            }
            return;
        }
        gxz gxzVar = (gxz) ath0Var;
        ya5 ya5Var = gxzVar.b;
        if (this.d && ya5Var != null) {
            if (ya5Var instanceof soa0) {
                f(((soa0) ya5Var).b);
            } else {
                this.d = false;
                this.e = j58.m;
            }
        }
        ya5 ya5Var2 = gxzVar.g;
        if (this.d && ya5Var2 != null) {
            if (ya5Var2 instanceof soa0) {
                f(((soa0) ya5Var2).b);
            } else {
                this.d = false;
                this.e = j58.m;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ath0 ath0Var = (ath0) arrayList.get(i);
            sb.append("\t");
            sb.append(ath0Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
