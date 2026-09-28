package defpackage;

import com.sporty.android.core.model.ads.AdsConfig;
import com.sporty.android.core.model.json.JsonSerializeService;

/* JADX INFO: loaded from: classes4.dex */
public final class zl implements wl {
    public final x430 a;
    public final JsonSerializeService b;
    public final k5b c;

    public zl(x430 x430Var, JsonSerializeService jsonSerializeService, k5b k5bVar) {
        this.a = x430Var;
        this.b = jsonSerializeService;
        this.c = k5bVar;
    }

    @Override // defpackage.wl
    public final Object a(String str, tje0 tje0Var) {
        return ej5.d(this.c, new xl(str, this, null), tje0Var);
    }

    @Override // defpackage.wl
    public final or60 b(AdsConfig adsConfig) {
        adsConfig.getClass();
        return new or60(new yl(this, adsConfig, null));
    }
}
