package defpackage;

import androidx.compose.ui.d;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class tkm extends d.c implements hvg0, s020, yma {
    public l7f D;
    public g020 E;
    public boolean F;

    public static final class a extends qlr implements Function1<tkm, gvg0> {
        public final /* synthetic */ yp40 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yp40 yp40Var) {
            super(1);
            this.a = yp40Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final gvg0 invoke(tkm tkmVar) {
            if (!tkmVar.F) {
                return gvg0.a;
            }
            this.a.a = false;
            return gvg0.c;
        }
    }

    public tkm(g020 g020Var, l7f l7fVar) {
        this.D = l7fVar;
        this.E = g020Var;
    }

    @Override // defpackage.s020
    public final long V0() {
        if (this.D == null) {
            return w3g0.a;
        }
        mmd mmdVar = pkd.f(this).N;
        int i = w3g0.b;
        return w3g0.a.a(mmdVar.y0(10.0f), mmdVar.y0(40.0f), mmdVar.y0(10.0f), mmdVar.y0(40.0f));
    }

    @Override // defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        if (c020Var == c020.b) {
            List<m020> list = b020Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (s2(list.get(i).i)) {
                    int i2 = b020Var.e;
                    if (i2 == 4) {
                        this.F = true;
                        r2();
                        return;
                    } else {
                        if (i2 == 5) {
                            t2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        t2();
    }

    @Override // defpackage.s020
    public final void n1() {
        t2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p2() {
        g020 g020Var;
        dq40 dq40Var = new dq40();
        obl0.c(this, new ukm(1));
        tkm tkmVar = (tkm) dq40Var.a;
        if (tkmVar == null || (g020Var = tkmVar.E) == null) {
            g020Var = this.E;
        }
        q2(g020Var);
    }

    public abstract void q2(g020 g020Var);

    public final void r2() {
        yp40 yp40Var = new yp40();
        yp40Var.a = true;
        obl0.d(this, new a(yp40Var));
        if (yp40Var.a) {
            p2();
        }
    }

    public abstract boolean s2(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t2() {
        if (this.F) {
            this.F = false;
            if (this.C) {
                dq40 dq40Var = new dq40();
                obl0.c(this, new skm(dq40Var));
                tkm tkmVar = (tkm) dq40Var.a;
                if (tkmVar != null) {
                    tkmVar.p2();
                } else {
                    q2(null);
                }
            }
        }
    }
}
