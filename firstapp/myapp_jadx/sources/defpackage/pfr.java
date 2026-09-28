package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class pfr implements so10.c {
    public final /* synthetic */ mfr a;

    public pfr(mfr mfrVar) {
        this.a = mfrVar;
    }

    @Override // so10.c
    public final void a(v5i0 v5i0Var) {
        Object value;
        mfr.b bVar;
        int i;
        int i2;
        v5i0Var.getClass();
        wwd0 wwd0Var = this.a.E;
        do {
            value = wwd0Var.getValue();
            bVar = (mfr.b) value;
            i = v5i0Var.a;
        } while (!wwd0Var.g(value, mfr.b.a(bVar, 0, false, false, (i <= 0 || (i2 = v5i0Var.b) <= 0) ? null : Float.valueOf((i * v5i0Var.c) / i2), 7)));
    }

    @Override // so10.c
    public final void i(bo10 bo10Var) {
        Object value;
        bo10Var.getClass();
        final mfr mfrVar = this.a;
        if (!mfrVar.N1(new Function0() { // from class: hfr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object value2;
                mfr mfrVar2 = mfrVar;
                String str = mfrVar2.S;
                if (str == null) {
                    ser serVarC1 = mfrVar2.C1();
                    str = serVarC1 != null ? serVarC1.a : null;
                }
                if (str == null) {
                    wwd0 wwd0Var = mfrVar2.C;
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                } else {
                    mfrVar2.K1(str, true);
                }
                return Unit.a;
            }
        })) {
            mfrVar.F1();
            return;
        }
        wwd0 wwd0Var = mfrVar.E;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, mfr.b.a((mfr.b) value, 2, false, false, null, 8)));
    }

    @Override // so10.c
    public final void j0(boolean z) {
        wwd0 wwd0Var = this.a.E;
        while (true) {
            Object value = wwd0Var.getValue();
            boolean z2 = z;
            if (wwd0Var.g(value, mfr.b.a((mfr.b) value, 0, z2, false, null, 13))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // so10.c
    public final void q(int i) {
        mfr mfrVar = this.a;
        if (i == 3) {
            mfrVar.M1();
        }
        wwd0 wwd0Var = mfrVar.E;
        while (true) {
            Object value = wwd0Var.getValue();
            mfr.b bVar = (mfr.b) value;
            int i2 = i;
            if (wwd0Var.g(value, mfr.b.a(bVar, i2, false, (i == 2 || i == 3) ? false : bVar.c, null, 10))) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
