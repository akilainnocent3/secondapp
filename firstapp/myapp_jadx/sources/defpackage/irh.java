package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class irh {
    public final Context a;
    public final hoh b;
    public final Executor c;
    public final noa d;
    public final noa e;
    public final noa f;
    public final c g;
    public final uoa h;
    public final e i;
    public final sph j;
    public final yoa k;
    public final cv50 l;

    public irh(Context context, sph sphVar, hoh hohVar, Executor executor, noa noaVar, noa noaVar2, noa noaVar3, c cVar, uoa uoaVar, e eVar, yoa yoaVar, cv50 cv50Var) {
        this.a = context;
        this.j = sphVar;
        this.b = hohVar;
        this.c = executor;
        this.d = noaVar;
        this.e = noaVar2;
        this.f = noaVar3;
        this.g = cVar;
        this.h = uoaVar;
        this.i = eVar;
        this.k = yoaVar;
        this.l = cv50Var;
    }

    public static ArrayList f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        csh cshVar;
        HashSet<String> hashSet = new HashSet();
        uoa uoaVar = this.h;
        noa noaVar = uoaVar.c;
        hashSet.addAll(uoa.b(noaVar));
        noa noaVar2 = uoaVar.d;
        hashSet.addAll(uoa.b(noaVar2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String strC = uoa.c(noaVar, str);
            if (strC != null) {
                uoaVar.a(str, noaVar.c());
                cshVar = new csh(strC, 2);
            } else {
                String strC2 = uoa.c(noaVar2, str);
                if (strC2 != null) {
                    cshVar = new csh(strC2, 1);
                } else {
                    uoa.d(str, "FirebaseRemoteConfigValue");
                    cshVar = new csh("", 0);
                }
            }
            map.put(str, cshVar);
        }
        return map;
    }

    public final mrh b() {
        mrh mrhVar;
        e eVar = this.i;
        synchronized (eVar.b) {
            try {
                long j = eVar.a.getLong("last_fetch_time_in_millis", -1L);
                int i = eVar.a.getInt("last_fetch_status", 0);
                long j2 = eVar.a.getLong("fetch_timeout_in_seconds", 60L);
                if (j2 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                }
                long j3 = eVar.a.getLong("minimum_fetch_interval_in_seconds", 43200L);
                if (j3 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j3 + " is an invalid argument");
                }
                mrhVar = new mrh(j, i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mrhVar;
    }

    public final long c(String str) {
        Long lValueOf;
        uoa uoaVar = this.h;
        noa noaVar = uoaVar.c;
        b bVarC = noaVar.c();
        Long lValueOf2 = null;
        if (bVarC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(bVarC.b.getLong(str));
            } catch (JSONException unused) {
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            uoaVar.a(str, noaVar.c());
            return lValueOf.longValue();
        }
        b bVarC2 = uoaVar.d.c();
        if (bVarC2 != null) {
            try {
                lValueOf2 = Long.valueOf(bVarC2.b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        uoa.d(str, "Long");
        return 0L;
    }

    public final String d(String str) {
        uoa uoaVar = this.h;
        noa noaVar = uoaVar.c;
        String strC = uoa.c(noaVar, str);
        if (strC != null) {
            uoaVar.a(str, noaVar.c());
            return strC;
        }
        String strC2 = uoa.c(uoaVar.d, str);
        if (strC2 != null) {
            return strC2;
        }
        uoa.d(str, "String");
        return "";
    }

    public final void e(boolean z) {
        HttpURLConnection httpURLConnection;
        yoa yoaVar = this.k;
        synchronized (yoaVar) {
            d dVar = yoaVar.b;
            synchronized (dVar.q) {
                try {
                    dVar.e = z;
                    a aVar = dVar.g;
                    if (aVar != null) {
                        aVar.i = z;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = dVar.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                yoaVar.a();
            }
        }
    }
}
