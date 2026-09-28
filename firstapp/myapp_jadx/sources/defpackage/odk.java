package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

/* JADX INFO: loaded from: classes2.dex */
public final class odk {
    public final lx70 a;

    public odk(lx70 lx70Var) {
        this.a = lx70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        ndk ndkVar;
        if (x1bVar instanceof ndk) {
            ndkVar = (ndk) x1bVar;
            int i = ndkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndkVar.c = i - Integer.MIN_VALUE;
            } else {
                ndkVar = new ndk(this, x1bVar);
            }
        } else {
            ndkVar = new ndk(this, x1bVar);
        }
        Object obj = ndkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ndkVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            ndkVar.c = 1;
            Object objB = this.a.b(str, ndkVar);
            return objB == y5bVar ? y5bVar : objB;
        }
        if (i2 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a(LGxrN.TsUDYPMJX);
        return null;
    }
}
