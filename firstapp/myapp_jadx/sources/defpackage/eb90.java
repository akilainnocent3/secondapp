package defpackage;

import android.content.res.Configuration;
import com.sportybet.plugin.realsports.data.RTicket;

/* JADX INFO: loaded from: classes4.dex */
public final class eb90 {
    public final h940 a;
    public final zc3 b;
    public final duj0 c;

    public eb90(h940 h940Var, zc3 zc3Var, duj0 duj0Var) {
        h940Var.getClass();
        zc3Var.getClass();
        duj0Var.getClass();
        this.a = h940Var;
        this.b = zc3Var;
        this.c = duj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Configuration configuration, x1b x1bVar) {
        cb90 cb90Var;
        String str2;
        Configuration configuration2;
        lyh lyhVar;
        Object objB;
        lyh lyhVar2;
        if (x1bVar instanceof cb90) {
            cb90Var = (cb90) x1bVar;
            int i = cb90Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cb90Var.f = i - Integer.MIN_VALUE;
            } else {
                cb90Var = new cb90(this, x1bVar);
            }
        } else {
            cb90Var = new cb90(this, x1bVar);
        }
        Object objA = cb90Var.d;
        Object obj = y5b.a;
        int i2 = cb90Var.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    configuration = cb90Var.b;
                    str = cb90Var.a;
                    uj50.b(objA);
                } else {
                    if (i2 == 2) {
                        configuration2 = cb90Var.b;
                        str2 = cb90Var.a;
                        uj50.b(objA);
                        lyhVar = (lyh) objA;
                        cb90Var.a = null;
                        cb90Var.b = null;
                        cb90Var.c = lyhVar;
                        cb90Var.f = 3;
                        objB = this.c.b(str2, configuration2);
                        if (objB != obj) {
                            objA = objB;
                            lyhVar2 = lyhVar;
                        }
                        return obj;
                    }
                    if (i2 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lyhVar2 = cb90Var.c;
                    uj50.b(objA);
                }
                return new n1i(lyhVar2, (lyh) objA, new db90(3, null));
            }
            uj50.b(objA);
            h940 h940Var = this.a;
            if (h940Var.y() == null) {
                zi50.a aVar = zi50.b;
                lyh<RTicket> lyhVarQ = h940Var.q(str);
                cb90Var.a = str;
                cb90Var.b = configuration;
                cb90Var.c = null;
                cb90Var.f = 1;
                objA = s0i.a(lyhVarQ, cb90Var);
                if (objA == obj) {
                }
            } else {
                cb90Var.a = str;
                cb90Var.b = configuration;
                cb90Var.c = null;
                cb90Var.f = 2;
                objA = this.b.a(str, configuration);
                if (objA != obj) {
                    Configuration configuration3 = configuration;
                    str2 = str;
                    configuration2 = configuration3;
                    lyhVar = (lyh) objA;
                    cb90Var.a = null;
                    cb90Var.b = null;
                    cb90Var.c = lyhVar;
                    cb90Var.f = 3;
                    objB = this.c.b(str2, configuration2);
                    if (objB != obj) {
                        objA = objB;
                        lyhVar2 = lyhVar;
                        return new n1i(lyhVar2, (lyh) objA, new db90(3, null));
                    }
                }
            }
            return obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        cb90Var.a = str;
        cb90Var.b = configuration;
        cb90Var.c = null;
        cb90Var.f = 2;
        objA = this.b.a(str, configuration);
        if (objA != obj) {
            Configuration configuration4 = configuration;
            str2 = str;
            configuration2 = configuration4;
            lyhVar = (lyh) objA;
            cb90Var.a = null;
            cb90Var.b = null;
            cb90Var.c = lyhVar;
            cb90Var.f = 3;
            objB = this.c.b(str2, configuration2);
            if (objB != obj) {
                objA = objB;
                lyhVar2 = lyhVar;
                return new n1i(lyhVar2, (lyh) objA, new db90(3, null));
            }
        }
        return obj;
    }
}
