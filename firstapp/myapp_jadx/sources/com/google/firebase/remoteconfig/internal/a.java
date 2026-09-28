package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import defpackage.ash;
import defpackage.dpa;
import defpackage.jrh;
import defpackage.krh;
import defpackage.noa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final LinkedHashSet a;
    public final HttpURLConnection b;
    public final c c;
    public final noa d;
    public final d.b e;
    public final ScheduledExecutorService f;
    public final e h;
    public final Random g = new Random();
    public boolean i = false;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.internal.a$a, reason: collision with other inner class name */
    public class RunnableC0199a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        public RunnableC0199a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final a aVar = a.this;
            int i = this.a;
            final long j = this.b;
            synchronized (aVar) {
                final int i2 = i - 1;
                final Task taskD = aVar.c.d(3 - i2);
                final Task<b> taskB = aVar.d.b();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskB}).continueWithTask(aVar.f, new Continuation() { // from class: joa
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) throws JSONException {
                        Boolean boolValueOf;
                        a aVar2 = aVar;
                        Task task2 = taskD;
                        Task task3 = taskB;
                        long j2 = j;
                        int i3 = i2;
                        if (!task2.isSuccessful()) {
                            return Tasks.forException(new jrh("Failed to auto-fetch config update.", task2.getException()));
                        }
                        if (!task3.isSuccessful()) {
                            return Tasks.forException(new jrh("Failed to get activated config for auto-fetch", task3.getException()));
                        }
                        c.a aVar3 = (c.a) task2.getResult();
                        b bVarA = (b) task3.getResult();
                        b bVar = aVar3.b;
                        if (bVar != null) {
                            boolValueOf = Boolean.valueOf(bVar.f >= j2);
                        } else {
                            boolValueOf = Boolean.valueOf(aVar3.a == 1);
                        }
                        if (!boolValueOf.booleanValue()) {
                            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                            aVar2.a(i3, j2);
                            return Tasks.forResult(null);
                        }
                        if (aVar3.b == null) {
                            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                            return Tasks.forResult(null);
                        }
                        if (bVarA == null) {
                            bVarA = b.c().a();
                        }
                        b bVar2 = aVar3.b;
                        JSONObject jSONObject = bVarA.e;
                        JSONObject jSONObject2 = bVar2.a;
                        JSONObject jSONObject3 = bVar2.b;
                        JSONObject jSONObject4 = bVar2.e;
                        JSONObject jSONObject5 = b.a(new JSONObject(jSONObject2.toString())).b;
                        HashMap mapB = bVarA.b();
                        HashMap mapB2 = bVar2.b();
                        HashSet hashSet = new HashSet();
                        JSONObject jSONObject6 = bVarA.b;
                        Iterator<String> itKeys = jSONObject6.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!jSONObject3.has(next)) {
                                hashSet.add(next);
                            } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                hashSet.add(next);
                            } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject5.remove(next);
                            }
                        }
                        Iterator<String> itKeys2 = jSONObject5.keys();
                        while (itKeys2.hasNext()) {
                            hashSet.add(itKeys2.next());
                        }
                        if (hashSet.isEmpty()) {
                            Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                            return Tasks.forResult(null);
                        }
                        vg1 vg1Var = new vg1(hashSet);
                        synchronized (aVar2) {
                            Iterator it = aVar2.a.iterator();
                            while (it.hasNext()) {
                                ((dpa) it.next()).b(vg1Var);
                            }
                        }
                        return Tasks.forResult(null);
                    }
                });
            }
        }
    }

    public a(HttpURLConnection httpURLConnection, c cVar, noa noaVar, LinkedHashSet linkedHashSet, d.b bVar, ScheduledExecutorService scheduledExecutorService, e eVar) {
        this.b = httpURLConnection;
        this.c = cVar;
        this.d = noaVar;
        this.a = linkedHashSet;
        this.e = bVar;
        this.f = scheduledExecutorService;
        this.h = eVar;
    }

    public final void a(int i, long j) {
        if (i == 0) {
            d(new ash("Unable to fetch the latest version of the template."));
            return;
        }
        this.f.schedule(new RunnableC0199a(i, j), this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strConcat = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strConcat = strConcat.concat(line);
            if (line.contains("}")) {
                int iIndexOf = strConcat.indexOf(123);
                int iLastIndexOf = strConcat.lastIndexOf(125);
                strConcat = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strConcat.substring(iIndexOf, iLastIndexOf + 1);
                if (strConcat.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strConcat);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            this.e.a(new ash("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.c.g.a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strConcat = "";
                    } catch (JSONException e) {
                        d(new jrh("Unable to parse config update message.", e.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e);
                }
            } catch (IOException e2) {
                if (!this.i) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
                }
            }
            throw th;
        }
    }

    public final synchronized void d(krh krhVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dpa) it.next()).a(krhVar);
        }
    }

    public final synchronized void e(int i) {
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (((long) i) * 1000));
        e eVar = this.h;
        synchronized (eVar.d) {
            eVar.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
