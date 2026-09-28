package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class qx5 implements n26 {
    public int A;
    public rf6 B;
    public final AtomicInteger C;
    public qis<Void> D;
    public nv5.a<Void> E;
    public final LinkedHashMap F;
    public int G;
    public final b H;
    public final o16 I;
    public final q36 J;
    public final d46 K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public lpv Q;
    public final uf6 R;
    public final ape0.a S;
    public final HashSet T;
    public h16 U;
    public final Object V;
    public vg80 W;
    public boolean X;
    public final lse Y;
    public final ihf Z;
    public final rnh0 a;
    public final tge0 a0;
    public final q26 b;
    public final e b0;
    public final od80 c;
    public final adl d;
    public volatile f e = f.c;
    public final xjs<n26.a> f;
    public final m36 i;
    public final ow5 v;
    public final g w;
    public final xx5 y;
    public CameraDevice z;

    public class a implements cbj<Void> {
        public final /* synthetic */ rf6 a;

        public a(rf6 rf6Var) {
            this.a = rf6Var;
        }

        @Override // defpackage.cbj
        public final void onFailure(Throwable th) {
            boolean z = th instanceof ijd.a;
            qx5 qx5Var = qx5.this;
            final wf80 wf80Var = null;
            if (!z) {
                if (th instanceof CancellationException) {
                    qx5Var.v("Unable to configure camera cancelled", null);
                    return;
                }
                f fVar = qx5Var.e;
                f fVar2 = f.y;
                if (fVar == fVar2) {
                    qx5.this.G(fVar2, new qg1(4, th), true);
                }
                pgt.d("Camera2CameraImpl", "Unable to configure camera " + qx5.this, th);
                qx5 qx5Var2 = qx5.this;
                if (qx5Var2.B == this.a) {
                    qx5Var2.E();
                    return;
                }
                return;
            }
            ijd ijdVar = ((ijd.a) th).a;
            for (wf80 wf80Var2 : qx5Var.a.c()) {
                if (wf80Var2.b().contains(ijdVar)) {
                    wf80Var = wf80Var2;
                    break;
                }
            }
            if (wf80Var != null) {
                qx5 qx5Var3 = qx5.this;
                ScheduledExecutorService scheduledExecutorServiceA = mku.a();
                final wf80.d dVar = wf80Var.f;
                if (dVar != null) {
                    qx5Var3.v("Posting surface closed", new Throwable());
                    ((adl) scheduledExecutorServiceA).execute(new Runnable() { // from class: uw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.a(wf80Var);
                        }
                    });
                }
            }
        }

        @Override // defpackage.cbj
        public final void onSuccess(Void r2) {
            if (((qw5) qx5.this.I).b() == 2 && qx5.this.e == f.y) {
                qx5.this.F(f.z);
            }
        }
    }

    public final class b extends CameraManager.AvailabilityCallback {
        public final String a;
        public boolean b = true;

        public b(String str) {
            this.a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            if (this.a.equals(str)) {
                this.b = true;
                if (qx5.this.e == f.d || qx5.this.e == f.e) {
                    qx5.this.K(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.a.equals(str)) {
                this.b = false;
            }
        }
    }

    public final class c {
        public c() {
        }
    }

    public final class d {
        public d() {
        }
    }

    public class e {
        public a a = null;

        public class a {
            public final ScheduledFuture<?> a;
            public final AtomicBoolean b = new AtomicBoolean(false);

            public a() {
                this.a = qx5.this.d.schedule(new rx5(this, 0), 2000L, TimeUnit.MILLISECONDS);
            }
        }

        public e() {
        }

        public final void a() {
            a aVar = this.a;
            if (aVar != null) {
                aVar.b.set(true);
                aVar.a.cancel(true);
            }
            this.a = null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final /* synthetic */ f[] A;
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;
        public static final f i;
        public static final f v;
        public static final f w;
        public static final f y;
        public static final f z;

        static {
            f fVar = new f("RELEASED", 0);
            a = fVar;
            f fVar2 = new f("RELEASING", 1);
            b = fVar2;
            f fVar3 = new f("INITIALIZED", 2);
            c = fVar3;
            f fVar4 = new f("PENDING_OPEN", 3);
            d = fVar4;
            f fVar5 = new f("OPENING_WITH_ERROR", 4);
            e = fVar5;
            f fVar6 = new f("CLOSING", 5);
            f = fVar6;
            f fVar7 = new f("REOPENING_QUIRK", 6);
            i = fVar7;
            f fVar8 = new f("REOPENING", 7);
            v = fVar8;
            f fVar9 = new f("OPENING", 8);
            w = fVar9;
            f fVar10 = new f("OPENED", 9);
            y = fVar10;
            f fVar11 = new f("CONFIGURED", 10);
            z = fVar11;
            A = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) A.clone();
        }
    }

    public final class g extends CameraDevice.StateCallback {
        public final od80 a;
        public final adl b;
        public b c;
        public ScheduledFuture<?> d;
        public final a e;

        public class a {
            public final long a;
            public long b = -1;

            public a(long j) {
                this.a = j;
            }

            public final int a() {
                if (!g.this.c()) {
                    return 700;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                long j = this.b;
                if (j == -1) {
                    this.b = jUptimeMillis;
                    j = jUptimeMillis;
                }
                long j2 = jUptimeMillis - j;
                if (j2 <= 120000) {
                    return 1000;
                }
                return j2 <= 300000 ? 2000 : 4000;
            }

            public final int b() {
                boolean zC = g.this.c();
                long j = this.a;
                if (zC) {
                    if (j > 0) {
                        return Math.min((int) j, 1800000);
                    }
                    return 1800000;
                }
                if (j > 0) {
                    return Math.min((int) j, 10000);
                }
                return 10000;
            }
        }

        public class b implements Runnable {
            public final od80 a;
            public boolean b = false;

            public b(od80 od80Var) {
                this.a = od80Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(new Runnable() { // from class: vx5
                    @Override // java.lang.Runnable
                    public final void run() {
                        qx5.g.b bVar = this.a;
                        if (bVar.b) {
                            return;
                        }
                        km20.g(null, qx5.this.e == qx5.f.v || qx5.this.e == qx5.f.i);
                        boolean zC = qx5.g.this.c();
                        qx5 qx5Var = qx5.this;
                        if (zC) {
                            qx5Var.J(true);
                        } else {
                            qx5Var.K(true);
                        }
                    }
                });
            }
        }

        public g(od80 od80Var, adl adlVar, long j) {
            this.a = od80Var;
            this.b = adlVar;
            this.e = new a(j);
        }

        public final boolean a() {
            if (this.d == null) {
                return false;
            }
            qx5.this.v("Cancelling scheduled re-open: " + this.c, null);
            this.c.b = true;
            this.c = null;
            this.d.cancel(false);
            this.d = null;
            return true;
        }

        public final void b() {
            km20.g(null, this.c == null);
            km20.g(null, this.d == null);
            long jUptimeMillis = SystemClock.uptimeMillis();
            a aVar = this.e;
            long j = aVar.b;
            if (j == -1) {
                aVar.b = jUptimeMillis;
                j = jUptimeMillis;
            }
            long j2 = jUptimeMillis - j;
            long jB = aVar.b();
            qx5 qx5Var = qx5.this;
            if (j2 >= jB) {
                aVar.b = -1L;
                pgt.c("Camera2CameraImpl", "Camera reopening attempted for " + aVar.b() + "ms without success.");
                qx5Var.G(f.d, null, false);
                return;
            }
            this.c = new b(this.a);
            qx5Var.v("Attempting camera re-open in " + aVar.a() + "ms: " + this.c + " activeResuming = " + qx5Var.X, null);
            this.d = this.b.schedule(this.c, (long) aVar.a(), TimeUnit.MILLISECONDS);
        }

        public final boolean c() {
            qx5 qx5Var = qx5.this;
            if (!qx5Var.X) {
                return false;
            }
            int i = qx5Var.A;
            return i == 1 || i == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            qx5.this.v("CameraDevice.onClosed()", null);
            km20.g("Unexpected onClose callback on camera device: " + cameraDevice, qx5.this.z == null);
            int iOrdinal = qx5.this.e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                km20.g(null, qx5.this.F.isEmpty());
                qx5.this.t();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                uj5.a(qx5.this.e, "Camera closed while in state: ");
                return;
            }
            qx5 qx5Var = qx5.this;
            int i = qx5Var.A;
            if (i == 0) {
                qx5Var.K(false);
            } else {
                qx5Var.v("Camera closed due to error: ".concat(qx5.x(i)), null);
                b();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            qx5.this.v("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            qx5 qx5Var = qx5.this;
            qx5Var.z = cameraDevice;
            qx5Var.A = i;
            e eVar = qx5Var.b0;
            qx5.this.v("Camera receive onErrorCallback", null);
            eVar.a();
            int iOrdinal = qx5.this.e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        String id = cameraDevice.getId();
                        String strX = qx5.x(i);
                        String strName = qx5.this.e.name();
                        StringBuilder sbA = ux5.a("CameraDevice.onError(): ", id, " failed with ", strX, " while in ");
                        sbA.append(strName);
                        sbA.append(" state. Will attempt recovering from error.");
                        pgt.a("Camera2CameraImpl", sbA.toString());
                        f fVar = f.v;
                        km20.g("Attempt to handle open error from non open state: " + qx5.this.e, qx5.this.e == f.w || qx5.this.e == f.y || qx5.this.e == f.z || qx5.this.e == fVar || qx5.this.e == f.i);
                        int i2 = 3;
                        if (i == 1 || i == 2 || i == 4) {
                            pgt.a("Camera2CameraImpl", tx5.a("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", qx5.x(i), "]"));
                            qx5 qx5Var2 = qx5.this;
                            km20.g("Can only reopen camera device after error if the camera device is actually in an error state.", qx5Var2.A != 0);
                            if (i == 1) {
                                i2 = 2;
                            } else if (i == 2) {
                                i2 = 1;
                            }
                            qx5Var2.G(fVar, new qg1(i2, null), true);
                            qx5Var2.s();
                        } else {
                            pgt.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + qx5.x(i) + " closing camera.");
                            qx5.this.G(f.f, new qg1(i == 3 ? 5 : 6, null), true);
                            qx5.this.s();
                        }
                        break;
                    default:
                        uj5.a(qx5.this.e, "onError() should not be possible from state: ");
                        break;
                }
                return;
            }
            String id2 = cameraDevice.getId();
            String strX2 = qx5.x(i);
            String strName2 = qx5.this.e.name();
            StringBuilder sbA2 = ux5.a("CameraDevice.onError(): ", id2, " failed with ", strX2, " while in ");
            sbA2.append(strName2);
            sbA2.append(" state. Will finish closing camera.");
            pgt.c("Camera2CameraImpl", sbA2.toString());
            qx5.this.s();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            qx5.this.v("CameraDevice.onOpened()", null);
            qx5 qx5Var = qx5.this;
            qx5Var.z = cameraDevice;
            qx5Var.A = 0;
            this.e.b = -1L;
            int iOrdinal = qx5Var.e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                km20.g(null, qx5.this.F.isEmpty());
                qx5.this.z.close();
                qx5.this.z = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    uj5.a(qx5.this.e, "onOpened() should not be possible from state: ");
                    return;
                }
                qx5.this.F(f.y);
                q36 q36Var = qx5.this.J;
                String id = cameraDevice.getId();
                qx5 qx5Var2 = qx5.this;
                if (q36Var.f(id, ((qw5) qx5Var2.I).c(qx5Var2.z.getId()))) {
                    qx5.this.D();
                }
            }
        }
    }

    public static abstract class h {
        public abstract List<tnh0.b> a();

        public abstract wf80 b();

        public abstract k8e0 c();

        public abstract Size d();

        public abstract snh0<?> e();

        public abstract String f();

        public abstract Class<?> g();
    }

    public qx5(Context context, q26 q26Var, String str, xx5 xx5Var, qw5 qw5Var, q36 q36Var, Executor executor, Handler handler, lse lseVar, long j, d46 d46Var) throws r36 {
        jlv.a<?> aVarB;
        xjs<n26.a> xjsVar = new xjs<>();
        this.f = xjsVar;
        this.A = 0;
        this.C = new AtomicInteger(0);
        this.F = new LinkedHashMap();
        this.G = 0;
        this.N = false;
        this.O = false;
        this.P = true;
        this.T = new HashSet();
        this.U = j16.a;
        this.V = new Object();
        this.X = false;
        this.b0 = new e();
        this.b = q26Var;
        this.I = qw5Var;
        this.J = q36Var;
        adl adlVar = new adl(handler);
        this.d = adlVar;
        od80 od80Var = new od80(executor);
        this.c = od80Var;
        this.w = new g(od80Var, adlVar, j);
        this.a = new rnh0(str);
        xjsVar.a.j(new xjs.a<>(n26.a.CLOSED));
        m36 m36Var = new m36(q36Var);
        this.i = m36Var;
        uf6 uf6Var = new uf6(od80Var);
        this.R = uf6Var;
        this.Y = lseVar;
        this.K = d46Var;
        try {
            e16 e16VarB = q26Var.b(str);
            ow5 ow5Var = new ow5(e16VarB, adlVar, od80Var, new d(), xx5Var.h);
            this.v = ow5Var;
            this.y = xx5Var;
            xx5Var.s(ow5Var);
            final ssw<l36> sswVar = m36Var.b;
            final wp40<l36> wp40Var = xx5Var.f;
            ssw sswVar2 = wp40Var.o;
            if (sswVar2 != null && (aVarB = wp40Var.l.b(sswVar2)) != null) {
                aVarB.a();
            }
            wp40Var.o = sswVar;
            kpf0.c(new Runnable() { // from class: cpu
                @Override // java.lang.Runnable
                public final void run() {
                    wp40.o(wp40Var, sswVar);
                }
            });
            this.Z = ihf.a(e16VarB);
            this.B = B();
            this.S = new ape0.a(uf6Var, adlVar, xx5Var.h, zhe.a, od80Var, handler);
            yj30 yj30Var = xx5Var.h;
            this.L = yj30Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || yj30Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.M = xx5Var.h.a(LegacyCameraSurfaceCleanupQuirk.class);
            b bVar = new b(str);
            this.H = bVar;
            c cVar = new c();
            synchronized (q36Var.b) {
                km20.g("Camera is already registered: " + this, !q36Var.e.containsKey(this));
                q36Var.e.put(this, new q36.a(od80Var, cVar, bVar));
            }
            q26Var.a.a(od80Var, bVar);
            this.a0 = new tge0(context, str, q26Var, new mx5(), vbh.a);
        } catch (rz5 e2) {
            throw new r36(e2);
        }
    }

    public static String x(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String y(lpv lpvVar) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        lpvVar.getClass();
        sb.append(lpvVar.hashCode());
        return sb.toString();
    }

    public static String z(pnh0 pnh0Var) {
        return pnh0Var.g() + pnh0Var.hashCode();
    }

    public final boolean A(lpv lpvVar) {
        int i;
        HashMap map;
        lpvVar.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.V) {
            try {
                i = ((qw5) this.I).b() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        rnh0 rnh0Var = this.a;
        rnh0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : rnh0Var.b.entrySet()) {
            if (((rnh0.a) entry.getValue()).e) {
                arrayList2.add((rnh0.a) entry.getValue());
            }
        }
        try {
            for (rnh0.a aVar : Collections.unmodifiableCollection(arrayList2)) {
                List<tnh0.b> list = aVar.d;
                if (list == null || list.get(0) != tnh0.b.f) {
                    if (aVar.c == null || aVar.d == null) {
                        pgt.i("Camera2CameraImpl", "Invalid stream spec or capture types in " + aVar);
                    }
                    wf80 wf80Var = aVar.a;
                    snh0<?> snh0Var = aVar.b;
                    for (ijd ijdVar : wf80Var.b()) {
                        tge0 tge0Var = this.a0;
                        int iM = snh0Var.m();
                        Size size = ijdVar.h;
                        o8e0 o8e0VarO = snh0Var.O();
                        hl1 hl1VarL = tge0Var.l(iM);
                        vge0.c cVar = vge0.c.b;
                        o8e0 o8e0Var = vge0.e;
                        arrayList.add(new ig1(vge0.a.b(iM, size, hl1VarL, i, cVar, o8e0VarO), snh0Var.m(), ijdVar.h, aVar.c.b(), aVar.d, aVar.c.d(), aVar.c.g(), aVar.c.c(), snh0Var.A()));
                    }
                }
            }
            this.a0.j(i, arrayList, map, false, false, false);
            v("Surface combination with metering repeating supported!", null);
            d46 d46Var = this.K;
            return (d46Var == null || ((Boolean) d46Var.N.b(d46.Z, Boolean.TRUE)).booleanValue()) ? false : true;
        } catch (IllegalArgumentException e2) {
            v("Surface combination with metering repeating  not supported!", e2);
        }
        map = new HashMap();
        map.put(lpvVar.c, Collections.singletonList(lpvVar.d));
    }

    public final rf6 B() {
        synchronized (this.V) {
            try {
                d46 d46Var = this.K;
                dz5 dz5Var = null;
                if (d46Var != null) {
                    wg1 wg1Var = ez5.a;
                    dz5Var = (dz5) d46Var.N.b(ez5.a, null);
                }
                dz5 dz5Var2 = dz5Var;
                if (this.W == null) {
                    return new qf6(this.Z, this.y.h, false, dz5Var2);
                }
                return new hy20(this.W, this.y, this.Z, this.c, this.d, dz5Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(boolean z) {
        f fVar = f.w;
        if (!z) {
            this.w.e.b = -1L;
        }
        this.w.a();
        this.b0.a();
        v("Opening camera.", null);
        F(fVar);
        try {
            this.b.a.d(this.y.a, this.c, u());
        } catch (SecurityException e2) {
            v("Unable to open camera due to " + e2.getMessage(), null);
            F(f.v);
            this.w.b();
        } catch (RuntimeException e3) {
            v("Unexpected error occurred when opening camera.", e3);
            G(f.e, new qg1(6, null), true);
        } catch (rz5 e4) {
            v("Unable to open camera due to " + e4.getMessage(), null);
            if (e4.a == 10001) {
                G(f.c, new qg1(7, e4), true);
                return;
            }
            e eVar = this.b0;
            f fVar2 = qx5.this.e;
            qx5 qx5Var = qx5.this;
            if (fVar2 != fVar) {
                qx5Var.v("Don't need the onError timeout handler.", null);
                return;
            }
            qx5Var.v("Camera waiting for onError.", null);
            eVar.a();
            eVar.a = eVar.new a();
        }
    }

    public final void E() {
        km20.g(null, this.B != null);
        v("Resetting Capture Session", null);
        rf6 rf6Var = this.B;
        wf80 wf80VarF = rf6Var.f();
        List<ue6> listE = rf6Var.e();
        rf6 rf6VarB = B();
        this.B = rf6VarB;
        rf6VarB.g(wf80VarF);
        this.B.a(listE);
        if (this.e.ordinal() != 9) {
            v("Skipping Capture Session state check due to current camera state: " + this.e + " and previous session status: " + rf6Var.b(), null);
        } else if (this.L && rf6Var.b()) {
            v("Close camera before creating new session", null);
            F(f.i);
        }
        if (this.M && rf6Var.b()) {
            v("ConfigAndClose is required when close the camera.", null);
            this.N = true;
        }
        rf6Var.close();
        qis qisVarRelease = rf6Var.release();
        v("Releasing session in state " + this.e.name(), null);
        this.F.put(rf6Var, qisVarRelease);
        qisVarRelease.k(new obj.b(qisVarRelease, new px5(this, rf6Var)), nqe.a());
    }

    public final void F(f fVar) {
        G(fVar, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f8  */
    public final void G(f fVar, qg1 qg1Var, boolean z) {
        n26.a aVar;
        n26.a aVar2;
        q36.a aVarB;
        HashMap map = null;
        v("Transitioning camera internal state: " + this.e + " --> " + fVar, null);
        if (sig0.b()) {
            sig0.c(fVar.ordinal(), "CX:C2State[" + this + "]");
            if (qg1Var != null) {
                this.G++;
            }
            if (this.G > 0) {
                sig0.c(qg1Var != null ? qg1Var.a : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.e = fVar;
        switch (fVar.ordinal()) {
            case 0:
                aVar = n26.a.RELEASED;
                break;
            case 1:
                aVar = n26.a.RELEASING;
                break;
            case 2:
                aVar = n26.a.CLOSED;
                break;
            case 3:
                aVar = n26.a.PENDING_OPEN;
                break;
            case 4:
            case 5:
            case 6:
                aVar = n26.a.CLOSING;
                break;
            case 7:
            case 8:
                aVar = n26.a.OPENING;
                break;
            case 9:
                aVar = n26.a.OPEN;
                break;
            case 10:
                aVar = n26.a.CONFIGURED;
                break;
            default:
                rcp.a(fVar, "Unknown state: ");
                return;
        }
        q36 q36Var = this.J;
        synchronized (q36Var.b) {
            try {
                int i = q36Var.f;
                n26.a aVar3 = n26.a.RELEASED;
                HashMap map2 = q36Var.e;
                if (aVar == aVar3) {
                    q36.a aVar4 = (q36.a) map2.remove(this);
                    if (aVar4 != null) {
                        q36Var.c();
                        aVar2 = aVar4.a;
                    } else {
                        aVar2 = null;
                    }
                } else {
                    q36.a aVar5 = (q36.a) map2.get(this);
                    km20.f(aVar5, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    n26.a aVar6 = aVar5.a;
                    aVar5.a = aVar;
                    n26.a aVar7 = n26.a.OPENING;
                    if (aVar == aVar7) {
                        km20.g("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", aVar.a || aVar6 == aVar7);
                    }
                    if (aVar6 != aVar) {
                        q36.d(this, aVar);
                        q36Var.c();
                    }
                    aVar2 = aVar6;
                }
                if (aVar2 != aVar) {
                    if (q36Var.d.b() == 2 && aVar == n26.a.CONFIGURED) {
                        String strC = q36Var.d.c(h().d());
                        if (strC != null) {
                            aVarB = q36Var.b(strC);
                        } else {
                            aVarB = null;
                        }
                    } else {
                        aVarB = null;
                    }
                    if (i < 1 && q36Var.f > 0) {
                        map = new HashMap();
                        for (Map.Entry entry : q36Var.e.entrySet()) {
                            if (((q36.a) entry.getValue()).a == n26.a.PENDING_OPEN) {
                                map.put((qz5) entry.getKey(), (q36.a) entry.getValue());
                            }
                        }
                    } else if (aVar == n26.a.PENDING_OPEN && q36Var.f > 0) {
                        map = new HashMap();
                        map.put(this, (q36.a) q36Var.e.get(this));
                    }
                    if (map != null && !z) {
                        map.remove(this);
                    }
                    if (map != null) {
                        for (q36.a aVar8 : map.values()) {
                            aVar8.getClass();
                            try {
                                od80 od80Var = aVar8.b;
                                final b bVar = aVar8.d;
                                od80Var.execute(new Runnable() { // from class: o36
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qx5.b bVar2 = bVar;
                                        if (qx5.this.e == qx5.f.d || qx5.this.e == qx5.f.e) {
                                            qx5.this.K(false);
                                        }
                                    }
                                });
                            } catch (RejectedExecutionException e2) {
                                pgt.d("CameraStateRegistry", "Unable to notify camera to open.", e2);
                            }
                        }
                    }
                    if (aVarB != null) {
                        try {
                            od80 od80Var2 = aVarB.b;
                            final c cVar = aVarB.c;
                            od80Var2.execute(new Runnable() { // from class: p36
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qx5.c cVar2 = cVar;
                                    if (qx5.this.e == qx5.f.y) {
                                        qx5.this.D();
                                    }
                                }
                            });
                        } catch (RejectedExecutionException e3) {
                            pgt.d("CameraStateRegistry", "Unable to notify camera to configure.", e3);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f.a.j(new xjs.a<>(aVar));
        this.i.a(aVar, qg1Var);
    }

    public final ArrayList H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pnh0 pnh0Var = (pnh0) obj;
            boolean z = this.P;
            String strZ = z(pnh0Var);
            Class<?> cls = pnh0Var.getClass();
            wf80 wf80Var = z ? pnh0Var.p : pnh0Var.q;
            snh0<?> snh0Var = pnh0Var.h;
            k8e0 k8e0Var = pnh0Var.i;
            arrayList2.add(new og1(strZ, cls, wf80Var, snh0Var, k8e0Var != null ? k8e0Var.f() : null, pnh0Var.i, pnh0Var.c() != null ? g8e0.J(pnh0Var) : null));
        }
        return arrayList2;
    }

    public final void I(ArrayList arrayList) {
        boolean z;
        rnh0.a aVar;
        Size sizeD;
        boolean zIsEmpty = this.a.c().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        Rational rational = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h hVar = (h) obj;
            if (!this.a.e(hVar.f())) {
                rnh0 rnh0Var = this.a;
                String strF = hVar.f();
                wf80 wf80VarB = hVar.b();
                snh0<?> snh0VarE = hVar.e();
                k8e0 k8e0VarC = hVar.c();
                List<tnh0.b> listA = hVar.a();
                LinkedHashMap linkedHashMap = rnh0Var.b;
                rnh0.a aVar2 = (rnh0.a) linkedHashMap.get(strF);
                if (aVar2 == null) {
                    aVar = new rnh0.a(wf80VarB, snh0VarE, k8e0VarC, listA);
                    linkedHashMap.put(strF, aVar);
                } else {
                    aVar = aVar2;
                }
                aVar.e = true;
                rnh0Var.f(strF, wf80VarB, snh0VarE, k8e0VarC, listA);
                arrayList2.add(hVar.f());
                if (hVar.g() == aq20.class && (sizeD = hVar.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (zIsEmpty) {
            z = true;
            this.v.r(true);
            ow5 ow5Var = this.v;
            synchronized (ow5Var.d) {
                ow5Var.q++;
            }
        } else {
            z = true;
        }
        r();
        N();
        M();
        L();
        E();
        f fVar = this.e;
        f fVar2 = f.y;
        if (fVar == fVar2) {
            D();
        } else {
            int iOrdinal = this.e.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                J(false);
            } else if (iOrdinal != 5) {
                v("open() ignored due to being in state: " + this.e, null);
            } else {
                F(f.v);
                if (!this.F.isEmpty() && !this.O && this.A == 0) {
                    km20.g("Camera Device should be open if session close is not complete", this.z != null ? z : false);
                    F(fVar2);
                    D();
                }
            }
        }
        if (rational != null) {
            this.v.h.getClass();
        }
    }

    public final void J(boolean z) {
        v("Attempting to force open the camera.", null);
        if (this.J.e(this)) {
            C(z);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            F(f.d);
        }
    }

    public final void K(boolean z) {
        v("Attempting to open the camera.", null);
        if (this.H.b && this.J.e(this)) {
            C(z);
        } else {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            F(f.d);
        }
    }

    public final void L() {
        wf80.g gVarA = this.a.a();
        boolean zC = gVarA.c();
        ow5 ow5Var = this.v;
        if (!zC) {
            ow5Var.y = 1;
            ow5Var.h.d = 1;
            ow5Var.o.h = 1;
            this.B.g(ow5Var.m());
            return;
        }
        int i = gVarA.b().g.c;
        ow5Var.y = i;
        ow5Var.h.d = i;
        ow5Var.o.h = i;
        gVarA.a(ow5Var.m());
        this.B.g(gVarA.b());
    }

    public final void M() {
        if (lpt.a(this.y.b)) {
            wf80.g gVarA = this.a.a();
            if (gVarA.c()) {
                int iIntValue = ((Integer) gVarA.b().g.a().getUpper()).intValue();
                ow5 ow5Var = this.v;
                if (iIntValue > 30) {
                    ow5Var.s(true);
                } else {
                    ow5Var.s(false);
                }
            }
        }
    }

    public final void N() {
        Iterator<snh0<?>> it = this.a.d().iterator();
        boolean zC = false;
        while (it.hasNext()) {
            zC |= it.next().C();
        }
        zck0 zck0Var = this.v.m;
        if (zck0Var.d != zC && zC) {
            zck0Var.b();
        }
        zck0Var.d = zC;
    }

    @Override // defpackage.n26
    public final tcy<n26.a> b() {
        return this.f;
    }

    @Override // defpackage.n26
    public final void c(h16 h16Var) {
        if (h16Var == null) {
            h16Var = j16.a;
        }
        vg80 vg80VarV = h16Var.v();
        this.U = h16Var;
        synchronized (this.V) {
            this.W = vg80VarV;
        }
    }

    @Override // pnh0.b
    public final void d(pnh0 pnh0Var) {
        this.c.execute(new ww5(this, z(pnh0Var), this.P ? pnh0Var.p : pnh0Var.q, pnh0Var.h, pnh0Var.i, pnh0Var.c() == null ? null : g8e0.J(pnh0Var)));
    }

    @Override // defpackage.n26
    public final m16 e() {
        return this.v;
    }

    @Override // defpackage.n26
    public final h16 f() {
        return this.U;
    }

    @Override // defpackage.n26
    public final void g(final boolean z) {
        this.c.execute(new Runnable() { // from class: xw5
            @Override // java.lang.Runnable
            public final void run() {
                qx5 qx5Var = this.a;
                boolean z2 = z;
                qx5Var.X = z2;
                if (z2) {
                    if (qx5Var.e == qx5.f.d || qx5Var.e == qx5.f.e) {
                        qx5Var.J(false);
                    }
                }
            }
        });
    }

    @Override // defpackage.n26
    public final m26 h() {
        return this.y;
    }

    @Override // pnh0.b
    public final void j(pnh0 pnh0Var) {
        final String strZ = z(pnh0Var);
        final wf80 wf80Var = this.P ? pnh0Var.p : pnh0Var.q;
        final snh0<?> snh0Var = pnh0Var.h;
        final k8e0 k8e0Var = pnh0Var.i;
        final ArrayList arrayListJ = pnh0Var.c() == null ? null : g8e0.J(pnh0Var);
        this.c.execute(new Runnable() { // from class: jx5
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("Use case ");
                String str = strZ;
                sb.append(str);
                sb.append(" ACTIVE");
                String string = sb.toString();
                qx5 qx5Var = this.a;
                qx5Var.v(string, null);
                LinkedHashMap linkedHashMap = qx5Var.a.b;
                rnh0.a aVar = (rnh0.a) linkedHashMap.get(str);
                wf80 wf80Var2 = wf80Var;
                snh0<?> snh0Var2 = snh0Var;
                k8e0 k8e0Var2 = k8e0Var;
                List<tnh0.b> list = arrayListJ;
                if (aVar == null) {
                    aVar = new rnh0.a(wf80Var2, snh0Var2, k8e0Var2, list);
                    linkedHashMap.put(str, aVar);
                }
                aVar.f = true;
                qx5Var.a.f(str, wf80Var2, snh0Var2, k8e0Var2, list);
                qx5Var.L();
            }
        });
    }

    @Override // pnh0.b
    public final void k(pnh0 pnh0Var) {
        final String strZ = z(pnh0Var);
        final wf80 wf80Var = this.P ? pnh0Var.p : pnh0Var.q;
        final snh0<?> snh0Var = pnh0Var.h;
        final k8e0 k8e0Var = pnh0Var.i;
        final ArrayList arrayListJ = pnh0Var.c() == null ? null : g8e0.J(pnh0Var);
        this.c.execute(new Runnable() { // from class: hx5
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("Use case ");
                String str = strZ;
                sb.append(str);
                sb.append(" UPDATED");
                String string = sb.toString();
                qx5 qx5Var = this.a;
                qx5Var.v(string, null);
                qx5Var.a.f(str, wf80Var, snh0Var, k8e0Var, arrayListJ);
                qx5Var.L();
            }
        });
    }

    @Override // defpackage.n26
    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        final ArrayList arrayList3 = new ArrayList(H(arrayList2));
        ArrayList arrayList4 = new ArrayList(arrayList2);
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            pnh0 pnh0Var = (pnh0) obj;
            String strZ = z(pnh0Var);
            HashSet hashSet = this.T;
            if (hashSet.contains(strZ)) {
                pnh0Var.x();
                hashSet.remove(strZ);
            }
        }
        this.c.execute(new Runnable() { // from class: vw5
            @Override // java.lang.Runnable
            public final void run() {
                qx5.e.a aVar;
                qx5 qx5Var = this.a;
                ArrayList arrayList5 = arrayList3;
                ArrayList arrayList6 = new ArrayList();
                int size2 = arrayList5.size();
                boolean z = false;
                boolean z2 = false;
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList5.get(i2);
                    i2++;
                    qx5.h hVar = (qx5.h) obj2;
                    if (qx5Var.a.e(hVar.f())) {
                        qx5Var.a.b.remove(hVar.f());
                        arrayList6.add(hVar.f());
                        if (hVar.g() == aq20.class) {
                            z2 = true;
                        }
                    }
                }
                if (arrayList6.isEmpty()) {
                    return;
                }
                qx5Var.v("Use cases [" + TextUtils.join(", ", arrayList6) + "] now DETACHED for camera", null);
                if (z2) {
                    qx5Var.v.h.getClass();
                }
                qx5Var.r();
                if (qx5Var.a.d().isEmpty()) {
                    ow5 ow5Var = qx5Var.v;
                    zck0 zck0Var = ow5Var.m;
                    boolean z3 = zck0Var.d;
                    zck0Var.d = false;
                    ow5Var.s(false);
                } else {
                    qx5Var.N();
                    qx5Var.M();
                }
                if (!qx5Var.a.c().isEmpty()) {
                    qx5Var.L();
                    qx5Var.E();
                    if (qx5Var.e == qx5.f.y) {
                        qx5Var.D();
                        return;
                    }
                    return;
                }
                qx5Var.v.k();
                qx5Var.E();
                qx5Var.v.r(false);
                qx5Var.B = qx5Var.B();
                qx5.f fVar = qx5.f.f;
                qx5Var.v("Closing camera.", null);
                switch (qx5Var.e.ordinal()) {
                    case 3:
                    case 4:
                        km20.g(null, qx5Var.z == null);
                        qx5Var.F(qx5.f.c);
                        break;
                    case 5:
                    default:
                        qx5Var.v("close() ignored due to being in state: " + qx5Var.e, null);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        if (qx5Var.w.a() || ((aVar = qx5Var.b0.a) != null && !aVar.b.get())) {
                            z = true;
                        }
                        qx5Var.b0.a();
                        qx5Var.F(fVar);
                        if (z) {
                            km20.g(null, qx5Var.F.isEmpty());
                            qx5Var.t();
                        }
                        break;
                    case 9:
                    case 10:
                        qx5Var.F(fVar);
                        qx5Var.s();
                        break;
                }
            }
        });
    }

    @Override // defpackage.n26
    public final void m(ArrayList arrayList) {
        ow5 ow5Var = this.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        synchronized (ow5Var.d) {
            ow5Var.q++;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet = this.T;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            pnh0 pnh0Var = (pnh0) obj;
            String strZ = z(pnh0Var);
            if (!hashSet.contains(strZ)) {
                hashSet.add(strZ);
                pnh0Var.w();
                pnh0Var.u();
            }
        }
        final ArrayList arrayList4 = new ArrayList(H(arrayList2));
        try {
            this.c.execute(new Runnable() { // from class: gx5
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList5 = arrayList4;
                    qx5 qx5Var = this.a;
                    ow5 ow5Var2 = qx5Var.v;
                    try {
                        qx5Var.I(arrayList5);
                    } finally {
                        ow5Var2.k();
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            v("Unable to attach use cases.", e2);
            ow5Var.k();
        }
    }

    @Override // defpackage.n26
    public final void n() {
        this.c.execute(new Runnable() { // from class: yw5
            @Override // java.lang.Runnable
            public final void run() {
                qx5 qx5Var = this.a;
                qx5Var.v("Camera is removed. Updating state and cleaning up.", null);
                qx5.f fVar = qx5Var.e;
                qx5.f fVar2 = qx5.f.b;
                if (fVar == fVar2 || qx5Var.e == qx5.f.a) {
                    return;
                }
                qg1 qg1Var = new qg1(8, null);
                qx5Var.i.a(n26.a.CLOSED, qg1Var);
                qx5Var.G(fVar2, qg1Var, true);
                qx5Var.w.a();
                qx5Var.b0.a();
                if (qx5Var.z != null) {
                    qx5Var.s();
                } else {
                    qx5Var.w();
                }
            }
        });
    }

    @Override // defpackage.n26
    public final void p(boolean z) {
        this.P = z;
    }

    @Override // pnh0.b
    public final void q(pnh0 pnh0Var) {
        final String strZ = z(pnh0Var);
        this.c.execute(new Runnable() { // from class: ix5
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("Use case ");
                String str = strZ;
                sb.append(str);
                sb.append(" INACTIVE");
                String string = sb.toString();
                qx5 qx5Var = this.a;
                qx5Var.v(string, null);
                LinkedHashMap linkedHashMap = qx5Var.a.b;
                if (linkedHashMap.containsKey(str)) {
                    rnh0.a aVar = (rnh0.a) linkedHashMap.get(str);
                    aVar.f = false;
                    if (!aVar.e) {
                        linkedHashMap.remove(str);
                    }
                }
                qx5Var.L();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    public final void r() {
        rnh0 rnh0Var = this.a;
        wf80.g gVarB = rnh0Var.b();
        LinkedHashMap linkedHashMap = rnh0Var.b;
        wf80 wf80VarB = gVarB.b();
        int size = Collections.unmodifiableList(wf80VarB.g.a).size();
        int size2 = wf80VarB.b().size();
        lpv lpvVar = this.Q;
        boolean z = false;
        if (lpvVar == null ? false : rnh0Var.e(y(lpvVar))) {
            boolean z2 = size != 1 || size2 == 1;
            if (z2 || A(this.Q)) {
                if (this.Q != null) {
                    StringBuilder sb = new StringBuilder("MeteringRepeating");
                    this.Q.getClass();
                    sb.append(this.Q.hashCode());
                    String string = sb.toString();
                    if (linkedHashMap.containsKey(string)) {
                        rnh0.a aVar = (rnh0.a) linkedHashMap.get(string);
                        aVar.e = false;
                        if (!aVar.f) {
                            linkedHashMap.remove(string);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("MeteringRepeating");
                    this.Q.getClass();
                    sb2.append(this.Q.hashCode());
                    String string2 = sb2.toString();
                    if (linkedHashMap.containsKey(string2)) {
                        rnh0.a aVar2 = (rnh0.a) linkedHashMap.get(string2);
                        aVar2.f = false;
                        if (!aVar2.e) {
                            linkedHashMap.remove(string2);
                        }
                    }
                    lpv lpvVar2 = this.Q;
                    lpvVar2.getClass();
                    pgt.a("MeteringRepeating", "MeteringRepeating clear!");
                    gcn gcnVar = lpvVar2.a;
                    if (gcnVar != null) {
                        gcnVar.a();
                    }
                    lpvVar2.a = null;
                    this.Q = null;
                }
                if (z2) {
                    z = true;
                }
            } else {
                z = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z = true;
        } else {
            lpv lpvVar3 = this.Q;
            if (lpvVar3 == null) {
                lpvVar3 = new lpv(this.y.b, this.Y, new ax5(this));
                this.Q = lpvVar3;
            }
            if (!A(lpvVar3)) {
                lpv lpvVar4 = this.Q;
                if (lpvVar4 != null) {
                    String strY = y(lpvVar4);
                    lpv lpvVar5 = this.Q;
                    wf80 wf80Var = lpvVar5.b;
                    lpv.b bVar = lpvVar5.c;
                    tnh0.b bVar2 = tnh0.b.f;
                    List<tnh0.b> listSingletonList = Collections.singletonList(bVar2);
                    LinkedHashMap linkedHashMap2 = rnh0Var.b;
                    rnh0.a aVar3 = (rnh0.a) linkedHashMap2.get(strY);
                    if (aVar3 == null) {
                        aVar3 = new rnh0.a(wf80Var, bVar, null, listSingletonList);
                        linkedHashMap2.put(strY, aVar3);
                    }
                    aVar3.e = true;
                    rnh0Var.f(strY, wf80Var, bVar, null, listSingletonList);
                    lpv lpvVar6 = this.Q;
                    wf80 wf80Var2 = lpvVar6.b;
                    lpv.b bVar3 = lpvVar6.c;
                    List listSingletonList2 = Collections.singletonList(bVar2);
                    LinkedHashMap linkedHashMap3 = rnh0Var.b;
                    rnh0.a aVar4 = (rnh0.a) linkedHashMap3.get(strY);
                    if (aVar4 == null) {
                        aVar4 = new rnh0.a(wf80Var2, bVar3, null, listSingletonList2);
                        linkedHashMap3.put(strY, aVar4);
                    }
                    aVar4.f = true;
                }
                z = true;
            }
        }
        this.v.getClass();
        if (z) {
            return;
        }
        pgt.c("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    @Override // defpackage.n26
    public final qis<Void> release() {
        return nv5.a(new kx5(this));
    }

    public final void s() {
        km20.g("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.e + " (error: " + x(this.A) + ")", this.e == f.f || this.e == f.b || (this.e == f.v && this.A != 0));
        E();
        this.B.c();
    }

    public final void t() {
        km20.g(null, this.e == f.b || this.e == f.f);
        km20.g(null, this.F.isEmpty());
        if (!this.N) {
            w();
            return;
        }
        if (this.O) {
            v("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.H.b) {
            this.N = false;
            w();
            v("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            v("Open camera to configAndClose", null);
            nv5.d dVarA = nv5.a(new zw5(this));
            this.O = true;
            dVarA.b.k(new Runnable() { // from class: fx5
                @Override // java.lang.Runnable
                public final void run() {
                    qx5 qx5Var = this.a;
                    qx5Var.O = false;
                    qx5Var.N = false;
                    qx5Var.v("OpenCameraConfigAndClose is done, state: " + qx5Var.e, null);
                    int iOrdinal = qx5Var.e.ordinal();
                    if (iOrdinal == 1 || iOrdinal == 5) {
                        km20.g(null, qx5Var.F.isEmpty());
                        qx5Var.w();
                        return;
                    }
                    if (iOrdinal != 7) {
                        qx5Var.v("OpenCameraConfigAndClose finished while in state: " + qx5Var.e, null);
                    } else {
                        int i = qx5Var.A;
                        if (i == 0) {
                            qx5Var.K(false);
                        } else {
                            qx5Var.v("OpenCameraConfigAndClose in error: ".concat(qx5.x(i)), null);
                            qx5Var.w.b();
                        }
                    }
                }
            }, this.c);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.y.a);
    }

    public final CameraDevice.StateCallback u() {
        ArrayList arrayList = new ArrayList(this.a.b().b().c);
        arrayList.add(this.R.f);
        arrayList.add(this.w);
        return a26.a(arrayList);
    }

    public final void v(String str, Throwable th) {
        pgt.b("Camera2CameraImpl", lx5.a("{", toString(), "} ", str), th);
    }

    public final void w() {
        f fVar = f.f;
        km20.g(null, this.e == f.b || this.e == fVar);
        km20.g(null, this.F.isEmpty());
        this.z = null;
        if (this.e == fVar) {
            F(f.c);
            return;
        }
        this.b.a.e(this.H);
        F(f.a);
        nv5.a<Void> aVar = this.E;
        if (aVar != null) {
            aVar.b(null);
            this.E = null;
        }
    }

    public final void D() {
        km20.g(null, this.e == f.y);
        wf80.g gVarB = this.a.b();
        if (!gVarB.c()) {
            v("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        if (!this.J.f(this.z.getId(), ((qw5) this.I).c(this.z.getId()))) {
            v(rarBonoqWB.jCFdneCwXviVG + ((qw5) this.I).b(), null);
            return;
        }
        HashMap map = new HashMap();
        Collection<wf80> collectionC = this.a.c();
        Collection<snh0<?>> collectionD = this.a.d();
        wg1 wg1Var = q8e0.a;
        collectionC.getClass();
        collectionD.getClass();
        ArrayList arrayList = new ArrayList(collectionD);
        for (wf80 wf80Var : collectionC) {
            if (!wf80Var.g.b.N.containsKey(wg1Var) || wf80Var.b().size() == 1) {
                if (wf80Var.g.b.N.containsKey(wg1Var)) {
                    int i = 0;
                    for (wf80 wf80Var2 : collectionC) {
                        if (((snh0) arrayList.get(i)).P() == tnh0.b.f) {
                            List<ijd> listB = wf80Var2.b();
                            listB.getClass();
                            km20.g("MeteringRepeating should contain a surface", !listB.isEmpty());
                            map.put(wf80Var2.b().get(0), 1L);
                        } else if (wf80Var2.g.b.N.containsKey(wg1Var)) {
                            List<ijd> listB2 = wf80Var2.b();
                            listB2.getClass();
                            if (!listB2.isEmpty()) {
                                ijd ijdVar = wf80Var2.b().get(0);
                                Object objD = wf80Var2.g.b.d(wg1Var);
                                objD.getClass();
                                map.put(ijdVar, objD);
                            }
                        }
                        i++;
                    }
                    break;
                }
            } else {
                pgt.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(wf80Var.b().size())}, 1)));
            }
            this.B.d(map);
            rf6 rf6Var = this.B;
            wf80 wf80VarB = gVarB.b();
            CameraDevice cameraDevice = this.z;
            cameraDevice.getClass();
            ape0.a aVar = this.S;
            qis qisVarH = rf6Var.h(wf80VarB, cameraDevice, new kpe0(aVar.d, aVar.b, aVar.e, aVar.f, aVar.a, aVar.c));
            qisVarH.k(new obj.b(qisVarH, new a(rf6Var)), this.c);
        }
        pgt.a("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + map);
        this.B.d(map);
        rf6 rf6Var2 = this.B;
        wf80 wf80VarB2 = gVarB.b();
        CameraDevice cameraDevice2 = this.z;
        cameraDevice2.getClass();
        ape0.a aVar2 = this.S;
        qis qisVarH2 = rf6Var2.h(wf80VarB2, cameraDevice2, new kpe0(aVar2.d, aVar2.b, aVar2.e, aVar2.f, aVar2.a, aVar2.c));
        qisVarH2.k(new obj.b(qisVarH2, new a(rf6Var2)), this.c);
    }
}
