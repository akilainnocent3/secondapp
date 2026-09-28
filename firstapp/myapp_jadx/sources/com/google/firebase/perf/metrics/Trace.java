package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import defpackage.avg0;
import defpackage.bpa;
import defpackage.hb5;
import defpackage.hf80;
import defpackage.p80;
import defpackage.pd00;
import defpackage.pjh;
import defpackage.rh6;
import defpackage.ts7;
import defpackage.tt0;
import defpackage.tug;
import defpackage.ut0;
import defpackage.yig0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class Trace extends ut0 implements Parcelable, hf80 {
    public static final p80 B = p80.d();
    public static final Parcelable.Creator<Trace> CREATOR;
    public Timer A;
    public final WeakReference<hf80> a;
    public final Trace b;
    public final GaugeManager c;
    public final String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public final List<PerfSession> i;
    public final ArrayList v;
    public final avg0 w;
    public final ts7 y;
    public Timer z;

    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : tt0.a());
        this.a = new WeakReference<>(this);
        this.b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.z = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.A = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.i = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.w = null;
            this.y = null;
            this.c = null;
        } else {
            this.w = avg0.H;
            this.y = new ts7();
            this.c = GaugeManager.getInstance();
        }
    }

    @Override // defpackage.hf80
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            B.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.z == null || e()) {
                return;
            }
            this.i.add(perfSession);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.A != null;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.z != null) && !e()) {
                B.g("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public String getAttribute(String str) {
        return (String) this.f.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.b.get();
    }

    public void incrementMetric(String str, long j) {
        String strC = pd00.c(str);
        p80 p80Var = B;
        if (strC != null) {
            p80Var.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.z;
        String str2 = this.d;
        if (timer == null) {
            p80Var.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (e()) {
            p80Var.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.b;
        atomicLong.addAndGet(j);
        p80Var.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f;
        p80 p80Var = B;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zE = e();
            String str3 = this.d;
            if (zE) {
                Locale locale = Locale.ENGLISH;
                hb5.a(tug.a("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                pd00.b(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                hb5.a("Exceeds max limit of number of attributes - 5");
            }
            p80Var.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            p80Var.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    public void putMetric(String str, long j) {
        String strC = pd00.c(str);
        p80 p80Var = B;
        if (strC != null) {
            p80Var.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.z;
        String str2 = this.d;
        if (timer == null) {
            p80Var.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (e()) {
            p80Var.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.b.set(j);
        p80Var.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    public void removeAttribute(String str) {
        if (!e()) {
            this.f.remove(str);
            return;
        }
        p80 p80Var = B;
        if (p80Var.b) {
            p80Var.a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public void start() {
        String str;
        String str2;
        boolean zO = bpa.e().o();
        p80 p80Var = B;
        if (!zO) {
            p80Var.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = pd00.a;
        String str3 = this.d;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] iArrC = pjh.c(6);
            int length = iArrC.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    switch (iArrC[i]) {
                        case 1:
                            str2 = "_as";
                            break;
                        case 2:
                            str2 = "_astui";
                            break;
                        case 3:
                            str2 = "_astfd";
                            break;
                        case 4:
                            str2 = "_asti";
                            break;
                        case 5:
                            str2 = "_fs";
                            break;
                        case 6:
                            str2 = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str2.equals(str3)) {
                        i++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str = "Trace name must not start with '_'";
                }
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            p80Var.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.z != null) {
            p80Var.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.y.getClass();
        this.z = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.a);
        a(perfSession);
        if (perfSession.c) {
            this.c.collectGaugeMetricOnce(perfSession.b);
        }
    }

    public void stop() {
        Timer timer = this.z;
        String str = this.d;
        p80 p80Var = B;
        if (timer == null) {
            p80Var.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (e()) {
            p80Var.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.a);
        unregisterForAppState();
        this.y.getClass();
        Timer timer2 = new Timer();
        this.A = timer2;
        if (this.b == null) {
            ArrayList arrayList = this.v;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) rh6.a(1, arrayList);
                if (trace.A == null) {
                    trace.A = timer2;
                }
            }
            if (str.isEmpty()) {
                if (p80Var.b) {
                    p80Var.a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.w.c(new yig0(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().c) {
                this.c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.v);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.z, 0);
        parcel.writeParcelable(this.A, 0);
        synchronized (this.i) {
            parcel.writeList(this.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, avg0 avg0Var, ts7 ts7Var, tt0 tt0Var) {
        super(tt0Var);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.a = new WeakReference<>(this);
        this.b = null;
        this.d = str.trim();
        this.v = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.y = ts7Var;
        this.w = avg0Var;
        this.i = Collections.synchronizedList(new ArrayList());
        this.c = gaugeManager;
    }
}
