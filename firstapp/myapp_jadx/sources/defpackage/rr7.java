package defpackage;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rr7 extends g2 {
    public m020 Z;

    @Override // defpackage.g2
    public final void A2(KeyEvent keyEvent) {
        this.L.invoke();
    }

    @Override // defpackage.g2, defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        rr7 rr7Var;
        super.W(b020Var, c020Var, j);
        int i = 0;
        if (c020Var != c020.b) {
            if (c020Var != c020.c || this.Z == null) {
                return;
            }
            List<m020> list = b020Var.a;
            int size = list.size();
            while (i < size) {
                m020 m020Var = list.get(i);
                if (m020Var.b() && m020Var != this.Z) {
                    this.Z = null;
                    w2();
                    return;
                }
                i++;
            }
            return;
        }
        m020 m020Var2 = this.Z;
        if (m020Var2 == null) {
            if (u4f0.e(b020Var, true)) {
                m020 m020Var3 = b020Var.a.get(0);
                m020Var3.a();
                this.Z = m020Var3;
                if (this.K) {
                    long j2 = m020Var3.c;
                    psw pswVar = this.F;
                    if (pswVar != null) {
                        mp20.b bVar = new mp20.b(j2);
                        if (u2()) {
                            this.W = ej5.c(d2(), null, null, new m2(pswVar, bVar, this, null), 3);
                            return;
                        } else {
                            this.Q = bVar;
                            ej5.c(d2(), null, null, new n2(null, pswVar, bVar), 3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        List<m020> list2 = b020Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!ovo.d(list2.get(i2))) {
                long jU1 = pkd.f(this).N.U1(((z6i0) zma.a(this, kna.s)).f());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jU1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jU1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                while (i < size3) {
                    m020 m020Var4 = list2.get(i);
                    if (m020Var4.b() || ovo.f(m020Var4, j, jFloatToRawIntBits)) {
                        this.Z = null;
                        w2();
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        list2.get(0).a();
        if (this.K) {
            long j3 = m020Var2.c;
            psw pswVar2 = this.F;
            if (pswVar2 != null) {
                jvd0 jvd0Var = this.W;
                if (jvd0Var == null || !jvd0Var.isActive()) {
                    rr7Var = this;
                    mp20.b bVar2 = rr7Var.Q;
                    if (bVar2 != null) {
                        ej5.c(rr7Var.d2(), null, null, new l2(null, pswVar2, bVar2), 3);
                    }
                } else {
                    rr7Var = this;
                    ej5.c(d2(), null, null, new k2(rr7Var, j3, pswVar2, null), 3);
                }
                rr7Var.Q = null;
            } else {
                rr7Var = this;
            }
            rr7Var.L.invoke();
        } else {
            rr7Var = this;
        }
        rr7Var.Z = null;
    }

    @Override // defpackage.g2, defpackage.s020
    public final void n1() {
        super.n1();
        if (this.Z != null) {
            this.Z = null;
            w2();
        }
    }

    @Override // defpackage.g2
    public final yje0 t2() {
        return null;
    }

    @Override // defpackage.g2
    public final boolean z2(KeyEvent keyEvent) {
        return false;
    }
}
