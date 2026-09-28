package com.sportygames.commons.utils;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import defpackage.bi50;
import defpackage.c0d;
import defpackage.db30;
import defpackage.ej5;
import defpackage.fal;
import defpackage.flz;
import defpackage.fse;
import defpackage.hwr;
import defpackage.i00;
import defpackage.ib5;
import defpackage.jh4;
import defpackage.kpu;
import defpackage.nf;
import defpackage.odd;
import defpackage.on50;
import defpackage.pfd;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vs6;
import defpackage.w5b;
import defpackage.ws6;
import defpackage.y5b;
import defpackage.yoh;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/sportygames/commons/utils/CasinoLogger;", "", "<init>", "()V", "", "clientId", "eventName", "Landroid/os/Bundle;", "bundle", "", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "logEventToCasino", "(Ljava/lang/String;Landroid/os/Bundle;)V", "defaultClientId", "Ljava/lang/String;", "casinoMeasurementId", "casinoApiSecret", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics$delegate", "Lttr;", "getFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "Lcom/sportygames/commons/utils/CasinoLogger$a;", "api$delegate", "getApi", "()Lcom/sportygames/commons/utils/CasinoLogger$a;", "api", "b", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CasinoLogger {
    private static final String defaultClientId = "1234567890";
    public static final CasinoLogger INSTANCE = new CasinoLogger();
    private static final String casinoMeasurementId = "";
    private static final String casinoApiSecret = "";

    /* JADX INFO: renamed from: firebaseAnalytics$delegate, reason: from kotlin metadata */
    private static final ttr firebaseAnalytics = hwr.b(new vs6());

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    private static final ttr api = hwr.b(new ws6());
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/sportygames/commons/utils/CasinoLogger$a;", "", "", "measurementId", "apiSecret", "Lcom/sportygames/commons/utils/CasinoLogger$b;", "requestBody", "Lbi50;", "", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/commons/utils/CasinoLogger$b;Lv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @flz("mp/collect")
        Object a(@db30("measurement_id") String str, @db30("api_secret") String str2, @jh4 b bVar, v1b<? super bi50<Unit>> v1bVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/sportygames/commons/utils/CasinoLogger$b;", "", "", "clientId", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "", "Lcom/sportygames/commons/utils/CasinoLogger$b$a;", "events", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {
        public static final int $stable = 8;

        @SerializedName("client_id")
        private final String clientId;

        @SerializedName("events")
        private final List<a> events;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sportygames/commons/utils/CasinoLogger$b$a;", "", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "params", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {
            public static final int $stable = 8;

            @SerializedName("name")
            private final String name;

            @SerializedName("params")
            private final Map<String, Object> params;

            public a(String str, LinkedHashMap linkedHashMap) {
                str.getClass();
                this.name = str;
                this.params = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.name, aVar.name) && Intrinsics.g(this.params, aVar.params);
            }

            public final int hashCode() {
                return this.params.hashCode() + (this.name.hashCode() * 31);
            }

            public final String toString() {
                return "Event(name=" + this.name + ", params=" + this.params + ")";
            }
        }

        public b(String str, List<a> list) {
            str.getClass();
            list.getClass();
            this.clientId = str;
            this.events = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.clientId, bVar.clientId) && Intrinsics.g(this.events, bVar.events);
        }

        public final int hashCode() {
            return this.events.hashCode() + (this.clientId.hashCode() * 31);
        }

        public final String toString() {
            return nf.b("GoogleAnalyticsEvent(clientId=", this.clientId, ", events=", ")", this.events);
        }
    }

    @c0d(c = "com.sportygames.commons.utils.CasinoLogger$sendEvent$1", f = "CasinoLogger.kt", l = {93}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Bundle b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle, String str, String str2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = bundle;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Set<String> setKeySet;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    LinkedHashMap linkedHashMapG = kpu.g(new Pair("native_platform", "Android"));
                    Bundle bundle = this.b;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        for (String str : setKeySet) {
                            Object obj2 = bundle.get(str);
                            if (obj2 == null) {
                                obj2 = "";
                            }
                            linkedHashMapG.put(str, obj2);
                        }
                    }
                    b bVar = new b(this.d, kotlin.collections.a.c(new b.a(this.c, linkedHashMapG)));
                    a api = CasinoLogger.INSTANCE.getApi();
                    String str2 = CasinoLogger.casinoMeasurementId;
                    String str3 = CasinoLogger.casinoApiSecret;
                    this.a = 1;
                    obj = api.a(str2, str3, bVar, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (IOException | Exception unused) {
            }
            return Unit.a;
        }
    }

    private CasinoLogger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a api_delegate$lambda$0() {
        on50.b bVar = new on50.b();
        bVar.a("https://www.google-analytics.com/");
        bVar.c.add(fal.c());
        return (a) bVar.b().a(a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseAnalytics firebaseAnalytics_delegate$lambda$0() {
        if (i00.a == null) {
            synchronized (i00.b) {
                try {
                    if (i00.a == null) {
                        yoh yohVarC = yoh.c();
                        yohVarC.a();
                        i00.a = FirebaseAnalytics.getInstance(yohVarC.a);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics2 = i00.a;
        firebaseAnalytics2.getClass();
        return firebaseAnalytics2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getApi() {
        Object value = api.getValue();
        value.getClass();
        return (a) value;
    }

    private final FirebaseAnalytics getFirebaseAnalytics() {
        return (FirebaseAnalytics) firebaseAnalytics.getValue();
    }

    public static /* synthetic */ void logEventToCasino$default(CasinoLogger casinoLogger, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        casinoLogger.logEventToCasino(str, bundle);
    }

    private final void sendEvent(String clientId, String eventName, Bundle bundle) {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(odd.b), null, null, new c(bundle, eventName, clientId, null), 3);
    }

    public static /* synthetic */ void sendEvent$default(CasinoLogger casinoLogger, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = null;
        }
        casinoLogger.sendEvent(str, str2, bundle);
    }

    public final void logEventToCasino(String eventName, Bundle bundle) {
        eventName.getClass();
    }
}
