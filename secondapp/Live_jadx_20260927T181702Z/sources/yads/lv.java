package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f152157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f152158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final az1 f152159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f152160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sx f152161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final we f152162f;

    public lv(v9 v9Var, d4 d4Var, az1 az1Var, io2 io2Var, sx sxVar, we weVar) {
        this.f152157a = v9Var;
        this.f152158b = d4Var;
        this.f152159c = az1Var;
        this.f152160d = io2Var;
        this.f152161e = sxVar;
        this.f152162f = weVar;
    }

    public final eo2 a(co2 co2Var, Map map) {
        if (!kotlin.jvm.internal.v1.H(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = bo2.f147299a;
        if (str == null) {
            map.put(Q6.G1, "undefined");
        } else {
            map.put(Q6.G1, str);
        }
        fo2 fo2VarA = this.f152161e.a(this.f152157a, this.f152158b);
        c cVar = fo2VarA.f149197b;
        Map mapO0 = fr.n1.o0(map, fo2VarA.f149196a);
        Map linkedHashMap = kotlin.jvm.internal.v1.H(mapO0) ? mapO0 : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        a03 a03Var = this.f152158b.f148056d.f147002a;
        if (a03Var != null) {
            String str2 = a03Var.b().f159117b;
            if (str2 == null) {
                linkedHashMap.put("size_type", "undefined");
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(a03Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(a03Var.getHeight()));
        }
        az1 az1Var = this.f152159c;
        if (az1Var != null) {
            Map mapG = fr.m1.g();
            mapG.put("asset_name", az1Var.f146975a);
            mapG.put("action_type", az1Var.f146976b);
            i22 i22Var = az1Var.f146977c;
            if (i22Var != null) {
                mapG.putAll(i22Var.a().f149196a);
            }
            Map map2 = az1Var.f146978d.f158283a;
            if (map2 != null) {
                mapG.putAll(map2);
            }
            linkedHashMap.putAll(fr.m1.d(mapG));
        }
        return new eo2(co2Var.f147841b, fr.n1.J0(linkedHashMap), cVar);
    }
}
