package yads;

import com.applovin.mediation.AppLovinUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qo1 implements y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f154535a;

    public qo1(v9 v9Var) {
        this.f154535a = v9Var;
    }

    @Override // yads.y9
    public final fo2 a() {
        fo2 fo2Var = new fo2(new HashMap(), 2);
        fo2Var.b(this.f154535a.f156833l, FirebaseAnalytics.d.f52083d);
        fo2Var.b(this.f154535a.f156826e, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        fo2Var.a(this.f154535a.f156836o, "server_log_id");
        fo2Var.f149197b = this.f154535a.f156830i;
        return fo2Var;
    }
}
