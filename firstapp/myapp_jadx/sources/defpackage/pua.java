package defpackage;

import com.appsflyer.internal.u;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class pua implements msm {
    public final b5 a;
    public long b;

    public pua(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    @Override // defpackage.msm
    public final String a(long j, String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("/topic/user-");
        sb.append(j);
        sb.append("-country-");
        return uf80.a(sb, str, "-game-click");
    }

    @Override // defpackage.msm
    public final String b() {
        String countryCurrency = this.a.getCountryCurrency();
        return countryCurrency == null ? "" : countryCurrency;
    }

    @Override // defpackage.msm
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

    @Override // defpackage.msm
    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b5 b5Var = this.a;
        String accessToken = b5Var.getAccessToken();
        if (accessToken != null) {
        }
        String nullableCountry = b5Var.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        linkedHashMap.put("country-code", nullableCountry);
        linkedHashMap.put("user-agent", "stackers-frontend/1.0");
        linkedHashMap.put("x-platform", "android");
        return linkedHashMap;
    }

    @Override // defpackage.msm
    public final void e(long j) {
        this.b = j;
    }

    @Override // defpackage.msm
    public final long f() {
        return this.b;
    }

    @Override // defpackage.msm
    public final String g() {
        String baseUrlSocket = this.a.getBaseUrlSocket();
        if (baseUrlSocket == null) {
            baseUrlSocket = "";
        }
        return baseUrlSocket.concat("games/sporty-stackers/v1/game");
    }

    @Override // defpackage.msm
    public final Map<String, String> h() {
        String nullableCountry = this.a.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        return u.a("country-code", nullableCountry);
    }
}
