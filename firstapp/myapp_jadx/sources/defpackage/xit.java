package defpackage;

import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class xit implements pdd0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final PageMeta f;
    public final String g = "login__fail";

    public xit(String str, String str2, Integer num, String str3, String str4, PageMeta pageMeta) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = str4;
        this.f = pageMeta;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        HashMap<String, Object> mapD = kpu.d(new Pair("errorReason", this.a), new Pair("login_method", this.b));
        Integer num = this.c;
        if (num != null) {
            mapD.put("biz_code", Integer.valueOf(num.intValue()));
        }
        String str = this.d;
        if (str != null) {
            mapD.put("exception_type", str);
        }
        String str2 = this.e;
        if (str2 != null) {
            mapD.put("exception_category", str2);
        }
        return mapD;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.g;
    }

    @Override // defpackage.pdd0
    public final PageMeta getPageMeta() {
        return this.f;
    }
}
