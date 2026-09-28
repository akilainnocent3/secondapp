package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p4i {
    public static final MeteringRectangle[] j = new MeteringRectangle[0];
    public final ow5 a;
    public final od80 b;
    public volatile boolean c = false;
    public int d = 1;
    public MeteringRectangle[] e;
    public MeteringRectangle[] f;
    public MeteringRectangle[] g;
    public boolean h;
    public n4i i;

    public class a extends tz5 {
        public final /* synthetic */ nv5.a a;

        public a(nv5.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.tz5
        public final void a(int i) {
            this.a.d(new k16("Camera is closed"));
        }

        @Override // defpackage.tz5
        public final void b(int i, e06 e06Var) {
            pgt.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
            this.a.b(null);
        }

        @Override // defpackage.tz5
        public final void c(int i, vz5 vz5Var) {
            this.a.d(new m16.b());
        }
    }

    public p4i(ow5 ow5Var, od80 od80Var) {
        MeteringRectangle[] meteringRectangleArr = j;
        this.e = meteringRectangleArr;
        this.f = meteringRectangleArr;
        this.g = meteringRectangleArr;
        this.h = false;
        this.i = null;
        this.a = ow5Var;
        this.b = od80Var;
    }

    public final void a(boolean z, boolean z2) {
        if (this.c) {
            ue6.a aVar = new ue6.a();
            aVar.f = true;
            aVar.c = this.d;
            ftw ftwVarV = ftw.V();
            if (z) {
                ftwVarV.Y(jz5.U(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                ftwVarV.Y(jz5.U(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            aVar.c(new jz5(w2z.U(ftwVarV)));
            this.a.t(Collections.singletonList(aVar.e()));
        }
    }

    public final qis<Void> b(final boolean z) {
        int i = Build.VERSION.SDK_INT;
        fcn.c cVar = fcn.c.b;
        if (i < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i);
            return cVar;
        }
        if (ow5.n(this.a.e, 5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return cVar;
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            this.b.execute(new Runnable() { // from class: l4i
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v1, types: [n4i, ow5$c] */
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
                @Override // java.lang.Runnable
                public final void run() {
                    final p4i p4iVar = this.a;
                    boolean z2 = z;
                    final nv5.a aVar2 = aVar;
                    ow5 ow5Var = p4iVar.a;
                    ow5Var.b.a.remove(p4iVar.i);
                    p4iVar.h = z2;
                    if (!p4iVar.c) {
                        aVar2.d(new k16("Camera is not active."));
                        return;
                    }
                    final long jU = p4iVar.a.u();
                    ?? r3 = new ow5.c() { // from class: n4i
                        @Override // ow5.c
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            boolean z3 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            pgt.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z3);
                            if (z3 != p4iVar.h || !ow5.q(totalCaptureResult, jU)) {
                                return false;
                            }
                            pgt.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z3);
                            aVar2.b(null);
                            return true;
                        }
                    };
                    p4iVar.i = r3;
                    p4iVar.a.j(r3);
                }
            });
            aVar.a = "enableExternalFlashAeMode";
            return dVar;
        } catch (Exception e) {
            dVar.a(e);
            return dVar;
        }
    }

    public final nv5.d c() {
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            this.b.execute(new Runnable() { // from class: m4i
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(aVar);
                }
            });
            aVar.a = "triggerAePrecapture";
            return dVar;
        } catch (Exception e) {
            dVar.a(e);
            return dVar;
        }
    }

    public final void d(nv5.a<Void> aVar) {
        pgt.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.c) {
            aVar.d(new k16("Camera is not active."));
            return;
        }
        ue6.a aVar2 = new ue6.a();
        aVar2.c = this.d;
        aVar2.f = true;
        ftw ftwVarV = ftw.V();
        ftwVarV.Y(jz5.U(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        aVar2.c(new jz5(w2z.U(ftwVarV)));
        aVar2.b(new a(aVar));
        this.a.t(Collections.singletonList(aVar2.e()));
    }
}
