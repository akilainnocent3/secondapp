package defpackage;

import android.content.Context;
import com.sporty.android.core.model.service.CountryCodeName;

/* JADX INFO: loaded from: classes5.dex */
public final class f4j0 {
    public final x9k a;
    public final yqm b;
    public final psm c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public f4j0(x9k x9kVar, yqm yqmVar, psm psmVar) {
        yqmVar.getClass();
        psmVar.getClass();
        this.a = x9kVar;
        this.b = yqmVar;
        this.c = psmVar;
    }

    public static String b(int i) {
        Context contextJ = yrh0.j();
        contextJ.getClass();
        return sn5.b(contextJ, i, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        g4j0 g4j0Var;
        i4j0 i4j0Var;
        if (x1bVar instanceof g4j0) {
            g4j0Var = (g4j0) x1bVar;
            int i = g4j0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g4j0Var.c = i - Integer.MIN_VALUE;
            } else {
                g4j0Var = new g4j0(this, x1bVar);
            }
        } else {
            g4j0Var = new g4j0(this, x1bVar);
        }
        Object objA = g4j0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = g4j0Var.c;
        x66<i4j0> x66Var = null;
        if (i2 == 0) {
            uj50.b(objA);
            int i3 = a.a[this.c.getCountryCode().ordinal()];
            if (i3 == 1) {
                x66Var = z76.g;
            } else if (i3 == 2) {
                x66Var = z76.h;
            } else if (i3 == 3) {
                x66Var = z76.i;
            }
            if (x66Var != null) {
                yl50 yl50Var = new yl50(new sl50(this.b.j(x66Var)), i4j0.Hidden);
                g4j0Var.c = 1;
                objA = s0i.a(yl50Var, g4j0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                i4j0Var = i4j0.Show;
            }
            return Boolean.valueOf(i4j0Var == i4j0.Show);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        i4j0Var = (i4j0) objA;
        if (i4j0Var == null) {
            i4j0Var = i4j0.Show;
        }
        return Boolean.valueOf(i4j0Var == i4j0.Show);
    }
}
