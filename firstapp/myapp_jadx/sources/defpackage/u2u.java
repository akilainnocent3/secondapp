package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class u2u {
    public final k5b a;
    public final h530 b;
    public final m2l c;
    public final vxt d;
    public final uqm e;
    public final mgb0 f;
    public final k650 g;
    public final psm h;
    public final lyz i;
    public final lq1 j;
    public final JsonSerializeService k;

    public u2u(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, h530 h530Var, m2l m2lVar, vxt vxtVar, uqm uqmVar, mgb0 mgb0Var, k650 k650Var, psm psmVar, lyz lyzVar, lq1 lq1Var, JsonSerializeService jsonSerializeService) {
        h530Var.getClass();
        m2lVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        k650Var.getClass();
        psmVar.getClass();
        lyzVar.getClass();
        lq1Var.getClass();
        jsonSerializeService.getClass();
        this.a = k5bVar;
        this.b = h530Var;
        this.c = m2lVar;
        this.d = vxtVar;
        this.e = uqmVar;
        this.f = mgb0Var;
        this.g = k650Var;
        this.h = psmVar;
        this.i = lyzVar;
        this.j = lq1Var;
        this.k = jsonSerializeService;
    }

    public final boolean a() {
        Object bVar;
        k650 k650Var = this.g;
        if (!k650Var.b("enable_sporty_loyalty")) {
            return false;
        }
        String strG = k650Var.g("enable_sporty_loyalty_country");
        try {
            zi50.a aVar = zi50.b;
            bVar = StringsKt__StringsKt.split$default(strG, new String[]{","}, false, 0, 6, null);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Collection<String> collection = (List) bVar;
        if (collection == null) {
            collection = m2g.a;
        }
        CountryCodeName countryCode = this.h.getCountryCode();
        if (collection != null && collection.isEmpty()) {
            return false;
        }
        for (String str : collection) {
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            String lowerCase2 = countryCode.getCode().toLowerCase(locale);
            lowerCase2.getClass();
            if (lowerCase.equals(lowerCase2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        r2u r2uVar;
        if (x1bVar instanceof r2u) {
            r2uVar = (r2u) x1bVar;
            int i = r2uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r2uVar.c = i - Integer.MIN_VALUE;
            } else {
                r2uVar = new r2u(this, x1bVar);
            }
        } else {
            r2uVar = new r2u(this, x1bVar);
        }
        Object obj = r2uVar.a;
        y5b y5bVar = y5b.a;
        int i2 = r2uVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            s2u s2uVar = new s2u(null, this);
            r2uVar.c = 1;
            if (ej5.d(this.a, s2uVar, r2uVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
