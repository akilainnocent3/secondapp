package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes4.dex */
public final class ikl0 extends j3l0 {
    public final wjl0 c;
    public o3l0 d;
    public volatile Boolean e;
    public final dil0 f;
    public ScheduledExecutorService g;
    public final eml0 h;
    public final ArrayList i;
    public final lil0 j;

    public ikl0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.i = new ArrayList();
        this.h = new eml0(k8l0Var.k);
        this.c = new wjl0(this);
        this.f = new dil0(this, k8l0Var);
        this.j = new lil0(this, k8l0Var);
    }

    @Override // defpackage.j3l0
    public final boolean j() {
        return false;
    }

    public final void k(AtomicReference atomicReference) {
        g();
        h();
        u(new xhl0(this, atomicReference, w(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    public final void l(Bundle bundle) {
        boolean z;
        boolean zN;
        g();
        h();
        zzbe zzbeVar = new zzbe(bundle);
        s();
        k8l0 k8l0Var = this.a;
        if (k8l0Var.d.q(null, v2l0.b1)) {
            h4l0 h4l0VarN = k8l0Var.n();
            k8l0 k8l0Var2 = h4l0VarN.a;
            yol0 yol0Var = k8l0Var2.i;
            y4l0 y4l0Var = k8l0Var2.f;
            k8l0.k(yol0Var);
            byte[] bArrL = yol0.L(zzbeVar);
            if (bArrL == null) {
                k8l0.m(y4l0Var);
                y4l0Var.g.a("Null default event parameters; not writing to database");
            } else {
                if (bArrL.length > 131072) {
                    k8l0.m(y4l0Var);
                    y4l0Var.g.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zN = h4l0VarN.n(4, bArrL);
                }
                if (zN) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zN = false;
            if (zN) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        u(new hil0(this, w(false), z, zzbeVar, bundle));
    }

    public final void m() {
        g();
        h();
        if (x()) {
            return;
        }
        if (n()) {
            wjl0 wjl0Var = this.c;
            ikl0 ikl0Var = wjl0Var.c;
            ikl0Var.g();
            Context context = ikl0Var.a.a;
            synchronized (wjl0Var) {
                try {
                    if (wjl0Var.a) {
                        y4l0 y4l0Var = wjl0Var.c.a.f;
                        k8l0.m(y4l0Var);
                        y4l0Var.n.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (wjl0Var.b != null && (wjl0Var.b.c() || wjl0Var.b.isConnected())) {
                            y4l0 y4l0Var2 = wjl0Var.c.a.f;
                            k8l0.m(y4l0Var2);
                            y4l0Var2.n.a("Already awaiting connection attempt");
                            return;
                        }
                        wjl0Var.b = new m4l0(context, Looper.getMainLooper(), y3l.h(context), w4l.b, 93, wjl0Var, wjl0Var, null);
                        y4l0 y4l0Var3 = wjl0Var.c.a.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.n.a("Connecting to remote service");
                        wjl0Var.a = true;
                        hm20.h(wjl0Var.b);
                        wjl0Var.b.p();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        k8l0 k8l0Var = this.a;
        if (k8l0Var.d.j()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = k8l0Var.a.getPackageManager().queryIntentServices(new Intent().setClassName(k8l0Var.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            y4l0 y4l0Var4 = k8l0Var.f;
            k8l0.m(y4l0Var4);
            y4l0Var4.f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(k8l0Var.a, "com.google.android.gms.measurement.AppMeasurementService"));
        wjl0 wjl0Var2 = this.c;
        ikl0 ikl0Var2 = wjl0Var2.c;
        ikl0Var2.g();
        Context context2 = ikl0Var2.a.a;
        zua zuaVarB = zua.b();
        synchronized (wjl0Var2) {
            try {
                boolean z = wjl0Var2.a;
                ikl0 ikl0Var3 = wjl0Var2.c;
                k8l0 k8l0Var2 = ikl0Var3.a;
                if (z) {
                    y4l0 y4l0Var5 = k8l0Var2.f;
                    k8l0.m(y4l0Var5);
                    y4l0Var5.n.a("Connection attempt already in progress");
                } else {
                    y4l0 y4l0Var6 = k8l0Var2.f;
                    k8l0.m(y4l0Var6);
                    y4l0Var6.n.a("Using local app measurement service");
                    wjl0Var2.a = true;
                    zuaVarB.a(context2, intent, ikl0Var3.c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean n() {
        g();
        h();
        if (this.e == null) {
            g();
            h();
            k8l0 k8l0Var = this.a;
            j6l0 j6l0Var = k8l0Var.e;
            k8l0.k(j6l0Var);
            j6l0Var.g();
            boolean z = false;
            Boolean boolValueOf = !j6l0Var.k().contains("use_service") ? null : Boolean.valueOf(j6l0Var.k().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                b4l0 b4l0VarQ = this.a.q();
                b4l0VarQ.h();
                if (b4l0VarQ.m == 1) {
                    z = true;
                } else {
                    y4l0 y4l0Var = k8l0Var.f;
                    k8l0.m(y4l0Var);
                    y4l0Var.n.a("Checking service availability");
                    yol0 yol0Var = k8l0Var.i;
                    k8l0.k(yol0Var);
                    int iC = w4l.b.c(yol0Var.a.a, 12451000);
                    if (iC == 0) {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.n.a("Service available");
                    } else if (iC == 1) {
                        y4l0 y4l0Var3 = k8l0Var.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.n.a("Service missing");
                    } else if (iC != 2) {
                        if (iC != 3) {
                            y4l0 y4l0Var4 = k8l0Var.f;
                            if (iC == 9) {
                                k8l0.m(y4l0Var4);
                                y4l0Var4.i.a("Service invalid");
                            } else if (iC != 18) {
                                k8l0.m(y4l0Var4);
                                y4l0Var4.i.b(Integer.valueOf(iC), "Unexpected service status");
                            } else {
                                k8l0.m(y4l0Var4);
                                y4l0Var4.i.a("Service updating");
                            }
                        } else {
                            y4l0 y4l0Var5 = k8l0Var.f;
                            k8l0.m(y4l0Var5);
                            y4l0Var5.i.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        y4l0 y4l0Var6 = k8l0Var.f;
                        k8l0.m(y4l0Var6);
                        y4l0Var6.m.a("Service container out of date");
                        yol0 yol0Var2 = k8l0Var.i;
                        k8l0.k(yol0Var2);
                        if (yol0Var2.N() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && k8l0Var.d.j()) {
                    y4l0 y4l0Var7 = k8l0Var.f;
                    k8l0.m(y4l0Var7);
                    y4l0Var7.f.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    j6l0 j6l0Var2 = k8l0Var.e;
                    k8l0.k(j6l0Var2);
                    j6l0Var2.g();
                    SharedPreferences.Editor editorEdit = j6l0Var2.k().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    public final void o() {
        g();
        h();
        wjl0 wjl0Var = this.c;
        if (wjl0Var.b != null && (wjl0Var.b.isConnected() || wjl0Var.b.c())) {
            wjl0Var.b.a();
        }
        wjl0Var.b = null;
        try {
            zua.b().c(this.a.a, wjl0Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final boolean p() {
        g();
        h();
        if (!n()) {
            return true;
        }
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        return yol0Var.N() >= ((Integer) v2l0.J0.a(null)).intValue();
    }

    public final boolean q() {
        g();
        h();
        if (!n()) {
            return true;
        }
        yol0 yol0Var = this.a.i;
        k8l0.k(yol0Var);
        return yol0Var.N() >= 241200;
    }

    public final void r(ComponentName componentName) {
        g();
        if (this.d != null) {
            this.d = null;
            y4l0 y4l0Var = this.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.b(componentName, "Disconnected from device MeasurementService");
            g();
            m();
        }
    }

    public final void s() {
        this.a.getClass();
    }

    public final void t() {
        g();
        eml0 eml0Var = this.h;
        eml0Var.getClass();
        eml0Var.a = SystemClock.elapsedRealtime();
        wok0 wok0Var = this.a.d;
        this.f.b(((Long) v2l0.Y.a(null)).longValue());
    }

    public final void u(Runnable runnable) {
        g();
        if (x()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.i;
        long size = arrayList.size();
        k8l0 k8l0Var = this.a;
        wok0 wok0Var = k8l0Var.d;
        if (size >= 1000) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.j.b(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            m();
        }
    }

    public final void v() {
        g();
        k8l0 k8l0Var = this.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        ArrayList arrayList = this.i;
        u4l0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.j.c();
    }

    public final zzr w(boolean z) {
        long jAbs;
        Pair pair;
        k8l0 k8l0Var = this.a;
        k8l0Var.getClass();
        b4l0 b4l0VarQ = k8l0Var.q();
        String strA = null;
        if (z) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            k8l0 k8l0Var2 = y4l0Var.a;
            j6l0 j6l0Var = k8l0Var2.e;
            k8l0.k(j6l0Var);
            if (j6l0Var.e != null) {
                j6l0 j6l0Var2 = k8l0Var2.e;
                k8l0.k(j6l0Var2);
                f6l0 f6l0Var = j6l0Var2.e;
                j6l0 j6l0Var3 = f6l0Var.b;
                j6l0Var3.g();
                j6l0Var3.g();
                long j = f6l0Var.b.k().getLong("health_monitor:start", 0L);
                if (j == 0) {
                    f6l0Var.a();
                    jAbs = 0;
                } else {
                    j6l0Var3.a.k.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = f6l0Var.a;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    f6l0Var.a();
                    pair = null;
                } else {
                    String string = j6l0Var3.k().getString("health_monitor:value", null);
                    long j3 = j6l0Var3.k().getLong("health_monitor:count", 0L);
                    f6l0Var.a();
                    pair = (string == null || j3 <= 0) ? j6l0.z : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != j6l0.z) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strA = pr0.a(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return b4l0VarQ.k(strA);
    }

    public final boolean x() {
        g();
        h();
        return this.d != null;
    }

    public final void z(zzah zzahVar) {
        boolean zN;
        g();
        h();
        k8l0 k8l0Var = this.a;
        k8l0Var.getClass();
        h4l0 h4l0VarN = k8l0Var.n();
        k8l0 k8l0Var2 = h4l0VarN.a;
        k8l0.k(k8l0Var2.i);
        byte[] bArrL = yol0.L(zzahVar);
        if (bArrL.length > 131072) {
            y4l0 y4l0Var = k8l0Var2.f;
            k8l0.m(y4l0Var);
            y4l0Var.g.a("Conditional user property too long for local database. Sending directly to service");
            zN = false;
        } else {
            zN = h4l0VarN.n(2, bArrL);
        }
        u(new til0(this, w(true), zN, new zzah(zzahVar)));
    }

    /* JADX WARN: Code duplicated, block: B:274:0x04a0 A[Catch: all -> 0x04de, TRY_ENTER, TryCatch #38 {all -> 0x04de, blocks: (B:284:0x04ce, B:274:0x04a0, B:276:0x04a6, B:277:0x04a9, B:294:0x04f1, B:220:0x03bd, B:222:0x03c7, B:227:0x03d8), top: B:412:0x04ce }] */
    /* JADX WARN: Code duplicated, block: B:279:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:287:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:289:0x04da A[PHI: r5 r6 r23 r24 r26 r27 r36 r37
      0x04da: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r27v11 wok0) = (r27v8 wok0), (r27v9 wok0), (r27v12 wok0) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]
      0x04da: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:280:0x04bb, B:297:0x0503, B:288:0x04d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:296:0x0500  */
    /* JADX WARN: Code duplicated, block: B:301:0x0516  */
    /* JADX WARN: Code duplicated, block: B:303:0x051b  */
    /* JADX WARN: Code duplicated, block: B:308:0x0539  */
    /* JADX WARN: Code duplicated, block: B:309:0x0542  */
    /* JADX WARN: Code duplicated, block: B:316:0x0565  */
    /* JADX WARN: Code duplicated, block: B:318:0x0575  */
    /* JADX WARN: Code duplicated, block: B:320:0x057d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0602  */
    /* JADX WARN: Code duplicated, block: B:324:0x0609 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x062f  */
    /* JADX WARN: Code duplicated, block: B:336:0x063a A[Catch: RemoteException -> 0x067f, TRY_LEAVE, TryCatch #66 {RemoteException -> 0x067f, blocks: (B:334:0x0633, B:336:0x063a), top: B:430:0x0633 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x064a A[Catch: RemoteException -> 0x0679, TRY_LEAVE, TryCatch #57 {RemoteException -> 0x0679, blocks: (B:338:0x063f, B:340:0x064a), top: B:424:0x063f }] */
    /* JADX WARN: Code duplicated, block: B:344:0x0658  */
    /* JADX WARN: Code duplicated, block: B:353:0x0687  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:363:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:369:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:375:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:383:0x071b  */
    /* JADX WARN: Code duplicated, block: B:398:0x060b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x06cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x06e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0506 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0506 A[SYNTHETIC] */
    public final void y(o3l0 o3l0Var, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) throws Throwable {
        ArrayList arrayList;
        k8l0 k8l0Var;
        Context context;
        y4l0 y4l0Var;
        int i;
        SQLiteDatabase sQLiteDatabaseM;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        t2l0 t2l0Var;
        zzbe zzbeVarCreateFromParcel;
        int i5;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        int size;
        wok0 wok0Var;
        String str2;
        boolean zQ;
        int size2;
        int i6;
        f4l0 f4l0Var;
        AbstractSafeParcelable abstractSafeParcelable2;
        t2l0 t2l0Var2;
        k8l0 k8l0Var2;
        Context context2;
        y4l0 y4l0Var2;
        String str3;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        long j4;
        q4l0 q4l0Var;
        q4l0 q4l0Var2;
        String str4;
        g();
        h();
        s();
        k8l0 k8l0Var3 = this.a;
        wok0 wok0Var2 = k8l0Var3.d;
        Context context3 = k8l0Var3.a;
        y4l0 y4l0Var3 = k8l0Var3.f;
        xi9 xi9Var = k8l0Var3.k;
        zzr zzrVar2 = zzrVar;
        int i7 = 100;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i7 == i9; i9 = 100) {
            ArrayList arrayList2 = new ArrayList();
            h4l0 h4l0VarN = k8l0Var3.n();
            String str5 = "entry";
            int i10 = i9;
            String str6 = "type";
            String str7 = dqvOSm.TqFGDFtTgDzR;
            xi9 xi9Var2 = xi9Var;
            k8l0 k8l0Var4 = h4l0VarN.a;
            h4l0VarN.g();
            int i11 = i8;
            if (h4l0VarN.d) {
                k8l0Var = k8l0Var3;
                wok0Var2 = wok0Var2;
                context = context3;
                y4l0Var = y4l0Var3;
            } else {
                arrayList = new ArrayList();
                k8l0Var = k8l0Var3;
                if (h4l0VarN.a.a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    y4l0Var = y4l0Var3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM = h4l0VarN.m();
                                if (sQLiteDatabaseM == null) {
                                    try {
                                        try {
                                            h4l0VarN.d = true;
                                            wok0Var2 = wok0Var2;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str7 = str7;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str6 = str6;
                                            str5 = str5;
                                            wok0Var2 = wok0Var2;
                                            str7 = str7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str7 = str7;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        y4l0 y4l0Var4 = k8l0Var4.f;
                                        k8l0.m(y4l0Var4);
                                        y4l0Var4.f.b(e, "Error reading entries from local database");
                                        h4l0VarN.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str6 = str6;
                                        str5 = str5;
                                        wok0Var2 = wok0Var2;
                                        str7 = str7;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str7 = str7;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.endTransaction();
                                        }
                                        y4l0 y4l0Var5 = k8l0Var4.f;
                                        k8l0.m(y4l0Var5);
                                        y4l0Var5.f.b(e, "Error reading entries from local database");
                                        h4l0VarN.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str6 = str6;
                                        str5 = str5;
                                        wok0Var2 = wok0Var2;
                                        str7 = str7;
                                    }
                                } else {
                                    sQLiteDatabaseM.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j5 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str7 = str7;
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        wok0Var2 = wok0Var2;
                                                        str7 = str7;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str7 = str7;
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        y4l0 y4l0Var6 = k8l0Var4.f;
                                                        k8l0.m(y4l0Var6);
                                                        y4l0Var6.f.b(e, "Error reading entries from local database");
                                                        h4l0VarN.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        wok0Var2 = wok0Var2;
                                                        str7 = str7;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str7 = str7;
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.endTransaction();
                                                        }
                                                        y4l0 y4l0Var7 = k8l0Var4.f;
                                                        k8l0.m(y4l0Var7);
                                                        y4l0Var7.f.b(e, "Error reading entries from local database");
                                                        h4l0VarN.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        wok0Var2 = wok0Var2;
                                                        str7 = str7;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            wok0Var2 = wok0Var2;
                                                            str7 = str7;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            y4l0 y4l0Var8 = k8l0Var4.f;
                                                            k8l0.m(y4l0Var8);
                                                            y4l0Var8.f.b(e, "Error reading entries from local database");
                                                            h4l0VarN.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            wok0Var2 = wok0Var2;
                                                            str7 = str7;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.endTransaction();
                                                            }
                                                            y4l0 y4l0Var9 = k8l0Var4.f;
                                                            k8l0.m(y4l0Var9);
                                                            y4l0Var9.f.b(e, "Error reading entries from local database");
                                                            h4l0VarN.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            wok0Var2 = wok0Var2;
                                                            str7 = str7;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str7, str6, str5};
                                                wok0 wok0Var3 = k8l0Var4.d;
                                                t2l0 t2l0Var3 = v2l0.b1;
                                                str7 = str7;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (wok0Var3.q(null, t2l0Var3)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                wok0Var2 = wok0Var2;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                wok0Var2 = wok0Var2;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                y4l0 y4l0Var10 = k8l0Var4.f;
                                                                k8l0.m(y4l0Var10);
                                                                y4l0Var10.f.b(e, "Error reading entries from local database");
                                                                h4l0VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                wok0Var2 = wok0Var2;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                y4l0 y4l0Var11 = k8l0Var4.f;
                                                                k8l0.m(y4l0Var11);
                                                                y4l0Var11.f.b(e, "Error reading entries from local database");
                                                                h4l0VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j5 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str6 = str6;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str5 = str5;
                                                                                    try {
                                                                                        if (k8l0Var4.d.q(null, t2l0Var3)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                y4l0 y4l0Var12 = k8l0Var4.f;
                                                                                                k8l0.m(y4l0Var12);
                                                                                                y4l0Var12.f.b(e, "Error reading entries from local database");
                                                                                                h4l0VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                }
                                                                                                y4l0 y4l0Var13 = k8l0Var4.f;
                                                                                                k8l0.m(y4l0Var13);
                                                                                                y4l0Var13.f.b(e, "Error reading entries from local database");
                                                                                                h4l0VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                    sQLiteDatabaseM.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            t2l0Var = t2l0Var3;
                                                                                            try {
                                                                                                Parcel parcelObtain = Parcel.obtain();
                                                                                                try {
                                                                                                    cursorQuery = cursorQuery;
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain.recycle();
                                                                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                                                                        arrayList.add(new f4l0(zzbgVarCreateFromParcel, string, j2));
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                    cursor = cursorQuery;
                                                                                                                    if (cursor != null) {
                                                                                                                        cursor.close();
                                                                                                                    }
                                                                                                                    if (sQLiteDatabaseM != null) {
                                                                                                                        sQLiteDatabaseM.close();
                                                                                                                    }
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (SQLiteDatabaseLockedException unused6) {
                                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                i3 = 5;
                                                                                                                SystemClock.sleep(i14);
                                                                                                                i14 += 20;
                                                                                                                if (cursorQuery != null) {
                                                                                                                    cursorQuery.close();
                                                                                                                }
                                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                                    sQLiteDatabaseM.close();
                                                                                                                }
                                                                                                                i13 = i2 + 1;
                                                                                                                i12 = i3;
                                                                                                                str6 = str6;
                                                                                                                str5 = str5;
                                                                                                                wok0Var2 = wok0Var2;
                                                                                                                str7 = str7;
                                                                                                            } catch (SQLiteFullException e11) {
                                                                                                                e = e11;
                                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                i3 = 5;
                                                                                                                y4l0 y4l0Var14 = k8l0Var4.f;
                                                                                                                k8l0.m(y4l0Var14);
                                                                                                                y4l0Var14.f.b(e, "Error reading entries from local database");
                                                                                                                h4l0VarN.d = true;
                                                                                                                if (cursorQuery != null) {
                                                                                                                    cursorQuery.close();
                                                                                                                }
                                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                                    sQLiteDatabaseM.close();
                                                                                                                }
                                                                                                                i13 = i2 + 1;
                                                                                                                i12 = i3;
                                                                                                                str6 = str6;
                                                                                                                str5 = str5;
                                                                                                                wok0Var2 = wok0Var2;
                                                                                                                str7 = str7;
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                i3 = 5;
                                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                                    sQLiteDatabaseM.endTransaction();
                                                                                                                }
                                                                                                                y4l0 y4l0Var15 = k8l0Var4.f;
                                                                                                                k8l0.m(y4l0Var15);
                                                                                                                y4l0Var15.f.b(e, "Error reading entries from local database");
                                                                                                                h4l0VarN.d = true;
                                                                                                                if (cursorQuery != null) {
                                                                                                                    cursorQuery.close();
                                                                                                                }
                                                                                                                if (sQLiteDatabaseM != null) {
                                                                                                                    sQLiteDatabaseM.close();
                                                                                                                }
                                                                                                                i13 = i2 + 1;
                                                                                                                i12 = i3;
                                                                                                                str6 = str6;
                                                                                                                str5 = str5;
                                                                                                                wok0Var2 = wok0Var2;
                                                                                                                str7 = str7;
                                                                                                            }
                                                                                                        } catch (tr60.a unused7) {
                                                                                                            y4l0 y4l0Var16 = k8l0Var4.f;
                                                                                                            k8l0.m(y4l0Var16);
                                                                                                            y4l0Var16.f.a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (tr60.a unused8) {
                                                                                                    cursorQuery = cursorQuery;
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused9) {
                                                                                                cursorQuery = cursorQuery;
                                                                                            } catch (SQLiteFullException e13) {
                                                                                                e = e13;
                                                                                                cursorQuery = cursorQuery;
                                                                                            } catch (SQLiteException e14) {
                                                                                                e = e14;
                                                                                                cursorQuery = cursorQuery;
                                                                                            } catch (Throwable th8) {
                                                                                                th = th8;
                                                                                                cursorQuery = cursorQuery;
                                                                                            }
                                                                                        } else {
                                                                                            t2l0Var = t2l0Var3;
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th9) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th9;
                                                                                                    }
                                                                                                } catch (tr60.a unused10) {
                                                                                                    y4l0 y4l0Var17 = k8l0Var4.f;
                                                                                                    k8l0.m(y4l0Var17);
                                                                                                    y4l0Var17.f.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    zzplVarCreateFromParcel = null;
                                                                                                }
                                                                                                if (zzplVarCreateFromParcel != null) {
                                                                                                    arrayList.add(new f4l0(zzplVarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th10) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th10;
                                                                                                        }
                                                                                                    } catch (tr60.a unused11) {
                                                                                                        y4l0 y4l0Var18 = k8l0Var4.f;
                                                                                                        k8l0.m(y4l0Var18);
                                                                                                        y4l0Var18.f.a("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        zzahVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (zzahVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new f4l0(zzahVarCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused12) {
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        wok0Var2 = wok0Var2;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                                        e = e15;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        y4l0 y4l0Var19 = k8l0Var4.f;
                                                                                                                        k8l0.m(y4l0Var19);
                                                                                                                        y4l0Var19.f.b(e, "Error reading entries from local database");
                                                                                                                        h4l0VarN.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        wok0Var2 = wok0Var2;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteException e16) {
                                                                                                                        e = e16;
                                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                                        }
                                                                                                                        y4l0 y4l0Var110 = k8l0Var4.f;
                                                                                                                        k8l0.m(y4l0Var110);
                                                                                                                        y4l0Var110.f.b(e, "Error reading entries from local database");
                                                                                                                        h4l0VarN.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                                            sQLiteDatabaseM.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        wok0Var2 = wok0Var2;
                                                                                                                        str7 = str7;
                                                                                                                    }
                                                                                                                } catch (tr60.a unused13) {
                                                                                                                    y4l0 y4l0Var20 = k8l0Var4.f;
                                                                                                                    k8l0.m(y4l0Var20);
                                                                                                                    y4l0Var20.f.a("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    zzbeVarCreateFromParcel = null;
                                                                                                                }
                                                                                                            } catch (Throwable th11) {
                                                                                                                th = th11;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (tr60.a unused14) {
                                                                                                        } catch (Throwable th12) {
                                                                                                            th = th12;
                                                                                                        }
                                                                                                        if (zzbeVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new f4l0(zzbeVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                        i5 = 3;
                                                                                                    } catch (SQLiteDatabaseLockedException unused15) {
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        wok0Var2 = wok0Var2;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteFullException e17) {
                                                                                                        e = e17;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        y4l0 y4l0Var111 = k8l0Var4.f;
                                                                                                        k8l0.m(y4l0Var111);
                                                                                                        y4l0Var111.f.b(e, "Error reading entries from local database");
                                                                                                        h4l0VarN.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        wok0Var2 = wok0Var2;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM != null && sQLiteDatabaseM.inTransaction()) {
                                                                                                            sQLiteDatabaseM.endTransaction();
                                                                                                        }
                                                                                                        y4l0 y4l0Var112 = k8l0Var4.f;
                                                                                                        k8l0.m(y4l0Var112);
                                                                                                        y4l0Var112.f.b(e, "Error reading entries from local database");
                                                                                                        h4l0VarN.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM != null) {
                                                                                                            sQLiteDatabaseM.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        wok0Var2 = wok0Var2;
                                                                                                        str7 = str7;
                                                                                                    }
                                                                                                } else {
                                                                                                    y4l0 y4l0Var21 = k8l0Var4.f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        k8l0.m(y4l0Var21);
                                                                                                        y4l0Var21.n.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        k8l0.m(y4l0Var21);
                                                                                                        y4l0Var21.f.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                wok0Var2 = wok0Var2;
                                                                                                t2l0Var3 = t2l0Var;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str6 = str6;
                                                                                        str5 = str5;
                                                                                        wok0Var2 = wok0Var2;
                                                                                        t2l0Var3 = t2l0Var;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused16) {
                                                                                        cursorQuery = cursorQuery;
                                                                                        wok0Var2 = wok0Var2;
                                                                                    } catch (SQLiteFullException e19) {
                                                                                        e = e19;
                                                                                        cursorQuery = cursorQuery;
                                                                                        wok0Var2 = wok0Var2;
                                                                                    } catch (SQLiteException e20) {
                                                                                        e = e20;
                                                                                        cursorQuery = cursorQuery;
                                                                                        wok0Var2 = wok0Var2;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused17) {
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    wok0Var2 = wok0Var2;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteFullException e21) {
                                                                                    e = e21;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    y4l0 y4l0Var113 = k8l0Var4.f;
                                                                                    k8l0.m(y4l0Var113);
                                                                                    y4l0Var113.f.b(e, "Error reading entries from local database");
                                                                                    h4l0VarN.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    wok0Var2 = wok0Var2;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteException e22) {
                                                                                    e = e22;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.endTransaction();
                                                                                    }
                                                                                    y4l0 y4l0Var114 = k8l0Var4.f;
                                                                                    k8l0.m(y4l0Var114);
                                                                                    y4l0Var114.f.b(e, "Error reading entries from local database");
                                                                                    h4l0VarN.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM != null) {
                                                                                        sQLiteDatabaseM.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    wok0Var2 = wok0Var2;
                                                                                    str7 = str7;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused18) {
                                                                                str6 = str6;
                                                                            } catch (SQLiteFullException e23) {
                                                                                e = e23;
                                                                                str6 = str6;
                                                                            } catch (SQLiteException e24) {
                                                                                e = e24;
                                                                                str6 = str6;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused19) {
                                                                            cursorQuery = cursorQuery;
                                                                            wok0Var2 = wok0Var2;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteFullException e25) {
                                                                            e = e25;
                                                                            cursorQuery = cursorQuery;
                                                                            wok0Var2 = wok0Var2;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteException e26) {
                                                                            e = e26;
                                                                            cursorQuery = cursorQuery;
                                                                            wok0Var2 = wok0Var2;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        th = th13;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                                    cursorQuery = cursorQuery;
                                                                    wok0Var2 = wok0Var2;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteFullException e27) {
                                                                    e = e27;
                                                                    cursorQuery = cursorQuery;
                                                                    wok0Var2 = wok0Var2;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteException e28) {
                                                                    e = e28;
                                                                    cursorQuery = cursorQuery;
                                                                    wok0Var2 = wok0Var2;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            wok0Var2 = wok0Var2;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            i = 0;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            try {
                                                                if (sQLiteDatabaseM.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                                    y4l0 y4l0Var22 = k8l0Var4.f;
                                                                    k8l0.m(y4l0Var22);
                                                                    y4l0Var22.f.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM.setTransactionSuccessful();
                                                                sQLiteDatabaseM.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM.close();
                                                            } catch (SQLiteDatabaseLockedException unused21) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e29) {
                                                                e = e29;
                                                                i3 = 5;
                                                                y4l0 y4l0Var115 = k8l0Var4.f;
                                                                k8l0.m(y4l0Var115);
                                                                y4l0Var115.f.b(e, "Error reading entries from local database");
                                                                h4l0VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            } catch (SQLiteException e30) {
                                                                e = e30;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.endTransaction();
                                                                }
                                                                y4l0 y4l0Var116 = k8l0Var4.f;
                                                                k8l0.m(y4l0Var116);
                                                                y4l0Var116.f.b(e, "Error reading entries from local database");
                                                                h4l0VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM != null) {
                                                                    sQLiteDatabaseM.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                wok0Var2 = wok0Var2;
                                                                str7 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused22) {
                                                            wok0Var2 = wok0Var2;
                                                            str5 = str5;
                                                            sQLiteDatabaseM = sQLiteDatabaseM;
                                                            str6 = str6;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM != null) {
                                                                sQLiteDatabaseM.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            wok0Var2 = wok0Var2;
                                                            str7 = str7;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused23) {
                                                        str5 = str5;
                                                        sQLiteDatabaseM = sQLiteDatabaseM;
                                                        str6 = str6;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM != null) {
                                                            sQLiteDatabaseM.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        wok0Var2 = wok0Var2;
                                                        str7 = str7;
                                                    }
                                                } catch (SQLiteFullException e31) {
                                                    e = e31;
                                                    str5 = str5;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str6 = str6;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    y4l0 y4l0Var117 = k8l0Var4.f;
                                                    k8l0.m(y4l0Var117);
                                                    y4l0Var117.f.b(e, "Error reading entries from local database");
                                                    h4l0VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    wok0Var2 = wok0Var2;
                                                    str7 = str7;
                                                } catch (SQLiteException e32) {
                                                    e = e32;
                                                    str5 = str5;
                                                    sQLiteDatabaseM = sQLiteDatabaseM;
                                                    str6 = str6;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.endTransaction();
                                                    }
                                                    y4l0 y4l0Var118 = k8l0Var4.f;
                                                    k8l0.m(y4l0Var118);
                                                    y4l0Var118.f.b(e, "Error reading entries from local database");
                                                    h4l0VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM != null) {
                                                        sQLiteDatabaseM.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    wok0Var2 = wok0Var2;
                                                    str7 = str7;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused24) {
                                                str7 = str7;
                                            } catch (SQLiteFullException e33) {
                                                e = e33;
                                                str7 = str7;
                                            } catch (SQLiteException e34) {
                                                e = e34;
                                                str7 = str7;
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th15) {
                                        th = th15;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused25) {
                                wok0Var2 = wok0Var2;
                                i2 = i13;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteFullException e35) {
                                e = e35;
                                wok0Var2 = wok0Var2;
                                i2 = i13;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (SQLiteException e36) {
                                e = e36;
                                wok0Var2 = wok0Var2;
                                i2 = i13;
                                str7 = str7;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseM = null;
                            } catch (Throwable th16) {
                                th = th16;
                                sQLiteDatabaseM = null;
                            }
                        } else {
                            wok0Var2 = wok0Var2;
                            i = 0;
                            y4l0 y4l0Var23 = k8l0Var4.f;
                            k8l0.m(y4l0Var23);
                            y4l0Var23.i.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str6 = str6;
                        str5 = str5;
                        wok0Var2 = wok0Var2;
                        str7 = str7;
                    }
                } else {
                    wok0Var2 = wok0Var2;
                    context = context3;
                    y4l0Var = y4l0Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractSafeParcelable != 0 && size < i10) {
                    arrayList2.add(new f4l0(abstractSafeParcelable, zzrVar2.c, zzrVar2.y));
                }
                wok0Var = wok0Var2;
                str2 = null;
                zQ = wok0Var.q(null, v2l0.O0);
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    f4l0Var = (f4l0) arrayList2.get(i6);
                    abstractSafeParcelable2 = f4l0Var.a;
                    t2l0Var2 = v2l0.b1;
                    if (wok0Var.q(str2, t2l0Var2)) {
                        str4 = f4l0Var.b;
                        if (!TextUtils.isEmpty(str4)) {
                            zzrVar2 = new zzr(zzrVar2.a, zzrVar2.b, str4, f4l0Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.i, zzrVar2.v, zzrVar2.w, zzrVar2.z, zzrVar2.A, zzrVar2.B, zzrVar2.C, zzrVar2.D, zzrVar2.E, zzrVar2.F, zzrVar2.G, zzrVar2.H, zzrVar2.I, zzrVar2.J, zzrVar2.K, zzrVar2.L, zzrVar2.M, zzrVar2.N, zzrVar2.O, zzrVar2.P, zzrVar2.Q, zzrVar2.R, zzrVar2.S, zzrVar2.T);
                        }
                    }
                    if (abstractSafeParcelable2 instanceof zzbg) {
                        if (zQ) {
                            try {
                                xi9Var2.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    xi9Var2.getClass();
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                    j4 = jCurrentTimeMillis;
                                } catch (RemoteException e37) {
                                    e = e37;
                                    j3 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    k8l0Var2 = k8l0Var;
                                    context2 = context;
                                    y4l0Var2 = y4l0Var;
                                    k8l0.m(y4l0Var2);
                                    y4l0Var2.f.b(e, "Failed to send event to the service");
                                    if (zQ && j3 != 0) {
                                        q4l0Var = q4l0.d;
                                        if (q4l0Var == null) {
                                            q4l0Var = new q4l0(context2, k8l0Var2);
                                            q4l0.d = q4l0Var;
                                        }
                                        xi9Var2.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        xi9Var2.getClass();
                                        q4l0Var.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                    }
                                    str3 = null;
                                    i6++;
                                    y4l0Var = y4l0Var2;
                                    context = context2;
                                    k8l0Var = k8l0Var2;
                                    wok0Var = wok0Var;
                                    size = size;
                                    str2 = str3;
                                }
                            } catch (RemoteException e38) {
                                e = e38;
                                jElapsedRealtime = 0;
                                j3 = 0;
                            }
                        } else {
                            jElapsedRealtime = 0;
                            j4 = 0;
                        }
                        try {
                            o3l0Var.q((zzbg) abstractSafeParcelable2, zzrVar2);
                            if (zQ) {
                                k8l0.m(y4l0Var);
                                y4l0Var2 = y4l0Var;
                                try {
                                    y4l0Var2.n.a("Logging telemetry for logEvent from database");
                                    q4l0Var2 = q4l0.d;
                                    if (q4l0Var2 == null) {
                                        k8l0Var2 = k8l0Var;
                                        context2 = context;
                                        try {
                                            q4l0Var2 = new q4l0(context2, k8l0Var2);
                                            q4l0.d = q4l0Var2;
                                        } catch (RemoteException e39) {
                                            e = e39;
                                            j3 = j4;
                                            k8l0.m(y4l0Var2);
                                            y4l0Var2.f.b(e, "Failed to send event to the service");
                                            if (zQ) {
                                                q4l0Var = q4l0.d;
                                                if (q4l0Var == null) {
                                                    q4l0Var = new q4l0(context2, k8l0Var2);
                                                    q4l0.d = q4l0Var;
                                                }
                                                xi9Var2.getClass();
                                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                xi9Var2.getClass();
                                                q4l0Var.a(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis3);
                                            }
                                        }
                                    } else {
                                        k8l0Var2 = k8l0Var;
                                        context2 = context;
                                    }
                                    q4l0 q4l0Var3 = q4l0Var2;
                                    xi9Var2.getClass();
                                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                                    xi9Var2.getClass();
                                    q4l0Var3.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j4, jCurrentTimeMillis4);
                                } catch (RemoteException e40) {
                                    e = e40;
                                    k8l0Var2 = k8l0Var;
                                    context2 = context;
                                }
                            } else {
                                k8l0Var2 = k8l0Var;
                                context2 = context;
                                y4l0Var2 = y4l0Var;
                            }
                        } catch (RemoteException e41) {
                            e = e41;
                            k8l0Var2 = k8l0Var;
                            context2 = context;
                            y4l0Var2 = y4l0Var;
                        }
                    } else {
                        k8l0Var2 = k8l0Var;
                        context2 = context;
                        y4l0Var2 = y4l0Var;
                        if (abstractSafeParcelable2 instanceof zzpl) {
                            try {
                                o3l0Var.v((zzpl) abstractSafeParcelable2, zzrVar2);
                            } catch (RemoteException e42) {
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.b(e42, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractSafeParcelable2 instanceof zzah) {
                                try {
                                    o3l0Var.g((zzah) abstractSafeParcelable2, zzrVar2);
                                } catch (RemoteException e43) {
                                    k8l0.m(y4l0Var2);
                                    y4l0Var2.f.b(e43, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str3 = null;
                                if (k8l0Var2.d.q(null, t2l0Var2) || !(abstractSafeParcelable2 instanceof zzbe)) {
                                    k8l0.m(y4l0Var2);
                                    y4l0Var2.f.a("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        o3l0Var.N(((zzbe) abstractSafeParcelable2).b1(), zzrVar2);
                                    } catch (RemoteException e44) {
                                        k8l0.m(y4l0Var2);
                                        y4l0Var2.f.b(e44, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            i6++;
                            y4l0Var = y4l0Var2;
                            context = context2;
                            k8l0Var = k8l0Var2;
                            wok0Var = wok0Var;
                            size = size;
                            str2 = str3;
                        }
                    }
                    str3 = null;
                    i6++;
                    y4l0Var = y4l0Var2;
                    context = context2;
                    k8l0Var = k8l0Var2;
                    wok0Var = wok0Var;
                    size = size;
                    str2 = str3;
                }
                int i18 = size;
                wok0 wok0Var4 = wok0Var;
                i8 = i11 + 1;
                y4l0Var3 = y4l0Var;
                context3 = context;
                k8l0Var3 = k8l0Var;
                wok0Var2 = wok0Var4;
                xi9Var = xi9Var2;
                i7 = i18;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractSafeParcelable != 0) {
                arrayList2.add(new f4l0(abstractSafeParcelable, zzrVar2.c, zzrVar2.y));
            }
            wok0Var = wok0Var2;
            str2 = null;
            zQ = wok0Var.q(null, v2l0.O0);
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                f4l0Var = (f4l0) arrayList2.get(i6);
                abstractSafeParcelable2 = f4l0Var.a;
                t2l0Var2 = v2l0.b1;
                if (wok0Var.q(str2, t2l0Var2)) {
                    str4 = f4l0Var.b;
                    if (!TextUtils.isEmpty(str4)) {
                        zzrVar2 = new zzr(zzrVar2.a, zzrVar2.b, str4, f4l0Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.i, zzrVar2.v, zzrVar2.w, zzrVar2.z, zzrVar2.A, zzrVar2.B, zzrVar2.C, zzrVar2.D, zzrVar2.E, zzrVar2.F, zzrVar2.G, zzrVar2.H, zzrVar2.I, zzrVar2.J, zzrVar2.K, zzrVar2.L, zzrVar2.M, zzrVar2.N, zzrVar2.O, zzrVar2.P, zzrVar2.Q, zzrVar2.R, zzrVar2.S, zzrVar2.T);
                    }
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zQ) {
                        xi9Var2.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        xi9Var2.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        j4 = jCurrentTimeMillis;
                    } else {
                        jElapsedRealtime = 0;
                        j4 = 0;
                    }
                    o3l0Var.q((zzbg) abstractSafeParcelable2, zzrVar2);
                    if (zQ) {
                        k8l0.m(y4l0Var);
                        y4l0Var2 = y4l0Var;
                        y4l0Var2.n.a("Logging telemetry for logEvent from database");
                        q4l0Var2 = q4l0.d;
                        if (q4l0Var2 == null) {
                            k8l0Var2 = k8l0Var;
                            context2 = context;
                            q4l0Var2 = new q4l0(context2, k8l0Var2);
                            q4l0.d = q4l0Var2;
                        } else {
                            k8l0Var2 = k8l0Var;
                            context2 = context;
                        }
                        q4l0 q4l0Var4 = q4l0Var2;
                        xi9Var2.getClass();
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        xi9Var2.getClass();
                        q4l0Var4.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j4, jCurrentTimeMillis5);
                    } else {
                        k8l0Var2 = k8l0Var;
                        context2 = context;
                        y4l0Var2 = y4l0Var;
                    }
                } else {
                    k8l0Var2 = k8l0Var;
                    context2 = context;
                    y4l0Var2 = y4l0Var;
                    if (abstractSafeParcelable2 instanceof zzpl) {
                        o3l0Var.v((zzpl) abstractSafeParcelable2, zzrVar2);
                    } else {
                        if (abstractSafeParcelable2 instanceof zzah) {
                            o3l0Var.g((zzah) abstractSafeParcelable2, zzrVar2);
                        } else {
                            str3 = null;
                            if (k8l0Var2.d.q(null, t2l0Var2)) {
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.a("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        i6++;
                        y4l0Var = y4l0Var2;
                        context = context2;
                        k8l0Var = k8l0Var2;
                        wok0Var = wok0Var;
                        size = size;
                        str2 = str3;
                    }
                }
                str3 = null;
                i6++;
                y4l0Var = y4l0Var2;
                context = context2;
                k8l0Var = k8l0Var2;
                wok0Var = wok0Var;
                size = size;
                str2 = str3;
            }
            int i19 = size;
            wok0 wok0Var5 = wok0Var;
            i8 = i11 + 1;
            y4l0Var3 = y4l0Var;
            context3 = context;
            k8l0Var3 = k8l0Var;
            wok0Var2 = wok0Var5;
            xi9Var = xi9Var2;
            i7 = i19;
        }
    }
}
