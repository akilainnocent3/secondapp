package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hy20 implements rf6 {
    public static final ArrayList n = new ArrayList();
    public static int o = 0;
    public final vg80 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final qf6 d;
    public wf80 f;
    public nz5 g;
    public wf80 h;
    public a i;
    public final int m;
    public List<ijd> e = new ArrayList();
    public volatile List<ue6> j = null;
    public hf6 k = new hf6(w2z.U(ftw.V()));
    public hf6 l = new hf6(w2z.U(ftw.V()));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("UNINITIALIZED", 0);
            a = aVar;
            a aVar2 = new a("SESSION_INITIALIZED", 1);
            b = aVar2;
            a aVar3 = new a("ON_CAPTURE_SESSION_STARTED", 2);
            c = aVar3;
            a aVar4 = new a("ON_CAPTURE_SESSION_ENDED", 3);
            d = aVar4;
            a aVar5 = new a("DE_INITIALIZED", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public static class b {
    }

    public hy20(vg80 vg80Var, xx5 xx5Var, ihf ihfVar, od80 od80Var, adl adlVar, dz5 dz5Var) {
        this.m = 0;
        this.d = new qf6(ihfVar, new yj30(Collections.EMPTY_LIST), zhe.a.b(CaptureSessionShouldUseMrirQuirk.class) != null, dz5Var);
        this.a = vg80Var;
        this.b = od80Var;
        this.c = adlVar;
        this.i = a.a;
        int i = o;
        o = i + 1;
        this.m = i;
        pgt.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + i + ")");
    }

    public static void i(List<ue6> list) {
        for (ue6 ue6Var : list) {
            Iterator<tz5> it = ue6Var.e.iterator();
            while (it.hasNext()) {
                it.next().a(ue6Var.b());
            }
        }
    }

    @Override // defpackage.rf6
    public final void a(List<ue6> list) {
        if (list.isEmpty()) {
            return;
        }
        pgt.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.m + ") + state =" + this.i);
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.j == null) {
                this.j = list;
                return;
            } else {
                i(list);
                pgt.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                pgt.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.i);
                i(list);
                return;
            }
            return;
        }
        for (ue6 ue6Var : list) {
            int i = ue6Var.c;
            if (i != 2 && i != 4) {
                pgt.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator<hoa.a<?>> it = hf6.a.c(ue6Var.b).b().c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i(Arrays.asList(ue6Var));
                        break;
                    }
                    CaptureRequest.Key key = (CaptureRequest.Key) it.next().c();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        vg80 vg80Var = this.a;
                        ue6Var.b();
                        vg80Var.getClass();
                        break;
                    }
                }
            } else {
                hf6.a aVarC = hf6.a.c(ue6Var.b);
                w2z w2zVar = ue6Var.b;
                wg1 wg1Var = ue6.i;
                if (w2zVar.N.containsKey(wg1Var)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
                    aVarC.a.Y(jz5.U(key2), (Integer) w2zVar.d(wg1Var));
                }
                wg1 wg1Var2 = ue6.j;
                if (w2zVar.N.containsKey(wg1Var2)) {
                    CaptureRequest.Key key3 = CaptureRequest.JPEG_QUALITY;
                    aVarC.a.Y(jz5.U(key3), Byte.valueOf(((Integer) w2zVar.d(wg1Var2)).byteValue()));
                }
                hf6 hf6VarB = aVarC.b();
                this.l = hf6VarB;
                hf6 hf6Var = this.k;
                ftw ftwVarV = ftw.V();
                hoa.b bVar = hoa.b.d;
                for (hoa.a<?> aVar : hf6Var.c()) {
                    ftwVarV.X(aVar, bVar, hf6Var.d(aVar));
                }
                for (hoa.a<?> aVar2 : hf6VarB.c()) {
                    ftwVarV.X(aVar2, bVar, hf6VarB.d(aVar2));
                }
                vg80 vg80Var2 = this.a;
                w2z.U(ftwVarV);
                vg80Var2.g();
                vg80 vg80Var3 = this.a;
                ue6Var.b();
                vg80Var3.b();
            }
        }
    }

    @Override // defpackage.rf6
    public final boolean b() {
        return this.d.b();
    }

    @Override // defpackage.rf6
    public final void c() {
        pgt.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.m + ")");
        if (this.j != null) {
            for (ue6 ue6Var : this.j) {
                Iterator<tz5> it = ue6Var.e.iterator();
                while (it.hasNext()) {
                    it.next().a(ue6Var.b());
                }
            }
            this.j = null;
        }
    }

    @Override // defpackage.rf6
    public final void close() {
        pgt.a("ProcessingCaptureSession", "close (id=" + this.m + ") state=" + this.i);
        if (this.i == a.c) {
            pgt.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.m + ")");
            this.a.c();
            nz5 nz5Var = this.g;
            if (nz5Var != null) {
                synchronized (nz5Var.a) {
                }
            }
            this.i = a.d;
        }
        this.d.close();
    }

    @Override // defpackage.rf6
    public final void d(HashMap map) {
    }

    @Override // defpackage.rf6
    public final List<ue6> e() {
        return this.j != null ? this.j : Collections.EMPTY_LIST;
    }

    @Override // defpackage.rf6
    public final wf80 f() {
        return this.f;
    }

    @Override // defpackage.rf6
    public final void g(wf80 wf80Var) {
        pgt.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.m + ")");
        this.f = wf80Var;
        if (wf80Var == null) {
            return;
        }
        nz5 nz5Var = this.g;
        if (nz5Var != null) {
            synchronized (nz5Var.a) {
            }
        }
        if (this.i == a.c) {
            hf6.a aVarC = hf6.a.c(wf80Var.g.b);
            Integer numF = cz5.f(wf80Var.g);
            if (numF != null) {
                aVarC.a.Y(jz5.U(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE), numF);
            }
            hf6 hf6VarB = aVarC.b();
            this.k = hf6VarB;
            hf6 hf6Var = this.l;
            ftw ftwVarV = ftw.V();
            hoa.b bVar = hoa.b.d;
            for (hoa.a<?> aVar : hf6VarB.c()) {
                ftwVarV.X(aVar, bVar, hf6VarB.d(aVar));
            }
            for (hoa.a<?> aVar2 : hf6Var.c()) {
                ftwVarV.X(aVar2, bVar, hf6Var.d(aVar2));
            }
            vg80 vg80Var = this.a;
            w2z.U(ftwVarV);
            vg80Var.g();
            for (ijd ijdVar : Collections.unmodifiableList(wf80Var.g.a)) {
                if (Objects.equals(ijdVar.j, aq20.class) || Objects.equals(ijdVar.j, g8e0.class)) {
                    this.a.h();
                    return;
                }
            }
            this.a.a();
        }
    }

    @Override // defpackage.rf6
    public final qis h(final wf80 wf80Var, final CameraDevice cameraDevice, final kpe0 kpe0Var) {
        km20.a("Invalid state state:" + this.i, this.i == a.a);
        km20.a("SessionConfig contains no surfaces", wf80Var.b().isEmpty() ^ true);
        pgt.a("ProcessingCaptureSession", "open (id=" + this.m + ")");
        List<ijd> listB = wf80Var.b();
        this.e = listB;
        ScheduledExecutorService scheduledExecutorService = this.c;
        Executor executor = this.b;
        return obj.g(obj.g(dbj.a(mjd.c(listB, executor, scheduledExecutorService)), new wz0() { // from class: cy20
            @Override // defpackage.wz0
            public final qis apply(Object obj) {
                final ijd ijdVarF;
                uj1 uj1Var;
                List list = (List) obj;
                final hy20 hy20Var = this.a;
                Executor executor2 = hy20Var.b;
                StringBuilder sb = new StringBuilder("-- getSurfaces done, start init (id=");
                int i = hy20Var.m;
                sb.append(i);
                sb.append(")");
                pgt.a("ProcessingCaptureSession", sb.toString());
                if (hy20Var.i == hy20.a.e) {
                    return new fcn.a(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                boolean zContains = list.contains(null);
                wf80 wf80Var2 = wf80Var;
                if (zContains) {
                    return new fcn.a(new ijd.a(wf80Var2.b().get(list.indexOf(null)), "Surface closed"));
                }
                uj1 uj1Var2 = null;
                uj1 uj1Var3 = null;
                uj1 uj1Var4 = null;
                for (int i2 = 0; i2 < wf80Var2.b().size(); i2++) {
                    ijd ijdVar = wf80Var2.b().get(i2);
                    boolean zEquals = Objects.equals(ijdVar.j, aq20.class);
                    int i3 = ijdVar.i;
                    Size size = ijdVar.h;
                    if (zEquals || Objects.equals(ijdVar.j, g8e0.class)) {
                        uj1Var2 = new uj1(ijdVar.c().get(), size, i3);
                    } else if (Objects.equals(ijdVar.j, h8n.class)) {
                        uj1Var3 = new uj1(ijdVar.c().get(), size, i3);
                    } else if (Objects.equals(ijdVar.j, x7n.class)) {
                        uj1Var4 = new uj1(ijdVar.c().get(), size, i3);
                    }
                }
                wf80.f fVar = wf80Var2.b;
                if (fVar != null) {
                    ijdVarF = fVar.f();
                    uj1Var = new uj1(ijdVarF.c().get(), ijdVarF.h, ijdVarF.i);
                } else {
                    ijdVarF = null;
                    uj1Var = null;
                }
                hy20Var.i = hy20.a.b;
                try {
                    ArrayList arrayList = new ArrayList(hy20Var.e);
                    if (ijdVarF != null) {
                        arrayList.add(ijdVarF);
                    }
                    mjd.b(arrayList);
                    pgt.i("ProcessingCaptureSession", "== initSession (id=" + i + ")");
                    try {
                        vg80 vg80Var = hy20Var.a;
                        new vj1(uj1Var2, uj1Var3, uj1Var4, uj1Var);
                        wf80 wf80VarE = vg80Var.e();
                        hy20Var.h = wf80VarE;
                        obj.d(wf80VarE.b().get(0).e).k(new Runnable() { // from class: ey20
                            @Override // java.lang.Runnable
                            public final void run() {
                                mjd.a(hy20Var.e);
                                ijd ijdVar2 = ijdVarF;
                                if (ijdVar2 != null) {
                                    ijdVar2.b();
                                }
                            }
                        }, nqe.a());
                        for (final ijd ijdVar2 : hy20Var.h.b()) {
                            hy20.n.add(ijdVar2);
                            obj.d(ijdVar2.e).k(new Runnable() { // from class: fy20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hy20.n.remove(ijdVar2);
                                }
                            }, executor2);
                        }
                        wf80.g gVar = new wf80.g();
                        gVar.a(wf80Var2);
                        gVar.a.clear();
                        gVar.b.a.clear();
                        gVar.a(hy20Var.h);
                        km20.a("Cannot transform the SessionConfig", gVar.c());
                        wf80 wf80VarB = gVar.b();
                        qf6 qf6Var = hy20Var.d;
                        CameraDevice cameraDevice2 = cameraDevice;
                        cameraDevice2.getClass();
                        qis qisVarH = qf6Var.h(wf80VarB, cameraDevice2, kpe0Var);
                        qisVarH.k(new obj.b(qisVarH, new gy20(hy20Var)), executor2);
                        return qisVarH;
                    } catch (Throwable th) {
                        pgt.d("ProcessingCaptureSession", "initSession failed", th);
                        mjd.a(hy20Var.e);
                        if (ijdVarF != null) {
                            ijdVarF.b();
                        }
                        throw th;
                    }
                } catch (ijd.a e) {
                    return new fcn.a(e);
                }
            }
        }, executor), new nbj(new oaj() { // from class: dy20
            @Override // defpackage.oaj
            public final Object apply(Object obj) {
                hy20 hy20Var = this.a;
                qf6 qf6Var = hy20Var.d;
                if (hy20Var.i == hy20.a.b) {
                    List<ijd> listB2 = hy20Var.h.b();
                    ArrayList arrayList = new ArrayList();
                    for (ijd ijdVar : listB2) {
                        km20.a("Surface must be SessionProcessorSurface", ijdVar instanceof wg80);
                        arrayList.add((wg80) ijdVar);
                    }
                    hy20Var.g = new nz5(qf6Var, arrayList);
                    pgt.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + hy20Var.m + ")");
                    hy20Var.a.f();
                    hy20Var.i = hy20.a.c;
                    wf80 wf80Var2 = hy20Var.f;
                    if (wf80Var2 != null) {
                        hy20Var.g(wf80Var2);
                    }
                    if (hy20Var.j != null) {
                        hy20Var.a(hy20Var.j);
                        hy20Var.j = null;
                    }
                }
                return null;
            }
        }), executor);
    }

    @Override // defpackage.rf6
    public final qis release() {
        pgt.a("ProcessingCaptureSession", qUnCRF.yacDJgxCDjU + this.m + ") mProcessorState=" + this.i);
        qis qisVarRelease = this.d.release();
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            qisVarRelease.k(new Runnable() { // from class: by20
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb = new StringBuilder("== deInitSession (id=");
                    hy20 hy20Var = this.a;
                    sb.append(hy20Var.m);
                    sb.append(")");
                    pgt.a("ProcessingCaptureSession", sb.toString());
                    hy20Var.a.d();
                }
            }, nqe.a());
        }
        this.i = a.e;
        return qisVarRelease;
    }
}
