package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.twilio.voice.VoiceURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rph implements sph {
    public static final Object m = new Object();
    public final yoh a;
    public final mph b;
    public final ke00 c;
    public final wrh0 d;
    public final utr<o7n> e;
    public final mx30 f;
    public final Object g;
    public final ExecutorService h;
    public final nd80 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public rph() {
        throw null;
    }

    public rph(final yoh yohVar, n730 n730Var, ExecutorService executorService, nd80 nd80Var) {
        yohVar.a();
        mph mphVar = new mph(yohVar.a, n730Var);
        ke00 ke00Var = new ke00(yohVar);
        cdp cdpVar = cdp.a;
        if (cdpVar == null) {
            cdpVar = new cdp();
            cdp.a = cdpVar;
        }
        wrh0 wrh0Var = wrh0.b;
        if (wrh0Var == null) {
            wrh0Var = new wrh0(cdpVar);
            wrh0.b = wrh0Var;
        }
        utr<o7n> utrVar = new utr<>(new n730() { // from class: nph
            @Override // defpackage.n730
            public final Object get() {
                return new o7n(yohVar);
            }
        });
        mx30 mx30Var = new mx30();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = yohVar;
        this.b = mphVar;
        this.c = ke00Var;
        this.d = wrh0Var;
        this.e = utrVar;
        this.f = mx30Var;
        this.h = executorService;
        this.i = nd80Var;
    }

    public final void a() {
        yj1 yj1VarC;
        synchronized (m) {
            try {
                yoh yohVar = this.a;
                yohVar.a();
                d3c d3cVarC = d3c.c(yohVar.a);
                try {
                    yj1VarC = this.c.c();
                    ke00.a aVar = yj1VarC.c;
                    if (aVar == ke00.a.b || aVar == ke00.a.a) {
                        String strD = d(yj1VarC);
                        ke00 ke00Var = this.c;
                        yj1.a aVarH = yj1VarC.h();
                        aVarH.a = strD;
                        aVarH.b = ke00.a.c;
                        yj1VarC = aVarH.a();
                        ke00Var.b(yj1VarC);
                    }
                    if (d3cVarC != null) {
                        d3cVarC.d();
                    }
                } catch (Throwable th) {
                    if (d3cVarC != null) {
                        d3cVarC.d();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g(yj1VarC);
        this.i.execute(new Runnable() { // from class: qph
            @Override // java.lang.Runnable
            public final void run() {
                yj1 yj1VarC2;
                yj1 yj1VarE;
                rph rphVar = this.a;
                Object obj = rph.m;
                synchronized (obj) {
                    try {
                        yoh yohVar2 = rphVar.a;
                        yohVar2.a();
                        d3c d3cVarC2 = d3c.c(yohVar2.a);
                        try {
                            yj1VarC2 = rphVar.c.c();
                            if (d3cVarC2 != null) {
                                d3cVarC2.d();
                            }
                        } catch (Throwable th3) {
                            if (d3cVarC2 != null) {
                                d3cVarC2.d();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                try {
                    if (yj1VarC2.f() == ke00.a.e) {
                        yj1VarE = rphVar.e(yj1VarC2);
                    } else {
                        if (yj1VarC2.f() == ke00.a.c) {
                            yj1VarE = rphVar.e(yj1VarC2);
                        } else if (!rphVar.d.a(yj1VarC2)) {
                            return;
                        } else {
                            yj1VarE = rphVar.b(yj1VarC2);
                        }
                    }
                    synchronized (obj) {
                        try {
                            yoh yohVar3 = rphVar.a;
                            yohVar3.a();
                            d3c d3cVarC3 = d3c.c(yohVar3.a);
                            try {
                                rphVar.c.b(yj1VarE);
                                if (d3cVarC3 != null) {
                                    d3cVarC3.d();
                                }
                            } catch (Throwable th5) {
                                if (d3cVarC3 != null) {
                                    d3cVarC3.d();
                                }
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    synchronized (rphVar) {
                        if (rphVar.k.size() != 0 && !TextUtils.equals(yj1VarC2.b, yj1VarE.b)) {
                            Iterator it = rphVar.k.iterator();
                            while (it.hasNext()) {
                                ((fjh) it.next()).a();
                            }
                        }
                    }
                    if (yj1VarE.f() == ke00.a.d) {
                        String str = yj1VarE.b;
                        synchronized (rphVar) {
                            rphVar.j = str;
                        }
                    }
                    if (yj1VarE.f() == ke00.a.e) {
                        rphVar.f(new tph());
                        return;
                    }
                    ke00.a aVar2 = yj1VarE.c;
                    if (aVar2 == ke00.a.b || aVar2 == ke00.a.a) {
                        rphVar.f(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        rphVar.g(yj1VarE);
                    }
                } catch (tph e) {
                    rphVar.f(e);
                }
            }
        });
    }

    public final yj1 b(yj1 yj1Var) throws tph {
        int i;
        kl1 kl1Var;
        kl1 kl1VarF;
        mph mphVar = this.b;
        yoh yohVar = this.a;
        yohVar.a();
        String str = yohVar.c.a;
        String str2 = yj1Var.b;
        yoh yohVar2 = this.a;
        yohVar2.a();
        String str3 = yohVar2.c.g;
        String str4 = yj1Var.e;
        va50 va50Var = mphVar.c;
        if (!va50Var.a()) {
            throw new tph("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = mph.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new tph("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = mphVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    mph.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    va50Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        kl1VarF = mph.f(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    mph.b(httpURLConnectionC, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            byte b = (byte) (0 | 1);
                            qzf0.a aVar = qzf0.a.c;
                            if (b != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            kl1Var = new kl1(null, 0L, aVar);
                        } else {
                            if (responseCode == 429) {
                                throw new tph("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                byte b2 = (byte) (0 | 1);
                                qzf0.a aVar2 = qzf0.a.b;
                                if (b2 != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                kl1Var = new kl1(null, 0L, aVar2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        kl1VarF = kl1Var;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iOrdinal = kl1VarF.c.ordinal();
        if (iOrdinal == 0) {
            String str5 = kl1VarF.a;
            long j = kl1VarF.b;
            this.d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            yj1.a aVarH = yj1Var.h();
            aVarH.c = str5;
            aVarH.e = j;
            byte b3 = (byte) (aVarH.h | 1);
            aVarH.f = jCurrentTimeMillis;
            aVarH.h = (byte) (b3 | 2);
            return aVarH.a();
        }
        if (iOrdinal == 1) {
            yj1.a aVarH2 = yj1Var.h();
            aVarH2.g = "BAD CONFIG";
            aVarH2.b = ke00.a.e;
            return aVarH2.a();
        }
        if (iOrdinal != 2) {
            throw new tph("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.j = null;
        }
        yj1.a aVarH3 = yj1Var.h();
        aVarH3.b = ke00.a.b;
        return aVarH3.a();
    }

    public final void c() {
        yoh yohVar = this.a;
        yohVar.a();
        hm20.f(yohVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        yohVar.a();
        hm20.f(yohVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        yohVar.a();
        hm20.f(yohVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        yohVar.a();
        String str = yohVar.c.b;
        Pattern pattern = wrh0.a;
        hm20.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        yohVar.a();
        hm20.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", wrh0.a.matcher(yohVar.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[Catch: all -> 0x0040, DONT_GENERATE, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:10:0x002f, B:11:0x0031, B:15:0x003e, B:19:0x0042, B:20:0x0046, B:28:0x005a, B:12:0x0032, B:13:0x003b), top: B:33:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final String d(yj1 yj1Var) {
        o7n o7nVar;
        String string;
        yoh yohVar = this.a;
        yohVar.a();
        if (!yohVar.b.equals("CHIME_ANDROID_SDK")) {
            yoh yohVar2 = this.a;
            yohVar2.a();
            if ("[DEFAULT]".equals(yohVar2.b)) {
                if (yj1Var.c == ke00.a.a) {
                    o7nVar = this.e.get();
                    synchronized (o7nVar.a) {
                        try {
                            synchronized (o7nVar.a) {
                                string = o7nVar.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = o7nVar.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return mx30.a();
                }
            }
        } else if (yj1Var.c == ke00.a.a) {
            o7nVar = this.e.get();
            synchronized (o7nVar.a) {
                synchronized (o7nVar.a) {
                    string = o7nVar.a.getString("|S|id", null);
                    if (string != null) {
                        string = o7nVar.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return mx30.a();
                }
            }
        }
        this.f.getClass();
        return mx30.a();
    }

    public final yj1 e(yj1 yj1Var) throws tph {
        zi1 zi1VarE;
        String str = yj1Var.b;
        String string = null;
        if (str != null && str.length() == 11) {
            o7n o7nVar = this.e.get();
            synchronized (o7nVar.a) {
                try {
                    String[] strArr = o7n.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = o7nVar.a.getString("|T|" + o7nVar.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mph mphVar = this.b;
        yoh yohVar = this.a;
        yohVar.a();
        String str3 = yohVar.c.a;
        String str4 = yj1Var.b;
        yoh yohVar2 = this.a;
        yohVar2.a();
        String str5 = yohVar2.c.g;
        yoh yohVar3 = this.a;
        yohVar3.a();
        String str6 = yohVar3.c.b;
        va50 va50Var = mphVar.c;
        if (!va50Var.a()) {
            throw new tph("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = mph.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new tph("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = mphVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    mph.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    va50Var.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        zi1VarE = mph.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    mph.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new tph("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        zi1 zi1Var = new zi1(null, null, null, null, rnn.a.b);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        zi1VarE = zi1Var;
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int iOrdinal = zi1VarE.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new tph("Firebase Installations Service is unavailable. Please try again later.");
            }
            yj1.a aVarH = yj1Var.h();
            aVarH.g = "BAD CONFIG";
            aVarH.b = ke00.a.e;
            return aVarH.a();
        }
        String str7 = zi1VarE.b;
        String str8 = zi1VarE.c;
        this.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strB = zi1VarE.d.b();
        long jC = zi1VarE.d.c();
        yj1.a aVarH2 = yj1Var.h();
        aVarH2.a = str7;
        aVarH2.b = ke00.a.d;
        aVarH2.c = strB;
        aVarH2.d = str8;
        aVarH2.e = jC;
        byte b = (byte) (aVarH2.h | 1);
        aVarH2.f = jCurrentTimeMillis;
        aVarH2.h = (byte) (b | 2);
        return aVarH2.a();
    }

    public final void f(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((hxd0) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(yj1 yj1Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((hxd0) it.next()).b(yj1Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sph
    public final Task<String> getId() {
        String str;
        c();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d7k d7kVar = new d7k(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(d7kVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.h.execute(new Runnable() { // from class: oph
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        return task;
    }

    @Override // defpackage.sph
    public final Task getToken() {
        c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w2k w2kVar = new w2k(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(w2kVar);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new Runnable() { // from class: pph
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
        return task;
    }
}
