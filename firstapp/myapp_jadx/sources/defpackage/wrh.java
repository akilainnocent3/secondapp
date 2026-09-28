package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import yoa.a;

/* JADX INFO: loaded from: classes4.dex */
public final class wrh implements k650 {
    public final str<irh> a;
    public final JsonSerializeService b;
    public final v5b c;
    public final t340 d;
    public final b390 e;

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$globalUpdateFlow$1", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ez20<? super Set<String>>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: wrh$a$a, reason: collision with other inner class name */
        public static final class C1264a implements dpa {
            public final /* synthetic */ ez20<Set<String>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C1264a(ez20<? super Set<String>> ez20Var) {
                this.a = ez20Var;
            }

            @Override // defpackage.dpa
            public final void a(krh krhVar) {
                itf0.a aVar = itf0.a;
                aVar.q("FirebaseRemoteConfigRep");
                aVar.e(krhVar);
            }

            @Override // defpackage.dpa
            public final void b(vg1 vg1Var) {
                this.a.c(vg1Var.a);
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = wrh.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ez20<? super Set<String>> ez20Var, v1b<? super Unit> v1bVar) {
            return ((a) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            yoa.a aVar;
            ez20 ez20Var = (ez20) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                irh irhVar = wrh.this.a.get();
                C1264a c1264a = new C1264a(ez20Var);
                yoa yoaVar = irhVar.k;
                synchronized (yoaVar) {
                    yoaVar.a.add(c1264a);
                    yoaVar.a();
                    aVar = yoaVar.new a(c1264a);
                }
                m74 m74Var = new m74(aVar, i2);
                this.b = null;
                this.a = 1;
                if (az20.a(ez20Var, m74Var, this) == y5bVar) {
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

    public wrh(str<irh> strVar, JsonSerializeService jsonSerializeService, @ApplicationScope v5b v5bVar) {
        strVar.getClass();
        jsonSerializeService.getClass();
        v5bVar.getClass();
        this.a = strVar;
        this.b = jsonSerializeService;
        this.c = v5bVar;
        this.d = e1i.d(hzh.a(new a(null)), v5bVar, new mwd0(0L, Long.MAX_VALUE), 0);
        this.e = d390.a(0, 1, pb5.b);
    }

    @Override // defpackage.k650
    public final yzh a() {
        cq40 cq40Var = new cq40();
        cq40Var.a = -1L;
        return new yzh(new srh(new xzh(r0i.a(hzh.a(new rrh(new orh(this, 0), null)), new trh(this, null)), new urh(cq40Var, this, null)), this, cq40Var), new vrh(3, null));
    }

    @Override // defpackage.k650
    public final boolean b(String str) {
        uoa uoaVar = this.a.get().h;
        Pattern pattern = uoa.f;
        Pattern pattern2 = uoa.e;
        noa noaVar = uoaVar.c;
        String strC = uoa.c(noaVar, str);
        if (strC != null) {
            if (pattern2.matcher(strC).matches()) {
                uoaVar.a(str, noaVar.c());
                return true;
            }
            if (pattern.matcher(strC).matches()) {
                uoaVar.a(str, noaVar.c());
                return false;
            }
        }
        String strC2 = uoa.c(uoaVar.d, str);
        if (strC2 != null) {
            if (pattern2.matcher(strC2).matches()) {
                return true;
            }
            if (pattern.matcher(strC2).matches()) {
                return false;
            }
        }
        uoa.d(str, "Boolean");
        return false;
    }

    @Override // defpackage.k650
    public final long c(String str) {
        str.getClass();
        return this.a.get().c(str);
    }

    @Override // defpackage.k650
    public final xzh d(Type type) {
        type.getClass();
        return new xzh(new yrh(r0i.e(new xrh(this.d), this.e), this, type), new zrh(this, type, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c A[Catch: IOException -> 0x001f, XmlPullParserException -> 0x0022, TryCatch #3 {IOException -> 0x001f, XmlPullParserException -> 0x0022, blocks: (B:3:0x0012, B:5:0x0018, B:10:0x0025, B:15:0x0039, B:41:0x0091, B:18:0x0041, B:22:0x0051, B:23:0x0055, B:29:0x0063, B:40:0x008c, B:34:0x0072, B:36:0x007a, B:37:0x007f, B:39:0x0087), top: B:51:0x0012 }] */
    @Override // defpackage.k650
    public final void e() {
        irh irhVar = this.a.get();
        Context context = irhVar.a;
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String name = null;
                String text = null;
                String text2 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        name = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (text == null || text2 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                map.put(text, text2);
                            }
                            text = null;
                            text2 = null;
                        }
                        name = null;
                    } else if (eventType == 4 && name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != 106079) {
                            if (iHashCode == 111972721 && name.equals("value")) {
                                text2 = xml.getText();
                            } else {
                                Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                            }
                        } else if (name.equals("key")) {
                            text = xml.getText();
                        } else {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        }
                    }
                }
            }
        } catch (IOException e) {
            e = e;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        } catch (XmlPullParserException e2) {
            e = e2;
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e);
        }
        try {
            b.a aVarC = b.c();
            aVarC.a = new JSONObject(map);
            irhVar.f.d(aVarC.a()).onSuccessTask(jph.a, new erh());
        } catch (JSONException e3) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
            Tasks.forResult(null);
        }
    }

    @Override // defpackage.k650
    public final <T> T f(String str, Type type) {
        type.getClass();
        try {
            String strG = g(str);
            if (strG.length() <= 0) {
                strG = null;
            }
            if (strG != null) {
                return (T) this.b.fromJson(strG, type);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // defpackage.k650
    public final String g(String str) {
        return this.a.get().d(str);
    }

    @Override // defpackage.k650
    public final double h(String str) {
        Double dValueOf;
        uoa uoaVar = this.a.get().h;
        noa noaVar = uoaVar.c;
        b bVarC = noaVar.c();
        Double dValueOf2 = null;
        if (bVarC == null) {
            dValueOf = null;
        } else {
            try {
                dValueOf = Double.valueOf(bVarC.b.getDouble(str));
            } catch (JSONException unused) {
                dValueOf = null;
            }
        }
        if (dValueOf != null) {
            uoaVar.a(str, noaVar.c());
            return dValueOf.doubleValue();
        }
        b bVarC2 = uoaVar.d.c();
        if (bVarC2 != null) {
            try {
                dValueOf2 = Double.valueOf(bVarC2.b.getDouble(str));
            } catch (JSONException unused2) {
            }
        }
        if (dValueOf2 != null) {
            return dValueOf2.doubleValue();
        }
        uoa.d(str, "Double");
        return 0.0d;
    }

    public final long i() {
        mrh mrhVarB = this.a.get().b();
        if (mrhVarB.b != -1) {
            mrhVarB = null;
        }
        if (mrhVarB == null) {
            return -1L;
        }
        long j = mrhVarB.a;
        Long lValueOf = j >= 0 ? Long.valueOf(j) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return -1L;
    }

    public final Object j(Type type) {
        Class cls = Boolean.TYPE;
        if (Intrinsics.g(type, cls) || Intrinsics.g(type, Boolean.class) || Intrinsics.g(type, cls)) {
            return Boolean.valueOf(b("url_configs"));
        }
        if (Intrinsics.g(type, String.class) || Intrinsics.g(type, String.class)) {
            return g("url_configs");
        }
        Class cls2 = Long.TYPE;
        if (Intrinsics.g(type, cls2) || Intrinsics.g(type, Long.class) || Intrinsics.g(type, cls2)) {
            return Long.valueOf(c("url_configs"));
        }
        Class cls3 = Double.TYPE;
        if (Intrinsics.g(type, cls3) || Intrinsics.g(type, Double.class) || Intrinsics.g(type, cls3)) {
            return Double.valueOf(h("url_configs"));
        }
        try {
            return f("url_configs", type);
        } catch (Exception unused) {
            zqh0.a(type, "Unknown type ", " for key url_configs");
            return null;
        }
    }
}
