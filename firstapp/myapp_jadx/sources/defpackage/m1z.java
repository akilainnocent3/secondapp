package defpackage;

import android.os.Build;
import com.sporty.android.common_analytics.opentelemetry.AppMeta;
import com.sporty.android.common_analytics.opentelemetry.DeviceMeta;
import com.sporty.android.common_analytics.opentelemetry.LogBody;
import com.sporty.android.common_analytics.opentelemetry.UserMeta;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.tracking.TrackingKind;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class m1z implements iym, jym {
    public final str<kym> a;
    public final JsonSerializeService b;
    public final ysm c;
    public final str<uqm> d;
    public final str<psm> e;
    public final yi5 f;
    public final eft g;
    public final j1b h;

    @c0d(c = "com.sporty.android.common_analytics.opentelemetry.OpenTelemetryLogger$sendCustomEvent$1", f = "OpenTelemetryLogger.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public eft a;
        public String b;
        public String c;
        public String d;
        public long e;
        public int f;
        public final /* synthetic */ TrackingKind v;
        public final /* synthetic */ Map<String, Object> w;
        public final /* synthetic */ PageMeta y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrackingKind trackingKind, Map<String, ? extends Object> map, PageMeta pageMeta, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.v = trackingKind;
            this.w = map;
            this.y = pageMeta;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m1z.this.new a(this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            eft eftVar;
            Object objD;
            String str;
            String str2;
            String str3;
            long j;
            m1z m1zVar = m1z.this;
            str<kym> strVar = m1zVar.a;
            y5b y5bVar = y5b.a;
            int i = this.f;
            TrackingKind trackingKind = this.v;
            if (i == 0) {
                uj50.b(obj);
                if (!strVar.get().isEnabled()) {
                    itf0.a aVar = itf0.a;
                    aVar.q("OpenTelemetryLogger");
                    aVar.a("OpenTelemetry is disabled. <sendCustomEvent>", new Object[0]);
                    return Unit.a;
                }
                CountryCodeName countryCodeName = CountryCodeName.MEXICO;
                str<psm> strVar2 = m1zVar.e;
                String code = countryCodeName == strVar2.get().getCountryCode() ? "int-mx" : strVar2.get().getCountryCode().getCode();
                long jCurrentTimeMillis = System.currentTimeMillis();
                eftVar = m1zVar.g;
                String nameForBi = trackingKind.getNameForBi();
                String userId = m1zVar.d.get().getUserId();
                ysm ysmVar = m1zVar.c;
                this.a = eftVar;
                this.b = nameForBi;
                this.c = userId;
                this.d = code;
                this.e = jCurrentTimeMillis;
                this.f = 1;
                objD = ysmVar.d(this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                str = nameForBi;
                str2 = userId;
                str3 = code;
                j = jCurrentTimeMillis;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.e;
                String str4 = this.d;
                String str5 = this.c;
                String str6 = this.b;
                eftVar = this.a;
                uj50.b(obj);
                str3 = str4;
                str2 = str5;
                str = str6;
                objD = obj;
            }
            eft eftVar2 = eftVar;
            String str7 = ((ysm.a) objD).a;
            yi5 yi5Var = m1zVar.f;
            eftVar2.getClass();
            str.getClass();
            str3.getClass();
            str7.getClass();
            Map<String, Object> map = this.w;
            map.getClass();
            String strA = yi5Var.b().a();
            eftVar2.a.a();
            AppMeta appMeta = new AppMeta("SportyBet Android", strA, str3, "android", "prod");
            String str8 = Build.MODEL;
            str8.getClass();
            String str9 = Build.MANUFACTURER;
            str9.getClass();
            DeviceMeta deviceMeta = new DeviceMeta(str7, str8, str9);
            String str10 = eftVar2.b.format(new Date(j));
            str10.getClass();
            LogBody logBody = new LogBody(str, str10, appMeta, deviceMeta, (str2 == null || StringsKt.U(str2)) ? null : new UserMeta(null, str2, null, null, 13, null), map, this.y);
            String nameForBi2 = trackingKind.getNameForBi();
            String str11 = (String) map.get("type");
            if (str11 == null) {
                str11 = "google_analytics";
            }
            sg50 sg50VarE = pg50.b.e();
            g21 g21Var = g21.a;
            sg50VarE.a(kyo.a(g21Var, "kind"), nameForBi2);
            sg50VarE.a(kyo.a(g21Var, "event.type"), str11);
            gk1 gk1VarA = pg50.a(sg50VarE.a.a(), sg50VarE.b);
            String json = m1zVar.b.toJson(logBody);
            json.getClass();
            try {
                strVar.get().a().a().i(j).b(gk1VarA.e).g(json).c();
                itf0.a aVar2 = itf0.a;
                aVar2.q("OpenTelemetryLogger");
                aVar2.a("logEvent -> attributes: " + gk1VarA + ", body: " + json, new Object[0]);
            } catch (Exception e) {
                itf0.a aVar3 = itf0.a;
                aVar3.q("OpenTelemetryLogger");
                aVar3.f(e, "Error while logging event", new Object[0]);
            }
            return Unit.a;
        }
    }

    public m1z(str<kym> strVar, JsonSerializeService jsonSerializeService, ysm ysmVar, str<uqm> strVar2, str<psm> strVar3, yi5 yi5Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, eft eftVar) {
        this.a = strVar;
        this.b = jsonSerializeService;
        this.c = ysmVar;
        this.d = strVar2;
        this.e = strVar3;
        this.f = yi5Var;
        this.g = eftVar;
        this.h = w5b.a(k5bVar);
    }

    @Override // defpackage.iym, defpackage.jym
    public final void a(Map<String, ? extends Object> map, PageMeta pageMeta, TrackingKind trackingKind) {
        map.getClass();
        trackingKind.getClass();
        ej5.c(this.h, null, null, new a(trackingKind, map, pageMeta, null), 3);
    }

    @Override // defpackage.iym
    public final void b(Map<String, ? extends Object> map) {
        a(map, null, TrackingKind.Event);
    }

    @Override // defpackage.iym
    public final void c(String str, Map<String, ? extends Object> map, PageMeta pageMeta) {
        if (!this.a.get().isEnabled()) {
            itf0.a aVar = itf0.a;
            aVar.q("OpenTelemetryLogger");
            aVar.a("OpenTelemetry is disabled. <sendBiEvent>", new Object[0]);
            return;
        }
        Map mapF = kpu.f(new Pair("name", str), new Pair("type", AnalyticsEvent.BI_TRACKING_TYPE_BI_ANALYTICS), new Pair(AnalyticsParam.KEY_BI_CUSTOM_METRICS, map));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapF.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a(linkedHashMap, pageMeta, TrackingKind.Event);
    }

    @Override // defpackage.iym
    public final void d(String str) {
        c(str, null, null);
    }

    @Override // defpackage.iym
    public final void e(String str, Map<String, ? extends Object> map) {
        c(str, map, null);
    }

    @Override // defpackage.iym
    public final void f(String str, PageMeta pageMeta) {
        c(str, null, pageMeta);
    }
}
