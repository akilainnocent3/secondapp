package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class r980 implements czm {
    public final k650 a;
    public final List<String> b;

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/sporty/android/core/model/json/JsonSerializeServiceExtKt$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "com/sporty/android/core/model/json/JsonSerializeServiceExtKt$tryFromJson$lambda$0$$inlined$fromJson$1", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    public r980(k650 k650Var, JsonSerializeService jsonSerializeService) {
        List<String> list;
        Object bVar;
        k650Var.getClass();
        jsonSerializeService.getClass();
        this.a = k650Var;
        String strG = k650Var.g("http_caching_allowed_endpoints");
        try {
            try {
                zi50.a aVar = zi50.b;
                bVar = jsonSerializeService.fromJson(strG, new a().getType());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            list = (List) (bVar instanceof zi50.b ? null : bVar);
            if (list == null) {
                list = m2g.a;
            }
        } catch (Exception unused) {
            list = m2g.a;
        }
        this.b = list;
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_HTTP_CACHE);
        aVar3.a("Caching allowed for " + list, new Object[0]);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Response responseProceed = chain.proceed(chain.request());
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        String strHeader$default = Response.header$default(responseProceed, "Cache-Control", null, 2, null);
        if (strHeader$default == null) {
            return responseProceed;
        }
        String strEncodedPath = responseProceed.request().url().encodedPath();
        List<String> list = this.b;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.M(strEncodedPath, (String) it.next(), false)) {
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.o0(StringsKt.k0(strHeader$default, "max-age=", strHeader$default), ","));
                    if ((intOrNull != null ? intOrNull.intValue() : 0) <= 0) {
                        break;
                    }
                    boolean zB = this.a.b("category_api_res_time_log_enable");
                    if (StringsKt.M(strEncodedPath, "factsCenter/sporty-news/article/category/list", false) && zB) {
                        f00 f00Var = vgb0.a;
                        vgb0.b("category_api_res_time", vj5.a(new Pair("from", "android"), new Pair(AnalyticsParam.EVENT_PATH, jCurrentTimeMillis2 < 10 ? "under_10_ms" : "above_10_ms")));
                    }
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_HTTP_CACHE);
                    aVar.a("Caching enabled for \"" + strEncodedPath + "\"", new Object[0]);
                    return responseProceed;
                }
            }
        }
        return responseProceed.newBuilder().removeHeader("Cache-Control").build();
    }
}
