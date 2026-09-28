package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkq00;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kq00 extends c82 {
    public final r1p A;
    public final rdd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final wuw<bba0> F;
    public lyh<? extends bba0> G;
    public final vu60 d;
    public final uqm e;
    public final uga0 f;
    public final ufa0 i;
    public final mgb0 v;
    public final j1p w;
    public final k1p y;
    public final mye z;

    public kq00(vu60 vu60Var, uqm uqmVar, uga0 uga0Var, ufa0 ufa0Var, mgb0 mgb0Var, j1p j1pVar, k1p k1pVar, mye myeVar, r1p r1pVar, rdd0 rdd0Var) {
        vu60Var.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        rdd0Var.getClass();
        this.d = vu60Var;
        this.e = uqmVar;
        this.f = uga0Var;
        this.i = ufa0Var;
        this.v = mgb0Var;
        this.w = j1pVar;
        this.y = k1pVar;
        this.z = myeVar;
        this.A = r1pVar;
        this.B = rdd0Var;
        SocialRouter$PersonalSocial.Data.INSTANCE.getClass();
        this.C = vu60Var.d(SocialRouter$PersonalSocial.Data.EMPTY, "arg_personal_social_data");
        wwd0 wwd0VarA = xwd0.a(lq00.b.a);
        this.D = wwd0VarA;
        this.E = e1i.b(wwd0VarA);
        this.F = new wuw<>();
        this.G = i2g.a;
    }

    public final void x1() {
        String username = ((SocialRouter$PersonalSocial.Data) this.C.a.getValue()).getUsername();
        uga0 uga0Var = this.f;
        uga0Var.getClass();
        username.getClass();
        CountryCodeName countryCode = uga0Var.c.getCountryCode();
        kzh.d(new g1i(uga0Var.d.isLogin() ? r0i.a(uga0Var.a.a(pu0.c.a), new rga0(username, countryCode, uga0Var, null)) : uga0.a(uga0Var, false, username, countryCode), new dq00(this, null)), o8i0.d(this));
    }

    public final void y1(SocialRouter$PersonalSocial.Data data) {
        data.getClass();
        this.d.e(data, "arg_personal_social_data");
    }
}
