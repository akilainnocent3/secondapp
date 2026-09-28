package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.d;
import com.google.firebase.remoteconfig.internal.e;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import defpackage.dpa;
import defpackage.ijl;
import defpackage.iqh;
import defpackage.jrh;
import defpackage.krh;
import defpackage.noa;
import defpackage.sph;
import defpackage.tx5;
import defpackage.vg1;
import defpackage.yc0;
import defpackage.yoh;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class d {
    public static final int[] r = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public HttpURLConnection f;
    public com.google.firebase.remoteconfig.internal.a g;
    public final ScheduledExecutorService h;
    public final c i;
    public final yoh j;
    public final sph k;
    public final noa l;
    public final Context m;
    public final String n;
    public final e p;
    public boolean b = false;
    public final Random o = new Random();
    public boolean d = false;
    public boolean e = false;
    public final Object q = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zA;
            final d dVar = d.this;
            synchronized (dVar) {
                zA = dVar.a();
                if (zA) {
                    synchronized (dVar) {
                        dVar.b = true;
                    }
                }
            }
            if (zA) {
                if (new Date(System.currentTimeMillis()).before(dVar.p.c().b)) {
                    dVar.h();
                    return;
                }
                sph sphVar = dVar.k;
                final Task token = sphVar.getToken();
                final Task<String> id = sphVar.getId();
                final Task<TContinuationResult> taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id}).continueWithTask(dVar.h, new Continuation() { // from class: apa
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        URL url;
                        d dVar2 = dVar;
                        Task task2 = token;
                        if (!task2.isSuccessful()) {
                            return Tasks.forException(new jrh("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                        }
                        Task task3 = id;
                        try {
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new jrh("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                            }
                            try {
                                url = new URL(dVar2.c(dVar2.n));
                            } catch (MalformedURLException unused) {
                                Log.e("FirebaseRemoteConfig", "URL is malformed");
                                url = null;
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                            dVar2.i(httpURLConnection, (String) task3.getResult(), ((snn) task2.getResult()).a());
                            return Tasks.forResult(httpURLConnection);
                        } catch (IOException e) {
                            return Tasks.forException(new jrh("Failed to open HTTP stream connection", e));
                        }
                    }
                });
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskContinueWithTask}).continueWith(dVar.h, new Continuation() { // from class: zoa
                    /* JADX WARN: Code duplicated, block: B:102:0x013e A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
                    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
                    /* JADX WARN: Code duplicated, block: B:110:0x015c  */
                    /* JADX WARN: Code duplicated, block: B:116:0x0187  */
                    /* JADX WARN: Code duplicated, block: B:121:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:124:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:127:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
                    /* JADX WARN: Code duplicated, block: B:62:0x00c5 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0033, B:11:0x0036, B:12:0x0037, B:20:0x0053, B:60:0x00c1, B:62:0x00c5, B:64:0x00c8, B:68:0x00cc, B:69:0x00cd, B:63:0x00c6), top: B:123:0x000f, inners: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:69:0x00cd A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #4 {all -> 0x004a, blocks: (B:9:0x0033, B:11:0x0036, B:12:0x0037, B:20:0x0053, B:60:0x00c1, B:62:0x00c5, B:64:0x00c8, B:68:0x00cc, B:69:0x00cd, B:63:0x00c6), top: B:123:0x000f, inners: #3 }] */
                    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
                    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v1, types: [com.google.android.gms.tasks.Task] */
                    /* JADX WARN: Type inference failed for: r12v17 */
                    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r12v2 */
                    /* JADX WARN: Type inference failed for: r12v3 */
                    /* JADX WARN: Type inference failed for: r12v35, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r12v4 */
                    /* JADX WARN: Type inference failed for: r12v46 */
                    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.firebase.remoteconfig.internal.d] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r9v0 */
                    /* JADX WARN: Type inference failed for: r9v10 */
                    /* JADX WARN: Type inference failed for: r9v2 */
                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v4 */
                    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v6 */
                    /* JADX WARN: Type inference failed for: r9v7 */
                    /* JADX WARN: Type inference failed for: r9v8 */
                    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Integer, java.lang.Object] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) throws Throwable {
                        InputStream errorStream;
                        ?? r9;
                        ?? ValueOf;
                        ash ashVar;
                        ?? r13 = dVar;
                        ?? inputStream = taskContinueWithTask;
                        boolean z = true;
                        ?? r6 = 0;
                        try {
                            try {
                                if (!inputStream.isSuccessful()) {
                                    throw new IOException(inputStream.getException());
                                }
                                HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.getResult();
                                r13.f = httpURLConnection;
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    errorStream = r13.f.getErrorStream();
                                    try {
                                        int responseCode = r13.f.getResponseCode();
                                        ValueOf = Integer.valueOf(responseCode);
                                        if (responseCode == 200) {
                                            try {
                                                synchronized (r13) {
                                                    r13.c = 8;
                                                }
                                                r13.p.e(0, e.f);
                                                a aVarJ = r13.j(r13.f);
                                                r13.g = aVarJ;
                                                aVarJ.c();
                                            } catch (IOException e) {
                                                e = e;
                                                if (r13.e) {
                                                    synchronized (r13) {
                                                        r13.c = 8;
                                                    }
                                                } else {
                                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                                }
                                                r13.b(inputStream, errorStream);
                                                synchronized (r13) {
                                                    r13.b = false;
                                                }
                                                if (r13.e || (ValueOf != 0 && !d.d(ValueOf.intValue()))) {
                                                    z = false;
                                                }
                                                if (z) {
                                                    r13.k(new Date(System.currentTimeMillis()));
                                                }
                                                if (!z || ValueOf.intValue() == 200) {
                                                    r13.h();
                                                } else {
                                                    String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                                    if (ValueOf.intValue() == 403) {
                                                        strF = d.f(r13.f.getErrorStream());
                                                    }
                                                    ashVar = new ash(ValueOf.intValue(), 0, strF);
                                                }
                                                r13.f = null;
                                                r13.g = null;
                                                return Tasks.forResult(null);
                                            }
                                        }
                                        r13.b(inputStream, errorStream);
                                        synchronized (r13) {
                                            r13.b = false;
                                        }
                                        z = !r13.e && d.d(responseCode);
                                        if (z) {
                                            r13.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z || responseCode == 200) {
                                            r13.h();
                                        } else {
                                            String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (responseCode == 403) {
                                                strF2 = d.f(r13.f.getErrorStream());
                                            }
                                            ashVar = new ash(responseCode, 0, strF2);
                                            r13.g(ashVar);
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        ValueOf = 0;
                                    } catch (Throwable th) {
                                        th = th;
                                        ValueOf = 0;
                                        r6 = inputStream;
                                        r9 = ValueOf;
                                        r13.b(r6, errorStream);
                                        synchronized (r13) {
                                            r13.b = false;
                                            if (r13.e) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                r13.k(new Date(System.currentTimeMillis()));
                                            }
                                            if (z) {
                                                r13.h();
                                            } else {
                                                r13.h();
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    errorStream = null;
                                    inputStream = inputStream;
                                    ValueOf = errorStream;
                                    if (r13.e) {
                                        synchronized (r13) {
                                            r13.c = 8;
                                        }
                                    } else {
                                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                    }
                                    r13.b(inputStream, errorStream);
                                    synchronized (r13) {
                                        r13.b = false;
                                        if (r13.e) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            r13.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (z) {
                                        }
                                        r13.h();
                                        r13.f = null;
                                        r13.g = null;
                                        return Tasks.forResult(null);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    errorStream = null;
                                    ValueOf = 0;
                                }
                                r13.f = null;
                                r13.g = null;
                                return Tasks.forResult(null);
                            } catch (Throwable th3) {
                                th = th3;
                                r6 = inputStream;
                                r9 = ValueOf;
                                r13.b(r6, errorStream);
                                synchronized (r13) {
                                    r13.b = false;
                                }
                                if (r13.e || (r9 != 0 && !d.d(r9.intValue()))) {
                                    z = false;
                                }
                                if (z) {
                                    r13.k(new Date(System.currentTimeMillis()));
                                }
                                if (z || r9.intValue() == 200) {
                                    r13.h();
                                } else {
                                    String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r9);
                                    if (r9.intValue() == 403) {
                                        strF3 = d.f(r13.f.getErrorStream());
                                    }
                                    r13.g(new ash(r9.intValue(), 0, strF3));
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            inputStream = 0;
                            errorStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            errorStream = null;
                            r9 = 0;
                            r13.b(r6, errorStream);
                            synchronized (r13) {
                                r13.b = false;
                                if (r13.e) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    r13.k(new Date(System.currentTimeMillis()));
                                }
                                if (z) {
                                    r13.h();
                                } else {
                                    r13.h();
                                }
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    public d(yoh yohVar, sph sphVar, c cVar, noa noaVar, Context context, String str, LinkedHashSet linkedHashSet, e eVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.h = scheduledExecutorService;
        this.c = Math.max(8 - eVar.c().a, 1);
        this.j = yohVar;
        this.i = cVar;
        this.k = sphVar;
        this.l = noaVar;
        this.m = context;
        this.n = str;
        this.p = eVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public final synchronized boolean a() {
        return (this.a.isEmpty() || this.b || this.d || this.e) ? false : true;
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e);
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
                Log.d("FirebaseRemoteConfig", "Error closing connection stream.", e2);
            }
        }
    }

    public final String c(String str) {
        yoh yohVar = this.j;
        yohVar.a();
        Matcher matcher = s.matcher(yohVar.c.b);
        return tx5.a("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.h.schedule(new a(), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new jrh("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(krh krhVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dpa) it.next()).a(krhVar);
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.p.c().b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    public final void i(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        String strA;
        httpURLConnection.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        yoh yohVar = this.j;
        yohVar.a();
        iqh iqhVar = yohVar.c;
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", iqhVar.a);
        Context context = this.m;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] bArrA = yc0.a(context, context.getPackageName());
            if (bArrA == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strA = null;
            } else {
                strA = ijl.a(bArrA);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + context.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strA);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", Constants.APP_JSON_PAYLOAD_TYPE);
        httpURLConnection.setRequestProperty("Accept", Constants.APP_JSON_PAYLOAD_TYPE);
        HashMap map = new HashMap();
        yohVar.a();
        Matcher matcher = s.matcher(iqhVar.b);
        map.put("project", matcher.matches() ? matcher.group(1) : null);
        map.put("namespace", this.n);
        map.put("lastKnownVersionNumber", Long.toString(this.i.g.a.getLong("last_template_version", 0L)));
        yohVar.a();
        map.put("appId", iqhVar.b);
        map.put("sdkVersion", "23.0.0");
        map.put("appInstanceId", str);
        byte[] bytes = new JSONObject(map).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final synchronized com.google.firebase.remoteconfig.internal.a j(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.a(httpURLConnection, this.i, this.l, this.a, new b(), this.h, this.p);
    }

    public final void k(Date date) {
        e eVar = this.p;
        int i = eVar.c().a + 1;
        long millis = TimeUnit.MINUTES.toMillis(r[(i < 8 ? i : 8) - 1]);
        eVar.e(i, new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))));
    }

    public class b implements dpa {
        public b() {
        }

        @Override // defpackage.dpa
        public final void a(krh krhVar) {
            d dVar = d.this;
            synchronized (dVar) {
                dVar.d = true;
            }
            d.this.g(krhVar);
        }

        @Override // defpackage.dpa
        public final void b(vg1 vg1Var) {
        }
    }
}
