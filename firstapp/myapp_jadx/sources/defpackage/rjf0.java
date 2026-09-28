package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rjf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rjf0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int[][] iArr = TextInputLayout.S0;
                ((TextInputLayout) obj).e.requestLayout();
                break;
            default:
                t0k0 t0k0Var = (t0k0) obj;
                if (t0k0Var.D == null) {
                    ej5.c(o8i0.d(t0k0Var), null, null, new b1k0(t0k0Var, null), 3);
                } else {
                    t0k0Var.J1();
                    int iOrdinal = t0k0Var.F.ordinal();
                    if (iOrdinal == 2) {
                        t0k0Var.F1();
                    } else if (iOrdinal == 4) {
                        t0k0Var.E1();
                    } else {
                        t0k0Var.D1(false);
                    }
                }
                break;
        }
    }
}
