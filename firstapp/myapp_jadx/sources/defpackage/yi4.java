package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.appsflyer.internal.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class yi4 implements prm {
    public final b5 a;
    public long b;
    public String c;

    public yi4(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    @Override // defpackage.prm
    public final String b() {
        String countryCurrency = this.a.getCountryCurrency();
        return countryCurrency == null ? "" : countryCurrency;
    }

    @Override // defpackage.prm
    public final LinkedHashMap d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b5 b5Var = this.a;
        String accessToken = b5Var.getAccessToken();
        if (accessToken != null) {
            linkedHashMap.put("sf-access-token", accessToken);
        }
        String nullableCountry = b5Var.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        linkedHashMap.put("country-code", nullableCountry);
        linkedHashMap.put("user-agent", "bonus-cup-frontend/1.0");
        linkedHashMap.put("x-platform", "android");
        String string = this.c;
        if (string == null) {
            string = UUID.randomUUID().toString();
            this.c = string;
        }
        if (string != null) {
            linkedHashMap.put("client-instance-id", string);
        }
        return linkedHashMap;
    }

    @Override // defpackage.prm
    public final void e(long j) {
        this.b = j;
    }

    @Override // defpackage.prm
    public final long f() {
        return this.b;
    }

    @Override // defpackage.prm
    public final String g() {
        b5 b5Var = this.a;
        String baseUrlSocket = b5Var.getBaseUrlSocket();
        if (baseUrlSocket == null) {
            baseUrlSocket = "";
        }
        String strConcat = baseUrlSocket.concat("games/sporty-bonus-cup/v1/game");
        String accessToken = b5Var.getAccessToken();
        return accessToken != null ? tug.a(strConcat, "?accessToken=", accessToken) : strConcat;
    }

    @Override // defpackage.prm
    public final String h(long j, String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("/topic/user-");
        sb.append(j);
        sb.append("-country-");
        return uf80.a(sb, str, "-bonus-cup-spawn");
    }

    @Override // defpackage.prm
    public final String i(long j, String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("/topic/user-");
        sb.append(j);
        sb.append("-country-");
        return uf80.a(sb, str, "-bonus-cup-event");
    }

    @Override // defpackage.prm
    public final Map<String, String> j() {
        String nullableCountry = this.a.getNullableCountry();
        if (nullableCountry == null) {
            nullableCountry = "";
        }
        return u.a("country-code", nullableCountry);
    }

    @Override // defpackage.prm
    public final Map<String, String> c() {
        String accessToken = this.a.getAccessToken();
        if (accessToken != null) {
            Map<String, String> mapA = u.a(LhMGMAwwhzjwfz.qVuJSPI, "accessToken=".concat(accessToken));
            if (mapA != null) {
                return mapA;
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }
}
