package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class p1d0 {
    public final yzc0 a;
    public final uqm b;
    public final mgb0 c;
    public boolean e;
    public final wwd0 d = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public final wwd0 f = xwd0.a(q1d0.b.a);

    public p1d0(yzc0 yzc0Var, uqm uqmVar, mgb0 mgb0Var) {
        this.a = yzc0Var;
        this.b = uqmVar;
        this.c = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[LOOP:2: B:36:0x009c->B:68:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[LOOP:1: B:51:0x00f1->B:66:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:55:0x010b A[LOOP:3: B:55:0x010b->B:70:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        k1d0 k1d0Var;
        Object objC;
        Object value;
        Object objD;
        Object value2;
        Throwable thA;
        Object value3;
        k4d0 k4d0Var;
        Object objB;
        k4d0 k4d0Var2;
        Object obj;
        Object value4;
        Throwable thA2;
        Object value5;
        kwc0 kwc0Var;
        Object value6;
        if (x1bVar instanceof k1d0) {
            k1d0Var = (k1d0) x1bVar;
            int i = k1d0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k1d0Var.e = i - Integer.MIN_VALUE;
            } else {
                k1d0Var = new k1d0(this, x1bVar);
            }
        } else {
            k1d0Var = new k1d0(this, x1bVar);
        }
        Object obj2 = k1d0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = k1d0Var.e;
        yzc0 yzc0Var = this.a;
        wwd0 wwd0Var = this.f;
        if (i2 == 0) {
            uj50.b(obj2);
            k1d0Var.a = str;
            k1d0Var.e = 1;
            objC = yzc0Var.c(k1d0Var);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            str = k1d0Var.a;
            uj50.b(obj2);
            objC = ((zi50) obj2).a;
        } else {
            if (i2 == 2) {
                str = k1d0Var.a;
                uj50.b(obj2);
                objD = ((zi50) obj2).a;
                thA = zi50.a(objD);
                if (thA == null) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, new q1d0.a(new j1d0.a(thA))));
                    return Unit.a;
                }
                k4d0Var = (k4d0) objD;
                if (!k4d0Var.a) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, new q1d0.a(j1d0.c.a)));
                    return Unit.a;
                }
                boolean z = this.e;
                k1d0Var.a = null;
                k1d0Var.b = k4d0Var;
                k1d0Var.e = 3;
                objB = yzc0Var.b(str, z, k1d0Var);
                if (objB != y5bVar) {
                    k4d0Var2 = k4d0Var;
                    obj = objB;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k4d0 k4d0Var3 = k1d0Var.b;
            uj50.b(obj2);
            obj = ((zi50) obj2).a;
            k4d0Var2 = k4d0Var3;
        }
        thA2 = zi50.a(obj);
        if (thA2 == null) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, new q1d0.a(new j1d0.a(thA2))));
            return Unit.a;
        }
        kwc0Var = (kwc0) obj;
        this.e = false;
        do {
            value6 = wwd0Var.getValue();
        } while (!wwd0Var.g(value6, new q1d0.c(new i1d0(k4d0Var2, k4d0Var2.e, kwc0Var.a, kwc0Var.b, kwc0Var.c))));
        return Unit.a;
        Throwable thA3 = zi50.a(objC);
        if (thA3 != null) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new q1d0.a(new j1d0.a(thA3))));
            return Unit.a;
        }
        if (!((izc0) objC).a) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new q1d0.a(j1d0.b.a)));
            return Unit.a;
        }
        k1d0Var.a = str;
        k1d0Var.e = 2;
        objD = yzc0Var.d(str, k1d0Var);
        if (objD != y5bVar) {
            thA = zi50.a(objD);
            if (thA == null) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, new q1d0.a(new j1d0.a(thA))));
                return Unit.a;
            }
            k4d0Var = (k4d0) objD;
            if (!k4d0Var.a) {
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, new q1d0.a(j1d0.c.a)));
                return Unit.a;
            }
            boolean z2 = this.e;
            k1d0Var.a = null;
            k1d0Var.b = k4d0Var;
            k1d0Var.e = 3;
            objB = yzc0Var.b(str, z2, k1d0Var);
            if (objB != y5bVar) {
                k4d0Var2 = k4d0Var;
                obj = objB;
                thA2 = zi50.a(obj);
                if (thA2 == null) {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new q1d0.a(new j1d0.a(thA2))));
                    return Unit.a;
                }
                kwc0Var = (kwc0) obj;
                this.e = false;
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, new q1d0.c(new i1d0(k4d0Var2, k4d0Var2.e, kwc0Var.a, kwc0Var.b, kwc0Var.c))));
                return Unit.a;
            }
        }
        return y5bVar;
    }

    public final void b() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            ((Number) value).longValue();
        } while (!wwd0Var.g(value, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(AccountInfo accountInfo, x1b x1bVar) {
        o1d0 o1d0Var;
        if (x1bVar instanceof o1d0) {
            o1d0Var = (o1d0) x1bVar;
            int i = o1d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o1d0Var.c = i - Integer.MIN_VALUE;
            } else {
                o1d0Var = new o1d0(this, x1bVar);
            }
        } else {
            o1d0Var = new o1d0(this, x1bVar);
        }
        Object obj = o1d0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = o1d0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (accountInfo == null) {
                return Unit.a;
            }
            String lastAccessToken = this.b.getLastAccessToken();
            if (lastAccessToken == null || lastAccessToken.length() == 0) {
                return Unit.a;
            }
            o1d0Var.c = 1;
            if (this.a.g(lastAccessToken, o1d0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        return Unit.a;
    }
}
