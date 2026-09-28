package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class ct70 implements qqa0 {
    public final String a;
    public final oso b;
    public final cjg0 c;
    public final ara0 d;
    public m0b e;
    public q21 g;
    public wqa0 f = wqa0.a;
    public long h = 0;

    public ct70(String str, oso osoVar, cjg0 cjg0Var, ara0 ara0Var) {
        this.a = str;
        this.b = osoVar;
        this.c = cjg0Var;
        this.d = ara0Var;
    }

    @Override // defpackage.qqa0
    /* JADX INFO: renamed from: a */
    public <T> qqa0 f(e21<T> e21Var, T t) {
        if (e21Var != null && !e21Var.getKey().isEmpty() && t != null) {
            q21 q21Var = this.g;
            if (q21Var == null) {
                ara0 ara0Var = this.d;
                q21 q21Var2 = new q21(ara0Var.b(), ara0Var.a());
                this.g = q21Var2;
                q21Var = q21Var2;
            }
            q21Var.put(e21Var, t);
        }
        return this;
    }

    @Override // defpackage.qqa0
    public final oqa0 b() {
        long jNextLong;
        String str;
        long j;
        String strC;
        ui1 ui1Var;
        Runnable iw5Var;
        p00 p00Var;
        boolean z;
        long jNextLong2;
        m0b m0bVarCurrent = this.e;
        if (m0bVarCurrent == null) {
            m0bVarCurrent = m0b.current();
        }
        m0b m0bVar = m0bVarCurrent;
        oqa0 oqa0VarI = oqa0.i(m0bVar);
        ui1 ui1VarB = oqa0VarI.b();
        cjg0 cjg0Var = this.c;
        cjg0Var.getClass();
        tx30 tx30Var = tx30.a;
        Random random = tx30.b.get();
        do {
            jNextLong = random.nextLong();
        } while (jNextLong == 0);
        if (jNextLong == 0) {
            str = "0000000000000000";
        } else {
            char[] cArrA = pcf0.a(16);
            l3z.d(jNextLong, cArrA, 0);
            str = new String(cArrA, 0, 16);
        }
        if (ui1VarB.f()) {
            j = 0;
            strC = ui1VarB.c();
        } else {
            Random random2 = tx30.b.get();
            long jNextLong3 = random2.nextLong();
            j = 0;
            do {
                jNextLong2 = random2.nextLong();
            } while (jNextLong2 == 0);
            if (jNextLong3 == 0 && jNextLong2 == 0) {
                strC = "00000000000000000000000000000000";
            } else {
                char[] cArrA2 = pcf0.a(32);
                l3z.d(jNextLong3, cArrA2, 0);
                l3z.d(jNextLong2, cArrA2, 16);
                strC = new String(cArrA2, 0, 32);
            }
        }
        String str2 = strC;
        List<sfs> list = Collections.EMPTY_LIST;
        m21 m21Var = this.g;
        if (m21Var == null) {
            m21Var = vw0.d;
        }
        m21 m21Var2 = m21Var;
        ss60 ss60Var = cjg0Var.d;
        wqa0 wqa0Var = this.f;
        String str3 = this.a;
        String str4 = str;
        ti1 ti1VarB = ss60Var.b(m0bVar, str2, str3, wqa0Var, m21Var2, list);
        us60 us60VarB = ti1VarB.b();
        hg1 hg1VarD = ui1VarB.d();
        us60 us60Var = us60.c;
        wcn wcnVar = us60Var.equals(us60VarB) ? wcn.d : wcn.c;
        if (cjg0Var.b) {
            ui1Var = new ui1(str2, str4, wcnVar, hg1VarD, true);
        } else {
            if (str4.length() == 16 && !"0000000000000000".contentEquals(str4)) {
                char[] cArr = l3z.a;
                int length = str4.length();
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (l3z.c[str4.charAt(i)]) {
                            i++;
                        }
                    } else if (str2 != null && str2.length() == 32 && !"00000000000000000000000000000000".contentEquals(str2)) {
                        int length2 = str2.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                if (l3z.c[str2.charAt(i2)]) {
                                    i2++;
                                }
                            } else {
                                ui1Var = new ui1(str2, str4, wcnVar, hg1VarD, true);
                            }
                        }
                    }
                }
            }
            ui1Var = new ui1("00000000000000000000000000000000", "0000000000000000", wcnVar, hg1VarD, false);
        }
        ui1 ui1Var2 = ui1Var;
        final ht70 ht70Var = cjg0Var.g;
        vw0 vw0Var = ht70.n;
        vw0 vw0Var2 = ht70.o;
        if (!ui1VarB.f()) {
            int iOrdinal = us60VarB.ordinal();
            if (iOrdinal == 0) {
                ht70Var.b().a(1L, ht70.e);
                iw5Var = new iw5();
            } else if (iOrdinal == 1) {
                ht70Var.b().a(1L, ht70.f);
                ht70Var.a().a(1L, vw0Var);
                iw5Var = new Runnable() { // from class: ft70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.n);
                    }
                };
            } else {
                if (iOrdinal != 2) {
                    z9l.a(us60VarB, "Unrecognized sampling decision: ");
                    return null;
                }
                ht70Var.b().a(1L, ht70.g);
                ht70Var.a().a(1L, vw0Var2);
                iw5Var = new Runnable() { // from class: gt70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.o);
                    }
                };
            }
        } else if (ui1VarB.e()) {
            int iOrdinal2 = us60VarB.ordinal();
            if (iOrdinal2 == 0) {
                ht70Var.b().a(1L, ht70.h);
                iw5Var = new iw5();
            } else if (iOrdinal2 == 1) {
                ht70Var.b().a(1L, ht70.i);
                ht70Var.a().a(1L, vw0Var);
                iw5Var = new Runnable() { // from class: ft70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.n);
                    }
                };
            } else {
                if (iOrdinal2 != 2) {
                    z9l.a(us60VarB, "Unrecognized sampling decision: ");
                    return null;
                }
                ht70Var.b().a(1L, ht70.j);
                ht70Var.a().a(1L, vw0Var2);
                iw5Var = new Runnable() { // from class: gt70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.o);
                    }
                };
            }
        } else {
            int iOrdinal3 = us60VarB.ordinal();
            if (iOrdinal3 == 0) {
                ht70Var.b().a(1L, ht70.k);
                iw5Var = new iw5();
            } else if (iOrdinal3 == 1) {
                ht70Var.b().a(1L, ht70.l);
                ht70Var.a().a(1L, vw0Var);
                iw5Var = new Runnable() { // from class: ft70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.n);
                    }
                };
            } else {
                if (iOrdinal3 != 2) {
                    z9l.a(us60VarB, "Unrecognized sampling decision: ");
                    return null;
                }
                ht70Var.b().a(1L, ht70.m);
                ht70Var.a().a(1L, vw0Var2);
                iw5Var = new Runnable() { // from class: gt70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ht70Var.a().a(-1L, ht70.o);
                    }
                };
            }
        }
        Runnable runnable = iw5Var;
        if (!us60.b.equals(us60VarB) && !us60Var.equals(us60VarB)) {
            return new z530(ui1Var2);
        }
        m21 m21VarA = ti1VarB.a();
        if (!m21VarA.isEmpty()) {
            m21VarA.forEach(new BiConsumer() { // from class: bt70
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    e21<?> e21Var = (e21) obj;
                    ct70 ct70Var = this.a;
                    ara0 ara0Var = ct70Var.d;
                    q21 q21Var = ct70Var.g;
                    if (q21Var == null) {
                        q21 q21Var2 = new q21(ara0Var.b(), ara0Var.a());
                        ct70Var.g = q21Var2;
                        q21Var = q21Var2;
                    }
                    q21Var.put(e21Var, obj2);
                }
            });
        }
        q21 q21Var = this.g;
        this.g = null;
        wqa0 wqa0Var2 = this.f;
        fra0 fra0Var = cjg0Var.e;
        gcd gcdVar = cjg0Var.f;
        pg50 pg50Var = cjg0Var.c;
        long jA = this.h;
        if (oqa0VarI instanceof at70) {
            p00Var = ((at70) oqa0VarI).g;
            z = false;
        } else {
            Logger logger = at70.u;
            z = true;
            p00Var = new p00(eqe0.a(true), System.nanoTime());
        }
        if (jA == j) {
            jA = z ? p00Var.a : p00Var.a();
        }
        at70 at70Var = new at70(ui1Var2, str3, this.b, wqa0Var2, oqa0VarI.b(), this.d, fra0Var, gcdVar, p00Var, pg50Var, q21Var, jA, runnable);
        if (fra0Var.C()) {
            fra0Var.r1(m0bVar, at70Var);
        }
        return at70Var;
    }

    @Override // defpackage.qqa0
    public qqa0 e(long j) {
        if (j >= 0 && TimeUnit.NANOSECONDS != null) {
            this.h = j;
        }
        return this;
    }

    @Override // defpackage.qqa0
    public qqa0 g(wqa0 wqa0Var) {
        if (wqa0Var == null) {
            return this;
        }
        this.f = wqa0Var;
        return this;
    }

    @Override // defpackage.qqa0
    public qqa0 h(m0b m0bVar) {
        this.e = m0bVar;
        return this;
    }
}
