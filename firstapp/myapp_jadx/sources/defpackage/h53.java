package defpackage;

import com.sporty.android.book.domain.entity.MarketingServiceType;
import com.sporty.android.core.model.json.JsonSerializeService;

/* JADX INFO: loaded from: classes7.dex */
public final class h53 {
    public final krm a;
    public final uqm b;
    public final h530 c;
    public final h940 d;
    public final JsonSerializeService e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;

    public h53(krm krmVar, uqm uqmVar, h530 h530Var, h940 h940Var, JsonSerializeService jsonSerializeService) {
        krmVar.getClass();
        uqmVar.getClass();
        h530Var.getClass();
        h940Var.getClass();
        jsonSerializeService.getClass();
        this.a = krmVar;
        this.b = uqmVar;
        this.c = h530Var;
        this.d = h940Var;
        this.e = jsonSerializeService;
        Boolean bool = Boolean.TRUE;
        this.f = xwd0.a(bool);
        this.g = xwd0.a(bool);
        this.h = xwd0.a(bool);
        this.i = xwd0.a(bool);
    }

    public final boolean a() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final void c(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.g;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
    }

    public final void d(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.h;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
    }

    public final void e(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
    }

    public final void f(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
        c(z);
        d(z);
        e(z);
    }

    public final lyh<isu> g() {
        wwd0 wwd0Var = this.f;
        boolean zBooleanValue = ((Boolean) wwd0Var.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.g.getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) this.h.getValue()).booleanValue();
        wwd0 wwd0Var2 = this.i;
        boolean zBooleanValue4 = ((Boolean) wwd0Var2.getValue()).booleanValue();
        h530 h530Var = this.c;
        if (!zBooleanValue || !zBooleanValue2) {
            boolean zA = a();
            boolean zBooleanValue5 = ((Boolean) wwd0Var.getValue()).booleanValue();
            MarketingServiceType marketingServiceType = (zA || !zBooleanValue5) ? MarketingServiceType.MULTIPLE : MarketingServiceType.BONUS;
            return (zA && zBooleanValue5) ? new gzh(new isu(marketingServiceType, jsu.a)) : r0i.a(new g1i(new sl50(bm50.b(h530Var.w(), vch0.b)), new b53(this, null, zA, zBooleanValue5)), new c53(marketingServiceType, null));
        }
        if (!zBooleanValue || !zBooleanValue3) {
            boolean zB = b();
            boolean zBooleanValue6 = ((Boolean) wwd0Var.getValue()).booleanValue();
            MarketingServiceType marketingServiceType2 = (zB || !zBooleanValue6) ? MarketingServiceType.MULTIPLE : MarketingServiceType.GIFT;
            if (this.b.isLogin()) {
                return (zB && zBooleanValue6) ? new gzh(new isu(marketingServiceType2, jsu.a)) : r0i.a(new g1i(new sl50(bm50.b(h530Var.m(1, 0), vch0.b)), new d53(this, null, zB, zBooleanValue6)), new e53(marketingServiceType2, null));
            }
            return new gzh(new isu(marketingServiceType2, jsu.a));
        }
        if (zBooleanValue && zBooleanValue4) {
            return new gzh(new isu(MarketingServiceType.MULTIPLE, jsu.a));
        }
        boolean zBooleanValue7 = ((Boolean) wwd0Var2.getValue()).booleanValue();
        boolean zBooleanValue8 = ((Boolean) wwd0Var.getValue()).booleanValue();
        MarketingServiceType marketingServiceType3 = (zBooleanValue7 || !zBooleanValue8) ? MarketingServiceType.MULTIPLE : MarketingServiceType.LIVE_ODDS_BOOST;
        return (zBooleanValue7 && zBooleanValue8) ? new gzh(new isu(marketingServiceType3, jsu.a)) : r0i.a(new g1i(new sl50(bm50.b(this.d.o(), vch0.b)), new f53(this, null, zBooleanValue7, zBooleanValue8)), new g53(marketingServiceType3, null));
    }
}
