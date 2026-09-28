package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a750 implements zl80 {
    public static final int g;
    public static final Regex h;
    public final vwf0 a;
    public final sph b;
    public final xu0 c;
    public final aub d;
    public final fj80 e;
    public final tuw f;

    @c0d(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    public static final class a extends x1b {
        public Object a;
        public quw b;
        public /* synthetic */ Object c;
        public int e;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return a750.this.a(this);
        }
    }

    @c0d(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<JSONObject, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = a750.this.new b(v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JSONObject jSONObject, v1b<? super Unit> v1bVar) {
            return ((b) create(jSONObject, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d;
            Integer num;
            JSONException jSONException;
            Integer num2;
            Integer num3;
            Double d2;
            y5b y5bVar = y5b.a;
            int i = this.a;
            Integer num4 = null;
            num4 = null;
            Boolean bool2 = null;
            if (i == 0) {
                uj50.b(obj);
                JSONObject jSONObject = (JSONObject) this.b;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    obj2.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    Unit unit = Unit.a;
                                    num = num3;
                                    d = d2;
                                    bool = bool3;
                                } catch (JSONException e) {
                                    jSONException = e;
                                    num2 = num4;
                                    bool2 = bool3;
                                    s75.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                                    num = num3;
                                    d = d2;
                                    bool = bool2;
                                    num4 = num2;
                                }
                            } catch (JSONException e2) {
                                jSONException = e2;
                                num2 = null;
                                num3 = null;
                            }
                        } catch (JSONException e3) {
                            jSONException = e3;
                            num2 = null;
                            num3 = null;
                            d2 = null;
                        }
                    } catch (JSONException e4) {
                        jSONException = e4;
                        num2 = null;
                        num3 = null;
                        d2 = null;
                    }
                } else {
                    bool = null;
                    d = null;
                    num = null;
                }
                a750 a750Var = a750.this;
                fj80 fj80Var = a750Var.e;
                yf80 yf80Var = new yf80(bool, d, num, new Integer(num4 != null ? num4.intValue() : a750.g), new Long(a750Var.a.a().c));
                this.a = 1;
                if (fj80Var.d(yf80Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(2, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((c) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.a));
            return Unit.a;
        }
    }

    static {
        kotlin.time.b.a aVar = kotlin.time.b.b;
        g = (int) kotlin.time.b.j(kotlin.time.c.h(24, rgf.HOURS), rgf.SECONDS);
        h = new Regex("/");
    }

    public a750(vwf0 vwf0Var, sph sphVar, xu0 xu0Var, aub aubVar, fj80 fj80Var) {
        vwf0Var.getClass();
        sphVar.getClass();
        xu0Var.getClass();
        aubVar.getClass();
        fj80Var.getClass();
        this.a = vwf0Var;
        this.b = sphVar;
        this.c = xu0Var;
        this.d = aubVar;
        this.e = fj80Var;
        this.f = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:52:0x013e, B:21:0x0048, B:44:0x00ab, B:46:0x00b5, B:49:0x00c0), top: B:57:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:52:0x013e, B:21:0x0048, B:44:0x00ab, B:46:0x00b5, B:49:0x00c0), top: B:57:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (r0.a(r15, r5, r3, r1) == r2) goto L51;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00c0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a750, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [quw] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3, types: [a750, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v10, types: [a750, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.zl80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.v1b<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a750.a(v1b):java.lang.Object");
    }

    @Override // defpackage.zl80
    public final Boolean b() {
        return this.e.c();
    }

    @Override // defpackage.zl80
    public final kotlin.time.b c() {
        Integer numE = this.e.e();
        if (numE == null) {
            return null;
        }
        kotlin.time.b.a aVar = kotlin.time.b.b;
        return new kotlin.time.b(kotlin.time.c.h(numE.intValue(), rgf.SECONDS));
    }

    @Override // defpackage.zl80
    public final Double d() {
        return this.e.a();
    }
}
