package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v16 extends u16 {
    @Override // p16.a
    public void a(ag80 ag80Var) throws rz5 {
        CameraDevice cameraDevice = this.a;
        cameraDevice.getClass();
        ag80.c cVar = ag80Var.a;
        cVar.j().getClass();
        List<oaz> listK = cVar.k();
        if (listK == null) {
            hb5.a("Invalid output configurations");
            return;
        }
        if (cVar.n() == null) {
            hb5.a("Invalid executor");
            return;
        }
        String id = cameraDevice.getId();
        Iterator<oaz> it = listK.iterator();
        while (it.hasNext()) {
            String strE = it.next().a.e();
            if (strE != null && !strE.isEmpty()) {
                pgt.i("CameraDeviceCompat", tx5.a("Camera ", id, ": Camera doesn't support physicalCameraId ", strE, ". Ignoring."));
            }
        }
        g06.c cVar2 = new g06.c(cVar.n(), cVar.j());
        List<oaz> listK2 = cVar.k();
        x16.a aVar = (x16.a) this.b;
        aVar.getClass();
        Handler handler = aVar.a;
        sln slnVarA = cVar.a();
        try {
            if (slnVarA != null) {
                InputConfiguration inputConfiguration = slnVarA.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, ag80.a(listK2), cVar2, handler);
            } else {
                if (cVar.i() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(ag80.a(listK2), cVar2, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listK2.size());
                Iterator<oaz> it2 = listK2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().a.i());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, cVar2, handler);
            }
        } catch (CameraAccessException e) {
            throw new rz5(e);
        }
    }
}
