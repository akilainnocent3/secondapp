package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class s3o {
    public final e3o a;
    public final uqm b;
    public final mgb0 c;
    public boolean e;
    public final wwd0 d = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public final wwd0 f = xwd0.a(t3o.b.a);

    public s3o(e3o e3oVar, uqm uqmVar, mgb0 mgb0Var) {
        this.a = e3oVar;
        this.b = uqmVar;
        this.c = mgb0Var;
    }

    public final fun a(String str) {
        rtn rtnVar = (rtn) CollectionsKt.firstOrNull(b());
        Object obj = null;
        List<fun> list = rtnVar != null ? rtnVar.e : null;
        if (list == null) {
            return null;
        }
        loop0: for (Object obj2 : list) {
            List<gun> list2 = ((fun) obj2).h;
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((gun) it.next()).a.equals(str)) {
                        obj = obj2;
                        break loop0;
                    }
                }
            }
        }
        return (fun) obj;
    }

    public final List<rtn> b() {
        Object value = this.f.getValue();
        t3o.c cVar = value instanceof t3o.c ? (t3o.c) value : null;
        l3o l3oVar = cVar != null ? cVar.a : null;
        List<rtn> list = l3oVar != null ? l3oVar.d : null;
        return list == null ? m2g.a : list;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[LOOP:2: B:36:0x009c->B:74:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[LOOP:1: B:57:0x0102->B:72:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:61:0x011c A[LOOP:3: B:61:0x011c->B:76:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        n3o n3oVar;
        Object objC;
        Object value;
        Object objD;
        Object value2;
        Throwable thA;
        Object value3;
        d4o d4oVar;
        own ownVar;
        String str2;
        Object objB;
        Object obj;
        d4o d4oVar2;
        Object value4;
        Throwable thA2;
        Object value5;
        dun dunVar;
        Object value6;
        if (x1bVar instanceof n3o) {
            n3oVar = (n3o) x1bVar;
            int i = n3oVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                n3oVar.e = i - Integer.MIN_VALUE;
            } else {
                n3oVar = new n3o(this, x1bVar);
            }
        } else {
            n3oVar = new n3o(this, x1bVar);
        }
        Object obj2 = n3oVar.c;
        y5b y5bVar = y5b.a;
        int i2 = n3oVar.e;
        e3o e3oVar = this.a;
        wwd0 wwd0Var = this.f;
        if (i2 == 0) {
            uj50.b(obj2);
            n3oVar.a = str;
            n3oVar.e = 1;
            objC = e3oVar.c(n3oVar);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            str = n3oVar.a;
            uj50.b(obj2);
            objC = ((zi50) obj2).a;
        } else {
            if (i2 == 2) {
                str = n3oVar.a;
                uj50.b(obj2);
                objD = ((zi50) obj2).a;
                thA = zi50.a(objD);
                if (thA == null) {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, new t3o.a(new m3o.a(thA))));
                    return Unit.a;
                }
                d4oVar = (d4o) objD;
                if (!d4oVar.a) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, new t3o.a(m3o.c.a)));
                    return Unit.a;
                }
                ownVar = (own) CollectionsKt.firstOrNull(d4oVar.j);
                if (ownVar != null) {
                    str2 = ownVar.a;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                boolean z = this.e;
                n3oVar.a = null;
                n3oVar.b = d4oVar;
                n3oVar.e = 3;
                objB = e3oVar.b(str, str2, z, n3oVar);
                if (objB != y5bVar) {
                    obj = objB;
                    d4oVar2 = d4oVar;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d4oVar2 = n3oVar.b;
            uj50.b(obj2);
            obj = ((zi50) obj2).a;
        }
        thA2 = zi50.a(obj);
        if (thA2 == null) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, new t3o.a(new m3o.a(thA2))));
            return Unit.a;
        }
        dunVar = (dun) obj;
        this.e = false;
        do {
            value6 = wwd0Var.getValue();
        } while (!wwd0Var.g(value6, new t3o.c(new l3o(d4oVar2, dunVar.a, dunVar.b, dunVar.c))));
        return Unit.a;
        Throwable thA3 = zi50.a(objC);
        if (thA3 != null) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new t3o.a(new m3o.a(thA3))));
            return Unit.a;
        }
        if (!((nzn) objC).a) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new t3o.a(m3o.b.a)));
            return Unit.a;
        }
        n3oVar.a = str;
        n3oVar.e = 2;
        objD = e3oVar.d(str, n3oVar);
        if (objD != y5bVar) {
            thA = zi50.a(objD);
            if (thA == null) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, new t3o.a(new m3o.a(thA))));
                return Unit.a;
            }
            d4oVar = (d4o) objD;
            if (!d4oVar.a) {
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, new t3o.a(m3o.c.a)));
                return Unit.a;
            }
            ownVar = (own) CollectionsKt.firstOrNull(d4oVar.j);
            if (ownVar != null) {
                str2 = ownVar.a;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            boolean z2 = this.e;
            n3oVar.a = null;
            n3oVar.b = d4oVar;
            n3oVar.e = 3;
            objB = e3oVar.b(str, str2, z2, n3oVar);
            if (objB != y5bVar) {
                obj = objB;
                d4oVar2 = d4oVar;
                thA2 = zi50.a(obj);
                if (thA2 == null) {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, new t3o.a(new m3o.a(thA2))));
                    return Unit.a;
                }
                dunVar = (dun) obj;
                this.e = false;
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, new t3o.c(new l3o(d4oVar2, dunVar.a, dunVar.b, dunVar.c))));
                return Unit.a;
            }
        }
        return y5bVar;
    }

    public final void d() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            ((Number) value).longValue();
        } while (!wwd0Var.g(value, Long.valueOf(System.currentTimeMillis())));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(AccountInfo accountInfo, x1b x1bVar) {
        r3o r3oVar;
        if (x1bVar instanceof r3o) {
            r3oVar = (r3o) x1bVar;
            int i = r3oVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r3oVar.c = i - Integer.MIN_VALUE;
            } else {
                r3oVar = new r3o(this, x1bVar);
            }
        } else {
            r3oVar = new r3o(this, x1bVar);
        }
        Object obj = r3oVar.a;
        y5b y5bVar = y5b.a;
        int i2 = r3oVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            if (accountInfo == null) {
                return Unit.a;
            }
            String lastAccessToken = this.b.getLastAccessToken();
            if (lastAccessToken == null || lastAccessToken.length() == 0) {
                return Unit.a;
            }
            r3oVar.c = 1;
            if (this.a.g(lastAccessToken, r3oVar) == y5bVar) {
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
