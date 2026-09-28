package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class zmh0 {
    public final anh0 a;
    public final abg b;
    public final JsonSerializeService c;
    public final k5b d;

    public zmh0(anh0 anh0Var, fnh0 fnh0Var, abg abgVar, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.Default) k5b k5bVar) {
        anh0Var.getClass();
        jsonSerializeService.getClass();
        this.a = anh0Var;
        this.b = abgVar;
        this.c = jsonSerializeService;
        this.d = k5bVar;
    }

    public final tmh0 a(CountryCodeName countryCodeName) {
        yag yagVar = yag.ONLINE;
        countryCodeName.getClass();
        if (fnh0.a.a[0] != 1) {
            z9l.a(yagVar, "Invalid type ");
            return null;
        }
        tmh0 tmh0Var = w72.a;
        int i = w72.a.a[countryCodeName.ordinal()];
        if (i == 1) {
            return tmh0.a(w72.a, "https://www.sporty.bet.br/", null, null, null, null, null, null, null, "https://alive.sporty.bet.br/", 7163);
        }
        if (i == 2) {
            return tmh0.a(w72.a, "https://www.sportybet.mx/", null, null, null, null, null, null, null, "https://alive.sportybet.mx/", 7163);
        }
        if (i == 3) {
            return tmh0.a(w72.a, "https://www.sportybet.co.za/", null, null, null, null, null, null, null, "https://alive.sportybet.co.za/", 7163);
        }
        if (i != 4) {
            return i != 5 ? w72.a : tmh0.a(w72.a, "https://www.sportybet.co.mz/", null, null, null, null, null, null, null, "https://alive.sportybet.co.mz/", 7163);
        }
        return tmh0.a(w72.a, "https://www.sportybet.co.cm/", null, null, null, null, null, null, null, "https://alive.sportybet.co.cm/", 7163);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(CountryCodeName countryCodeName, tmh0 tmh0Var, x1b x1bVar) {
        umh0 umh0Var;
        Object bVar;
        if (x1bVar instanceof umh0) {
            umh0Var = (umh0) x1bVar;
            int i = umh0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                umh0Var.d = i - Integer.MIN_VALUE;
            } else {
                umh0Var = new umh0(this, x1bVar);
            }
        } else {
            umh0Var = new umh0(this, x1bVar);
        }
        Object objC = umh0Var.b;
        Object obj = y5b.a;
        int i2 = umh0Var.d;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                umh0Var.a = tmh0Var;
                umh0Var.d = 1;
                objC = c(countryCodeName, umh0Var);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tmh0Var = umh0Var.a;
                uj50.b(objC);
            }
            f750 f750Var = (f750) objC;
            if (f750Var == null) {
                return tmh0Var;
            }
            bVar = tmh0Var.b(f750Var);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        return bVar instanceof zi50.b ? tmh0Var : bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(CountryCodeName countryCodeName, x1b x1bVar) {
        xmh0 xmh0Var;
        Object bVar;
        if (x1bVar instanceof xmh0) {
            xmh0Var = (xmh0) x1bVar;
            int i = xmh0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmh0Var.d = i - Integer.MIN_VALUE;
            } else {
                xmh0Var = new xmh0(this, x1bVar);
            }
        } else {
            xmh0Var = new xmh0(this, x1bVar);
        }
        Object objA = xmh0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = xmh0Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            yzh yzhVar = new yzh(this.b.a.a.k(), new ymh0(3, null));
            xmh0Var.a = countryCodeName;
            xmh0Var.d = 1;
            objA = s0i.a(yzhVar, xmh0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            countryCodeName = xmh0Var.a;
            uj50.b(objA);
        }
        String lowerCase = countryCodeName.getCode().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str = (String) ((zn20) objA).c(new zn20.a("url_ovr_".concat(lowerCase)));
        if (str == null) {
            return null;
        }
        JsonSerializeService jsonSerializeService = this.c;
        try {
            zi50.a aVar = zi50.b;
            bVar = jsonSerializeService.fromJson(str, new wmh0().getType());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            return null;
        }
        return bVar;
    }
}
