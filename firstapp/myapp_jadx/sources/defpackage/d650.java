package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import com.twilio.voice.EventKeys;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d650 implements nrh {
    public static final Random j = new Random();
    public static final HashMap k = new HashMap();
    public final HashMap a;
    public final Context b;
    public final ScheduledExecutorService c;
    public final yoh d;
    public final sph e;
    public final hoh f;
    public final n730<yz> g;
    public final String h;
    public final HashMap i;

    public static class a implements ks1.a {
        public static final AtomicReference<a> a = new AtomicReference<>();

        @Override // ks1.a
        public final void a(boolean z) {
            Random random = d650.j;
            synchronized (d650.class) {
                Iterator it = d650.k.values().iterator();
                while (it.hasNext()) {
                    ((irh) it.next()).e(z);
                }
            }
        }
    }

    public d650() {
        throw null;
    }

    public d650(Context context, ScheduledExecutorService scheduledExecutorService, yoh yohVar, sph sphVar, hoh hohVar, n730<yz> n730Var) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = yohVar;
        this.e = sphVar;
        this.f = hohVar;
        this.g = n730Var;
        yohVar.a();
        this.h = yohVar.c.b;
        AtomicReference<a> atomicReference = a.a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference<a> atomicReference2 = a.a;
        if (atomicReference2.get() == null) {
            a aVar = new a();
            while (!atomicReference2.compareAndSet(null, aVar)) {
                if (atomicReference2.get() != null) {
                }
            }
            ks1.b(application);
            ks1.e.a(aVar);
        }
        Tasks.call(scheduledExecutorService, new Callable() { // from class: b650
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c("firebase");
            }
        });
    }

    @Override // defpackage.nrh
    public final void a(final yu50 yu50Var) {
        final cv50 cv50Var = c("firebase").l;
        cv50Var.d.add(yu50Var);
        final Task<b> taskB = cv50Var.a.b();
        taskB.addOnSuccessListener(cv50Var.c, new OnSuccessListener() { // from class: av50
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                cv50 cv50Var2 = cv50Var;
                Task task = taskB;
                final yu50 yu50Var2 = yu50Var;
                try {
                    b bVar = (b) task.getResult();
                    if (bVar != null) {
                        final kk1 kk1VarA = cv50Var2.b.a(bVar);
                        cv50Var2.c.execute(new Runnable() { // from class: bv50
                            @Override // java.lang.Runnable
                            public final void run() {
                                yu50Var2.a(kk1VarA);
                            }
                        });
                    }
                } catch (krh e) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized irh b(yoh yohVar, String str, sph sphVar, hoh hohVar, Executor executor, noa noaVar, noa noaVar2, noa noaVar3, c cVar, uoa uoaVar, e eVar, cv50 cv50Var) {
        String str2;
        yoh yohVar2;
        hoh hohVar2;
        Context context;
        if (this.a.containsKey(str)) {
            str2 = str;
        } else {
            Context context2 = this.b;
            if (str.equals("firebase")) {
                yohVar.a();
                yohVar2 = yohVar;
                if (yohVar2.b.equals("[DEFAULT]")) {
                    hohVar2 = hohVar;
                }
                context = this.b;
                synchronized (this) {
                    str2 = str;
                    irh irhVar = new irh(context2, sphVar, hohVar2, executor, noaVar, noaVar2, noaVar3, cVar, uoaVar, eVar, new yoa(yohVar2, sphVar, cVar, noaVar2, context, str, eVar, this.c), cv50Var);
                    noaVar2.b();
                    noaVar3.b();
                    noaVar.b();
                    this.a.put(str2, irhVar);
                    k.put(str2, irhVar);
                }
            } else {
                yohVar2 = yohVar;
            }
            hohVar2 = null;
            context = this.b;
            synchronized (this) {
                str2 = str;
                irh irhVar2 = new irh(context2, sphVar, hohVar2, executor, noaVar, noaVar2, noaVar3, cVar, uoaVar, eVar, new yoa(yohVar2, sphVar, cVar, noaVar2, context, str, eVar, this.c), cv50Var);
                noaVar2.b();
                noaVar3.b();
                noaVar.b();
                this.a.put(str2, irhVar2);
                k.put(str2, irhVar2);
            }
        }
        return (irh) this.a.get(str2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    public final synchronized irh c(String str) throws Throwable {
        Throwable th;
        final nr00 nr00Var;
        try {
            try {
                noa noaVarD = d(str, "fetch");
                noa noaVarD2 = d(str, "activate");
                noa noaVarD3 = d(str, "defaults");
                try {
                    e eVar = new e(this.b.getSharedPreferences("frc_" + this.h + "_" + str + "_settings", 0));
                    uoa uoaVar = new uoa(this.c, noaVarD2, noaVarD3);
                    yoh yohVar = this.d;
                    n730<yz> n730Var = this.g;
                    yohVar.a();
                    if (yohVar.b.equals("[DEFAULT]")) {
                        try {
                            if (str.equals("firebase")) {
                                nr00Var = new nr00(n730Var);
                            } else {
                                nr00Var = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        nr00Var = null;
                    }
                    if (nr00Var != null) {
                        j54 j54Var = new j54() { // from class: a650
                            @Override // defpackage.j54
                            public final void accept(Object obj, Object obj2) {
                                JSONObject jSONObjectOptJSONObject;
                                nr00 nr00Var2 = nr00Var;
                                String str2 = (String) obj;
                                b bVar = (b) obj2;
                                yz yzVar = nr00Var2.a.get();
                                if (yzVar == null) {
                                    return;
                                }
                                JSONObject jSONObject = bVar.e;
                                if (jSONObject.length() < 1) {
                                    return;
                                }
                                JSONObject jSONObject2 = bVar.b;
                                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                    if (strOptString.isEmpty()) {
                                        return;
                                    }
                                    synchronized (nr00Var2.b) {
                                        try {
                                            if (strOptString.equals(nr00Var2.b.get(str2))) {
                                                return;
                                            }
                                            nr00Var2.b.put(str2, strOptString);
                                            Bundle bundleA = mll0.a("arm_key", str2);
                                            bundleA.putString("arm_value", jSONObject2.optString(str2));
                                            bundleA.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                            bundleA.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                            bundleA.putString(EventKeys.EVENT_GROUP, jSONObjectOptJSONObject.optString(EventKeys.EVENT_GROUP));
                                            yzVar.c("fp", "personalization_assignment", bundleA);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("_fpid", strOptString);
                                            yzVar.c("fp", "_fpc", bundle);
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        };
                        synchronized (uoaVar.a) {
                            uoaVar.a.add(j54Var);
                        }
                    }
                    xu50 xu50Var = new xu50();
                    xu50Var.a = noaVarD2;
                    xu50Var.b = noaVarD3;
                    ScheduledExecutorService scheduledExecutorService = this.c;
                    cv50 cv50Var = new cv50();
                    cv50Var.d = Collections.newSetFromMap(new ConcurrentHashMap());
                    cv50Var.a = noaVarD2;
                    cv50Var.b = xu50Var;
                    cv50Var.c = scheduledExecutorService;
                    return b(this.d, str, this.e, this.f, this.c, noaVarD, noaVarD2, noaVarD3, e(str, noaVarD, eVar), uoaVar, eVar, cv50Var);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    public final noa d(String str, String str2) {
        cpa cpaVar;
        noa noaVar;
        String strA = uf80.a(ux5.a("frc_", this.h, "_", str, "_"), str2, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = cpa.c;
        synchronized (cpa.class) {
            try {
                HashMap map2 = cpa.c;
                if (!map2.containsKey(strA)) {
                    map2.put(strA, new cpa(context, strA));
                }
                cpaVar = (cpa) map2.get(strA);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = noa.d;
        synchronized (noa.class) {
            try {
                String str3 = cpaVar.b;
                HashMap map4 = noa.d;
                if (!map4.containsKey(str3)) {
                    map4.put(str3, new noa(scheduledExecutorService, cpaVar));
                }
                noaVar = (noa) map4.get(str3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return noaVar;
    }

    public final synchronized c e(String str, noa noaVar, e eVar) {
        sph sphVar;
        n730 c650Var;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str2;
        yoh yohVar;
        try {
            sphVar = this.e;
            yoh yohVar2 = this.d;
            yohVar2.a();
            c650Var = yohVar2.b.equals("[DEFAULT]") ? this.g : new c650();
            scheduledExecutorService = this.c;
            random = j;
            yoh yohVar3 = this.d;
            yohVar3.a();
            str2 = yohVar3.c.a;
            yohVar = this.d;
            yohVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new c(sphVar, c650Var, scheduledExecutorService, random, noaVar, new ConfigFetchHttpClient(this.b, yohVar.c.b, str2, str, eVar.a.getLong("fetch_timeout_in_seconds", 60L), eVar.a.getLong("fetch_timeout_in_seconds", 60L)), eVar, this.i);
    }
}
