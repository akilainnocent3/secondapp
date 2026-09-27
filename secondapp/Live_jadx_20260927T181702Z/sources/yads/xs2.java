package yads;

import com.applovin.mediation.AppLovinUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xs2 implements y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f157981a;

    public xs2(v9 v9Var) {
        this.f157981a = v9Var;
    }

    @Override // yads.y9
    public final fo2 a() {
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.b(this.f157981a.f156833l, FirebaseAnalytics.d.f52083d);
        fo2Var.b(this.f157981a.f156823b, "ad_type_format");
        fo2Var.b(this.f157981a.f156826e, AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
        fo2Var.b(this.f157981a.f156825d, "product_type");
        fo2Var.a(this.f157981a.f156836o, "server_log_id");
        fo2Var.b(this.f157981a.c().f153211a.f159117b, "size_type");
        fo2Var.b(Integer.valueOf(this.f157981a.c().f153213c), "width");
        fo2Var.b(Integer.valueOf(this.f157981a.c().f153214d), "height");
        fo2Var.f149197b = this.f157981a.f156830i;
        return fo2Var;
    }
}
