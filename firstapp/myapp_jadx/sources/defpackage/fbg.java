package defpackage;

import android.util.Log;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class fbg implements cbg {
    public final psm a;
    public final zmh0 b;
    public final Object c;
    public volatile tmh0 d;
    public volatile boolean e;
    public a f;
    public tmh0 g;
    public final dm8 h;

    public static final class a {
        public final CountryCodeName a;
        public final CountryCodeName b;

        public a(CountryCodeName countryCodeName, CountryCodeName countryCodeName2) {
            yag yagVar = yag.ONLINE;
            countryCodeName.getClass();
            countryCodeName2.getClass();
            this.a = countryCodeName;
            this.b = countryCodeName2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            yag yagVar = yag.ONLINE;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + (yag.ONLINE.hashCode() * 961)) * 31);
        }

        public final String toString() {
            return "UrlConfigInputs(environment=" + yag.ONLINE + ", replica=null, country=" + this.a + ", socketCountry=" + this.b + ")";
        }
    }

    public fbg(psm psmVar, zmh0 zmh0Var, u250 u250Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        psmVar.getClass();
        this.a = psmVar;
        this.b = zmh0Var;
        this.c = new Object();
        this.h = em8.a();
        ej5.c(w5b.a(oddVar.plus(lfe0.a())), null, null, new ebg(this, null), 3);
    }

    public static tmh0 f(tmh0 tmh0Var, a aVar) {
        CountryCodeName countryCodeName = aVar.a;
        CountryCodeName countryCodeName2 = aVar.b;
        yag yagVar = yag.ONLINE;
        String str = tmh0Var.b;
        countryCodeName.getClass();
        countryCodeName2.getClass();
        String strA = yk10.a(countryCodeName.getCode(), "");
        if (c.k(str, "/", false)) {
            return tmh0.a(tmh0Var, null, tug.a(str, countryCodeName.getCode(), "/"), lx5.a(str, "api/", strA, "/"), null, null, null, null, null, c.p(tmh0Var.j, "{country_code}", countryCodeName2.getCode(), false), 6887);
        }
        hb5.a(tug.a("Invalid value ", str, ". Base Host should end with '/'. Check your configurations and try again."));
        return null;
    }

    @Override // defpackage.cbg
    public final void a() {
        yag yagVar = yag.ONLINE;
    }

    @Override // defpackage.cbg
    public final tmh0 b() {
        tmh0 tmh0Var;
        synchronized (this.c) {
            tmh0Var = this.d;
            if (tmh0Var == null) {
                this.e = true;
                a aVarC = c();
                tmh0 tmh0VarF = f(d(aVarC), aVarC);
                this.d = tmh0VarF;
                Log.w(MyLog.TAG_CONFIG, "UrlConfig accessed before async init completed; using local default for process lifetime");
                tmh0Var = tmh0VarF;
            }
        }
        return tmh0Var;
    }

    public final a c() {
        synchronized (this.c) {
            a aVar = this.f;
            if (aVar != null) {
                return aVar;
            }
            yag yagVar = yag.ONLINE;
            a aVar2 = new a(this.a.getCountryCode(), this.a.w());
            this.f = aVar2;
            return aVar2;
        }
    }

    public final tmh0 d(a aVar) {
        synchronized (this.c) {
            tmh0 tmh0Var = this.g;
            if (tmh0Var != null) {
                return tmh0Var;
            }
            zmh0 zmh0Var = this.b;
            yag yagVar = yag.ONLINE;
            tmh0 tmh0VarA = zmh0Var.a(aVar.a);
            this.g = tmh0VarA;
            return tmh0VarA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(x1b x1bVar) {
        gbg gbgVar;
        a aVar;
        if (x1bVar instanceof gbg) {
            gbgVar = (gbg) x1bVar;
            int i = gbgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbgVar.d = i - Integer.MIN_VALUE;
            } else {
                gbgVar = new gbg(this, x1bVar);
            }
        } else {
            gbgVar = new gbg(this, x1bVar);
        }
        Object obj = gbgVar.b;
        y5b y5bVar = y5b.a;
        int i2 = gbgVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            a aVarC = c();
            zmh0 zmh0Var = this.b;
            CountryCodeName countryCodeName = aVarC.a;
            tmh0 tmh0VarD = d(aVarC);
            gbgVar.a = aVarC;
            gbgVar.d = 1;
            Object objB = zmh0Var.b(countryCodeName, tmh0VarD, gbgVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
            aVar = aVarC;
            obj = objB;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = gbgVar.a;
            uj50.b(obj);
        }
        tmh0 tmh0VarF = f((tmh0) obj, aVar);
        synchronized (this.c) {
            try {
                if (this.e) {
                    Log.d(MyLog.TAG_CONFIG, "Async UrlConfig ready but early local default was already pinned; keeping early default");
                    tmh0VarF = this.d;
                    if (tmh0VarF == null) {
                        throw new IllegalStateException("Early UrlConfig pin must have set snapshot before async init completed");
                    }
                } else {
                    this.d = tmh0VarF;
                    Log.d(MyLog.TAG_CONFIG, "UrlConfig initialized");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tmh0VarF;
    }
}
