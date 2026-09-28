package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zhh0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[phh0.values().length];
            try {
                phh0 phh0Var = phh0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                phh0 phh0Var2 = phh0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static yhh0 a(whh0 whh0Var) {
        zuy zuyVar;
        avy avyVar;
        Set<phh0> set = whh0Var != null ? whh0Var.c : null;
        if (set == null) {
            set = t3g.a;
        }
        phh0 phh0Var = phh0.a;
        if (set.contains(phh0Var) && set.contains(phh0.b)) {
            zuyVar = zuy.b;
        } else if (set.contains(phh0Var)) {
            zuyVar = zuy.c;
        } else {
            zuyVar = set.contains(phh0.b) ? zuy.d : zuy.a;
        }
        phh0 phh0Var2 = whh0Var != null ? whh0Var.b : null;
        int i = phh0Var2 == null ? -1 : a.a[phh0Var2.ordinal()];
        if (i == -1) {
            avyVar = avy.c;
        } else if (i == 1) {
            avyVar = avy.a;
        } else {
            if (i != 2) {
                uhc.a();
                return null;
            }
            avyVar = avy.b;
        }
        return new yhh0(zuyVar, avyVar);
    }
}
