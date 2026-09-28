package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.c;
import com.google.firebase.remoteconfig.internal.e;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.ash;
import defpackage.jrh;
import defpackage.lrh;
import defpackage.n730;
import defpackage.noa;
import defpackage.sph;
import defpackage.yz;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static final int[] i = {2, 4, 8, 16, 32, 64, 128, 256};
    public final sph a;
    public final n730<yz> b;
    public final Executor c;
    public final Random d;
    public final noa e;
    public final ConfigFetchHttpClient f;
    public final e g;
    public final Map<String, String> h;

    public static class a {
        public final int a;
        public final b b;
        public final String c;

        public a(int i, b bVar, String str) {
            this.a = i;
            this.b = bVar;
            this.c = str;
        }
    }

    public c(sph sphVar, n730 n730Var, Executor executor, Random random, noa noaVar, ConfigFetchHttpClient configFetchHttpClient, e eVar, HashMap map) {
        this.a = sphVar;
        this.b = n730Var;
        this.c = executor;
        this.d = random;
        this.e = noaVar;
        this.f = configFetchHttpClient;
        this.g = eVar;
        this.h = map;
    }

    public final Task<a> a(final long j) {
        final HashMap map = new HashMap(this.h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return this.e.b().continueWithTask(this.c, new Continuation() { // from class: ooa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.a.c(task, j, map);
            }
        });
    }

    public final a b(String str, String str2, Date date, HashMap map) throws jrh, lrh, ash {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap mapE = e();
            String string = this.g.a.getString(dLRYz.QYwXuqhxFFlnq, null);
            yz yzVar = this.b.get();
            a aVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapE, string, map, yzVar != null ? (Long) yzVar.e(true).get("_fot") : null, date, this.g.b());
            b bVar = aVarFetch.b;
            if (bVar != null) {
                e eVar = this.g;
                long j = bVar.f;
                synchronized (eVar.b) {
                    eVar.a.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = aVarFetch.c;
            if (str4 != null) {
                e eVar2 = this.g;
                synchronized (eVar2.b) {
                    eVar2.a.edit().putString(dLRYz.QYwXuqhxFFlnq, str4).apply();
                }
            }
            this.g.d(0, e.f);
            return aVarFetch;
        } catch (ash e) {
            int i2 = e.a;
            e eVar3 = this.g;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = eVar3.a().a + 1;
                long millis = TimeUnit.MINUTES.toMillis(i[Math.min(i3, 8) - 1]);
                eVar3.d(i3, new Date(date.getTime() + (millis / 2) + ((long) this.d.nextInt((int) millis))));
            }
            e.a aVarA = eVar3.a();
            int i4 = e.a;
            if (aVarA.a > 1 || i4 == 429) {
                aVarA.b.getTime();
                throw new lrh("Fetch was throttled.");
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i4 == 429) {
                    throw new jrh("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new ash(e.a, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task c(Task task, long j, final HashMap map) {
        final c cVar;
        Task taskContinueWithTask;
        boolean zBefore;
        final Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        e eVar = this.g;
        if (zIsSuccessful) {
            Date date2 = new Date(eVar.a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(e.e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new a(2, null, null));
            }
        }
        Date date3 = eVar.a().b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((date4.getTime() - date.getTime()) / 1000);
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new lrh(str));
            cVar = this;
        } else {
            sph sphVar = this.a;
            final Task<String> id = sphVar.getId();
            final Task token = sphVar.getToken();
            cVar = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(executor, new Continuation() { // from class: poa
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    c cVar2 = this.a;
                    Date date5 = date;
                    HashMap map2 = map;
                    Task task3 = id;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new jrh("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = token;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new jrh("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        final c.a aVarB = cVar2.b((String) task3.getResult(), ((snn) task4.getResult()).a(), date5, map2);
                        return aVarB.a != 0 ? Tasks.forResult(aVarB) : cVar2.e.d(aVarB.b).onSuccessTask(cVar2.c, new SuccessContinuation() { // from class: soa
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            public final Task then(Object obj) {
                                return Tasks.forResult(aVarB);
                            }
                        });
                    } catch (krh e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new Continuation() { // from class: qoa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                c cVar2 = this.a;
                Date date5 = date;
                if (task2.isSuccessful()) {
                    e eVar2 = cVar2.g;
                    synchronized (eVar2.b) {
                        eVar2.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date5.getTime()).apply();
                    }
                    return task2;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    return task2;
                }
                boolean z = exception instanceof lrh;
                e eVar3 = cVar2.g;
                Object obj = eVar3.b;
                if (z) {
                    synchronized (obj) {
                        eVar3.a.edit().putInt("last_fetch_status", 2).apply();
                    }
                    return task2;
                }
                synchronized (obj) {
                    eVar3.a.edit().putInt("last_fetch_status", 1).apply();
                }
                return task2;
            }
        });
    }

    public final Task d(int i2) {
        final HashMap map = new HashMap(this.h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i2);
        return this.e.b().continueWithTask(this.c, new Continuation() { // from class: roa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.a.c(task, 0L, map);
            }
        });
    }

    public final HashMap e() {
        HashMap map = new HashMap();
        yz yzVar = this.b.get();
        if (yzVar != null) {
            for (Map.Entry<String, Object> entry : yzVar.e(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
