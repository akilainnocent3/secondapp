package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class qf6 implements rf6 {
    public final b c;
    public kpe0 d;
    public ape0 e;
    public wf80 f;
    public a i;
    public a j;
    public nv5.d k;
    public nv5.a<Void> l;
    public HashMap m;
    public final m0e0 n;
    public final v3g0 o;
    public final cb50 p;
    public final ihf q;
    public final ocf0 r;
    public final boolean s;
    public final dz5 t;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final HashMap g = new HashMap();
    public List<ijd> h = Collections.EMPTY_LIST;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("UNINITIALIZED", 0);
            a = aVar;
            a aVar2 = new a("RELEASED", 1);
            b = aVar2;
            a aVar3 = new a("INITIALIZED", 2);
            c = aVar3;
            a aVar4 = new a("GET_SURFACE", 3);
            d = aVar4;
            a aVar5 = new a("RELEASING", 4);
            e = aVar5;
            a aVar6 = new a("CLOSED", 5);
            f = aVar6;
            a aVar7 = new a("OPENING", 6);
            i = aVar7;
            a aVar8 = new a("OPENED", 7);
            v = aVar8;
            w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    public final class b extends ape0.b {
        public b() {
        }

        @Override // ape0.b
        public final void o(ape0 ape0Var) {
            synchronized (qf6.this.a) {
                try {
                    switch (qf6.this.j.ordinal()) {
                        case 0:
                        case 2:
                        case 3:
                        case 7:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + qf6.this.j);
                        case 1:
                            pgt.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                        case 4:
                        case 5:
                        case 6:
                            qf6.this.l();
                            break;
                    }
                    pgt.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + qf6.this.j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ape0.b
        public final void p(ape0 ape0Var) {
            synchronized (qf6.this.a) {
                try {
                    switch (qf6.this.j.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + qf6.this.j);
                        case 4:
                            ape0Var.close();
                            break;
                        case 5:
                            qf6.this.e = ape0Var;
                            break;
                        case 6:
                            qf6.this.q(a.v);
                            qf6.this.e = ape0Var;
                            pgt.a("CaptureSession", "Attempting to send capture request onConfigured");
                            qf6 qf6Var = qf6.this;
                            qf6Var.p(qf6Var.f);
                            qf6 qf6Var2 = qf6.this;
                            qf6Var2.p.b().k(new mf6(qf6Var2), nqe.a());
                            break;
                    }
                    pgt.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + qf6.this.j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ape0.b
        public final void q(ape0 ape0Var) {
            synchronized (qf6.this.a) {
                try {
                    if (qf6.this.j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + qf6.this.j);
                    }
                    pgt.a("CaptureSession", "CameraCaptureSession.onReady() " + qf6.this.j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ape0.b
        public final void r(ape0 ape0Var) {
            synchronized (qf6.this.a) {
                try {
                    if (qf6.this.j == a.a) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + qf6.this.j);
                    }
                    pgt.a("CaptureSession", "onSessionFinished()");
                    qf6.this.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public qf6(ihf ihfVar, yj30 yj30Var, boolean z, dz5 dz5Var) {
        a aVar = a.a;
        this.i = aVar;
        this.j = aVar;
        this.m = new HashMap();
        this.n = new m0e0();
        this.o = new v3g0();
        q(a.c);
        this.q = ihfVar;
        this.c = new b();
        this.p = new cb50(yj30Var.a(CaptureNoResponseQuirk.class));
        this.r = new ocf0(yj30Var);
        this.s = z;
        this.t = dz5Var;
    }

    public static yx5 j(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback yx5Var;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tz5 tz5Var = (tz5) it.next();
            if (tz5Var == null) {
                yx5Var = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                te6.a(tz5Var, arrayList2);
                yx5Var = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new yx5(arrayList2);
            }
            arrayList.add(yx5Var);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new yx5(arrayList);
    }

    public static HashMap k(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (wf80.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i == 0) {
                    i = aVarA.a;
                }
                int i2 = aVarA.b;
                int i3 = aVarA.c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(new MultiResolutionStreamInfo(i2, i3, strD));
            }
            if (i == 0 || arrayList.isEmpty()) {
                StringBuilder sbA = efe0.a(i, "Skips to create instances for multi-resolution output. imageFormat: ", ", streamInfos size: ");
                sbA.append(arrayList.size());
                pgt.c("CaptureSession", sbA.toString());
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (wf80.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new oaz(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static HashMap n(ArrayList arrayList) {
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wf80.f fVar = (wf80.f) obj;
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList2 = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList2);
                }
                arrayList2.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    @Override // defpackage.rf6
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                a aVar = this.j;
                z = aVar == a.v || aVar == a.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.rf6
    public final void c() {
        ArrayList arrayList;
        synchronized (this.a) {
            try {
                if (this.b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ue6 ue6Var = (ue6) obj;
                Iterator<tz5> it = ue6Var.e.iterator();
                while (it.hasNext()) {
                    it.next().a(ue6Var.b());
                }
            }
        }
    }

    @Override // defpackage.rf6
    public final void close() {
        synchronized (this.a) {
            try {
                int iOrdinal = this.j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.j);
                }
                if (iOrdinal == 2) {
                    q(a.b);
                } else if (iOrdinal == 3) {
                    km20.f(this.d, "The Opener shouldn't null in state:" + this.j);
                    this.d.y();
                    q(a.b);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    km20.f(this.d, "The Opener shouldn't null in state:" + this.j);
                    this.d.y();
                    q(a.f);
                    this.p.c();
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rf6
    public final void d(HashMap map) {
        synchronized (this.a) {
            this.m = map;
        }
    }

    @Override // defpackage.rf6
    public final List<ue6> e() {
        List<ue6> listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.b);
        }
        return listUnmodifiableList;
    }

    @Override // defpackage.rf6
    public final wf80 f() {
        wf80 wf80Var;
        synchronized (this.a) {
            wf80Var = this.f;
        }
        return wf80Var;
    }

    @Override // defpackage.rf6
    public final void g(wf80 wf80Var) {
        synchronized (this.a) {
            try {
                switch (this.j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.j);
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case 2:
                    case 3:
                    case 6:
                        this.f = wf80Var;
                        break;
                    case 7:
                        this.f = wf80Var;
                        if (wf80Var == null) {
                            return;
                        }
                        if (!this.g.keySet().containsAll(wf80Var.b())) {
                            pgt.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            pgt.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            p(this.f);
                        }
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rf6
    public final qis h(final wf80 wf80Var, final CameraDevice cameraDevice, kpe0 kpe0Var) {
        synchronized (this.a) {
            try {
                if (this.j.ordinal() != 2) {
                    pgt.c("CaptureSession", "Open not allowed in state: " + this.j);
                    return new fcn.a(new IllegalStateException("open() should not allow the state: " + this.j));
                }
                q(a.d);
                ArrayList arrayList = new ArrayList(wf80Var.b());
                this.h = arrayList;
                this.d = kpe0Var;
                pw6 pw6VarG = obj.g(dbj.a(kpe0Var.v(arrayList)), new wz0() { // from class: lf6
                    /* JADX WARN: Code duplicated, block: B:40:0x014d A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x0013, B:12:0x0024, B:13:0x003c, B:17:0x0043, B:18:0x004a, B:20:0x0050, B:21:0x0066, B:22:0x00c9, B:24:0x00cf, B:25:0x00e6, B:27:0x00fa, B:29:0x00fe, B:30:0x010a, B:32:0x0125, B:34:0x0137, B:36:0x013f, B:40:0x014d, B:42:0x0161), top: B:86:0x0013 }] */
                    /* JADX WARN: Code duplicated, block: B:42:0x0161 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x0013, B:12:0x0024, B:13:0x003c, B:17:0x0043, B:18:0x004a, B:20:0x0050, B:21:0x0066, B:22:0x00c9, B:24:0x00cf, B:25:0x00e6, B:27:0x00fa, B:29:0x00fe, B:30:0x010a, B:32:0x0125, B:34:0x0137, B:36:0x013f, B:40:0x014d, B:42:0x0161), top: B:86:0x0013 }] */
                    /* JADX WARN: Code duplicated, block: B:47:0x017c  */
                    @Override // defpackage.wz0
                    public final qis apply(Object obj) throws Throwable {
                        Object obj2;
                        InputConfiguration inputConfiguration;
                        ArrayList arrayList2;
                        oaz oazVarM;
                        String str;
                        qf6 qf6Var = this.a;
                        wf80 wf80Var2 = wf80Var;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        Object obj3 = qf6Var.a;
                        synchronized (obj3) {
                            try {
                                try {
                                    int iOrdinal = qf6Var.j.ordinal();
                                    if (iOrdinal == 0 || iOrdinal == 7 || iOrdinal == 2) {
                                        return new fcn.a(new IllegalStateException("openCaptureSession() should not be possible in state: " + qf6Var.j));
                                    }
                                    if (iOrdinal != 3) {
                                        return new fcn.a(new CancellationException("openCaptureSession() not execute in state: " + qf6Var.j));
                                    }
                                    qf6Var.g.clear();
                                    for (int i = 0; i < list.size(); i++) {
                                        qf6Var.g.put(qf6Var.h.get(i), (Surface) list.get(i));
                                    }
                                    qf6Var.q(qf6.a.i);
                                    pgt.a("CaptureSession", "Opening capture session.");
                                    lpe0 lpe0Var = new lpe0(Arrays.asList(qf6Var.c, new lpe0.a(wf80Var2.d)));
                                    ue6 ue6Var = wf80Var2.g;
                                    jz5 jz5Var = new jz5(ue6Var.b);
                                    HashSet hashSet = new HashSet();
                                    ftw.V();
                                    ArrayList arrayList3 = new ArrayList();
                                    buw.a();
                                    hashSet.addAll(ue6Var.a);
                                    ftw ftwVarW = ftw.W(ue6Var.b);
                                    int i2 = ue6Var.c;
                                    arrayList3.addAll(ue6Var.e);
                                    boolean z = ue6Var.f;
                                    c4f0 c4f0Var = ue6Var.g;
                                    ArrayMap arrayMap = new ArrayMap();
                                    for (String str2 : c4f0Var.a.keySet()) {
                                        arrayMap.put(str2, c4f0Var.a.get(str2));
                                        ftwVarW = ftwVarW;
                                    }
                                    ftw ftwVar = ftwVarW;
                                    buw buwVar = new buw(arrayMap);
                                    boolean z2 = ue6Var.d;
                                    HashMap map = new HashMap();
                                    if (qf6Var.s && Build.VERSION.SDK_INT >= 35) {
                                        map = qf6.k(qf6.n(wf80Var2.a), qf6Var.g);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    String str3 = (String) jz5Var.N.b(jz5.T, null);
                                    ArrayList arrayList5 = wf80Var2.a;
                                    int size = arrayList5.size();
                                    int i3 = 0;
                                    while (i3 < size) {
                                        Object obj4 = arrayList5.get(i3);
                                        int i4 = i3 + 1;
                                        wf80.f fVar = (wf80.f) obj4;
                                        int i5 = size;
                                        if (qf6Var.s) {
                                            arrayList2 = arrayList5;
                                            oazVarM = Build.VERSION.SDK_INT >= 35 ? (oaz) map.get(fVar) : null;
                                            if (oazVarM == null) {
                                                oazVarM = qf6Var.m(fVar, qf6Var.g, str3);
                                                str = str3;
                                                if (qf6Var.m.containsKey(fVar.f())) {
                                                    oazVarM.a.a(((Long) qf6Var.m.get(fVar.f())).longValue());
                                                }
                                                arrayList4.add(oazVarM);
                                                size = i5;
                                                i3 = i4;
                                                arrayList5 = arrayList2;
                                                str3 = str;
                                                obj3 = obj3;
                                            } else {
                                                str = str3;
                                            }
                                            arrayList4.add(oazVarM);
                                            size = i5;
                                            i3 = i4;
                                            arrayList5 = arrayList2;
                                            str3 = str;
                                            obj3 = obj3;
                                        } else {
                                            arrayList2 = arrayList5;
                                        }
                                        if (oazVarM == null) {
                                            oazVarM = qf6Var.m(fVar, qf6Var.g, str3);
                                            str = str3;
                                            if (qf6Var.m.containsKey(fVar.f())) {
                                                oazVarM.a.a(((Long) qf6Var.m.get(fVar.f())).longValue());
                                            }
                                            arrayList4.add(oazVarM);
                                            size = i5;
                                            i3 = i4;
                                            arrayList5 = arrayList2;
                                            str3 = str;
                                            obj3 = obj3;
                                        } else {
                                            str = str3;
                                        }
                                        arrayList4.add(oazVarM);
                                        size = i5;
                                        i3 = i4;
                                        arrayList5 = arrayList2;
                                        str3 = str;
                                        obj3 = obj3;
                                    }
                                    obj2 = obj3;
                                    ArrayList arrayList6 = new ArrayList();
                                    ArrayList arrayList7 = new ArrayList();
                                    int size2 = arrayList4.size();
                                    int i6 = 0;
                                    while (i6 < size2) {
                                        Object obj5 = arrayList4.get(i6);
                                        i6++;
                                        oaz oazVar = (oaz) obj5;
                                        if (!arrayList6.contains(oazVar.a.i())) {
                                            arrayList6.add(oazVar.a.i());
                                            arrayList7.add(oazVar);
                                        }
                                    }
                                    kpe0 kpe0Var2 = qf6Var.d;
                                    int i7 = wf80Var2.h;
                                    kpe0Var2.f = lpe0Var;
                                    ag80 ag80Var = new ag80(i7, arrayList7, kpe0Var2.d, new gpe0(kpe0Var2));
                                    if (wf80Var2.g.c == 5 && (inputConfiguration = wf80Var2.i) != null) {
                                        ag80Var.a.l(sln.a(inputConfiguration));
                                    }
                                    try {
                                        ArrayList arrayList8 = new ArrayList(hashSet);
                                        w2z w2zVarU = w2z.U(ftwVar);
                                        ArrayList arrayList9 = new ArrayList(arrayList3);
                                        c4f0 c4f0Var2 = c4f0.b;
                                        ArrayMap arrayMap2 = new ArrayMap();
                                        for (String str4 : buwVar.a.keySet()) {
                                            arrayMap2.put(str4, buwVar.a.get(str4));
                                        }
                                        CaptureRequest captureRequestE = cz5.e(new ue6(arrayList8, w2zVarU, i2, z2, arrayList9, z, new c4f0(arrayMap2), null), cameraDevice2, qf6Var.r);
                                        if (captureRequestE != null) {
                                            dz5 dz5Var = qf6Var.t;
                                            if (dz5Var != null) {
                                                dz5Var.a();
                                            }
                                            ag80Var.a.o(captureRequestE);
                                        }
                                        qis<Void> qisVarX = qf6Var.d.x(cameraDevice2, ag80Var, qf6Var.h);
                                        return qisVarX;
                                    } catch (CameraAccessException e) {
                                        return new fcn.a(e);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj3;
                                throw th;
                            }
                        }
                    }
                }, this.d.d);
                pw6VarG.k(new obj.b(pw6VarG, new of6(this)), this.d.d);
                return obj.d(pw6VarG);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int i(ArrayList arrayList, sz5 sz5Var) {
        sz5 sz5Var2 = new sz5();
        int size = arrayList.size();
        int iC = -1;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CaptureRequest captureRequest = (CaptureRequest) obj;
            ape0 ape0Var = this.e;
            Objects.requireNonNull(ape0Var);
            List<CaptureRequest> listG = ape0Var.g(captureRequest);
            Iterator<CaptureRequest> it = listG.iterator();
            while (it.hasNext()) {
                sz5Var2.a(it.next(), Collections.singletonList(new sa50(captureRequest, sz5Var)));
            }
            iC = this.e.c(listG, sz5Var2);
        }
        return iC;
    }

    public final void l() {
        a aVar = this.j;
        a aVar2 = a.b;
        if (aVar == aVar2) {
            pgt.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        q(aVar2);
        this.e = null;
        nv5.a<Void> aVar3 = this.l;
        if (aVar3 != null) {
            aVar3.b(null);
            this.l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    public final oaz m(wf80.f fVar, HashMap map, String str) {
        long jLongValue;
        Surface surface = (Surface) map.get(fVar.f());
        km20.f(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        oaz oazVar = new oaz(fVar.g(), surface);
        paz pazVar = oazVar.a;
        if (str != null) {
            pazVar.d(str);
        } else {
            pazVar.d(fVar.d());
        }
        if (fVar.c() == 0) {
            pazVar.g(1);
        } else if (fVar.c() == 1) {
            pazVar.g(2);
        }
        if (!fVar.e().isEmpty()) {
            pazVar.f();
            Iterator<ijd> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get(it.next());
                km20.f(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                pazVar.b(surface2);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ihf ihfVar = this.q;
            ihfVar.getClass();
            km20.g("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i >= 33);
            DynamicRangeProfiles dynamicRangeProfilesB = ihfVar.a.b();
            if (dynamicRangeProfilesB == null) {
                jLongValue = 1;
            } else {
                dhf dhfVarB = fVar.b();
                Long lA = ehf.a(dhfVarB, dynamicRangeProfilesB);
                if (lA == null) {
                    pgt.c("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dhfVarB);
                    jLongValue = 1;
                } else {
                    jLongValue = lA.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        pazVar.c(jLongValue);
        return oazVar;
    }

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
    public final void o(ArrayList arrayList) {
        e06 e06Var;
        synchronized (this.a) {
            try {
                if (this.j != a.v) {
                    pgt.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    sz5 sz5Var = new sz5();
                    ArrayList arrayList2 = new ArrayList();
                    pgt.a("CaptureSession", "Issuing capture request.");
                    int size = arrayList.size();
                    int i = 0;
                    boolean z = false;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ue6 ue6Var = (ue6) obj;
                        if (!Collections.unmodifiableList(ue6Var.a).isEmpty()) {
                            Iterator it = Collections.unmodifiableList(ue6Var.a).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (ue6Var.c == 2) {
                                        z = true;
                                    }
                                    ue6.a aVar = new ue6.a(ue6Var);
                                    if (ue6Var.c == 5 && (e06Var = ue6Var.h) != null) {
                                        aVar.h = e06Var;
                                    }
                                    wf80 wf80Var = this.f;
                                    if (wf80Var != null) {
                                        aVar.c(wf80Var.g.b);
                                    }
                                    aVar.c(ue6Var.b);
                                    CaptureRequest captureRequestD = cz5.d(aVar.e(), this.e.e(), this.g, false, this.r);
                                    if (captureRequestD != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<tz5> it2 = ue6Var.e.iterator();
                                        while (it2.hasNext()) {
                                            te6.a(it2.next(), arrayList3);
                                        }
                                        sz5Var.a(captureRequestD, arrayList3);
                                        arrayList2.add(captureRequestD);
                                        break;
                                    }
                                    pgt.a("CaptureSession", "Skipping issuing request without surface.");
                                    return;
                                }
                                ijd ijdVar = (ijd) it.next();
                                if (!this.g.containsKey(ijdVar)) {
                                    pgt.a("CaptureSession", "Skipping capture request with invalid surface: " + ijdVar);
                                    break;
                                }
                            }
                        } else {
                            pgt.a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        pgt.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return;
                    }
                    if (this.n.a(arrayList2, z)) {
                        this.e.a();
                        sz5Var.b = new nf6(this);
                    }
                    if (this.o.b(arrayList2, z)) {
                        sz5Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new pf6(this)));
                    }
                    if (this.t != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            this.t.a();
                        }
                    }
                    wf80 wf80Var2 = this.f;
                    if (wf80Var2 == null || wf80Var2.h != 1) {
                        this.e.c(arrayList2, sz5Var);
                    } else {
                        i(arrayList2, sz5Var);
                    }
                } catch (CameraAccessException e) {
                    pgt.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(wf80 wf80Var) {
        synchronized (this.a) {
            try {
                if (wf80Var == null) {
                    pgt.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return;
                }
                if (this.j != a.v) {
                    pgt.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                    return;
                }
                ue6 ue6Var = wf80Var.g;
                if (Collections.unmodifiableList(ue6Var.a).isEmpty()) {
                    pgt.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.e.a();
                    } catch (CameraAccessException e) {
                        pgt.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    pgt.a("CaptureSession", "Issuing request for session.");
                    CaptureRequest captureRequestD = cz5.d(ue6Var, this.e.e(), this.g, true, this.r);
                    if (captureRequestD == null) {
                        pgt.a("CaptureSession", "Skipping issuing empty request for session.");
                        return;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackA = this.p.a(j(ue6Var.e, new CameraCaptureSession.CaptureCallback[0]));
                    dz5 dz5Var = this.t;
                    if (dz5Var != null) {
                        dz5Var.a();
                    }
                    int i = wf80Var.h;
                    ape0 ape0Var = this.e;
                    if (i != 1) {
                        ape0Var.f(captureRequestD, captureCallbackA);
                        return;
                    } else {
                        this.e.h(ape0Var.g(captureRequestD), captureCallbackA);
                        return;
                    }
                } catch (CameraAccessException e2) {
                    pgt.c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                    return;
                }
                throw th;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(a aVar) {
        if (aVar.ordinal() > this.i.ordinal()) {
            this.i = aVar;
        }
        this.j = aVar;
        if (!sig0.b() || this.i.ordinal() < 3) {
            return;
        }
        sig0.c(aVar.ordinal(), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:23:0x0076, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:21:0x0059, B:22:0x0071, B:26:0x007a, B:27:0x008d), top: B:30:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:23:0x0076, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:21:0x0059, B:22:0x0071, B:26:0x007a, B:27:0x008d), top: B:30:0x0009 }] */
    @Override // defpackage.rf6
    public final qis release() {
        nv5.d dVarA;
        synchronized (this.a) {
            try {
                int iOrdinal = this.j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("release() should not be possible in state: " + this.j);
                }
                switch (iOrdinal) {
                    case 2:
                        q(a.b);
                        return fcn.c.b;
                    case 3:
                        km20.f(this.d, "The Opener shouldn't null in state:" + this.j);
                        this.d.y();
                        q(a.b);
                        return fcn.c.b;
                    case 4:
                        dVarA = this.k;
                        if (dVarA == null) {
                            dVarA = nv5.a(new nv5.c() { // from class: kf6
                                @Override // nv5.c
                                public final Object a(nv5.a aVar) {
                                    String str;
                                    qf6 qf6Var = this.a;
                                    synchronized (qf6Var.a) {
                                        km20.g("Release completer expected to be null", qf6Var.l == null);
                                        qf6Var.l = aVar;
                                        str = "Release[session=" + qf6Var + "]";
                                    }
                                    return str;
                                }
                            });
                            this.k = dVarA;
                        }
                        return dVarA;
                    case 5:
                    case 7:
                        ape0 ape0Var = this.e;
                        if (ape0Var != null) {
                            ape0Var.close();
                        }
                        q(a.e);
                        this.p.c();
                        km20.f(this.d, "The Opener shouldn't null in state:" + this.j);
                        if (this.d.y()) {
                            l();
                            return fcn.c.b;
                        }
                        dVarA = this.k;
                        if (dVarA == null) {
                            dVarA = nv5.a(new nv5.c() { // from class: kf6
                                @Override // nv5.c
                                public final Object a(nv5.a aVar) {
                                    String str;
                                    qf6 qf6Var = this.a;
                                    synchronized (qf6Var.a) {
                                        km20.g("Release completer expected to be null", qf6Var.l == null);
                                        qf6Var.l = aVar;
                                        str = "Release[session=" + qf6Var + "]";
                                    }
                                    return str;
                                }
                            });
                            this.k = dVarA;
                        }
                        return dVarA;
                    case 6:
                        q(a.e);
                        this.p.c();
                        km20.f(this.d, "The Opener shouldn't null in state:" + this.j);
                        if (this.d.y()) {
                            l();
                            return fcn.c.b;
                        }
                        dVarA = this.k;
                        if (dVarA == null) {
                            dVarA = nv5.a(new nv5.c() { // from class: kf6
                                @Override // nv5.c
                                public final Object a(nv5.a aVar) {
                                    String str;
                                    qf6 qf6Var = this.a;
                                    synchronized (qf6Var.a) {
                                        km20.g("Release completer expected to be null", qf6Var.l == null);
                                        qf6Var.l = aVar;
                                        str = "Release[session=" + qf6Var + "]";
                                    }
                                    return str;
                                }
                            });
                            this.k = dVarA;
                        }
                        return dVarA;
                    default:
                        return fcn.c.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rf6
    public final void a(List<ue6> list) {
        synchronized (this.a) {
            try {
                switch (this.j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.j);
                    case 1:
                    case 4:
                    case 5:
                        throw new IllegalStateException(jbkEboCkTqmGf.EDKHupprTyVz);
                    case 2:
                    case 3:
                    case 6:
                        this.b.addAll(list);
                        break;
                    case 7:
                        this.b.addAll(list);
                        this.p.b().k(new mf6(this), nqe.a());
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
