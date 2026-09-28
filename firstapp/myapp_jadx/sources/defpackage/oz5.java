package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oz5 implements wf80.e {
    public static final oz5 a = new oz5();

    @Override // wf80.e
    public final void a(Size size, snh0<?> snh0Var, wf80.b bVar) {
        wf80 wf80VarI = snh0Var.I();
        w2z w2zVar = w2z.P;
        int i = wf80.a().g.c;
        if (wf80VarI != null) {
            i = wf80VarI.g.c;
            for (CameraDevice.StateCallback stateCallback : wf80VarI.c) {
                ArrayList arrayList = bVar.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : wf80VarI.d) {
                ArrayList arrayList2 = bVar.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            bVar.b.a(wf80VarI.g.e);
            w2zVar = wf80VarI.g.b;
        }
        bVar.b.b = ftw.W(w2zVar);
        if (snh0Var instanceof lq20) {
            Rational rational = mq20.a;
            if (((PreviewPixelHDRnetQuirk) zhe.a.b(PreviewPixelHDRnetQuirk.class)) != null && !mq20.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                ftw ftwVarV = ftw.V();
                ftwVarV.Y(jz5.U(CaptureRequest.TONEMAP_MODE), 2);
                bVar.b.c(new jz5(w2z.U(ftwVarV)));
            }
        }
        bVar.b.c = ((Integer) snh0Var.b(jz5.O, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) snh0Var.b(jz5.Q, new a26.b());
        ArrayList arrayList3 = bVar.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) snh0Var.b(jz5.R, new y06());
        ArrayList arrayList4 = bVar.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        se6 se6Var = new se6((CameraCaptureSession.CaptureCallback) snh0Var.b(jz5.S, new zx5()));
        bVar.b.b(se6Var);
        ArrayList arrayList5 = bVar.e;
        if (!arrayList5.contains(se6Var)) {
            arrayList5.add(se6Var);
        }
        int iU = snh0Var.u();
        if (iU != 0) {
            ue6.a aVar = bVar.b;
            if (iU != 0) {
                aVar.b.Y(snh0.K, Integer.valueOf(iU));
            }
        }
        int iZ = snh0Var.z();
        if (iZ != 0) {
            ue6.a aVar2 = bVar.b;
            if (iZ != 0) {
                aVar2.b.Y(snh0.J, Integer.valueOf(iZ));
            }
        }
        ftw ftwVarV2 = ftw.V();
        wg1 wg1Var = jz5.T;
        ftwVarV2.Y(wg1Var, (String) snh0Var.b(wg1Var, null));
        wg1 wg1Var2 = jz5.P;
        Long l = (Long) snh0Var.b(wg1Var2, -1L);
        l.getClass();
        ftwVarV2.Y(wg1Var2, l);
        bVar.b.c(ftwVarV2);
        bVar.b.c(hf6.a.c(snh0Var).b());
    }
}
