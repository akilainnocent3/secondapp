package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class fy5 {
    public final ow5 a;
    public final wnh0 b;
    public final boolean c;
    public final yj30 d;
    public final od80 e;
    public final adl f;
    public final boolean g;
    public int h = 1;

    public static class a implements e {
        public final ow5 a;
        public final efz b;
        public final int c;
        public boolean d = false;

        public a(ow5 ow5Var, int i, efz efzVar) {
            this.a = ow5Var;
            this.c = i;
            this.b = efzVar;
        }

        @Override // fy5.e
        public final qis<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!fy5.c(this.c, totalCaptureResult)) {
                return obj.c(Boolean.FALSE);
            }
            pgt.a("Camera2CapturePipeline", "Trigger AE");
            this.d = true;
            nv5.a<Void> aVar = new nv5.a<>();
            nv5.d<T> dVar = new nv5.d<>(aVar);
            aVar.b = dVar;
            aVar.a = ew5.class;
            try {
                this.a.h.d(aVar);
                this.b.b = true;
                aVar.a = "AePreCapture";
            } catch (Exception e) {
                dVar.a(e);
            }
            dbj dbjVarA = dbj.a(dVar);
            ey5 ey5Var = new ey5();
            return obj.g(dbjVarA, new nbj(ey5Var), nqe.a());
        }

        @Override // fy5.e
        public final boolean b() {
            return this.c == 0;
        }

        @Override // fy5.e
        public final void c() {
            if (this.d) {
                pgt.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.a.h.a(false, true);
                this.b.b = false;
            }
        }
    }

    public static class b implements e {
        public final ow5 a;
        public boolean b = false;

        public b(ow5 ow5Var) {
            this.a = ow5Var;
        }

        @Override // fy5.e
        public final qis<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            fcn.c cVarC = obj.c(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                pgt.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    pgt.a("Camera2CapturePipeline", "Trigger AF");
                    this.b = true;
                    p4i p4iVar = this.a.h;
                    if (p4iVar.c) {
                        ue6.a aVar = new ue6.a();
                        aVar.c = p4iVar.d;
                        aVar.f = true;
                        ftw ftwVarV = ftw.V();
                        ftwVarV.Y(jz5.U(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        aVar.c(new jz5(w2z.U(ftwVarV)));
                        aVar.b(new o4i());
                        p4iVar.a.t(Collections.singletonList(aVar.e()));
                    }
                }
            }
            return cVarC;
        }

        @Override // fy5.e
        public final boolean b() {
            return true;
        }

        @Override // fy5.e
        public final void c() {
            if (this.b) {
                pgt.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.a.h.a(true, false);
            }
        }
    }

    public static class c implements d06 {
        public final od80 a;
        public final d b;
        public final int c;

        public c(d dVar, od80 od80Var, int i) {
            this.b = dVar;
            this.a = od80Var;
            this.c = i;
        }

        @Override // defpackage.d06
        public final qis<Void> a() {
            pgt.a("Camera2CapturePipeline", "invokePreCapture");
            return obj.g(dbj.a(this.b.a(this.c)), new nbj(new gy5()), this.a);
        }

        @Override // defpackage.d06
        public final qis<Void> b() {
            nv5.a aVar = new nv5.a();
            nv5.d<T> dVar = new nv5.d<>(aVar);
            aVar.b = dVar;
            aVar.a = ew5.class;
            try {
                this.b.i.c();
                aVar.b(null);
                aVar.a = "invokePostCaptureFuture";
            } catch (Exception e) {
                dVar.a(e);
            }
            return dVar;
        }
    }

    public static class d {
        public final int a;
        public final od80 b;
        public final adl c;
        public final ow5 d;
        public final efz e;
        public final boolean f;
        public long g = 1000000000;
        public final ArrayList h = new ArrayList();
        public final a i = new a();

        public class a implements e {
            public a() {
            }

            @Override // fy5.e
            public final qis<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = d.this.h;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add(((e) obj).a(totalCaptureResult));
                }
                vhs vhsVar = new vhs(new ArrayList(arrayList), true, nqe.a());
                my5 my5Var = new my5();
                return obj.g(vhsVar, new nbj(my5Var), nqe.a());
            }

            @Override // fy5.e
            public final boolean b() {
                ArrayList arrayList = d.this.h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((e) obj).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // fy5.e
            public final void c() {
                ArrayList arrayList = d.this.h;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((e) obj).c();
                }
            }
        }

        public d(int i, od80 od80Var, adl adlVar, ow5 ow5Var, boolean z, efz efzVar) {
            this.a = i;
            this.b = od80Var;
            this.c = adlVar;
            this.d = ow5Var;
            this.f = z;
            this.e = efzVar;
        }

        public final qis<TotalCaptureResult> a(final int i) {
            boolean zIsEmpty = this.h.isEmpty();
            qis qisVar = fcn.c.b;
            if (zIsEmpty) {
                return qisVar;
            }
            if (this.i.b()) {
                f fVar = new f(null);
                ow5 ow5Var = this.d;
                ow5Var.j(fVar);
                by5 by5Var = new by5(ow5Var, fVar);
                od80 od80Var = ow5Var.c;
                nv5.d dVar = fVar.b;
                dVar.b.k(by5Var, od80Var);
                qisVar = dVar;
            }
            dbj dbjVarA = dbj.a(qisVar);
            wz0 wz0Var = new wz0() { // from class: jy5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                    boolean zC = fy5.c(i, totalCaptureResult);
                    fy5.d dVar2 = this.a;
                    if (zC) {
                        dVar2.g = 5000000000L;
                    }
                    return dVar2.i.a(totalCaptureResult);
                }
            };
            od80 od80Var2 = this.b;
            return obj.g(obj.g(dbjVarA, wz0Var, od80Var2), new ky5(this), od80Var2);
        }
    }

    public interface e {
        qis<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class f implements ow5.c {
        public final nv5.a<TotalCaptureResult> a;
        public final nv5.d b;
        public final a c;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            nv5.a<TotalCaptureResult> aVar2 = new nv5.a<>();
            nv5.d<T> dVar = new nv5.d<>(aVar2);
            aVar2.b = dVar;
            try {
                this.a = aVar2;
                aVar2.a = "waitFor3AResult";
            } catch (Exception e) {
                dVar.a(e);
            }
            this.b = dVar;
            this.c = aVar;
        }

        @Override // ow5.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.a.b(totalCaptureResult);
            return true;
        }
    }

    public static class g implements e {
        public final ow5 a;
        public final od80 b;
        public final adl c;
        public final h8n.i d;
        public final vnh0 e;

        public g(ow5 ow5Var, od80 od80Var, adl adlVar, vnh0 vnh0Var) {
            this.a = ow5Var;
            this.b = od80Var;
            this.c = adlVar;
            this.e = vnh0Var;
            h8n.i iVar = ow5Var.r;
            Objects.requireNonNull(iVar);
            this.d = iVar;
        }

        @Override // fy5.e
        public final qis<Boolean> a(TotalCaptureResult totalCaptureResult) {
            pgt.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final nv5.a aVar = new nv5.a();
            final nv5.d<T> dVar = new nv5.d<>(aVar);
            aVar.b = dVar;
            aVar.a = ew5.class;
            try {
                atomicReference.set(new h8n.j() { // from class: py5
                    @Override // h8n.j
                    public final void a() {
                        pgt.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
                        aVar.b(null);
                    }
                });
                aVar.a = "OnScreenFlashUiApplied";
            } catch (Exception e) {
                dVar.a(e);
            }
            final nv5.a aVar2 = new nv5.a();
            nv5.d<T> dVar2 = new nv5.d<>(aVar2);
            aVar2.b = dVar2;
            aVar2.a = ew5.class;
            try {
                ((adl) mku.a()).execute(new Runnable() { // from class: xy5
                    @Override // java.lang.Runnable
                    public final void run() {
                        pgt.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
                        this.a.d.a(System.currentTimeMillis() + 3000, (h8n.j) atomicReference.get());
                        aVar2.b(null);
                    }
                });
                aVar2.a = "OnScreenFlashStart";
            } catch (Exception e2) {
                dVar2.a(e2);
            }
            dbj dbjVarA = dbj.a(dVar2);
            wz0 wz0Var = new wz0() { // from class: ry5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    return this.a.a.h.b(true);
                }
            };
            od80 od80Var = this.b;
            pw6 pw6VarG = obj.g(obj.g(obj.g(obj.g(obj.g(dbjVarA, wz0Var, od80Var), new wz0() { // from class: sy5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    fy5.g gVar = this.a;
                    nv5.a aVar3 = new nv5.a();
                    nv5.d<T> dVar3 = new nv5.d<>(aVar3);
                    aVar3.b = dVar3;
                    aVar3.a = ew5.class;
                    try {
                        if (gVar.e.a()) {
                            pgt.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
                            gVar.a.l(2);
                            aVar3.b(null);
                        } else {
                            aVar3.b(null);
                        }
                        aVar3.a = "EnableTorchInternal";
                    } catch (Exception e3) {
                        dVar3.a(e3);
                    }
                    return dVar3;
                }
            }, od80Var), new wz0() { // from class: ty5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    return nv5.a(new kbj(dVar, this.a.c, 3000L));
                }
            }, od80Var), new wz0() { // from class: uy5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    return this.a.a.h.c();
                }
            }, od80Var), new wz0() { // from class: vy5
                @Override // defpackage.wz0
                public final qis apply(Object obj) {
                    fy5.g gVar = this.a;
                    adl adlVar = gVar.c;
                    ow5 ow5Var = gVar.a;
                    fy5.f fVar = new fy5.f(new yy5());
                    ow5Var.j(fVar);
                    by5 by5Var = new by5(ow5Var, fVar);
                    od80 od80Var2 = ow5Var.c;
                    nv5.d dVar3 = fVar.b;
                    dVar3.b.k(by5Var, od80Var2);
                    return nv5.a(new kbj(dVar3, adlVar, 2000L));
                }
            }, od80Var);
            wy5 wy5Var = new wy5();
            return obj.g(pw6VarG, new nbj(wy5Var), nqe.a());
        }

        @Override // fy5.e
        public final boolean b() {
            return false;
        }

        @Override // fy5.e
        public final void c() {
            ow5 ow5Var = this.a;
            p4i p4iVar = ow5Var.h;
            pgt.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.e.a()) {
                ow5Var.l(0);
            }
            p4iVar.b(false).k(new oy5(), this.b);
            p4iVar.a(false, true);
            ScheduledExecutorService scheduledExecutorServiceA = mku.a();
            h8n.i iVar = this.d;
            Objects.requireNonNull(iVar);
            ((adl) scheduledExecutorServiceA).execute(new qy5(iVar, 0));
        }
    }

    public static class h implements e {
        public final ow5 a;
        public final int b;
        public boolean c = false;
        public final od80 d;
        public final adl e;
        public final boolean f;

        public h(ow5 ow5Var, int i, od80 od80Var, adl adlVar, boolean z) {
            this.a = ow5Var;
            this.b = i;
            this.d = od80Var;
            this.e = adlVar;
            this.f = z;
        }

        @Override // fy5.e
        public final qis<Boolean> a(TotalCaptureResult totalCaptureResult) {
            pgt.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + fy5.c(this.b, totalCaptureResult));
            if (fy5.c(this.b, totalCaptureResult)) {
                if (this.a.s == 0) {
                    pgt.a("Camera2CapturePipeline", "Turn on torch");
                    this.c = true;
                    nv5.a<Void> aVar = new nv5.a<>();
                    nv5.d<T> dVar = new nv5.d<>(aVar);
                    aVar.b = dVar;
                    aVar.a = ew5.class;
                    try {
                        this.a.j.a(aVar, 2);
                        aVar.a = "TorchOn";
                    } catch (Exception e) {
                        dVar.a(e);
                    }
                    return obj.g(obj.g(obj.g(dbj.a(dVar), new zy5(this), this.d), new az5(this, 0), this.d), new nbj(new wy5()), nqe.a());
                }
                pgt.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return obj.c(Boolean.FALSE);
        }

        @Override // fy5.e
        public final boolean b() {
            return this.b == 0;
        }

        @Override // fy5.e
        public final void c() {
            if (this.c) {
                ow5 ow5Var = this.a;
                ow5Var.j.a(null, 0);
                pgt.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f) {
                    ow5Var.h.a(false, true);
                }
            }
        }
    }

    public fy5(ow5 ow5Var, e16 e16Var, yj30 yj30Var, od80 od80Var, adl adlVar) {
        this.a = ow5Var;
        Integer num = (Integer) e16Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.g = num != null && num.intValue() == 2;
        this.e = od80Var;
        this.f = adlVar;
        this.d = yj30Var;
        this.b = new wnh0(yj30Var);
        this.c = juh.a(new cy5(e16Var));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z) {
        if (totalCaptureResult != null) {
            vv5 vv5Var = new vv5(c4f0.b, totalCaptureResult);
            Set<zz5> set = u2b.a;
            CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
            CaptureResult captureResult = vv5Var.b;
            Integer num = (Integer) captureResult.get(key);
            yz5 yz5Var = yz5.b;
            yz5 yz5Var2 = yz5.a;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    yz5Var2 = yz5Var;
                } else if (iIntValue == 1 || iIntValue == 2) {
                    yz5Var2 = yz5.c;
                } else if (iIntValue == 3 || iIntValue == 4) {
                    yz5Var2 = yz5.d;
                } else if (iIntValue != 5) {
                    pgt.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                } else {
                    yz5Var2 = yz5Var;
                }
            }
            boolean z2 = yz5Var2 == yz5Var || u2b.a.contains(vv5Var.f());
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
            wz5 wz5Var = wz5.b;
            wz5 wz5Var2 = wz5.a;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 0) {
                    wz5Var2 = wz5Var;
                } else if (iIntValue2 == 1) {
                    wz5Var2 = wz5.c;
                } else if (iIntValue2 == 2) {
                    wz5Var2 = wz5.d;
                } else if (iIntValue2 == 3) {
                    wz5Var2 = wz5.e;
                } else if (iIntValue2 == 4) {
                    wz5Var2 = wz5.f;
                } else if (iIntValue2 == 5 && Build.VERSION.SDK_INT >= 28) {
                    wz5Var2 = wz5.i;
                }
            }
            boolean z3 = wz5Var2 == wz5Var;
            boolean z4 = !z ? !(z3 || u2b.c.contains(vv5Var.h())) : !(z3 || u2b.d.contains(vv5Var.h()));
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
            a06 a06Var = a06.b;
            a06 a06Var2 = a06.a;
            if (num3 != null) {
                switch (num3.intValue()) {
                    case 0:
                        a06Var2 = a06Var;
                        break;
                    case 1:
                        a06Var2 = a06.c;
                        break;
                    case 2:
                        a06Var2 = a06.d;
                        break;
                    case 3:
                        a06Var2 = a06.e;
                        break;
                    case 4:
                        a06Var2 = a06.f;
                        break;
                    case 5:
                        a06Var2 = a06.i;
                        break;
                    case 6:
                        a06Var2 = a06.v;
                        break;
                    case 7:
                        a06Var2 = a06.w;
                        break;
                    case 8:
                        a06Var2 = a06.y;
                        break;
                }
            }
            boolean z5 = a06Var2 == a06Var || u2b.b.contains(vv5Var.g());
            pgt.a("ConvergenceUtils", "checkCaptureResult, AE=" + vv5Var.h() + " AF =" + vv5Var.f() + " AWB=" + vv5Var.g());
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i, TotalCaptureResult totalCaptureResult) {
        pgt.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i);
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            pgt.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    public final d a(int i, int i2, int i3) {
        boolean z;
        yj30 yj30Var = this.d;
        efz efzVar = new efz(yj30Var);
        int i4 = this.h;
        boolean z2 = this.g;
        od80 od80Var = this.e;
        adl adlVar = this.f;
        ow5 ow5Var = this.a;
        d dVar = new d(i4, od80Var, adlVar, ow5Var, z2, efzVar);
        ArrayList arrayList = dVar.h;
        if (i == 0) {
            arrayList.add(new b(ow5Var));
        }
        if (i2 == 3) {
            arrayList.add(new g(ow5Var, od80Var, adlVar, new vnh0(yj30Var)));
        } else if (this.c) {
            boolean z3 = this.b.a;
            if (z3 || this.h == 3 || i3 == 1) {
                if (!z3) {
                    int i5 = ow5Var.p.a.get();
                    pgt.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + i5);
                    z = i5 <= 0;
                }
                arrayList.add(new h(ow5Var, i2, od80Var, adlVar, z));
            } else {
                arrayList.add(new a(ow5Var, i2, efzVar));
            }
        }
        StringBuilder sbA = dy5.a("createPipeline: captureMode = ", i, i2, ", flashMode = ", ", flashType = ");
        sbA.append(i3);
        sbA.append(", pipeline tasks = ");
        sbA.append(arrayList);
        pgt.a("Camera2CapturePipeline", sbA.toString());
        return dVar;
    }
}
