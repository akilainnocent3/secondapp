package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.c;
import androidx.camera.core.d;
import androidx.camera.core.e;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ow5 implements m16 {
    public final a A;
    public final b b;
    public final od80 c;
    public final Object d = new Object();
    public final e16 e;
    public final qx5.d f;
    public final wf80.b g;
    public final p4i h;
    public final nck0 i;
    public final u3g0 j;
    public final lpt k;
    public final s1h l;
    public final zck0 m;
    public final aw5 n;
    public final fy5 o;
    public final y5i0 p;
    public int q;
    public h8n.i r;
    public volatile int s;
    public volatile int t;
    public volatile int u;
    public final xd1 v;
    public final AtomicLong w;
    public volatile qis<Void> x;
    public int y;
    public long z;

    public static final class a extends tz5 {
        public final HashSet a = new HashSet();
        public final ArrayMap b = new ArrayMap();

        @Override // defpackage.tz5
        public final void a(final int i) {
            for (final tz5 tz5Var : this.a) {
                try {
                    ((Executor) this.b.get(tz5Var)).execute(new Runnable() { // from class: nw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            tz5Var.a(i);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    pgt.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // defpackage.tz5
        public final void b(final int i, final e06 e06Var) {
            for (final tz5 tz5Var : this.a) {
                try {
                    ((Executor) this.b.get(tz5Var)).execute(new Runnable() { // from class: mw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            tz5Var.b(i, e06Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    pgt.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // defpackage.tz5
        public final void c(final int i, final vz5 vz5Var) {
            for (final tz5 tz5Var : this.a) {
                try {
                    ((Executor) this.b.get(tz5Var)).execute(new Runnable() { // from class: lw5
                        @Override // java.lang.Runnable
                        public final void run() {
                            tz5Var.c(i, vz5Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    pgt.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final HashSet a = new HashSet();
        public final od80 b;

        public b(od80 od80Var) {
            this.b = od80Var;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: pw5
                @Override // java.lang.Runnable
                public final void run() {
                    HashSet hashSet = new HashSet();
                    HashSet<ow5.c> hashSet2 = this.a.a;
                    for (ow5.c cVar : hashSet2) {
                        if (cVar.a(totalCaptureResult)) {
                            hashSet.add(cVar);
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    hashSet2.removeAll(hashSet);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public ow5(e16 e16Var, adl adlVar, od80 od80Var, qx5.d dVar, yj30 yj30Var) {
        wf80.b bVar = new wf80.b();
        this.g = bVar;
        this.q = 0;
        this.s = 0;
        this.u = 2;
        this.w = new AtomicLong(0L);
        this.x = fcn.c.b;
        this.y = 1;
        this.z = 0L;
        a aVar = new a();
        this.A = aVar;
        this.e = e16Var;
        this.f = dVar;
        this.c = od80Var;
        this.p = new y5i0(od80Var);
        b bVar2 = new b(od80Var);
        this.b = bVar2;
        bVar.b.c = this.y;
        bVar.b.b(new se6(bVar2));
        bVar.b.b(aVar);
        this.l = new s1h(this, od80Var);
        this.h = new p4i(this, od80Var);
        this.i = new nck0(this, e16Var, od80Var);
        this.j = new u3g0(this, e16Var, od80Var);
        this.t = e16Var.b();
        this.k = new lpt(this, e16Var, od80Var);
        this.m = new zck0(e16Var, od80Var);
        this.v = new xd1(yj30Var);
        this.n = new aw5(this, od80Var);
        this.o = new fy5(this, e16Var, yj30Var, od80Var, adlVar);
    }

    public static int n(e16 e16Var, int i) {
        int[] iArr = (int[]) e16Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (p(iArr, i)) {
            return i;
        }
        return p(iArr, 1) ? 1 : 0;
    }

    public static boolean p(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof c4f0) && (l = (Long) ((c4f0) tag).a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    @Override // defpackage.m16
    public final void a(hoa hoaVar) {
        final aw5 aw5Var = this.n;
        hf6 hf6VarB = hf6.a.c(hoaVar).b();
        synchronized (aw5Var.e) {
            jz5.a aVar = aw5Var.f;
            hoa.b bVar = hoa.b.d;
            for (hoa.a<?> aVar2 : hf6VarB.c()) {
                aVar.a.X(aVar2, bVar, hf6VarB.d(aVar2));
            }
        }
        final nv5.a aVar3 = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar3);
        aVar3.b = dVar;
        aVar3.a = ew5.class;
        try {
            aw5Var.d.execute(new Runnable() { // from class: yv5
                @Override // java.lang.Runnable
                public final void run() {
                    aw5 aw5Var2 = aw5Var;
                    aw5Var2.b = true;
                    k16 k16Var = new k16("Camera2CameraControl was updated with new options.");
                    nv5.a<Void> aVar4 = aw5Var2.g;
                    if (aVar4 != null) {
                        aVar4.d(k16Var);
                        aw5Var2.g = null;
                    }
                    aw5Var2.g = aVar3;
                    if (aw5Var2.a) {
                        ow5 ow5Var = aw5Var2.c;
                        nv5.a aVar5 = new nv5.a();
                        nv5.d<T> dVar2 = new nv5.d<>(aVar5);
                        aVar5.b = dVar2;
                        aVar5.a = ew5.class;
                        try {
                            ow5Var.c.execute(new cw5(ow5Var, aVar5));
                            aVar5.a = "updateSessionConfigAsync";
                        } catch (Exception e) {
                            dVar2.a(e);
                        }
                        obj.d(dVar2).k(new xv5(aw5Var2), aw5Var2.d);
                        aw5Var2.b = false;
                    }
                }
            });
            aVar3.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            dVar.a(e);
        }
        obj.d(dVar).k(new iw5(), nqe.a());
    }

    @Override // defpackage.m16
    public final void b(int i) {
        if (!o()) {
            pgt.i("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.u = i;
        pgt.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.u);
        zck0 zck0Var = this.m;
        boolean z = true;
        if (this.u != 1 && this.u != 0) {
            z = false;
        }
        zck0Var.e = z;
        nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            this.c.execute(new cw5(this, aVar));
            aVar.a = "updateSessionConfigAsync";
        } catch (Exception e) {
            dVar.a(e);
        }
        this.x = obj.d(dVar);
    }

    @Override // defpackage.m16
    public final void c(h8n.i iVar) {
        this.r = iVar;
    }

    @Override // defpackage.m16
    public final hoa d() {
        jz5 jz5Var;
        aw5 aw5Var = this.n;
        synchronized (aw5Var.e) {
            jz5Var = new jz5(w2z.U(aw5Var.f.a));
        }
        return jz5Var;
    }

    @Override // defpackage.m16
    public final void e(wf80.b bVar) {
        StreamConfigurationMap streamConfigurationMap;
        int i;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        ue6.a aVar = bVar.b;
        final zck0 zck0Var = this.m;
        od80 od80Var = zck0Var.b;
        e16 e16Var = zck0Var.a;
        zck0Var.a();
        if (zck0Var.d) {
            aVar.c = 1;
            return;
        }
        if (zck0Var.g) {
            aVar.c = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) e16Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            pgt.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            i = 0;
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i2 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i2);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new ql8(true));
                    map.put(Integer.valueOf(i2), inputSizes[0]);
                }
            }
            i = 0;
        }
        if (zck0Var.f && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) e16Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i3 = i; i3 < length; i3++) {
                if (validOutputFormatsForInput[i3] == 256) {
                    Size size = (Size) map.get(34);
                    d dVar = new d(size.getWidth(), size.getHeight(), 34, 9);
                    final e eVar = new e(dVar);
                    Surface surface = eVar.getSurface();
                    Objects.requireNonNull(surface);
                    gcn gcnVar = new gcn(surface, new Size(eVar.c(), eVar.b()), 34);
                    final zck0.a aVar2 = new zck0.a(od80Var);
                    zck0Var.h = eVar;
                    zck0Var.i = gcnVar;
                    zck0Var.j = aVar2;
                    eVar.h(new jan.a() { // from class: uck0
                        @Override // jan.a
                        public final void a(jan janVar) throws Exception {
                            zck0 zck0Var2 = zck0Var;
                            zck0Var2.getClass();
                            try {
                                c cVarA = janVar.a();
                                if (cVarA != null) {
                                    zck0Var2.c.b(cVarA);
                                }
                            } catch (IllegalStateException e2) {
                                pgt.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e2.getMessage());
                            }
                        }
                    }, w0p.a());
                    obj.d(gcnVar.e).k(new Runnable() { // from class: vck0
                        @Override // java.lang.Runnable
                        public final void run() {
                            eVar.g();
                            zck0.a aVar3 = aVar2;
                            aVar3.b.set(false);
                            ImageWriter imageWriter = aVar3.a;
                            if (imageWriter != null) {
                                imageWriter.close();
                            }
                        }
                    }, od80Var);
                    bVar.b(gcnVar, dhf.d, -1);
                    d.a aVar3 = dVar.b;
                    aVar.b(aVar3);
                    ArrayList arrayList = bVar.e;
                    if (!arrayList.contains(aVar3)) {
                        arrayList.add(aVar3);
                    }
                    xck0 xck0Var = new xck0(aVar2);
                    ArrayList arrayList2 = bVar.d;
                    if (!arrayList2.contains(xck0Var)) {
                        arrayList2.add(xck0Var);
                    }
                    bVar.g = new InputConfiguration(eVar.c(), eVar.b(), eVar.d());
                    return;
                }
            }
        }
        aVar.c = 1;
    }

    @Override // defpackage.m16
    public final void f() {
        this.m.a();
    }

    @Override // defpackage.m16
    public final qis g(final ArrayList arrayList, final int i, final int i2) {
        if (o()) {
            final int i3 = this.u;
            return obj.g(dbj.a(obj.d(this.x)), new wz0() { // from class: dw5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    fy5 fy5Var = this.a.o;
                    int i4 = i;
                    final int i5 = i3;
                    final fy5.d dVarA = fy5Var.a(i4, i5, i2);
                    dbj dbjVarA = dbj.a(dVarA.a(i5));
                    final ArrayList arrayList2 = arrayList;
                    wz0 wz0Var = new wz0() { // from class: hy5
                        /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
                        /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
                        /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
                        /* JADX WARN: Code duplicated, block: B:49:0x00e4 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
                        /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
                        /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
                        @Override // defpackage.wz0
                        public final qis apply(Object obj2) throws Exception {
                            e06 e06Var;
                            int i6;
                            efz efzVar;
                            nv5.d<T> dVar;
                            c cVar;
                            ImageWriter imageWriter;
                            String str = qUnCRF.MOlVmlXZtlXIYe;
                            fy5.d dVar2 = dVarA;
                            ow5 ow5Var = dVar2.d;
                            zck0 zck0Var = ow5Var.m;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = arrayList2;
                            int size = arrayList5.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = i7 + 1;
                                ue6 ue6Var = (ue6) arrayList5.get(i7);
                                ue6.a aVar = new ue6.a(ue6Var);
                                int i9 = ue6Var.c;
                                try {
                                    if (i9 == 5 && !zck0Var.e && !zck0Var.d) {
                                        try {
                                            cVar = (c) zck0Var.c.a();
                                        } catch (NoSuchElementException unused) {
                                            pgt.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            zck0.a aVar2 = zck0Var.j;
                                            if (aVar2 != null) {
                                                zck0Var = zck0Var;
                                                Image imageT = cVar.t();
                                                arrayList5 = arrayList5;
                                                if (aVar2.b.get() && (imageWriter = aVar2.a) != null && imageT != null) {
                                                    try {
                                                        imageWriter.queueInputImage(imageT);
                                                        ImageWriter imageWriter2 = aVar2.a;
                                                        final yck0 yck0Var = new yck0(cVar);
                                                        final od80 od80Var = aVar2.c;
                                                        size = size;
                                                        try {
                                                            imageWriter2.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: xbn
                                                                @Override // android.media.ImageWriter.OnImageReleasedListener
                                                                public final void onImageReleased(final ImageWriter imageWriter3) {
                                                                    final yck0 yck0Var2 = yck0Var;
                                                                    od80Var.execute(new Runnable() { // from class: ybn
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() throws Exception {
                                                                            yck0Var2.onImageReleased(imageWriter3);
                                                                        }
                                                                    });
                                                                }
                                                            }, lku.a());
                                                            c9n c9nVarM1 = cVar.m1();
                                                            e06Var = c9nVarM1 instanceof f06 ? ((f06) c9nVarM1).a : null;
                                                        } catch (IllegalStateException e) {
                                                            e = e;
                                                            pgt.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                                                            pgt.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                                                        }
                                                    } catch (IllegalStateException e2) {
                                                        e = e2;
                                                        size = size;
                                                    }
                                                    if (e06Var == null) {
                                                        cVar.close();
                                                    }
                                                }
                                                pgt.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                                                if (e06Var == null) {
                                                    cVar.close();
                                                }
                                            } else {
                                                zck0Var = zck0Var;
                                                arrayList5 = arrayList5;
                                            }
                                            size = size;
                                            pgt.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                                            if (e06Var == null) {
                                                cVar.close();
                                            }
                                        } else {
                                            pgt.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                                        }
                                        if (e06Var != null) {
                                            aVar.h = e06Var;
                                        } else {
                                            if (dVar2.a != 3 && !dVar2.f) {
                                                i6 = 4;
                                            } else if (i9 != -1 || i9 == 5) {
                                                i6 = 2;
                                            } else {
                                                i6 = -1;
                                            }
                                            if (i6 != -1) {
                                                aVar.c = i6;
                                            }
                                            pgt.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i6);
                                        }
                                        efzVar = dVar2.e;
                                        if (efzVar.b && i5 == 0 && efzVar.a) {
                                            ftw ftwVarV = ftw.V();
                                            ftwVarV.Y(jz5.U(CaptureRequest.CONTROL_AE_MODE), 3);
                                            aVar.c(new jz5(w2z.U(ftwVarV)));
                                        }
                                        nv5.a aVar3 = new nv5.a();
                                        dVar = new nv5.d<>(aVar3);
                                        aVar3.b = dVar;
                                        aVar3.a = ew5.class;
                                        aVar.b(new ny5(aVar3));
                                        aVar3.a = str;
                                        arrayList3.add(dVar);
                                        arrayList4.add(aVar.e());
                                        i7 = i8;
                                        zck0Var = zck0Var;
                                        arrayList5 = arrayList5;
                                        size = size;
                                    }
                                    aVar.b(new ny5(aVar3));
                                    aVar3.a = str;
                                } catch (Exception e3) {
                                    dVar.a(e3);
                                }
                                e06Var = null;
                                if (e06Var != null) {
                                    aVar.h = e06Var;
                                } else {
                                    if (dVar2.a != 3) {
                                        if (i9 != -1) {
                                            i6 = 2;
                                        } else {
                                            i6 = 2;
                                        }
                                    } else if (i9 != -1) {
                                        i6 = 2;
                                    } else {
                                        i6 = 2;
                                    }
                                    if (i6 != -1) {
                                        aVar.c = i6;
                                    }
                                    pgt.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i6);
                                }
                                efzVar = dVar2.e;
                                if (efzVar.b) {
                                    ftw ftwVarV2 = ftw.V();
                                    ftwVarV2.Y(jz5.U(CaptureRequest.CONTROL_AE_MODE), 3);
                                    aVar.c(new jz5(w2z.U(ftwVarV2)));
                                }
                                nv5.a aVar4 = new nv5.a();
                                dVar = new nv5.d<>(aVar4);
                                aVar4.b = dVar;
                                aVar4.a = ew5.class;
                                arrayList3.add(dVar);
                                arrayList4.add(aVar.e());
                                i7 = i8;
                                zck0Var = zck0Var;
                                arrayList5 = arrayList5;
                                size = size;
                            }
                            ow5Var.t(arrayList4);
                            return new vhs(new ArrayList(arrayList3), true, nqe.a());
                        }
                    };
                    od80 od80Var = dVarA.b;
                    pw6 pw6VarG = obj.g(dbjVarA, wz0Var, od80Var);
                    pw6VarG.k(new Runnable() { // from class: iy5
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVarA.i.c();
                        }
                    }, od80Var);
                    return obj.d(pw6VarG);
                }
            }, this.c);
        }
        pgt.i("Camera2CameraControlImp", "Camera is not active.");
        return new fcn.a(new k16("Camera is not active."));
    }

    @Override // defpackage.m16
    public final void h() {
        final aw5 aw5Var = this.n;
        synchronized (aw5Var.e) {
            aw5Var.f = new jz5.a();
        }
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            aw5Var.d.execute(new Runnable() { // from class: wv5
                @Override // java.lang.Runnable
                public final void run() {
                    aw5 aw5Var2 = aw5Var;
                    aw5Var2.b = true;
                    k16 k16Var = new k16("Camera2CameraControl was updated with new options.");
                    nv5.a<Void> aVar2 = aw5Var2.g;
                    if (aVar2 != null) {
                        aVar2.d(k16Var);
                        aw5Var2.g = null;
                    }
                    aw5Var2.g = aVar;
                    if (aw5Var2.a) {
                        ow5 ow5Var = aw5Var2.c;
                        nv5.a aVar3 = new nv5.a();
                        nv5.d<T> dVar2 = new nv5.d<>(aVar3);
                        aVar3.b = dVar2;
                        aVar3.a = ew5.class;
                        try {
                            ow5Var.c.execute(new cw5(ow5Var, aVar3));
                            aVar3.a = "updateSessionConfigAsync";
                        } catch (Exception e) {
                            dVar2.a(e);
                        }
                        obj.d(dVar2).k(new xv5(aw5Var2), aw5Var2.d);
                        aw5Var2.b = false;
                    }
                }
            });
            aVar.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            dVar.a(e);
        }
        obj.d(dVar).k(new iw5(), nqe.a());
    }

    @Override // defpackage.m16
    public final qis i(final int i) {
        if (o()) {
            final int i2 = this.u;
            return obj.g(dbj.a(obj.d(this.x)), new wz0() { // from class: gw5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    fy5 fy5Var = this.a.o;
                    int i3 = i;
                    int i4 = i2;
                    return obj.c(new fy5.c(fy5Var.a(i3, i4, 1), fy5Var.e, i4));
                }
            }, this.c);
        }
        pgt.i("Camera2CameraControlImp", "Camera is not active.");
        return new fcn.a(new k16("Camera is not active."));
    }

    public final void j(c cVar) {
        this.b.a.add(cVar);
    }

    public final void k() {
        synchronized (this.d) {
            try {
                int i = this.q;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.q = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(int i) {
        this.s = i;
        if (i == 0) {
            ue6.a aVar = new ue6.a();
            aVar.c = this.y;
            aVar.f = true;
            ftw ftwVarV = ftw.V();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            ftwVarV.Y(jz5.U(key), Integer.valueOf(n(this.e, 1)));
            ftwVarV.Y(jz5.U(CaptureRequest.FLASH_MODE), 0);
            aVar.c(new jz5(w2z.U(ftwVarV)));
            t(Collections.singletonList(aVar.e()));
        }
        u();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137 A[Catch: all -> 0x0175, LOOP:0: B:67:0x0131->B:69:0x0137, LOOP_END, TryCatch #0 {, blocks: (B:66:0x0123, B:67:0x0131, B:69:0x0137, B:70:0x0147), top: B:79:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    public final wf80 m() {
        int[] iArr;
        s1h s1hVar;
        aw5 aw5Var;
        ftw ftwVar;
        hoa.b bVar;
        wf80.b bVar2 = this.g;
        bVar2.b.c = this.y;
        jz5.a aVar = new jz5.a();
        int i = 1;
        aVar.b(CaptureRequest.CONTROL_MODE, 1);
        p4i p4iVar = this.h;
        p4iVar.getClass();
        int i2 = 4;
        int i3 = 3;
        int i4 = p4iVar.d != 3 ? 4 : 3;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        int[] iArr2 = (int[]) p4iVar.a.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 == null) {
            i2 = 0;
        } else if (p(iArr2, i4)) {
            i2 = i4;
        } else if (!p(iArr2, 4)) {
            if (p(iArr2, 1)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        aVar.b(key, Integer.valueOf(i2));
        MeteringRectangle[] meteringRectangleArr = p4iVar.e;
        if (meteringRectangleArr.length != 0) {
            aVar.b(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = p4iVar.f;
        if (meteringRectangleArr2.length != 0) {
            aVar.b(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = p4iVar.g;
        if (meteringRectangleArr3.length != 0) {
            aVar.b(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        this.i.d.c(aVar);
        int i5 = this.h.h ? 5 : 1;
        if (this.s == 0) {
            int i6 = this.u;
            if (i6 == 0) {
                xd1 xd1Var = this.v;
                if (xd1Var.a || xd1Var.b) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
            } else if (i6 != 1) {
                if (i6 == 2) {
                    i3 = 1;
                }
            }
            aVar.b(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(n(this.e, i3)));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!p(iArr, 1) && !p(iArr, 1))) {
                i = 0;
            }
            aVar.b(key2, Integer.valueOf(i));
            s1hVar = this.l;
            s1hVar.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (s1hVar.a.a) {
            }
            aVar.b(key3, 0);
            aw5Var = this.n;
            synchronized (aw5Var.e) {
                ftwVar = aw5Var.f.a;
                bVar = hoa.b.a;
                for (hoa.a<?> aVar2 : ftwVar.c()) {
                    aVar.a.X(aVar2, bVar, ftwVar.d(aVar2));
                }
            }
            bVar2.b.b = ftw.W(new jz5(w2z.U(aVar.a)));
            this.g.b.g.a.put("CameraControlSessionUpdateId", Long.valueOf(this.z));
            return this.g.c();
        }
        aVar.b(CaptureRequest.FLASH_MODE, 2);
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.s == 1) {
                aVar.b(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.t));
            } else if (this.s == 2) {
                aVar.b(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.e.b()));
            }
        }
        i3 = i5;
        aVar.b(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(n(this.e, i3)));
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i = 0;
        } else {
            i = 0;
        }
        aVar.b(key4, Integer.valueOf(i));
        s1hVar = this.l;
        s1hVar.getClass();
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (s1hVar.a.a) {
            aVar.b(key5, 0);
            aw5Var = this.n;
            synchronized (aw5Var.e) {
                ftwVar = aw5Var.f.a;
                bVar = hoa.b.a;
                while (r5.hasNext()) {
                    aVar.a.X(aVar2, bVar, ftwVar.d(aVar2));
                }
                bVar2.b.b = ftw.W(new jz5(w2z.U(aVar.a)));
                this.g.b.g.a.put("CameraControlSessionUpdateId", Long.valueOf(this.z));
                return this.g.c();
            }
        }
    }

    public final boolean o() {
        int i;
        synchronized (this.d) {
            i = this.q;
        }
        return i > 0;
    }

    public final void r(final boolean z) {
        xi1 xi1Var;
        pgt.a("Camera2CameraControlImp", "setActive: isActive = " + z);
        p4i p4iVar = this.h;
        if (z != p4iVar.c) {
            p4iVar.c = z;
            if (!p4iVar.c) {
                ow5 ow5Var = p4iVar.a;
                ow5Var.b.a.remove(null);
                ow5Var.b.a.remove(null);
                if (p4iVar.e.length > 0) {
                    p4iVar.a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = p4i.j;
                p4iVar.e = meteringRectangleArr;
                p4iVar.f = meteringRectangleArr;
                p4iVar.g = meteringRectangleArr;
                ow5Var.u();
            }
        }
        nck0 nck0Var = this.i;
        if (nck0Var.e != z) {
            nck0Var.e = z;
            if (!z) {
                synchronized (nck0Var.b) {
                    nck0Var.b.e();
                    tck0 tck0Var = nck0Var.b;
                    xi1Var = new xi1(tck0Var.d(), tck0Var.b(), tck0Var.c(), tck0Var.a());
                }
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                ssw<Object> sswVar = nck0Var.c;
                if (looperMyLooper == mainLooper) {
                    sswVar.m(xi1Var);
                } else {
                    sswVar.j(xi1Var);
                }
                nck0Var.d.d();
                nck0Var.a.u();
            }
        }
        lpt lptVar = this.k;
        if (lptVar.b != z) {
            lptVar.b = z;
        }
        u3g0 u3g0Var = this.j;
        int i = u3g0Var.f;
        if (u3g0Var.e != z) {
            u3g0Var.e = z;
            if (!z) {
                if (u3g0Var.h) {
                    u3g0Var.h = false;
                    u3g0Var.a.l(0);
                    u3g0Var.b(0);
                    ssw<Integer> sswVar2 = u3g0Var.c;
                    Integer numValueOf = Integer.valueOf(i);
                    if (kpf0.b()) {
                        sswVar2.m(numValueOf);
                    } else {
                        sswVar2.j(numValueOf);
                    }
                }
                nv5.a<Void> aVar = u3g0Var.g;
                if (aVar != null) {
                    aVar.d(new k16("Camera is not active."));
                    u3g0Var.g = null;
                }
            }
        }
        s1h s1hVar = this.l;
        if (z != s1hVar.b) {
            s1hVar.b = z;
            if (!z) {
                synchronized (s1hVar.a.a) {
                }
            }
        }
        final aw5 aw5Var = this.n;
        aw5Var.d.execute(new Runnable() { // from class: zv5
            @Override // java.lang.Runnable
            public final void run() {
                aw5 aw5Var2 = aw5Var;
                boolean z2 = aw5Var2.a;
                boolean z3 = z;
                if (z2 == z3) {
                    return;
                }
                aw5Var2.a = z3;
                if (!z3) {
                    k16 k16Var = new k16("The camera control has became inactive.");
                    nv5.a<Void> aVar2 = aw5Var2.g;
                    if (aVar2 != null) {
                        aVar2.d(k16Var);
                        aw5Var2.g = null;
                        return;
                    }
                    return;
                }
                if (aw5Var2.b) {
                    ow5 ow5Var2 = aw5Var2.c;
                    nv5.a aVar3 = new nv5.a();
                    nv5.d<T> dVar = new nv5.d<>(aVar3);
                    aVar3.b = dVar;
                    aVar3.a = ew5.class;
                    try {
                        ow5Var2.c.execute(new cw5(ow5Var2, aVar3));
                        aVar3.a = "updateSessionConfigAsync";
                    } catch (Exception e) {
                        dVar.a(e);
                    }
                    obj.d(dVar).k(new xv5(aw5Var2), aw5Var2.d);
                    aw5Var2.b = false;
                }
            }
        });
        if (z) {
            return;
        }
        this.r = null;
        this.p.a.set(0);
        pgt.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final void s(boolean z) {
        synchronized (this.k.a) {
            try {
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long u() {
        this.z = this.w.getAndIncrement();
        qx5.this.L();
        return this.z;
    }

    public final void t(List<ue6> list) {
        int iD;
        int iC;
        e06 e06Var;
        qx5 qx5Var = qx5.this;
        ArrayList arrayListA = kw5.a(list);
        for (ue6 ue6Var : list) {
            HashSet hashSet = new HashSet();
            ftw.V();
            ArrayList arrayList = new ArrayList();
            buw.a();
            hashSet.addAll(ue6Var.a);
            ftw ftwVarW = ftw.W(ue6Var.b);
            int i = ue6Var.c;
            arrayList.addAll(ue6Var.e);
            boolean z = ue6Var.f;
            c4f0 c4f0Var = ue6Var.g;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = c4f0Var.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            buw buwVar = new buw(arrayMap);
            boolean z2 = ue6Var.d;
            e06 e06Var2 = (ue6Var.c != 5 || (e06Var = ue6Var.h) == null) ? null : e06Var;
            if (Collections.unmodifiableList(ue6Var.a).isEmpty() && ue6Var.f) {
                if (hashSet.isEmpty()) {
                    rnh0 rnh0Var = qx5Var.a;
                    rnh0Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : rnh0Var.b.entrySet()) {
                        rnh0.a aVar = (rnh0.a) entry.getValue();
                        if (aVar.f && aVar.e) {
                            arrayList2.add(((rnh0.a) entry.getValue()).a);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                    while (it.hasNext()) {
                        ue6 ue6Var2 = ((wf80) it.next()).g;
                        List listUnmodifiableList = Collections.unmodifiableList(ue6Var2.a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (ue6Var2.c() != 0 && (iC = ue6Var2.c()) != 0) {
                                ftwVarW.Y(snh0.J, Integer.valueOf(iC));
                            }
                            if (ue6Var2.d() != 0 && (iD = ue6Var2.d()) != 0) {
                                ftwVarW.Y(snh0.K, Integer.valueOf(iD));
                            }
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                hashSet.add((ijd) it2.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        pgt.i("Camera2CameraImpl", jbkEboCkTqmGf.RGXeUN);
                    }
                } else {
                    pgt.i("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
            }
            ArrayList arrayList3 = new ArrayList(hashSet);
            w2z w2zVarU = w2z.U(ftwVarW);
            ArrayList arrayList4 = new ArrayList(arrayList);
            c4f0 c4f0Var2 = c4f0.b;
            ArrayMap arrayMap3 = new ArrayMap();
            ArrayMap arrayMap4 = buwVar.a;
            for (String str2 : arrayMap4.keySet()) {
                arrayMap3.put(str2, arrayMap4.get(str2));
            }
            arrayListA.add(new ue6(arrayList3, w2zVarU, i, z2, arrayList4, z, new c4f0(arrayMap3), e06Var2));
        }
        qx5Var.v("Issue capture request", null);
        qx5Var.B.a(arrayListA);
    }
}
