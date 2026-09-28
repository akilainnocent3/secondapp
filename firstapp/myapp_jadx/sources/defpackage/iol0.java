package defpackage;

import android.app.BroadcastOptions;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.transition.nfj.CaBJCMnsV;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import com.sportybet.plugin.realsports.data.CashOut;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import okhttp3.internal.luBk.Chyeyik;
import okhttp3.internal.ws.RealWebSocket;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class iol0 implements zal0 {
    public static volatile iol0 K;
    public final HashMap B;
    public final HashMap C;
    public final HashMap D;
    public igl0 F;
    public String G;
    public hnl0 H;
    public long I;
    public final e7l0 a;
    public final i5l0 b;
    public lqk0 c;
    public x5l0 d;
    public jml0 e;
    public knk0 f;
    public final pol0 g;
    public zfl0 h;
    public mkl0 i;
    public o6l0 k;
    public final k8l0 l;
    public boolean n;
    public long o;
    public ArrayList p;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public FileLock w;
    public FileChannel x;
    public ArrayList y;
    public ArrayList z;
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final LinkedList q = new LinkedList();
    public final HashMap E = new HashMap();
    public final ynl0 J = new ynl0(this);
    public long A = -1;
    public final zml0 j = new zml0(this);

    public iol0(kol0 kol0Var) {
        this.l = k8l0.r(kol0Var.a, null, null);
        pol0 pol0Var = new pol0(this);
        pol0Var.i();
        this.g = pol0Var;
        i5l0 i5l0Var = new i5l0(this);
        i5l0Var.i();
        this.b = i5l0Var;
        e7l0 e7l0Var = new e7l0(this);
        e7l0Var.i();
        this.a = e7l0Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        b().p(new bnl0(this, kol0Var));
    }

    public static iol0 C(Service service) {
        hm20.h(service.getApplicationContext());
        if (K == null) {
            synchronized (iol0.class) {
                try {
                    if (K == null) {
                        K = new iol0(new kol0(service));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return K;
    }

    public static final void D(b7l0 b7l0Var, int i, String str) {
        List listL = b7l0Var.l();
        for (int i2 = 0; i2 < listL.size(); i2++) {
            if ("_err".equals(((k7l0) listL.get(i2)).r())) {
                return;
            }
        }
        i7l0 i7l0VarC = k7l0.C();
        i7l0VarC.l("_err");
        i7l0VarC.n(i);
        k7l0 k7l0Var = (k7l0) i7l0VarC.i();
        i7l0 i7l0VarC2 = k7l0.C();
        i7l0VarC2.l("_ev");
        i7l0VarC2.m(str);
        k7l0 k7l0Var2 = (k7l0) i7l0VarC2.i();
        b7l0Var.o(k7l0Var);
        b7l0Var.o(k7l0Var2);
    }

    public static final void E(b7l0 b7l0Var, String str) {
        List listL = b7l0Var.l();
        for (int i = 0; i < listL.size(); i++) {
            if (str.equals(((k7l0) listL.get(i)).r())) {
                b7l0Var.q(i);
                return;
            }
        }
    }

    public static String M(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void S(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static final boolean T(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.b);
    }

    public static final void U(vml0 vml0Var) {
        if (vml0Var == null) {
            ib5.a("Upload Component not created");
        } else {
            if (vml0Var.c) {
                return;
            }
            ib5.a("Component not initialized: ".concat(String.valueOf(vml0Var.getClass())));
        }
    }

    public static final Boolean V(zzr zzrVar) {
        Boolean bool = zzrVar.E;
        String str = zzrVar.R;
        if (!TextUtils.isEmpty(str)) {
            int iOrdinal = xyk0.a(str).a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r11
      0x0047: PHI (r11v12 int) = (r11v2 int), (r11v0 int) binds: [B:15:0x0049, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:54:0x015a A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:8:0x0030, B:18:0x004e, B:55:0x015d, B:26:0x006c, B:31:0x00c8, B:30:0x00b6, B:32:0x00cd, B:36:0x00de, B:40:0x00f4, B:42:0x010c, B:44:0x0127, B:46:0x0130, B:48:0x0136, B:49:0x013a, B:51:0x0143, B:53:0x0152, B:54:0x015a, B:43:0x0118, B:37:0x00e5, B:39:0x00ee), top: B:64:0x0030, outer: #0 }] */
    public final void A(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        i5l0 i5l0Var = this.b;
        b().g();
        l0();
        hm20.e(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.t = false;
                O();
                throw th2;
            }
        }
        u4l0 u4l0Var = a().n;
        Integer numValueOf = Integer.valueOf(bArr.length);
        u4l0Var.b(numValueOf, "onConfigFetched. Response size");
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        lqk0Var.S();
        try {
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            k5l0 k5l0VarI0 = lqk0Var2.i0(str);
            if (i == 200 || i == 204) {
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 304) {
                i = 304;
                if (th == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (k5l0VarI0 == null) {
                a().i.b(y4l0.k(str), "App does not exist in onConfigFetched. appId");
            } else {
                e7l0 e7l0Var = this.a;
                if (z || i == 404) {
                    String strM = M("Last-Modified", map);
                    String strM2 = M("ETag", map);
                    if (i == 404 || i == 304) {
                        U(e7l0Var);
                        if (e7l0Var.s(str) == null) {
                            U(e7l0Var);
                            e7l0Var.u(str, null, null, null);
                        }
                    } else {
                        U(e7l0Var);
                        e7l0Var.u(str, strM, strM2, bArr);
                    }
                    e().getClass();
                    k5l0VarI0.f(System.currentTimeMillis());
                    lqk0 lqk0Var3 = this.c;
                    U(lqk0Var3);
                    lqk0Var3.j0(k5l0VarI0, false);
                    if (i == 404) {
                        a().k.b(str, "Config not found. Using empty config. appId");
                    } else {
                        a().n.c(Integer.valueOf(i), "Successfully fetched config. Got network response. code, size", numValueOf);
                    }
                    U(i5l0Var);
                    if (i5l0Var.k() && L()) {
                        q();
                    } else {
                        U(i5l0Var);
                        if (i5l0Var.k()) {
                            lqk0 lqk0Var4 = this.c;
                            U(lqk0Var4);
                            if (lqk0Var4.m(k5l0VarI0.D())) {
                                t(k5l0VarI0.D());
                            } else {
                                N();
                            }
                        } else {
                            N();
                        }
                    }
                } else {
                    e().getClass();
                    k5l0VarI0.g(System.currentTimeMillis());
                    lqk0 lqk0Var5 = this.c;
                    U(lqk0Var5);
                    lqk0Var5.j0(k5l0VarI0, false);
                    a().n.c(Integer.valueOf(i), "Fetching config failed. code, error", th);
                    U(e7l0Var);
                    e7l0Var.g();
                    e7l0Var.m.put(str, null);
                    d6l0 d6l0Var = this.i.i;
                    e().getClass();
                    d6l0Var.b(System.currentTimeMillis());
                    if (i == 503 || i == 429) {
                        d6l0 d6l0Var2 = this.i.g;
                        e().getClass();
                        d6l0Var2.b(System.currentTimeMillis());
                    }
                    N();
                }
            }
            lqk0 lqk0Var6 = this.c;
            U(lqk0Var6);
            lqk0Var6.T();
            lqk0 lqk0Var7 = this.c;
            U(lqk0Var7);
            lqk0Var7.U();
            this.t = false;
            O();
        } catch (Throwable th3) {
            lqk0 lqk0Var8 = this.c;
            U(lqk0Var8);
            lqk0Var8.U();
            throw th3;
        }
    }

    public final void B() {
        b().g();
        l0();
        if (this.n) {
            return;
        }
        this.n = true;
        b().g();
        FileLock fileLock = this.w;
        k8l0 k8l0Var = this.l;
        if (fileLock == null || !fileLock.isValid()) {
            wok0 wok0Var = this.c.a.d;
            File filesDir = k8l0Var.a.getFilesDir();
            int i = gvk0.a;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                this.x = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.w = fileLockTryLock;
                if (fileLockTryLock == null) {
                    a().f.a("Storage concurrent data access panic");
                    return;
                }
                a().n.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                a().f.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                a().f.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                a().i.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            a().n.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.x;
        b().g();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            a().f.a("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i3 = fileChannel.read(byteBufferAllocate);
                if (i3 == 4) {
                    byteBufferAllocate.flip();
                    i2 = byteBufferAllocate.getInt();
                } else if (i3 != -1) {
                    a().i.b(Integer.valueOf(i3), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                a().f.b(e4, "Failed to read from channel");
            }
        }
        b4l0 b4l0VarQ = k8l0Var.q();
        b4l0VarQ.h();
        int i4 = b4l0VarQ.e;
        b().g();
        if (i2 > i4) {
            a().f.c(Integer.valueOf(i2), "Panic: can't downgrade version. Previous, current version", Integer.valueOf(i4));
            return;
        }
        if (i2 < i4) {
            FileChannel fileChannel2 = this.x;
            b().g();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                a().f.a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i4);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        a().f.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    a().n.c(Integer.valueOf(i2), "Storage version upgraded. Previous, current version", Integer.valueOf(i4));
                    return;
                } catch (IOException e5) {
                    a().f.b(e5, "Failed to write to channel");
                }
            }
            a().f.c(Integer.valueOf(i2), "Storage version upgrade failed. Previous, current version", Integer.valueOf(i4));
        }
    }

    public final int F(String str, gpk0 gpk0Var) {
        dbl0 dbl0VarK;
        e7l0 e7l0Var = this.a;
        w3l0 w3l0VarB = e7l0Var.B(str);
        hbl0 hbl0Var = hbl0.AD_PERSONALIZATION;
        if (w3l0VarB == null) {
            gpk0Var.b(hbl0Var, cpk0.FAILSAFE);
            return 1;
        }
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        if (k5l0VarI0 == null || xyk0.a(k5l0VarI0.s()).a != dbl0.POLICY || (dbl0VarK = e7l0Var.k(str, hbl0Var)) == dbl0.UNINITIALIZED) {
            gpk0Var.b(hbl0Var, cpk0.REMOTE_DEFAULT);
            if (e7l0Var.A(str, hbl0Var)) {
                return 0;
            }
        } else {
            gpk0Var.b(hbl0Var, cpk0.REMOTE_ENFORCED_DEFAULT);
            if (dbl0VarK == dbl0.GRANTED) {
                return 0;
            }
        }
        return 1;
    }

    public final HashMap G(d7l0 d7l0Var) {
        Serializable serializableV;
        HashMap map = new HashMap();
        j0();
        HashMap map2 = new HashMap();
        for (k7l0 k7l0Var : d7l0Var.q()) {
            if (k7l0Var.r().startsWith("gad_") && (serializableV = pol0.v(k7l0Var)) != null) {
                map2.put(k7l0Var.r(), serializableV);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    public final void H() {
        b().g();
        if (this.q.isEmpty()) {
            return;
        }
        hnl0 hnl0Var = this.H;
        if (hnl0Var == null) {
            hnl0 hnl0Var2 = new hnl0(this, this.l);
            this.H = hnl0Var2;
            hnl0Var = hnl0Var2;
        }
        if (hnl0Var.c != 0) {
            return;
        }
        e().getClass();
        long jMax = Math.max(0L, ((long) ((Integer) v2l0.B0.a(null)).intValue()) - (SystemClock.elapsedRealtime() - this.I));
        a().n.b(Long.valueOf(jMax), "Scheduling notify next app runnable, delay in ms");
        hnl0 hnl0Var3 = this.H;
        if (hnl0Var3 == null) {
            hnl0 hnl0Var4 = new hnl0(this, this.l);
            this.H = hnl0Var4;
            hnl0Var3 = hnl0Var4;
        }
        hnl0Var3.b(jMax);
    }

    public final void J(l8l0 l8l0Var, long j, boolean z) {
        uol0 uol0Var;
        String str = true != z ? "_lte" : "_se";
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        uol0 uol0VarA0 = lqk0Var.a0(l8l0Var.s(), str);
        if (uol0VarA0 != null) {
            Object obj = uol0VarA0.e;
            String strS = l8l0Var.s();
            e().getClass();
            uol0Var = new uol0(strS, StompClient.DEFAULT_ACK, str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        } else {
            String strS2 = l8l0Var.s();
            e().getClass();
            uol0Var = new uol0(strS2, StompClient.DEFAULT_ACK, str, System.currentTimeMillis(), Long.valueOf(j));
        }
        q9l0 q9l0VarB = s9l0.B();
        q9l0VarB.g();
        ((s9l0) q9l0VarB.b).D(str);
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q9l0VarB.g();
        ((s9l0) q9l0VarB.b).C(jCurrentTimeMillis);
        Object obj2 = uol0Var.e;
        long jLongValue = ((Long) obj2).longValue();
        q9l0VarB.g();
        ((s9l0) q9l0VarB.b).G(jLongValue);
        s9l0 s9l0Var = (s9l0) q9l0VarB.i();
        int iP = pol0.P(str, l8l0Var);
        if (iP >= 0) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).d0(iP, s9l0Var);
        } else {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).e0(s9l0Var);
        }
        if (j > 0) {
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            lqk0Var2.Z(uol0Var);
            a().n.c(true != z ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", obj2);
        }
    }

    public final boolean L() {
        b().g();
        l0();
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        if (lqk0Var.Q("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        lqk0 lqk0Var2 = this.c;
        U(lqk0Var2);
        return !TextUtils.isEmpty(lqk0Var2.o());
    }

    public final void O() {
        b().g();
        if (this.t || this.u || this.v) {
            a().n.d(Boolean.valueOf(this.t), "Not stopping services. fetch, network, upload", Boolean.valueOf(this.u), Boolean.valueOf(this.v));
            return;
        }
        a().n.a("Stopping uploading service(s)");
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        ArrayList arrayList2 = this.p;
        hm20.h(arrayList2);
        arrayList2.clear();
    }

    public final Boolean P(k5l0 k5l0Var) {
        try {
            long jP = k5l0Var.P();
            k8l0 k8l0Var = this.l;
            if (jP != -2147483648L) {
                if (k5l0Var.P() == r7k0.a(k8l0Var.a).b(0, k5l0Var.D()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = r7k0.a(k8l0Var.a).b(0, k5l0Var.D()).versionName;
                String strN = k5l0Var.N();
                if (strN != null && strN.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final zzr Q(String str) {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        if (k5l0VarI0 != null) {
            k8l0 k8l0Var = k5l0VarI0.a;
            if (!TextUtils.isEmpty(k5l0VarI0.N())) {
                Boolean boolP = P(k5l0VarI0);
                if (boolP != null && !boolP.booleanValue()) {
                    a().f.b(y4l0.k(str), "App version does not match; dropping. appId");
                    return null;
                }
                String strG = k5l0VarI0.G();
                String strN = k5l0VarI0.N();
                long jP = k5l0VarI0.P();
                p7l0 p7l0Var = k8l0Var.g;
                k8l0.m(p7l0Var);
                p7l0Var.g();
                String str2 = k5l0VarI0.l;
                p7l0 p7l0Var2 = k8l0Var.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.g();
                long j = k5l0VarI0.m;
                p7l0 p7l0Var3 = k8l0Var.g;
                k8l0.m(p7l0Var3);
                p7l0Var3.g();
                long j2 = k5l0VarI0.n;
                p7l0 p7l0Var4 = k8l0Var.g;
                k8l0.m(p7l0Var4);
                p7l0Var4.g();
                boolean z = k5l0VarI0.o;
                String strJ = k5l0VarI0.J();
                p7l0 p7l0Var5 = k8l0Var.g;
                k8l0.m(p7l0Var5);
                p7l0Var5.g();
                boolean z2 = k5l0VarI0.p;
                Boolean boolW = k5l0VarI0.w();
                long jB = k5l0VarI0.b();
                p7l0 p7l0Var6 = k8l0Var.g;
                k8l0.m(p7l0Var6);
                p7l0Var6.g();
                ArrayList arrayList = k5l0VarI0.s;
                String strG2 = f(str).g();
                boolean zY = k5l0VarI0.y();
                p7l0 p7l0Var7 = k8l0Var.g;
                k8l0.m(p7l0Var7);
                p7l0Var7.g();
                long j3 = k5l0VarI0.v;
                int i = f(str).b;
                String str3 = o0(str).b;
                p7l0 p7l0Var8 = k8l0Var.g;
                k8l0.m(p7l0Var8);
                p7l0Var8.g();
                int i2 = k5l0VarI0.x;
                p7l0 p7l0Var9 = k8l0Var.g;
                k8l0.m(p7l0Var9);
                p7l0Var9.g();
                return new zzr(str, strG, strN, jP, str2, j, j2, (String) null, z, false, strJ, 0L, 0, z2, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j3, i, str3, i2, k5l0VarI0.B, k5l0VarI0.C(), k5l0VarI0.s(), 0L, k5l0VarI0.t());
            }
        }
        a().m.b(str, "No app data available; dropping");
        return null;
    }

    public final boolean R(String str, String str2) {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        msk0 msk0VarE = lqk0Var.E("events", str, str2);
        return msk0VarE == null || msk0VarE.c < 1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    public final void W(zzpl zzplVar, zzr zzrVar) {
        msk0 msk0VarE;
        long jLongValue;
        b().g();
        l0();
        boolean zT = T(zzrVar);
        String str = zzrVar.a;
        if (zT) {
            if (!zzrVar.v) {
                c0(zzrVar);
                return;
            }
            yol0 yol0VarK0 = k0();
            String str2 = zzplVar.b;
            int iM0 = yol0VarK0.m0(str2);
            ynl0 ynl0Var = this.J;
            if (iM0 != 0) {
                k0();
                e0();
                String strL = yol0.l(24, str2, true);
                int length = str2 != null ? str2.length() : 0;
                k0();
                yol0.w(ynl0Var, zzrVar.a, iM0, "_ev", strL, length);
                return;
            }
            int iT = k0().t(zzplVar.G0(), str2);
            if (iT != 0) {
                k0();
                e0();
                String strL2 = yol0.l(24, str2, true);
                Object objG0 = zzplVar.G0();
                int length2 = (objG0 == null || !((objG0 instanceof String) || (objG0 instanceof CharSequence))) ? 0 : objG0.toString().length();
                k0();
                yol0.w(ynl0Var, zzrVar.a, iT, "_ev", strL2, length2);
                return;
            }
            Object objU = k0().u(zzplVar.G0(), str2);
            if (objU != null) {
                String str3 = "_sid";
                if ("_sid".equals(str2)) {
                    long j = zzplVar.c;
                    String str4 = zzplVar.f;
                    hm20.h(str);
                    lqk0 lqk0Var = this.c;
                    U(lqk0Var);
                    uol0 uol0VarA0 = lqk0Var.a0(str, "_sno");
                    if (uol0VarA0 != null) {
                        Object obj = uol0VarA0.e;
                        if (obj instanceof Long) {
                            jLongValue = ((Long) obj).longValue();
                        } else {
                            if (uol0VarA0 != null) {
                                a().i.b(uol0VarA0.e, "Retrieved last session number from database does not contain a valid (long) value");
                            }
                            lqk0 lqk0Var2 = this.c;
                            U(lqk0Var2);
                            msk0VarE = lqk0Var2.E("events", str, "_s");
                            if (msk0VarE != null) {
                                u4l0 u4l0Var = a().n;
                                long j2 = msk0VarE.c;
                                u4l0Var.b(Long.valueOf(j2), "Backfill the session number. Last used session number");
                                jLongValue = j2;
                            } else {
                                jLongValue = 0;
                            }
                        }
                    } else {
                        if (uol0VarA0 != null) {
                            a().i.b(uol0VarA0.e, "Retrieved last session number from database does not contain a valid (long) value");
                        }
                        lqk0 lqk0Var3 = this.c;
                        U(lqk0Var3);
                        msk0VarE = lqk0Var3.E("events", str, "_s");
                        if (msk0VarE != null) {
                            u4l0 u4l0Var2 = a().n;
                            long j3 = msk0VarE.c;
                            u4l0Var2.b(Long.valueOf(j3), "Backfill the session number. Last used session number");
                            jLongValue = j3;
                        } else {
                            jLongValue = 0;
                        }
                    }
                    W(new zzpl(j, Long.valueOf(jLongValue + 1), "_sno", str4), zzrVar);
                } else {
                    str3 = "_sid";
                }
                hm20.h(str);
                String str5 = zzplVar.f;
                hm20.h(str5);
                uol0 uol0Var = new uol0(str, str5, str2, zzplVar.c, objU);
                u4l0 u4l0Var3 = a().n;
                k8l0 k8l0Var = this.l;
                k4l0 k4l0Var = k8l0Var.j;
                String str6 = uol0Var.c;
                u4l0Var3.c(k4l0Var.c(str6), "Setting user property", objU);
                lqk0 lqk0Var4 = this.c;
                U(lqk0Var4);
                lqk0Var4.S();
                try {
                    boolean zEquals = "_id".equals(str6);
                    Object obj2 = uol0Var.e;
                    if (zEquals) {
                        lqk0 lqk0Var5 = this.c;
                        U(lqk0Var5);
                        uol0 uol0VarA1 = lqk0Var5.a0(str, "_id");
                        if (uol0VarA1 != null && !obj2.equals(uol0VarA1.e)) {
                            lqk0 lqk0Var6 = this.c;
                            U(lqk0Var6);
                            lqk0Var6.Y(str, "_lair");
                        }
                    }
                    c0(zzrVar);
                    lqk0 lqk0Var7 = this.c;
                    U(lqk0Var7);
                    boolean Z = lqk0Var7.Z(uol0Var);
                    if (str3.equals(str2)) {
                        pol0 pol0Var = this.g;
                        U(pol0Var);
                        String str7 = zzrVar.J;
                        long jM = TextUtils.isEmpty(str7) ? 0L : pol0Var.M(str7.getBytes(Charset.forName("UTF-8")));
                        lqk0 lqk0Var8 = this.c;
                        U(lqk0Var8);
                        k5l0 k5l0VarI0 = lqk0Var8.i0(str);
                        if (k5l0VarI0 != null) {
                            k5l0VarI0.A(jM);
                            if (k5l0VarI0.o()) {
                                lqk0 lqk0Var9 = this.c;
                                U(lqk0Var9);
                                lqk0Var9.j0(k5l0VarI0, false);
                            }
                        }
                    }
                    lqk0 lqk0Var10 = this.c;
                    U(lqk0Var10);
                    lqk0Var10.T();
                    if (!Z) {
                        a().f.c(k8l0Var.j.c(str6), "Too many unique user properties are set. Ignoring user property", obj2);
                        k0();
                        yol0.w(ynl0Var, str, 9, null, null, 0);
                    }
                } finally {
                    lqk0 lqk0Var11 = this.c;
                    U(lqk0Var11);
                    lqk0Var11.U();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028d A[Catch: all -> 0x01df, TryCatch #5 {all -> 0x01df, blocks: (B:62:0x0175, B:65:0x0183, B:100:0x0262, B:102:0x028d, B:103:0x0290, B:70:0x01ab, B:72:0x01d3, B:75:0x01e4, B:77:0x01eb, B:79:0x01f1, B:81:0x01fb, B:83:0x0201, B:85:0x0207, B:87:0x020d, B:88:0x0212, B:94:0x022b, B:96:0x022f, B:97:0x0240, B:98:0x024b, B:99:0x0256), top: B:180:0x0175, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b3 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02eb A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02f3 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fa A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0307  */
    /* JADX WARN: Code duplicated, block: B:125:0x030d A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0318 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0326  */
    /* JADX WARN: Code duplicated, block: B:132:0x0329  */
    /* JADX WARN: Code duplicated, block: B:135:0x033c  */
    /* JADX WARN: Code duplicated, block: B:141:0x035d A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0365 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x036b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0373 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x037c A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x038c A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03b5 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x03ea A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03fa A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0420 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0428 A[Catch: all -> 0x02c8, TryCatch #4 {all -> 0x02c8, blocks: (B:105:0x0295, B:107:0x02b3, B:150:0x037c, B:151:0x037f, B:153:0x038c, B:154:0x039c, B:165:0x0444, B:112:0x02cb, B:117:0x02eb, B:119:0x02f3, B:121:0x02fa, B:125:0x030d, B:129:0x031f, B:133:0x032b, B:136:0x033e, B:141:0x035d, B:143:0x0365, B:145:0x036d, B:147:0x0373, B:139:0x034b, B:127:0x0318, B:115:0x02d9, B:155:0x03b5, B:157:0x03ea, B:158:0x03ed, B:160:0x03fa, B:161:0x0408, B:162:0x0420, B:164:0x0428), top: B:178:0x0136, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x010d A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0114 A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0121 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012c A[Catch: all -> 0x00c4, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0151 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183 A[Catch: all -> 0x01df, TRY_LEAVE, TryCatch #5 {all -> 0x01df, blocks: (B:62:0x0175, B:65:0x0183, B:100:0x0262, B:102:0x028d, B:103:0x0290, B:70:0x01ab, B:72:0x01d3, B:75:0x01e4, B:77:0x01eb, B:79:0x01f1, B:81:0x01fb, B:83:0x0201, B:85:0x0207, B:87:0x020d, B:88:0x0212, B:94:0x022b, B:96:0x022f, B:97:0x0240, B:98:0x024b, B:99:0x0256), top: B:180:0x0175, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0199 A[Catch: all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00c4, blocks: (B:24:0x00a4, B:26:0x00b4, B:34:0x00cc, B:38:0x00dc, B:40:0x00eb, B:46:0x0100, B:48:0x010d, B:50:0x0118, B:53:0x0121, B:56:0x0138, B:59:0x0151, B:67:0x0199, B:54:0x012c, B:49:0x0114, B:42:0x00f5, B:45:0x00fd), top: B:176:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3 A[Catch: all -> 0x01df, TryCatch #5 {all -> 0x01df, blocks: (B:62:0x0175, B:65:0x0183, B:100:0x0262, B:102:0x028d, B:103:0x0290, B:70:0x01ab, B:72:0x01d3, B:75:0x01e4, B:77:0x01eb, B:79:0x01f1, B:81:0x01fb, B:83:0x0201, B:85:0x0207, B:87:0x020d, B:88:0x0212, B:94:0x022b, B:96:0x022f, B:97:0x0240, B:98:0x024b, B:99:0x0256), top: B:180:0x0175, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4 A[Catch: all -> 0x01df, TryCatch #5 {all -> 0x01df, blocks: (B:62:0x0175, B:65:0x0183, B:100:0x0262, B:102:0x028d, B:103:0x0290, B:70:0x01ab, B:72:0x01d3, B:75:0x01e4, B:77:0x01eb, B:79:0x01f1, B:81:0x01fb, B:83:0x0201, B:85:0x0207, B:87:0x020d, B:88:0x0212, B:94:0x022b, B:96:0x022f, B:97:0x0240, B:98:0x024b, B:99:0x0256), top: B:180:0x0175, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x024b A[Catch: all -> 0x01df, TryCatch #5 {all -> 0x01df, blocks: (B:62:0x0175, B:65:0x0183, B:100:0x0262, B:102:0x028d, B:103:0x0290, B:70:0x01ab, B:72:0x01d3, B:75:0x01e4, B:77:0x01eb, B:79:0x01f1, B:81:0x01fb, B:83:0x0201, B:85:0x0207, B:87:0x020d, B:88:0x0212, B:94:0x022b, B:96:0x022f, B:97:0x0240, B:98:0x024b, B:99:0x0256), top: B:180:0x0175, inners: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.zzr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [iol0] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [iol0] */
    public final void Y(zzr zzrVar) throws Throwable {
        long j;
        long j2;
        lqk0 lqk0Var;
        msk0 msk0VarE;
        boolean z;
        long j3;
        iol0 iol0Var;
        long j4;
        iol0 iol0Var2;
        Bundle bundle;
        long j5;
        o6l0 o6l0Var;
        k8l0 k8l0Var;
        String str;
        Context context;
        y4l0 y4l0Var;
        k8l0 k8l0Var2;
        Intent intent;
        String str2;
        PackageManager packageManager;
        List<ResolveInfo> listQueryIntentServices;
        Bundle bundle2;
        long j6;
        String str3;
        long jU;
        k8l0 k8l0Var3;
        PackageInfo packageInfoB;
        zzr zzrVar2;
        ApplicationInfo applicationInfoA;
        long j7;
        long j8;
        boolean z2;
        long j9;
        iol0 iol0Var3 = zzrVar;
        k8l0 k8l0Var4 = this.l;
        b().g();
        l0();
        hm20.h(iol0Var3);
        boolean z3 = iol0Var3.D;
        String str4 = iol0Var3.a;
        hm20.e(str4);
        if (!T(iol0Var3)) {
            return;
        }
        lqk0 lqk0Var2 = this.c;
        U(lqk0Var2);
        k5l0 k5l0VarI0 = lqk0Var2.i0(str4);
        if (k5l0VarI0 != null && TextUtils.isEmpty(k5l0VarI0.G()) && !TextUtils.isEmpty(iol0Var3.b)) {
            k5l0VarI0.f(0L);
            lqk0 lqk0Var3 = this.c;
            U(lqk0Var3);
            lqk0Var3.j0(k5l0VarI0, false);
            e7l0 e7l0Var = this.a;
            U(e7l0Var);
            e7l0Var.g();
            e7l0Var.h.remove(str4);
        }
        if (!iol0Var3.v) {
            c0(zzrVar);
            return;
        }
        long jCurrentTimeMillis = iol0Var3.A;
        if (jCurrentTimeMillis == 0) {
            e().getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j10 = jCurrentTimeMillis;
        int i = iol0Var3.B;
        if (i != 0 && i != 1) {
            a().i.c(y4l0.k(str4), "Incorrect app type, assuming installed app. appId, appType", Integer.valueOf(i));
            i = 0;
        }
        lqk0 lqk0Var4 = this.c;
        U(lqk0Var4);
        lqk0Var4.S();
        try {
            lqk0 lqk0Var5 = this.c;
            U(lqk0Var5);
            uol0 uol0VarA0 = lqk0Var5.a0(str4, "_npa");
            Boolean boolV = V(iol0Var3);
            try {
                if (uol0VarA0 != null) {
                    j = 1;
                    if (!StompClient.DEFAULT_ACK.equals(uol0VarA0.b)) {
                        j2 = j10;
                    }
                    if (e0().q(null, v2l0.b1)) {
                        b0(iol0Var3, iol0Var3.S);
                    } else {
                        b0(iol0Var3, j2);
                    }
                    c0(zzrVar);
                    lqk0Var = this.c;
                    if (i == 0) {
                        U(lqk0Var);
                        msk0VarE = lqk0Var.E("events", str4, "_f");
                        z = false;
                    } else {
                        U(lqk0Var);
                        msk0VarE = lqk0Var.E("events", str4, "_v");
                        z = true;
                    }
                    if (msk0VarE == null) {
                        j4 = ((j2 / 3600000) + j) * 3600000;
                        if (z) {
                            iol0Var2 = this;
                            Long lValueOf = Long.valueOf(j4);
                            long j11 = j2;
                            iol0Var2.W(new zzpl(j11, lValueOf, "_fvt", StompClient.DEFAULT_ACK), iol0Var3);
                            iol0Var2.b().g();
                            iol0Var2.l0();
                            bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (z3) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (iol0Var2.e0().q(null, v2l0.j1)) {
                                iol0Var2.e().getClass();
                                bundle.putLong("_elt", System.currentTimeMillis());
                            }
                            iol0Var2.i(new zzbg("_v", new zzbe(bundle), StompClient.DEFAULT_ACK, j11), iol0Var3);
                            iol0Var3 = iol0Var2;
                        } else {
                            Long lValueOf2 = Long.valueOf(j4);
                            j5 = j2;
                            W(new zzpl(j5, lValueOf2, "_fot", StompClient.DEFAULT_ACK), iol0Var3);
                            b().g();
                            o6l0Var = this.k;
                            hm20.h(o6l0Var);
                            k8l0Var = o6l0Var.a;
                            if (str4 != null) {
                                try {
                                    if (str4.isEmpty()) {
                                        k8l0Var2 = k8l0Var4;
                                        str = "_elt";
                                        str2 = str4;
                                        y4l0 y4l0Var2 = k8l0Var.f;
                                        k8l0.m(y4l0Var2);
                                        y4l0Var2.j.a("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        str = "_elt";
                                        p7l0 p7l0Var = k8l0Var.g;
                                        context = k8l0Var.a;
                                        y4l0Var = k8l0Var.f;
                                        k8l0.m(p7l0Var);
                                        p7l0Var.g();
                                        if (o6l0Var.a()) {
                                            k8l0Var2 = k8l0Var4;
                                            n6l0 n6l0Var = new n6l0(o6l0Var, str4);
                                            p7l0 p7l0Var2 = k8l0Var.g;
                                            k8l0.m(p7l0Var2);
                                            p7l0Var2.g();
                                            str2 = str4;
                                            intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            packageManager = context.getPackageManager();
                                            if (packageManager == null) {
                                                k8l0.m(y4l0Var);
                                                y4l0Var.j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (listQueryIntentServices != null || listQueryIntentServices.isEmpty()) {
                                                    k8l0.m(y4l0Var);
                                                    y4l0Var.l.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str5 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str5) && o6l0Var.a()) {
                                                            try {
                                                                boolean zA = zua.b().a(context, new Intent(intent), n6l0Var, 1);
                                                                k8l0.m(y4l0Var);
                                                                y4l0Var.n.b(zA ? "available" : "not available", "Install Referrer Service is");
                                                            } catch (RuntimeException e) {
                                                                y4l0 y4l0Var3 = k8l0Var.f;
                                                                k8l0.m(y4l0Var3);
                                                                y4l0Var3.f.b(e.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            k8l0.m(y4l0Var);
                                                            y4l0Var.i.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            k8l0.m(y4l0Var);
                                            y4l0Var.l.a("Install Referrer Reporter is not available");
                                            k8l0Var2 = k8l0Var4;
                                            str2 = str4;
                                        }
                                    }
                                    b().g();
                                    l0();
                                    bundle2 = new Bundle();
                                    j6 = j;
                                    bundle2.putLong("_c", j6);
                                    bundle2.putLong("_r", j6);
                                    bundle2.putLong("_uwa", 0L);
                                    bundle2.putLong("_pfo", 0L);
                                    bundle2.putLong("_sys", 0L);
                                    bundle2.putLong("_sysu", 0L);
                                    bundle2.putLong("_et", j6);
                                    if (z3) {
                                        bundle2.putLong("_dac", j6);
                                    }
                                    hm20.h(str2);
                                    iol0Var3 = this;
                                    lqk0 lqk0Var6 = iol0Var3.c;
                                    U(lqk0Var6);
                                    hm20.e(str2);
                                    lqk0Var6.g();
                                    lqk0Var6.h();
                                    str3 = str2;
                                    jU = lqk0Var6.u(str3);
                                    k8l0Var3 = k8l0Var2;
                                    if (k8l0Var3.a.getPackageManager() == null) {
                                        iol0Var3.a().f.b(y4l0.k(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                        zzrVar2 = zzrVar;
                                    } else {
                                        try {
                                            packageInfoB = r7k0.a(k8l0Var3.a).b(0, str3);
                                        } catch (PackageManager.NameNotFoundException e2) {
                                            iol0Var3.a().f.c(y4l0.k(str3), "Package info is null, first open report might be inaccurate. appId", e2);
                                            packageInfoB = null;
                                        }
                                        if (packageInfoB != null) {
                                            j8 = packageInfoB.firstInstallTime;
                                            if (j8 != 0) {
                                                if (j8 != packageInfoB.lastUpdateTime) {
                                                    if (iol0Var3.e0().q(null, v2l0.I0)) {
                                                        bundle2.putLong("_uwa", 1L);
                                                    } else if (jU == 0) {
                                                        bundle2.putLong("_uwa", 1L);
                                                        z2 = false;
                                                        jU = 0;
                                                    }
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (true != z2) {
                                                    j9 = 0;
                                                } else {
                                                    j9 = 1;
                                                }
                                                zzpl zzplVar = new zzpl(j5, Long.valueOf(j9), "_fi", StompClient.DEFAULT_ACK);
                                                zzrVar2 = zzrVar;
                                                iol0Var3.W(zzplVar, zzrVar2);
                                            } else {
                                                zzrVar2 = zzrVar;
                                            }
                                        } else {
                                            zzrVar2 = zzrVar;
                                        }
                                        try {
                                            applicationInfoA = r7k0.a(k8l0Var3.a).a(0, str3);
                                        } catch (PackageManager.NameNotFoundException e3) {
                                            iol0Var3.a().f.c(y4l0.k(str3), "Application info is null, first open report might be inaccurate. appId", e3);
                                            applicationInfoA = null;
                                        }
                                        if (applicationInfoA != null) {
                                            if ((applicationInfoA.flags & 1) != 0) {
                                                j7 = 1;
                                                bundle2.putLong("_sys", 1L);
                                            } else {
                                                j7 = 1;
                                            }
                                            if ((applicationInfoA.flags & 128) != 0) {
                                                bundle2.putLong("_sysu", j7);
                                            }
                                        }
                                    }
                                    if (jU >= 0) {
                                        bundle2.putLong("_pfo", jU);
                                    }
                                    if (iol0Var3.e0().q(null, v2l0.j1)) {
                                        iol0Var3.e().getClass();
                                        bundle2.putLong(str, System.currentTimeMillis());
                                    }
                                    iol0Var3.i(new zzbg("_f", new zzbe(bundle2), StompClient.DEFAULT_ACK, j5), zzrVar2);
                                    iol0Var3 = iol0Var3;
                                } catch (Throwable th) {
                                    th = th;
                                    iol0Var3 = this;
                                    lqk0 lqk0Var7 = iol0Var3.c;
                                    U(lqk0Var7);
                                    lqk0Var7.U();
                                    throw th;
                                }
                            } else {
                                k8l0Var2 = k8l0Var4;
                                str = "_elt";
                                str2 = str4;
                                y4l0 y4l0Var4 = k8l0Var.f;
                                k8l0.m(y4l0Var4);
                                y4l0Var4.j.a("Install Referrer Reporter was called with invalid app package name");
                                b().g();
                                l0();
                                bundle2 = new Bundle();
                                j6 = j;
                                bundle2.putLong("_c", j6);
                                bundle2.putLong("_r", j6);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", j6);
                                if (z3) {
                                    bundle2.putLong("_dac", j6);
                                }
                                hm20.h(str2);
                                iol0Var3 = this;
                                lqk0 lqk0Var8 = iol0Var3.c;
                                U(lqk0Var8);
                                hm20.e(str2);
                                lqk0Var8.g();
                                lqk0Var8.h();
                                str3 = str2;
                                jU = lqk0Var8.u(str3);
                                k8l0Var3 = k8l0Var2;
                                if (k8l0Var3.a.getPackageManager() == null) {
                                    iol0Var3.a().f.b(y4l0.k(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                    zzrVar2 = zzrVar;
                                } else {
                                    packageInfoB = r7k0.a(k8l0Var3.a).b(0, str3);
                                    if (packageInfoB != null) {
                                        j8 = packageInfoB.firstInstallTime;
                                        if (j8 != 0) {
                                            if (j8 != packageInfoB.lastUpdateTime) {
                                                if (iol0Var3.e0().q(null, v2l0.I0)) {
                                                    bundle2.putLong("_uwa", 1L);
                                                } else if (jU == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    z2 = false;
                                                    jU = 0;
                                                }
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            if (true != z2) {
                                                j9 = 0;
                                            } else {
                                                j9 = 1;
                                            }
                                            zzpl zzplVar2 = new zzpl(j5, Long.valueOf(j9), "_fi", StompClient.DEFAULT_ACK);
                                            zzrVar2 = zzrVar;
                                            iol0Var3.W(zzplVar2, zzrVar2);
                                        } else {
                                            zzrVar2 = zzrVar;
                                        }
                                    } else {
                                        zzrVar2 = zzrVar;
                                    }
                                    applicationInfoA = r7k0.a(k8l0Var3.a).a(0, str3);
                                    if (applicationInfoA != null) {
                                        if ((applicationInfoA.flags & 1) != 0) {
                                            j7 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j7 = 1;
                                        }
                                        if ((applicationInfoA.flags & 128) != 0) {
                                            bundle2.putLong("_sysu", j7);
                                        }
                                    }
                                }
                                if (jU >= 0) {
                                    bundle2.putLong("_pfo", jU);
                                }
                                if (iol0Var3.e0().q(null, v2l0.j1)) {
                                    iol0Var3.e().getClass();
                                    bundle2.putLong(str, System.currentTimeMillis());
                                }
                                iol0Var3.i(new zzbg("_f", new zzbe(bundle2), StompClient.DEFAULT_ACK, j5), zzrVar2);
                                iol0Var3 = iol0Var3;
                            }
                        }
                    } else {
                        j3 = j2;
                        iol0Var = this;
                        if (iol0Var3.w) {
                            iol0Var3 = iol0Var;
                            iol0Var.i(new zzbg("_cd", new zzbe(new Bundle()), StompClient.DEFAULT_ACK, j3), iol0Var3);
                            iol0Var3 = iol0Var;
                        }
                    }
                    iol0Var3 = iol0Var;
                    lqk0 lqk0Var9 = iol0Var3.c;
                    U(lqk0Var9);
                    lqk0Var9.T();
                    lqk0 lqk0Var10 = iol0Var3.c;
                    U(lqk0Var10);
                    lqk0Var10.U();
                    return;
                }
                j = 1;
                if (msk0VarE == null) {
                    j4 = ((j2 / 3600000) + j) * 3600000;
                    if (z) {
                        Long lValueOf3 = Long.valueOf(j4);
                        j5 = j2;
                        W(new zzpl(j5, lValueOf3, "_fot", StompClient.DEFAULT_ACK), iol0Var3);
                        b().g();
                        o6l0Var = this.k;
                        hm20.h(o6l0Var);
                        k8l0Var = o6l0Var.a;
                        if (str4 != null) {
                            if (str4.isEmpty()) {
                                k8l0Var2 = k8l0Var4;
                                str = "_elt";
                                str2 = str4;
                                y4l0 y4l0Var5 = k8l0Var.f;
                                k8l0.m(y4l0Var5);
                                y4l0Var5.j.a("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                str = "_elt";
                                p7l0 p7l0Var3 = k8l0Var.g;
                                context = k8l0Var.a;
                                y4l0Var = k8l0Var.f;
                                k8l0.m(p7l0Var3);
                                p7l0Var3.g();
                                if (o6l0Var.a()) {
                                    k8l0.m(y4l0Var);
                                    y4l0Var.l.a("Install Referrer Reporter is not available");
                                    k8l0Var2 = k8l0Var4;
                                    str2 = str4;
                                } else {
                                    k8l0Var2 = k8l0Var4;
                                    n6l0 n6l0Var2 = new n6l0(o6l0Var, str4);
                                    p7l0 p7l0Var4 = k8l0Var.g;
                                    k8l0.m(p7l0Var4);
                                    p7l0Var4.g();
                                    str2 = str4;
                                    intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    packageManager = context.getPackageManager();
                                    if (packageManager == null) {
                                        k8l0.m(y4l0Var);
                                        y4l0Var.j.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (listQueryIntentServices != null) {
                                            k8l0.m(y4l0Var);
                                            y4l0Var.l.a("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            k8l0.m(y4l0Var);
                                            y4l0Var.l.a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                            }
                            b().g();
                            l0();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (z3) {
                                bundle2.putLong("_dac", j6);
                            }
                            hm20.h(str2);
                            iol0Var3 = this;
                            lqk0 lqk0Var11 = iol0Var3.c;
                            U(lqk0Var11);
                            hm20.e(str2);
                            lqk0Var11.g();
                            lqk0Var11.h();
                            str3 = str2;
                            jU = lqk0Var11.u(str3);
                            k8l0Var3 = k8l0Var2;
                            if (k8l0Var3.a.getPackageManager() == null) {
                                iol0Var3.a().f.b(y4l0.k(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                zzrVar2 = zzrVar;
                            } else {
                                packageInfoB = r7k0.a(k8l0Var3.a).b(0, str3);
                                if (packageInfoB != null) {
                                    j8 = packageInfoB.firstInstallTime;
                                    if (j8 != 0) {
                                        if (j8 != packageInfoB.lastUpdateTime) {
                                            if (iol0Var3.e0().q(null, v2l0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jU == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jU = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        zzpl zzplVar3 = new zzpl(j5, Long.valueOf(j9), "_fi", StompClient.DEFAULT_ACK);
                                        zzrVar2 = zzrVar;
                                        iol0Var3.W(zzplVar3, zzrVar2);
                                    } else {
                                        zzrVar2 = zzrVar;
                                    }
                                } else {
                                    zzrVar2 = zzrVar;
                                }
                                applicationInfoA = r7k0.a(k8l0Var3.a).a(0, str3);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j7 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j7 = 1;
                                    }
                                    if ((applicationInfoA.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j7);
                                    }
                                }
                            }
                            if (jU >= 0) {
                                bundle2.putLong("_pfo", jU);
                            }
                            if (iol0Var3.e0().q(null, v2l0.j1)) {
                                iol0Var3.e().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            iol0Var3.i(new zzbg("_f", new zzbe(bundle2), StompClient.DEFAULT_ACK, j5), zzrVar2);
                            iol0Var3 = iol0Var3;
                        } else {
                            k8l0Var2 = k8l0Var4;
                            str = "_elt";
                            str2 = str4;
                            y4l0 y4l0Var6 = k8l0Var.f;
                            k8l0.m(y4l0Var6);
                            y4l0Var6.j.a("Install Referrer Reporter was called with invalid app package name");
                            b().g();
                            l0();
                            bundle2 = new Bundle();
                            j6 = j;
                            bundle2.putLong("_c", j6);
                            bundle2.putLong("_r", j6);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j6);
                            if (z3) {
                                bundle2.putLong("_dac", j6);
                            }
                            hm20.h(str2);
                            iol0Var3 = this;
                            lqk0 lqk0Var12 = iol0Var3.c;
                            U(lqk0Var12);
                            hm20.e(str2);
                            lqk0Var12.g();
                            lqk0Var12.h();
                            str3 = str2;
                            jU = lqk0Var12.u(str3);
                            k8l0Var3 = k8l0Var2;
                            if (k8l0Var3.a.getPackageManager() == null) {
                                iol0Var3.a().f.b(y4l0.k(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                zzrVar2 = zzrVar;
                            } else {
                                packageInfoB = r7k0.a(k8l0Var3.a).b(0, str3);
                                if (packageInfoB != null) {
                                    j8 = packageInfoB.firstInstallTime;
                                    if (j8 != 0) {
                                        if (j8 != packageInfoB.lastUpdateTime) {
                                            if (iol0Var3.e0().q(null, v2l0.I0)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (jU == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                z2 = false;
                                                jU = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j9 = 0;
                                        } else {
                                            j9 = 1;
                                        }
                                        zzpl zzplVar4 = new zzpl(j5, Long.valueOf(j9), "_fi", StompClient.DEFAULT_ACK);
                                        zzrVar2 = zzrVar;
                                        iol0Var3.W(zzplVar4, zzrVar2);
                                    } else {
                                        zzrVar2 = zzrVar;
                                    }
                                } else {
                                    zzrVar2 = zzrVar;
                                }
                                applicationInfoA = r7k0.a(k8l0Var3.a).a(0, str3);
                                if (applicationInfoA != null) {
                                    if ((applicationInfoA.flags & 1) != 0) {
                                        j7 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j7 = 1;
                                    }
                                    if ((applicationInfoA.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j7);
                                    }
                                }
                            }
                            if (jU >= 0) {
                                bundle2.putLong("_pfo", jU);
                            }
                            if (iol0Var3.e0().q(null, v2l0.j1)) {
                                iol0Var3.e().getClass();
                                bundle2.putLong(str, System.currentTimeMillis());
                            }
                            iol0Var3.i(new zzbg("_f", new zzbe(bundle2), StompClient.DEFAULT_ACK, j5), zzrVar2);
                            iol0Var3 = iol0Var3;
                        }
                    } else {
                        iol0Var2 = this;
                        Long lValueOf4 = Long.valueOf(j4);
                        long j12 = j2;
                        iol0Var2.W(new zzpl(j12, lValueOf4, "_fvt", StompClient.DEFAULT_ACK), iol0Var3);
                        iol0Var2.b().g();
                        iol0Var2.l0();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (z3) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (iol0Var2.e0().q(null, v2l0.j1)) {
                            iol0Var2.e().getClass();
                            bundle.putLong("_elt", System.currentTimeMillis());
                        }
                        iol0Var2.i(new zzbg("_v", new zzbe(bundle), StompClient.DEFAULT_ACK, j12), iol0Var3);
                        iol0Var3 = iol0Var2;
                    }
                } else {
                    j3 = j2;
                    iol0Var = this;
                    if (iol0Var3.w) {
                        iol0Var3 = iol0Var;
                        iol0Var.i(new zzbg("_cd", new zzbe(new Bundle()), StompClient.DEFAULT_ACK, j3), iol0Var3);
                        iol0Var3 = iol0Var;
                    }
                }
                iol0Var3 = iol0Var;
                lqk0 lqk0Var13 = iol0Var3.c;
                U(lqk0Var13);
                lqk0Var13.T();
                lqk0 lqk0Var14 = iol0Var3.c;
                U(lqk0Var14);
                lqk0Var14.U();
                return;
            } catch (Throwable th2) {
                th = th2;
                lqk0 lqk0Var15 = iol0Var3.c;
                U(lqk0Var15);
                lqk0Var15.U();
                throw th;
            }
            if (boolV != null) {
                zzpl zzplVar5 = new zzpl(j10, Long.valueOf(true != boolV.booleanValue() ? 0L : j), "_npa", StompClient.DEFAULT_ACK);
                j2 = j10;
                if (uol0VarA0 == null || !uol0VarA0.e.equals(zzplVar5.d)) {
                    W(zzplVar5, iol0Var3);
                }
            } else {
                j2 = j10;
                if (uol0VarA0 != null) {
                    X("_npa", iol0Var3);
                }
            }
            if (e0().q(null, v2l0.b1)) {
                b0(iol0Var3, iol0Var3.S);
            } else {
                b0(iol0Var3, j2);
            }
            c0(zzrVar);
            lqk0Var = this.c;
            if (i == 0) {
                U(lqk0Var);
                msk0VarE = lqk0Var.E("events", str4, "_f");
                z = false;
            } else {
                U(lqk0Var);
                msk0VarE = lqk0Var.E("events", str4, "_v");
                z = true;
            }
        } catch (Throwable th3) {
            th = th3;
            iol0Var3 = this;
        }
    }

    @Override // defpackage.zal0
    public final y4l0 a() {
        k8l0 k8l0Var = this.l;
        hm20.h(k8l0Var);
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        return y4l0Var;
    }

    public final void a0(zzah zzahVar, zzr zzrVar) {
        hm20.e(zzahVar.a);
        hm20.h(zzahVar.c);
        hm20.e(zzahVar.c.b);
        b().g();
        l0();
        if (T(zzrVar)) {
            if (!zzrVar.v) {
                c0(zzrVar);
                return;
            }
            lqk0 lqk0Var = this.c;
            U(lqk0Var);
            lqk0Var.S();
            try {
                c0(zzrVar);
                String str = zzahVar.a;
                hm20.h(str);
                lqk0 lqk0Var2 = this.c;
                U(lqk0Var2);
                zzah zzahVarE0 = lqk0Var2.e0(str, zzahVar.c.b);
                k8l0 k8l0Var = this.l;
                if (zzahVarE0 != null) {
                    a().m.c(zzahVar.a, "Removing conditional user property", k8l0Var.j.c(zzahVar.c.b));
                    lqk0 lqk0Var3 = this.c;
                    U(lqk0Var3);
                    lqk0Var3.f0(str, zzahVar.c.b);
                    if (zzahVarE0.e) {
                        lqk0 lqk0Var4 = this.c;
                        U(lqk0Var4);
                        lqk0Var4.Y(str, zzahVar.c.b);
                    }
                    zzbg zzbgVar = zzahVar.z;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.b;
                        zzbg zzbgVarJ = k0().J(zzbgVar.a, zzbeVar != null ? zzbeVar.b1() : null, zzahVarE0.b, zzbgVar.d, true);
                        hm20.h(zzbgVarJ);
                        l(zzbgVarJ, zzrVar);
                    }
                } else {
                    a().i.c(y4l0.k(zzahVar.a), "Conditional user property doesn't exist", k8l0Var.j.c(zzahVar.c.b));
                }
                lqk0 lqk0Var5 = this.c;
                U(lqk0Var5);
                lqk0Var5.T();
            } finally {
                lqk0 lqk0Var6 = this.c;
                U(lqk0Var6);
                lqk0Var6.U();
            }
        }
    }

    @Override // defpackage.zal0
    public final p7l0 b() {
        k8l0 k8l0Var = this.l;
        hm20.h(k8l0Var);
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        return p7l0Var;
    }

    public final void b0(zzr zzrVar, long j) throws Throwable {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        String str = zzrVar.a;
        hm20.h(str);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        if (k5l0VarI0 != null) {
            k0();
            String str2 = zzrVar.b;
            String strG = k5l0VarI0.G();
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean zIsEmpty2 = TextUtils.isEmpty(strG);
            if (!zIsEmpty && !zIsEmpty2) {
                hm20.h(str2);
                if (!str2.equals(strG)) {
                    a().i.b(y4l0.k(k5l0VarI0.D()), "New GMP App Id passed in. Removing cached database data. appId");
                    lqk0 lqk0Var2 = this.c;
                    U(lqk0Var2);
                    k8l0 k8l0Var = lqk0Var2.a;
                    String strD = k5l0VarI0.D();
                    lqk0Var2.h();
                    lqk0Var2.g();
                    hm20.e(strD);
                    try {
                        SQLiteDatabase sQLiteDatabaseV = lqk0Var2.V();
                        String[] strArr = {strD};
                        int iDelete = sQLiteDatabaseV.delete("events", "app_id=?", strArr) + sQLiteDatabaseV.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseV.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseV.delete("apps", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseV.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseV.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseV.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseV.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseV.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("trigger_uris", "app_id=?", strArr);
                        if (k8l0Var.d.q(null, v2l0.h1)) {
                            iDelete += sQLiteDatabaseV.delete("no_data_mode_events", "app_id=?", strArr);
                        }
                        if (iDelete > 0) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.n.c(strD, "Deleted application data. app, records", Integer.valueOf(iDelete));
                        }
                    } catch (SQLiteException e) {
                        y4l0 y4l0Var2 = k8l0Var.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.f.c(y4l0.k(strD), "Error deleting application data. appId, error", e);
                    }
                    k5l0VarI0 = null;
                }
            }
        }
        if (k5l0VarI0 != null) {
            boolean z = (k5l0VarI0.P() == -2147483648L || k5l0VarI0.P() == zzrVar.y) ? false : true;
            String strN = k5l0VarI0.N();
            if (z || ((k5l0VarI0.P() != -2147483648L || strN == null || strN.equals(zzrVar.c)) ? false : true)) {
                zzbg zzbgVar = new zzbg("_au", new zzbe(mll0.a("_pv", strN)), StompClient.DEFAULT_ACK, j);
                if (e0().q(null, v2l0.c1)) {
                    i(zzbgVar, zzrVar);
                } else {
                    j(zzbgVar, zzrVar);
                }
            }
        }
    }

    @Override // defpackage.zal0
    public final l9c c() {
        return this.l.c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x029e  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x019d  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x021a  */
    /* JADX WARN: Code duplicated, block: B:79:0x021c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0232  */
    /* JADX WARN: Code duplicated, block: B:83:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:88:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x028e  */
    public final k5l0 c0(zzr zzrVar) {
        boolean z;
        k8l0 k8l0Var;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        boolean z2;
        bpl0 bpl0Var;
        boolean z3;
        boolean z4;
        String str5;
        boolean z5;
        String str6;
        boolean z6;
        int i;
        boolean z7;
        b().g();
        l0();
        hm20.h(zzrVar);
        boolean z8 = zzrVar.C;
        String str7 = zzrVar.a;
        hm20.e(str7);
        String str8 = zzrVar.I;
        if (!str8.isEmpty()) {
            this.D.put(str7, new col0(this, str8));
        }
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str7);
        jbl0 jbl0VarJ = f(str7).j(jbl0.c(100, zzrVar.H));
        hbl0 hbl0Var = hbl0.AD_STORAGE;
        String strL = jbl0VarJ.i(hbl0Var) ? this.i.l(str7, z8) : "";
        boolean z9 = true;
        hbl0 hbl0Var2 = hbl0.ANALYTICS_STORAGE;
        if (k5l0VarI0 != null) {
            k8l0 k8l0Var2 = k5l0VarI0.a;
            if (jbl0VarJ.i(hbl0Var) && strL != null) {
                p7l0 p7l0Var = k8l0Var2.g;
                k8l0.m(p7l0Var);
                p7l0Var.g();
                if (!strL.equals(k5l0VarI0.e)) {
                    p7l0 p7l0Var2 = k8l0Var2.g;
                    k8l0.m(p7l0Var2);
                    p7l0Var2.g();
                    boolean zIsEmpty = TextUtils.isEmpty(k5l0VarI0.e);
                    k5l0VarI0.I(strL);
                    if (z8) {
                        mkl0 mkl0Var = this.i;
                        mkl0Var.getClass();
                        if (!"00000000-0000-0000-0000-000000000000".equals((jbl0VarJ.i(hbl0Var) ? mkl0Var.k(str7) : new Pair("", Boolean.FALSE)).first) && !zIsEmpty) {
                            if (jbl0VarJ.i(hbl0Var2)) {
                                k5l0VarI0.F(o(jbl0VarJ));
                                z = false;
                            } else {
                                z = true;
                            }
                            lqk0 lqk0Var2 = this.c;
                            U(lqk0Var2);
                            if (lqk0Var2.a0(str7, "_id") != null) {
                                lqk0 lqk0Var3 = this.c;
                                U(lqk0Var3);
                                if (lqk0Var3.a0(str7, "_lair") == null) {
                                    e().getClass();
                                    uol0 uol0Var = new uol0(str7, StompClient.DEFAULT_ACK, "_lair", System.currentTimeMillis(), 1L);
                                    lqk0 lqk0Var4 = this.c;
                                    U(lqk0Var4);
                                    lqk0Var4.Z(uol0Var);
                                }
                            }
                        }
                    }
                    if (TextUtils.isEmpty(k5l0VarI0.E()) && jbl0VarJ.i(hbl0Var2)) {
                        k5l0VarI0.F(o(jbl0VarJ));
                    }
                } else if (TextUtils.isEmpty(k5l0VarI0.E())) {
                    k5l0VarI0.F(o(jbl0VarJ));
                }
            } else if (TextUtils.isEmpty(k5l0VarI0.E()) && jbl0VarJ.i(hbl0Var2)) {
                k5l0VarI0.F(o(jbl0VarJ));
            }
            k8l0Var = k5l0VarI0.a;
            k5l0VarI0.H(zzrVar.b);
            str = zzrVar.z;
            if (!TextUtils.isEmpty(str)) {
                k5l0VarI0.K(str);
            }
            j = zzrVar.e;
            if (j != 0) {
                k5l0VarI0.S(j);
            }
            str2 = zzrVar.c;
            if (!TextUtils.isEmpty(str2)) {
                k5l0VarI0.O(str2);
            }
            k5l0VarI0.Q(zzrVar.y);
            str3 = zzrVar.d;
            if (str3 != null) {
                k5l0VarI0.R(str3);
            }
            k5l0VarI0.a(zzrVar.f);
            k5l0VarI0.d(zzrVar.v);
            str4 = zzrVar.i;
            if (!TextUtils.isEmpty(str4)) {
                k5l0VarI0.v(str4);
            }
            p7l0 p7l0Var3 = k8l0Var.g;
            k8l0.m(p7l0Var3);
            p7l0Var3.g();
            boolean z10 = k5l0VarI0.Q;
            if (k5l0VarI0.p != z8) {
                z2 = true;
            } else {
                z2 = false;
            }
            k5l0VarI0.Q = z10 | z2;
            k5l0VarI0.p = z8;
            Boolean bool = zzrVar.E;
            p7l0 p7l0Var4 = k8l0Var.g;
            k8l0.m(p7l0Var4);
            p7l0Var4.g();
            k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.q, bool);
            k5l0VarI0.q = bool;
            k5l0VarI0.c(zzrVar.F);
            String str9 = zzrVar.J;
            p7l0 p7l0Var5 = k8l0Var.g;
            k8l0.m(p7l0Var5);
            p7l0Var5.g();
            k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.t, str9);
            k5l0VarI0.t = str9;
            bpl0Var = bpl0.b;
            if (e0().q(null, v2l0.L0)) {
                k5l0VarI0.x(zzrVar.G);
            } else {
                if (e0().q(null, v2l0.K0)) {
                    k5l0VarI0.x(null);
                }
            }
            z3 = zzrVar.K;
            p7l0 p7l0Var6 = k8l0Var.g;
            k8l0.m(p7l0Var6);
            p7l0Var6.g();
            boolean z11 = k5l0VarI0.Q;
            if (k5l0VarI0.u != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            k5l0VarI0.Q = z11 | z4;
            k5l0VarI0.u = z3;
            str5 = zzrVar.Q;
            p7l0 p7l0Var7 = k8l0Var.g;
            k8l0.m(p7l0Var7);
            p7l0Var7.g();
            boolean z12 = k5l0VarI0.Q;
            if (k5l0VarI0.C != str5) {
                z5 = true;
            } else {
                z5 = false;
            }
            k5l0VarI0.Q = z12 | z5;
            k5l0VarI0.C = str5;
            kql0.a();
            if (e0().q(null, v2l0.P0)) {
                i = zzrVar.O;
                p7l0 p7l0Var8 = k8l0Var.g;
                k8l0.m(p7l0Var8);
                p7l0Var8.g();
                boolean z13 = k5l0VarI0.Q;
                if (k5l0VarI0.x != i) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                k5l0VarI0.Q = z13 | z7;
                k5l0VarI0.x = i;
            }
            k5l0VarI0.z(zzrVar.L);
            str6 = zzrVar.R;
            p7l0 p7l0Var9 = k8l0Var.g;
            k8l0.m(p7l0Var9);
            p7l0Var9.g();
            boolean z14 = k5l0VarI0.Q;
            if (k5l0VarI0.G != str6) {
                z6 = true;
            } else {
                z6 = false;
            }
            k5l0VarI0.Q = z14 | z6;
            k5l0VarI0.G = str6;
            int i2 = zzrVar.T;
            p7l0 p7l0Var10 = k8l0Var.g;
            k8l0.m(p7l0Var10);
            p7l0Var10.g();
            k5l0VarI0.Q |= k5l0VarI0.I != i2;
            k5l0VarI0.I = i2;
            if (!k5l0VarI0.o()) {
                z9 = z;
            } else if (!z) {
                return k5l0VarI0;
            }
            lqk0 lqk0Var5 = this.c;
            U(lqk0Var5);
            lqk0Var5.j0(k5l0VarI0, z9);
            return k5l0VarI0;
        }
        k5l0VarI0 = new k5l0(this.l, str7);
        if (jbl0VarJ.i(hbl0Var2)) {
            k5l0VarI0.F(o(jbl0VarJ));
        }
        if (jbl0VarJ.i(hbl0Var)) {
            k5l0VarI0.I(strL);
        }
        z = false;
        k8l0Var = k5l0VarI0.a;
        k5l0VarI0.H(zzrVar.b);
        str = zzrVar.z;
        if (!TextUtils.isEmpty(str)) {
            k5l0VarI0.K(str);
        }
        j = zzrVar.e;
        if (j != 0) {
            k5l0VarI0.S(j);
        }
        str2 = zzrVar.c;
        if (!TextUtils.isEmpty(str2)) {
            k5l0VarI0.O(str2);
        }
        k5l0VarI0.Q(zzrVar.y);
        str3 = zzrVar.d;
        if (str3 != null) {
            k5l0VarI0.R(str3);
        }
        k5l0VarI0.a(zzrVar.f);
        k5l0VarI0.d(zzrVar.v);
        str4 = zzrVar.i;
        if (!TextUtils.isEmpty(str4)) {
            k5l0VarI0.v(str4);
        }
        p7l0 p7l0Var11 = k8l0Var.g;
        k8l0.m(p7l0Var11);
        p7l0Var11.g();
        boolean z15 = k5l0VarI0.Q;
        if (k5l0VarI0.p != z8) {
            z2 = true;
        } else {
            z2 = false;
        }
        k5l0VarI0.Q = z15 | z2;
        k5l0VarI0.p = z8;
        Boolean bool2 = zzrVar.E;
        p7l0 p7l0Var12 = k8l0Var.g;
        k8l0.m(p7l0Var12);
        p7l0Var12.g();
        k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.q, bool2);
        k5l0VarI0.q = bool2;
        k5l0VarI0.c(zzrVar.F);
        String str10 = zzrVar.J;
        p7l0 p7l0Var13 = k8l0Var.g;
        k8l0.m(p7l0Var13);
        p7l0Var13.g();
        k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.t, str10);
        k5l0VarI0.t = str10;
        bpl0Var = bpl0.b;
        if (e0().q(null, v2l0.L0)) {
            k5l0VarI0.x(zzrVar.G);
        } else {
            if (e0().q(null, v2l0.K0)) {
                k5l0VarI0.x(null);
            }
        }
        z3 = zzrVar.K;
        p7l0 p7l0Var14 = k8l0Var.g;
        k8l0.m(p7l0Var14);
        p7l0Var14.g();
        boolean z16 = k5l0VarI0.Q;
        if (k5l0VarI0.u != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        k5l0VarI0.Q = z16 | z4;
        k5l0VarI0.u = z3;
        str5 = zzrVar.Q;
        p7l0 p7l0Var15 = k8l0Var.g;
        k8l0.m(p7l0Var15);
        p7l0Var15.g();
        boolean z17 = k5l0VarI0.Q;
        if (k5l0VarI0.C != str5) {
            z5 = true;
        } else {
            z5 = false;
        }
        k5l0VarI0.Q = z17 | z5;
        k5l0VarI0.C = str5;
        kql0.a();
        if (e0().q(null, v2l0.P0)) {
            i = zzrVar.O;
            p7l0 p7l0Var16 = k8l0Var.g;
            k8l0.m(p7l0Var16);
            p7l0Var16.g();
            boolean z18 = k5l0VarI0.Q;
            if (k5l0VarI0.x != i) {
                z7 = true;
            } else {
                z7 = false;
            }
            k5l0VarI0.Q = z18 | z7;
            k5l0VarI0.x = i;
        }
        k5l0VarI0.z(zzrVar.L);
        str6 = zzrVar.R;
        p7l0 p7l0Var17 = k8l0Var.g;
        k8l0.m(p7l0Var17);
        p7l0Var17.g();
        boolean z19 = k5l0VarI0.Q;
        if (k5l0VarI0.G != str6) {
            z6 = true;
        } else {
            z6 = false;
        }
        k5l0VarI0.Q = z19 | z6;
        k5l0VarI0.G = str6;
        int i3 = zzrVar.T;
        p7l0 p7l0Var18 = k8l0Var.g;
        k8l0.m(p7l0Var18);
        p7l0Var18.g();
        k5l0VarI0.Q |= k5l0VarI0.I != i3;
        k5l0VarI0.I = i3;
        if (!k5l0VarI0.o()) {
            z9 = z;
        } else if (!z) {
            return k5l0VarI0;
        }
        lqk0 lqk0Var6 = this.c;
        U(lqk0Var6);
        lqk0Var6.j0(k5l0VarI0, z9);
        return k5l0VarI0;
    }

    @Override // defpackage.zal0
    public final Context d() {
        return this.l.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List d0(Bundle bundle, zzr zzrVar) {
        int[] iArr;
        b().g();
        kql0.a();
        wok0 wok0VarE0 = e0();
        String str = zzrVar.a;
        if (!wok0VarE0.q(str, v2l0.P0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().f.a("Uri sources and timestamps do not match");
                } else {
                    int i = 0;
                    while (i < intArray.length) {
                        lqk0 lqk0Var = this.c;
                        U(lqk0Var);
                        k8l0 k8l0Var = lqk0Var.a;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        hm20.e(str);
                        lqk0Var.g();
                        lqk0Var.h();
                        try {
                            iArr = intArray;
                            try {
                                int iDelete = lqk0Var.V().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                y4l0 y4l0Var = k8l0Var.f;
                                k8l0.m(y4l0Var);
                                u4l0 u4l0Var = y4l0Var.n;
                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(iDelete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                u4l0Var.d(str, sb.toString(), Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                y4l0 y4l0Var2 = k8l0Var.f;
                                k8l0.m(y4l0Var2);
                                y4l0Var2.f.c(y4l0.k(str), "Error pruning trigger URIs. appId", e);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        lqk0 lqk0Var2 = this.c;
        U(lqk0Var2);
        String str2 = zzrVar.a;
        hm20.e(str2);
        lqk0Var2.g();
        lqk0Var2.h();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = lqk0Var2.V().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            y4l0 y4l0Var3 = lqk0Var2.a.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.f.c(y4l0.k(str2), "Error querying trigger uris. appId", e3);
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList;
    }

    @Override // defpackage.zal0
    public final xi9 e() {
        k8l0 k8l0Var = this.l;
        hm20.h(k8l0Var);
        return k8l0Var.k;
    }

    public final wok0 e0() {
        k8l0 k8l0Var = this.l;
        hm20.h(k8l0Var);
        return k8l0Var.d;
    }

    public final jbl0 f(String str) {
        jbl0 jbl0Var = jbl0.c;
        b().g();
        l0();
        HashMap map = this.B;
        jbl0 jbl0VarZ = (jbl0) map.get(str);
        if (jbl0VarZ == null) {
            lqk0 lqk0Var = this.c;
            U(lqk0Var);
            jbl0VarZ = lqk0Var.z(str);
            if (jbl0VarZ == null) {
                jbl0VarZ = jbl0.c;
            }
            b().g();
            l0();
            map.put(str, jbl0VarZ);
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            lqk0Var2.B(str, jbl0VarZ);
        }
        return jbl0VarZ;
    }

    public final e7l0 f0() {
        e7l0 e7l0Var = this.a;
        U(e7l0Var);
        return e7l0Var;
    }

    public final long g() {
        e().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        mkl0 mkl0Var = this.i;
        mkl0Var.h();
        mkl0Var.g();
        d6l0 d6l0Var = mkl0Var.j;
        long jA = d6l0Var.a();
        if (jA == 0) {
            yol0 yol0Var = mkl0Var.a.i;
            k8l0.k(yol0Var);
            jA = ((long) yol0Var.e0().nextInt(86400000)) + 1;
            d6l0Var.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final lqk0 g0() {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        return lqk0Var;
    }

    public final void h(zzbg zzbgVar, String str) throws Throwable {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        if (k5l0VarI0 != null) {
            k8l0 k8l0Var = k5l0VarI0.a;
            if (!TextUtils.isEmpty(k5l0VarI0.N())) {
                Boolean boolP = P(k5l0VarI0);
                if (boolP == null) {
                    if (!"_ui".equals(zzbgVar.a)) {
                        a().i.b(y4l0.k(str), "Could not find package. appId");
                    }
                } else if (!boolP.booleanValue()) {
                    a().f.b(y4l0.k(str), "App version does not match; dropping event. appId");
                    return;
                }
                String strG = k5l0VarI0.G();
                String strN = k5l0VarI0.N();
                long jP = k5l0VarI0.P();
                p7l0 p7l0Var = k8l0Var.g;
                k8l0.m(p7l0Var);
                p7l0Var.g();
                String str2 = k5l0VarI0.l;
                p7l0 p7l0Var2 = k8l0Var.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.g();
                long j = k5l0VarI0.m;
                p7l0 p7l0Var3 = k8l0Var.g;
                k8l0.m(p7l0Var3);
                p7l0Var3.g();
                long j2 = k5l0VarI0.n;
                p7l0 p7l0Var4 = k8l0Var.g;
                k8l0.m(p7l0Var4);
                p7l0Var4.g();
                boolean z = k5l0VarI0.o;
                String strJ = k5l0VarI0.J();
                p7l0 p7l0Var5 = k8l0Var.g;
                k8l0.m(p7l0Var5);
                p7l0Var5.g();
                boolean z2 = k5l0VarI0.p;
                Boolean boolW = k5l0VarI0.w();
                long jB = k5l0VarI0.b();
                p7l0 p7l0Var6 = k8l0Var.g;
                k8l0.m(p7l0Var6);
                p7l0Var6.g();
                ArrayList arrayList = k5l0VarI0.s;
                String strG2 = f(str).g();
                boolean zY = k5l0VarI0.y();
                p7l0 p7l0Var7 = k8l0Var.g;
                k8l0.m(p7l0Var7);
                p7l0Var7.g();
                long j3 = k5l0VarI0.v;
                int i = f(str).b;
                String str3 = o0(str).b;
                p7l0 p7l0Var8 = k8l0Var.g;
                k8l0.m(p7l0Var8);
                p7l0Var8.g();
                int i2 = k5l0VarI0.x;
                p7l0 p7l0Var9 = k8l0Var.g;
                k8l0.m(p7l0Var9);
                p7l0Var9.g();
                i(zzbgVar, new zzr(str, strG, strN, jP, str2, j, j2, (String) null, z, false, strJ, 0L, 0, z2, false, boolW, jB, (List) arrayList, strG2, "", (String) null, zY, j3, i, str3, i2, k5l0VarI0.B, k5l0VarI0.C(), k5l0VarI0.s(), 0L, k5l0VarI0.t()));
                return;
            }
        }
        a().m.b(str, "No app data available; dropping event");
    }

    public final x5l0 h0() {
        x5l0 x5l0Var = this.d;
        if (x5l0Var != null) {
            return x5l0Var;
        }
        ib5.a("Network broadcast receiver not created");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007b: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:124), block:B:18:0x007b */
    public final void i(zzbg zzbgVar, zzr zzrVar) throws Throwable {
        Throwable th;
        Cursor cursorRawQuery;
        Cursor cursor;
        Bundle bundleN;
        zzbg zzbgVarB;
        zzbe zzbeVar;
        String string;
        String str = zzrVar.a;
        hm20.e(str);
        a5l0 a5l0VarA = a5l0.a(zzbgVar);
        Bundle bundle = a5l0VarA.d;
        yol0 yol0VarK0 = k0();
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k8l0 k8l0Var = lqk0Var.a;
        lqk0Var.g();
        lqk0Var.h();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = lqk0Var.V().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            d7l0 d7l0Var = (d7l0) ((b7l0) pol0.O(d7l0.A(), cursorRawQuery.getBlob(0))).i();
                            lqk0Var.b.j0();
                            bundleN = pol0.n(d7l0Var.q());
                            cursorRawQuery.close();
                        } catch (IOException e) {
                            y4l0 y4l0Var = k8l0Var.f;
                            k8l0.m(y4l0Var);
                            y4l0Var.f.c(y4l0.k(str), "Failed to retrieve default event parameters. appId", e);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            bundleN = null;
                        }
                        yol0VarK0.r(bundle, bundleN);
                        yol0 yol0VarK1 = k0();
                        wok0 wok0VarE0 = e0();
                        wok0VarE0.getClass();
                        yol0VarK1.p(a5l0VarA, Math.max(Math.min(wok0VarE0.o(str, v2l0.X), 100), 25));
                        zzbgVarB = a5l0VarA.b();
                        if (!e0().q(null, v2l0.f1) && "_cmp".equals(zzbgVarB.a)) {
                            zzbeVar = zzbgVarB.b;
                            if ("referrer API v2".equals(zzbeVar.a.getString("_cis"))) {
                                string = zzbeVar.a.getString("gclid");
                                if (!TextUtils.isEmpty(string)) {
                                    W(new zzpl(zzbgVarB.d, string, "_lgclid", StompClient.DEFAULT_ACK), zzrVar);
                                }
                            }
                        }
                        j(zzbgVarB, zzrVar);
                    }
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.n.a("Default event parameters not found");
                } catch (SQLiteException e2) {
                    e = e2;
                    y4l0 y4l0Var3 = k8l0Var.f;
                    k8l0.m(y4l0Var3);
                    y4l0Var3.f.b(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        bundleN = null;
        yol0VarK0.r(bundle, bundleN);
        yol0 yol0VarK2 = k0();
        wok0 wok0VarE1 = e0();
        wok0VarE1.getClass();
        yol0VarK2.p(a5l0VarA, Math.max(Math.min(wok0VarE1.o(str, v2l0.X), 100), 25));
        zzbgVarB = a5l0VarA.b();
        if (!e0().q(null, v2l0.f1)) {
            zzbeVar = zzbgVarB.b;
            if ("referrer API v2".equals(zzbeVar.a.getString("_cis"))) {
                string = zzbeVar.a.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    W(new zzpl(zzbgVarB.d, string, "_lgclid", StompClient.DEFAULT_ACK), zzrVar);
                }
            }
        }
        j(zzbgVarB, zzrVar);
    }

    public final knk0 i0() {
        knk0 knk0Var = this.f;
        U(knk0Var);
        return knk0Var;
    }

    public final void j(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List listH0;
        k8l0 k8l0Var;
        List listH1;
        List<zzah> listH2;
        String str;
        hm20.h(zzrVar);
        String str2 = zzrVar.a;
        hm20.e(str2);
        b().g();
        l0();
        long j = zzbgVar.d;
        a5l0 a5l0VarA = a5l0.a(zzbgVar);
        b().g();
        yol0.Y((this.F == null || (str = this.G) == null || !str.equals(str2)) ? null : this.F, a5l0VarA.d, false);
        zzbg zzbgVarB = a5l0VarA.b();
        j0();
        if (TextUtils.isEmpty(zzrVar.b)) {
            return;
        }
        if (!zzrVar.v) {
            c0(zzrVar);
            return;
        }
        List list = zzrVar.G;
        if (list != null) {
            String str3 = zzbgVarB.a;
            if (!list.contains(str3)) {
                a().m.d(str2, "Dropping non-safelisted event. appId, event name, origin", zzbgVarB.a, zzbgVarB.c);
                return;
            } else {
                Bundle bundleB1 = zzbgVarB.b.b1();
                bundleB1.putLong("ga_safelisted", 1L);
                zzbgVar2 = new zzbg(str3, new zzbe(bundleB1), zzbgVarB.c, zzbgVarB.d);
            }
        } else {
            zzbgVar2 = zzbgVarB;
        }
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        lqk0Var.S();
        try {
            String str4 = zzbgVar2.a;
            if ("_s".equals(str4)) {
                lqk0 lqk0Var2 = this.c;
                U(lqk0Var2);
                if (!lqk0Var2.v(str2, "_s") && zzbgVar2.b.a.getLong("_sid") != 0) {
                    lqk0 lqk0Var3 = this.c;
                    U(lqk0Var3);
                    if (lqk0Var3.v(str2, "_f")) {
                        lqk0 lqk0Var4 = this.c;
                        U(lqk0Var4);
                        lqk0Var4.y(str2, null, "_sid", k(zzbgVar2, str2));
                    } else {
                        lqk0 lqk0Var5 = this.c;
                        U(lqk0Var5);
                        if (lqk0Var5.v(str2, "_v")) {
                            lqk0 lqk0Var6 = this.c;
                            U(lqk0Var6);
                            lqk0Var6.y(str2, null, "_sid", k(zzbgVar2, str2));
                        } else {
                            lqk0 lqk0Var7 = this.c;
                            U(lqk0Var7);
                            e().getClass();
                            lqk0Var7.y(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", k(zzbgVar2, str2));
                        }
                    }
                }
            }
            lqk0 lqk0Var8 = this.c;
            U(lqk0Var8);
            hm20.e(str2);
            lqk0Var8.g();
            lqk0Var8.h();
            if (j < 0) {
                y4l0 y4l0Var = lqk0Var8.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.i.c(y4l0.k(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j));
                listH0 = Collections.EMPTY_LIST;
            } else {
                listH0 = lqk0Var8.h0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listH0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                k8l0Var = this.l;
                if (!zHasNext) {
                    break;
                }
                zzah zzahVar = (zzah) it.next();
                if (zzahVar != null) {
                    a().n.d(zzahVar.a, "User property timed out", k8l0Var.j.c(zzahVar.c.b), zzahVar.c.G0());
                    zzbg zzbgVar3 = zzahVar.i;
                    if (zzbgVar3 != null) {
                        l(new zzbg(zzbgVar3, j), zzrVar);
                    }
                    lqk0 lqk0Var9 = this.c;
                    U(lqk0Var9);
                    lqk0Var9.f0(str2, zzahVar.c.b);
                }
            }
            lqk0 lqk0Var10 = this.c;
            U(lqk0Var10);
            hm20.e(str2);
            lqk0Var10.g();
            lqk0Var10.h();
            if (j < 0) {
                y4l0 y4l0Var2 = lqk0Var10.a.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.i.c(y4l0.k(str2), "Invalid time querying expired conditional properties", Long.valueOf(j));
                listH1 = Collections.EMPTY_LIST;
            } else {
                listH1 = lqk0Var10.h0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listH1.size());
            Iterator it2 = listH1.iterator();
            while (it2.hasNext()) {
                zzah zzahVar2 = (zzah) it2.next();
                if (zzahVar2 != null) {
                    Iterator it3 = it2;
                    a().n.d(zzahVar2.a, "User property expired", k8l0Var.j.c(zzahVar2.c.b), zzahVar2.c.G0());
                    lqk0 lqk0Var11 = this.c;
                    U(lqk0Var11);
                    lqk0Var11.Y(str2, zzahVar2.c.b);
                    zzbg zzbgVar4 = zzahVar2.z;
                    if (zzbgVar4 != null) {
                        arrayList.add(zzbgVar4);
                    }
                    lqk0 lqk0Var12 = this.c;
                    U(lqk0Var12);
                    lqk0Var12.f0(str2, zzahVar2.c.b);
                    it2 = it3;
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l(new zzbg((zzbg) obj, j), zzrVar);
            }
            lqk0 lqk0Var13 = this.c;
            U(lqk0Var13);
            hm20.e(str2);
            hm20.e(str4);
            lqk0Var13.g();
            lqk0Var13.h();
            if (j < 0) {
                k8l0 k8l0Var2 = lqk0Var13.a;
                y4l0 y4l0Var3 = k8l0Var2.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.i.d(y4l0.k(str2), "Invalid time querying triggered conditional properties", k8l0Var2.j.a(str4), Long.valueOf(j));
                listH2 = Collections.EMPTY_LIST;
            } else {
                listH2 = lqk0Var13.h0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listH2.size());
            for (zzah zzahVar3 : listH2) {
                if (zzahVar3 != null) {
                    zzpl zzplVar = zzahVar3.c;
                    String str5 = zzahVar3.a;
                    hm20.h(str5);
                    String str6 = zzahVar3.b;
                    String str7 = zzplVar.b;
                    Object objG0 = zzplVar.G0();
                    hm20.h(objG0);
                    uol0 uol0Var = new uol0(str5, str6, str7, j, objG0);
                    Object obj2 = uol0Var.e;
                    String str8 = uol0Var.c;
                    lqk0 lqk0Var14 = this.c;
                    U(lqk0Var14);
                    if (lqk0Var14.Z(uol0Var)) {
                        a().n.d(zzahVar3.a, "User property triggered", k8l0Var.j.c(str8), obj2);
                    } else {
                        a().f.d(y4l0.k(zzahVar3.a), "Too many active user properties, ignoring", k8l0Var.j.c(str8), obj2);
                    }
                    zzbg zzbgVar5 = zzahVar3.w;
                    if (zzbgVar5 != null) {
                        arrayList2.add(zzbgVar5);
                    }
                    zzahVar3.c = new zzpl(uol0Var);
                    zzahVar3.e = true;
                    lqk0 lqk0Var15 = this.c;
                    U(lqk0Var15);
                    lqk0Var15.d0(zzahVar3);
                }
            }
            l(zzbgVar2, zzrVar);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                l(new zzbg((zzbg) obj3, j), zzrVar);
            }
            lqk0 lqk0Var16 = this.c;
            U(lqk0Var16);
            lqk0Var16.T();
        } finally {
            lqk0 lqk0Var17 = this.c;
            U(lqk0Var17);
            lqk0Var17.U();
        }
    }

    public final pol0 j0() {
        pol0 pol0Var = this.g;
        U(pol0Var);
        return pol0Var;
    }

    public final Bundle k(zzbg zzbgVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.b.a.getLong("_sid"));
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        uol0 uol0VarA0 = lqk0Var.a0(str, "_sno");
        if (uol0VarA0 != null) {
            Object obj = uol0VarA0.e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final yol0 k0() {
        k8l0 k8l0Var = this.l;
        hm20.h(k8l0Var);
        yol0 yol0Var = k8l0Var.i;
        k8l0.k(yol0Var);
        return yol0Var;
    }

    public final void l0() {
        if (this.m.get()) {
            return;
        }
        ib5.a("UploadController is not initialized");
    }

    public final void m(k5l0 k5l0Var, l8l0 l8l0Var) {
        gpk0 gpk0Var;
        s9l0 s9l0Var;
        cpk0 cpk0Var;
        b().g();
        l0();
        String strC0 = ((n8l0) l8l0Var.b).C0();
        EnumMap enumMap = new EnumMap(hbl0.class);
        int length = strC0.length();
        int length2 = hbl0.values().length;
        cpk0 cpk0Var2 = cpk0.UNSET;
        int i = 0;
        if (length < length2 || strC0.charAt(0) != '1') {
            gpk0Var = new gpk0();
        } else {
            hbl0[] hbl0VarArrValues = hbl0.values();
            int length3 = hbl0VarArrValues.length;
            int i2 = 0;
            int i3 = 1;
            while (i2 < length3) {
                hbl0 hbl0Var = hbl0VarArrValues[i2];
                int i4 = i3 + 1;
                char cCharAt = strC0.charAt(i3);
                cpk0[] cpk0VarArrValues = cpk0.values();
                int length4 = cpk0VarArrValues.length;
                int i5 = i;
                while (true) {
                    if (i5 >= length4) {
                        cpk0Var = cpk0Var2;
                        break;
                    }
                    cpk0Var = cpk0VarArrValues[i5];
                    if (cpk0Var.a == cCharAt) {
                        break;
                    } else {
                        i5++;
                    }
                }
                enumMap.put(hbl0Var, cpk0Var);
                i2++;
                i3 = i4;
                i = 0;
            }
            gpk0Var = new gpk0(enumMap);
        }
        String strD = k5l0Var.D();
        b().g();
        l0();
        jbl0 jbl0VarF = f(strD);
        EnumMap enumMap2 = jbl0VarF.a;
        hbl0 hbl0Var2 = hbl0.AD_STORAGE;
        dbl0 dbl0Var = (dbl0) enumMap2.get(hbl0Var2);
        dbl0 dbl0Var2 = dbl0.UNINITIALIZED;
        if (dbl0Var == null) {
            dbl0Var = dbl0Var2;
        }
        int i6 = jbl0VarF.b;
        int iOrdinal = dbl0Var.ordinal();
        cpk0 cpk0Var3 = cpk0.REMOTE_ENFORCED_DEFAULT;
        cpk0 cpk0Var4 = cpk0.FAILSAFE;
        if (iOrdinal == 1) {
            gpk0Var.b(hbl0Var2, cpk0Var3);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            gpk0Var.a(hbl0Var2, i6);
        } else {
            gpk0Var.b(hbl0Var2, cpk0Var4);
        }
        hbl0 hbl0Var3 = hbl0.ANALYTICS_STORAGE;
        dbl0 dbl0Var3 = (dbl0) enumMap2.get(hbl0Var3);
        if (dbl0Var3 != null) {
            dbl0Var2 = dbl0Var3;
        }
        int iOrdinal2 = dbl0Var2.ordinal();
        if (iOrdinal2 == 1) {
            gpk0Var.b(hbl0Var3, cpk0Var3);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            gpk0Var.a(hbl0Var3, i6);
        } else {
            gpk0Var.b(hbl0Var3, cpk0Var4);
        }
        String strD2 = k5l0Var.D();
        b().g();
        l0();
        crk0 crk0VarQ0 = q0(strD2, o0(strD2), f(strD2), gpk0Var);
        String str = crk0VarQ0.d;
        Boolean bool = crk0VarQ0.c;
        hm20.h(bool);
        boolean zBooleanValue = bool.booleanValue();
        l8l0Var.g();
        ((n8l0) l8l0Var.b).g1(zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).h1(str);
        }
        b().g();
        l0();
        Iterator it = Collections.unmodifiableList(((n8l0) l8l0Var.b).V1()).iterator();
        do {
            if (!it.hasNext()) {
                s9l0Var = null;
                break;
            }
            s9l0Var = (s9l0) it.next();
        } while (!"_npa".equals(s9l0Var.s()));
        if (s9l0Var != null) {
            EnumMap enumMap3 = gpk0Var.a;
            hbl0 hbl0Var4 = hbl0.AD_PERSONALIZATION;
            cpk0 cpk0Var5 = (cpk0) enumMap3.get(hbl0Var4);
            if (cpk0Var5 == null) {
                cpk0Var5 = cpk0Var2;
            }
            if (cpk0Var5 == cpk0Var2) {
                lqk0 lqk0Var = this.c;
                U(lqk0Var);
                uol0 uol0VarA0 = lqk0Var.a0(k5l0Var.D(), "_npa");
                cpk0 cpk0Var6 = cpk0.MANIFEST;
                cpk0 cpk0Var7 = cpk0.API;
                if (uol0VarA0 != null) {
                    String str2 = uol0VarA0.b;
                    if ("tcf".equals(str2)) {
                        gpk0Var.b(hbl0Var4, cpk0.TCF);
                    } else if ("app".equals(str2)) {
                        gpk0Var.b(hbl0Var4, cpk0Var7);
                    } else {
                        gpk0Var.b(hbl0Var4, cpk0Var6);
                    }
                } else {
                    Boolean boolW = k5l0Var.w();
                    if (boolW == null || ((boolW.booleanValue() && s9l0Var.w() != 1) || !(boolW.booleanValue() || s9l0Var.w() == 0))) {
                        gpk0Var.b(hbl0Var4, cpk0Var7);
                    } else {
                        gpk0Var.b(hbl0Var4, cpk0Var6);
                    }
                }
            }
        } else {
            int iF = F(k5l0Var.D(), gpk0Var);
            q9l0 q9l0VarB = s9l0.B();
            q9l0VarB.g();
            ((s9l0) q9l0VarB.b).D("_npa");
            e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            q9l0VarB.g();
            ((s9l0) q9l0VarB.b).C(jCurrentTimeMillis);
            q9l0VarB.g();
            ((s9l0) q9l0VarB.b).G(iF);
            s9l0 s9l0Var2 = (s9l0) q9l0VarB.i();
            l8l0Var.g();
            ((n8l0) l8l0Var.b).e0(s9l0Var2);
            a().n.c("non_personalized_ads(_npa)", "Setting user property", Integer.valueOf(iF));
        }
        String string = gpk0Var.toString();
        l8l0Var.g();
        ((n8l0) l8l0Var.b).f1(string);
        String strD3 = k5l0Var.D();
        e7l0 e7l0Var = this.a;
        e7l0Var.g();
        e7l0Var.m(strD3);
        w3l0 w3l0VarB = e7l0Var.B(strD3);
        boolean z = w3l0VarB == null || !w3l0VarB.t() || w3l0VarB.u();
        List listZ = l8l0Var.Z();
        for (int i7 = 0; i7 < listZ.size(); i7++) {
            if ("_tcf".equals(((d7l0) listZ.get(i7)).t())) {
                b7l0 b7l0Var = (b7l0) ((d7l0) listZ.get(i7)).k();
                List listL = b7l0Var.l();
                for (int i8 = 0; i8 < listL.size(); i8++) {
                    if ("_tcfd".equals(((k7l0) listL.get(i8)).r())) {
                        String strT = ((k7l0) listL.get(i8)).t();
                        if (z && strT.length() > 4) {
                            char[] charArray = strT.toCharArray();
                            int i9 = 1;
                            while (true) {
                                if (i9 >= 64) {
                                    i9 = 0;
                                    break;
                                } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9 | 1);
                            strT = String.valueOf(charArray);
                        }
                        i7l0 i7l0VarC = k7l0.C();
                        i7l0VarC.l("_tcfd");
                        i7l0VarC.m(strT);
                        b7l0Var.g();
                        ((d7l0) b7l0Var.b).B(i8, (k7l0) i7l0VarC.i());
                        break;
                    }
                }
                l8l0Var.b0(i7, b7l0Var);
                return;
            }
        }
    }

    public final void m0(zzr zzrVar) {
        b().g();
        l0();
        String str = zzrVar.a;
        hm20.e(str);
        jbl0 jbl0VarC = jbl0.c(zzrVar.M, zzrVar.H);
        f(str);
        a().n.c(str, "Setting storage consent for package", jbl0VarC);
        b().g();
        l0();
        this.B.put(str, jbl0VarC);
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        lqk0Var.B(str, jbl0VarC);
    }

    public final void n0(zzr zzrVar) {
        b().g();
        l0();
        String str = zzrVar.a;
        hm20.e(str);
        crk0 crk0VarB = crk0.b(zzrVar.N);
        a().n.c(str, "Setting DMA consent for package", crk0VarB);
        b().g();
        l0();
        dbl0 dbl0VarA = crk0.c(100, p0(str)).a();
        this.C.put(str, crk0VarB);
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        hm20.h(str);
        hm20.h(crk0VarB);
        lqk0Var.g();
        lqk0Var.h();
        jbl0 jbl0VarZ = lqk0Var.z(str);
        jbl0 jbl0Var = jbl0.c;
        if (jbl0VarZ == jbl0Var) {
            lqk0Var.B(str, jbl0Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PublisherMetadata.APP_ID, str);
        contentValues.put("dma_consent_settings", crk0VarB.b);
        lqk0Var.D(contentValues);
        dbl0 dbl0VarA2 = crk0.c(100, p0(str)).a();
        b().g();
        l0();
        dbl0 dbl0Var = dbl0.GRANTED;
        dbl0 dbl0Var2 = dbl0.DENIED;
        boolean z = dbl0VarA == dbl0Var2 && dbl0VarA2 == dbl0Var;
        boolean z2 = dbl0VarA == dbl0Var && dbl0VarA2 == dbl0Var2;
        if (z || z2) {
            a().n.b(str, "Generated _dcu event for");
            Bundle bundle = new Bundle();
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            if (lqk0Var2.k0(g(), str, false, false, false, false).f < e0().o(str, v2l0.m0)) {
                bundle.putLong("_r", 1L);
                lqk0 lqk0Var3 = this.c;
                U(lqk0Var3);
                a().n.c(str, "_dcu realtime event count", Long.valueOf(lqk0Var3.k0(g(), str, false, false, true, false).f));
            }
            this.J.a(str, "_dcu", bundle);
        }
    }

    public final String o(jbl0 jbl0Var) {
        if (!jbl0Var.i(hbl0.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        k0().e0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final crk0 o0(String str) {
        b().g();
        l0();
        HashMap map = this.C;
        crk0 crk0Var = (crk0) map.get(str);
        if (crk0Var != null) {
            return crk0Var;
        }
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        hm20.h(str);
        lqk0Var.g();
        lqk0Var.h();
        crk0 crk0VarB = crk0.b(lqk0Var.C("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, crk0VarB);
        return crk0VarB;
    }

    public final void p(ArrayList arrayList) {
        hm20.b(!arrayList.isEmpty());
        if (this.y != null) {
            a().f.a("Set uploading progress before finishing the previous upload");
        } else {
            this.y = new ArrayList(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public final Bundle p0(String str) {
        b().g();
        l0();
        e7l0 e7l0Var = this.a;
        U(e7l0Var);
        if (e7l0Var.B(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        jbl0 jbl0VarF = f(str);
        Bundle bundle2 = new Bundle();
        Iterator it = jbl0VarF.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((dbl0) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((hbl0) entry.getKey()).a, str2);
            }
        }
        bundle.putAll(bundle2);
        crk0 crk0VarQ0 = q0(str, o0(str), jbl0VarF, new gpk0());
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : crk0VarQ0.e.entrySet()) {
            int iOrdinal2 = ((dbl0) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((hbl0) entry2.getKey()).a, str3);
            }
        }
        Boolean bool = crk0VarQ0.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = crk0VarQ0.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        uol0 uol0VarA0 = lqk0Var.a0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (uol0VarA0 != null ? uol0VarA0.e.equals(1L) : F(str, new gpk0())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01a5 A[Catch: all -> 0x0028, TryCatch #3 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0179, B:71:0x019f, B:73:0x01a5, B:75:0x01b0, B:79:0x01bb, B:80:0x01be, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:86:0x000e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #3 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0179, B:71:0x019f, B:73:0x01a5, B:75:0x01b0, B:79:0x01bb, B:80:0x01be, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:86:0x000e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01bb A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #3 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x0128, B:47:0x012d, B:48:0x0130, B:49:0x0131, B:50:0x0136, B:55:0x0179, B:71:0x019f, B:73:0x01a5, B:75:0x01b0, B:79:0x01bb, B:80:0x01be, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:86:0x000e, inners: #0 }] */
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
    public final void q() {
        Throwable th;
        SQLiteException e;
        Cursor cursorRawQuery;
        k5l0 k5l0VarI0;
        b().g();
        l0();
        this.v = true;
        try {
            k8l0 k8l0Var = this.l;
            k8l0Var.getClass();
            Boolean bool = k8l0Var.o().e;
            if (bool == null) {
                a().i.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().f.a("Upload called in the client side when service should be used");
            } else if (this.o > 0) {
                N();
            } else {
                b().g();
                if (this.y != null) {
                    a().n.a("Uploading requested multiple times");
                } else {
                    i5l0 i5l0Var = this.b;
                    U(i5l0Var);
                    if (i5l0Var.k()) {
                        e().getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Cursor cursor = null;
                        cursorRawQuery = null;
                        Cursor cursorRawQuery2 = null;
                        string = null;
                        string = null;
                        String string = null;
                        int iO = e0().o(null, v2l0.i0);
                        e0();
                        long jLongValue = jCurrentTimeMillis - ((Long) v2l0.e.a(null)).longValue();
                        for (int i = 0; i < iO && I(jLongValue, null); i++) {
                        }
                        kql0.a();
                        b().g();
                        H();
                        long jA = this.i.h.a();
                        if (jA != 0) {
                            a().m.b(Long.valueOf(Math.abs(jCurrentTimeMillis - jA)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        lqk0 lqk0Var = this.c;
                        U(lqk0Var);
                        String strO = lqk0Var.o();
                        long j = -1;
                        if (TextUtils.isEmpty(strO)) {
                            this.A = -1L;
                            lqk0 lqk0Var2 = this.c;
                            U(lqk0Var2);
                            e0();
                            long jLongValue2 = jCurrentTimeMillis - ((Long) v2l0.e.a(null)).longValue();
                            lqk0Var2.g();
                            lqk0Var2.h();
                            try {
                                cursorRawQuery = lqk0Var2.V().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue2)});
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            string = cursorRawQuery.getString(0);
                                        } else {
                                            y4l0 y4l0Var = lqk0Var2.a.f;
                                            k8l0.m(y4l0Var);
                                            y4l0Var.n.a("No expired configs for apps with pending events");
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        y4l0 y4l0Var2 = lqk0Var2.a.f;
                                        k8l0.m(y4l0Var2);
                                        y4l0Var2.f.b(e, "Error selecting expired configs");
                                        if (cursorRawQuery != null) {
                                        }
                                        if (!TextUtils.isEmpty(string)) {
                                            lqk0 lqk0Var3 = this.c;
                                            U(lqk0Var3);
                                            k5l0VarI0 = lqk0Var3.i0(string);
                                            if (k5l0VarI0 != null) {
                                                z(k5l0VarI0);
                                            }
                                        }
                                        this.v = false;
                                        O();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursorRawQuery = null;
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                            cursorRawQuery.close();
                            if (!TextUtils.isEmpty(string)) {
                                lqk0 lqk0Var4 = this.c;
                                U(lqk0Var4);
                                k5l0VarI0 = lqk0Var4.i0(string);
                                if (k5l0VarI0 != null) {
                                    z(k5l0VarI0);
                                }
                            }
                        } else {
                            if (this.A == -1) {
                                lqk0 lqk0Var5 = this.c;
                                U(lqk0Var5);
                                try {
                                    try {
                                        cursorRawQuery2 = lqk0Var5.V().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        if (cursorRawQuery2.moveToFirst()) {
                                            j = cursorRawQuery2.getLong(0);
                                        }
                                    } catch (SQLiteException e4) {
                                        y4l0 y4l0Var3 = lqk0Var5.a.f;
                                        k8l0.m(y4l0Var3);
                                        y4l0Var3.f.b(e4, "Error querying raw events");
                                        if (cursorRawQuery2 != null) {
                                        }
                                        this.A = j;
                                        r(jCurrentTimeMillis, strO);
                                        this.v = false;
                                        O();
                                    }
                                    cursorRawQuery2.close();
                                    this.A = j;
                                } catch (Throwable th4) {
                                    if (cursorRawQuery2 != null) {
                                        cursorRawQuery2.close();
                                    }
                                    throw th4;
                                }
                            }
                            r(jCurrentTimeMillis, strO);
                        }
                    } else {
                        a().n.a("Network not connected, ignoring upload request");
                        N();
                    }
                }
            }
            this.v = false;
            O();
        } catch (Throwable th5) {
            this.v = false;
            O();
            throw th5;
        }
    }

    public final crk0 q0(String str, crk0 crk0Var, jbl0 jbl0Var, gpk0 gpk0Var) {
        hbl0 hbl0VarR;
        dbl0 dbl0VarK;
        e7l0 e7l0Var = this.a;
        U(e7l0Var);
        w3l0 w3l0VarB = e7l0Var.B(str);
        int i = 90;
        dbl0 dbl0Var = dbl0.DENIED;
        hbl0 hbl0Var = hbl0.AD_USER_DATA;
        if (w3l0VarB == null) {
            if (crk0Var.a() == dbl0Var) {
                i = crk0Var.a;
                gpk0Var.a(hbl0Var, i);
            } else {
                gpk0Var.b(hbl0Var, cpk0.FAILSAFE);
            }
            return new crk0(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        dbl0 dbl0VarA = crk0Var.a();
        dbl0 dbl0Var2 = dbl0.GRANTED;
        if (dbl0VarA == dbl0Var2 || dbl0VarA == dbl0Var) {
            i = crk0Var.a;
            gpk0Var.a(hbl0Var, i);
        } else {
            dbl0 dbl0Var3 = dbl0.POLICY;
            dbl0 dbl0Var4 = dbl0.UNINITIALIZED;
            if (dbl0VarA != dbl0Var3 || (dbl0VarK = e7l0Var.k(str, hbl0Var)) == dbl0Var4) {
                e7l0Var.g();
                e7l0Var.m(str);
                w3l0 w3l0VarB2 = e7l0Var.B(str);
                if (w3l0VarB2 != null) {
                    Iterator it = w3l0VarB2.r().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hbl0VarR = null;
                            break;
                        }
                        s2l0 s2l0Var = (s2l0) it.next();
                        if (hbl0Var == e7l0.r(s2l0Var.q())) {
                            hbl0VarR = e7l0.r(s2l0Var.r());
                            break;
                        }
                    }
                } else {
                    hbl0VarR = null;
                    break;
                }
                EnumMap enumMap = jbl0Var.a;
                hbl0 hbl0Var2 = hbl0.AD_STORAGE;
                dbl0 dbl0Var5 = (dbl0) enumMap.get(hbl0Var2);
                if (dbl0Var5 != null) {
                    dbl0Var4 = dbl0Var5;
                }
                boolean z = dbl0Var4 == dbl0Var2 || dbl0Var4 == dbl0Var;
                if (hbl0VarR == hbl0Var2 && z) {
                    gpk0Var.b(hbl0Var, cpk0.REMOTE_DELEGATION);
                    dbl0VarA = dbl0Var4;
                } else {
                    gpk0Var.b(hbl0Var, cpk0.REMOTE_DEFAULT);
                    dbl0VarA = true != e7l0Var.A(str, hbl0Var) ? dbl0Var : dbl0Var2;
                }
            } else {
                gpk0Var.b(hbl0Var, cpk0.REMOTE_ENFORCED_DEFAULT);
                dbl0VarA = dbl0VarK;
            }
        }
        e7l0Var.g();
        e7l0Var.m(str);
        w3l0 w3l0VarB3 = e7l0Var.B(str);
        boolean z2 = w3l0VarB3 == null || !w3l0VarB3.t() || w3l0VarB3.u();
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        TreeSet treeSet = new TreeSet();
        w3l0 w3l0VarB4 = e7l0Var.B(str);
        if (w3l0VarB4 != null) {
            Iterator it2 = w3l0VarB4.s().iterator();
            while (it2.hasNext()) {
                treeSet.add(((r3l0) it2.next()).q());
            }
        }
        if (dbl0VarA == dbl0Var || treeSet.isEmpty()) {
            return new crk0(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
        }
        return new crk0(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
    }

    public final boolean s(String str, String str2) {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        HashMap map = this.E;
        if (k5l0VarI0 != null && k0().H(str, k5l0VarI0.C())) {
            map.remove(str2);
            return true;
        }
        eol0 eol0Var = (eol0) map.get(str2);
        if (eol0Var != null) {
            eol0Var.a.e().getClass();
            if (System.currentTimeMillis() < eol0Var.c) {
                return false;
            }
        }
        return true;
    }

    public final void t(String str) {
        b().g();
        l0();
        this.v = true;
        try {
            k8l0 k8l0Var = this.l;
            k8l0Var.getClass();
            Boolean bool = k8l0Var.o().e;
            if (bool == null) {
                a().i.a("Upload data called on the client side before use of service was decided");
            } else if (bool.booleanValue()) {
                a().f.a("Upload called in the client side when service should be used");
            } else if (this.o > 0) {
                N();
            } else {
                i5l0 i5l0Var = this.b;
                U(i5l0Var);
                if (i5l0Var.k()) {
                    lqk0 lqk0Var = this.c;
                    U(lqk0Var);
                    if (lqk0Var.m(str)) {
                        lqk0 lqk0Var2 = this.c;
                        U(lqk0Var2);
                        hm20.e(str);
                        lqk0Var2.g();
                        lqk0Var2.h();
                        List listL = lqk0Var2.l(str, zzoo.G0(egl0.GOOGLE_SIGNAL), 1);
                        nol0 nol0Var = listL.isEmpty() ? null : (nol0) listL.get(0);
                        if (nol0Var != null) {
                            j8l0 j8l0Var = nol0Var.b;
                            a().n.d(str, "[sgtm] Uploading data from upload queue. appId, type, url", nol0Var.e, nol0Var.c);
                            byte[] bArrE = j8l0Var.e();
                            if (Log.isLoggable(a().m(), 2)) {
                                pol0 pol0Var = this.g;
                                U(pol0Var);
                                a().n.d(str, "[sgtm] Uploading data from upload queue. appId, uncompressed size, data", Integer.valueOf(bArrE.length), pol0Var.E(j8l0Var));
                            }
                            xml0 xml0Var = new xml0(nol0Var.c, nol0Var.d, nol0Var.e, null);
                            this.u = true;
                            i5l0 i5l0Var2 = this.b;
                            U(i5l0Var2);
                            i5l0Var2.l(str, xml0Var, j8l0Var, new fnl0(this, str, nol0Var));
                        }
                    } else {
                        a().n.b(str, "[sgtm] Upload queue has no batches for appId");
                    }
                } else {
                    a().n.a("Network not connected, ignoring upload request");
                    N();
                }
            }
        } finally {
            this.v = false;
            O();
        }
    }

    public final void u(String str, boolean z, Long l, Long l2) {
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        k5l0 k5l0VarI0 = lqk0Var.i0(str);
        if (k5l0VarI0 != null) {
            k8l0 k8l0Var = k5l0VarI0.a;
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.g();
            k5l0VarI0.Q |= k5l0VarI0.y != z;
            k5l0VarI0.y = z;
            p7l0 p7l0Var2 = k8l0Var.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.g();
            k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.z, l);
            k5l0VarI0.z = l;
            p7l0 p7l0Var3 = k8l0Var.g;
            k8l0.m(p7l0Var3);
            p7l0Var3.g();
            k5l0VarI0.Q |= !Objects.equals(k5l0VarI0.A, l2);
            k5l0VarI0.A = l2;
            if (k5l0VarI0.o()) {
                lqk0 lqk0Var2 = this.c;
                U(lqk0Var2);
                lqk0Var2.j0(k5l0VarI0, false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0121  */
    public final void v(String str, l8l0 l8l0Var) {
        int iP;
        int iIndexOf;
        e7l0 e7l0Var = this.a;
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        ox0 ox0Var = e7l0Var.e;
        Set set = (Set) ox0Var.get(str);
        if (set != null) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).b1(set);
        }
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        if (ox0Var.get(str) != 0 && (((Set) ox0Var.get(str)).contains(PublisherMetadata.DEVICE_MODEL) || ((Set) ox0Var.get(str)).contains("device_info"))) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).r1();
        }
        U(e7l0Var);
        if (e7l0Var.y(str)) {
            String strJ2 = ((n8l0) l8l0Var.b).j2();
            if (!TextUtils.isEmpty(strJ2) && (iIndexOf = strJ2.indexOf(".")) != -1) {
                String strSubstring = strJ2.substring(0, iIndexOf);
                l8l0Var.g();
                ((n8l0) l8l0Var.b).p0(strSubstring);
            }
        }
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        if (ox0Var.get(str) != 0 && ((Set) ox0Var.get(str)).contains(AnalyticsParam.EVENT_PARAM_USER_ID) && (iP = pol0.P("_id", l8l0Var)) != -1) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).f0(iP);
        }
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        if (ox0Var.get(str) != 0 && ((Set) ox0Var.get(str)).contains("google_signals")) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).T0();
        }
        U(e7l0Var);
        if (e7l0Var.z(str)) {
            l8l0Var.g();
            ((n8l0) l8l0Var.b).E1();
            if (f(str).i(hbl0.ANALYTICS_STORAGE)) {
                HashMap map = this.D;
                col0 col0Var = (col0) map.get(str);
                if (col0Var != null) {
                    long jN = e0().n(str, v2l0.k0) + col0Var.b;
                    e().getClass();
                    if (jN < SystemClock.elapsedRealtime()) {
                        col0Var = new col0(this, k0().Z());
                        map.put(str, col0Var);
                    }
                } else {
                    col0Var = new col0(this, k0().Z());
                    map.put(str, col0Var);
                }
                String str2 = col0Var.a;
                l8l0Var.g();
                ((n8l0) l8l0Var.b).c1(str2);
            }
        }
        U(e7l0Var);
        e7l0Var.g();
        e7l0Var.m(str);
        if (ox0Var.get(str) == 0 || !((Set) ox0Var.get(str)).contains("enhanced_user_id")) {
            return;
        }
        l8l0Var.g();
        ((n8l0) l8l0Var.b).a1();
    }

    public final void w(l8l0 l8l0Var, aol0 aol0Var) {
        String strZ;
        String strZ2;
        for (int i = 0; i < l8l0Var.a0(); i++) {
            b7l0 b7l0Var = (b7l0) ((n8l0) l8l0Var.b).U1(i).k();
            Iterator it = b7l0Var.l().iterator();
            while (it.hasNext()) {
                if ("_c".equals(((k7l0) it.next()).r())) {
                    if (aol0Var.a.H0() >= e0().o(aol0Var.a.q(), v2l0.l0)) {
                        int iO = e0().o(aol0Var.a.q(), v2l0.y0);
                        LinkedList linkedList = this.q;
                        pol0 pol0Var = this.g;
                        if (iO > 0) {
                            lqk0 lqk0Var = this.c;
                            U(lqk0Var);
                            if (lqk0Var.k0(g(), aol0Var.a.q(), false, false, false, true).g > iO) {
                                i7l0 i7l0VarC = k7l0.C();
                                i7l0VarC.l("_tnr");
                                i7l0VarC.n(1L);
                                b7l0Var.o((k7l0) i7l0VarC.i());
                            } else {
                                if (e0().q(aol0Var.a.q(), v2l0.R0)) {
                                    strZ2 = k0().Z();
                                    i7l0 i7l0VarC2 = k7l0.C();
                                    i7l0VarC2.l("_tu");
                                    i7l0VarC2.m(strZ2);
                                    b7l0Var.o((k7l0) i7l0VarC2.i());
                                } else {
                                    strZ2 = null;
                                }
                                i7l0 i7l0VarC3 = k7l0.C();
                                i7l0VarC3.l("_tr");
                                i7l0VarC3.n(1L);
                                b7l0Var.o((k7l0) i7l0VarC3.i());
                                U(pol0Var);
                                zzoh zzohVarC = pol0Var.C(aol0Var.a.q(), l8l0Var, b7l0Var, strZ2);
                                if (zzohVarC != null) {
                                    a().n.c(aol0Var.a.q(), "Generated trigger URI. appId, uri", zzohVarC.a);
                                    lqk0 lqk0Var2 = this.c;
                                    U(lqk0Var2);
                                    lqk0Var2.A(aol0Var.a.q(), zzohVarC);
                                    if (!linkedList.contains(aol0Var.a.q())) {
                                        linkedList.add(aol0Var.a.q());
                                    }
                                }
                            }
                        } else {
                            if (e0().q(aol0Var.a.q(), v2l0.R0)) {
                                strZ = k0().Z();
                                i7l0 i7l0VarC4 = k7l0.C();
                                i7l0VarC4.l("_tu");
                                i7l0VarC4.m(strZ);
                                b7l0Var.o((k7l0) i7l0VarC4.i());
                            } else {
                                strZ = null;
                            }
                            i7l0 i7l0VarC5 = k7l0.C();
                            i7l0VarC5.l("_tr");
                            i7l0VarC5.n(1L);
                            b7l0Var.o((k7l0) i7l0VarC5.i());
                            U(pol0Var);
                            zzoh zzohVarC2 = pol0Var.C(aol0Var.a.q(), l8l0Var, b7l0Var, strZ);
                            if (zzohVarC2 != null) {
                                a().n.c(aol0Var.a.q(), "Generated trigger URI. appId, uri", zzohVarC2.a);
                                lqk0 lqk0Var3 = this.c;
                                U(lqk0Var3);
                                lqk0Var3.A(aol0Var.a.q(), zzohVarC2);
                                if (!linkedList.contains(aol0Var.a.q())) {
                                    linkedList.add(aol0Var.a.q());
                                }
                            }
                        }
                    }
                    d7l0 d7l0Var = (d7l0) b7l0Var.i();
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).Y(i, d7l0Var);
                    break;
                }
            }
        }
    }

    public final void x(String str, i7l0 i7l0Var, Bundle bundle, String str2) {
        t2l0 t2l0Var;
        int iMax;
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        if (yol0.F(((k7l0) i7l0Var.b).r()) || yol0.F(str)) {
            wok0 wok0VarE0 = e0();
            wok0VarE0.getClass();
            t2l0Var = v2l0.h0;
            iMax = Math.max(Math.max(Math.min(wok0VarE0.o(str2, t2l0Var), 500), 100), 256);
        } else {
            wok0 wok0VarE1 = e0();
            wok0VarE1.getClass();
            t2l0Var = v2l0.h0;
            iMax = Math.max(Math.min(wok0VarE1.o(str2, t2l0Var), 500), 100);
        }
        long j = iMax;
        long jCodePointCount = ((k7l0) i7l0Var.b).t().codePointCount(0, ((k7l0) i7l0Var.b).t().length());
        k0();
        String strR = ((k7l0) i7l0Var.b).r();
        e0();
        String strL = yol0.l(40, strR, true);
        if (jCodePointCount <= j || listUnmodifiableList.contains(((k7l0) i7l0Var.b).r())) {
            return;
        }
        if ("_ev".equals(((k7l0) i7l0Var.b).r())) {
            k0();
            String strT = ((k7l0) i7l0Var.b).t();
            wok0 wok0VarE2 = e0();
            wok0VarE2.getClass();
            bundle.putString("_ev", yol0.l(Math.max(Math.max(Math.min(wok0VarE2.o(str2, t2l0Var), 500), 100), 256), strT, true));
            return;
        }
        a().k.c(strL, "Param value is too long; discarded. Name, value length", Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strL);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((k7l0) i7l0Var.b).r());
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0153 A[EDGE_INSN: B:105:0x0153->B:52:0x0153 BREAK  A[LOOP:0: B:33:0x00f5->B:107:0x00f5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[Catch: all -> 0x0018, PHI: r0
      0x008f: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0025, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:16:0x0032, B:21:0x0082, B:20:0x0070, B:22:0x008f, B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9, B:95:0x0266), top: B:104:0x0015, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ff A[Catch: all -> 0x0150, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011f A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0188 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01dc A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2 A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #1 {all -> 0x0150, blocks: (B:32:0x00ec, B:33:0x00f5, B:36:0x00ff, B:39:0x0113, B:41:0x011f, B:42:0x0121, B:46:0x0138, B:48:0x0142, B:52:0x0153, B:53:0x0158, B:55:0x015e, B:57:0x0171, B:59:0x0188, B:60:0x018a, B:62:0x019c, B:64:0x01b8, B:66:0x01dc, B:67:0x01eb, B:69:0x01f2, B:70:0x01fa, B:73:0x0209, B:75:0x020d, B:78:0x0214, B:79:0x0215), top: B:102:0x00ec, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0230 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x023b A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0241 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x024a A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0254 A[Catch: all -> 0x0018, SQLiteException -> 0x00b7, TryCatch #2 {SQLiteException -> 0x00b7, blocks: (B:24:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00e4, B:80:0x021d, B:82:0x0230, B:84:0x023b, B:92:0x025a, B:86:0x0241, B:88:0x024a, B:90:0x0250, B:91:0x0254, B:93:0x025d, B:94:0x0265, B:30:0x00d9), top: B:103:0x00a4, outer: #3 }] */
    public final void y(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        Integer numValueOf;
        HashMap map;
        Iterator it;
        boolean zHasNext;
        egl0 egl0Var;
        Iterator it2;
        List listL;
        int size;
        int i2;
        lqk0 lqk0Var;
        Long l;
        long j;
        j8l0 j8l0Var;
        xml0 xml0Var;
        Map map2;
        j8l0 j8l0Var2;
        xml0 xml0Var2;
        egl0 egl0Var2;
        egl0 egl0Var3;
        Map map3;
        long jK;
        int i3 = i;
        i5l0 i5l0Var = this.b;
        b().g();
        l0();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.u = false;
                O();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        ArrayList arrayList = this.y;
        hm20.h(arrayList);
        this.y = null;
        if (z) {
            if (i3 == 200) {
                if (th != null) {
                    u4l0 u4l0Var = a().n;
                    numValueOf = Integer.valueOf(i3);
                    u4l0Var.c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
                    if (z) {
                        d6l0 d6l0Var = this.i.h;
                        e().getClass();
                        d6l0Var.b(System.currentTimeMillis());
                    }
                    this.i.i.b(0L);
                    N();
                    if (z) {
                        a().n.c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                    } else {
                        a().n.a("Purged empty bundles");
                    }
                    lqk0 lqk0Var2 = this.c;
                    U(lqk0Var2);
                    lqk0Var2.S();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        egl0Var = egl0.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair = (Pair) it.next();
                        j8l0Var2 = (j8l0) pair.first;
                        xml0Var2 = (xml0) pair.second;
                        egl0Var2 = xml0Var2.c;
                        egl0Var3 = xml0Var2.c;
                        if (egl0Var2 != egl0Var) {
                            lqk0 lqk0Var3 = this.c;
                            U(lqk0Var3);
                            String str2 = xml0Var2.a;
                            map3 = xml0Var2.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jK = lqk0Var3.k(str, j8l0Var2, str2, map3, egl0Var3, null);
                            if (egl0Var3 == egl0.GOOGLE_SIGNAL_PENDING) {
                                map.put(j8l0Var2.u(), Long.valueOf(jK));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        j8l0Var = (j8l0) pair2.first;
                        xml0Var = (xml0) pair2.second;
                        if (xml0Var.c == egl0Var) {
                            Long l2 = (Long) map.get(j8l0Var.u());
                            lqk0 lqk0Var4 = this.c;
                            U(lqk0Var4);
                            egl0 egl0Var4 = egl0Var;
                            String str3 = xml0Var.a;
                            map2 = xml0Var.b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            lqk0Var4.k(str, j8l0Var, str3, map2, xml0Var.c, l2);
                            egl0Var = egl0Var4;
                        }
                    }
                    lqk0 lqk0Var5 = this.c;
                    U(lqk0Var5);
                    listL = lqk0Var5.l(str, zzoo.G0(egl0Var), 1);
                    if (!listL.isEmpty()) {
                        j = ((nol0) listL.get(0)).f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) v2l0.F.a(null)).longValue() + j) {
                            a().i.c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i4 = i2 + 1;
                        l = (Long) arrayList.get(i2);
                        lqk0 lqk0Var6 = this.c;
                        U(lqk0Var6);
                        lqk0Var6.p(l.longValue());
                        i2 = i4;
                    }
                    lqk0 lqk0Var7 = this.c;
                    U(lqk0Var7);
                    lqk0Var7.T();
                    lqk0 lqk0Var8 = this.c;
                    U(lqk0Var8);
                    lqk0Var8.U();
                    this.z = null;
                    U(i5l0Var);
                    if (i5l0Var.k()) {
                        lqk0Var = this.c;
                        U(lqk0Var);
                        if (lqk0Var.m(str)) {
                            t(str);
                        } else {
                            U(i5l0Var);
                            if (i5l0Var.k()) {
                                this.A = -1L;
                                N();
                            } else {
                                this.A = -1L;
                                N();
                            }
                        }
                    } else {
                        U(i5l0Var);
                        if (i5l0Var.k()) {
                            this.A = -1L;
                            N();
                        } else {
                            this.A = -1L;
                            N();
                        }
                    }
                    this.o = 0L;
                }
            } else if (i3 == 204) {
                i3 = 204;
                if (th != null) {
                    u4l0 u4l0Var2 = a().n;
                    numValueOf = Integer.valueOf(i3);
                    u4l0Var2.c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
                    if (z) {
                        d6l0 d6l0Var2 = this.i.h;
                        e().getClass();
                        d6l0Var2.b(System.currentTimeMillis());
                    }
                    this.i.i.b(0L);
                    N();
                    if (z) {
                        a().n.c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                    } else {
                        a().n.a("Purged empty bundles");
                    }
                    lqk0 lqk0Var9 = this.c;
                    U(lqk0Var9);
                    lqk0Var9.S();
                    map = new HashMap();
                    it = list.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        egl0Var = egl0.SGTM_CLIENT;
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        j8l0Var2 = (j8l0) pair3.first;
                        xml0Var2 = (xml0) pair3.second;
                        egl0Var2 = xml0Var2.c;
                        egl0Var3 = xml0Var2.c;
                        if (egl0Var2 != egl0Var) {
                            lqk0 lqk0Var10 = this.c;
                            U(lqk0Var10);
                            String str4 = xml0Var2.a;
                            map3 = xml0Var2.b;
                            if (map3 == null) {
                                map3 = Collections.EMPTY_MAP;
                            }
                            jK = lqk0Var10.k(str, j8l0Var2, str4, map3, egl0Var3, null);
                            if (egl0Var3 == egl0.GOOGLE_SIGNAL_PENDING) {
                                map.put(j8l0Var2.u(), Long.valueOf(jK));
                            }
                        }
                    }
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        Pair pair4 = (Pair) it2.next();
                        j8l0Var = (j8l0) pair4.first;
                        xml0Var = (xml0) pair4.second;
                        if (xml0Var.c == egl0Var) {
                            Long l3 = (Long) map.get(j8l0Var.u());
                            lqk0 lqk0Var11 = this.c;
                            U(lqk0Var11);
                            egl0 egl0Var5 = egl0Var;
                            String str5 = xml0Var.a;
                            map2 = xml0Var.b;
                            if (map2 == null) {
                                map2 = Collections.EMPTY_MAP;
                            }
                            lqk0Var11.k(str, j8l0Var, str5, map2, xml0Var.c, l3);
                            egl0Var = egl0Var5;
                        }
                    }
                    lqk0 lqk0Var12 = this.c;
                    U(lqk0Var12);
                    listL = lqk0Var12.l(str, zzoo.G0(egl0Var), 1);
                    if (!listL.isEmpty()) {
                        j = ((nol0) listL.get(0)).f;
                        e().getClass();
                        if (System.currentTimeMillis() > ((Long) v2l0.F.a(null)).longValue() + j) {
                            a().i.c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                        }
                    }
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i5 = i2 + 1;
                        l = (Long) arrayList.get(i2);
                        lqk0 lqk0Var13 = this.c;
                        U(lqk0Var13);
                        lqk0Var13.p(l.longValue());
                        i2 = i5;
                    }
                    lqk0 lqk0Var14 = this.c;
                    U(lqk0Var14);
                    lqk0Var14.T();
                    lqk0 lqk0Var15 = this.c;
                    U(lqk0Var15);
                    lqk0Var15.U();
                    this.z = null;
                    U(i5l0Var);
                    if (i5l0Var.k()) {
                        lqk0Var = this.c;
                        U(lqk0Var);
                        if (lqk0Var.m(str)) {
                            t(str);
                        } else {
                            U(i5l0Var);
                            if (i5l0Var.k()) {
                                this.A = -1L;
                                N();
                            } else {
                                this.A = -1L;
                                N();
                            }
                        }
                    } else {
                        U(i5l0Var);
                        if (i5l0Var.k()) {
                            this.A = -1L;
                            N();
                        } else {
                            this.A = -1L;
                            N();
                        }
                    }
                    this.o = 0L;
                }
            }
            String str6 = new String(bArr2, StandardCharsets.UTF_8);
            a().k.d(Integer.valueOf(i3), "Network upload failed. Will retry later. code, error", th, str6.substring(0, Math.min(32, str6.length())));
            d6l0 d6l0Var3 = this.i.i;
            e().getClass();
            d6l0Var3.b(System.currentTimeMillis());
            if (i3 == 503 || i3 == 429) {
                d6l0 d6l0Var4 = this.i.g;
                e().getClass();
                d6l0Var4.b(System.currentTimeMillis());
            }
            lqk0 lqk0Var16 = this.c;
            U(lqk0Var16);
            lqk0Var16.r(arrayList);
            N();
        } else {
            u4l0 u4l0Var3 = a().n;
            numValueOf = Integer.valueOf(i3);
            u4l0Var3.c(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
            if (z) {
                try {
                    d6l0 d6l0Var5 = this.i.h;
                    e().getClass();
                    d6l0Var5.b(System.currentTimeMillis());
                } catch (SQLiteException e) {
                    a().f.b(e, "Database error while trying to delete uploaded bundles");
                    e().getClass();
                    this.o = SystemClock.elapsedRealtime();
                    a().n.b(Long.valueOf(this.o), "Disable upload, time");
                }
            }
            this.i.i.b(0L);
            N();
            if (z) {
                a().n.c(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
            } else {
                a().n.a("Purged empty bundles");
            }
            lqk0 lqk0Var17 = this.c;
            U(lqk0Var17);
            lqk0Var17.S();
            try {
                map = new HashMap();
                it = list.iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    egl0Var = egl0.SGTM_CLIENT;
                    if (!zHasNext) {
                        break;
                    }
                    Pair pair5 = (Pair) it.next();
                    j8l0Var2 = (j8l0) pair5.first;
                    xml0Var2 = (xml0) pair5.second;
                    egl0Var2 = xml0Var2.c;
                    egl0Var3 = xml0Var2.c;
                    if (egl0Var2 != egl0Var) {
                        lqk0 lqk0Var18 = this.c;
                        U(lqk0Var18);
                        String str7 = xml0Var2.a;
                        map3 = xml0Var2.b;
                        if (map3 == null) {
                            map3 = Collections.EMPTY_MAP;
                        }
                        jK = lqk0Var18.k(str, j8l0Var2, str7, map3, egl0Var3, null);
                        if (egl0Var3 == egl0.GOOGLE_SIGNAL_PENDING && jK != -1 && !j8l0Var2.u().isEmpty()) {
                            map.put(j8l0Var2.u(), Long.valueOf(jK));
                        }
                    }
                }
                it2 = list.iterator();
                while (it2.hasNext()) {
                    Pair pair6 = (Pair) it2.next();
                    j8l0Var = (j8l0) pair6.first;
                    xml0Var = (xml0) pair6.second;
                    if (xml0Var.c == egl0Var) {
                        Long l4 = (Long) map.get(j8l0Var.u());
                        lqk0 lqk0Var19 = this.c;
                        U(lqk0Var19);
                        egl0 egl0Var6 = egl0Var;
                        String str8 = xml0Var.a;
                        map2 = xml0Var.b;
                        if (map2 == null) {
                            map2 = Collections.EMPTY_MAP;
                        }
                        lqk0Var19.k(str, j8l0Var, str8, map2, xml0Var.c, l4);
                        egl0Var = egl0Var6;
                    }
                }
                lqk0 lqk0Var110 = this.c;
                U(lqk0Var110);
                listL = lqk0Var110.l(str, zzoo.G0(egl0Var), 1);
                if (!listL.isEmpty()) {
                    j = ((nol0) listL.get(0)).f;
                    e().getClass();
                    if (System.currentTimeMillis() > ((Long) v2l0.F.a(null)).longValue() + j) {
                        a().i.c(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                    }
                }
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    int i6 = i2 + 1;
                    l = (Long) arrayList.get(i2);
                    try {
                        lqk0 lqk0Var111 = this.c;
                        U(lqk0Var111);
                        lqk0Var111.p(l.longValue());
                    } catch (SQLiteException e2) {
                        ArrayList arrayList2 = this.z;
                        if (arrayList2 == null || !arrayList2.contains(l)) {
                            throw e2;
                        }
                    }
                    i2 = i6;
                }
                lqk0 lqk0Var112 = this.c;
                U(lqk0Var112);
                lqk0Var112.T();
                lqk0 lqk0Var113 = this.c;
                U(lqk0Var113);
                lqk0Var113.U();
                this.z = null;
                U(i5l0Var);
                if (i5l0Var.k()) {
                    lqk0Var = this.c;
                    U(lqk0Var);
                    if (lqk0Var.m(str)) {
                        t(str);
                    } else {
                        U(i5l0Var);
                        if (i5l0Var.k() || !L()) {
                            this.A = -1L;
                            N();
                        } else {
                            q();
                        }
                    }
                } else {
                    U(i5l0Var);
                    if (i5l0Var.k()) {
                        this.A = -1L;
                        N();
                    } else {
                        this.A = -1L;
                        N();
                    }
                }
                this.o = 0L;
            } catch (Throwable th3) {
                lqk0 lqk0Var20 = this.c;
                U(lqk0Var20);
                lqk0Var20.U();
                throw th3;
            }
        }
        this.u = false;
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(k5l0 k5l0Var) {
        ox0 ox0Var;
        ox0 ox0Var2;
        b().g();
        if (TextUtils.isEmpty(k5l0Var.G())) {
            String strD = k5l0Var.D();
            hm20.h(strD);
            A(strD, 204, null, null, null);
            return;
        }
        String strD2 = k5l0Var.D();
        hm20.h(strD2);
        a().n.b(strD2, "Fetching remote configuration");
        e7l0 e7l0Var = this.a;
        U(e7l0Var);
        i4l0 i4l0VarS = e7l0Var.s(strD2);
        U(e7l0Var);
        e7l0Var.g();
        String str = (String) e7l0Var.m.get(strD2);
        if (i4l0VarS != null) {
            if (TextUtils.isEmpty(str)) {
                ox0Var2 = null;
            } else {
                ox0Var2 = new ox0();
                ox0Var2.put("If-Modified-Since", str);
            }
            U(e7l0Var);
            e7l0Var.g();
            String str2 = (String) e7l0Var.n.get(strD2);
            if (!TextUtils.isEmpty(str2)) {
                if (ox0Var2 == null) {
                    ox0Var2 = new ox0();
                }
                ox0Var2.put("If-None-Match", str2);
            }
            ox0Var = ox0Var2;
        } else {
            ox0Var = null;
        }
        this.t = true;
        i5l0 i5l0Var = this.b;
        U(i5l0Var);
        c5l0 c5l0Var = new c5l0() { // from class: gol0
            @Override // defpackage.c5l0
            public final /* synthetic */ void a(String str3, int i, Throwable th, byte[] bArr, Map map) {
                this.a.A(str3, i, th, bArr, map);
            }
        };
        k8l0 k8l0Var = i5l0Var.a;
        i5l0Var.g();
        i5l0Var.h();
        zml0 zml0Var = i5l0Var.b.j;
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) v2l0.f.a(null)).encodedAuthority((String) v2l0.g.a(null)).path("config/app/".concat(String.valueOf(k5l0Var.G()))).appendQueryParameter("platform", "android");
        zml0Var.a.d.l();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.s(new g5l0(i5l0Var, k5l0Var.D(), url, null, ox0Var, c5l0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.f.c(y4l0.k(k5l0Var.D()), "Failed to parse config URL. Not fetching. appId", string);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03c7 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03e6 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03fd A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0413 A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0423  */
    /* JADX WARN: Code duplicated, block: B:124:0x0425 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0435  */
    /* JADX WARN: Code duplicated, block: B:130:0x043c  */
    /* JADX WARN: Code duplicated, block: B:131:0x043e A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x046c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0471  */
    /* JADX WARN: Code duplicated, block: B:140:0x0472 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0483  */
    /* JADX WARN: Code duplicated, block: B:145:0x048a A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0494 A[Catch: all -> 0x010b, LOOP:11: B:143:0x0484->B:147:0x0494, LOOP_END, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x04bc A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x04ea A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0501  */
    /* JADX WARN: Code duplicated, block: B:162:0x0503 A[PHI: r6
      0x0503: PHI (r6v42 int) = (r6v40 int), (r6v55 int) binds: [B:166:0x0524, B:161:0x0501] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:163:0x0507 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0515 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0526  */
    /* JADX WARN: Code duplicated, block: B:172:0x0545 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0555 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0595 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x05b0 A[Catch: all -> 0x010b, LOOP:10: B:186:0x058f->B:191:0x05b0, LOOP_END, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x05bb A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x05cd A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x064f A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x065b A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0698 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x06bf A[Catch: all -> 0x010b, LOOP:9: B:222:0x06bd->B:223:0x06bf, LOOP_END, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:234:0x071c A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x0725 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x072b A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0734  */
    /* JADX WARN: Code duplicated, block: B:434:0x0dd9 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:440:0x0e02 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x0e0e A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:443:0x0e1b A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:448:0x0e5c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:449:0x0e5e A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0168  */
    /* JADX WARN: Code duplicated, block: B:453:0x0e8d A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:3:0x0019, B:5:0x0033, B:8:0x003c, B:9:0x005a, B:12:0x0070, B:15:0x009a, B:17:0x00cf, B:20:0x00e6, B:22:0x00f0, B:226:0x06df, B:26:0x011e, B:29:0x0130, B:31:0x0136, B:46:0x0178, B:48:0x018a, B:51:0x01af, B:53:0x01b5, B:55:0x01c5, B:57:0x01d3, B:59:0x01e3, B:60:0x01ee, B:61:0x01f1, B:64:0x0207, B:73:0x0238, B:76:0x0242, B:78:0x0250, B:83:0x02ab, B:80:0x0278, B:82:0x028a, B:87:0x02ba, B:89:0x02e0, B:90:0x0304, B:92:0x0335, B:94:0x033b, B:97:0x0347, B:99:0x0378, B:100:0x0391, B:102:0x0397, B:104:0x03a5, B:108:0x03b9, B:105:0x03ad, B:111:0x03c0, B:114:0x03c7, B:115:0x03e6, B:117:0x03fd, B:118:0x0409, B:121:0x0413, B:127:0x0436, B:124:0x0425, B:149:0x04b0, B:151:0x04bc, B:154:0x04cd, B:156:0x04de, B:158:0x04ea, B:193:0x05b5, B:195:0x05bb, B:196:0x05c7, B:198:0x05cd, B:200:0x05dd, B:202:0x05e7, B:203:0x05f8, B:205:0x05fe, B:206:0x0617, B:208:0x061d, B:209:0x063b, B:210:0x0649, B:214:0x066e, B:211:0x064f, B:213:0x065b, B:215:0x0675, B:216:0x0692, B:218:0x0698, B:220:0x06ab, B:221:0x06b8, B:223:0x06bf, B:225:0x06cd, B:163:0x0507, B:165:0x0515, B:168:0x0528, B:170:0x0539, B:172:0x0545, B:174:0x0555, B:176:0x0564, B:179:0x0570, B:181:0x057a, B:183:0x0584, B:186:0x058f, B:188:0x0595, B:190:0x05a5, B:191:0x05b0, B:131:0x043e, B:133:0x044a, B:135:0x0456, B:148:0x049a, B:140:0x0472, B:143:0x0484, B:145:0x048a, B:147:0x0494, B:35:0x0140, B:37:0x014d, B:39:0x0159, B:41:0x015f, B:45:0x016a, B:229:0x06f9, B:231:0x070b, B:233:0x0714, B:244:0x0744, B:234:0x071c, B:236:0x0725, B:238:0x072b, B:241:0x0737, B:243:0x073f, B:245:0x0747, B:246:0x0753, B:249:0x075b, B:251:0x076d, B:252:0x0778, B:254:0x0780, B:258:0x07ab, B:260:0x07c5, B:262:0x07d8, B:264:0x07f2, B:266:0x0805, B:267:0x0821, B:269:0x0827, B:271:0x083f, B:272:0x084d, B:274:0x085d, B:275:0x086b, B:276:0x086e, B:278:0x08b0, B:280:0x08b6, B:286:0x08dd, B:288:0x08e5, B:289:0x0903, B:291:0x0909, B:292:0x091d, B:294:0x0932, B:296:0x0941, B:298:0x0951, B:300:0x0959, B:301:0x095c, B:303:0x09b5, B:304:0x09c8, B:307:0x09d1, B:310:0x09f0, B:312:0x0a09, B:314:0x0a1e, B:317:0x0a26, B:319:0x0a2a, B:321:0x0a2e, B:323:0x0a38, B:325:0x0a41, B:327:0x0a45, B:329:0x0a4b, B:331:0x0a56, B:333:0x0a64, B:399:0x0cbe, B:336:0x0a6f, B:338:0x0a8b, B:343:0x0aa4, B:345:0x0ac6, B:346:0x0ace, B:348:0x0ad4, B:350:0x0ae6, B:356:0x0b0b, B:357:0x0b2c, B:359:0x0b38, B:361:0x0b4e, B:363:0x0b8b, B:369:0x0ba7, B:371:0x0bb2, B:373:0x0bb6, B:375:0x0bba, B:377:0x0bbe, B:378:0x0bca, B:379:0x0bd1, B:381:0x0bd7, B:383:0x0bef, B:384:0x0bf4, B:398:0x0cbb, B:385:0x0c32, B:387:0x0c38, B:391:0x0c4b, B:393:0x0c67, B:394:0x0c6e, B:397:0x0caf, B:388:0x0c3d, B:354:0x0af7, B:341:0x0a91, B:400:0x0cca, B:402:0x0cda, B:403:0x0cee, B:404:0x0cf6, B:406:0x0cfc, B:409:0x0d17, B:411:0x0d27, B:432:0x0dd3, B:434:0x0dd9, B:436:0x0dec, B:439:0x0df3, B:444:0x0e30, B:440:0x0e02, B:442:0x0e0e, B:443:0x0e1b, B:445:0x0e3f, B:446:0x0e56, B:449:0x0e5e, B:450:0x0e63, B:451:0x0e73, B:453:0x0e8d, B:454:0x0ea6, B:455:0x0eae, B:459:0x0eca, B:458:0x0eb9, B:413:0x0d3f, B:415:0x0d45, B:417:0x0d55, B:419:0x0d5c, B:425:0x0d72, B:427:0x0d79, B:429:0x0dc4, B:431:0x0dcb, B:430:0x0dc8, B:426:0x0d76, B:418:0x0d59, B:281:0x08c4, B:283:0x08ca, B:285:0x08d0, B:265:0x0802, B:261:0x07d5, B:255:0x0786, B:257:0x078c, B:460:0x0ed3), top: B:470:0x0019, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:489:0x0436 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x066e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0692 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0e63 A[SYNTHETIC] */
    public final boolean I(long j, String str) {
        boolean z;
        int i;
        Long l;
        k8l0 k8l0Var;
        long j2;
        k8l0 k8l0Var2;
        int i2;
        lqk0 lqk0VarG0;
        ArrayList arrayList;
        StringBuilder sb;
        int i3;
        int iDelete;
        lqk0 lqk0VarG1;
        i4l0 i4l0VarS;
        String str2;
        long j3;
        Long l2;
        long j4;
        int iX;
        k8l0 k8l0Var3;
        aol0 aol0Var;
        long jT;
        k7l0 k7l0VarO;
        Long lValueOf;
        String str3;
        int i4;
        String str4;
        String str5;
        int i5;
        int i6;
        int i7;
        k7l0 k7l0VarN;
        b7l0 b7l0Var;
        String str6;
        int i8;
        Bundle bundleN;
        int i9;
        pol0 pol0VarJ0;
        ArrayList arrayList2;
        int size;
        int i10;
        i7l0 i7l0VarC;
        Object obj;
        k7l0 k7l0VarN2;
        String str7;
        int i11;
        b7l0 b7l0Var2;
        ArrayList arrayList3;
        int i12;
        int i13;
        int i14;
        String strT;
        int iCharCount;
        int iCodePointAt;
        int i15;
        iol0 iol0Var = this;
        String str8 = "1";
        String str9 = "_ai";
        String str10 = "purchase";
        String str11 = "items";
        Long l3 = 1L;
        iol0Var.g0().S();
        try {
            aol0 aol0Var2 = new aol0(iol0Var);
            iol0Var.g0().O(str, j, iol0Var.A, aol0Var2);
            aol0 aol0Var3 = aol0Var2;
            ArrayList arrayList4 = aol0Var3.c;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                g0().T();
                z = false;
            } else {
                l8l0 l8l0Var = (l8l0) aol0Var3.a.k();
                l8l0Var.g();
                ((n8l0) l8l0Var.b).b0();
                int i16 = -1;
                int i17 = -1;
                int i18 = 0;
                int i19 = 0;
                boolean z2 = false;
                boolean z3 = false;
                b7l0 b7l0Var3 = null;
                b7l0 b7l0Var4 = null;
                while (true) {
                    int size2 = aol0Var3.c.size();
                    i = i19;
                    l = l3;
                    k8l0Var = iol0Var.l;
                    String str12 = str11;
                    if (i18 >= size2) {
                        break;
                    }
                    b7l0 b7l0Var5 = (b7l0) ((d7l0) aol0Var3.c.get(i18)).k();
                    int i20 = i18;
                    int i21 = i16;
                    if (iol0Var.f0().v(aol0Var3.a.q(), b7l0Var5.r())) {
                        iol0Var.a().i.c(y4l0.k(aol0Var3.a.q()), "Dropping blocked raw event. appId", k8l0Var.j.a(b7l0Var5.r()));
                        if (!str8.equals(iol0Var.f0().f(aol0Var3.a.q(), "measurement.upload.blacklist_internal")) && !str8.equals(iol0Var.f0().f(aol0Var3.a.q(), "measurement.upload.blacklist_public")) && !"_err".equals(b7l0Var5.r())) {
                            iol0Var.k0();
                            yol0.w(iol0Var.J, aol0Var3.a.q(), 11, "_ev", b7l0Var5.r(), 0);
                        }
                        str5 = str9;
                        str4 = str10;
                        i19 = i;
                        str6 = str12;
                        i8 = i20;
                        i16 = i21;
                    } else {
                        String strR = b7l0Var5.r();
                        if (strR.equals(str10) || strR.equals("_iap") || strR.equals("ecommerce_purchase")) {
                            i7l0 i7l0VarC2 = k7l0.C();
                            i7l0VarC2.l("_ct");
                            if (z2) {
                                str3 = "returning";
                            } else {
                                String strQ = aol0Var3.a.q();
                                if (iol0Var.R(strQ, str10) && iol0Var.R(strQ, "_iap") && iol0Var.R(strQ, "ecommerce_purchase")) {
                                    str3 = "new";
                                } else {
                                    str3 = "returning";
                                }
                            }
                            i7l0VarC2.m(str3);
                            b7l0Var5.o((k7l0) i7l0VarC2.i());
                            z2 = true;
                        }
                        if (b7l0Var5.r().equals(ggl0.b(str9, lbl0.c, lbl0.a))) {
                            b7l0Var5.g();
                            ((d7l0) b7l0Var5.b).G(str9);
                            iol0Var.a().n.a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(iol0Var.a().m(), 5)) {
                                for (int i22 = 0; i22 < b7l0Var5.m(); i22++) {
                                    if ("ad_platform".equals(b7l0Var5.n(i22).r()) && !b7l0Var5.n(i22).t().isEmpty() && "admob".equalsIgnoreCase(b7l0Var5.n(i22).t())) {
                                        iol0Var.a().k.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                }
                            }
                        }
                        boolean zW = iol0Var.f0().w(aol0Var3.a.q(), b7l0Var5.r());
                        if (!zW) {
                            iol0Var.j0();
                            String strR2 = b7l0Var5.r();
                            hm20.e(strR2);
                            if (strR2.hashCode() != 95027 || !strR2.equals("_ui")) {
                                str5 = str9;
                                str4 = str10;
                                i4 = i17;
                                zW = false;
                            }
                            if (zW) {
                                arrayList3 = new ArrayList(b7l0Var5.l());
                                i13 = -1;
                                i14 = -1;
                                for (i12 = 0; i12 < arrayList3.size(); i12++) {
                                    if ("value".equals(((k7l0) arrayList3.get(i12)).r())) {
                                        i13 = i12;
                                    } else if ("currency".equals(((k7l0) arrayList3.get(i12)).r())) {
                                        i14 = i12;
                                    }
                                }
                                if (i13 != -1) {
                                    if (!((k7l0) arrayList3.get(i13)).u() || ((k7l0) arrayList3.get(i13)).y()) {
                                        if (i14 == -1) {
                                            strT = ((k7l0) arrayList3.get(i14)).t();
                                            if (strT.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strT.length()) {
                                                    iCodePointAt = strT.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        iol0Var.a().k.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        b7l0Var5.q(i13);
                                        E(b7l0Var5, "_c");
                                        D(b7l0Var5, 19, "currency");
                                        break;
                                    }
                                    iol0Var.a().k.a("Value must be specified with a numeric type.");
                                    b7l0Var5.q(i13);
                                    E(b7l0Var5, "_c");
                                    D(b7l0Var5, 18, "value");
                                }
                            }
                            if ("_e".equals(b7l0Var5.r())) {
                                iol0Var.j0();
                                if (pol0.o("_fr", (d7l0) b7l0Var5.i()) == null) {
                                    if (b7l0Var4 != null && Math.abs(b7l0Var4.s() - b7l0Var5.s()) <= 1000) {
                                        b7l0Var2 = (b7l0) b7l0Var4.clone();
                                        if (iol0Var.K(b7l0Var5, b7l0Var2)) {
                                            int i23 = i4;
                                            l8l0Var.b0(i23, b7l0Var2);
                                            i17 = i23;
                                            i16 = i21;
                                            b7l0Var3 = null;
                                            b7l0Var4 = null;
                                        }
                                    }
                                    i17 = i4;
                                    b7l0Var3 = b7l0Var5;
                                    i16 = i;
                                } else {
                                    i5 = i4;
                                    i6 = i21;
                                    i16 = i6;
                                    i17 = i5;
                                }
                            } else {
                                i5 = i4;
                                if ("_vs".equals(b7l0Var5.r())) {
                                    iol0Var.j0();
                                    if (pol0.o("_et", (d7l0) b7l0Var5.i()) == null) {
                                        if (b7l0Var3 != null && Math.abs(b7l0Var3.s() - b7l0Var5.s()) <= 1000) {
                                            b7l0Var = (b7l0) b7l0Var3.clone();
                                            if (iol0Var.K(b7l0Var, b7l0Var5)) {
                                                l8l0Var.b0(i21, b7l0Var);
                                                i16 = i21;
                                                i17 = i5;
                                                b7l0Var3 = null;
                                                b7l0Var4 = null;
                                            }
                                        }
                                        i16 = i21;
                                        b7l0Var4 = b7l0Var5;
                                        i17 = i;
                                    } else {
                                        i6 = i21;
                                        i16 = i6;
                                        i17 = i5;
                                    }
                                } else {
                                    i6 = i21;
                                    if (iol0Var.e0().q(null, v2l0.j1) && (("_f".equals(b7l0Var5.r()) || "_v".equals(b7l0Var5.r())) && ("_f".equals(b7l0Var5.r()) || "_v".equals(b7l0Var5.r())))) {
                                        for (i7 = 0; i7 < b7l0Var5.m(); i7++) {
                                            k7l0VarN = b7l0Var5.n(i7);
                                            if ("_elt".equals(k7l0VarN.r())) {
                                                b7l0Var5.u(k7l0VarN.v());
                                                b7l0Var5.q(i7);
                                                break;
                                            }
                                        }
                                    }
                                    i16 = i6;
                                    i17 = i5;
                                }
                            }
                            if (b7l0Var5.m() != 0) {
                                iol0Var.j0();
                                bundleN = pol0.n(b7l0Var5.l());
                                i9 = 0;
                                while (i9 < b7l0Var5.m()) {
                                    k7l0VarN2 = b7l0Var5.n(i9);
                                    str7 = str12;
                                    if (k7l0VarN2.r().equals(str7) || k7l0VarN2.A().isEmpty()) {
                                        i11 = i9;
                                        if (!k7l0VarN2.r().equals(str7)) {
                                            iol0Var.x(b7l0Var5.r(), (i7l0) k7l0VarN2.k(), bundleN, aol0Var3.a.q());
                                        }
                                    } else {
                                        String strQ2 = aol0Var3.a.q();
                                        List listA = k7l0VarN2.A();
                                        Bundle[] bundleArr = new Bundle[listA.size()];
                                        int i24 = 0;
                                        while (i24 < listA.size()) {
                                            k7l0 k7l0Var = (k7l0) listA.get(i24);
                                            iol0Var.j0();
                                            Bundle bundleN2 = pol0.n(k7l0Var.A());
                                            Iterator it = k7l0Var.A().iterator();
                                            while (it.hasNext()) {
                                                iol0Var.x(b7l0Var5.r(), (i7l0) ((k7l0) it.next()).k(), bundleN2, strQ2);
                                                i9 = i9;
                                                listA = listA;
                                            }
                                            bundleArr[i24] = bundleN2;
                                            i24++;
                                            i9 = i9;
                                            listA = listA;
                                        }
                                        i11 = i9;
                                        bundleN.putParcelableArray(str7, bundleArr);
                                    }
                                    i9 = i11 + 1;
                                    str12 = str7;
                                }
                                str6 = str12;
                                b7l0Var5.g();
                                ((d7l0) b7l0Var5.b).E();
                                pol0VarJ0 = iol0Var.j0();
                                arrayList2 = new ArrayList();
                                for (String str13 : bundleN.keySet()) {
                                    i7l0VarC = k7l0.C();
                                    i7l0VarC.l(str13);
                                    obj = bundleN.get(str13);
                                    if (obj != null) {
                                        pol0VarJ0.B(i7l0VarC, obj);
                                        arrayList2.add((k7l0) i7l0VarC.i());
                                    }
                                }
                                size = arrayList2.size();
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    b7l0Var5.o((k7l0) obj2);
                                }
                            } else {
                                str6 = str12;
                            }
                            i8 = i20;
                            aol0Var3.c.set(i8, (d7l0) b7l0Var5.i());
                            l8l0Var.c0(b7l0Var5);
                            i19 = i + 1;
                        }
                        str5 = str9;
                        int i25 = 0;
                        boolean z4 = false;
                        boolean z5 = false;
                        while (true) {
                            str4 = str10;
                            if (i25 >= b7l0Var5.m()) {
                                break;
                            }
                            if ("_c".equals(b7l0Var5.n(i25).r())) {
                                i7l0 i7l0Var = (i7l0) b7l0Var5.n(i25).k();
                                i15 = i17;
                                i7l0Var.n(1L);
                                k7l0 k7l0Var2 = (k7l0) i7l0Var.i();
                                b7l0Var5.g();
                                ((d7l0) b7l0Var5.b).B(i25, k7l0Var2);
                                z4 = true;
                            } else {
                                i15 = i17;
                                if ("_r".equals(b7l0Var5.n(i25).r())) {
                                    i7l0 i7l0Var2 = (i7l0) b7l0Var5.n(i25).k();
                                    i7l0Var2.n(1L);
                                    k7l0 k7l0Var3 = (k7l0) i7l0Var2.i();
                                    b7l0Var5.g();
                                    ((d7l0) b7l0Var5.b).B(i25, k7l0Var3);
                                    z5 = true;
                                }
                                i25++;
                                str10 = str4;
                                i17 = i15;
                            }
                            z5 = z5;
                            i25++;
                            str10 = str4;
                            i17 = i15;
                        }
                        i4 = i17;
                        boolean z6 = z5;
                        if (!z4 && zW) {
                            iol0Var.a().n.b(k8l0Var.j.a(b7l0Var5.r()), "Marking event as conversion");
                            i7l0 i7l0VarC3 = k7l0.C();
                            i7l0VarC3.l("_c");
                            i7l0VarC3.n(1L);
                            b7l0Var5.p(i7l0VarC3);
                        }
                        if (!z6) {
                            iol0Var.a().n.b(k8l0Var.j.a(b7l0Var5.r()), "Marking event as real-time");
                            i7l0 i7l0VarC4 = k7l0.C();
                            i7l0VarC4.l("_r");
                            i7l0VarC4.n(1L);
                            b7l0Var5.p(i7l0VarC4);
                        }
                        if (iol0Var.g0().k0(iol0Var.g(), aol0Var3.a.q(), false, true, false, false).e > iol0Var.e0().o(aol0Var3.a.q(), v2l0.p)) {
                            E(b7l0Var5, "_r");
                        } else {
                            z3 = true;
                        }
                        if (yol0.f0(b7l0Var5.r()) && zW != 0 && iol0Var.g0().k0(iol0Var.g(), aol0Var3.a.q(), true, false, false, false).c > iol0Var.e0().o(aol0Var3.a.q(), v2l0.o)) {
                            iol0Var.a().i.b(y4l0.k(aol0Var3.a.q()), "Too many conversions. Not logging as conversion. appId");
                            boolean z7 = false;
                            i7l0 i7l0Var3 = null;
                            int i26 = -1;
                            for (int i27 = 0; i27 < b7l0Var5.m(); i27++) {
                                k7l0 k7l0VarN3 = b7l0Var5.n(i27);
                                if ("_c".equals(k7l0VarN3.r())) {
                                    i7l0Var3 = (i7l0) k7l0VarN3.k();
                                    i26 = i27;
                                } else if ("_err".equals(k7l0VarN3.r())) {
                                    z7 = true;
                                }
                            }
                            if (z7) {
                                if (i7l0Var3 != null) {
                                    b7l0Var5.q(i26);
                                } else {
                                    i7l0Var3 = null;
                                    if (i7l0Var3 != null) {
                                        i7l0 i7l0Var4 = (i7l0) i7l0Var3.clone();
                                        i7l0Var4.l("_err");
                                        i7l0Var4.n(10L);
                                        k7l0 k7l0Var4 = (k7l0) i7l0Var4.i();
                                        b7l0Var5.g();
                                        ((d7l0) b7l0Var5.b).B(i26, k7l0Var4);
                                    } else {
                                        iol0Var.a().f.b(y4l0.k(aol0Var3.a.q()), "Did not find conversion parameter. appId");
                                    }
                                }
                            } else if (i7l0Var3 != null) {
                                i7l0 i7l0Var5 = (i7l0) i7l0Var3.clone();
                                i7l0Var5.l("_err");
                                i7l0Var5.n(10L);
                                k7l0 k7l0Var5 = (k7l0) i7l0Var5.i();
                                b7l0Var5.g();
                                ((d7l0) b7l0Var5.b).B(i26, k7l0Var5);
                            } else {
                                iol0Var.a().f.b(y4l0.k(aol0Var3.a.q()), "Did not find conversion parameter. appId");
                            }
                        }
                        if (zW) {
                            arrayList3 = new ArrayList(b7l0Var5.l());
                            i13 = -1;
                            i14 = -1;
                            while (i12 < arrayList3.size()) {
                                if ("value".equals(((k7l0) arrayList3.get(i12)).r())) {
                                    i13 = i12;
                                } else if ("currency".equals(((k7l0) arrayList3.get(i12)).r())) {
                                    i14 = i12;
                                }
                            }
                            if (i13 != -1) {
                                if (((k7l0) arrayList3.get(i13)).u()) {
                                }
                                if (i14 == -1) {
                                    strT = ((k7l0) arrayList3.get(i14)).t();
                                    if (strT.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strT.length()) {
                                            iCodePointAt = strT.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                iol0Var.a().k.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                b7l0Var5.q(i13);
                                E(b7l0Var5, "_c");
                                D(b7l0Var5, 19, "currency");
                                break;
                            }
                        }
                        if ("_e".equals(b7l0Var5.r())) {
                            iol0Var.j0();
                            if (pol0.o("_fr", (d7l0) b7l0Var5.i()) == null) {
                                if (b7l0Var4 != null) {
                                    b7l0Var2 = (b7l0) b7l0Var4.clone();
                                    if (iol0Var.K(b7l0Var5, b7l0Var2)) {
                                        int i28 = i4;
                                        l8l0Var.b0(i28, b7l0Var2);
                                        i17 = i28;
                                        i16 = i21;
                                        b7l0Var3 = null;
                                        b7l0Var4 = null;
                                    }
                                }
                                i17 = i4;
                                b7l0Var3 = b7l0Var5;
                                i16 = i;
                            } else {
                                i5 = i4;
                                i6 = i21;
                                i16 = i6;
                                i17 = i5;
                            }
                        } else {
                            i5 = i4;
                            if ("_vs".equals(b7l0Var5.r())) {
                                iol0Var.j0();
                                if (pol0.o("_et", (d7l0) b7l0Var5.i()) == null) {
                                    if (b7l0Var3 != null) {
                                        b7l0Var = (b7l0) b7l0Var3.clone();
                                        if (iol0Var.K(b7l0Var, b7l0Var5)) {
                                            l8l0Var.b0(i21, b7l0Var);
                                            i16 = i21;
                                            i17 = i5;
                                            b7l0Var3 = null;
                                            b7l0Var4 = null;
                                        }
                                    }
                                    i16 = i21;
                                    b7l0Var4 = b7l0Var5;
                                    i17 = i;
                                } else {
                                    i6 = i21;
                                    i16 = i6;
                                    i17 = i5;
                                }
                            } else {
                                i6 = i21;
                                if (iol0Var.e0().q(null, v2l0.j1)) {
                                    while (i7 < b7l0Var5.m()) {
                                        k7l0VarN = b7l0Var5.n(i7);
                                        if ("_elt".equals(k7l0VarN.r())) {
                                            b7l0Var5.u(k7l0VarN.v());
                                            b7l0Var5.q(i7);
                                            break;
                                        }
                                    }
                                }
                                i16 = i6;
                                i17 = i5;
                            }
                        }
                        if (b7l0Var5.m() != 0) {
                            iol0Var.j0();
                            bundleN = pol0.n(b7l0Var5.l());
                            i9 = 0;
                            while (i9 < b7l0Var5.m()) {
                                k7l0VarN2 = b7l0Var5.n(i9);
                                str7 = str12;
                                if (k7l0VarN2.r().equals(str7)) {
                                    i11 = i9;
                                    if (!k7l0VarN2.r().equals(str7)) {
                                        iol0Var.x(b7l0Var5.r(), (i7l0) k7l0VarN2.k(), bundleN, aol0Var3.a.q());
                                    }
                                } else {
                                    i11 = i9;
                                    if (!k7l0VarN2.r().equals(str7)) {
                                        iol0Var.x(b7l0Var5.r(), (i7l0) k7l0VarN2.k(), bundleN, aol0Var3.a.q());
                                    }
                                }
                                i9 = i11 + 1;
                                str12 = str7;
                            }
                            str6 = str12;
                            b7l0Var5.g();
                            ((d7l0) b7l0Var5.b).E();
                            pol0VarJ0 = iol0Var.j0();
                            arrayList2 = new ArrayList();
                            while (r5.hasNext()) {
                                i7l0VarC = k7l0.C();
                                i7l0VarC.l(str13);
                                obj = bundleN.get(str13);
                                if (obj != null) {
                                    pol0VarJ0.B(i7l0VarC, obj);
                                    arrayList2.add((k7l0) i7l0VarC.i());
                                }
                            }
                            size = arrayList2.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj3 = arrayList2.get(i10);
                                i10++;
                                b7l0Var5.o((k7l0) obj3);
                            }
                        } else {
                            str6 = str12;
                        }
                        i8 = i20;
                        aol0Var3.c.set(i8, (d7l0) b7l0Var5.i());
                        l8l0Var.c0(b7l0Var5);
                        i19 = i + 1;
                    }
                    i18 = i8 + 1;
                    str11 = str6;
                    l3 = l;
                    str8 = str8;
                    str9 = str5;
                    str10 = str4;
                }
                long j5 = 0;
                long jLongValue = 0;
                int i29 = i;
                int i30 = 0;
                while (i30 < i29) {
                    d7l0 d7l0VarU1 = ((n8l0) l8l0Var.b).U1(i30);
                    if ("_e".equals(d7l0VarU1.t())) {
                        iol0Var.j0();
                        if (pol0.o("_fr", d7l0VarU1) != null) {
                            l8l0Var.d0(i30);
                            i29--;
                            i30--;
                        } else {
                            iol0Var.j0();
                            k7l0VarO = pol0.o("_et", d7l0VarU1);
                            if (k7l0VarO == null) {
                                if (k7l0VarO.u()) {
                                    lValueOf = Long.valueOf(k7l0VarO.v());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        iol0Var.j0();
                        k7l0VarO = pol0.o("_et", d7l0VarU1);
                        if (k7l0VarO == null) {
                            if (k7l0VarO.u()) {
                                lValueOf = Long.valueOf(k7l0VarO.v());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i30++;
                }
                iol0Var.J(l8l0Var, jLongValue, false);
                Iterator it2 = l8l0Var.Z().iterator();
                while (it2.hasNext()) {
                    if ("_s".equals(((d7l0) it2.next()).t())) {
                        iol0Var.g0().Y(l8l0Var.s(), "_se");
                        break;
                    }
                }
                if (pol0.P("_sid", l8l0Var) >= 0) {
                    iol0Var.J(l8l0Var, jLongValue, true);
                } else {
                    int iP = pol0.P("_se", l8l0Var);
                    if (iP >= 0) {
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).f0(iP);
                        iol0Var.a().f.b(y4l0.k(aol0Var3.a.q()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                String strQ3 = aol0Var3.a.q();
                iol0Var.b().g();
                iol0Var.l0();
                k5l0 k5l0VarI0 = iol0Var.g0().i0(strQ3);
                if (k5l0VarI0 == null) {
                    iol0Var.a().f.b(y4l0.k(strQ3), "Cannot fix consent fields without appInfo. appId");
                } else {
                    iol0Var.m(k5l0VarI0, l8l0Var);
                }
                String strQ4 = aol0Var3.a.q();
                iol0Var.b().g();
                iol0Var.l0();
                k5l0 k5l0VarI1 = iol0Var.g0().i0(strQ4);
                if (k5l0VarI1 == null) {
                    iol0Var.a().i.b(y4l0.k(strQ4), "Cannot populate ad_campaign_info without appInfo. appId");
                } else {
                    iol0Var.n(k5l0VarI1, l8l0Var);
                }
                l8l0Var.g();
                ((n8l0) l8l0Var.b).i0(Long.MAX_VALUE);
                l8l0Var.g();
                ((n8l0) l8l0Var.b).j0(Long.MIN_VALUE);
                for (int i31 = 0; i31 < l8l0Var.a0(); i31++) {
                    d7l0 d7l0VarU2 = ((n8l0) l8l0Var.b).U1(i31);
                    if (d7l0VarU2.v() < ((n8l0) l8l0Var.b).b2()) {
                        long jV = d7l0VarU2.v();
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).i0(jV);
                    }
                    if (d7l0VarU2.v() > ((n8l0) l8l0Var.b).d2()) {
                        long jV2 = d7l0VarU2.v();
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).j0(jV2);
                    }
                }
                l8l0Var.R();
                jbl0 jbl0Var = jbl0.c;
                jbl0 jbl0VarJ = iol0Var.f(aol0Var3.a.q()).j(jbl0.c(100, aol0Var3.a.v0()));
                jbl0 jbl0VarL = iol0Var.g0().L(aol0Var3.a.q());
                iol0Var.g0().K(aol0Var3.a.q(), jbl0VarJ);
                hbl0 hbl0Var = hbl0.ANALYTICS_STORAGE;
                if (!jbl0VarJ.i(hbl0Var) && jbl0VarL.i(hbl0Var)) {
                    iol0Var.g0().W(aol0Var3.a.q());
                } else if (jbl0VarJ.i(hbl0Var) && !jbl0VarL.i(hbl0Var)) {
                    iol0Var.g0().X(aol0Var3.a.q());
                }
                hbl0 hbl0Var2 = hbl0.AD_STORAGE;
                if (!jbl0VarJ.i(hbl0Var2)) {
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).A1();
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).C1();
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).T0();
                }
                if (!jbl0VarJ.i(hbl0Var)) {
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).E1();
                    l8l0Var.g();
                    ((n8l0) l8l0Var.b).a1();
                }
                kql0.a();
                if (iol0Var.e0().q(aol0Var3.a.q(), v2l0.P0)) {
                    iol0Var.k0();
                    if (yol0.D(aol0Var3.a.q()) && iol0Var.f(aol0Var3.a.q()).i(hbl0Var2) && aol0Var3.a.A0()) {
                        iol0Var.w(l8l0Var, aol0Var3);
                    }
                }
                l8l0Var.g();
                ((n8l0) l8l0Var.b).M1();
                l8l0Var.O(iol0Var.i0().k(l8l0Var.s(), l8l0Var.Z(), Collections.unmodifiableList(((n8l0) l8l0Var.b).V1()), Long.valueOf(((n8l0) l8l0Var.b).b2()), Long.valueOf(((n8l0) l8l0Var.b).d2()), !jbl0VarJ.i(hbl0Var)));
                if (iol0Var.e0().i(aol0Var3.a.q())) {
                    HashMap map = new HashMap();
                    ArrayList arrayList5 = new ArrayList();
                    SecureRandom secureRandomE0 = iol0Var.k0().e0();
                    int i32 = 0;
                    while (true) {
                        int iA0 = l8l0Var.a0();
                        str2 = CaxEybC.ascHEnLjxIIQ;
                        if (i32 >= iA0) {
                            break;
                        }
                        b7l0 b7l0Var6 = (b7l0) ((n8l0) l8l0Var.b).U1(i32).k();
                        if (b7l0Var6.r().equals("_ep")) {
                            iol0Var.j0();
                            String str14 = (String) pol0.p("_en", (d7l0) b7l0Var6.i());
                            msk0 msk0VarE = (msk0) map.get(str14);
                            if (msk0VarE == null) {
                                lqk0 lqk0VarG2 = iol0Var.g0();
                                j3 = j5;
                                String strQ5 = aol0Var3.a.q();
                                hm20.h(str14);
                                msk0VarE = lqk0VarG2.E(str2, strQ5, str14);
                                if (msk0VarE != null) {
                                    map.put(str14, msk0VarE);
                                }
                            } else {
                                j3 = j5;
                            }
                            if (msk0VarE == null || msk0VarE.i != null) {
                                l2 = l;
                            } else {
                                Long l4 = msk0VarE.j;
                                if (l4 != null && l4.longValue() > 1) {
                                    iol0Var.j0();
                                    pol0.m(b7l0Var6, "_sr", l4);
                                }
                                Boolean bool = msk0VarE.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    iol0Var.j0();
                                    l2 = l;
                                    pol0.m(b7l0Var6, "_efs", l2);
                                }
                                arrayList5.add((d7l0) b7l0Var6.i());
                            }
                            l8l0Var.b0(i32, b7l0Var6);
                        } else {
                            j3 = j5;
                            l2 = l;
                            e7l0 e7l0VarF0 = iol0Var.f0();
                            String strQ6 = aol0Var3.a.q();
                            String strF = e7l0VarF0.f(strQ6, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strF)) {
                                j4 = j3;
                            } else {
                                try {
                                    j4 = Long.parseLong(strF);
                                } catch (NumberFormatException e) {
                                    e7l0VarF0.a.a().i.c(y4l0.k(strQ6), "Unable to parse timezone offset. appId", e);
                                    j4 = j3;
                                }
                            }
                            k0();
                            long jS = b7l0Var6.s();
                            long j6 = j4 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                            long j7 = (jS + j6) / 86400000;
                            d7l0 d7l0Var = (d7l0) b7l0Var6.i();
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it3 = d7l0Var.q().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        k7l0 k7l0Var6 = (k7l0) it3.next();
                                        if ("_dbg".equals(k7l0Var6.r())) {
                                            if (l2.equals(Long.valueOf(k7l0Var6.v()))) {
                                                iX = 1;
                                                break;
                                            }
                                        }
                                    }
                                    iX = f0().x(aol0Var3.a.q(), b7l0Var6.r());
                                    break;
                                }
                            }
                            iX = f0().x(aol0Var3.a.q(), b7l0Var6.r());
                            break;
                            if (iX <= 0) {
                                a().i.c(b7l0Var6.r(), "Sample rate must be positive. event, rate", Integer.valueOf(iX));
                                arrayList5.add((d7l0) b7l0Var6.i());
                                l8l0Var.b0(i32, b7l0Var6);
                            } else {
                                msk0 msk0VarB = (msk0) map.get(b7l0Var6.r());
                                if (msk0VarB == null) {
                                    k8l0Var3 = k8l0Var;
                                    msk0VarB = g0().E(str2, aol0Var3.a.q(), b7l0Var6.r());
                                    if (msk0VarB == null) {
                                        a().i.c(aol0Var3.a.q(), "Event being bundled has no eventAggregate. appId, eventName", b7l0Var6.r());
                                        msk0VarB = new msk0(aol0Var3.a.q(), b7l0Var6.r(), 1L, 1L, 1L, b7l0Var6.s(), 0L, null, null, null, null);
                                    }
                                } else {
                                    k8l0Var3 = k8l0Var;
                                }
                                j0();
                                Long l5 = (Long) pol0.p("_eid", (d7l0) b7l0Var6.i());
                                boolean z8 = l5 != null;
                                if (iX == 1) {
                                    arrayList5.add((d7l0) b7l0Var6.i());
                                    if (z8 && (msk0VarB.i != null || msk0VarB.j != null || msk0VarB.k != null)) {
                                        map.put(b7l0Var6.r(), msk0VarB.b(null, null, null));
                                    }
                                    l8l0Var.b0(i32, b7l0Var6);
                                    l = l2;
                                    aol0Var = aol0Var3;
                                } else {
                                    if (secureRandomE0.nextInt(iX) == 0) {
                                        j0();
                                        aol0Var = aol0Var3;
                                        Long lValueOf2 = Long.valueOf(iX);
                                        pol0.m(b7l0Var6, "_sr", lValueOf2);
                                        arrayList5.add((d7l0) b7l0Var6.i());
                                        if (z8) {
                                            msk0VarB = msk0VarB.b(null, lValueOf2, null);
                                        }
                                        map.put(b7l0Var6.r(), new msk0(msk0VarB.a, msk0VarB.b, msk0VarB.c, msk0VarB.d, msk0VarB.e, msk0VarB.f, b7l0Var6.s(), Long.valueOf(j7), msk0VarB.i, msk0VarB.j, msk0VarB.k));
                                        l = l2;
                                    } else {
                                        aol0Var = aol0Var3;
                                        Long l6 = msk0VarB.h;
                                        if (l6 != null) {
                                            jT = l6.longValue();
                                        } else {
                                            k0();
                                            jT = (j6 + b7l0Var6.t()) / 86400000;
                                        }
                                        if (jT != j7) {
                                            j0();
                                            pol0.m(b7l0Var6, "_efs", l2);
                                            j0();
                                            Long lValueOf3 = Long.valueOf(iX);
                                            pol0.m(b7l0Var6, "_sr", lValueOf3);
                                            arrayList5.add((d7l0) b7l0Var6.i());
                                            if (z8) {
                                                msk0VarB = msk0VarB.b(null, lValueOf3, Boolean.TRUE);
                                            }
                                            l = l2;
                                            map.put(b7l0Var6.r(), new msk0(msk0VarB.a, msk0VarB.b, msk0VarB.c, msk0VarB.d, msk0VarB.e, msk0VarB.f, b7l0Var6.s(), Long.valueOf(j7), msk0VarB.i, msk0VarB.j, msk0VarB.k));
                                        } else {
                                            l = l2;
                                            if (z8) {
                                                map.put(b7l0Var6.r(), msk0VarB.b(l5, null, null));
                                            }
                                        }
                                    }
                                    l8l0Var.b0(i32, b7l0Var6);
                                }
                            }
                            i32++;
                            iol0Var = this;
                            j5 = j3;
                            k8l0Var = k8l0Var3;
                            aol0Var3 = aol0Var;
                        }
                        l = l2;
                        k8l0Var3 = k8l0Var;
                        aol0Var = aol0Var3;
                        i32++;
                        iol0Var = this;
                        j5 = j3;
                        k8l0Var = k8l0Var3;
                        aol0Var3 = aol0Var;
                        g0().U();
                        throw th;
                    }
                    j2 = j5;
                    k8l0Var2 = k8l0Var;
                    aol0 aol0Var4 = aol0Var3;
                    if (arrayList5.size() < l8l0Var.a0()) {
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).b0();
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).a0(arrayList5);
                    }
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        g0().F(str2, (msk0) ((Map.Entry) it4.next()).getValue());
                    }
                    aol0Var3 = aol0Var4;
                } else {
                    j2 = 0;
                    k8l0Var2 = k8l0Var;
                }
                String strQ7 = aol0Var3.a.q();
                k5l0 k5l0VarI2 = g0().i0(strQ7);
                try {
                    if (k5l0VarI2 == null) {
                        a().f.b(y4l0.k(aol0Var3.a.q()), "Bundling raw events w/o app info. appId");
                    } else {
                        if (l8l0Var.a0() > 0) {
                            p7l0 p7l0Var = k5l0VarI2.a.g;
                            k8l0.m(p7l0Var);
                            p7l0Var.g();
                            long j8 = k5l0VarI2.i;
                            if (j8 != j2) {
                                l8l0Var.l(j8);
                            } else {
                                l8l0Var.m();
                            }
                            p7l0 p7l0Var2 = k5l0VarI2.a.g;
                            k8l0.m(p7l0Var2);
                            p7l0Var2.g();
                            long j9 = k5l0VarI2.h;
                            if (j9 != j2) {
                                j8 = j9;
                            }
                            if (j8 != j2) {
                                l8l0Var.g0(j8);
                            } else {
                                l8l0Var.h0();
                            }
                            k5l0VarI2.h(l8l0Var.a0());
                            p7l0 p7l0Var3 = k5l0VarI2.a.g;
                            k8l0.m(p7l0Var3);
                            p7l0Var3.g();
                            int i33 = (int) k5l0VarI2.F;
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).k1(i33);
                            p7l0 p7l0Var4 = k5l0VarI2.a.g;
                            k8l0.m(p7l0Var4);
                            p7l0Var4.g();
                            l8l0Var.B((int) k5l0VarI2.g);
                            k5l0VarI2.L(((n8l0) l8l0Var.b).b2());
                            k5l0VarI2.M(((n8l0) l8l0Var.b).d2());
                            String strU = k5l0VarI2.u();
                            if (strU != null) {
                                l8l0Var.K(strU);
                            } else {
                                l8l0Var.L();
                            }
                            i2 = 0;
                            g0().j0(k5l0VarI2, false);
                        }
                        if (l8l0Var.a0() > 0) {
                            k8l0Var2.getClass();
                            i4l0VarS = f0().s(aol0Var3.a.q());
                            if (i4l0VarS == null && i4l0VarS.q()) {
                                long jR = i4l0VarS.r();
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).R0(jR);
                            } else if (aol0Var3.a.F().isEmpty()) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).R0(-1L);
                            } else {
                                a().i.b(y4l0.k(aol0Var3.a.q()), "Did not find measurement config or missing version info. appId");
                            }
                            g0().n0((n8l0) l8l0Var.i(), z3);
                        }
                        lqk0VarG0 = g0();
                        arrayList = aol0Var3.b;
                        hm20.h(arrayList);
                        lqk0VarG0.g();
                        lqk0VarG0.h();
                        sb = new StringBuilder("rowid in (");
                        for (i3 = i2; i3 < arrayList.size(); i3++) {
                            if (i3 != 0) {
                                sb.append(",");
                            }
                            sb.append(((Long) arrayList.get(i3)).longValue());
                        }
                        sb.append(")");
                        iDelete = lqk0VarG0.V().delete("raw_events", sb.toString(), null);
                        if (iDelete != arrayList.size()) {
                            lqk0VarG0.a.a().f.c(Integer.valueOf(iDelete), "Deleted fewer rows from raw events table than expected", Integer.valueOf(arrayList.size()));
                        }
                        lqk0VarG1 = g0();
                        lqk0VarG1.V().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strQ7, strQ7});
                        g0().T();
                        z = true;
                    }
                    lqk0VarG1.V().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strQ7, strQ7});
                } catch (SQLiteException e2) {
                    lqk0VarG1.a.a().f.c(y4l0.k(strQ7), "Failed to remove unused event metadata. appId", e2);
                }
                i2 = 0;
                if (l8l0Var.a0() > 0) {
                    k8l0Var2.getClass();
                    i4l0VarS = f0().s(aol0Var3.a.q());
                    if (i4l0VarS == null) {
                        if (aol0Var3.a.F().isEmpty()) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).R0(-1L);
                        } else {
                            a().i.b(y4l0.k(aol0Var3.a.q()), "Did not find measurement config or missing version info. appId");
                        }
                    } else if (aol0Var3.a.F().isEmpty()) {
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).R0(-1L);
                    } else {
                        a().i.b(y4l0.k(aol0Var3.a.q()), "Did not find measurement config or missing version info. appId");
                    }
                    g0().n0((n8l0) l8l0Var.i(), z3);
                }
                lqk0VarG0 = g0();
                arrayList = aol0Var3.b;
                hm20.h(arrayList);
                lqk0VarG0.g();
                lqk0VarG0.h();
                sb = new StringBuilder("rowid in (");
                while (i3 < arrayList.size()) {
                    if (i3 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) arrayList.get(i3)).longValue());
                }
                sb.append(")");
                iDelete = lqk0VarG0.V().delete("raw_events", sb.toString(), null);
                if (iDelete != arrayList.size()) {
                    lqk0VarG0.a.a().f.c(Integer.valueOf(iDelete), "Deleted fewer rows from raw events table than expected", Integer.valueOf(arrayList.size()));
                }
                lqk0VarG1 = g0();
                g0().T();
                z = true;
            }
            g0().U();
            return z;
        } catch (Throwable th) {
            g0().U();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0342  */
    /* JADX WARN: Code duplicated, block: B:115:0x0377  */
    /* JADX WARN: Code duplicated, block: B:118:0x0397  */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01df  */
    /* JADX WARN: Code duplicated, block: B:64:0x0205  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:70:0x026e  */
    /* JADX WARN: Code duplicated, block: B:73:0x027e  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d4  */
    public final void N() {
        boolean z;
        long jMax;
        long jMax2;
        int i;
        i5l0 i5l0Var;
        x5l0 x5l0VarH0;
        iol0 iol0Var;
        long jA;
        long jMax3;
        long jCurrentTimeMillis;
        jml0 jml0Var;
        y4l0 y4l0Var;
        Context context;
        JobInfo jobInfoBuild;
        JobScheduler jobScheduler;
        Method method;
        int iIntValue;
        hml0 hml0Var;
        hml0 hml0Var2;
        pol0 pol0Var = this.g;
        b().g();
        l0();
        if (this.o > 0) {
            e().getClass();
            long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.o);
            if (jAbs > 0) {
                a().n.b(Long.valueOf(jAbs), "Upload has been suspended. Will update scheduling later in approximately ms");
                h0().a();
                jml0 jml0Var2 = this.e;
                U(jml0Var2);
                jml0Var2.k();
                return;
            }
            this.o = 0L;
        }
        if (!this.l.h() || !L()) {
            a().n.a("Nothing to upload or uploading impossible");
            h0().a();
            jml0 jml0Var3 = this.e;
            U(jml0Var3);
            jml0Var3.k();
            return;
        }
        e().getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        e0();
        long jMax4 = Math.max(0L, ((Long) v2l0.O.a(null)).longValue());
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        if (lqk0Var.Q("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            z = true;
        } else {
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            if (lqk0Var2.Q("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            String strK = e0().k("debug.firebase.analytics.app");
            if (TextUtils.isEmpty(strK) || ".none.".equals(strK)) {
                e0();
                jMax = Math.max(0L, ((Long) v2l0.I.a(null)).longValue());
            } else {
                e0();
                jMax = Math.max(0L, ((Long) v2l0.J.a(null)).longValue());
            }
        } else {
            e0();
            jMax = Math.max(0L, ((Long) v2l0.H.a(null)).longValue());
        }
        long jA2 = this.i.h.a();
        long jA3 = this.i.i.a();
        lqk0 lqk0Var3 = this.c;
        U(lqk0Var3);
        long jR = lqk0Var3.R("select max(bundle_end_timestamp) from queue", null, 0L);
        lqk0 lqk0Var4 = this.c;
        U(lqk0Var4);
        long jMax5 = Math.max(jR, lqk0Var4.R("select max(timestamp) from raw_events", null, 0L));
        if (jMax5 != 0) {
            long jAbs2 = jCurrentTimeMillis2 - Math.abs(jMax5 - jCurrentTimeMillis2);
            long jAbs3 = jCurrentTimeMillis2 - Math.abs(jA2 - jCurrentTimeMillis2);
            long jAbs4 = jCurrentTimeMillis2 - Math.abs(jA3 - jCurrentTimeMillis2);
            long jMin = jMax4 + jAbs2;
            long jMax6 = Math.max(jAbs3, jAbs4);
            if (z && jMax6 > 0) {
                jMin = Math.min(jAbs2, jMax6) + jMax;
            }
            U(pol0Var);
            jMax2 = !pol0Var.L(jMax6, jMax) ? jMax6 + jMax : jMin;
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i2 = 0;
                while (true) {
                    e0();
                    i = 0;
                    if (i2 >= Math.min(20, Math.max(0, ((Integer) v2l0.Q.a(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    e0();
                    jMax2 += Math.max(0L, ((Long) v2l0.P.a(null)).longValue()) * (1 << i2);
                    if (jMax2 > jAbs4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (jMax2 == 0) {
                a().n.a("Next upload time is 0");
                h0().a();
                jml0 jml0Var4 = this.e;
                U(jml0Var4);
                jml0Var4.k();
                return;
            }
            i5l0Var = this.b;
            U(i5l0Var);
            if (i5l0Var.k()) {
                a().n.a("No network");
                x5l0VarH0 = h0();
                iol0Var = x5l0VarH0.a;
                iol0Var.l0();
                iol0Var.b().g();
                if (!x5l0VarH0.b) {
                    iol0Var.l.a.registerReceiver(x5l0VarH0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    i5l0 i5l0Var2 = iol0Var.b;
                    U(i5l0Var2);
                    x5l0VarH0.c = i5l0Var2.k();
                    iol0Var.a().n.b(Boolean.valueOf(x5l0VarH0.c), "Registering connectivity change receiver. Network connected");
                    x5l0VarH0.b = true;
                }
                jml0 jml0Var5 = this.e;
                U(jml0Var5);
                jml0Var5.k();
                return;
            }
            jA = this.i.g.a();
            e0();
            jMax3 = Math.max(0L, ((Long) v2l0.G.a(null)).longValue());
            U(pol0Var);
            if (!pol0Var.L(jA, jMax3)) {
                jMax2 = Math.max(jMax2, jA + jMax3);
            }
            h0().a();
            e().getClass();
            jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                e0();
                jCurrentTimeMillis = Math.max(0L, ((Long) v2l0.K.a(null)).longValue());
                d6l0 d6l0Var = this.i.h;
                e().getClass();
                d6l0Var.b(System.currentTimeMillis());
            }
            a().n.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
            jml0Var = this.e;
            U(jml0Var);
            jml0Var.h();
            k8l0 k8l0Var = jml0Var.a;
            k8l0Var.getClass();
            y4l0Var = k8l0Var.f;
            context = k8l0Var.a;
            if (!yol0.X(context)) {
                k8l0.m(y4l0Var);
                y4l0Var.m.a("Receiver not registered/enabled");
            }
            if (!yol0.z(context)) {
                k8l0.m(y4l0Var);
                y4l0Var.m.a("Service not registered/enabled");
            }
            jml0Var.k();
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
            k8l0Var.k.getClass();
            SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis < Math.max(0L, ((Long) v2l0.L.a(null)).longValue())) {
                hml0Var = jml0Var.e;
                if (hml0Var == null) {
                    hml0 hml0Var3 = new hml0(jml0Var, jml0Var.b.l);
                    jml0Var.e = hml0Var3;
                    hml0Var = hml0Var3;
                }
                if (hml0Var.c == 0) {
                    hml0Var2 = jml0Var.e;
                    if (hml0Var2 == null) {
                        hml0 hml0Var4 = new hml0(jml0Var, jml0Var.b.l);
                        jml0Var.e = hml0Var4;
                        hml0Var2 = hml0Var4;
                    }
                    hml0Var2.b(jCurrentTimeMillis);
                }
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iM = jml0Var.m();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            jobInfoBuild = new JobInfo.Builder(iM, componentName).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle).build();
            Method method2 = mvk0.a;
            jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            jobScheduler.getClass();
            method = mvk0.a;
            if (method != null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(jobInfoBuild);
            }
            Method method3 = mvk0.b;
            if (method3 != null) {
                try {
                    Integer num = (Integer) method3.invoke(UserHandle.class, null);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = i;
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    String str = Chyeyik.vSlbUgTeVOWiL;
                    if (Log.isLoggable(str, 6)) {
                        Log.e(str, "myUserId invocation illegal", e);
                    }
                }
            } else {
                iIntValue = i;
            }
            try {
                return;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
                jobScheduler.schedule(jobInfoBuild);
                return;
            }
        }
        jMax2 = 0;
        i = 0;
        if (jMax2 == 0) {
            a().n.a("Next upload time is 0");
            h0().a();
            jml0 jml0Var6 = this.e;
            U(jml0Var6);
            jml0Var6.k();
            return;
        }
        i5l0Var = this.b;
        U(i5l0Var);
        if (i5l0Var.k()) {
            a().n.a("No network");
            x5l0VarH0 = h0();
            iol0Var = x5l0VarH0.a;
            iol0Var.l0();
            iol0Var.b().g();
            if (!x5l0VarH0.b) {
                iol0Var.l.a.registerReceiver(x5l0VarH0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                i5l0 i5l0Var3 = iol0Var.b;
                U(i5l0Var3);
                x5l0VarH0.c = i5l0Var3.k();
                iol0Var.a().n.b(Boolean.valueOf(x5l0VarH0.c), "Registering connectivity change receiver. Network connected");
                x5l0VarH0.b = true;
            }
            jml0 jml0Var7 = this.e;
            U(jml0Var7);
            jml0Var7.k();
            return;
        }
        jA = this.i.g.a();
        e0();
        jMax3 = Math.max(0L, ((Long) v2l0.G.a(null)).longValue());
        U(pol0Var);
        if (!pol0Var.L(jA, jMax3)) {
            jMax2 = Math.max(jMax2, jA + jMax3);
        }
        h0().a();
        e().getClass();
        jCurrentTimeMillis = jMax2 - System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            e0();
            jCurrentTimeMillis = Math.max(0L, ((Long) v2l0.K.a(null)).longValue());
            d6l0 d6l0Var2 = this.i.h;
            e().getClass();
            d6l0Var2.b(System.currentTimeMillis());
        }
        a().n.b(Long.valueOf(jCurrentTimeMillis), "Upload scheduled in approximately ms");
        jml0Var = this.e;
        U(jml0Var);
        jml0Var.h();
        k8l0 k8l0Var2 = jml0Var.a;
        k8l0Var2.getClass();
        y4l0Var = k8l0Var2.f;
        context = k8l0Var2.a;
        if (!yol0.X(context)) {
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Receiver not registered/enabled");
        }
        if (!yol0.z(context)) {
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Service not registered/enabled");
        }
        jml0Var.k();
        k8l0.m(y4l0Var);
        y4l0Var.n.b(Long.valueOf(jCurrentTimeMillis), "Scheduling upload, millis");
        k8l0Var2.k.getClass();
        SystemClock.elapsedRealtime();
        if (jCurrentTimeMillis < Math.max(0L, ((Long) v2l0.L.a(null)).longValue())) {
            hml0Var = jml0Var.e;
            if (hml0Var == null) {
                hml0 hml0Var5 = new hml0(jml0Var, jml0Var.b.l);
                jml0Var.e = hml0Var5;
                hml0Var = hml0Var5;
            }
            if (hml0Var.c == 0) {
                hml0Var2 = jml0Var.e;
                if (hml0Var2 == null) {
                    hml0 hml0Var6 = new hml0(jml0Var, jml0Var.b.l);
                    jml0Var.e = hml0Var6;
                    hml0Var2 = hml0Var6;
                }
                hml0Var2.b(jCurrentTimeMillis);
            }
        }
        ComponentName componentName2 = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iM2 = jml0Var.m();
        PersistableBundle persistableBundle2 = new PersistableBundle();
        persistableBundle2.putString("action", "com.google.android.gms.measurement.UPLOAD");
        jobInfoBuild = new JobInfo.Builder(iM2, componentName2).setMinimumLatency(jCurrentTimeMillis).setOverrideDeadline(jCurrentTimeMillis + jCurrentTimeMillis).setExtras(persistableBundle2).build();
        Method method4 = mvk0.a;
        jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        method = mvk0.a;
        if (method != null) {
        }
        jobScheduler.schedule(jobInfoBuild);
    }

    public final void Z(zzah zzahVar, zzr zzrVar) {
        zzbg zzbgVar;
        hm20.e(zzahVar.a);
        hm20.h(zzahVar.b);
        hm20.h(zzahVar.c);
        hm20.e(zzahVar.c.b);
        b().g();
        l0();
        if (T(zzrVar)) {
            if (!zzrVar.v) {
                c0(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.e = false;
            lqk0 lqk0Var = this.c;
            U(lqk0Var);
            lqk0Var.S();
            try {
                lqk0 lqk0Var2 = this.c;
                U(lqk0Var2);
                String str = zzahVar2.a;
                hm20.h(str);
                zzah zzahVarE0 = lqk0Var2.e0(str, zzahVar2.c.b);
                k8l0 k8l0Var = this.l;
                if (zzahVarE0 != null && !zzahVarE0.b.equals(zzahVar2.b)) {
                    a().i.d(k8l0Var.j.c(zzahVar2.c.b), "Updating a conditional user property with different origin. name, origin, origin (from DB)", zzahVar2.b, zzahVarE0.b);
                }
                if (zzahVarE0 != null && zzahVarE0.e) {
                    zzahVar2.b = zzahVarE0.b;
                    zzahVar2.d = zzahVarE0.d;
                    zzahVar2.v = zzahVarE0.v;
                    zzahVar2.f = zzahVarE0.f;
                    zzahVar2.w = zzahVarE0.w;
                    zzahVar2.e = true;
                    zzpl zzplVar = zzahVar2.c;
                    zzahVar2.c = new zzpl(zzahVarE0.c.c, zzplVar.G0(), zzplVar.b, zzahVarE0.c.f);
                } else if (TextUtils.isEmpty(zzahVar2.f)) {
                    zzpl zzplVar2 = zzahVar2.c;
                    zzahVar2.c = new zzpl(zzahVar2.d, zzplVar2.G0(), zzplVar2.b, zzahVar2.c.f);
                    zzahVar2.e = true;
                    z = true;
                }
                if (zzahVar2.e) {
                    zzpl zzplVar3 = zzahVar2.c;
                    String str2 = zzahVar2.a;
                    hm20.h(str2);
                    String str3 = zzahVar2.b;
                    String str4 = zzplVar3.b;
                    long j = zzplVar3.c;
                    Object objG0 = zzplVar3.G0();
                    hm20.h(objG0);
                    uol0 uol0Var = new uol0(str2, str3, str4, j, objG0);
                    Object obj = uol0Var.e;
                    String str5 = uol0Var.c;
                    lqk0 lqk0Var3 = this.c;
                    U(lqk0Var3);
                    if (lqk0Var3.Z(uol0Var)) {
                        a().m.d(zzahVar2.a, "User property updated immediately", k8l0Var.j.c(str5), obj);
                    } else {
                        a().f.d(y4l0.k(zzahVar2.a), "(2)Too many active user properties, ignoring", k8l0Var.j.c(str5), obj);
                    }
                    if (z && (zzbgVar = zzahVar2.w) != null) {
                        l(new zzbg(zzbgVar, zzahVar2.d), zzrVar);
                    }
                }
                lqk0 lqk0Var4 = this.c;
                U(lqk0Var4);
                if (lqk0Var4.d0(zzahVar2)) {
                    a().m.d(zzahVar2.a, "Conditional property added", k8l0Var.j.c(zzahVar2.c.b), zzahVar2.c.G0());
                } else {
                    a().f.d(y4l0.k(zzahVar2.a), Chyeyik.Ras, k8l0Var.j.c(zzahVar2.c.b), zzahVar2.c.G0());
                }
                lqk0 lqk0Var5 = this.c;
                U(lqk0Var5);
                lqk0Var5.T();
            } finally {
                lqk0 lqk0Var6 = this.c;
                U(lqk0Var6);
                lqk0Var6.U();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03d2 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x03d8 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x03f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x03f8 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0410 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0416 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x044a A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0468  */
    /* JADX WARN: Code duplicated, block: B:121:0x046c A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x04a7 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x04c3 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x04d3 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x04e7 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0560 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x05a0 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x05c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0637 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0671 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x067a A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0680  */
    /* JADX WARN: Code duplicated, block: B:177:0x0688 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x068e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0696 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x069c  */
    /* JADX WARN: Code duplicated, block: B:185:0x06a5 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:190:0x06bc A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:195:0x06f7 A[Catch: all -> 0x01e6, TRY_ENTER, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0700 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x0711  */
    /* JADX WARN: Code duplicated, block: B:204:0x071f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0721  */
    /* JADX WARN: Code duplicated, block: B:208:0x0729  */
    /* JADX WARN: Code duplicated, block: B:209:0x072b A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0735  */
    /* JADX WARN: Code duplicated, block: B:212:0x0737  */
    /* JADX WARN: Code duplicated, block: B:215:0x0743  */
    /* JADX WARN: Code duplicated, block: B:216:0x0745  */
    /* JADX WARN: Code duplicated, block: B:219:0x0751  */
    /* JADX WARN: Code duplicated, block: B:220:0x0753  */
    /* JADX WARN: Code duplicated, block: B:223:0x075f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0761  */
    /* JADX WARN: Code duplicated, block: B:227:0x076d  */
    /* JADX WARN: Code duplicated, block: B:228:0x076f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0779  */
    /* JADX WARN: Code duplicated, block: B:232:0x077b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0787  */
    /* JADX WARN: Code duplicated, block: B:236:0x0789  */
    /* JADX WARN: Code duplicated, block: B:238:0x0797  */
    /* JADX WARN: Code duplicated, block: B:241:0x079d A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x07c7 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x07ca A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x07d0 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:271:0x0869 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0879 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x0890 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x094a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0990 A[Catch: all -> 0x0922, TryCatch #1 {all -> 0x0922, blocks: (B:278:0x0892, B:280:0x089d, B:282:0x08ab, B:284:0x08b5, B:287:0x08c9, B:289:0x08d3, B:291:0x08df, B:293:0x08e9, B:295:0x08f7, B:297:0x090f, B:301:0x092a, B:303:0x0938, B:304:0x0941, B:306:0x094d, B:308:0x0990, B:311:0x099b, B:312:0x09a5, B:313:0x09a6, B:315:0x09b0, B:281:0x08a2), top: B:389:0x0892 }] */
    /* JADX WARN: Code duplicated, block: B:310:0x099a  */
    /* JADX WARN: Code duplicated, block: B:311:0x099b A[Catch: all -> 0x0922, TryCatch #1 {all -> 0x0922, blocks: (B:278:0x0892, B:280:0x089d, B:282:0x08ab, B:284:0x08b5, B:287:0x08c9, B:289:0x08d3, B:291:0x08df, B:293:0x08e9, B:295:0x08f7, B:297:0x090f, B:301:0x092a, B:303:0x0938, B:304:0x0941, B:306:0x094d, B:308:0x0990, B:311:0x099b, B:312:0x09a5, B:313:0x09a6, B:315:0x09b0, B:281:0x08a2), top: B:389:0x0892 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x09b0 A[Catch: all -> 0x0922, TRY_LEAVE, TryCatch #1 {all -> 0x0922, blocks: (B:278:0x0892, B:280:0x089d, B:282:0x08ab, B:284:0x08b5, B:287:0x08c9, B:289:0x08d3, B:291:0x08df, B:293:0x08e9, B:295:0x08f7, B:297:0x090f, B:301:0x092a, B:303:0x0938, B:304:0x0941, B:306:0x094d, B:308:0x0990, B:311:0x099b, B:312:0x09a5, B:313:0x09a6, B:315:0x09b0, B:281:0x08a2), top: B:389:0x0892 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x09ce A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:327:0x0a1f A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0a3d A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0a56 A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0aa0 A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x0ab2 A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:343:0x0ac1 A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:346:0x0ae1 A[Catch: all -> 0x09dc, TRY_LEAVE, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:348:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b59 A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:360:0x0b8d A[Catch: all -> 0x09dc, TryCatch #8 {all -> 0x09dc, blocks: (B:317:0x09b7, B:319:0x09ce, B:323:0x09df, B:325:0x0a17, B:327:0x0a1f, B:329:0x0a29, B:330:0x0a33, B:332:0x0a3d, B:333:0x0a47, B:334:0x0a50, B:336:0x0a56, B:338:0x0aa0, B:340:0x0ab2, B:344:0x0ad1, B:346:0x0ae1, B:343:0x0ac1, B:350:0x0af4, B:351:0x0b36, B:352:0x0b41, B:353:0x0b53, B:355:0x0b59, B:364:0x0ba0, B:365:0x0be8, B:367:0x0bf9, B:381:0x0c52, B:372:0x0c0f, B:373:0x0c12, B:358:0x0b67, B:360:0x0b8d, B:378:0x0c29, B:379:0x0c3e, B:380:0x0c3f), top: B:401:0x09b7, inners: #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:367:0x0bf9 A[Catch: all -> 0x09dc, SQLiteException -> 0x0c0b, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x0c0b, blocks: (B:365:0x0be8, B:367:0x0bf9), top: B:403:0x0be8, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:371:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:405:0x04ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0aee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0b67 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0b65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:? A[LOOP:3: B:353:0x0b53->B:421:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x032d A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x036b  */
    /* JADX WARN: Code duplicated, block: B:96:0x036e A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0380 A[Catch: all -> 0x01e6, TryCatch #7 {all -> 0x01e6, blocks: (B:37:0x01c7, B:40:0x01d4, B:42:0x01dc, B:48:0x01ea, B:93:0x035e, B:102:0x0394, B:104:0x03d2, B:106:0x03d8, B:107:0x03ed, B:109:0x03f8, B:111:0x0410, B:113:0x0416, B:114:0x042b, B:117:0x044a, B:121:0x046c, B:122:0x0481, B:123:0x048a, B:126:0x04a7, B:127:0x04bb, B:129:0x04c3, B:131:0x04cd, B:133:0x04d3, B:134:0x04da, B:136:0x04e7, B:138:0x04ef, B:140:0x04f7, B:142:0x04ff, B:143:0x050b, B:144:0x0518, B:146:0x053e, B:155:0x0560, B:156:0x0573, B:158:0x05a0, B:161:0x05ca, B:165:0x0616, B:168:0x0644, B:170:0x0671, B:171:0x0674, B:173:0x067a, B:175:0x0682, B:177:0x0688, B:179:0x0690, B:181:0x0696, B:185:0x06a5, B:188:0x06b3, B:190:0x06bc, B:192:0x06c8, B:195:0x06f7, B:197:0x0700, B:201:0x0715, B:206:0x0722, B:241:0x079d, B:242:0x07a4, B:244:0x07c7, B:247:0x07d0, B:251:0x07dd, B:252:0x07f9, B:254:0x07ff, B:256:0x0819, B:258:0x0825, B:260:0x0832, B:267:0x085f, B:271:0x0869, B:272:0x086c, B:274:0x0879, B:275:0x087c, B:286:0x08c0, B:265:0x084f, B:245:0x07ca, B:209:0x072b, B:213:0x0738, B:217:0x0746, B:221:0x0754, B:225:0x0762, B:229:0x0770, B:233:0x077c, B:237:0x078a, B:167:0x0637, B:152:0x0549, B:96:0x036e, B:97:0x037a, B:99:0x0380, B:101:0x038e, B:56:0x020a, B:59:0x0218, B:61:0x022d, B:67:0x0245, B:72:0x0273, B:74:0x0279, B:76:0x0287, B:78:0x0295, B:81:0x029e, B:89:0x0323, B:91:0x032d, B:83:0x02cb, B:84:0x02e4, B:88:0x0308, B:87:0x02f7, B:70:0x0251, B:71:0x026d), top: B:400:0x01c7, inners: #2, #5 }] */
    public final void l(zzbg zzbgVar, zzr zzrVar) throws Throwable {
        iol0 iol0Var;
        String str;
        String str2;
        String str3;
        long jRound;
        String str4;
        lqk0 lqk0VarG0;
        int iO;
        uol0 uol0Var;
        uol0 uol0Var2;
        ynl0 ynl0Var;
        boolean zF0;
        boolean zEquals;
        Iterator<String> it;
        long length;
        Object objG0;
        String str5;
        wpk0 wpk0VarL0;
        long jIntValue;
        String str6;
        Bundle bundleB1;
        lqk0 lqk0VarG1;
        String str7;
        long jDelete;
        k8l0 k8l0Var;
        isk0 isk0Var;
        String str8;
        msk0 msk0VarE;
        msk0 msk0VarA;
        isk0 isk0Var2;
        l8l0 l8l0VarV;
        String str9;
        String str10;
        String str11;
        long j;
        String str12;
        String str13;
        String str14;
        jbl0 jbl0VarJ;
        boolean zQ;
        hbl0 hbl0Var;
        long j2;
        ubl0 ubl0VarA;
        Map mapB;
        String str15;
        String str16;
        ArrayList arrayList;
        jbl0 jbl0VarJ2;
        k5l0 k5l0VarI0;
        int i;
        List listB0;
        int i2;
        lqk0 lqk0VarG2;
        lqk0 lqk0VarG3;
        isk0 isk0Var3;
        Iterator<String> it2;
        boolean zW;
        int i3;
        String str17;
        ContentValues contentValues;
        String str18;
        pol0 pol0VarJ0;
        long jM;
        k5l0 k5l0VarI1;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long jW;
        wok0 wok0VarE0;
        t2l0 t2l0Var;
        ynl0 ynl0Var2;
        Object obj;
        uol0 uol0VarA0;
        Object obj2;
        long jMax;
        long jIntValue2;
        String str19 = "raw_events";
        hm20.h(zzrVar);
        boolean z9 = zzrVar.C;
        long j4 = zzrVar.F;
        long j5 = zzrVar.f;
        String str20 = zzrVar.H;
        long j6 = zzrVar.e;
        long j7 = zzrVar.y;
        String str21 = zzrVar.J;
        String str22 = zzrVar.c;
        String str23 = zzrVar.d;
        long j8 = j5;
        boolean z10 = zzrVar.v;
        String str24 = zzrVar.a;
        hm20.e(str24);
        long jNanoTime = System.nanoTime();
        b().g();
        l0();
        j0();
        String str25 = zzrVar.b;
        if (TextUtils.isEmpty(str25)) {
            return;
        }
        if (!z10) {
            c0(zzrVar);
            return;
        }
        e7l0 e7l0VarF0 = f0();
        String str26 = zzbgVar.a;
        boolean zV = e7l0VarF0.v(str24, str26);
        k8l0 k8l0Var2 = this.l;
        ynl0 ynl0Var3 = this.J;
        if (zV) {
            a().i.c(y4l0.k(str24), "Dropping blocked event. appId", k8l0Var2.j.a(str26));
            if (!"1".equals(f0().f(str24, "measurement.upload.blacklist_internal")) && !"1".equals(f0().f(str24, "measurement.upload.blacklist_public"))) {
                if ("_err".equals(str26)) {
                    return;
                }
                k0();
                yol0.w(ynl0Var3, str24, 11, "_ev", str26, 0);
                return;
            }
            k5l0 k5l0VarI2 = g0().i0(str24);
            if (k5l0VarI2 != null) {
                k8l0 k8l0Var3 = k5l0VarI2.a;
                p7l0 p7l0Var = k8l0Var3.g;
                k8l0.m(p7l0Var);
                p7l0Var.g();
                long j9 = k5l0VarI2.S;
                p7l0 p7l0Var2 = k8l0Var3.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.g();
                long jMax2 = Math.max(j9, k5l0VarI2.R);
                e().getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jMax2);
                e0();
                if (jAbs > ((Long) v2l0.N.a(null)).longValue()) {
                    a().m.a("Fetching config for blocked app");
                    z(k5l0VarI2);
                    return;
                }
                return;
            }
            return;
        }
        a5l0 a5l0VarA = a5l0.a(zzbgVar);
        yol0 yol0VarK0 = k0();
        wok0 wok0VarE1 = e0();
        wok0VarE1.getClass();
        yol0VarK0.p(a5l0VarA, Math.max(Math.min(wok0VarE1.o(str24, v2l0.X), 100), 25));
        int iMax = Math.max(Math.min(e0().o(str24, v2l0.g0), 35), 10);
        Bundle bundle = a5l0VarA.d;
        Iterator it3 = new TreeSet(bundle.keySet()).iterator();
        while (it3.hasNext()) {
            String str27 = (String) it3.next();
            Iterator it4 = it3;
            if ("items".equals(str27)) {
                k0().q(bundle.getParcelableArray(str27), iMax);
            }
            it3 = it4;
        }
        zzbg zzbgVarB = a5l0VarA.b();
        zzbe zzbeVar = zzbgVarB.b;
        String str28 = zzbgVarB.a;
        if (Log.isLoggable(a().m(), 2)) {
            a().n.b(k8l0Var2.j.d(zzbgVarB), "Logging event");
        }
        g0().S();
        try {
            c0(zzrVar);
            boolean z11 = "ecommerce_purchase".equals(str28) || "purchase".equals(str28) || "refund".equals(str28);
            if (!"_iap".equals(str28)) {
                if (z11) {
                    z11 = true;
                } else {
                    str2 = str23;
                    str3 = "events";
                    str19 = "raw_events";
                    str4 = str24;
                    str = str22;
                }
                ynl0Var = ynl0Var3;
                zF0 = yol0.f0(str28);
                zEquals = "_err".equals(str28);
                k0();
                if (zzbeVar == null) {
                    length = 0;
                } else {
                    it = zzbeVar.a.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objG0 = zzbeVar.G0(it.next());
                        if (objG0 instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objG0).length;
                        }
                    }
                }
                str5 = str4;
                wpk0VarL0 = g0().l0(g(), str5, length + 1, true, zF0, false, zEquals, false, false, false);
                long j10 = wpk0VarL0.b;
                e0();
                jIntValue = j10 - ((long) ((Integer) v2l0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zF0) {
                        long j11 = wpk0VarL0.a;
                        e0();
                        jIntValue2 = j11 - ((long) ((Integer) v2l0.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                a().f.c(y4l0.k(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(wpk0VarL0.a));
                            }
                            k0();
                            yol0.w(ynl0Var, str5, 16, "_ev", zzbgVarB.a, 0);
                            g0().T();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = wpk0VarL0.d - ((long) Math.max(0, Math.min(CashOut.BIG_NUMBER, e0().o(str6, v2l0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                a().f.c(y4l0.k(str6), "Too many error events logged. appId, count", Long.valueOf(wpk0VarL0.d));
                            }
                            g0().T();
                        }
                    }
                    bundleB1 = zzbeVar.b1();
                    yol0 yol0VarK1 = k0();
                    String str29 = zzbgVarB.c;
                    yol0VarK1.v(bundleB1, "_o", str29);
                    if (k0().H(str6, zzrVar.Q)) {
                        k0().v(bundleB1, "_dbg", 1L);
                        k0().v(bundleB1, "_r", 1L);
                    }
                    if ("_s".equals(str28) && (uol0VarA0 = g0().a0(str6, "_sno")) != null) {
                        obj2 = uol0VarA0.e;
                        if (obj2 instanceof Long) {
                            k0().v(bundleB1, "_sno", obj2);
                        }
                    }
                    if (e0().q(null, v2l0.X0) && Objects.equals(str29, "am") && str28.equals("_ai")) {
                        obj = bundleB1.get("value");
                        if (obj instanceof String) {
                            try {
                                double d = Double.parseDouble((String) obj);
                                bundleB1.remove("value");
                                bundleB1.putDouble("value", d);
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    lqk0VarG1 = g0();
                    hm20.e(str6);
                    lqk0VarG1.g();
                    lqk0VarG1.h();
                    try {
                        str7 = str19;
                        try {
                            jDelete = lqk0VarG1.V().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(CashOut.BIG_NUMBER, lqk0VarG1.a.d.o(str6, v2l0.q))))});
                        } catch (SQLiteException e) {
                            e = e;
                            lqk0VarG1.a.a().f.c(y4l0.k(str6), "Error deleting over the limit events. appId", e);
                            jDelete = 0;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        str7 = str19;
                    }
                    if (jDelete > 0) {
                        a().i.c(y4l0.k(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                    }
                    k8l0Var = this.l;
                    isk0Var = new isk0(k8l0Var, zzbgVarB.c, str6, zzbgVarB.a, zzbgVarB.d, 0L, bundleB1);
                    lqk0 lqk0VarG4 = g0();
                    str8 = isk0Var.b;
                    String str30 = str3;
                    msk0VarE = lqk0VarG4.E(str30, str6, str8);
                    if (msk0VarE == null) {
                        jW = g0().w(str6);
                        wok0VarE0 = e0();
                        wok0VarE0.getClass();
                        t2l0Var = v2l0.W;
                        ynl0Var2 = ynl0Var;
                        if (jW >= Math.max(Math.min(wok0VarE0.o(str6, t2l0Var), 2000), 500) || !zF0) {
                            ynl0Var = ynl0Var2;
                            msk0VarA = new msk0(str6, str8, 0L, 0L, 0L, isk0Var.d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            u4l0 u4l0Var = a().f;
                            w4l0 w4l0VarK = y4l0.k(str6);
                            String strA = k8l0Var.j.a(str8);
                            wok0 wok0VarE2 = e0();
                            wok0VarE2.getClass();
                            u4l0Var.d(w4l0VarK, "Too many event names used, ignoring event. appId, name, supported count", strA, Integer.valueOf(Math.max(Math.min(wok0VarE2.o(str6, t2l0Var), 2000), 500)));
                            k0();
                            yol0.w(ynl0Var2, str6, 8, null, null, 0);
                        }
                    } else {
                        isk0Var = isk0Var.a(k8l0Var, msk0VarE.f);
                        msk0VarA = msk0VarE.a(isk0Var.d);
                    }
                    isk0Var2 = isk0Var;
                    g0().F(str30, msk0VarA);
                    b().g();
                    l0();
                    String str31 = isk0Var2.a;
                    hm20.e(str31);
                    hm20.b(str31.equals(str6));
                    l8l0VarV = n8l0.V();
                    l8l0VarV.C();
                    l8l0VarV.n();
                    if (!TextUtils.isEmpty(str6)) {
                        l8l0VarV.t(str6);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                    } else {
                        str9 = str2;
                        l8l0VarV.r(str9);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                    } else {
                        str10 = str;
                        l8l0VarV.u(str10);
                    }
                    if (TextUtils.isEmpty(str21)) {
                        str11 = str21;
                    } else {
                        str11 = str21;
                        l8l0VarV.W(str11);
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        l8l0VarV.Q((int) j);
                    } else {
                        j = j7;
                    }
                    str12 = str11;
                    l8l0VarV.v(j6);
                    if (TextUtils.isEmpty(str25)) {
                        str13 = str25;
                    } else {
                        str13 = str25;
                        l8l0VarV.M(str13);
                    }
                    hm20.h(str6);
                    str14 = str9;
                    jbl0VarJ = f(str6).j(jbl0.c(100, str20));
                    l8l0VarV.V(jbl0VarJ.f());
                    kql0.a();
                    zQ = e0().q(str6, v2l0.P0);
                    hbl0Var = hbl0.AD_STORAGE;
                    if (zQ) {
                        k0();
                        if (yol0.D(str6)) {
                            l8l0VarV.D(zzrVar.O);
                            j2 = j;
                            j3 = zzrVar.P;
                            if (!jbl0VarJ.i(hbl0Var) && j3 != 0) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            l8l0VarV.Y(z);
                            if (j3 != 0) {
                                c6l0 c6l0VarX = e6l0.x();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c6l0VarX.l(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                c6l0VarX.m(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c6l0VarX.n(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                c6l0VarX.o(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                c6l0VarX.p(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                c6l0VarX.q(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                c6l0VarX.r(z8);
                                l8l0VarV.E((e6l0) c6l0VarX.i());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        l8l0VarV.A(j8);
                        j8 = j8;
                    }
                    l8l0VarV.T(j4);
                    pol0 pol0VarJ1 = j0();
                    ubl0VarA = ubl0.a(pol0VarJ1.b.l.d().getContentResolver(), wcl0.a(), n2l0.a);
                    if (ubl0VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = ubl0VarA.b();
                    }
                    if (mapB == null && !mapB.isEmpty()) {
                        arrayList = new ArrayList();
                        str15 = str10;
                        int iIntValue = ((Integer) v2l0.f0.a(null)).intValue();
                        Iterator it5 = mapB.entrySet().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                str16 = str13;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it5.next();
                            Iterator it6 = it5;
                            str16 = str13;
                            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                try {
                                    int i4 = Integer.parseInt((String) entry.getValue());
                                    if (i4 != 0) {
                                        arrayList.add(Integer.valueOf(i4));
                                        if (arrayList.size() >= iIntValue) {
                                            pol0VarJ1.a.a().i.b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                            break;
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                } catch (NumberFormatException e3) {
                                    pol0VarJ1.a.a().i.b(e3, "Experiment ID NumberFormatException");
                                }
                            }
                            it5 = it6;
                            str13 = str16;
                        }
                        if (!arrayList.isEmpty()) {
                            if (arrayList != null) {
                                l8l0VarV.S(arrayList);
                            }
                            if (e0().q(null, v2l0.a1)) {
                                l8l0VarV.I();
                            }
                            jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                            if (jbl0VarJ2.i(hbl0Var) || !z9) {
                                k8l0Var2 = k8l0Var2;
                                isk0Var2 = isk0Var2;
                            } else {
                                try {
                                    mkl0 mkl0Var = this.i;
                                    mkl0Var.getClass();
                                    Pair pairK = jbl0VarJ2.i(hbl0Var) ? mkl0Var.k(str6) : new Pair("", Boolean.FALSE);
                                    if (TextUtils.isEmpty((CharSequence) pairK.first)) {
                                        k8l0Var2 = k8l0Var2;
                                        isk0Var2 = isk0Var2;
                                    } else {
                                        l8l0VarV.x((String) pairK.first);
                                        Object obj3 = pairK.second;
                                        if (obj3 != null) {
                                            l8l0VarV.y(((Boolean) obj3).booleanValue());
                                        }
                                        if (isk0Var2.b.equals("_fx") || ((String) pairK.first).equals("00000000-0000-0000-0000-000000000000") || (k5l0VarI1 = g0().i0(str6)) == null) {
                                            k8l0Var2 = k8l0Var2;
                                            isk0Var2 = isk0Var2;
                                        } else {
                                            p7l0 p7l0Var3 = k5l0VarI1.a.g;
                                            k8l0.m(p7l0Var3);
                                            p7l0Var3.g();
                                            if (k5l0VarI1.y) {
                                                u(str6, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                p7l0 p7l0Var4 = k5l0VarI1.a.g;
                                                k8l0.m(p7l0Var4);
                                                p7l0Var4.g();
                                                Long l = k5l0VarI1.z;
                                                if (l != null) {
                                                    bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                }
                                                p7l0 p7l0Var5 = k5l0VarI1.a.g;
                                                k8l0.m(p7l0Var5);
                                                p7l0Var5.g();
                                                Long l2 = k5l0VarI1.A;
                                                if (l2 != null) {
                                                    bundle2.putLong("_uwa", l2.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                ynl0Var.a(str6, "_fx", bundle2);
                                            } else {
                                                k8l0Var2 = k8l0Var2;
                                                isk0Var2 = isk0Var2;
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    iol0Var = this;
                                }
                            }
                            k8l0Var2.p().i();
                            String str32 = Build.MODEL;
                            l8l0VarV.o();
                            k8l0Var2.p().i();
                            String str33 = Build.VERSION.RELEASE;
                            l8l0VarV.g();
                            ((n8l0) l8l0VarV.b).p0(str33);
                            l8l0VarV.q((int) k8l0Var2.p().k());
                            l8l0VarV.p(k8l0Var2.p().l());
                            l8l0VarV.X(zzrVar.L);
                            if (k8l0Var2.f()) {
                                l8l0VarV.s();
                                if (!TextUtils.isEmpty(null)) {
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).S0(null);
                                    throw null;
                                }
                            }
                            k5l0VarI0 = g0().i0(str6);
                            if (k5l0VarI0 == null) {
                                k5l0VarI0 = new k5l0(k8l0Var2, str6);
                                iol0Var = this;
                                try {
                                    k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                                    k5l0VarI0.K(zzrVar.z);
                                    k5l0VarI0.H(str16);
                                    if (jbl0VarJ2.i(hbl0Var)) {
                                        k5l0VarI0.I(iol0Var.i.l(str6, z9));
                                    }
                                    k5l0VarI0.e(0L);
                                    k5l0VarI0.L(0L);
                                    k5l0VarI0.M(0L);
                                    k5l0VarI0.O(str15);
                                    k5l0VarI0.Q(j2);
                                    k5l0VarI0.R(str14);
                                    k5l0VarI0.S(j6);
                                    k5l0VarI0.a(j8);
                                    k5l0VarI0.d(z10);
                                    k5l0VarI0.c(j4);
                                    i = 0;
                                    iol0Var.g0().j0(k5l0VarI0, false);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                i = 0;
                                iol0Var = this;
                            }
                            if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE) && !TextUtils.isEmpty(k5l0VarI0.E())) {
                                String strE = k5l0VarI0.E();
                                hm20.h(strE);
                                l8l0VarV.z(strE);
                            }
                            if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                                String strJ = k5l0VarI0.J();
                                hm20.h(strJ);
                                l8l0VarV.P(strJ);
                            }
                            listB0 = iol0Var.g0().b0(str6);
                            i2 = i;
                            while (i2 < listB0.size()) {
                                q9l0 q9l0VarB = s9l0.B();
                                String str34 = ((uol0) listB0.get(i2)).c;
                                q9l0VarB.g();
                                ((s9l0) q9l0VarB.b).D(str34);
                                long j12 = ((uol0) listB0.get(i2)).d;
                                q9l0VarB.g();
                                ((s9l0) q9l0VarB.b).C(j12);
                                iol0Var.j0().A(q9l0VarB, ((uol0) listB0.get(i2)).e);
                                l8l0VarV.e0(q9l0VarB);
                                if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                    p7l0 p7l0Var6 = k5l0VarI0.a.g;
                                    k8l0.m(p7l0Var6);
                                    p7l0Var6.g();
                                    if (k5l0VarI0.w != 0) {
                                        pol0VarJ0 = iol0Var.j0();
                                        if (TextUtils.isEmpty(str12)) {
                                            str18 = str12;
                                            jM = 0;
                                        } else {
                                            str18 = str12;
                                            jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                        }
                                        p7l0 p7l0Var7 = k5l0VarI0.a.g;
                                        k8l0.m(p7l0Var7);
                                        p7l0Var7.g();
                                        if (jM != k5l0VarI0.w) {
                                            l8l0VarV.g();
                                            ((n8l0) l8l0VarV.b).a1();
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                } else {
                                    str18 = str12;
                                }
                                i2++;
                                str12 = str18;
                            }
                            try {
                                lqk0VarG2 = iol0Var.g0();
                                n8l0 n8l0Var = (n8l0) l8l0VarV.i();
                                lqk0VarG2.g();
                                lqk0VarG2.h();
                                hm20.e(n8l0Var.q());
                                byte[] bArrE = n8l0Var.e();
                                long jM2 = lqk0VarG2.b.j0().M(bArrE);
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put(PublisherMetadata.APP_ID, n8l0Var.q());
                                contentValues2.put("metadata_fingerprint", Long.valueOf(jM2));
                                contentValues2.put("metadata", bArrE);
                                try {
                                    lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                    lqk0VarG3 = iol0Var.g0();
                                    isk0Var3 = isk0Var2;
                                    it2 = isk0Var3.f.a.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            e7l0 e7l0VarF1 = iol0Var.f0();
                                            String str35 = isk0Var3.a;
                                            zW = e7l0VarF1.w(str35, isk0Var3.b);
                                            wpk0 wpk0VarK0 = iol0Var.g0().k0(iol0Var.g(), str35, false, false, false, false);
                                            if (zW || wpk0VarK0.e >= iol0Var.e0().o(str35, v2l0.p)) {
                                                i3 = i;
                                                break;
                                            }
                                        } else if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    lqk0VarG3.g();
                                    lqk0VarG3.h();
                                    str17 = isk0Var3.a;
                                    hm20.e(str17);
                                    byte[] bArrE2 = lqk0VarG3.b.j0().D(isk0Var3).e();
                                    contentValues = new ContentValues();
                                    contentValues.put(PublisherMetadata.APP_ID, str17);
                                    contentValues.put("name", isk0Var3.b);
                                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jM2));
                                    contentValues.put("data", bArrE2);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    try {
                                        if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                                            lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                                        } else {
                                            iol0Var.o = 0L;
                                        }
                                    } catch (SQLiteException e4) {
                                        lqk0VarG3.a.a().f.c(y4l0.k(isk0Var3.a), "Error storing raw event. appId", e4);
                                    }
                                } catch (SQLiteException e5) {
                                    lqk0VarG2.a.a().f.c(y4l0.k(n8l0Var.q()), "Error storing raw event metadata. appId", e5);
                                    throw e5;
                                }
                            } catch (IOException e6) {
                                iol0Var.a().f.c(y4l0.k(l8l0VarV.s()), "Data loss. Failed to insert raw event metadata. appId", e6);
                            }
                            iol0Var.g0().T();
                            iol0Var.g0().U();
                            iol0Var.N();
                            iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        iol0Var.g0().U();
                        throw th;
                    }
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                    if (arrayList != null) {
                        l8l0VarV.S(arrayList);
                    }
                    if (e0().q(null, v2l0.a1)) {
                        l8l0VarV.I();
                    }
                    jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                    if (jbl0VarJ2.i(hbl0Var)) {
                        k8l0Var2 = k8l0Var2;
                        isk0Var2 = isk0Var2;
                        k8l0Var2.p().i();
                        String str36 = Build.MODEL;
                        l8l0VarV.o();
                        k8l0Var2.p().i();
                        String str37 = Build.VERSION.RELEASE;
                        l8l0VarV.g();
                        ((n8l0) l8l0VarV.b).p0(str37);
                        l8l0VarV.q((int) k8l0Var2.p().k());
                        l8l0VarV.p(k8l0Var2.p().l());
                        l8l0VarV.X(zzrVar.L);
                        if (k8l0Var2.f()) {
                            l8l0VarV.s();
                            if (!TextUtils.isEmpty(null)) {
                                l8l0VarV.g();
                                ((n8l0) l8l0VarV.b).S0(null);
                                throw null;
                            }
                        }
                        k5l0VarI0 = g0().i0(str6);
                        if (k5l0VarI0 == null) {
                            k5l0VarI0 = new k5l0(k8l0Var2, str6);
                            iol0Var = this;
                            k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                            k5l0VarI0.K(zzrVar.z);
                            k5l0VarI0.H(str16);
                            if (jbl0VarJ2.i(hbl0Var)) {
                                k5l0VarI0.I(iol0Var.i.l(str6, z9));
                            }
                            k5l0VarI0.e(0L);
                            k5l0VarI0.L(0L);
                            k5l0VarI0.M(0L);
                            k5l0VarI0.O(str15);
                            k5l0VarI0.Q(j2);
                            k5l0VarI0.R(str14);
                            k5l0VarI0.S(j6);
                            k5l0VarI0.a(j8);
                            k5l0VarI0.d(z10);
                            k5l0VarI0.c(j4);
                            i = 0;
                            iol0Var.g0().j0(k5l0VarI0, false);
                        } else {
                            i = 0;
                            iol0Var = this;
                        }
                        if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                            String strE2 = k5l0VarI0.E();
                            hm20.h(strE2);
                            l8l0VarV.z(strE2);
                        }
                        if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                            String strJ2 = k5l0VarI0.J();
                            hm20.h(strJ2);
                            l8l0VarV.P(strJ2);
                        }
                        listB0 = iol0Var.g0().b0(str6);
                        i2 = i;
                        while (i2 < listB0.size()) {
                            q9l0 q9l0VarB2 = s9l0.B();
                            String str38 = ((uol0) listB0.get(i2)).c;
                            q9l0VarB2.g();
                            ((s9l0) q9l0VarB2.b).D(str38);
                            long j13 = ((uol0) listB0.get(i2)).d;
                            q9l0VarB2.g();
                            ((s9l0) q9l0VarB2.b).C(j13);
                            iol0Var.j0().A(q9l0VarB2, ((uol0) listB0.get(i2)).e);
                            l8l0VarV.e0(q9l0VarB2);
                            if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                p7l0 p7l0Var8 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var8);
                                p7l0Var8.g();
                                if (k5l0VarI0.w != 0) {
                                    pol0VarJ0 = iol0Var.j0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM = 0;
                                    } else {
                                        str18 = str12;
                                        jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p7l0 p7l0Var9 = k5l0VarI0.a.g;
                                    k8l0.m(p7l0Var9);
                                    p7l0Var9.g();
                                    if (jM != k5l0VarI0.w) {
                                        l8l0VarV.g();
                                        ((n8l0) l8l0VarV.b).a1();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        lqk0VarG2 = iol0Var.g0();
                        n8l0 n8l0Var2 = (n8l0) l8l0VarV.i();
                        lqk0VarG2.g();
                        lqk0VarG2.h();
                        hm20.e(n8l0Var2.q());
                        byte[] bArrE3 = n8l0Var2.e();
                        long jM3 = lqk0VarG2.b.j0().M(bArrE3);
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(PublisherMetadata.APP_ID, n8l0Var2.q());
                        contentValues3.put("metadata_fingerprint", Long.valueOf(jM3));
                        contentValues3.put("metadata", bArrE3);
                        lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                        lqk0VarG3 = iol0Var.g0();
                        isk0Var3 = isk0Var2;
                        it2 = isk0Var3.f.a.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                e7l0 e7l0VarF2 = iol0Var.f0();
                                String str39 = isk0Var3.a;
                                zW = e7l0VarF2.w(str39, isk0Var3.b);
                                wpk0 wpk0VarK1 = iol0Var.g0().k0(iol0Var.g(), str39, false, false, false, false);
                                if (zW) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        lqk0VarG3.g();
                        lqk0VarG3.h();
                        str17 = isk0Var3.a;
                        hm20.e(str17);
                        byte[] bArrE4 = lqk0VarG3.b.j0().D(isk0Var3).e();
                        contentValues = new ContentValues();
                        contentValues.put(PublisherMetadata.APP_ID, str17);
                        contentValues.put("name", isk0Var3.b);
                        contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM3));
                        contentValues.put("data", bArrE4);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                            lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            iol0Var.o = 0L;
                        }
                        iol0Var.g0().T();
                        iol0Var.g0().U();
                        iol0Var.N();
                        iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    k8l0Var2 = k8l0Var2;
                    isk0Var2 = isk0Var2;
                    k8l0Var2.p().i();
                    String str310 = Build.MODEL;
                    l8l0VarV.o();
                    k8l0Var2.p().i();
                    String str311 = Build.VERSION.RELEASE;
                    l8l0VarV.g();
                    ((n8l0) l8l0VarV.b).p0(str311);
                    l8l0VarV.q((int) k8l0Var2.p().k());
                    l8l0VarV.p(k8l0Var2.p().l());
                    l8l0VarV.X(zzrVar.L);
                    if (k8l0Var2.f()) {
                        l8l0VarV.s();
                        if (!TextUtils.isEmpty(null)) {
                            l8l0VarV.g();
                            ((n8l0) l8l0VarV.b).S0(null);
                            throw null;
                        }
                    }
                    k5l0VarI0 = g0().i0(str6);
                    if (k5l0VarI0 == null) {
                        k5l0VarI0 = new k5l0(k8l0Var2, str6);
                        iol0Var = this;
                        k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                        k5l0VarI0.K(zzrVar.z);
                        k5l0VarI0.H(str16);
                        if (jbl0VarJ2.i(hbl0Var)) {
                            k5l0VarI0.I(iol0Var.i.l(str6, z9));
                        }
                        k5l0VarI0.e(0L);
                        k5l0VarI0.L(0L);
                        k5l0VarI0.M(0L);
                        k5l0VarI0.O(str15);
                        k5l0VarI0.Q(j2);
                        k5l0VarI0.R(str14);
                        k5l0VarI0.S(j6);
                        k5l0VarI0.a(j8);
                        k5l0VarI0.d(z10);
                        k5l0VarI0.c(j4);
                        i = 0;
                        iol0Var.g0().j0(k5l0VarI0, false);
                    } else {
                        i = 0;
                        iol0Var = this;
                    }
                    if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                        String strE3 = k5l0VarI0.E();
                        hm20.h(strE3);
                        l8l0VarV.z(strE3);
                    }
                    if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                        String strJ3 = k5l0VarI0.J();
                        hm20.h(strJ3);
                        l8l0VarV.P(strJ3);
                    }
                    listB0 = iol0Var.g0().b0(str6);
                    i2 = i;
                    while (i2 < listB0.size()) {
                        q9l0 q9l0VarB3 = s9l0.B();
                        String str312 = ((uol0) listB0.get(i2)).c;
                        q9l0VarB3.g();
                        ((s9l0) q9l0VarB3.b).D(str312);
                        long j14 = ((uol0) listB0.get(i2)).d;
                        q9l0VarB3.g();
                        ((s9l0) q9l0VarB3.b).C(j14);
                        iol0Var.j0().A(q9l0VarB3, ((uol0) listB0.get(i2)).e);
                        l8l0VarV.e0(q9l0VarB3);
                        if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                            p7l0 p7l0Var10 = k5l0VarI0.a.g;
                            k8l0.m(p7l0Var10);
                            p7l0Var10.g();
                            if (k5l0VarI0.w != 0) {
                                pol0VarJ0 = iol0Var.j0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM = 0;
                                } else {
                                    str18 = str12;
                                    jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                p7l0 p7l0Var11 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var11);
                                p7l0Var11.g();
                                if (jM != k5l0VarI0.w) {
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).a1();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    lqk0VarG2 = iol0Var.g0();
                    n8l0 n8l0Var3 = (n8l0) l8l0VarV.i();
                    lqk0VarG2.g();
                    lqk0VarG2.h();
                    hm20.e(n8l0Var3.q());
                    byte[] bArrE5 = n8l0Var3.e();
                    long jM4 = lqk0VarG2.b.j0().M(bArrE5);
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put(PublisherMetadata.APP_ID, n8l0Var3.q());
                    contentValues4.put("metadata_fingerprint", Long.valueOf(jM4));
                    contentValues4.put("metadata", bArrE5);
                    lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues4, 4);
                    lqk0VarG3 = iol0Var.g0();
                    isk0Var3 = isk0Var2;
                    it2 = isk0Var3.f.a.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            e7l0 e7l0VarF3 = iol0Var.f0();
                            String str313 = isk0Var3.a;
                            zW = e7l0VarF3.w(str313, isk0Var3.b);
                            wpk0 wpk0VarK2 = iol0Var.g0().k0(iol0Var.g(), str313, false, false, false, false);
                            if (zW) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    lqk0VarG3.g();
                    lqk0VarG3.h();
                    str17 = isk0Var3.a;
                    hm20.e(str17);
                    byte[] bArrE6 = lqk0VarG3.b.j0().D(isk0Var3).e();
                    contentValues = new ContentValues();
                    contentValues.put(PublisherMetadata.APP_ID, str17);
                    contentValues.put("name", isk0Var3.b);
                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM4));
                    contentValues.put("data", bArrE6);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                        lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        iol0Var.o = 0L;
                    }
                    iol0Var.g0().T();
                    iol0Var.g0().U();
                    iol0Var.N();
                    iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    iol0Var.g0().U();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    a().f.c(y4l0.k(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(wpk0VarL0.b));
                }
                g0().T();
                g0().U();
            }
            str = str22;
            str2 = str23;
            String strO0 = zzbeVar.O0();
            str3 = "events";
            Bundle bundle3 = zzbeVar.a;
            if (z11) {
                double dDoubleValue = zzbeVar.K0().doubleValue() * 1000000.0d;
                if (dDoubleValue == 0.0d) {
                    dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                }
                if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                    a().i.c(y4l0.k(str24), "Data lost. Currency value is too big. appId", Double.valueOf(dDoubleValue));
                    g0().T();
                } else {
                    jRound = Math.round(dDoubleValue);
                    if ("refund".equals(str28)) {
                        jRound = -jRound;
                    }
                }
                g0().U();
            }
            str19 = "raw_events";
            jRound = bundle3.getLong("value");
            if (!TextUtils.isEmpty(strO0)) {
                String upperCase = strO0.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String strConcat = "_ltv_".concat(upperCase);
                    uol0 uol0VarA1 = g0().a0(str24, strConcat);
                    try {
                        if (uol0VarA1 != null) {
                            Object obj4 = uol0VarA1.e;
                            if (obj4 instanceof Long) {
                                long jLongValue = ((Long) obj4).longValue();
                                String str40 = zzbgVarB.c;
                                e().getClass();
                                uol0Var = new uol0(str24, str40, strConcat, System.currentTimeMillis(), Long.valueOf(jLongValue + jRound));
                                str4 = str24;
                            }
                            uol0Var2 = uol0Var;
                            if (!g0().Z(uol0Var2)) {
                                a().f.d(y4l0.k(str4), qUnCRF.IiF, k8l0Var2.j.c(uol0Var2.c), uol0Var2.e);
                                k0();
                                yol0.w(ynl0Var3, str4, 9, null, null, 0);
                                ynl0Var = ynl0Var3;
                            }
                            zF0 = yol0.f0(str28);
                            zEquals = "_err".equals(str28);
                            k0();
                            if (zzbeVar == null) {
                                length = 0;
                            } else {
                                it = zzbeVar.a.keySet().iterator();
                                length = 0;
                                while (it.hasNext()) {
                                    objG0 = zzbeVar.G0(it.next());
                                    if (objG0 instanceof Parcelable[]) {
                                        length += (long) ((Parcelable[]) objG0).length;
                                    }
                                }
                            }
                            str5 = str4;
                            wpk0VarL0 = g0().l0(g(), str5, length + 1, true, zF0, false, zEquals, false, false, false);
                            long j15 = wpk0VarL0.b;
                            e0();
                            jIntValue = j15 - ((long) ((Integer) v2l0.l.a(null)).intValue());
                            if (jIntValue <= 0) {
                                if (zF0) {
                                    long j16 = wpk0VarL0.a;
                                    e0();
                                    jIntValue2 = j16 - ((long) ((Integer) v2l0.n.a(null)).intValue());
                                    if (jIntValue2 > 0) {
                                        if (jIntValue2 % 1000 == 1) {
                                            a().f.c(y4l0.k(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(wpk0VarL0.a));
                                        }
                                        k0();
                                        yol0.w(ynl0Var, str5, 16, "_ev", zzbgVarB.a, 0);
                                        g0().T();
                                    }
                                }
                                str6 = str5;
                                if (zEquals) {
                                    jMax = wpk0VarL0.d - ((long) Math.max(0, Math.min(CashOut.BIG_NUMBER, e0().o(str6, v2l0.m))));
                                    if (jMax > 0) {
                                        if (jMax == 1) {
                                            a().f.c(y4l0.k(str6), "Too many error events logged. appId, count", Long.valueOf(wpk0VarL0.d));
                                        }
                                        g0().T();
                                    }
                                }
                                bundleB1 = zzbeVar.b1();
                                yol0 yol0VarK2 = k0();
                                String str210 = zzbgVarB.c;
                                yol0VarK2.v(bundleB1, "_o", str210);
                                if (k0().H(str6, zzrVar.Q)) {
                                    k0().v(bundleB1, "_dbg", 1L);
                                    k0().v(bundleB1, "_r", 1L);
                                }
                                if ("_s".equals(str28)) {
                                    obj2 = uol0VarA0.e;
                                    if (obj2 instanceof Long) {
                                        k0().v(bundleB1, "_sno", obj2);
                                    }
                                }
                                if (e0().q(null, v2l0.X0)) {
                                    obj = bundleB1.get("value");
                                    if (obj instanceof String) {
                                        double d2 = Double.parseDouble((String) obj);
                                        bundleB1.remove("value");
                                        bundleB1.putDouble("value", d2);
                                    }
                                }
                                lqk0VarG1 = g0();
                                hm20.e(str6);
                                lqk0VarG1.g();
                                lqk0VarG1.h();
                                str7 = str19;
                                jDelete = lqk0VarG1.V().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(CashOut.BIG_NUMBER, lqk0VarG1.a.d.o(str6, v2l0.q))))});
                                if (jDelete > 0) {
                                    a().i.c(y4l0.k(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                }
                                k8l0Var = this.l;
                                isk0Var = new isk0(k8l0Var, zzbgVarB.c, str6, zzbgVarB.a, zzbgVarB.d, 0L, bundleB1);
                                lqk0 lqk0VarG5 = g0();
                                str8 = isk0Var.b;
                                String str314 = str3;
                                msk0VarE = lqk0VarG5.E(str314, str6, str8);
                                if (msk0VarE == null) {
                                    jW = g0().w(str6);
                                    wok0VarE0 = e0();
                                    wok0VarE0.getClass();
                                    t2l0Var = v2l0.W;
                                    ynl0Var2 = ynl0Var;
                                    if (jW >= Math.max(Math.min(wok0VarE0.o(str6, t2l0Var), 2000), 500)) {
                                    }
                                    ynl0Var = ynl0Var2;
                                    msk0VarA = new msk0(str6, str8, 0L, 0L, 0L, isk0Var.d, 0L, null, null, null, null);
                                    str6 = str6;
                                } else {
                                    isk0Var = isk0Var.a(k8l0Var, msk0VarE.f);
                                    msk0VarA = msk0VarE.a(isk0Var.d);
                                }
                                isk0Var2 = isk0Var;
                                g0().F(str314, msk0VarA);
                                b().g();
                                l0();
                                String str315 = isk0Var2.a;
                                hm20.e(str315);
                                hm20.b(str315.equals(str6));
                                l8l0VarV = n8l0.V();
                                l8l0VarV.C();
                                l8l0VarV.n();
                                if (!TextUtils.isEmpty(str6)) {
                                    l8l0VarV.t(str6);
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str9 = str2;
                                    l8l0VarV.r(str9);
                                } else {
                                    str9 = str2;
                                }
                                if (TextUtils.isEmpty(str)) {
                                    str10 = str;
                                    l8l0VarV.u(str10);
                                } else {
                                    str10 = str;
                                }
                                if (TextUtils.isEmpty(str21)) {
                                    str11 = str21;
                                    l8l0VarV.W(str11);
                                } else {
                                    str11 = str21;
                                }
                                if (j7 != -2147483648L) {
                                    j = j7;
                                    l8l0VarV.Q((int) j);
                                } else {
                                    j = j7;
                                }
                                str12 = str11;
                                l8l0VarV.v(j6);
                                if (TextUtils.isEmpty(str25)) {
                                    str13 = str25;
                                    l8l0VarV.M(str13);
                                } else {
                                    str13 = str25;
                                }
                                hm20.h(str6);
                                str14 = str9;
                                jbl0VarJ = f(str6).j(jbl0.c(100, str20));
                                l8l0VarV.V(jbl0VarJ.f());
                                kql0.a();
                                zQ = e0().q(str6, v2l0.P0);
                                hbl0Var = hbl0.AD_STORAGE;
                                if (zQ) {
                                    k0();
                                    if (yol0.D(str6)) {
                                        l8l0VarV.D(zzrVar.O);
                                        j2 = j;
                                        j3 = zzrVar.P;
                                        if (!jbl0VarJ.i(hbl0Var)) {
                                            j3 = (j3 & (-2)) | 32;
                                        }
                                        if (j3 == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        l8l0VarV.Y(z);
                                        if (j3 != 0) {
                                            c6l0 c6l0VarX2 = e6l0.x();
                                            if ((j3 & 1) != 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            c6l0VarX2.l(z2);
                                            if ((j3 & 2) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            c6l0VarX2.m(z3);
                                            if ((j3 & 4) != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c6l0VarX2.n(z4);
                                            if ((j3 & 8) != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            c6l0VarX2.o(z5);
                                            if ((j3 & 16) != 0) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            c6l0VarX2.p(z6);
                                            if ((j3 & 32) != 0) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            c6l0VarX2.q(z7);
                                            if ((j3 & 64) != 0) {
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            c6l0VarX2.r(z8);
                                            l8l0VarV.E((e6l0) c6l0VarX2.i());
                                        }
                                    } else {
                                        j2 = j;
                                    }
                                } else {
                                    j2 = j;
                                }
                                if (j8 != 0) {
                                    l8l0VarV.A(j8);
                                    j8 = j8;
                                }
                                l8l0VarV.T(j4);
                                pol0 pol0VarJ2 = j0();
                                ubl0VarA = ubl0.a(pol0VarJ2.b.l.d().getContentResolver(), wcl0.a(), n2l0.a);
                                if (ubl0VarA == null) {
                                    mapB = Collections.EMPTY_MAP;
                                } else {
                                    mapB = ubl0VarA.b();
                                }
                                if (mapB == null) {
                                    str15 = str10;
                                    str16 = str13;
                                    arrayList = null;
                                } else {
                                    str15 = str10;
                                    str16 = str13;
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    l8l0VarV.S(arrayList);
                                }
                                if (e0().q(null, v2l0.a1)) {
                                    l8l0VarV.I();
                                }
                                jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                                if (jbl0VarJ2.i(hbl0Var)) {
                                    k8l0Var2 = k8l0Var2;
                                    isk0Var2 = isk0Var2;
                                    k8l0Var2.p().i();
                                    String str316 = Build.MODEL;
                                    l8l0VarV.o();
                                    k8l0Var2.p().i();
                                    String str317 = Build.VERSION.RELEASE;
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).p0(str317);
                                    l8l0VarV.q((int) k8l0Var2.p().k());
                                    l8l0VarV.p(k8l0Var2.p().l());
                                    l8l0VarV.X(zzrVar.L);
                                    if (k8l0Var2.f()) {
                                        l8l0VarV.s();
                                        if (!TextUtils.isEmpty(null)) {
                                            l8l0VarV.g();
                                            ((n8l0) l8l0VarV.b).S0(null);
                                            throw null;
                                        }
                                    }
                                    k5l0VarI0 = g0().i0(str6);
                                    if (k5l0VarI0 == null) {
                                        k5l0VarI0 = new k5l0(k8l0Var2, str6);
                                        iol0Var = this;
                                        k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                                        k5l0VarI0.K(zzrVar.z);
                                        k5l0VarI0.H(str16);
                                        if (jbl0VarJ2.i(hbl0Var)) {
                                            k5l0VarI0.I(iol0Var.i.l(str6, z9));
                                        }
                                        k5l0VarI0.e(0L);
                                        k5l0VarI0.L(0L);
                                        k5l0VarI0.M(0L);
                                        k5l0VarI0.O(str15);
                                        k5l0VarI0.Q(j2);
                                        k5l0VarI0.R(str14);
                                        k5l0VarI0.S(j6);
                                        k5l0VarI0.a(j8);
                                        k5l0VarI0.d(z10);
                                        k5l0VarI0.c(j4);
                                        i = 0;
                                        iol0Var.g0().j0(k5l0VarI0, false);
                                    } else {
                                        i = 0;
                                        iol0Var = this;
                                    }
                                    if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                                        String strE4 = k5l0VarI0.E();
                                        hm20.h(strE4);
                                        l8l0VarV.z(strE4);
                                    }
                                    if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                                        String strJ4 = k5l0VarI0.J();
                                        hm20.h(strJ4);
                                        l8l0VarV.P(strJ4);
                                    }
                                    listB0 = iol0Var.g0().b0(str6);
                                    i2 = i;
                                    while (i2 < listB0.size()) {
                                        q9l0 q9l0VarB4 = s9l0.B();
                                        String str318 = ((uol0) listB0.get(i2)).c;
                                        q9l0VarB4.g();
                                        ((s9l0) q9l0VarB4.b).D(str318);
                                        long j17 = ((uol0) listB0.get(i2)).d;
                                        q9l0VarB4.g();
                                        ((s9l0) q9l0VarB4.b).C(j17);
                                        iol0Var.j0().A(q9l0VarB4, ((uol0) listB0.get(i2)).e);
                                        l8l0VarV.e0(q9l0VarB4);
                                        if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                            p7l0 p7l0Var12 = k5l0VarI0.a.g;
                                            k8l0.m(p7l0Var12);
                                            p7l0Var12.g();
                                            if (k5l0VarI0.w != 0) {
                                                pol0VarJ0 = iol0Var.j0();
                                                if (TextUtils.isEmpty(str12)) {
                                                    str18 = str12;
                                                    jM = 0;
                                                } else {
                                                    str18 = str12;
                                                    jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                                }
                                                p7l0 p7l0Var13 = k5l0VarI0.a.g;
                                                k8l0.m(p7l0Var13);
                                                p7l0Var13.g();
                                                if (jM != k5l0VarI0.w) {
                                                    l8l0VarV.g();
                                                    ((n8l0) l8l0VarV.b).a1();
                                                }
                                            } else {
                                                str18 = str12;
                                            }
                                        } else {
                                            str18 = str12;
                                        }
                                        i2++;
                                        str12 = str18;
                                    }
                                    lqk0VarG2 = iol0Var.g0();
                                    n8l0 n8l0Var4 = (n8l0) l8l0VarV.i();
                                    lqk0VarG2.g();
                                    lqk0VarG2.h();
                                    hm20.e(n8l0Var4.q());
                                    byte[] bArrE7 = n8l0Var4.e();
                                    long jM5 = lqk0VarG2.b.j0().M(bArrE7);
                                    ContentValues contentValues5 = new ContentValues();
                                    contentValues5.put(PublisherMetadata.APP_ID, n8l0Var4.q());
                                    contentValues5.put("metadata_fingerprint", Long.valueOf(jM5));
                                    contentValues5.put("metadata", bArrE7);
                                    lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues5, 4);
                                    lqk0VarG3 = iol0Var.g0();
                                    isk0Var3 = isk0Var2;
                                    it2 = isk0Var3.f.a.keySet().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            e7l0 e7l0VarF4 = iol0Var.f0();
                                            String str319 = isk0Var3.a;
                                            zW = e7l0VarF4.w(str319, isk0Var3.b);
                                            wpk0 wpk0VarK3 = iol0Var.g0().k0(iol0Var.g(), str319, false, false, false, false);
                                            if (zW) {
                                            }
                                            i3 = i;
                                            break;
                                        }
                                        if ("_r".equals(it2.next())) {
                                        }
                                        i3 = 1;
                                        break;
                                    }
                                    lqk0VarG3.g();
                                    lqk0VarG3.h();
                                    str17 = isk0Var3.a;
                                    hm20.e(str17);
                                    byte[] bArrE8 = lqk0VarG3.b.j0().D(isk0Var3).e();
                                    contentValues = new ContentValues();
                                    contentValues.put(PublisherMetadata.APP_ID, str17);
                                    contentValues.put("name", isk0Var3.b);
                                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(jM5));
                                    contentValues.put("data", bArrE8);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                                        lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                                    } else {
                                        iol0Var.o = 0L;
                                    }
                                    iol0Var.g0().T();
                                    iol0Var.g0().U();
                                    iol0Var.N();
                                    iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                    return;
                                }
                                k8l0Var2 = k8l0Var2;
                                isk0Var2 = isk0Var2;
                                k8l0Var2.p().i();
                                String str3110 = Build.MODEL;
                                l8l0VarV.o();
                                k8l0Var2.p().i();
                                String str3111 = Build.VERSION.RELEASE;
                                l8l0VarV.g();
                                ((n8l0) l8l0VarV.b).p0(str3111);
                                l8l0VarV.q((int) k8l0Var2.p().k());
                                l8l0VarV.p(k8l0Var2.p().l());
                                l8l0VarV.X(zzrVar.L);
                                if (k8l0Var2.f()) {
                                    l8l0VarV.s();
                                    if (!TextUtils.isEmpty(null)) {
                                        l8l0VarV.g();
                                        ((n8l0) l8l0VarV.b).S0(null);
                                        throw null;
                                    }
                                }
                                k5l0VarI0 = g0().i0(str6);
                                if (k5l0VarI0 == null) {
                                    k5l0VarI0 = new k5l0(k8l0Var2, str6);
                                    iol0Var = this;
                                    k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                                    k5l0VarI0.K(zzrVar.z);
                                    k5l0VarI0.H(str16);
                                    if (jbl0VarJ2.i(hbl0Var)) {
                                        k5l0VarI0.I(iol0Var.i.l(str6, z9));
                                    }
                                    k5l0VarI0.e(0L);
                                    k5l0VarI0.L(0L);
                                    k5l0VarI0.M(0L);
                                    k5l0VarI0.O(str15);
                                    k5l0VarI0.Q(j2);
                                    k5l0VarI0.R(str14);
                                    k5l0VarI0.S(j6);
                                    k5l0VarI0.a(j8);
                                    k5l0VarI0.d(z10);
                                    k5l0VarI0.c(j4);
                                    i = 0;
                                    iol0Var.g0().j0(k5l0VarI0, false);
                                } else {
                                    i = 0;
                                    iol0Var = this;
                                }
                                if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                                    String strE5 = k5l0VarI0.E();
                                    hm20.h(strE5);
                                    l8l0VarV.z(strE5);
                                }
                                if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                                    String strJ5 = k5l0VarI0.J();
                                    hm20.h(strJ5);
                                    l8l0VarV.P(strJ5);
                                }
                                listB0 = iol0Var.g0().b0(str6);
                                i2 = i;
                                while (i2 < listB0.size()) {
                                    q9l0 q9l0VarB5 = s9l0.B();
                                    String str3112 = ((uol0) listB0.get(i2)).c;
                                    q9l0VarB5.g();
                                    ((s9l0) q9l0VarB5.b).D(str3112);
                                    long j18 = ((uol0) listB0.get(i2)).d;
                                    q9l0VarB5.g();
                                    ((s9l0) q9l0VarB5.b).C(j18);
                                    iol0Var.j0().A(q9l0VarB5, ((uol0) listB0.get(i2)).e);
                                    l8l0VarV.e0(q9l0VarB5);
                                    if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                        p7l0 p7l0Var14 = k5l0VarI0.a.g;
                                        k8l0.m(p7l0Var14);
                                        p7l0Var14.g();
                                        if (k5l0VarI0.w != 0) {
                                            pol0VarJ0 = iol0Var.j0();
                                            if (TextUtils.isEmpty(str12)) {
                                                str18 = str12;
                                                jM = 0;
                                            } else {
                                                str18 = str12;
                                                jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                            }
                                            p7l0 p7l0Var15 = k5l0VarI0.a.g;
                                            k8l0.m(p7l0Var15);
                                            p7l0Var15.g();
                                            if (jM != k5l0VarI0.w) {
                                                l8l0VarV.g();
                                                ((n8l0) l8l0VarV.b).a1();
                                            }
                                        } else {
                                            str18 = str12;
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                    i2++;
                                    str12 = str18;
                                }
                                lqk0VarG2 = iol0Var.g0();
                                n8l0 n8l0Var5 = (n8l0) l8l0VarV.i();
                                lqk0VarG2.g();
                                lqk0VarG2.h();
                                hm20.e(n8l0Var5.q());
                                byte[] bArrE9 = n8l0Var5.e();
                                long jM6 = lqk0VarG2.b.j0().M(bArrE9);
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(PublisherMetadata.APP_ID, n8l0Var5.q());
                                contentValues6.put("metadata_fingerprint", Long.valueOf(jM6));
                                contentValues6.put("metadata", bArrE9);
                                lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues6, 4);
                                lqk0VarG3 = iol0Var.g0();
                                isk0Var3 = isk0Var2;
                                it2 = isk0Var3.f.a.keySet().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        e7l0 e7l0VarF5 = iol0Var.f0();
                                        String str3113 = isk0Var3.a;
                                        zW = e7l0VarF5.w(str3113, isk0Var3.b);
                                        wpk0 wpk0VarK4 = iol0Var.g0().k0(iol0Var.g(), str3113, false, false, false, false);
                                        if (zW) {
                                        }
                                        i3 = i;
                                        break;
                                    }
                                    if ("_r".equals(it2.next())) {
                                    }
                                    i3 = 1;
                                    break;
                                }
                                lqk0VarG3.g();
                                lqk0VarG3.h();
                                str17 = isk0Var3.a;
                                hm20.e(str17);
                                byte[] bArrE10 = lqk0VarG3.b.j0().D(isk0Var3).e();
                                contentValues = new ContentValues();
                                contentValues.put(PublisherMetadata.APP_ID, str17);
                                contentValues.put("name", isk0Var3.b);
                                contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                                contentValues.put("metadata_fingerprint", Long.valueOf(jM6));
                                contentValues.put("data", bArrE10);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                                    lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                                } else {
                                    iol0Var.o = 0L;
                                }
                                iol0Var.g0().T();
                                iol0Var.g0().U();
                                iol0Var.N();
                                iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                                return;
                                iol0Var.g0().U();
                                throw th;
                            }
                            if (jIntValue % 1000 == 1) {
                                a().f.c(y4l0.k(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(wpk0VarL0.b));
                            }
                            g0().T();
                            g0().U();
                        }
                        lqk0VarG0.V().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str24, str24, String.valueOf(iO)});
                    } catch (SQLiteException e7) {
                        lqk0VarG0.a.a().f.c(y4l0.k(str24), "Error pruning currencies. appId", e7);
                    }
                    lqk0VarG0 = g0();
                    iO = e0().o(str24, v2l0.T) - 1;
                    hm20.e(str24);
                    lqk0VarG0.g();
                    lqk0VarG0.h();
                    String str41 = zzbgVarB.c;
                    e().getClass();
                    str4 = str24;
                    uol0Var = new uol0(str4, str41, strConcat, System.currentTimeMillis(), Long.valueOf(jRound));
                    uol0Var2 = uol0Var;
                    if (!g0().Z(uol0Var2)) {
                        a().f.d(y4l0.k(str4), qUnCRF.IiF, k8l0Var2.j.c(uol0Var2.c), uol0Var2.e);
                        k0();
                        yol0.w(ynl0Var3, str4, 9, null, null, 0);
                        ynl0Var = ynl0Var3;
                    }
                    zF0 = yol0.f0(str28);
                    zEquals = "_err".equals(str28);
                    k0();
                    if (zzbeVar == null) {
                        length = 0;
                    } else {
                        it = zzbeVar.a.keySet().iterator();
                        length = 0;
                        while (it.hasNext()) {
                            objG0 = zzbeVar.G0(it.next());
                            if (objG0 instanceof Parcelable[]) {
                                length += (long) ((Parcelable[]) objG0).length;
                            }
                        }
                    }
                    str5 = str4;
                    wpk0VarL0 = g0().l0(g(), str5, length + 1, true, zF0, false, zEquals, false, false, false);
                    long j19 = wpk0VarL0.b;
                    e0();
                    jIntValue = j19 - ((long) ((Integer) v2l0.l.a(null)).intValue());
                    if (jIntValue <= 0) {
                        if (zF0) {
                            long j110 = wpk0VarL0.a;
                            e0();
                            jIntValue2 = j110 - ((long) ((Integer) v2l0.n.a(null)).intValue());
                            if (jIntValue2 > 0) {
                                if (jIntValue2 % 1000 == 1) {
                                    a().f.c(y4l0.k(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(wpk0VarL0.a));
                                }
                                k0();
                                yol0.w(ynl0Var, str5, 16, "_ev", zzbgVarB.a, 0);
                                g0().T();
                            }
                        }
                        str6 = str5;
                        if (zEquals) {
                            jMax = wpk0VarL0.d - ((long) Math.max(0, Math.min(CashOut.BIG_NUMBER, e0().o(str6, v2l0.m))));
                            if (jMax > 0) {
                                if (jMax == 1) {
                                    a().f.c(y4l0.k(str6), "Too many error events logged. appId, count", Long.valueOf(wpk0VarL0.d));
                                }
                                g0().T();
                            }
                        }
                        bundleB1 = zzbeVar.b1();
                        yol0 yol0VarK3 = k0();
                        String str211 = zzbgVarB.c;
                        yol0VarK3.v(bundleB1, "_o", str211);
                        if (k0().H(str6, zzrVar.Q)) {
                            k0().v(bundleB1, "_dbg", 1L);
                            k0().v(bundleB1, "_r", 1L);
                        }
                        if ("_s".equals(str28)) {
                            obj2 = uol0VarA0.e;
                            if (obj2 instanceof Long) {
                                k0().v(bundleB1, "_sno", obj2);
                            }
                        }
                        if (e0().q(null, v2l0.X0)) {
                            obj = bundleB1.get("value");
                            if (obj instanceof String) {
                                double d3 = Double.parseDouble((String) obj);
                                bundleB1.remove("value");
                                bundleB1.putDouble("value", d3);
                            }
                        }
                        lqk0VarG1 = g0();
                        hm20.e(str6);
                        lqk0VarG1.g();
                        lqk0VarG1.h();
                        str7 = str19;
                        jDelete = lqk0VarG1.V().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(CashOut.BIG_NUMBER, lqk0VarG1.a.d.o(str6, v2l0.q))))});
                        if (jDelete > 0) {
                            a().i.c(y4l0.k(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                        }
                        k8l0Var = this.l;
                        isk0Var = new isk0(k8l0Var, zzbgVarB.c, str6, zzbgVarB.a, zzbgVarB.d, 0L, bundleB1);
                        lqk0 lqk0VarG6 = g0();
                        str8 = isk0Var.b;
                        String str3114 = str3;
                        msk0VarE = lqk0VarG6.E(str3114, str6, str8);
                        if (msk0VarE == null) {
                            jW = g0().w(str6);
                            wok0VarE0 = e0();
                            wok0VarE0.getClass();
                            t2l0Var = v2l0.W;
                            ynl0Var2 = ynl0Var;
                            if (jW >= Math.max(Math.min(wok0VarE0.o(str6, t2l0Var), 2000), 500)) {
                            }
                            ynl0Var = ynl0Var2;
                            msk0VarA = new msk0(str6, str8, 0L, 0L, 0L, isk0Var.d, 0L, null, null, null, null);
                            str6 = str6;
                        } else {
                            isk0Var = isk0Var.a(k8l0Var, msk0VarE.f);
                            msk0VarA = msk0VarE.a(isk0Var.d);
                        }
                        isk0Var2 = isk0Var;
                        g0().F(str3114, msk0VarA);
                        b().g();
                        l0();
                        String str3115 = isk0Var2.a;
                        hm20.e(str3115);
                        hm20.b(str3115.equals(str6));
                        l8l0VarV = n8l0.V();
                        l8l0VarV.C();
                        l8l0VarV.n();
                        if (!TextUtils.isEmpty(str6)) {
                            l8l0VarV.t(str6);
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str9 = str2;
                            l8l0VarV.r(str9);
                        } else {
                            str9 = str2;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str10 = str;
                            l8l0VarV.u(str10);
                        } else {
                            str10 = str;
                        }
                        if (TextUtils.isEmpty(str21)) {
                            str11 = str21;
                            l8l0VarV.W(str11);
                        } else {
                            str11 = str21;
                        }
                        if (j7 != -2147483648L) {
                            j = j7;
                            l8l0VarV.Q((int) j);
                        } else {
                            j = j7;
                        }
                        str12 = str11;
                        l8l0VarV.v(j6);
                        if (TextUtils.isEmpty(str25)) {
                            str13 = str25;
                            l8l0VarV.M(str13);
                        } else {
                            str13 = str25;
                        }
                        hm20.h(str6);
                        str14 = str9;
                        jbl0VarJ = f(str6).j(jbl0.c(100, str20));
                        l8l0VarV.V(jbl0VarJ.f());
                        kql0.a();
                        zQ = e0().q(str6, v2l0.P0);
                        hbl0Var = hbl0.AD_STORAGE;
                        if (zQ) {
                            k0();
                            if (yol0.D(str6)) {
                                l8l0VarV.D(zzrVar.O);
                                j2 = j;
                                j3 = zzrVar.P;
                                if (!jbl0VarJ.i(hbl0Var)) {
                                    j3 = (j3 & (-2)) | 32;
                                }
                                if (j3 == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                l8l0VarV.Y(z);
                                if (j3 != 0) {
                                    c6l0 c6l0VarX3 = e6l0.x();
                                    if ((j3 & 1) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c6l0VarX3.l(z2);
                                    if ((j3 & 2) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c6l0VarX3.m(z3);
                                    if ((j3 & 4) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    c6l0VarX3.n(z4);
                                    if ((j3 & 8) != 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    c6l0VarX3.o(z5);
                                    if ((j3 & 16) != 0) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    c6l0VarX3.p(z6);
                                    if ((j3 & 32) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    c6l0VarX3.q(z7);
                                    if ((j3 & 64) != 0) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    c6l0VarX3.r(z8);
                                    l8l0VarV.E((e6l0) c6l0VarX3.i());
                                }
                            } else {
                                j2 = j;
                            }
                        } else {
                            j2 = j;
                        }
                        if (j8 != 0) {
                            l8l0VarV.A(j8);
                            j8 = j8;
                        }
                        l8l0VarV.T(j4);
                        pol0 pol0VarJ3 = j0();
                        ubl0VarA = ubl0.a(pol0VarJ3.b.l.d().getContentResolver(), wcl0.a(), n2l0.a);
                        if (ubl0VarA == null) {
                            mapB = Collections.EMPTY_MAP;
                        } else {
                            mapB = ubl0VarA.b();
                        }
                        if (mapB == null) {
                            str15 = str10;
                            str16 = str13;
                            arrayList = null;
                        } else {
                            str15 = str10;
                            str16 = str13;
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            l8l0VarV.S(arrayList);
                        }
                        if (e0().q(null, v2l0.a1)) {
                            l8l0VarV.I();
                        }
                        jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                        if (jbl0VarJ2.i(hbl0Var)) {
                            k8l0Var2 = k8l0Var2;
                            isk0Var2 = isk0Var2;
                            k8l0Var2.p().i();
                            String str3116 = Build.MODEL;
                            l8l0VarV.o();
                            k8l0Var2.p().i();
                            String str3117 = Build.VERSION.RELEASE;
                            l8l0VarV.g();
                            ((n8l0) l8l0VarV.b).p0(str3117);
                            l8l0VarV.q((int) k8l0Var2.p().k());
                            l8l0VarV.p(k8l0Var2.p().l());
                            l8l0VarV.X(zzrVar.L);
                            if (k8l0Var2.f()) {
                                l8l0VarV.s();
                                if (!TextUtils.isEmpty(null)) {
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).S0(null);
                                    throw null;
                                }
                            }
                            k5l0VarI0 = g0().i0(str6);
                            if (k5l0VarI0 == null) {
                                k5l0VarI0 = new k5l0(k8l0Var2, str6);
                                iol0Var = this;
                                k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                                k5l0VarI0.K(zzrVar.z);
                                k5l0VarI0.H(str16);
                                if (jbl0VarJ2.i(hbl0Var)) {
                                    k5l0VarI0.I(iol0Var.i.l(str6, z9));
                                }
                                k5l0VarI0.e(0L);
                                k5l0VarI0.L(0L);
                                k5l0VarI0.M(0L);
                                k5l0VarI0.O(str15);
                                k5l0VarI0.Q(j2);
                                k5l0VarI0.R(str14);
                                k5l0VarI0.S(j6);
                                k5l0VarI0.a(j8);
                                k5l0VarI0.d(z10);
                                k5l0VarI0.c(j4);
                                i = 0;
                                iol0Var.g0().j0(k5l0VarI0, false);
                            } else {
                                i = 0;
                                iol0Var = this;
                            }
                            if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                                String strE6 = k5l0VarI0.E();
                                hm20.h(strE6);
                                l8l0VarV.z(strE6);
                            }
                            if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                                String strJ6 = k5l0VarI0.J();
                                hm20.h(strJ6);
                                l8l0VarV.P(strJ6);
                            }
                            listB0 = iol0Var.g0().b0(str6);
                            i2 = i;
                            while (i2 < listB0.size()) {
                                q9l0 q9l0VarB6 = s9l0.B();
                                String str3118 = ((uol0) listB0.get(i2)).c;
                                q9l0VarB6.g();
                                ((s9l0) q9l0VarB6.b).D(str3118);
                                long j111 = ((uol0) listB0.get(i2)).d;
                                q9l0VarB6.g();
                                ((s9l0) q9l0VarB6.b).C(j111);
                                iol0Var.j0().A(q9l0VarB6, ((uol0) listB0.get(i2)).e);
                                l8l0VarV.e0(q9l0VarB6);
                                if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                    p7l0 p7l0Var16 = k5l0VarI0.a.g;
                                    k8l0.m(p7l0Var16);
                                    p7l0Var16.g();
                                    if (k5l0VarI0.w != 0) {
                                        pol0VarJ0 = iol0Var.j0();
                                        if (TextUtils.isEmpty(str12)) {
                                            str18 = str12;
                                            jM = 0;
                                        } else {
                                            str18 = str12;
                                            jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                        }
                                        p7l0 p7l0Var17 = k5l0VarI0.a.g;
                                        k8l0.m(p7l0Var17);
                                        p7l0Var17.g();
                                        if (jM != k5l0VarI0.w) {
                                            l8l0VarV.g();
                                            ((n8l0) l8l0VarV.b).a1();
                                        }
                                    } else {
                                        str18 = str12;
                                    }
                                } else {
                                    str18 = str12;
                                }
                                i2++;
                                str12 = str18;
                            }
                            lqk0VarG2 = iol0Var.g0();
                            n8l0 n8l0Var6 = (n8l0) l8l0VarV.i();
                            lqk0VarG2.g();
                            lqk0VarG2.h();
                            hm20.e(n8l0Var6.q());
                            byte[] bArrE11 = n8l0Var6.e();
                            long jM7 = lqk0VarG2.b.j0().M(bArrE11);
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put(PublisherMetadata.APP_ID, n8l0Var6.q());
                            contentValues7.put("metadata_fingerprint", Long.valueOf(jM7));
                            contentValues7.put("metadata", bArrE11);
                            lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues7, 4);
                            lqk0VarG3 = iol0Var.g0();
                            isk0Var3 = isk0Var2;
                            it2 = isk0Var3.f.a.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    e7l0 e7l0VarF6 = iol0Var.f0();
                                    String str3119 = isk0Var3.a;
                                    zW = e7l0VarF6.w(str3119, isk0Var3.b);
                                    wpk0 wpk0VarK5 = iol0Var.g0().k0(iol0Var.g(), str3119, false, false, false, false);
                                    if (zW) {
                                    }
                                    i3 = i;
                                    break;
                                }
                                if ("_r".equals(it2.next())) {
                                }
                                i3 = 1;
                                break;
                            }
                            lqk0VarG3.g();
                            lqk0VarG3.h();
                            str17 = isk0Var3.a;
                            hm20.e(str17);
                            byte[] bArrE12 = lqk0VarG3.b.j0().D(isk0Var3).e();
                            contentValues = new ContentValues();
                            contentValues.put(PublisherMetadata.APP_ID, str17);
                            contentValues.put("name", isk0Var3.b);
                            contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(jM7));
                            contentValues.put("data", bArrE12);
                            contentValues.put("realtime", Integer.valueOf(i3));
                            if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                                lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                            } else {
                                iol0Var.o = 0L;
                            }
                            iol0Var.g0().T();
                            iol0Var.g0().U();
                            iol0Var.N();
                            iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        k8l0Var2 = k8l0Var2;
                        isk0Var2 = isk0Var2;
                        k8l0Var2.p().i();
                        String str31110 = Build.MODEL;
                        l8l0VarV.o();
                        k8l0Var2.p().i();
                        String str31111 = Build.VERSION.RELEASE;
                        l8l0VarV.g();
                        ((n8l0) l8l0VarV.b).p0(str31111);
                        l8l0VarV.q((int) k8l0Var2.p().k());
                        l8l0VarV.p(k8l0Var2.p().l());
                        l8l0VarV.X(zzrVar.L);
                        if (k8l0Var2.f()) {
                            l8l0VarV.s();
                            if (!TextUtils.isEmpty(null)) {
                                l8l0VarV.g();
                                ((n8l0) l8l0VarV.b).S0(null);
                                throw null;
                            }
                        }
                        k5l0VarI0 = g0().i0(str6);
                        if (k5l0VarI0 == null) {
                            k5l0VarI0 = new k5l0(k8l0Var2, str6);
                            iol0Var = this;
                            k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                            k5l0VarI0.K(zzrVar.z);
                            k5l0VarI0.H(str16);
                            if (jbl0VarJ2.i(hbl0Var)) {
                                k5l0VarI0.I(iol0Var.i.l(str6, z9));
                            }
                            k5l0VarI0.e(0L);
                            k5l0VarI0.L(0L);
                            k5l0VarI0.M(0L);
                            k5l0VarI0.O(str15);
                            k5l0VarI0.Q(j2);
                            k5l0VarI0.R(str14);
                            k5l0VarI0.S(j6);
                            k5l0VarI0.a(j8);
                            k5l0VarI0.d(z10);
                            k5l0VarI0.c(j4);
                            i = 0;
                            iol0Var.g0().j0(k5l0VarI0, false);
                        } else {
                            i = 0;
                            iol0Var = this;
                        }
                        if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                            String strE7 = k5l0VarI0.E();
                            hm20.h(strE7);
                            l8l0VarV.z(strE7);
                        }
                        if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                            String strJ7 = k5l0VarI0.J();
                            hm20.h(strJ7);
                            l8l0VarV.P(strJ7);
                        }
                        listB0 = iol0Var.g0().b0(str6);
                        i2 = i;
                        while (i2 < listB0.size()) {
                            q9l0 q9l0VarB7 = s9l0.B();
                            String str31112 = ((uol0) listB0.get(i2)).c;
                            q9l0VarB7.g();
                            ((s9l0) q9l0VarB7.b).D(str31112);
                            long j112 = ((uol0) listB0.get(i2)).d;
                            q9l0VarB7.g();
                            ((s9l0) q9l0VarB7.b).C(j112);
                            iol0Var.j0().A(q9l0VarB7, ((uol0) listB0.get(i2)).e);
                            l8l0VarV.e0(q9l0VarB7);
                            if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                p7l0 p7l0Var18 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var18);
                                p7l0Var18.g();
                                if (k5l0VarI0.w != 0) {
                                    pol0VarJ0 = iol0Var.j0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM = 0;
                                    } else {
                                        str18 = str12;
                                        jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p7l0 p7l0Var19 = k5l0VarI0.a.g;
                                    k8l0.m(p7l0Var19);
                                    p7l0Var19.g();
                                    if (jM != k5l0VarI0.w) {
                                        l8l0VarV.g();
                                        ((n8l0) l8l0VarV.b).a1();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        lqk0VarG2 = iol0Var.g0();
                        n8l0 n8l0Var7 = (n8l0) l8l0VarV.i();
                        lqk0VarG2.g();
                        lqk0VarG2.h();
                        hm20.e(n8l0Var7.q());
                        byte[] bArrE13 = n8l0Var7.e();
                        long jM8 = lqk0VarG2.b.j0().M(bArrE13);
                        ContentValues contentValues8 = new ContentValues();
                        contentValues8.put(PublisherMetadata.APP_ID, n8l0Var7.q());
                        contentValues8.put("metadata_fingerprint", Long.valueOf(jM8));
                        contentValues8.put("metadata", bArrE13);
                        lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues8, 4);
                        lqk0VarG3 = iol0Var.g0();
                        isk0Var3 = isk0Var2;
                        it2 = isk0Var3.f.a.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                e7l0 e7l0VarF7 = iol0Var.f0();
                                String str31113 = isk0Var3.a;
                                zW = e7l0VarF7.w(str31113, isk0Var3.b);
                                wpk0 wpk0VarK6 = iol0Var.g0().k0(iol0Var.g(), str31113, false, false, false, false);
                                if (zW) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        lqk0VarG3.g();
                        lqk0VarG3.h();
                        str17 = isk0Var3.a;
                        hm20.e(str17);
                        byte[] bArrE14 = lqk0VarG3.b.j0().D(isk0Var3).e();
                        contentValues = new ContentValues();
                        contentValues.put(PublisherMetadata.APP_ID, str17);
                        contentValues.put("name", isk0Var3.b);
                        contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM8));
                        contentValues.put("data", bArrE14);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                            lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            iol0Var.o = 0L;
                        }
                        iol0Var.g0().T();
                        iol0Var.g0().U();
                        iol0Var.N();
                        iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                        iol0Var.g0().U();
                        throw th;
                    }
                    if (jIntValue % 1000 == 1) {
                        a().f.c(y4l0.k(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(wpk0VarL0.b));
                    }
                    g0().T();
                    g0().U();
                }
                ynl0Var = ynl0Var3;
                zF0 = yol0.f0(str28);
                zEquals = "_err".equals(str28);
                k0();
                if (zzbeVar == null) {
                    length = 0;
                } else {
                    it = zzbeVar.a.keySet().iterator();
                    length = 0;
                    while (it.hasNext()) {
                        objG0 = zzbeVar.G0(it.next());
                        if (objG0 instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objG0).length;
                        }
                    }
                }
                str5 = str4;
                wpk0VarL0 = g0().l0(g(), str5, length + 1, true, zF0, false, zEquals, false, false, false);
                long j113 = wpk0VarL0.b;
                e0();
                jIntValue = j113 - ((long) ((Integer) v2l0.l.a(null)).intValue());
                if (jIntValue <= 0) {
                    if (zF0) {
                        long j114 = wpk0VarL0.a;
                        e0();
                        jIntValue2 = j114 - ((long) ((Integer) v2l0.n.a(null)).intValue());
                        if (jIntValue2 > 0) {
                            if (jIntValue2 % 1000 == 1) {
                                a().f.c(y4l0.k(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(wpk0VarL0.a));
                            }
                            k0();
                            yol0.w(ynl0Var, str5, 16, "_ev", zzbgVarB.a, 0);
                            g0().T();
                        }
                    }
                    str6 = str5;
                    if (zEquals) {
                        jMax = wpk0VarL0.d - ((long) Math.max(0, Math.min(CashOut.BIG_NUMBER, e0().o(str6, v2l0.m))));
                        if (jMax > 0) {
                            if (jMax == 1) {
                                a().f.c(y4l0.k(str6), "Too many error events logged. appId, count", Long.valueOf(wpk0VarL0.d));
                            }
                            g0().T();
                        }
                    }
                    bundleB1 = zzbeVar.b1();
                    yol0 yol0VarK4 = k0();
                    String str212 = zzbgVarB.c;
                    yol0VarK4.v(bundleB1, "_o", str212);
                    if (k0().H(str6, zzrVar.Q)) {
                        k0().v(bundleB1, "_dbg", 1L);
                        k0().v(bundleB1, "_r", 1L);
                    }
                    if ("_s".equals(str28)) {
                        obj2 = uol0VarA0.e;
                        if (obj2 instanceof Long) {
                            k0().v(bundleB1, "_sno", obj2);
                        }
                    }
                    if (e0().q(null, v2l0.X0)) {
                        obj = bundleB1.get("value");
                        if (obj instanceof String) {
                            double d4 = Double.parseDouble((String) obj);
                            bundleB1.remove("value");
                            bundleB1.putDouble("value", d4);
                        }
                    }
                    lqk0VarG1 = g0();
                    hm20.e(str6);
                    lqk0VarG1.g();
                    lqk0VarG1.h();
                    str7 = str19;
                    jDelete = lqk0VarG1.V().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(CashOut.BIG_NUMBER, lqk0VarG1.a.d.o(str6, v2l0.q))))});
                    if (jDelete > 0) {
                        a().i.c(y4l0.k(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                    }
                    k8l0Var = this.l;
                    isk0Var = new isk0(k8l0Var, zzbgVarB.c, str6, zzbgVarB.a, zzbgVarB.d, 0L, bundleB1);
                    lqk0 lqk0VarG7 = g0();
                    str8 = isk0Var.b;
                    String str31114 = str3;
                    msk0VarE = lqk0VarG7.E(str31114, str6, str8);
                    if (msk0VarE == null) {
                        jW = g0().w(str6);
                        wok0VarE0 = e0();
                        wok0VarE0.getClass();
                        t2l0Var = v2l0.W;
                        ynl0Var2 = ynl0Var;
                        if (jW >= Math.max(Math.min(wok0VarE0.o(str6, t2l0Var), 2000), 500)) {
                        }
                        ynl0Var = ynl0Var2;
                        msk0VarA = new msk0(str6, str8, 0L, 0L, 0L, isk0Var.d, 0L, null, null, null, null);
                        str6 = str6;
                    } else {
                        isk0Var = isk0Var.a(k8l0Var, msk0VarE.f);
                        msk0VarA = msk0VarE.a(isk0Var.d);
                    }
                    isk0Var2 = isk0Var;
                    g0().F(str31114, msk0VarA);
                    b().g();
                    l0();
                    String str31115 = isk0Var2.a;
                    hm20.e(str31115);
                    hm20.b(str31115.equals(str6));
                    l8l0VarV = n8l0.V();
                    l8l0VarV.C();
                    l8l0VarV.n();
                    if (!TextUtils.isEmpty(str6)) {
                        l8l0VarV.t(str6);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str9 = str2;
                        l8l0VarV.r(str9);
                    } else {
                        str9 = str2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str10 = str;
                        l8l0VarV.u(str10);
                    } else {
                        str10 = str;
                    }
                    if (TextUtils.isEmpty(str21)) {
                        str11 = str21;
                        l8l0VarV.W(str11);
                    } else {
                        str11 = str21;
                    }
                    if (j7 != -2147483648L) {
                        j = j7;
                        l8l0VarV.Q((int) j);
                    } else {
                        j = j7;
                    }
                    str12 = str11;
                    l8l0VarV.v(j6);
                    if (TextUtils.isEmpty(str25)) {
                        str13 = str25;
                        l8l0VarV.M(str13);
                    } else {
                        str13 = str25;
                    }
                    hm20.h(str6);
                    str14 = str9;
                    jbl0VarJ = f(str6).j(jbl0.c(100, str20));
                    l8l0VarV.V(jbl0VarJ.f());
                    kql0.a();
                    zQ = e0().q(str6, v2l0.P0);
                    hbl0Var = hbl0.AD_STORAGE;
                    if (zQ) {
                        k0();
                        if (yol0.D(str6)) {
                            l8l0VarV.D(zzrVar.O);
                            j2 = j;
                            j3 = zzrVar.P;
                            if (!jbl0VarJ.i(hbl0Var)) {
                                j3 = (j3 & (-2)) | 32;
                            }
                            if (j3 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            l8l0VarV.Y(z);
                            if (j3 != 0) {
                                c6l0 c6l0VarX4 = e6l0.x();
                                if ((j3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c6l0VarX4.l(z2);
                                if ((j3 & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                c6l0VarX4.m(z3);
                                if ((j3 & 4) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c6l0VarX4.n(z4);
                                if ((j3 & 8) != 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                c6l0VarX4.o(z5);
                                if ((j3 & 16) != 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                c6l0VarX4.p(z6);
                                if ((j3 & 32) != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                c6l0VarX4.q(z7);
                                if ((j3 & 64) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                c6l0VarX4.r(z8);
                                l8l0VarV.E((e6l0) c6l0VarX4.i());
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                    }
                    if (j8 != 0) {
                        l8l0VarV.A(j8);
                        j8 = j8;
                    }
                    l8l0VarV.T(j4);
                    pol0 pol0VarJ4 = j0();
                    ubl0VarA = ubl0.a(pol0VarJ4.b.l.d().getContentResolver(), wcl0.a(), n2l0.a);
                    if (ubl0VarA == null) {
                        mapB = Collections.EMPTY_MAP;
                    } else {
                        mapB = ubl0VarA.b();
                    }
                    if (mapB == null) {
                        str15 = str10;
                        str16 = str13;
                        arrayList = null;
                    } else {
                        str15 = str10;
                        str16 = str13;
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        l8l0VarV.S(arrayList);
                    }
                    if (e0().q(null, v2l0.a1)) {
                        l8l0VarV.I();
                    }
                    jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                    if (jbl0VarJ2.i(hbl0Var)) {
                        k8l0Var2 = k8l0Var2;
                        isk0Var2 = isk0Var2;
                        k8l0Var2.p().i();
                        String str31116 = Build.MODEL;
                        l8l0VarV.o();
                        k8l0Var2.p().i();
                        String str31117 = Build.VERSION.RELEASE;
                        l8l0VarV.g();
                        ((n8l0) l8l0VarV.b).p0(str31117);
                        l8l0VarV.q((int) k8l0Var2.p().k());
                        l8l0VarV.p(k8l0Var2.p().l());
                        l8l0VarV.X(zzrVar.L);
                        if (k8l0Var2.f()) {
                            l8l0VarV.s();
                            if (!TextUtils.isEmpty(null)) {
                                l8l0VarV.g();
                                ((n8l0) l8l0VarV.b).S0(null);
                                throw null;
                            }
                        }
                        k5l0VarI0 = g0().i0(str6);
                        if (k5l0VarI0 == null) {
                            k5l0VarI0 = new k5l0(k8l0Var2, str6);
                            iol0Var = this;
                            k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                            k5l0VarI0.K(zzrVar.z);
                            k5l0VarI0.H(str16);
                            if (jbl0VarJ2.i(hbl0Var)) {
                                k5l0VarI0.I(iol0Var.i.l(str6, z9));
                            }
                            k5l0VarI0.e(0L);
                            k5l0VarI0.L(0L);
                            k5l0VarI0.M(0L);
                            k5l0VarI0.O(str15);
                            k5l0VarI0.Q(j2);
                            k5l0VarI0.R(str14);
                            k5l0VarI0.S(j6);
                            k5l0VarI0.a(j8);
                            k5l0VarI0.d(z10);
                            k5l0VarI0.c(j4);
                            i = 0;
                            iol0Var.g0().j0(k5l0VarI0, false);
                        } else {
                            i = 0;
                            iol0Var = this;
                        }
                        if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                            String strE8 = k5l0VarI0.E();
                            hm20.h(strE8);
                            l8l0VarV.z(strE8);
                        }
                        if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                            String strJ8 = k5l0VarI0.J();
                            hm20.h(strJ8);
                            l8l0VarV.P(strJ8);
                        }
                        listB0 = iol0Var.g0().b0(str6);
                        i2 = i;
                        while (i2 < listB0.size()) {
                            q9l0 q9l0VarB8 = s9l0.B();
                            String str31118 = ((uol0) listB0.get(i2)).c;
                            q9l0VarB8.g();
                            ((s9l0) q9l0VarB8.b).D(str31118);
                            long j115 = ((uol0) listB0.get(i2)).d;
                            q9l0VarB8.g();
                            ((s9l0) q9l0VarB8.b).C(j115);
                            iol0Var.j0().A(q9l0VarB8, ((uol0) listB0.get(i2)).e);
                            l8l0VarV.e0(q9l0VarB8);
                            if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                                p7l0 p7l0Var110 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var110);
                                p7l0Var110.g();
                                if (k5l0VarI0.w != 0) {
                                    pol0VarJ0 = iol0Var.j0();
                                    if (TextUtils.isEmpty(str12)) {
                                        str18 = str12;
                                        jM = 0;
                                    } else {
                                        str18 = str12;
                                        jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                    }
                                    p7l0 p7l0Var111 = k5l0VarI0.a.g;
                                    k8l0.m(p7l0Var111);
                                    p7l0Var111.g();
                                    if (jM != k5l0VarI0.w) {
                                        l8l0VarV.g();
                                        ((n8l0) l8l0VarV.b).a1();
                                    }
                                } else {
                                    str18 = str12;
                                }
                            } else {
                                str18 = str12;
                            }
                            i2++;
                            str12 = str18;
                        }
                        lqk0VarG2 = iol0Var.g0();
                        n8l0 n8l0Var8 = (n8l0) l8l0VarV.i();
                        lqk0VarG2.g();
                        lqk0VarG2.h();
                        hm20.e(n8l0Var8.q());
                        byte[] bArrE15 = n8l0Var8.e();
                        long jM9 = lqk0VarG2.b.j0().M(bArrE15);
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put(PublisherMetadata.APP_ID, n8l0Var8.q());
                        contentValues9.put("metadata_fingerprint", Long.valueOf(jM9));
                        contentValues9.put("metadata", bArrE15);
                        lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues9, 4);
                        lqk0VarG3 = iol0Var.g0();
                        isk0Var3 = isk0Var2;
                        it2 = isk0Var3.f.a.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                e7l0 e7l0VarF8 = iol0Var.f0();
                                String str31119 = isk0Var3.a;
                                zW = e7l0VarF8.w(str31119, isk0Var3.b);
                                wpk0 wpk0VarK7 = iol0Var.g0().k0(iol0Var.g(), str31119, false, false, false, false);
                                if (zW) {
                                }
                                i3 = i;
                                break;
                            }
                            if ("_r".equals(it2.next())) {
                            }
                            i3 = 1;
                            break;
                        }
                        lqk0VarG3.g();
                        lqk0VarG3.h();
                        str17 = isk0Var3.a;
                        hm20.e(str17);
                        byte[] bArrE16 = lqk0VarG3.b.j0().D(isk0Var3).e();
                        contentValues = new ContentValues();
                        contentValues.put(PublisherMetadata.APP_ID, str17);
                        contentValues.put("name", isk0Var3.b);
                        contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(jM9));
                        contentValues.put("data", bArrE16);
                        contentValues.put("realtime", Integer.valueOf(i3));
                        if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                            lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                        } else {
                            iol0Var.o = 0L;
                        }
                        iol0Var.g0().T();
                        iol0Var.g0().U();
                        iol0Var.N();
                        iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    k8l0Var2 = k8l0Var2;
                    isk0Var2 = isk0Var2;
                    k8l0Var2.p().i();
                    String str311110 = Build.MODEL;
                    l8l0VarV.o();
                    k8l0Var2.p().i();
                    String str311111 = Build.VERSION.RELEASE;
                    l8l0VarV.g();
                    ((n8l0) l8l0VarV.b).p0(str311111);
                    l8l0VarV.q((int) k8l0Var2.p().k());
                    l8l0VarV.p(k8l0Var2.p().l());
                    l8l0VarV.X(zzrVar.L);
                    if (k8l0Var2.f()) {
                        l8l0VarV.s();
                        if (!TextUtils.isEmpty(null)) {
                            l8l0VarV.g();
                            ((n8l0) l8l0VarV.b).S0(null);
                            throw null;
                        }
                    }
                    k5l0VarI0 = g0().i0(str6);
                    if (k5l0VarI0 == null) {
                        k5l0VarI0 = new k5l0(k8l0Var2, str6);
                        iol0Var = this;
                        k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                        k5l0VarI0.K(zzrVar.z);
                        k5l0VarI0.H(str16);
                        if (jbl0VarJ2.i(hbl0Var)) {
                            k5l0VarI0.I(iol0Var.i.l(str6, z9));
                        }
                        k5l0VarI0.e(0L);
                        k5l0VarI0.L(0L);
                        k5l0VarI0.M(0L);
                        k5l0VarI0.O(str15);
                        k5l0VarI0.Q(j2);
                        k5l0VarI0.R(str14);
                        k5l0VarI0.S(j6);
                        k5l0VarI0.a(j8);
                        k5l0VarI0.d(z10);
                        k5l0VarI0.c(j4);
                        i = 0;
                        iol0Var.g0().j0(k5l0VarI0, false);
                    } else {
                        i = 0;
                        iol0Var = this;
                    }
                    if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                        String strE9 = k5l0VarI0.E();
                        hm20.h(strE9);
                        l8l0VarV.z(strE9);
                    }
                    if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                        String strJ9 = k5l0VarI0.J();
                        hm20.h(strJ9);
                        l8l0VarV.P(strJ9);
                    }
                    listB0 = iol0Var.g0().b0(str6);
                    i2 = i;
                    while (i2 < listB0.size()) {
                        q9l0 q9l0VarB9 = s9l0.B();
                        String str311112 = ((uol0) listB0.get(i2)).c;
                        q9l0VarB9.g();
                        ((s9l0) q9l0VarB9.b).D(str311112);
                        long j116 = ((uol0) listB0.get(i2)).d;
                        q9l0VarB9.g();
                        ((s9l0) q9l0VarB9.b).C(j116);
                        iol0Var.j0().A(q9l0VarB9, ((uol0) listB0.get(i2)).e);
                        l8l0VarV.e0(q9l0VarB9);
                        if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                            p7l0 p7l0Var112 = k5l0VarI0.a.g;
                            k8l0.m(p7l0Var112);
                            p7l0Var112.g();
                            if (k5l0VarI0.w != 0) {
                                pol0VarJ0 = iol0Var.j0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM = 0;
                                } else {
                                    str18 = str12;
                                    jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                p7l0 p7l0Var113 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var113);
                                p7l0Var113.g();
                                if (jM != k5l0VarI0.w) {
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).a1();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    lqk0VarG2 = iol0Var.g0();
                    n8l0 n8l0Var9 = (n8l0) l8l0VarV.i();
                    lqk0VarG2.g();
                    lqk0VarG2.h();
                    hm20.e(n8l0Var9.q());
                    byte[] bArrE17 = n8l0Var9.e();
                    long jM10 = lqk0VarG2.b.j0().M(bArrE17);
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put(PublisherMetadata.APP_ID, n8l0Var9.q());
                    contentValues10.put("metadata_fingerprint", Long.valueOf(jM10));
                    contentValues10.put("metadata", bArrE17);
                    lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues10, 4);
                    lqk0VarG3 = iol0Var.g0();
                    isk0Var3 = isk0Var2;
                    it2 = isk0Var3.f.a.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            e7l0 e7l0VarF9 = iol0Var.f0();
                            String str311113 = isk0Var3.a;
                            zW = e7l0VarF9.w(str311113, isk0Var3.b);
                            wpk0 wpk0VarK8 = iol0Var.g0().k0(iol0Var.g(), str311113, false, false, false, false);
                            if (zW) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    lqk0VarG3.g();
                    lqk0VarG3.h();
                    str17 = isk0Var3.a;
                    hm20.e(str17);
                    byte[] bArrE18 = lqk0VarG3.b.j0().D(isk0Var3).e();
                    contentValues = new ContentValues();
                    contentValues.put(PublisherMetadata.APP_ID, str17);
                    contentValues.put("name", isk0Var3.b);
                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM10));
                    contentValues.put("data", bArrE18);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                        lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        iol0Var.o = 0L;
                    }
                    iol0Var.g0().T();
                    iol0Var.g0().U();
                    iol0Var.N();
                    iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                    iol0Var.g0().U();
                    throw th;
                }
                if (jIntValue % 1000 == 1) {
                    a().f.c(y4l0.k(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(wpk0VarL0.b));
                }
                g0().T();
                g0().U();
            }
            str4 = str24;
            ynl0Var = ynl0Var3;
            zF0 = yol0.f0(str28);
            zEquals = "_err".equals(str28);
            k0();
            if (zzbeVar == null) {
                length = 0;
            } else {
                it = zzbeVar.a.keySet().iterator();
                length = 0;
                while (it.hasNext()) {
                    objG0 = zzbeVar.G0(it.next());
                    if (objG0 instanceof Parcelable[]) {
                        length += (long) ((Parcelable[]) objG0).length;
                    }
                }
            }
            str5 = str4;
            wpk0VarL0 = g0().l0(g(), str5, length + 1, true, zF0, false, zEquals, false, false, false);
            long j117 = wpk0VarL0.b;
            e0();
            jIntValue = j117 - ((long) ((Integer) v2l0.l.a(null)).intValue());
            if (jIntValue <= 0) {
                if (zF0) {
                    long j118 = wpk0VarL0.a;
                    e0();
                    jIntValue2 = j118 - ((long) ((Integer) v2l0.n.a(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            a().f.c(y4l0.k(str5), "Data loss. Too many public events logged. appId, count", Long.valueOf(wpk0VarL0.a));
                        }
                        k0();
                        yol0.w(ynl0Var, str5, 16, "_ev", zzbgVarB.a, 0);
                        g0().T();
                    }
                }
                str6 = str5;
                if (zEquals) {
                    jMax = wpk0VarL0.d - ((long) Math.max(0, Math.min(CashOut.BIG_NUMBER, e0().o(str6, v2l0.m))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            a().f.c(y4l0.k(str6), "Too many error events logged. appId, count", Long.valueOf(wpk0VarL0.d));
                        }
                        g0().T();
                    }
                }
                bundleB1 = zzbeVar.b1();
                yol0 yol0VarK5 = k0();
                String str213 = zzbgVarB.c;
                yol0VarK5.v(bundleB1, "_o", str213);
                if (k0().H(str6, zzrVar.Q)) {
                    k0().v(bundleB1, "_dbg", 1L);
                    k0().v(bundleB1, "_r", 1L);
                }
                if ("_s".equals(str28)) {
                    obj2 = uol0VarA0.e;
                    if (obj2 instanceof Long) {
                        k0().v(bundleB1, "_sno", obj2);
                    }
                }
                if (e0().q(null, v2l0.X0)) {
                    obj = bundleB1.get("value");
                    if (obj instanceof String) {
                        double d5 = Double.parseDouble((String) obj);
                        bundleB1.remove("value");
                        bundleB1.putDouble("value", d5);
                    }
                }
                lqk0VarG1 = g0();
                hm20.e(str6);
                lqk0VarG1.g();
                lqk0VarG1.h();
                str7 = str19;
                jDelete = lqk0VarG1.V().delete(str7, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str6, String.valueOf(Math.max(0, Math.min(CashOut.BIG_NUMBER, lqk0VarG1.a.d.o(str6, v2l0.q))))});
                if (jDelete > 0) {
                    a().i.c(y4l0.k(str6), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                }
                k8l0Var = this.l;
                isk0Var = new isk0(k8l0Var, zzbgVarB.c, str6, zzbgVarB.a, zzbgVarB.d, 0L, bundleB1);
                lqk0 lqk0VarG8 = g0();
                str8 = isk0Var.b;
                String str311114 = str3;
                msk0VarE = lqk0VarG8.E(str311114, str6, str8);
                if (msk0VarE == null) {
                    jW = g0().w(str6);
                    wok0VarE0 = e0();
                    wok0VarE0.getClass();
                    t2l0Var = v2l0.W;
                    ynl0Var2 = ynl0Var;
                    if (jW >= Math.max(Math.min(wok0VarE0.o(str6, t2l0Var), 2000), 500)) {
                    }
                    ynl0Var = ynl0Var2;
                    msk0VarA = new msk0(str6, str8, 0L, 0L, 0L, isk0Var.d, 0L, null, null, null, null);
                    str6 = str6;
                } else {
                    isk0Var = isk0Var.a(k8l0Var, msk0VarE.f);
                    msk0VarA = msk0VarE.a(isk0Var.d);
                }
                isk0Var2 = isk0Var;
                g0().F(str311114, msk0VarA);
                b().g();
                l0();
                String str311115 = isk0Var2.a;
                hm20.e(str311115);
                hm20.b(str311115.equals(str6));
                l8l0VarV = n8l0.V();
                l8l0VarV.C();
                l8l0VarV.n();
                if (!TextUtils.isEmpty(str6)) {
                    l8l0VarV.t(str6);
                }
                if (TextUtils.isEmpty(str2)) {
                    str9 = str2;
                    l8l0VarV.r(str9);
                } else {
                    str9 = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    str10 = str;
                    l8l0VarV.u(str10);
                } else {
                    str10 = str;
                }
                if (TextUtils.isEmpty(str21)) {
                    str11 = str21;
                    l8l0VarV.W(str11);
                } else {
                    str11 = str21;
                }
                if (j7 != -2147483648L) {
                    j = j7;
                    l8l0VarV.Q((int) j);
                } else {
                    j = j7;
                }
                str12 = str11;
                l8l0VarV.v(j6);
                if (TextUtils.isEmpty(str25)) {
                    str13 = str25;
                    l8l0VarV.M(str13);
                } else {
                    str13 = str25;
                }
                hm20.h(str6);
                str14 = str9;
                jbl0VarJ = f(str6).j(jbl0.c(100, str20));
                l8l0VarV.V(jbl0VarJ.f());
                kql0.a();
                zQ = e0().q(str6, v2l0.P0);
                hbl0Var = hbl0.AD_STORAGE;
                if (zQ) {
                    k0();
                    if (yol0.D(str6)) {
                        l8l0VarV.D(zzrVar.O);
                        j2 = j;
                        j3 = zzrVar.P;
                        if (!jbl0VarJ.i(hbl0Var)) {
                            j3 = (j3 & (-2)) | 32;
                        }
                        if (j3 == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        l8l0VarV.Y(z);
                        if (j3 != 0) {
                            c6l0 c6l0VarX5 = e6l0.x();
                            if ((j3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c6l0VarX5.l(z2);
                            if ((j3 & 2) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c6l0VarX5.m(z3);
                            if ((j3 & 4) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            c6l0VarX5.n(z4);
                            if ((j3 & 8) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            c6l0VarX5.o(z5);
                            if ((j3 & 16) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            c6l0VarX5.p(z6);
                            if ((j3 & 32) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            c6l0VarX5.q(z7);
                            if ((j3 & 64) != 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c6l0VarX5.r(z8);
                            l8l0VarV.E((e6l0) c6l0VarX5.i());
                        }
                    } else {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                if (j8 != 0) {
                    l8l0VarV.A(j8);
                    j8 = j8;
                }
                l8l0VarV.T(j4);
                pol0 pol0VarJ5 = j0();
                ubl0VarA = ubl0.a(pol0VarJ5.b.l.d().getContentResolver(), wcl0.a(), n2l0.a);
                if (ubl0VarA == null) {
                    mapB = Collections.EMPTY_MAP;
                } else {
                    mapB = ubl0VarA.b();
                }
                if (mapB == null) {
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                } else {
                    str15 = str10;
                    str16 = str13;
                    arrayList = null;
                }
                if (arrayList != null) {
                    l8l0VarV.S(arrayList);
                }
                if (e0().q(null, v2l0.a1)) {
                    l8l0VarV.I();
                }
                jbl0VarJ2 = f(str6).j(jbl0.c(100, str20));
                if (jbl0VarJ2.i(hbl0Var)) {
                    k8l0Var2 = k8l0Var2;
                    isk0Var2 = isk0Var2;
                    k8l0Var2.p().i();
                    String str311116 = Build.MODEL;
                    l8l0VarV.o();
                    k8l0Var2.p().i();
                    String str311117 = Build.VERSION.RELEASE;
                    l8l0VarV.g();
                    ((n8l0) l8l0VarV.b).p0(str311117);
                    l8l0VarV.q((int) k8l0Var2.p().k());
                    l8l0VarV.p(k8l0Var2.p().l());
                    l8l0VarV.X(zzrVar.L);
                    if (k8l0Var2.f()) {
                        l8l0VarV.s();
                        if (!TextUtils.isEmpty(null)) {
                            l8l0VarV.g();
                            ((n8l0) l8l0VarV.b).S0(null);
                            throw null;
                        }
                    }
                    k5l0VarI0 = g0().i0(str6);
                    if (k5l0VarI0 == null) {
                        k5l0VarI0 = new k5l0(k8l0Var2, str6);
                        iol0Var = this;
                        k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                        k5l0VarI0.K(zzrVar.z);
                        k5l0VarI0.H(str16);
                        if (jbl0VarJ2.i(hbl0Var)) {
                            k5l0VarI0.I(iol0Var.i.l(str6, z9));
                        }
                        k5l0VarI0.e(0L);
                        k5l0VarI0.L(0L);
                        k5l0VarI0.M(0L);
                        k5l0VarI0.O(str15);
                        k5l0VarI0.Q(j2);
                        k5l0VarI0.R(str14);
                        k5l0VarI0.S(j6);
                        k5l0VarI0.a(j8);
                        k5l0VarI0.d(z10);
                        k5l0VarI0.c(j4);
                        i = 0;
                        iol0Var.g0().j0(k5l0VarI0, false);
                    } else {
                        i = 0;
                        iol0Var = this;
                    }
                    if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                        String strE10 = k5l0VarI0.E();
                        hm20.h(strE10);
                        l8l0VarV.z(strE10);
                    }
                    if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                        String strJ10 = k5l0VarI0.J();
                        hm20.h(strJ10);
                        l8l0VarV.P(strJ10);
                    }
                    listB0 = iol0Var.g0().b0(str6);
                    i2 = i;
                    while (i2 < listB0.size()) {
                        q9l0 q9l0VarB10 = s9l0.B();
                        String str311118 = ((uol0) listB0.get(i2)).c;
                        q9l0VarB10.g();
                        ((s9l0) q9l0VarB10.b).D(str311118);
                        long j119 = ((uol0) listB0.get(i2)).d;
                        q9l0VarB10.g();
                        ((s9l0) q9l0VarB10.b).C(j119);
                        iol0Var.j0().A(q9l0VarB10, ((uol0) listB0.get(i2)).e);
                        l8l0VarV.e0(q9l0VarB10);
                        if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                            p7l0 p7l0Var114 = k5l0VarI0.a.g;
                            k8l0.m(p7l0Var114);
                            p7l0Var114.g();
                            if (k5l0VarI0.w != 0) {
                                pol0VarJ0 = iol0Var.j0();
                                if (TextUtils.isEmpty(str12)) {
                                    str18 = str12;
                                    jM = 0;
                                } else {
                                    str18 = str12;
                                    jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                                }
                                p7l0 p7l0Var115 = k5l0VarI0.a.g;
                                k8l0.m(p7l0Var115);
                                p7l0Var115.g();
                                if (jM != k5l0VarI0.w) {
                                    l8l0VarV.g();
                                    ((n8l0) l8l0VarV.b).a1();
                                }
                            } else {
                                str18 = str12;
                            }
                        } else {
                            str18 = str12;
                        }
                        i2++;
                        str12 = str18;
                    }
                    lqk0VarG2 = iol0Var.g0();
                    n8l0 n8l0Var10 = (n8l0) l8l0VarV.i();
                    lqk0VarG2.g();
                    lqk0VarG2.h();
                    hm20.e(n8l0Var10.q());
                    byte[] bArrE19 = n8l0Var10.e();
                    long jM11 = lqk0VarG2.b.j0().M(bArrE19);
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put(PublisherMetadata.APP_ID, n8l0Var10.q());
                    contentValues11.put("metadata_fingerprint", Long.valueOf(jM11));
                    contentValues11.put("metadata", bArrE19);
                    lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues11, 4);
                    lqk0VarG3 = iol0Var.g0();
                    isk0Var3 = isk0Var2;
                    it2 = isk0Var3.f.a.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            e7l0 e7l0VarF10 = iol0Var.f0();
                            String str311119 = isk0Var3.a;
                            zW = e7l0VarF10.w(str311119, isk0Var3.b);
                            wpk0 wpk0VarK9 = iol0Var.g0().k0(iol0Var.g(), str311119, false, false, false, false);
                            if (zW) {
                            }
                            i3 = i;
                            break;
                        }
                        if ("_r".equals(it2.next())) {
                        }
                        i3 = 1;
                        break;
                    }
                    lqk0VarG3.g();
                    lqk0VarG3.h();
                    str17 = isk0Var3.a;
                    hm20.e(str17);
                    byte[] bArrE110 = lqk0VarG3.b.j0().D(isk0Var3).e();
                    contentValues = new ContentValues();
                    contentValues.put(PublisherMetadata.APP_ID, str17);
                    contentValues.put("name", isk0Var3.b);
                    contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                    contentValues.put("metadata_fingerprint", Long.valueOf(jM11));
                    contentValues.put("data", bArrE110);
                    contentValues.put("realtime", Integer.valueOf(i3));
                    if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                        lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                    } else {
                        iol0Var.o = 0L;
                    }
                    iol0Var.g0().T();
                    iol0Var.g0().U();
                    iol0Var.N();
                    iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                    return;
                }
                k8l0Var2 = k8l0Var2;
                isk0Var2 = isk0Var2;
                k8l0Var2.p().i();
                String str3111110 = Build.MODEL;
                l8l0VarV.o();
                k8l0Var2.p().i();
                String str3111111 = Build.VERSION.RELEASE;
                l8l0VarV.g();
                ((n8l0) l8l0VarV.b).p0(str3111111);
                l8l0VarV.q((int) k8l0Var2.p().k());
                l8l0VarV.p(k8l0Var2.p().l());
                l8l0VarV.X(zzrVar.L);
                if (k8l0Var2.f()) {
                    l8l0VarV.s();
                    if (!TextUtils.isEmpty(null)) {
                        l8l0VarV.g();
                        ((n8l0) l8l0VarV.b).S0(null);
                        throw null;
                    }
                }
                k5l0VarI0 = g0().i0(str6);
                if (k5l0VarI0 == null) {
                    k5l0VarI0 = new k5l0(k8l0Var2, str6);
                    iol0Var = this;
                    k5l0VarI0.F(iol0Var.o(jbl0VarJ2));
                    k5l0VarI0.K(zzrVar.z);
                    k5l0VarI0.H(str16);
                    if (jbl0VarJ2.i(hbl0Var)) {
                        k5l0VarI0.I(iol0Var.i.l(str6, z9));
                    }
                    k5l0VarI0.e(0L);
                    k5l0VarI0.L(0L);
                    k5l0VarI0.M(0L);
                    k5l0VarI0.O(str15);
                    k5l0VarI0.Q(j2);
                    k5l0VarI0.R(str14);
                    k5l0VarI0.S(j6);
                    k5l0VarI0.a(j8);
                    k5l0VarI0.d(z10);
                    k5l0VarI0.c(j4);
                    i = 0;
                    iol0Var.g0().j0(k5l0VarI0, false);
                } else {
                    i = 0;
                    iol0Var = this;
                }
                if (jbl0VarJ2.i(hbl0.ANALYTICS_STORAGE)) {
                    String strE11 = k5l0VarI0.E();
                    hm20.h(strE11);
                    l8l0VarV.z(strE11);
                }
                if (!TextUtils.isEmpty(k5l0VarI0.J())) {
                    String strJ11 = k5l0VarI0.J();
                    hm20.h(strJ11);
                    l8l0VarV.P(strJ11);
                }
                listB0 = iol0Var.g0().b0(str6);
                i2 = i;
                while (i2 < listB0.size()) {
                    q9l0 q9l0VarB11 = s9l0.B();
                    String str3111112 = ((uol0) listB0.get(i2)).c;
                    q9l0VarB11.g();
                    ((s9l0) q9l0VarB11.b).D(str3111112);
                    long j1110 = ((uol0) listB0.get(i2)).d;
                    q9l0VarB11.g();
                    ((s9l0) q9l0VarB11.b).C(j1110);
                    iol0Var.j0().A(q9l0VarB11, ((uol0) listB0.get(i2)).e);
                    l8l0VarV.e0(q9l0VarB11);
                    if ("_sid".equals(((uol0) listB0.get(i2)).c)) {
                        p7l0 p7l0Var116 = k5l0VarI0.a.g;
                        k8l0.m(p7l0Var116);
                        p7l0Var116.g();
                        if (k5l0VarI0.w != 0) {
                            pol0VarJ0 = iol0Var.j0();
                            if (TextUtils.isEmpty(str12)) {
                                str18 = str12;
                                jM = 0;
                            } else {
                                str18 = str12;
                                jM = pol0VarJ0.M(str18.getBytes(Charset.forName("UTF-8")));
                            }
                            p7l0 p7l0Var117 = k5l0VarI0.a.g;
                            k8l0.m(p7l0Var117);
                            p7l0Var117.g();
                            if (jM != k5l0VarI0.w) {
                                l8l0VarV.g();
                                ((n8l0) l8l0VarV.b).a1();
                            }
                        } else {
                            str18 = str12;
                        }
                    } else {
                        str18 = str12;
                    }
                    i2++;
                    str12 = str18;
                }
                lqk0VarG2 = iol0Var.g0();
                n8l0 n8l0Var11 = (n8l0) l8l0VarV.i();
                lqk0VarG2.g();
                lqk0VarG2.h();
                hm20.e(n8l0Var11.q());
                byte[] bArrE111 = n8l0Var11.e();
                long jM12 = lqk0VarG2.b.j0().M(bArrE111);
                ContentValues contentValues12 = new ContentValues();
                contentValues12.put(PublisherMetadata.APP_ID, n8l0Var11.q());
                contentValues12.put("metadata_fingerprint", Long.valueOf(jM12));
                contentValues12.put("metadata", bArrE111);
                lqk0VarG2.V().insertWithOnConflict("raw_events_metadata", null, contentValues12, 4);
                lqk0VarG3 = iol0Var.g0();
                isk0Var3 = isk0Var2;
                it2 = isk0Var3.f.a.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        e7l0 e7l0VarF11 = iol0Var.f0();
                        String str3111113 = isk0Var3.a;
                        zW = e7l0VarF11.w(str3111113, isk0Var3.b);
                        wpk0 wpk0VarK10 = iol0Var.g0().k0(iol0Var.g(), str3111113, false, false, false, false);
                        if (zW) {
                        }
                        i3 = i;
                        break;
                    }
                    if ("_r".equals(it2.next())) {
                    }
                    i3 = 1;
                    break;
                }
                lqk0VarG3.g();
                lqk0VarG3.h();
                str17 = isk0Var3.a;
                hm20.e(str17);
                byte[] bArrE112 = lqk0VarG3.b.j0().D(isk0Var3).e();
                contentValues = new ContentValues();
                contentValues.put(PublisherMetadata.APP_ID, str17);
                contentValues.put("name", isk0Var3.b);
                contentValues.put(EventKeys.TIMESTAMP, Long.valueOf(isk0Var3.d));
                contentValues.put("metadata_fingerprint", Long.valueOf(jM12));
                contentValues.put("data", bArrE112);
                contentValues.put("realtime", Integer.valueOf(i3));
                if (lqk0VarG3.V().insert(str7, null, contentValues) == -1) {
                    lqk0VarG3.a.a().f.b(y4l0.k(str17), "Failed to insert raw event (got -1). appId");
                } else {
                    iol0Var.o = 0L;
                }
                iol0Var.g0().T();
                iol0Var.g0().U();
                iol0Var.N();
                iol0Var.a().n.b(Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000), "Background event processing time, ms");
                return;
                iol0Var.g0().U();
                throw th;
            }
            if (jIntValue % 1000 == 1) {
                a().f.c(y4l0.k(str5), "Data loss. Too many events logged. appId, count", Long.valueOf(wpk0VarL0.b));
            }
            g0().T();
            g0().U();
        } catch (Throwable th3) {
            th = th3;
            iol0Var = this;
        }
    }

    public final void n(k5l0 k5l0Var, l8l0 l8l0Var) {
        Serializable serializableV;
        b().g();
        l0();
        f5l0 f5l0VarP = w5l0.P();
        k8l0 k8l0Var = k5l0Var.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        byte[] bArr = k5l0Var.H;
        if (bArr != null) {
            try {
                f5l0VarP = (f5l0) pol0.O(f5l0VarP, bArr);
            } catch (oil0 unused) {
                a().i.b(y4l0.k(k5l0Var.D()), "Failed to parse locally stored ad campaign info. appId");
            }
        }
        Iterator it = l8l0Var.Z().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d7l0 d7l0Var = (d7l0) it.next();
            if (d7l0Var.t().equals("_cmp")) {
                k7l0 k7l0VarO = pol0.o("gclid", d7l0Var);
                Serializable serializableV2 = k7l0VarO == null ? null : pol0.v(k7l0VarO);
                if (serializableV2 == null) {
                    serializableV2 = "";
                }
                String str = (String) serializableV2;
                k7l0 k7l0VarO2 = pol0.o("gbraid", d7l0Var);
                Serializable serializableV3 = k7l0VarO2 == null ? null : pol0.v(k7l0VarO2);
                if (serializableV3 == null) {
                    serializableV3 = "";
                }
                String str2 = (String) serializableV3;
                k7l0 k7l0VarO3 = pol0.o(xOgHBQVl.LodaiNwBqRFcF, d7l0Var);
                Serializable serializableV4 = k7l0VarO3 == null ? null : pol0.v(k7l0VarO3);
                String str3 = (String) (serializableV4 != null ? serializableV4 : "");
                String[] strArrSplit = ((String) v2l0.g1.a(null)).split(",");
                j0();
                HashMap map = new HashMap();
                for (k7l0 k7l0Var : d7l0Var.q()) {
                    if (Arrays.asList(strArrSplit).contains(k7l0Var.r()) && (serializableV = pol0.v(k7l0Var)) != null) {
                        map.put(k7l0Var.r(), serializableV);
                    }
                }
                if (!map.isEmpty()) {
                    k7l0 k7l0VarO4 = pol0.o("click_timestamp", d7l0Var);
                    Serializable serializableV5 = k7l0VarO4 == null ? null : pol0.v(k7l0VarO4);
                    long jLongValue = ((Long) (serializableV5 != null ? serializableV5 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = d7l0Var.v();
                    }
                    k7l0 k7l0VarO5 = pol0.o("_cis", d7l0Var);
                    if ("referrer API v2".equals(k7l0VarO5 != null ? pol0.v(k7l0VarO5) : null)) {
                        if (jLongValue > ((w5l0) f5l0VarP.b).O()) {
                            if (str.isEmpty()) {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).r();
                            } else {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).q(str);
                            }
                            if (str2.isEmpty()) {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).t();
                            } else {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).s(str2);
                            }
                            if (str3.isEmpty()) {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).v();
                            } else {
                                f5l0VarP.g();
                                ((w5l0) f5l0VarP.b).u(str3);
                            }
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).w(jLongValue);
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).y().clear();
                            HashMap mapG = G(d7l0Var);
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).y().putAll(mapG);
                        }
                    } else if (jLongValue > ((w5l0) f5l0VarP.b).G()) {
                        if (str.isEmpty()) {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).S();
                        } else {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).R(str);
                        }
                        if (str2.isEmpty()) {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).U();
                        } else {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).T(str2);
                        }
                        if (str3.isEmpty()) {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).W();
                        } else {
                            f5l0VarP.g();
                            ((w5l0) f5l0VarP.b).V(str3);
                        }
                        f5l0VarP.g();
                        ((w5l0) f5l0VarP.b).X(jLongValue);
                        f5l0VarP.g();
                        ((w5l0) f5l0VarP.b).x().clear();
                        HashMap mapG2 = G(d7l0Var);
                        f5l0VarP.g();
                        ((w5l0) f5l0VarP.b).x().putAll(mapG2);
                    }
                }
            }
        }
        if (!((w5l0) f5l0VarP.i()).equals(w5l0.Q())) {
            w5l0 w5l0Var = (w5l0) f5l0VarP.i();
            l8l0Var.g();
            ((n8l0) l8l0Var.b).l1(w5l0Var);
        }
        byte[] bArrE = ((w5l0) f5l0VarP.i()).e();
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.g();
        k5l0Var.Q |= k5l0Var.H != bArrE;
        k5l0Var.H = bArrE;
        if (k5l0Var.o()) {
            lqk0 lqk0Var = this.c;
            U(lqk0Var);
            lqk0Var.j0(k5l0Var, false);
        }
        if (e0().q(null, v2l0.f1)) {
            lqk0 lqk0Var2 = this.c;
            U(lqk0Var2);
            lqk0Var2.Y(k5l0Var.D(), "_lgclid");
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0227  */
    /* JADX WARN: Code duplicated, block: B:115:0x0240  */
    /* JADX WARN: Code duplicated, block: B:117:0x0250  */
    /* JADX WARN: Code duplicated, block: B:119:0x025c  */
    /* JADX WARN: Code duplicated, block: B:145:0x036f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:175:0x0447 A[LOOP:10: B:151:0x03c7->B:175:0x0447, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x044d  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f A[PHI: r0 r11 r23 r24
      0x006f: PHI (r0v113 java.util.List) = (r0v7 java.util.List), (r0v136 java.util.List) binds: [B:108:0x021b, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v55 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v57 android.database.Cursor) binds: [B:108:0x021b, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r23v17 ??) = (r23v35 ??), (r23v36 ??) binds: [B:108:0x021b, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x021b, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x0481  */
    /* JADX WARN: Code duplicated, block: B:191:0x048f  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:204:0x050c  */
    /* JADX WARN: Code duplicated, block: B:206:0x050f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0515 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0517  */
    /* JADX WARN: Code duplicated, block: B:210:0x0519  */
    /* JADX WARN: Code duplicated, block: B:211:0x051b  */
    /* JADX WARN: Code duplicated, block: B:212:0x051d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0522  */
    /* JADX WARN: Code duplicated, block: B:216:0x0532  */
    /* JADX WARN: Code duplicated, block: B:218:0x0535  */
    /* JADX WARN: Code duplicated, block: B:219:0x0537  */
    /* JADX WARN: Code duplicated, block: B:224:0x0570  */
    /* JADX WARN: Code duplicated, block: B:226:0x0574  */
    /* JADX WARN: Code duplicated, block: B:230:0x057d  */
    /* JADX WARN: Code duplicated, block: B:233:0x058b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0595  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:251:0x05e1 A[EDGE_INSN: B:251:0x05e1->B:252:0x05e2 BREAK  A[LOOP:3: B:242:0x05b2->B:250:0x05de]] */
    /* JADX WARN: Code duplicated, block: B:254:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:257:0x0609  */
    /* JADX WARN: Code duplicated, block: B:261:0x0638  */
    /* JADX WARN: Code duplicated, block: B:263:0x0679  */
    /* JADX WARN: Code duplicated, block: B:265:0x0685  */
    /* JADX WARN: Code duplicated, block: B:267:0x069b  */
    /* JADX WARN: Code duplicated, block: B:270:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:272:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:275:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:278:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:279:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:283:0x0702  */
    /* JADX WARN: Code duplicated, block: B:287:0x072a  */
    /* JADX WARN: Code duplicated, block: B:291:0x073f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0752  */
    /* JADX WARN: Code duplicated, block: B:299:0x0770  */
    /* JADX WARN: Code duplicated, block: B:301:0x0786  */
    /* JADX WARN: Code duplicated, block: B:305:0x0795  */
    /* JADX WARN: Code duplicated, block: B:307:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:310:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:315:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:317:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:319:0x0806  */
    /* JADX WARN: Code duplicated, block: B:320:0x0808  */
    /* JADX WARN: Code duplicated, block: B:323:0x080d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:324:0x080f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0811  */
    /* JADX WARN: Code duplicated, block: B:326:0x0814  */
    /* JADX WARN: Code duplicated, block: B:330:0x0829  */
    /* JADX WARN: Code duplicated, block: B:336:0x0859  */
    /* JADX WARN: Code duplicated, block: B:339:0x0871  */
    /* JADX WARN: Code duplicated, block: B:343:0x0887 A[LOOP:7: B:341:0x0881->B:343:0x0887, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:347:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:350:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:353:0x0914 A[LOOP:8: B:351:0x090e->B:353:0x0914, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:356:0x0965  */
    /* JADX WARN: Code duplicated, block: B:358:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:360:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:362:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:365:0x09d6  */
    /* JADX WARN: Code duplicated, block: B:367:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:370:0x09e6 A[LOOP:9: B:368:0x09e0->B:370:0x09e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:373:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:430:0x05ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:? A[LOOP:2: B:234:0x058f->B:432:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x05e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x07db A[EDGE_INSN: B:435:0x07db->B:313:0x07db BREAK  A[LOOP:4: B:259:0x0634->B:312:0x07cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0761 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0734 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x071c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x083e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:? A[LOOP:6: B:328:0x0823->B:447:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x0408 A[EDGE_INSN: B:451:0x0408->B:164:0x0408 BREAK  A[LOOP:10: B:151:0x03c7->B:175:0x0447], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v2, types: [k8l0] */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24 */
    /* JADX WARN: Type inference failed for: r23v25, types: [k8l0] */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27 */
    /* JADX WARN: Type inference failed for: r23v28 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v32 */
    /* JADX WARN: Type inference failed for: r23v34 */
    /* JADX WARN: Type inference failed for: r23v35 */
    /* JADX WARN: Type inference failed for: r23v36 */
    /* JADX WARN: Type inference failed for: r23v37 */
    /* JADX WARN: Type inference failed for: r23v38 */
    /* JADX WARN: Type inference failed for: r23v39 */
    /* JADX WARN: Type inference failed for: r23v40 */
    /* JADX WARN: Type inference failed for: r23v41 */
    /* JADX WARN: Type inference failed for: r23v42 */
    /* JADX WARN: Type inference failed for: r23v43 */
    /* JADX WARN: Type inference failed for: r23v44 */
    /* JADX WARN: Type inference failed for: r23v45 */
    /* JADX WARN: Type inference failed for: r23v46 */
    /* JADX WARN: Type inference failed for: r23v47 */
    /* JADX WARN: Type inference failed for: r23v48 */
    /* JADX WARN: Type inference failed for: r23v49 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r31v0, types: [iol0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [k8l0] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [k8l0] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    public final void r(long j, String str) throws Throwable {
        Cursor cursor;
        long j2;
        Cursor cursorQuery;
        List list;
        ?? r23;
        List<Pair> list2;
        xol0 xol0Var;
        t2l0 t2l0Var;
        boolean zQ;
        hbl0 hbl0Var;
        List list3;
        jbl0 jbl0VarF;
        hbl0 hbl0Var2;
        int i;
        List listSubList;
        q7l0 q7l0VarX;
        int size;
        ArrayList arrayList;
        int i2;
        boolean zI;
        boolean zI2;
        boolean zQ2;
        zml0 zml0Var;
        xml0 xml0VarH;
        List list4;
        k8l0 k8l0Var;
        j8l0 j8l0Var;
        ArrayList arrayList2;
        egl0 egl0Var;
        boolean z;
        boolean z2;
        String str2;
        i5l0 i5l0Var;
        String strE;
        Iterator it;
        String string;
        q7l0 q7l0VarY;
        String strT;
        ArrayList arrayList3;
        Iterator it2;
        String strL;
        j8l0 j8l0Var2;
        q7l0 q7l0Var;
        int i3;
        q7l0 q7l0VarX2;
        String strT2;
        boolean zIsEmpty;
        egl0 egl0Var2;
        egl0 egl0Var3;
        xml0 xml0Var;
        l8l0 l8l0Var;
        String strW;
        int i4;
        ArrayList arrayList4;
        Iterator it3;
        boolean z3;
        Long lValueOf;
        Long lValueOf2;
        boolean z4;
        boolean z5;
        int i5;
        List list5;
        boolean z6;
        d7l0 d7l0Var;
        k7l0 k7l0VarO;
        k7l0 k7l0VarO2;
        o9l0 o9l0Var;
        Iterator it4;
        String strW2;
        int i6;
        n8l0 n8l0Var;
        n8l0 n8l0Var2;
        List list6;
        boolean zIsEmpty2;
        ArrayList arrayList5;
        k8l0 k8l0Var2;
        ArrayList arrayList6;
        ?? r14;
        k8l0 k8l0Var3;
        List list7;
        Cursor cursorQuery2;
        List list8;
        List list9;
        Iterator it5;
        boolean z7;
        l8l0 l8l0Var2;
        w3l0 w3l0VarB;
        ArrayList arrayList7;
        Iterator it6;
        int iQ;
        Iterator it7;
        int i7;
        int i8;
        int iS;
        SQLiteDatabase sQLiteDatabaseV;
        long jCurrentTimeMillis;
        List list10;
        ?? r24;
        ?? r25;
        lqk0 lqk0Var;
        long jW;
        long jW2;
        String str3 = str;
        int iO = e0().o(str3, v2l0.h);
        int i9 = 0;
        int iMax = Math.max(0, e0().o(str3, v2l0.i));
        lqk0 lqk0VarG0 = g0();
        ?? r9 = lqk0VarG0.a;
        lqk0VarG0.g();
        lqk0VarG0.h();
        int i10 = 1;
        hm20.b(iO > 0);
        hm20.b(iMax > 0);
        hm20.e(str3);
        try {
            try {
                SQLiteDatabase sQLiteDatabaseV2 = lqk0VarG0.V();
                String str4 = LhMGMAwwhzjwfz.lxSTQemylWaad;
                j2 = -1;
                try {
                    String strValueOf = String.valueOf(iO);
                    cursorQuery = sQLiteDatabaseV2.query(str4, new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str3}, null, null, "rowid", strValueOf);
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList8 = new ArrayList();
                                int length = 0;
                                ?? r10 = r9;
                                ?? r26 = strValueOf;
                                while (true) {
                                    long j3 = cursorQuery.getLong(i9);
                                    try {
                                        byte[] blob = cursorQuery.getBlob(i10);
                                        pol0 pol0VarJ0 = lqk0VarG0.b.j0();
                                        try {
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr = new byte[1024];
                                            lqk0Var = lqk0VarG0;
                                            r10 = r10;
                                            r9 = r26;
                                            while (true) {
                                                try {
                                                    int i11 = gZIPInputStream.read(bArr);
                                                    if (i11 <= 0) {
                                                        break;
                                                    }
                                                    r9 = r10;
                                                    try {
                                                        byteArrayOutputStream.write(bArr, 0, i11);
                                                        r10 = r9;
                                                        r9 = r9;
                                                    } catch (IOException e) {
                                                        e = e;
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    r9 = r10;
                                                }
                                                try {
                                                    pol0VarJ0.a.a().f.b(e, "Failed to ungzip content");
                                                    throw e;
                                                } catch (IOException e3) {
                                                    e = e3;
                                                    r9.a().f.c(y4l0.k(str3), "Failed to unzip queued bundle. appId", e);
                                                    r9 = r9;
                                                    try {
                                                        if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                        cursorQuery.close();
                                                        list2 = arrayList8;
                                                        r23 = r9;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        r9.a().f.c(y4l0.k(str3), "Error querying bundles. appId", e);
                                                        list = Collections.EMPTY_LIST;
                                                        r25 = r9;
                                                        r24 = r9;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                            r24 = r25;
                                                        }
                                                        list2 = list;
                                                        r23 = r24;
                                                    }
                                                    if (list2.isEmpty()) {
                                                        return;
                                                    }
                                                    xol0Var = xol0.b;
                                                    wok0 wok0VarE0 = e0();
                                                    t2l0Var = v2l0.h1;
                                                    zQ = wok0VarE0.q(null, t2l0Var);
                                                    hbl0Var = hbl0.ANALYTICS_STORAGE;
                                                    if (zQ) {
                                                        if (!e0().q(null, t2l0Var)) {
                                                            list6 = list2;
                                                        } else if (f(str3).i(hbl0Var)) {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            lqk0 lqk0VarG1 = g0();
                                                            k8l0Var2 = lqk0VarG1.a;
                                                            hm20.e(str3);
                                                            lqk0VarG1.g();
                                                            lqk0VarG1.h();
                                                            arrayList6 = new ArrayList();
                                                            sQLiteDatabaseV = lqk0VarG1.V();
                                                            k8l0Var2.e().getClass();
                                                            jCurrentTimeMillis = System.currentTimeMillis();
                                                            cursorQuery2 = sQLiteDatabaseV.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                            k8l0Var3 = k8l0Var2;
                                                            if (cursorQuery2.moveToFirst()) {
                                                                list7 = list2;
                                                                while (true) {
                                                                    arrayList6.add((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorQuery2.getBlob(0))).i());
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    } else {
                                                                        cursorQuery2 = cursorQuery2;
                                                                        arrayList6 = arrayList6;
                                                                    }
                                                                }
                                                                cursorQuery2.close();
                                                                int iDelete = sQLiteDatabaseV.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                u4l0 u4l0Var = k8l0Var3.a().n;
                                                                StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
                                                                sb.append("Pruned ");
                                                                sb.append(iDelete);
                                                                sb.append(" NO_DATA mode events. appId");
                                                                u4l0Var.b(str3, sb.toString());
                                                                list10 = list7;
                                                            } else {
                                                                arrayList6 = arrayList6;
                                                                list10 = list2;
                                                                cursorQuery2.close();
                                                            }
                                                            list8 = arrayList6;
                                                            list9 = list10;
                                                            it5 = list9.iterator();
                                                            z7 = true;
                                                            while (it5.hasNext()) {
                                                                Pair pair = (Pair) it5.next();
                                                                l8l0Var2 = (l8l0) ((n8l0) pair.first).k();
                                                                if (z7) {
                                                                    List listZ = l8l0Var2.Z();
                                                                    l8l0Var2.g();
                                                                    ((n8l0) l8l0Var2.b).b0();
                                                                    l8l0Var2.g();
                                                                    ((n8l0) l8l0Var2.b).a0(list8);
                                                                    l8l0Var2.g();
                                                                    ((n8l0) l8l0Var2.b).a0(listZ);
                                                                    z7 = false;
                                                                }
                                                                k6l0 k6l0VarR = v6l0.r();
                                                                w3l0VarB = f0().B(str3);
                                                                arrayList7 = new ArrayList();
                                                                if (w3l0VarB != null) {
                                                                    it6 = w3l0VarB.q().iterator();
                                                                    while (it6.hasNext()) {
                                                                        o2l0 o2l0Var = (o2l0) it6.next();
                                                                        Iterator it8 = it5;
                                                                        p6l0 p6l0VarQ = q6l0.q();
                                                                        boolean z8 = z7;
                                                                        iQ = o2l0Var.q() - 1;
                                                                        List list11 = list8;
                                                                        if (iQ != 1) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 2;
                                                                        } else if (iQ != 2) {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            if (iQ != 3) {
                                                                                i8 = 4;
                                                                            } else if (iQ != 4) {
                                                                                i8 = 1;
                                                                            } else {
                                                                                i8 = 5;
                                                                            }
                                                                        } else {
                                                                            it7 = it6;
                                                                            i7 = 3;
                                                                            i8 = 3;
                                                                        }
                                                                        p6l0VarQ.l(i8);
                                                                        iS = o2l0Var.s() - 1;
                                                                        if (iS != 1) {
                                                                            i7 = 2;
                                                                        } else if (iS != 2) {
                                                                            i7 = 1;
                                                                        }
                                                                        p6l0VarQ.m(i7);
                                                                        arrayList7.add((q6l0) p6l0VarQ.i());
                                                                        it5 = it8;
                                                                        list8 = list11;
                                                                        z7 = z8;
                                                                        it6 = it7;
                                                                    }
                                                                }
                                                                Iterator it9 = it5;
                                                                boolean z9 = z7;
                                                                List list12 = list8;
                                                                k6l0VarR.l(arrayList7);
                                                                l8l0Var2.J(k6l0VarR);
                                                                arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair.second));
                                                                it5 = it9;
                                                                list8 = list12;
                                                                z7 = z9;
                                                            }
                                                            list6 = arrayList5;
                                                        } else {
                                                            arrayList5 = new ArrayList(list2.size());
                                                            lqk0 lqk0VarG2 = g0();
                                                            k8l0Var2 = lqk0VarG2.a;
                                                            hm20.e(str3);
                                                            lqk0VarG2.g();
                                                            lqk0VarG2.h();
                                                            arrayList6 = new ArrayList();
                                                            try {
                                                                try {
                                                                    try {
                                                                        sQLiteDatabaseV = lqk0VarG2.V();
                                                                        k8l0Var2.e().getClass();
                                                                        jCurrentTimeMillis = System.currentTimeMillis();
                                                                        cursorQuery2 = sQLiteDatabaseV.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                                                        k8l0Var3 = k8l0Var2;
                                                                        try {
                                                                            try {
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    list7 = list2;
                                                                                    while (true) {
                                                                                        try {
                                                                                            try {
                                                                                                arrayList6.add((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorQuery2.getBlob(0))).i());
                                                                                            } catch (SQLiteException e5) {
                                                                                                e = e5;
                                                                                                cursorQuery2 = cursorQuery2;
                                                                                                k8l0Var3.a().f.c(y4l0.k(str3), "Error flushing NO_DATA mode events. appId", e);
                                                                                                list8 = Collections.EMPTY_LIST;
                                                                                                list9 = list7;
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                    list9 = list7;
                                                                                                }
                                                                                                it5 = list9.iterator();
                                                                                                z7 = true;
                                                                                                while (it5.hasNext()) {
                                                                                                    Pair pair2 = (Pair) it5.next();
                                                                                                    l8l0Var2 = (l8l0) ((n8l0) pair2.first).k();
                                                                                                    if (z7) {
                                                                                                        List listZ2 = l8l0Var2.Z();
                                                                                                        l8l0Var2.g();
                                                                                                        ((n8l0) l8l0Var2.b).b0();
                                                                                                        l8l0Var2.g();
                                                                                                        ((n8l0) l8l0Var2.b).a0(list8);
                                                                                                        l8l0Var2.g();
                                                                                                        ((n8l0) l8l0Var2.b).a0(listZ2);
                                                                                                        z7 = false;
                                                                                                    }
                                                                                                    k6l0 k6l0VarR2 = v6l0.r();
                                                                                                    w3l0VarB = f0().B(str3);
                                                                                                    arrayList7 = new ArrayList();
                                                                                                    if (w3l0VarB != null) {
                                                                                                        it6 = w3l0VarB.q().iterator();
                                                                                                        while (it6.hasNext()) {
                                                                                                            o2l0 o2l0Var2 = (o2l0) it6.next();
                                                                                                            Iterator it10 = it5;
                                                                                                            p6l0 p6l0VarQ2 = q6l0.q();
                                                                                                            boolean z10 = z7;
                                                                                                            iQ = o2l0Var2.q() - 1;
                                                                                                            List list13 = list8;
                                                                                                            if (iQ != 1) {
                                                                                                                it7 = it6;
                                                                                                                i7 = 3;
                                                                                                                i8 = 2;
                                                                                                            } else if (iQ != 2) {
                                                                                                                it7 = it6;
                                                                                                                i7 = 3;
                                                                                                                if (iQ != 3) {
                                                                                                                    i8 = 4;
                                                                                                                } else if (iQ != 4) {
                                                                                                                    i8 = 1;
                                                                                                                } else {
                                                                                                                    i8 = 5;
                                                                                                                }
                                                                                                            } else {
                                                                                                                it7 = it6;
                                                                                                                i7 = 3;
                                                                                                                i8 = 3;
                                                                                                            }
                                                                                                            p6l0VarQ2.l(i8);
                                                                                                            iS = o2l0Var2.s() - 1;
                                                                                                            if (iS != 1) {
                                                                                                                i7 = 2;
                                                                                                            } else if (iS != 2) {
                                                                                                                i7 = 1;
                                                                                                            }
                                                                                                            p6l0VarQ2.m(i7);
                                                                                                            arrayList7.add((q6l0) p6l0VarQ2.i());
                                                                                                            it5 = it10;
                                                                                                            list8 = list13;
                                                                                                            z7 = z10;
                                                                                                            it6 = it7;
                                                                                                        }
                                                                                                    }
                                                                                                    Iterator it11 = it5;
                                                                                                    boolean z11 = z7;
                                                                                                    List list14 = list8;
                                                                                                    k6l0VarR2.l(arrayList7);
                                                                                                    l8l0Var2.J(k6l0VarR2);
                                                                                                    arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair2.second));
                                                                                                    it5 = it11;
                                                                                                    list8 = list14;
                                                                                                    z7 = z11;
                                                                                                }
                                                                                                list6 = arrayList5;
                                                                                                zIsEmpty2 = list6.isEmpty();
                                                                                                list3 = list6;
                                                                                                if (zIsEmpty2) {
                                                                                                    return;
                                                                                                }
                                                                                                jbl0VarF = f(str3);
                                                                                                hbl0Var2 = hbl0.AD_STORAGE;
                                                                                                if (jbl0VarF.i(hbl0Var2)) {
                                                                                                    i = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                it4 = list3.iterator();
                                                                                                while (true) {
                                                                                                    if (it4.hasNext()) {
                                                                                                        strW2 = null;
                                                                                                        break;
                                                                                                    }
                                                                                                    n8l0Var2 = (n8l0) ((Pair) it4.next()).first;
                                                                                                    if (!n8l0Var2.w().isEmpty()) {
                                                                                                        strW2 = n8l0Var2.w();
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (strW2 != null) {
                                                                                                    i = 0;
                                                                                                    listSubList = list3;
                                                                                                    break;
                                                                                                }
                                                                                                i6 = 0;
                                                                                                while (true) {
                                                                                                    if (i6 < list3.size()) {
                                                                                                        i = 0;
                                                                                                        listSubList = list3;
                                                                                                        break;
                                                                                                    }
                                                                                                    n8l0Var = (n8l0) ((Pair) list3.get(i6)).first;
                                                                                                    if (!n8l0Var.w().isEmpty()) {
                                                                                                        i = 0;
                                                                                                        listSubList = list3.subList(0, i6);
                                                                                                        break;
                                                                                                    }
                                                                                                    i6++;
                                                                                                }
                                                                                                q7l0VarX = j8l0.x();
                                                                                                size = listSubList.size();
                                                                                                arrayList = new ArrayList(listSubList.size());
                                                                                                if (e0().h(str3)) {
                                                                                                    i2 = i;
                                                                                                } else {
                                                                                                    i2 = i;
                                                                                                }
                                                                                                zI = f(str3).i(hbl0Var2);
                                                                                                zI2 = f(str3).i(hbl0Var);
                                                                                                zQ2 = e0().q(str3, v2l0.M0);
                                                                                                zml0Var = this.j;
                                                                                                xml0VarH = zml0Var.h(str3);
                                                                                                list4 = listSubList;
                                                                                                while (true) {
                                                                                                    k8l0Var = this.l;
                                                                                                    if (i < size) {
                                                                                                        break;
                                                                                                    }
                                                                                                    l8l0Var = (l8l0) ((n8l0) ((Pair) list4.get(i)).first).k();
                                                                                                    int i12 = i;
                                                                                                    arrayList.add((Long) ((Pair) list4.get(i)).second);
                                                                                                    e0().l();
                                                                                                    l8l0Var.w();
                                                                                                    l8l0Var.g();
                                                                                                    ((n8l0) l8l0Var.b).g0(j);
                                                                                                    k8l0Var.getClass();
                                                                                                    l8l0Var.N();
                                                                                                    if (i2 == 0) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).T0();
                                                                                                    }
                                                                                                    if (!zI) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).A1();
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).C1();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).E1();
                                                                                                    }
                                                                                                    v(str3, l8l0Var);
                                                                                                    if (!zQ2) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).a1();
                                                                                                    }
                                                                                                    if (!zI2) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).M1();
                                                                                                    }
                                                                                                    strW = ((n8l0) l8l0Var.b).w();
                                                                                                    if (TextUtils.isEmpty(strW)) {
                                                                                                        i4 = size;
                                                                                                    } else {
                                                                                                        i4 = size;
                                                                                                        if (strW.equals("00000000-0000-0000-0000-000000000000")) {
                                                                                                            z3 = zI2;
                                                                                                            i5 = i2;
                                                                                                            list5 = list4;
                                                                                                            z6 = zQ2;
                                                                                                        }
                                                                                                        if (l8l0Var.a0() != 0) {
                                                                                                            if (e0().q(str3, v2l0.C0)) {
                                                                                                                l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                                                                                            }
                                                                                                            o9l0Var = xml0VarH.d;
                                                                                                            if (o9l0Var != null) {
                                                                                                                l8l0Var.F(o9l0Var);
                                                                                                            }
                                                                                                            q7l0VarX.g();
                                                                                                            ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                                                                                                        }
                                                                                                        i = i12 + 1;
                                                                                                        size = i4;
                                                                                                        zI2 = z3;
                                                                                                        list4 = list5;
                                                                                                        i2 = i5;
                                                                                                        zQ2 = z6;
                                                                                                    }
                                                                                                    arrayList4 = new ArrayList(l8l0Var.Z());
                                                                                                    it3 = arrayList4.iterator();
                                                                                                    z3 = zI2;
                                                                                                    lValueOf = null;
                                                                                                    lValueOf2 = null;
                                                                                                    z4 = false;
                                                                                                    z5 = false;
                                                                                                    while (it3.hasNext()) {
                                                                                                        i2 = i2;
                                                                                                        d7l0Var = (d7l0) it3.next();
                                                                                                        list4 = list4;
                                                                                                        zQ2 = zQ2;
                                                                                                        if ("_fx".equals(d7l0Var.t())) {
                                                                                                            it3.remove();
                                                                                                            z4 = true;
                                                                                                        } else if ("_f".equals(d7l0Var.t())) {
                                                                                                            j0();
                                                                                                            k7l0VarO = pol0.o("_pfo", d7l0Var);
                                                                                                            if (k7l0VarO != null) {
                                                                                                                lValueOf = Long.valueOf(k7l0VarO.v());
                                                                                                            }
                                                                                                            j0();
                                                                                                            k7l0VarO2 = pol0.o("_uwa", d7l0Var);
                                                                                                            if (k7l0VarO2 != null) {
                                                                                                                lValueOf2 = Long.valueOf(k7l0VarO2.v());
                                                                                                            }
                                                                                                        } else {
                                                                                                            list4 = list4;
                                                                                                            i2 = i2;
                                                                                                            zQ2 = zQ2;
                                                                                                        }
                                                                                                        z5 = true;
                                                                                                    }
                                                                                                    i5 = i2;
                                                                                                    list5 = list4;
                                                                                                    z6 = zQ2;
                                                                                                    if (z4) {
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).b0();
                                                                                                        l8l0Var.g();
                                                                                                        ((n8l0) l8l0Var.b).a0(arrayList4);
                                                                                                    }
                                                                                                    if (z5) {
                                                                                                        u(l8l0Var.s(), true, lValueOf, lValueOf2);
                                                                                                    }
                                                                                                    if (l8l0Var.a0() != 0) {
                                                                                                        if (e0().q(str3, v2l0.C0)) {
                                                                                                            l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                                                                                        }
                                                                                                        o9l0Var = xml0VarH.d;
                                                                                                        if (o9l0Var != null) {
                                                                                                            l8l0Var.F(o9l0Var);
                                                                                                        }
                                                                                                        q7l0VarX.g();
                                                                                                        ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                                                                                                    }
                                                                                                    i = i12 + 1;
                                                                                                    size = i4;
                                                                                                    zI2 = z3;
                                                                                                    list4 = list5;
                                                                                                    i2 = i5;
                                                                                                    zQ2 = z6;
                                                                                                }
                                                                                                if (((j8l0) q7l0VarX.b).r() == 0) {
                                                                                                    p(arrayList);
                                                                                                    y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                                                                    return;
                                                                                                }
                                                                                                j8l0Var = (j8l0) q7l0VarX.i();
                                                                                                arrayList2 = new ArrayList();
                                                                                                egl0Var = xml0VarH.c;
                                                                                                if (egl0Var == egl0.SGTM_CLIENT) {
                                                                                                    z = true;
                                                                                                } else {
                                                                                                    z = false;
                                                                                                }
                                                                                                if (egl0Var != egl0.SGTM) {
                                                                                                    if (z) {
                                                                                                        z2 = true;
                                                                                                    } else {
                                                                                                        str2 = null;
                                                                                                    }
                                                                                                    i5l0Var = this.b;
                                                                                                    U(i5l0Var);
                                                                                                    if (i5l0Var.k()) {
                                                                                                        if (Log.isLoggable(a().m(), 2)) {
                                                                                                            strE = j0().E(j8l0Var);
                                                                                                        } else {
                                                                                                            strE = str2;
                                                                                                        }
                                                                                                        j0();
                                                                                                        byte[] bArrE = j8l0Var.e();
                                                                                                        p(arrayList);
                                                                                                        this.i.i.b(j);
                                                                                                        a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE.length), strE);
                                                                                                        this.u = true;
                                                                                                        U(i5l0Var);
                                                                                                        i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                                                                                        return;
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                z2 = z;
                                                                                                it = ((j8l0) q7l0VarX.i()).q().iterator();
                                                                                                while (true) {
                                                                                                    if (it.hasNext()) {
                                                                                                        if (((n8l0) it.next()).O()) {
                                                                                                            string = UUID.randomUUID().toString();
                                                                                                            break;
                                                                                                        }
                                                                                                    } else {
                                                                                                        string = null;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                j8l0 j8l0Var3 = (j8l0) q7l0VarX.i();
                                                                                                b().g();
                                                                                                l0();
                                                                                                q7l0VarY = j8l0.y(j8l0Var3);
                                                                                                if (!TextUtils.isEmpty(string)) {
                                                                                                    q7l0VarY.g();
                                                                                                    ((j8l0) q7l0VarY.b).D(string);
                                                                                                }
                                                                                                strT = f0().t(str3);
                                                                                                if (!TextUtils.isEmpty(strT)) {
                                                                                                    q7l0VarY.m(strT);
                                                                                                }
                                                                                                arrayList3 = new ArrayList();
                                                                                                it2 = j8l0Var3.q().iterator();
                                                                                                while (it2.hasNext()) {
                                                                                                    l8l0 l8l0VarW = n8l0.W((n8l0) it2.next());
                                                                                                    l8l0VarW.g();
                                                                                                    ((n8l0) l8l0VarW.b).T0();
                                                                                                    arrayList3.add((n8l0) l8l0VarW.i());
                                                                                                }
                                                                                                q7l0VarY.g();
                                                                                                ((j8l0) q7l0VarY.b).C();
                                                                                                q7l0VarY.g();
                                                                                                ((j8l0) q7l0VarY.b).B(arrayList3);
                                                                                                u4l0 u4l0Var2 = a().n;
                                                                                                if (TextUtils.isEmpty(string)) {
                                                                                                    strL = "null";
                                                                                                } else {
                                                                                                    strL = q7l0VarY.l();
                                                                                                }
                                                                                                u4l0Var2.b(strL, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                                                                j8l0Var2 = (j8l0) q7l0VarY.i();
                                                                                                if (TextUtils.isEmpty(string)) {
                                                                                                    str2 = null;
                                                                                                } else {
                                                                                                    j8l0 j8l0Var4 = (j8l0) q7l0VarX.i();
                                                                                                    b().g();
                                                                                                    l0();
                                                                                                    q7l0VarX2 = j8l0.x();
                                                                                                    a().n.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                                                                    q7l0VarX2.g();
                                                                                                    ((j8l0) q7l0VarX2.b).D(string);
                                                                                                    for (n8l0 n8l0Var3 : j8l0Var4.q()) {
                                                                                                        l8l0 l8l0VarV = n8l0.V();
                                                                                                        String strP = n8l0Var3.P();
                                                                                                        l8l0VarV.g();
                                                                                                        ((n8l0) l8l0VarV.b).S0(strP);
                                                                                                        int iL0 = n8l0Var3.L0();
                                                                                                        l8l0VarV.g();
                                                                                                        ((n8l0) l8l0VarV.b).k1(iL0);
                                                                                                        q7l0VarX2.g();
                                                                                                        ((j8l0) q7l0VarX2.b).A((n8l0) l8l0VarV.i());
                                                                                                    }
                                                                                                    j8l0 j8l0Var5 = (j8l0) q7l0VarX2.i();
                                                                                                    strT2 = zml0Var.b.f0().t(str3);
                                                                                                    zIsEmpty = TextUtils.isEmpty(strT2);
                                                                                                    egl0Var2 = egl0.GOOGLE_SIGNAL;
                                                                                                    egl0Var3 = egl0.GOOGLE_SIGNAL_PENDING;
                                                                                                    if (zIsEmpty) {
                                                                                                        str2 = null;
                                                                                                        String str5 = (String) v2l0.s.a(null);
                                                                                                        if (z2) {
                                                                                                            egl0Var2 = egl0Var3;
                                                                                                        }
                                                                                                        xml0Var = new xml0(str5, Collections.EMPTY_MAP, egl0Var2, null);
                                                                                                    } else {
                                                                                                        Uri uri = Uri.parse((String) v2l0.s.a(null));
                                                                                                        Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                        String authority = uri.getAuthority();
                                                                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(strT2).length() + 1 + String.valueOf(authority).length());
                                                                                                        sb2.append(strT2);
                                                                                                        sb2.append(".");
                                                                                                        sb2.append(authority);
                                                                                                        builderBuildUpon.authority(sb2.toString());
                                                                                                        String string2 = builderBuildUpon.build().toString();
                                                                                                        if (z2) {
                                                                                                            egl0Var2 = egl0Var3;
                                                                                                        }
                                                                                                        str2 = null;
                                                                                                        xml0Var = new xml0(string2, Collections.EMPTY_MAP, egl0Var2, null);
                                                                                                    }
                                                                                                    arrayList2.add(Pair.create(j8l0Var5, xml0Var));
                                                                                                }
                                                                                                if (z2) {
                                                                                                    str3 = str;
                                                                                                    j8l0Var = j8l0Var2;
                                                                                                    i5l0Var = this.b;
                                                                                                    U(i5l0Var);
                                                                                                    if (i5l0Var.k()) {
                                                                                                        if (Log.isLoggable(a().m(), 2)) {
                                                                                                            strE = j0().E(j8l0Var);
                                                                                                        } else {
                                                                                                            strE = str2;
                                                                                                        }
                                                                                                        j0();
                                                                                                        byte[] bArrE2 = j8l0Var.e();
                                                                                                        p(arrayList);
                                                                                                        this.i.i.b(j);
                                                                                                        a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE2.length), strE);
                                                                                                        this.u = true;
                                                                                                        U(i5l0Var);
                                                                                                        i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                                                                                        return;
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                q7l0Var = (q7l0) j8l0Var2.k();
                                                                                                for (i3 = 0; i3 < j8l0Var2.r(); i3++) {
                                                                                                    l8l0 l8l0Var3 = (l8l0) j8l0Var2.s(i3).k();
                                                                                                    l8l0Var3.f0();
                                                                                                    l8l0Var3.H(j);
                                                                                                    q7l0Var.g();
                                                                                                    ((j8l0) q7l0Var.b).z(i3, (n8l0) l8l0Var3.i());
                                                                                                }
                                                                                                arrayList2.add(Pair.create((j8l0) q7l0Var.i(), xml0VarH));
                                                                                                p(arrayList);
                                                                                                y(false, 204, null, null, str, arrayList2);
                                                                                                if (s(str, xml0VarH.a)) {
                                                                                                    a().n.b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                                                                    Intent intent = new Intent();
                                                                                                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                                                                    intent.setPackage(str);
                                                                                                    S(k8l0Var.d(), intent);
                                                                                                }
                                                                                            }
                                                                                        } catch (oil0 e6) {
                                                                                            k8l0Var3.a().k.c(y4l0.k(str3), "Failed to parse stored NO_DATA mode event, appId", e6);
                                                                                        }
                                                                                        try {
                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                break;
                                                                                            }
                                                                                            cursorQuery2 = cursorQuery2;
                                                                                            arrayList6 = arrayList6;
                                                                                        } catch (SQLiteException e7) {
                                                                                            e = e7;
                                                                                            k8l0Var3.a().f.c(y4l0.k(str3), "Error flushing NO_DATA mode events. appId", e);
                                                                                            list8 = Collections.EMPTY_LIST;
                                                                                            list9 = list7;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                                list9 = list7;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    try {
                                                                                        int iDelete2 = sQLiteDatabaseV.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                                                                        u4l0 u4l0Var3 = k8l0Var3.a().n;
                                                                                        StringBuilder sb3 = new StringBuilder(String.valueOf(iDelete2).length() + 34);
                                                                                        sb3.append("Pruned ");
                                                                                        sb3.append(iDelete2);
                                                                                        sb3.append(" NO_DATA mode events. appId");
                                                                                        u4l0Var3.b(str3, sb3.toString());
                                                                                        list10 = list7;
                                                                                    } catch (SQLiteException e8) {
                                                                                        e = e8;
                                                                                        cursorQuery2 = null;
                                                                                        k8l0Var3.a().f.c(y4l0.k(str3), "Error flushing NO_DATA mode events. appId", e);
                                                                                        list8 = Collections.EMPTY_LIST;
                                                                                        list9 = list7;
                                                                                        if (cursorQuery2 != null) {
                                                                                            cursorQuery2.close();
                                                                                            list9 = list7;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    arrayList6 = arrayList6;
                                                                                    list10 = list2;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                list8 = arrayList6;
                                                                                list9 = list10;
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                r23 = cursorQuery2;
                                                                                r14 = r23;
                                                                                if (r14 != 0) {
                                                                                    r14.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e9) {
                                                                            e = e9;
                                                                            cursorQuery2 = cursorQuery2;
                                                                            list7 = list2;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                    }
                                                                } catch (SQLiteException e10) {
                                                                    e = e10;
                                                                    k8l0Var3 = k8l0Var2;
                                                                    list7 = list2;
                                                                }
                                                                it5 = list9.iterator();
                                                                z7 = true;
                                                                while (it5.hasNext()) {
                                                                    Pair pair3 = (Pair) it5.next();
                                                                    l8l0Var2 = (l8l0) ((n8l0) pair3.first).k();
                                                                    if (z7) {
                                                                        List listZ3 = l8l0Var2.Z();
                                                                        l8l0Var2.g();
                                                                        ((n8l0) l8l0Var2.b).b0();
                                                                        l8l0Var2.g();
                                                                        ((n8l0) l8l0Var2.b).a0(list8);
                                                                        l8l0Var2.g();
                                                                        ((n8l0) l8l0Var2.b).a0(listZ3);
                                                                        z7 = false;
                                                                    }
                                                                    k6l0 k6l0VarR3 = v6l0.r();
                                                                    w3l0VarB = f0().B(str3);
                                                                    arrayList7 = new ArrayList();
                                                                    if (w3l0VarB != null) {
                                                                        it6 = w3l0VarB.q().iterator();
                                                                        while (it6.hasNext()) {
                                                                            o2l0 o2l0Var3 = (o2l0) it6.next();
                                                                            Iterator it12 = it5;
                                                                            p6l0 p6l0VarQ3 = q6l0.q();
                                                                            boolean z12 = z7;
                                                                            iQ = o2l0Var3.q() - 1;
                                                                            List list15 = list8;
                                                                            if (iQ != 1) {
                                                                                it7 = it6;
                                                                                i7 = 3;
                                                                                i8 = 2;
                                                                            } else if (iQ != 2) {
                                                                                it7 = it6;
                                                                                i7 = 3;
                                                                                if (iQ != 3) {
                                                                                    i8 = 4;
                                                                                } else if (iQ != 4) {
                                                                                    i8 = 1;
                                                                                } else {
                                                                                    i8 = 5;
                                                                                }
                                                                            } else {
                                                                                it7 = it6;
                                                                                i7 = 3;
                                                                                i8 = 3;
                                                                            }
                                                                            p6l0VarQ3.l(i8);
                                                                            iS = o2l0Var3.s() - 1;
                                                                            if (iS != 1) {
                                                                                i7 = 2;
                                                                            } else if (iS != 2) {
                                                                                i7 = 1;
                                                                            }
                                                                            p6l0VarQ3.m(i7);
                                                                            arrayList7.add((q6l0) p6l0VarQ3.i());
                                                                            it5 = it12;
                                                                            list8 = list15;
                                                                            z7 = z12;
                                                                            it6 = it7;
                                                                        }
                                                                    }
                                                                    Iterator it13 = it5;
                                                                    boolean z13 = z7;
                                                                    List list16 = list8;
                                                                    k6l0VarR3.l(arrayList7);
                                                                    l8l0Var2.J(k6l0VarR3);
                                                                    arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair3.second));
                                                                    it5 = it13;
                                                                    list8 = list16;
                                                                    z7 = z13;
                                                                }
                                                                list6 = arrayList5;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                r14 = 0;
                                                                if (r14 != 0) {
                                                                    r14.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        zIsEmpty2 = list6.isEmpty();
                                                        list3 = list6;
                                                        if (zIsEmpty2) {
                                                            return;
                                                        }
                                                    } else {
                                                        list3 = list2;
                                                    }
                                                    jbl0VarF = f(str3);
                                                    hbl0Var2 = hbl0.AD_STORAGE;
                                                    if (jbl0VarF.i(hbl0Var2)) {
                                                        i = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    it4 = list3.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            strW2 = null;
                                                            break;
                                                        }
                                                        n8l0Var2 = (n8l0) ((Pair) it4.next()).first;
                                                        if (!n8l0Var2.w().isEmpty()) {
                                                            strW2 = n8l0Var2.w();
                                                            break;
                                                        }
                                                    }
                                                    if (strW2 != null) {
                                                        i = 0;
                                                        listSubList = list3;
                                                        break;
                                                    }
                                                    i6 = 0;
                                                    while (true) {
                                                        if (i6 < list3.size()) {
                                                            i = 0;
                                                            listSubList = list3;
                                                            break;
                                                        }
                                                        n8l0Var = (n8l0) ((Pair) list3.get(i6)).first;
                                                        if (!n8l0Var.w().isEmpty()) {
                                                            i = 0;
                                                            listSubList = list3.subList(0, i6);
                                                            break;
                                                        }
                                                        i6++;
                                                    }
                                                    q7l0VarX = j8l0.x();
                                                    size = listSubList.size();
                                                    arrayList = new ArrayList(listSubList.size());
                                                    if (e0().h(str3)) {
                                                        i2 = i;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    zI = f(str3).i(hbl0Var2);
                                                    zI2 = f(str3).i(hbl0Var);
                                                    zQ2 = e0().q(str3, v2l0.M0);
                                                    zml0Var = this.j;
                                                    xml0VarH = zml0Var.h(str3);
                                                    list4 = listSubList;
                                                    while (true) {
                                                        k8l0Var = this.l;
                                                        if (i < size) {
                                                            break;
                                                            break;
                                                        }
                                                        l8l0Var = (l8l0) ((n8l0) ((Pair) list4.get(i)).first).k();
                                                        int i13 = i;
                                                        arrayList.add((Long) ((Pair) list4.get(i)).second);
                                                        e0().l();
                                                        l8l0Var.w();
                                                        l8l0Var.g();
                                                        ((n8l0) l8l0Var.b).g0(j);
                                                        k8l0Var.getClass();
                                                        l8l0Var.N();
                                                        if (i2 == 0) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).T0();
                                                        }
                                                        if (!zI) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).A1();
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).C1();
                                                        }
                                                        if (!zI2) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).E1();
                                                        }
                                                        v(str3, l8l0Var);
                                                        if (!zQ2) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).a1();
                                                        }
                                                        if (!zI2) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).M1();
                                                        }
                                                        strW = ((n8l0) l8l0Var.b).w();
                                                        if (TextUtils.isEmpty(strW)) {
                                                            i4 = size;
                                                            if (strW.equals("00000000-0000-0000-0000-000000000000")) {
                                                                z3 = zI2;
                                                                i5 = i2;
                                                                list5 = list4;
                                                                z6 = zQ2;
                                                            }
                                                            if (l8l0Var.a0() != 0) {
                                                                if (e0().q(str3, v2l0.C0)) {
                                                                    l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                                                }
                                                                o9l0Var = xml0VarH.d;
                                                                if (o9l0Var != null) {
                                                                    l8l0Var.F(o9l0Var);
                                                                }
                                                                q7l0VarX.g();
                                                                ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                                                            }
                                                            i = i13 + 1;
                                                            size = i4;
                                                            zI2 = z3;
                                                            list4 = list5;
                                                            i2 = i5;
                                                            zQ2 = z6;
                                                        } else {
                                                            i4 = size;
                                                        }
                                                        arrayList4 = new ArrayList(l8l0Var.Z());
                                                        it3 = arrayList4.iterator();
                                                        z3 = zI2;
                                                        lValueOf = null;
                                                        lValueOf2 = null;
                                                        z4 = false;
                                                        z5 = false;
                                                        while (it3.hasNext()) {
                                                            i2 = i2;
                                                            d7l0Var = (d7l0) it3.next();
                                                            list4 = list4;
                                                            zQ2 = zQ2;
                                                            if ("_fx".equals(d7l0Var.t())) {
                                                                it3.remove();
                                                                z4 = true;
                                                            } else if ("_f".equals(d7l0Var.t())) {
                                                                j0();
                                                                k7l0VarO = pol0.o("_pfo", d7l0Var);
                                                                if (k7l0VarO != null) {
                                                                    lValueOf = Long.valueOf(k7l0VarO.v());
                                                                }
                                                                j0();
                                                                k7l0VarO2 = pol0.o("_uwa", d7l0Var);
                                                                if (k7l0VarO2 != null) {
                                                                    lValueOf2 = Long.valueOf(k7l0VarO2.v());
                                                                }
                                                            } else {
                                                                list4 = list4;
                                                                i2 = i2;
                                                                zQ2 = zQ2;
                                                            }
                                                            z5 = true;
                                                        }
                                                        i5 = i2;
                                                        list5 = list4;
                                                        z6 = zQ2;
                                                        if (z4) {
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).b0();
                                                            l8l0Var.g();
                                                            ((n8l0) l8l0Var.b).a0(arrayList4);
                                                        }
                                                        if (z5) {
                                                            u(l8l0Var.s(), true, lValueOf, lValueOf2);
                                                        }
                                                        if (l8l0Var.a0() != 0) {
                                                            if (e0().q(str3, v2l0.C0)) {
                                                                l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                                            }
                                                            o9l0Var = xml0VarH.d;
                                                            if (o9l0Var != null) {
                                                                l8l0Var.F(o9l0Var);
                                                            }
                                                            q7l0VarX.g();
                                                            ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                                                        }
                                                        i = i13 + 1;
                                                        size = i4;
                                                        zI2 = z3;
                                                        list4 = list5;
                                                        i2 = i5;
                                                        zQ2 = z6;
                                                    }
                                                    if (((j8l0) q7l0VarX.b).r() == 0) {
                                                        p(arrayList);
                                                        y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                                                        return;
                                                    }
                                                    j8l0Var = (j8l0) q7l0VarX.i();
                                                    arrayList2 = new ArrayList();
                                                    egl0Var = xml0VarH.c;
                                                    if (egl0Var == egl0.SGTM_CLIENT) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (egl0Var != egl0.SGTM) {
                                                        if (z) {
                                                            z2 = true;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        i5l0Var = this.b;
                                                        U(i5l0Var);
                                                        if (i5l0Var.k()) {
                                                            if (Log.isLoggable(a().m(), 2)) {
                                                                strE = j0().E(j8l0Var);
                                                            } else {
                                                                strE = str2;
                                                            }
                                                            j0();
                                                            byte[] bArrE3 = j8l0Var.e();
                                                            p(arrayList);
                                                            this.i.i.b(j);
                                                            a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE3.length), strE);
                                                            this.u = true;
                                                            U(i5l0Var);
                                                            i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    z2 = z;
                                                    it = ((j8l0) q7l0VarX.i()).q().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            if (((n8l0) it.next()).O()) {
                                                                string = UUID.randomUUID().toString();
                                                                break;
                                                            }
                                                        } else {
                                                            string = null;
                                                            break;
                                                        }
                                                    }
                                                    j8l0 j8l0Var6 = (j8l0) q7l0VarX.i();
                                                    b().g();
                                                    l0();
                                                    q7l0VarY = j8l0.y(j8l0Var6);
                                                    if (!TextUtils.isEmpty(string)) {
                                                        q7l0VarY.g();
                                                        ((j8l0) q7l0VarY.b).D(string);
                                                    }
                                                    strT = f0().t(str3);
                                                    if (!TextUtils.isEmpty(strT)) {
                                                        q7l0VarY.m(strT);
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    it2 = j8l0Var6.q().iterator();
                                                    while (it2.hasNext()) {
                                                        l8l0 l8l0VarW2 = n8l0.W((n8l0) it2.next());
                                                        l8l0VarW2.g();
                                                        ((n8l0) l8l0VarW2.b).T0();
                                                        arrayList3.add((n8l0) l8l0VarW2.i());
                                                    }
                                                    q7l0VarY.g();
                                                    ((j8l0) q7l0VarY.b).C();
                                                    q7l0VarY.g();
                                                    ((j8l0) q7l0VarY.b).B(arrayList3);
                                                    u4l0 u4l0Var4 = a().n;
                                                    if (TextUtils.isEmpty(string)) {
                                                        strL = "null";
                                                    } else {
                                                        strL = q7l0VarY.l();
                                                    }
                                                    u4l0Var4.b(strL, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                                                    j8l0Var2 = (j8l0) q7l0VarY.i();
                                                    if (TextUtils.isEmpty(string)) {
                                                        j8l0 j8l0Var7 = (j8l0) q7l0VarX.i();
                                                        b().g();
                                                        l0();
                                                        q7l0VarX2 = j8l0.x();
                                                        a().n.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                                                        q7l0VarX2.g();
                                                        ((j8l0) q7l0VarX2.b).D(string);
                                                        while (r0.hasNext()) {
                                                            l8l0 l8l0VarV2 = n8l0.V();
                                                            String strP2 = n8l0Var3.P();
                                                            l8l0VarV2.g();
                                                            ((n8l0) l8l0VarV2.b).S0(strP2);
                                                            int iL1 = n8l0Var3.L0();
                                                            l8l0VarV2.g();
                                                            ((n8l0) l8l0VarV2.b).k1(iL1);
                                                            q7l0VarX2.g();
                                                            ((j8l0) q7l0VarX2.b).A((n8l0) l8l0VarV2.i());
                                                        }
                                                        j8l0 j8l0Var8 = (j8l0) q7l0VarX2.i();
                                                        strT2 = zml0Var.b.f0().t(str3);
                                                        zIsEmpty = TextUtils.isEmpty(strT2);
                                                        egl0Var2 = egl0.GOOGLE_SIGNAL;
                                                        egl0Var3 = egl0.GOOGLE_SIGNAL_PENDING;
                                                        if (zIsEmpty) {
                                                            Uri uri2 = Uri.parse((String) v2l0.s.a(null));
                                                            Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                            String authority2 = uri2.getAuthority();
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(strT2).length() + 1 + String.valueOf(authority2).length());
                                                            sb4.append(strT2);
                                                            sb4.append(".");
                                                            sb4.append(authority2);
                                                            builderBuildUpon2.authority(sb4.toString());
                                                            String string3 = builderBuildUpon2.build().toString();
                                                            if (z2) {
                                                                egl0Var2 = egl0Var3;
                                                            }
                                                            str2 = null;
                                                            xml0Var = new xml0(string3, Collections.EMPTY_MAP, egl0Var2, null);
                                                        } else {
                                                            str2 = null;
                                                            String str6 = (String) v2l0.s.a(null);
                                                            if (z2) {
                                                                egl0Var2 = egl0Var3;
                                                            }
                                                            xml0Var = new xml0(str6, Collections.EMPTY_MAP, egl0Var2, null);
                                                        }
                                                        arrayList2.add(Pair.create(j8l0Var8, xml0Var));
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    if (z2) {
                                                        str3 = str;
                                                        j8l0Var = j8l0Var2;
                                                        i5l0Var = this.b;
                                                        U(i5l0Var);
                                                        if (i5l0Var.k()) {
                                                            if (Log.isLoggable(a().m(), 2)) {
                                                                strE = j0().E(j8l0Var);
                                                            } else {
                                                                strE = str2;
                                                            }
                                                            j0();
                                                            byte[] bArrE4 = j8l0Var.e();
                                                            p(arrayList);
                                                            this.i.i.b(j);
                                                            a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE4.length), strE);
                                                            this.u = true;
                                                            U(i5l0Var);
                                                            i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    q7l0Var = (q7l0) j8l0Var2.k();
                                                    while (i3 < j8l0Var2.r()) {
                                                        l8l0 l8l0Var4 = (l8l0) j8l0Var2.s(i3).k();
                                                        l8l0Var4.f0();
                                                        l8l0Var4.H(j);
                                                        q7l0Var.g();
                                                        ((j8l0) q7l0Var.b).z(i3, (n8l0) l8l0Var4.i());
                                                    }
                                                    arrayList2.add(Pair.create((j8l0) q7l0Var.i(), xml0VarH));
                                                    p(arrayList);
                                                    y(false, 204, null, null, str, arrayList2);
                                                    if (s(str, xml0VarH.a)) {
                                                        a().n.b(str, "[sgtm] Sending sgtm batches available notification to app");
                                                        Intent intent2 = new Intent();
                                                        intent2.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                                        intent2.setPackage(str);
                                                        S(k8l0Var.d(), intent2);
                                                    }
                                                }
                                            }
                                            gZIPInputStream.close();
                                            byteArrayInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            if (!arrayList8.isEmpty() && byteArray.length + length > iMax) {
                                                break;
                                            }
                                            try {
                                                l8l0 l8l0Var5 = (l8l0) pol0.O(n8l0.V(), byteArray);
                                                if (!arrayList8.isEmpty()) {
                                                    n8l0 n8l0Var4 = (n8l0) ((Pair) arrayList8.get(0)).first;
                                                    n8l0 n8l0Var5 = (n8l0) l8l0Var5.i();
                                                    if (!n8l0Var4.v0().equals(n8l0Var5.v0()) || !n8l0Var4.C0().equals(n8l0Var5.C0()) || n8l0Var4.E0() != n8l0Var5.E0() || !n8l0Var4.G0().equals(n8l0Var5.G0())) {
                                                        break;
                                                    }
                                                    Iterator it14 = n8l0Var4.V1().iterator();
                                                    ?? r27 = r9;
                                                    while (true) {
                                                        if (!it14.hasNext()) {
                                                            jW = -1;
                                                            r9 = r27;
                                                            break;
                                                        }
                                                        s9l0 s9l0Var = (s9l0) it14.next();
                                                        Iterator it15 = it14;
                                                        if ("_npa".equals(s9l0Var.s())) {
                                                            jW = s9l0Var.w();
                                                            r9 = it15;
                                                            break;
                                                        } else {
                                                            it14 = it15;
                                                            r27 = it15;
                                                        }
                                                    }
                                                    Iterator it16 = n8l0Var5.V1().iterator();
                                                    while (true) {
                                                        if (!it16.hasNext()) {
                                                            jW2 = -1;
                                                            break;
                                                        }
                                                        s9l0 s9l0Var2 = (s9l0) it16.next();
                                                        if ("_npa".equals(s9l0Var2.s())) {
                                                            jW2 = s9l0Var2.w();
                                                            break;
                                                        }
                                                    }
                                                    if (jW != jW2) {
                                                        break;
                                                    }
                                                }
                                                if (!cursorQuery.isNull(2)) {
                                                    int i14 = cursorQuery.getInt(2);
                                                    l8l0Var5.g();
                                                    ((n8l0) l8l0Var5.b).U0(i14);
                                                }
                                                length += byteArray.length;
                                                arrayList8.add(Pair.create((n8l0) l8l0Var5.i(), Long.valueOf(j3)));
                                            } catch (IOException e11) {
                                                r10.a().f.c(y4l0.k(str3), "Failed to merge queued bundle. appId", e11);
                                            }
                                            r9 = r10;
                                            if (cursorQuery.moveToNext() || length > iMax) {
                                                break;
                                                break;
                                            }
                                            lqk0VarG0 = lqk0Var;
                                            r10 = r9;
                                            i9 = 0;
                                            i10 = 1;
                                            r26 = r9;
                                        } catch (IOException e12) {
                                            e = e12;
                                            lqk0Var = lqk0VarG0;
                                        }
                                    } catch (IOException e13) {
                                        e = e13;
                                        lqk0Var = lqk0VarG0;
                                        r9 = r10;
                                    }
                                }
                                cursorQuery.close();
                                list2 = arrayList8;
                                r23 = r9;
                            } else {
                                list = Collections.EMPTY_LIST;
                                r25 = strValueOf;
                                cursorQuery.close();
                                r24 = r25;
                                list2 = list;
                                r23 = r24;
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            r9 = r9;
                        }
                        if (list2.isEmpty()) {
                            return;
                        }
                        xol0Var = xol0.b;
                        wok0 wok0VarE1 = e0();
                        t2l0Var = v2l0.h1;
                        zQ = wok0VarE1.q(null, t2l0Var);
                        hbl0Var = hbl0.ANALYTICS_STORAGE;
                        if (zQ) {
                            if (!e0().q(null, t2l0Var)) {
                                list6 = list2;
                            } else if (f(str3).i(hbl0Var) || !f0().l(str3)) {
                                arrayList5 = new ArrayList(list2.size());
                                lqk0 lqk0VarG3 = g0();
                                k8l0Var2 = lqk0VarG3.a;
                                hm20.e(str3);
                                lqk0VarG3.g();
                                lqk0VarG3.h();
                                arrayList6 = new ArrayList();
                                sQLiteDatabaseV = lqk0VarG3.V();
                                k8l0Var2.e().getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                cursorQuery2 = sQLiteDatabaseV.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                                k8l0Var3 = k8l0Var2;
                                if (cursorQuery2.moveToFirst()) {
                                    list7 = list2;
                                    while (true) {
                                        arrayList6.add((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorQuery2.getBlob(0))).i());
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            cursorQuery2 = cursorQuery2;
                                            arrayList6 = arrayList6;
                                        }
                                    }
                                    cursorQuery2.close();
                                    int iDelete3 = sQLiteDatabaseV.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                    u4l0 u4l0Var5 = k8l0Var3.a().n;
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iDelete3).length() + 34);
                                    sb5.append("Pruned ");
                                    sb5.append(iDelete3);
                                    sb5.append(" NO_DATA mode events. appId");
                                    u4l0Var5.b(str3, sb5.toString());
                                    list10 = list7;
                                } else {
                                    arrayList6 = arrayList6;
                                    list10 = list2;
                                    cursorQuery2.close();
                                }
                                list8 = arrayList6;
                                list9 = list10;
                                it5 = list9.iterator();
                                z7 = true;
                                while (it5.hasNext()) {
                                    Pair pair4 = (Pair) it5.next();
                                    l8l0Var2 = (l8l0) ((n8l0) pair4.first).k();
                                    if (z7 && !list8.isEmpty()) {
                                        List listZ4 = l8l0Var2.Z();
                                        l8l0Var2.g();
                                        ((n8l0) l8l0Var2.b).b0();
                                        l8l0Var2.g();
                                        ((n8l0) l8l0Var2.b).a0(list8);
                                        l8l0Var2.g();
                                        ((n8l0) l8l0Var2.b).a0(listZ4);
                                        z7 = false;
                                    }
                                    k6l0 k6l0VarR4 = v6l0.r();
                                    w3l0VarB = f0().B(str3);
                                    arrayList7 = new ArrayList();
                                    if (w3l0VarB != null) {
                                        it6 = w3l0VarB.q().iterator();
                                        while (it6.hasNext()) {
                                            o2l0 o2l0Var4 = (o2l0) it6.next();
                                            Iterator it17 = it5;
                                            p6l0 p6l0VarQ4 = q6l0.q();
                                            boolean z14 = z7;
                                            iQ = o2l0Var4.q() - 1;
                                            List list17 = list8;
                                            if (iQ != 1) {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 2;
                                            } else if (iQ != 2) {
                                                it7 = it6;
                                                i7 = 3;
                                                if (iQ != 3) {
                                                    i8 = 4;
                                                } else if (iQ != 4) {
                                                    i8 = 1;
                                                } else {
                                                    i8 = 5;
                                                }
                                            } else {
                                                it7 = it6;
                                                i7 = 3;
                                                i8 = 3;
                                            }
                                            p6l0VarQ4.l(i8);
                                            iS = o2l0Var4.s() - 1;
                                            if (iS != 1) {
                                                i7 = 2;
                                            } else if (iS != 2) {
                                                i7 = 1;
                                            }
                                            p6l0VarQ4.m(i7);
                                            arrayList7.add((q6l0) p6l0VarQ4.i());
                                            it5 = it17;
                                            list8 = list17;
                                            z7 = z14;
                                            it6 = it7;
                                        }
                                    }
                                    Iterator it18 = it5;
                                    boolean z15 = z7;
                                    List list18 = list8;
                                    k6l0VarR4.l(arrayList7);
                                    l8l0Var2.J(k6l0VarR4);
                                    arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair4.second));
                                    it5 = it18;
                                    list8 = list18;
                                    z7 = z15;
                                }
                                list6 = arrayList5;
                            } else {
                                List listAsList = Arrays.asList(((String) v2l0.i1.a(null)).split(","));
                                for (Pair pair5 : list2) {
                                    try {
                                        g0().p(((Long) pair5.second).longValue());
                                        for (d7l0 d7l0Var2 : ((n8l0) pair5.first).Q1()) {
                                            if (listAsList.contains(d7l0Var2.t())) {
                                                if (d7l0Var2.t().equals("_f") || d7l0Var2.t().equals("_v")) {
                                                    b7l0 b7l0Var = (b7l0) d7l0Var2.k();
                                                    j0();
                                                    pol0.m(b7l0Var, "_dac", 1L);
                                                    d7l0Var2 = (d7l0) b7l0Var.i();
                                                }
                                                lqk0 lqk0VarG4 = g0();
                                                lqk0VarG4.g();
                                                lqk0VarG4.h();
                                                hm20.e(str3);
                                                k8l0 k8l0Var4 = lqk0VarG4.a;
                                                k8l0Var4.a().n.b(d7l0Var2, "Caching events in NO_DATA mode");
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put(PublisherMetadata.APP_ID, str3);
                                                d7l0 d7l0Var3 = d7l0Var2;
                                                contentValues.put("name", d7l0Var3.t());
                                                contentValues.put("data", d7l0Var3.e());
                                                contentValues.put("timestamp_millis", Long.valueOf(d7l0Var3.v()));
                                                try {
                                                    if (lqk0VarG4.V().insert("no_data_mode_events", null, contentValues) == j2) {
                                                        k8l0Var4.a().f.b(y4l0.k(str3), "Failed to insert NO_DATA mode event (got -1). appId");
                                                    }
                                                } catch (SQLiteException e15) {
                                                    lqk0VarG4.a.a().f.c(y4l0.k(str3), "Error storing NO_DATA mode event. appId", e15);
                                                }
                                            }
                                        }
                                    } catch (SQLiteException unused) {
                                        a().k.b(str3, "Failed handling NO_DATA mode bundles. appId");
                                    }
                                }
                                list6 = Collections.EMPTY_LIST;
                            }
                            zIsEmpty2 = list6.isEmpty();
                            list3 = list6;
                            if (zIsEmpty2) {
                                return;
                            }
                        } else {
                            list3 = list2;
                        }
                        jbl0VarF = f(str3);
                        hbl0Var2 = hbl0.AD_STORAGE;
                        if (jbl0VarF.i(hbl0Var2)) {
                            i = 0;
                            listSubList = list3;
                            break;
                        }
                        it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                strW2 = null;
                                break;
                            }
                            n8l0Var2 = (n8l0) ((Pair) it4.next()).first;
                            if (!n8l0Var2.w().isEmpty()) {
                                strW2 = n8l0Var2.w();
                                break;
                            }
                        }
                        if (strW2 != null) {
                            i = 0;
                            listSubList = list3;
                            break;
                        }
                        i6 = 0;
                        while (true) {
                            if (i6 < list3.size()) {
                                i = 0;
                                listSubList = list3;
                                break;
                            }
                            n8l0Var = (n8l0) ((Pair) list3.get(i6)).first;
                            if (!n8l0Var.w().isEmpty() && !n8l0Var.w().equals(strW2)) {
                                i = 0;
                                listSubList = list3.subList(0, i6);
                                break;
                            }
                            i6++;
                        }
                        q7l0VarX = j8l0.x();
                        size = listSubList.size();
                        arrayList = new ArrayList(listSubList.size());
                        if (e0().h(str3) || !f(str3).i(hbl0Var2)) {
                            i2 = i;
                        } else {
                            i2 = 1;
                        }
                        zI = f(str3).i(hbl0Var2);
                        zI2 = f(str3).i(hbl0Var);
                        zQ2 = e0().q(str3, v2l0.M0);
                        zml0Var = this.j;
                        xml0VarH = zml0Var.h(str3);
                        list4 = listSubList;
                        while (true) {
                            k8l0Var = this.l;
                            if (i < size) {
                                break;
                                break;
                            }
                            l8l0Var = (l8l0) ((n8l0) ((Pair) list4.get(i)).first).k();
                            int i15 = i;
                            arrayList.add((Long) ((Pair) list4.get(i)).second);
                            e0().l();
                            l8l0Var.w();
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).g0(j);
                            k8l0Var.getClass();
                            l8l0Var.N();
                            if (i2 == 0) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).T0();
                            }
                            if (!zI) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).A1();
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).C1();
                            }
                            if (!zI2) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).E1();
                            }
                            v(str3, l8l0Var);
                            if (!zQ2) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).a1();
                            }
                            if (!zI2) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).M1();
                            }
                            strW = ((n8l0) l8l0Var.b).w();
                            if (TextUtils.isEmpty(strW)) {
                                i4 = size;
                                if (strW.equals("00000000-0000-0000-0000-000000000000")) {
                                    z3 = zI2;
                                    i5 = i2;
                                    list5 = list4;
                                    z6 = zQ2;
                                }
                                if (l8l0Var.a0() != 0) {
                                    if (e0().q(str3, v2l0.C0)) {
                                        l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                    }
                                    o9l0Var = xml0VarH.d;
                                    if (o9l0Var != null) {
                                        l8l0Var.F(o9l0Var);
                                    }
                                    q7l0VarX.g();
                                    ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                                }
                                i = i15 + 1;
                                size = i4;
                                zI2 = z3;
                                list4 = list5;
                                i2 = i5;
                                zQ2 = z6;
                            } else {
                                i4 = size;
                            }
                            arrayList4 = new ArrayList(l8l0Var.Z());
                            it3 = arrayList4.iterator();
                            z3 = zI2;
                            lValueOf = null;
                            lValueOf2 = null;
                            z4 = false;
                            z5 = false;
                            while (it3.hasNext()) {
                                i2 = i2;
                                d7l0Var = (d7l0) it3.next();
                                list4 = list4;
                                zQ2 = zQ2;
                                if ("_fx".equals(d7l0Var.t())) {
                                    it3.remove();
                                    z4 = true;
                                } else if ("_f".equals(d7l0Var.t())) {
                                    j0();
                                    k7l0VarO = pol0.o("_pfo", d7l0Var);
                                    if (k7l0VarO != null) {
                                        lValueOf = Long.valueOf(k7l0VarO.v());
                                    }
                                    j0();
                                    k7l0VarO2 = pol0.o("_uwa", d7l0Var);
                                    if (k7l0VarO2 != null) {
                                        lValueOf2 = Long.valueOf(k7l0VarO2.v());
                                    }
                                } else {
                                    list4 = list4;
                                    i2 = i2;
                                    zQ2 = zQ2;
                                }
                                z5 = true;
                            }
                            i5 = i2;
                            list5 = list4;
                            z6 = zQ2;
                            if (z4) {
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).b0();
                                l8l0Var.g();
                                ((n8l0) l8l0Var.b).a0(arrayList4);
                            }
                            if (z5) {
                                u(l8l0Var.s(), true, lValueOf, lValueOf2);
                            }
                            if (l8l0Var.a0() != 0) {
                                if (e0().q(str3, v2l0.C0)) {
                                    l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                }
                                o9l0Var = xml0VarH.d;
                                if (o9l0Var != null) {
                                    l8l0Var.F(o9l0Var);
                                }
                                q7l0VarX.g();
                                ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                            }
                            i = i15 + 1;
                            size = i4;
                            zI2 = z3;
                            list4 = list5;
                            i2 = i5;
                            zQ2 = z6;
                        }
                        if (((j8l0) q7l0VarX.b).r() == 0) {
                            p(arrayList);
                            y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                            return;
                        }
                        j8l0Var = (j8l0) q7l0VarX.i();
                        arrayList2 = new ArrayList();
                        egl0Var = xml0VarH.c;
                        if (egl0Var == egl0.SGTM_CLIENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (egl0Var != egl0.SGTM) {
                            if (z) {
                                z2 = true;
                            } else {
                                str2 = null;
                            }
                            i5l0Var = this.b;
                            U(i5l0Var);
                            if (i5l0Var.k()) {
                                if (Log.isLoggable(a().m(), 2)) {
                                    strE = j0().E(j8l0Var);
                                } else {
                                    strE = str2;
                                }
                                j0();
                                byte[] bArrE5 = j8l0Var.e();
                                p(arrayList);
                                this.i.i.b(j);
                                a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE5.length), strE);
                                this.u = true;
                                U(i5l0Var);
                                i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        it = ((j8l0) q7l0VarX.i()).q().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((n8l0) it.next()).O()) {
                                    string = UUID.randomUUID().toString();
                                    break;
                                }
                            } else {
                                string = null;
                                break;
                            }
                        }
                        j8l0 j8l0Var9 = (j8l0) q7l0VarX.i();
                        b().g();
                        l0();
                        q7l0VarY = j8l0.y(j8l0Var9);
                        if (!TextUtils.isEmpty(string)) {
                            q7l0VarY.g();
                            ((j8l0) q7l0VarY.b).D(string);
                        }
                        strT = f0().t(str3);
                        if (!TextUtils.isEmpty(strT)) {
                            q7l0VarY.m(strT);
                        }
                        arrayList3 = new ArrayList();
                        it2 = j8l0Var9.q().iterator();
                        while (it2.hasNext()) {
                            l8l0 l8l0VarW3 = n8l0.W((n8l0) it2.next());
                            l8l0VarW3.g();
                            ((n8l0) l8l0VarW3.b).T0();
                            arrayList3.add((n8l0) l8l0VarW3.i());
                        }
                        q7l0VarY.g();
                        ((j8l0) q7l0VarY.b).C();
                        q7l0VarY.g();
                        ((j8l0) q7l0VarY.b).B(arrayList3);
                        u4l0 u4l0Var6 = a().n;
                        if (TextUtils.isEmpty(string)) {
                            strL = "null";
                        } else {
                            strL = q7l0VarY.l();
                        }
                        u4l0Var6.b(strL, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                        j8l0Var2 = (j8l0) q7l0VarY.i();
                        if (TextUtils.isEmpty(string)) {
                            j8l0 j8l0Var10 = (j8l0) q7l0VarX.i();
                            b().g();
                            l0();
                            q7l0VarX2 = j8l0.x();
                            a().n.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                            q7l0VarX2.g();
                            ((j8l0) q7l0VarX2.b).D(string);
                            while (r0.hasNext()) {
                                l8l0 l8l0VarV3 = n8l0.V();
                                String strP3 = n8l0Var3.P();
                                l8l0VarV3.g();
                                ((n8l0) l8l0VarV3.b).S0(strP3);
                                int iL2 = n8l0Var3.L0();
                                l8l0VarV3.g();
                                ((n8l0) l8l0VarV3.b).k1(iL2);
                                q7l0VarX2.g();
                                ((j8l0) q7l0VarX2.b).A((n8l0) l8l0VarV3.i());
                            }
                            j8l0 j8l0Var11 = (j8l0) q7l0VarX2.i();
                            strT2 = zml0Var.b.f0().t(str3);
                            zIsEmpty = TextUtils.isEmpty(strT2);
                            egl0Var2 = egl0.GOOGLE_SIGNAL;
                            egl0Var3 = egl0.GOOGLE_SIGNAL_PENDING;
                            if (zIsEmpty) {
                                Uri uri3 = Uri.parse((String) v2l0.s.a(null));
                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                String authority3 = uri3.getAuthority();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(strT2).length() + 1 + String.valueOf(authority3).length());
                                sb6.append(strT2);
                                sb6.append(".");
                                sb6.append(authority3);
                                builderBuildUpon3.authority(sb6.toString());
                                String string4 = builderBuildUpon3.build().toString();
                                if (z2) {
                                    egl0Var2 = egl0Var3;
                                }
                                str2 = null;
                                xml0Var = new xml0(string4, Collections.EMPTY_MAP, egl0Var2, null);
                            } else {
                                str2 = null;
                                String str7 = (String) v2l0.s.a(null);
                                if (z2) {
                                    egl0Var2 = egl0Var3;
                                }
                                xml0Var = new xml0(str7, Collections.EMPTY_MAP, egl0Var2, null);
                            }
                            arrayList2.add(Pair.create(j8l0Var11, xml0Var));
                        } else {
                            str2 = null;
                        }
                        if (z2) {
                            str3 = str;
                            j8l0Var = j8l0Var2;
                            i5l0Var = this.b;
                            U(i5l0Var);
                            if (i5l0Var.k()) {
                                if (Log.isLoggable(a().m(), 2)) {
                                    strE = j0().E(j8l0Var);
                                } else {
                                    strE = str2;
                                }
                                j0();
                                byte[] bArrE6 = j8l0Var.e();
                                p(arrayList);
                                this.i.i.b(j);
                                a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE6.length), strE);
                                this.u = true;
                                U(i5l0Var);
                                i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                                return;
                            }
                            return;
                        }
                        q7l0Var = (q7l0) j8l0Var2.k();
                        while (i3 < j8l0Var2.r()) {
                            l8l0 l8l0Var6 = (l8l0) j8l0Var2.s(i3).k();
                            l8l0Var6.f0();
                            l8l0Var6.H(j);
                            q7l0Var.g();
                            ((j8l0) q7l0Var.b).z(i3, (n8l0) l8l0Var6.i());
                        }
                        arrayList2.add(Pair.create((j8l0) q7l0Var.i(), xml0VarH));
                        p(arrayList);
                        y(false, 204, null, null, str, arrayList2);
                        if (s(str, xml0VarH.a)) {
                            a().n.b(str, "[sgtm] Sending sgtm batches available notification to app");
                            Intent intent3 = new Intent();
                            intent3.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            intent3.setPackage(str);
                            S(k8l0Var.d(), intent3);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                    cursorQuery = null;
                    r9.a().f.c(y4l0.k(str3), "Error querying bundles. appId", e);
                    list = Collections.EMPTY_LIST;
                    r25 = r9;
                    r24 = r9;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        r24 = r25;
                    }
                    list2 = list;
                    r23 = r24;
                    if (list2.isEmpty()) {
                        return;
                    }
                    xol0Var = xol0.b;
                    wok0 wok0VarE2 = e0();
                    t2l0Var = v2l0.h1;
                    zQ = wok0VarE2.q(null, t2l0Var);
                    hbl0Var = hbl0.ANALYTICS_STORAGE;
                    if (zQ) {
                        if (!e0().q(null, t2l0Var)) {
                            list6 = list2;
                        } else if (f(str3).i(hbl0Var)) {
                            arrayList5 = new ArrayList(list2.size());
                            lqk0 lqk0VarG5 = g0();
                            k8l0Var2 = lqk0VarG5.a;
                            hm20.e(str3);
                            lqk0VarG5.g();
                            lqk0VarG5.h();
                            arrayList6 = new ArrayList();
                            sQLiteDatabaseV = lqk0VarG5.V();
                            k8l0Var2.e().getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            cursorQuery2 = sQLiteDatabaseV.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                            k8l0Var3 = k8l0Var2;
                            if (cursorQuery2.moveToFirst()) {
                                list7 = list2;
                                while (true) {
                                    arrayList6.add((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorQuery2.getBlob(0))).i());
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                        break;
                                    } else {
                                        cursorQuery2 = cursorQuery2;
                                        arrayList6 = arrayList6;
                                    }
                                }
                                cursorQuery2.close();
                                int iDelete4 = sQLiteDatabaseV.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                u4l0 u4l0Var7 = k8l0Var3.a().n;
                                StringBuilder sb7 = new StringBuilder(String.valueOf(iDelete4).length() + 34);
                                sb7.append("Pruned ");
                                sb7.append(iDelete4);
                                sb7.append(" NO_DATA mode events. appId");
                                u4l0Var7.b(str3, sb7.toString());
                                list10 = list7;
                            } else {
                                arrayList6 = arrayList6;
                                list10 = list2;
                                cursorQuery2.close();
                            }
                            list8 = arrayList6;
                            list9 = list10;
                            it5 = list9.iterator();
                            z7 = true;
                            while (it5.hasNext()) {
                                Pair pair6 = (Pair) it5.next();
                                l8l0Var2 = (l8l0) ((n8l0) pair6.first).k();
                                if (z7) {
                                    List listZ5 = l8l0Var2.Z();
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).b0();
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).a0(list8);
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).a0(listZ5);
                                    z7 = false;
                                }
                                k6l0 k6l0VarR5 = v6l0.r();
                                w3l0VarB = f0().B(str3);
                                arrayList7 = new ArrayList();
                                if (w3l0VarB != null) {
                                    it6 = w3l0VarB.q().iterator();
                                    while (it6.hasNext()) {
                                        o2l0 o2l0Var5 = (o2l0) it6.next();
                                        Iterator it19 = it5;
                                        p6l0 p6l0VarQ5 = q6l0.q();
                                        boolean z16 = z7;
                                        iQ = o2l0Var5.q() - 1;
                                        List list19 = list8;
                                        if (iQ != 1) {
                                            it7 = it6;
                                            i7 = 3;
                                            i8 = 2;
                                        } else if (iQ != 2) {
                                            it7 = it6;
                                            i7 = 3;
                                            if (iQ != 3) {
                                                i8 = 4;
                                            } else if (iQ != 4) {
                                                i8 = 1;
                                            } else {
                                                i8 = 5;
                                            }
                                        } else {
                                            it7 = it6;
                                            i7 = 3;
                                            i8 = 3;
                                        }
                                        p6l0VarQ5.l(i8);
                                        iS = o2l0Var5.s() - 1;
                                        if (iS != 1) {
                                            i7 = 2;
                                        } else if (iS != 2) {
                                            i7 = 1;
                                        }
                                        p6l0VarQ5.m(i7);
                                        arrayList7.add((q6l0) p6l0VarQ5.i());
                                        it5 = it19;
                                        list8 = list19;
                                        z7 = z16;
                                        it6 = it7;
                                    }
                                }
                                Iterator it110 = it5;
                                boolean z17 = z7;
                                List list110 = list8;
                                k6l0VarR5.l(arrayList7);
                                l8l0Var2.J(k6l0VarR5);
                                arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair6.second));
                                it5 = it110;
                                list8 = list110;
                                z7 = z17;
                            }
                            list6 = arrayList5;
                        } else {
                            arrayList5 = new ArrayList(list2.size());
                            lqk0 lqk0VarG6 = g0();
                            k8l0Var2 = lqk0VarG6.a;
                            hm20.e(str3);
                            lqk0VarG6.g();
                            lqk0VarG6.h();
                            arrayList6 = new ArrayList();
                            sQLiteDatabaseV = lqk0VarG6.V();
                            k8l0Var2.e().getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            cursorQuery2 = sQLiteDatabaseV.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
                            k8l0Var3 = k8l0Var2;
                            if (cursorQuery2.moveToFirst()) {
                                list7 = list2;
                                while (true) {
                                    arrayList6.add((d7l0) ((b7l0) pol0.O(d7l0.A(), cursorQuery2.getBlob(0))).i());
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                        break;
                                    } else {
                                        cursorQuery2 = cursorQuery2;
                                        arrayList6 = arrayList6;
                                    }
                                }
                                cursorQuery2.close();
                                int iDelete5 = sQLiteDatabaseV.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str3, String.valueOf(jCurrentTimeMillis)});
                                u4l0 u4l0Var8 = k8l0Var3.a().n;
                                StringBuilder sb8 = new StringBuilder(String.valueOf(iDelete5).length() + 34);
                                sb8.append("Pruned ");
                                sb8.append(iDelete5);
                                sb8.append(" NO_DATA mode events. appId");
                                u4l0Var8.b(str3, sb8.toString());
                                list10 = list7;
                            } else {
                                arrayList6 = arrayList6;
                                list10 = list2;
                                cursorQuery2.close();
                            }
                            list8 = arrayList6;
                            list9 = list10;
                            it5 = list9.iterator();
                            z7 = true;
                            while (it5.hasNext()) {
                                Pair pair7 = (Pair) it5.next();
                                l8l0Var2 = (l8l0) ((n8l0) pair7.first).k();
                                if (z7) {
                                    List listZ6 = l8l0Var2.Z();
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).b0();
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).a0(list8);
                                    l8l0Var2.g();
                                    ((n8l0) l8l0Var2.b).a0(listZ6);
                                    z7 = false;
                                }
                                k6l0 k6l0VarR6 = v6l0.r();
                                w3l0VarB = f0().B(str3);
                                arrayList7 = new ArrayList();
                                if (w3l0VarB != null) {
                                    it6 = w3l0VarB.q().iterator();
                                    while (it6.hasNext()) {
                                        o2l0 o2l0Var6 = (o2l0) it6.next();
                                        Iterator it111 = it5;
                                        p6l0 p6l0VarQ6 = q6l0.q();
                                        boolean z18 = z7;
                                        iQ = o2l0Var6.q() - 1;
                                        List list111 = list8;
                                        if (iQ != 1) {
                                            it7 = it6;
                                            i7 = 3;
                                            i8 = 2;
                                        } else if (iQ != 2) {
                                            it7 = it6;
                                            i7 = 3;
                                            if (iQ != 3) {
                                                i8 = 4;
                                            } else if (iQ != 4) {
                                                i8 = 1;
                                            } else {
                                                i8 = 5;
                                            }
                                        } else {
                                            it7 = it6;
                                            i7 = 3;
                                            i8 = 3;
                                        }
                                        p6l0VarQ6.l(i8);
                                        iS = o2l0Var6.s() - 1;
                                        if (iS != 1) {
                                            i7 = 2;
                                        } else if (iS != 2) {
                                            i7 = 1;
                                        }
                                        p6l0VarQ6.m(i7);
                                        arrayList7.add((q6l0) p6l0VarQ6.i());
                                        it5 = it111;
                                        list8 = list111;
                                        z7 = z18;
                                        it6 = it7;
                                    }
                                }
                                Iterator it112 = it5;
                                boolean z19 = z7;
                                List list112 = list8;
                                k6l0VarR6.l(arrayList7);
                                l8l0Var2.J(k6l0VarR6);
                                arrayList5.add(Pair.create((n8l0) l8l0Var2.i(), (Long) pair7.second));
                                it5 = it112;
                                list8 = list112;
                                z7 = z19;
                            }
                            list6 = arrayList5;
                        }
                        zIsEmpty2 = list6.isEmpty();
                        list3 = list6;
                        if (zIsEmpty2) {
                            return;
                        }
                    } else {
                        list3 = list2;
                    }
                    jbl0VarF = f(str3);
                    hbl0Var2 = hbl0.AD_STORAGE;
                    if (jbl0VarF.i(hbl0Var2)) {
                        i = 0;
                        listSubList = list3;
                        break;
                    }
                    it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            strW2 = null;
                            break;
                        }
                        n8l0Var2 = (n8l0) ((Pair) it4.next()).first;
                        if (!n8l0Var2.w().isEmpty()) {
                            strW2 = n8l0Var2.w();
                            break;
                        }
                    }
                    if (strW2 != null) {
                        i = 0;
                        listSubList = list3;
                        break;
                    }
                    i6 = 0;
                    while (true) {
                        if (i6 < list3.size()) {
                            i = 0;
                            listSubList = list3;
                            break;
                        }
                        n8l0Var = (n8l0) ((Pair) list3.get(i6)).first;
                        if (!n8l0Var.w().isEmpty()) {
                            i = 0;
                            listSubList = list3.subList(0, i6);
                            break;
                        }
                        i6++;
                    }
                    q7l0VarX = j8l0.x();
                    size = listSubList.size();
                    arrayList = new ArrayList(listSubList.size());
                    if (e0().h(str3)) {
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                    zI = f(str3).i(hbl0Var2);
                    zI2 = f(str3).i(hbl0Var);
                    zQ2 = e0().q(str3, v2l0.M0);
                    zml0Var = this.j;
                    xml0VarH = zml0Var.h(str3);
                    list4 = listSubList;
                    while (true) {
                        k8l0Var = this.l;
                        if (i < size) {
                            break;
                            break;
                        }
                        l8l0Var = (l8l0) ((n8l0) ((Pair) list4.get(i)).first).k();
                        int i16 = i;
                        arrayList.add((Long) ((Pair) list4.get(i)).second);
                        e0().l();
                        l8l0Var.w();
                        l8l0Var.g();
                        ((n8l0) l8l0Var.b).g0(j);
                        k8l0Var.getClass();
                        l8l0Var.N();
                        if (i2 == 0) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).T0();
                        }
                        if (!zI) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).A1();
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).C1();
                        }
                        if (!zI2) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).E1();
                        }
                        v(str3, l8l0Var);
                        if (!zQ2) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).a1();
                        }
                        if (!zI2) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).M1();
                        }
                        strW = ((n8l0) l8l0Var.b).w();
                        if (TextUtils.isEmpty(strW)) {
                            i4 = size;
                            if (strW.equals("00000000-0000-0000-0000-000000000000")) {
                                z3 = zI2;
                                i5 = i2;
                                list5 = list4;
                                z6 = zQ2;
                            }
                            if (l8l0Var.a0() != 0) {
                                if (e0().q(str3, v2l0.C0)) {
                                    l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                                }
                                o9l0Var = xml0VarH.d;
                                if (o9l0Var != null) {
                                    l8l0Var.F(o9l0Var);
                                }
                                q7l0VarX.g();
                                ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                            }
                            i = i16 + 1;
                            size = i4;
                            zI2 = z3;
                            list4 = list5;
                            i2 = i5;
                            zQ2 = z6;
                        } else {
                            i4 = size;
                        }
                        arrayList4 = new ArrayList(l8l0Var.Z());
                        it3 = arrayList4.iterator();
                        z3 = zI2;
                        lValueOf = null;
                        lValueOf2 = null;
                        z4 = false;
                        z5 = false;
                        while (it3.hasNext()) {
                            i2 = i2;
                            d7l0Var = (d7l0) it3.next();
                            list4 = list4;
                            zQ2 = zQ2;
                            if ("_fx".equals(d7l0Var.t())) {
                                it3.remove();
                                z4 = true;
                            } else if ("_f".equals(d7l0Var.t())) {
                                j0();
                                k7l0VarO = pol0.o("_pfo", d7l0Var);
                                if (k7l0VarO != null) {
                                    lValueOf = Long.valueOf(k7l0VarO.v());
                                }
                                j0();
                                k7l0VarO2 = pol0.o("_uwa", d7l0Var);
                                if (k7l0VarO2 != null) {
                                    lValueOf2 = Long.valueOf(k7l0VarO2.v());
                                }
                            } else {
                                list4 = list4;
                                i2 = i2;
                                zQ2 = zQ2;
                            }
                            z5 = true;
                        }
                        i5 = i2;
                        list5 = list4;
                        z6 = zQ2;
                        if (z4) {
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).b0();
                            l8l0Var.g();
                            ((n8l0) l8l0Var.b).a0(arrayList4);
                        }
                        if (z5) {
                            u(l8l0Var.s(), true, lValueOf, lValueOf2);
                        }
                        if (l8l0Var.a0() != 0) {
                            if (e0().q(str3, v2l0.C0)) {
                                l8l0Var.U(j0().M(((n8l0) l8l0Var.i()).e()));
                            }
                            o9l0Var = xml0VarH.d;
                            if (o9l0Var != null) {
                                l8l0Var.F(o9l0Var);
                            }
                            q7l0VarX.g();
                            ((j8l0) q7l0VarX.b).A((n8l0) l8l0Var.i());
                        }
                        i = i16 + 1;
                        size = i4;
                        zI2 = z3;
                        list4 = list5;
                        i2 = i5;
                        zQ2 = z6;
                    }
                    if (((j8l0) q7l0VarX.b).r() == 0) {
                        p(arrayList);
                        y(false, 204, null, null, str3, Collections.EMPTY_LIST);
                        return;
                    }
                    j8l0Var = (j8l0) q7l0VarX.i();
                    arrayList2 = new ArrayList();
                    egl0Var = xml0VarH.c;
                    if (egl0Var == egl0.SGTM_CLIENT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (egl0Var != egl0.SGTM) {
                        if (z) {
                            z2 = true;
                        } else {
                            str2 = null;
                        }
                        i5l0Var = this.b;
                        U(i5l0Var);
                        if (i5l0Var.k()) {
                            if (Log.isLoggable(a().m(), 2)) {
                                strE = j0().E(j8l0Var);
                            } else {
                                strE = str2;
                            }
                            j0();
                            byte[] bArrE7 = j8l0Var.e();
                            p(arrayList);
                            this.i.i.b(j);
                            a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE7.length), strE);
                            this.u = true;
                            U(i5l0Var);
                            i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    it = ((j8l0) q7l0VarX.i()).q().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((n8l0) it.next()).O()) {
                                string = UUID.randomUUID().toString();
                                break;
                            }
                        } else {
                            string = null;
                            break;
                        }
                    }
                    j8l0 j8l0Var12 = (j8l0) q7l0VarX.i();
                    b().g();
                    l0();
                    q7l0VarY = j8l0.y(j8l0Var12);
                    if (!TextUtils.isEmpty(string)) {
                        q7l0VarY.g();
                        ((j8l0) q7l0VarY.b).D(string);
                    }
                    strT = f0().t(str3);
                    if (!TextUtils.isEmpty(strT)) {
                        q7l0VarY.m(strT);
                    }
                    arrayList3 = new ArrayList();
                    it2 = j8l0Var12.q().iterator();
                    while (it2.hasNext()) {
                        l8l0 l8l0VarW4 = n8l0.W((n8l0) it2.next());
                        l8l0VarW4.g();
                        ((n8l0) l8l0VarW4.b).T0();
                        arrayList3.add((n8l0) l8l0VarW4.i());
                    }
                    q7l0VarY.g();
                    ((j8l0) q7l0VarY.b).C();
                    q7l0VarY.g();
                    ((j8l0) q7l0VarY.b).B(arrayList3);
                    u4l0 u4l0Var9 = a().n;
                    if (TextUtils.isEmpty(string)) {
                        strL = "null";
                    } else {
                        strL = q7l0VarY.l();
                    }
                    u4l0Var9.b(strL, "[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ");
                    j8l0Var2 = (j8l0) q7l0VarY.i();
                    if (TextUtils.isEmpty(string)) {
                        j8l0 j8l0Var13 = (j8l0) q7l0VarX.i();
                        b().g();
                        l0();
                        q7l0VarX2 = j8l0.x();
                        a().n.b(string, "[sgtm] Processing Google Signal, sgtmJoinId:");
                        q7l0VarX2.g();
                        ((j8l0) q7l0VarX2.b).D(string);
                        while (r0.hasNext()) {
                            l8l0 l8l0VarV4 = n8l0.V();
                            String strP4 = n8l0Var3.P();
                            l8l0VarV4.g();
                            ((n8l0) l8l0VarV4.b).S0(strP4);
                            int iL3 = n8l0Var3.L0();
                            l8l0VarV4.g();
                            ((n8l0) l8l0VarV4.b).k1(iL3);
                            q7l0VarX2.g();
                            ((j8l0) q7l0VarX2.b).A((n8l0) l8l0VarV4.i());
                        }
                        j8l0 j8l0Var14 = (j8l0) q7l0VarX2.i();
                        strT2 = zml0Var.b.f0().t(str3);
                        zIsEmpty = TextUtils.isEmpty(strT2);
                        egl0Var2 = egl0.GOOGLE_SIGNAL;
                        egl0Var3 = egl0.GOOGLE_SIGNAL_PENDING;
                        if (zIsEmpty) {
                            Uri uri4 = Uri.parse((String) v2l0.s.a(null));
                            Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                            String authority4 = uri4.getAuthority();
                            StringBuilder sb9 = new StringBuilder(String.valueOf(strT2).length() + 1 + String.valueOf(authority4).length());
                            sb9.append(strT2);
                            sb9.append(".");
                            sb9.append(authority4);
                            builderBuildUpon4.authority(sb9.toString());
                            String string5 = builderBuildUpon4.build().toString();
                            if (z2) {
                                egl0Var2 = egl0Var3;
                            }
                            str2 = null;
                            xml0Var = new xml0(string5, Collections.EMPTY_MAP, egl0Var2, null);
                        } else {
                            str2 = null;
                            String str8 = (String) v2l0.s.a(null);
                            if (z2) {
                                egl0Var2 = egl0Var3;
                            }
                            xml0Var = new xml0(str8, Collections.EMPTY_MAP, egl0Var2, null);
                        }
                        arrayList2.add(Pair.create(j8l0Var14, xml0Var));
                    } else {
                        str2 = null;
                    }
                    if (z2) {
                        str3 = str;
                        j8l0Var = j8l0Var2;
                        i5l0Var = this.b;
                        U(i5l0Var);
                        if (i5l0Var.k()) {
                            if (Log.isLoggable(a().m(), 2)) {
                                strE = j0().E(j8l0Var);
                            } else {
                                strE = str2;
                            }
                            j0();
                            byte[] bArrE8 = j8l0Var.e();
                            p(arrayList);
                            this.i.i.b(j);
                            a().n.d(str3, "Uploading data. app, uncompressed size, data", Integer.valueOf(bArrE8.length), strE);
                            this.u = true;
                            U(i5l0Var);
                            i5l0Var.l(str3, xml0VarH, j8l0Var, new dnl0(this, str3, arrayList2));
                            return;
                        }
                        return;
                    }
                    q7l0Var = (q7l0) j8l0Var2.k();
                    while (i3 < j8l0Var2.r()) {
                        l8l0 l8l0Var7 = (l8l0) j8l0Var2.s(i3).k();
                        l8l0Var7.f0();
                        l8l0Var7.H(j);
                        q7l0Var.g();
                        ((j8l0) q7l0Var.b).z(i3, (n8l0) l8l0Var7.i());
                    }
                    arrayList2.add(Pair.create((j8l0) q7l0Var.i(), xml0VarH));
                    p(arrayList);
                    y(false, 204, null, null, str, arrayList2);
                    if (s(str, xml0VarH.a)) {
                        a().n.b(str, "[sgtm] Sending sgtm batches available notification to app");
                        Intent intent4 = new Intent();
                        intent4.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        intent4.setPackage(str);
                        S(k8l0Var.d(), intent4);
                    }
                }
            } catch (SQLiteException e17) {
                e = e17;
                j2 = -1;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor = null;
        }
    }

    public final boolean K(b7l0 b7l0Var, b7l0 b7l0Var2) {
        String strT;
        hm20.b("_e".equals(b7l0Var.r()));
        j0();
        k7l0 k7l0VarO = pol0.o("_sc", (d7l0) b7l0Var.i());
        String strT2 = null;
        if (k7l0VarO == null) {
            strT = null;
        } else {
            strT = k7l0VarO.t();
        }
        j0();
        k7l0 k7l0VarO2 = pol0.o(dqvOSm.InOZ, (d7l0) b7l0Var2.i());
        if (k7l0VarO2 != null) {
            strT2 = k7l0VarO2.t();
        }
        if (strT2 != null && strT2.equals(strT)) {
            hm20.b("_e".equals(b7l0Var.r()));
            j0();
            k7l0 k7l0VarO3 = pol0.o("_et", (d7l0) b7l0Var.i());
            if (k7l0VarO3 != null && k7l0VarO3.u() && k7l0VarO3.v() > 0) {
                long jV = k7l0VarO3.v();
                j0();
                k7l0 k7l0VarO4 = pol0.o("_et", (d7l0) b7l0Var2.i());
                if (k7l0VarO4 != null && k7l0VarO4.v() > 0) {
                    jV += k7l0VarO4.v();
                }
                j0();
                pol0.m(b7l0Var2, "_et", Long.valueOf(jV));
                j0();
                pol0.m(b7l0Var, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void X(String str, zzr zzrVar) {
        long j;
        b().g();
        l0();
        boolean zT = T(zzrVar);
        String str2 = zzrVar.a;
        if (!zT) {
            return;
        }
        if (!zzrVar.v) {
            c0(zzrVar);
            return;
        }
        Boolean boolV = V(zzrVar);
        if ("_npa".equals(str) && boolV != null) {
            a().m.a("Falling back to manifest metadata value for ad personalization");
            e().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (true != boolV.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            W(new zzpl(jCurrentTimeMillis, Long.valueOf(j), "_npa", StompClient.DEFAULT_ACK), zzrVar);
            return;
        }
        u4l0 u4l0Var = a().m;
        k8l0 k8l0Var = this.l;
        u4l0Var.b(k8l0Var.j.c(str), "Removing user property");
        lqk0 lqk0Var = this.c;
        U(lqk0Var);
        lqk0Var.S();
        try {
            c0(zzrVar);
            if (CaBJCMnsV.MNjiR.equals(str)) {
                lqk0 lqk0Var2 = this.c;
                U(lqk0Var2);
                hm20.h(str2);
                lqk0Var2.Y(str2, "_lair");
            }
            lqk0 lqk0Var3 = this.c;
            U(lqk0Var3);
            hm20.h(str2);
            lqk0Var3.Y(str2, str);
            lqk0 lqk0Var4 = this.c;
            U(lqk0Var4);
            lqk0Var4.T();
            a().m.b(k8l0Var.j.c(str), "User property removed");
        } finally {
            lqk0 lqk0Var5 = this.c;
            U(lqk0Var5);
            lqk0Var5.U();
        }
    }
}
