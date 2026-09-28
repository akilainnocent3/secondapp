package defpackage;

import com.appsflyer.internal.u;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class iil implements dum {
    public final b5 a;

    public iil(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    @Override // defpackage.dum
    public final Map<String, String> a() {
        String nullableCountry = this.a.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        return u.a("country-code", nullableCountry);
    }

    @Override // defpackage.dum
    public final Map<String, String> c() {
        Map<String, String> mapA;
        String accessToken = this.a.getAccessToken();
        if (accessToken != null && (mapA = u.a("cookie", "accessToken=".concat(accessToken))) != null) {
            return mapA;
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    @Override // defpackage.dum
    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b5 b5Var = this.a;
        String nullableCountry = b5Var.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        linkedHashMap.put("country-code", nullableCountry);
        String property = System.getProperty("http.agent");
        linkedHashMap.put("user-agent", (property != null ? property.concat("-") : "") + b5Var.getVersionCode());
        linkedHashMap.put("x-platform", "android");
        return linkedHashMap;
    }
}
