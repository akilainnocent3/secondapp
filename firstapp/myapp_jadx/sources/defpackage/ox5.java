package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import android.view.Surface;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ox5 extends CameraDevice.StateCallback {
    public final /* synthetic */ nv5.a a;
    public final /* synthetic */ qx5 b;

    public ox5(qx5 qx5Var, nv5.a aVar) {
        this.b = qx5Var;
        this.a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.b.v("openCameraConfigAndClose camera closed", null);
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.b.v("openCameraConfigAndClose camera disconnected", null);
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.b.v("openCameraConfigAndClose camera error " + i, null);
        this.a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        qx5 qx5Var = this.b;
        od80 od80Var = qx5Var.c;
        qx5Var.v(DZsoPoBl.iIMNbwmQbld, null);
        final qf6 qf6Var = new qf6(qx5Var.Z, new yj30(Collections.EMPTY_LIST), false, null);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final gcn gcnVar = new gcn(surface);
        obj.d(gcnVar.e).k(new Runnable() { // from class: cx5
            @Override // java.lang.Runnable
            public final void run() {
                surface.release();
                surfaceTexture.release();
            }
        }, nqe.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        ftw ftwVarV = ftw.V();
        ArrayList arrayList = new ArrayList();
        buw buwVarA = buw.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        pk1.a aVarA = wf80.f.a(gcnVar);
        aVarA.e = dhf.d;
        linkedHashSet.add(aVarA.a());
        qx5Var.v("Start configAndClose.", null);
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        w2z w2zVarU = w2z.U(ftwVarV);
        ArrayList arrayList10 = new ArrayList(arrayList);
        c4f0 c4f0Var = c4f0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = buwVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
            arrayList5 = arrayList5;
        }
        wf80 wf80Var = new wf80(arrayList5, arrayList6, arrayList7, arrayList8, new ue6(arrayList9, w2zVarU, 1, false, arrayList10, false, new c4f0(arrayMap), null), null, null, 0, null);
        ape0.a aVar = qx5Var.S;
        yj30 yj30Var = aVar.e;
        yj30 yj30Var2 = aVar.f;
        pw6 pw6VarG = obj.g(dbj.a(obj.h(qf6Var.h(wf80Var, cameraDevice, new kpe0(aVar.d, aVar.b, yj30Var, yj30Var2, aVar.a, aVar.c)))), new wz0() { // from class: dx5
            @Override // defpackage.wz0
            public final qis apply(Object obj) {
                qf6 qf6Var2 = qf6Var;
                qf6Var2.close();
                gcnVar.a();
                return qf6Var2.release();
            }
        }, od80Var);
        Objects.requireNonNull(cameraDevice);
        pw6VarG.k(new Runnable() { // from class: nx5
            @Override // java.lang.Runnable
            public final void run() {
                cameraDevice.close();
            }
        }, od80Var);
    }
}
