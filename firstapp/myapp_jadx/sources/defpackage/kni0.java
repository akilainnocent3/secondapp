package defpackage;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public abstract class kni0 implements xr, g580 {
    public static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int k(bug0 bug0Var, int i) {
        int[] iArr;
        if (bug0Var == null || (iArr = (int[]) bug0Var.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    public static boolean l() {
        return iu2.p() && iu2.a.j().u0();
    }

    public static boolean m() {
        return iu2.p() && iu2.l();
    }

    @Override // defpackage.g580
    public int a(int i) {
        int iN = n(i);
        if (iN == -1 || n(iN) == -1) {
            return -1;
        }
        return iN;
    }

    @Override // defpackage.g580
    public int c(int i) {
        return o(i);
    }

    @Override // defpackage.g580
    public int d(int i) {
        return n(i);
    }

    @Override // defpackage.g580
    public int e(int i) {
        int iO = o(i);
        if (iO == -1 || o(iO) == -1) {
            return -1;
        }
        return iO;
    }

    public abstract boolean f(String str);

    public abstract boolean g(i3w i3wVar);

    public abstract Object h(String str);

    public abstract Object i(i3w i3wVar);

    public abstract long j(ViewGroup viewGroup, Transition transition, bug0 bug0Var, bug0 bug0Var2);

    public abstract int n(int i);

    public abstract int o(int i);
}
