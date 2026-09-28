package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx90 {
    public String a;
    public ly90 e;
    public final mw0<mh4> b = new mw0<>();
    public final mw0<h1a0> c = new mw0<>();
    public final mw0<ly90> d = new mw0<>();
    public final mw0<hng> f = new mw0<>();
    public final mw0<lh0> g = new mw0<>();
    public final mw0<q7n> h = new mw0<>();
    public final mw0<esg0> i = new mw0<>();
    public final mw0<ixz> j = new mw0<>();
    public final mw0<ft00> k = new mw0<>();
    public float l = 100.0f;

    public final lh0 a(String str) {
        if (str == null) {
            hb5.a("animationName cannot be null.");
            return null;
        }
        mw0<lh0> mw0Var = this.g;
        lh0[] lh0VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            lh0 lh0Var = lh0VarArr[i2];
            if (lh0Var.a.equals(str)) {
                return lh0Var;
            }
        }
        return null;
    }

    public final mh4 b(String str) {
        if (str == null) {
            hb5.a("boneName cannot be null.");
            return null;
        }
        mw0<mh4> mw0Var = this.b;
        mh4[] mh4VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            mh4 mh4Var = mh4VarArr[i2];
            if (mh4Var.b.equals(str)) {
                return mh4Var;
            }
        }
        return null;
    }

    public final q7n c(String str) {
        if (str == null) {
            hb5.a("constraintName cannot be null.");
            return null;
        }
        mw0<q7n> mw0Var = this.h;
        q7n[] q7nVarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            q7n q7nVar = q7nVarArr[i2];
            if (q7nVar.a.equals(str)) {
                return q7nVar;
            }
        }
        return null;
    }

    public final ixz d(String str) {
        if (str == null) {
            hb5.a("constraintName cannot be null.");
            return null;
        }
        mw0<ixz> mw0Var = this.j;
        ixz[] ixzVarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ixz ixzVar = ixzVarArr[i2];
            if (ixzVar.a.equals(str)) {
                return ixzVar;
            }
        }
        return null;
    }

    public final ft00 e(String str) {
        if (str == null) {
            hb5.a("constraintName cannot be null.");
            return null;
        }
        mw0<ft00> mw0Var = this.k;
        ft00[] ft00VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ft00 ft00Var = ft00VarArr[i2];
            if (ft00Var.a.equals(str)) {
                return ft00Var;
            }
        }
        return null;
    }

    public final ly90 f(String str) {
        if (str == null) {
            hb5.a("skinName cannot be null.");
            return null;
        }
        mw0.b<ly90> it = this.d.iterator();
        while (it.hasNext()) {
            ly90 next = it.next();
            if (next.a.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final h1a0 g(String str) {
        if (str == null) {
            hb5.a("slotName cannot be null.");
            return null;
        }
        mw0<h1a0> mw0Var = this.c;
        h1a0[] h1a0VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            h1a0 h1a0Var = h1a0VarArr[i2];
            if (h1a0Var.b.equals(str)) {
                return h1a0Var;
            }
        }
        return null;
    }

    public final esg0 h(String str) {
        if (str == null) {
            hb5.a("constraintName cannot be null.");
            return null;
        }
        mw0<esg0> mw0Var = this.i;
        esg0[] esg0VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            esg0 esg0Var = esg0VarArr[i2];
            if (esg0Var.a.equals(str)) {
                return esg0Var;
            }
        }
        return null;
    }

    public final String toString() {
        String str = this.a;
        return str != null ? str : super.toString();
    }
}
