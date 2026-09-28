package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class ay5 implements ue6.b {
    public static final ay5 a = new ay5();

    @Override // ue6.b
    public void a(i8n i8nVar, ue6.a aVar) {
        int i;
        ue6 ue6Var = (ue6) i8nVar.b(snh0.z, null);
        w2z w2zVar = w2z.P;
        wg1 wg1Var = ue6.i;
        HashSet hashSet = new HashSet();
        ftw ftwVarV = ftw.V();
        ArrayList arrayList = new ArrayList();
        buw buwVarA = buw.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        w2z w2zVarU = w2z.U(ftwVarV);
        ArrayList arrayList3 = new ArrayList(arrayList);
        c4f0 c4f0Var = c4f0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = buwVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new ue6(arrayList2, w2zVarU, -1, false, arrayList3, false, new c4f0(arrayMap), null);
        if (ue6Var != null) {
            int i2 = ue6Var.c;
            aVar.a(ue6Var.e);
            w2zVar = ue6Var.b;
            i = i2;
        } else {
            i = -1;
        }
        aVar.b = ftw.W(w2zVar);
        aVar.c = ((Integer) i8nVar.b(jz5.O, Integer.valueOf(i))).intValue();
        aVar.b(new se6((CameraCaptureSession.CaptureCallback) i8nVar.b(jz5.S, new zx5())));
        aVar.c(hf6.a.c(i8nVar).b());
    }
}
