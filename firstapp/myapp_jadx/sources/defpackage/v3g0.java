package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v3g0 {
    public final boolean a;

    public v3g0() {
        this.a = zhe.a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public static ue6 a(ue6 ue6Var) {
        ue6.a aVar = new ue6.a();
        aVar.c = ue6Var.c;
        Iterator it = Collections.unmodifiableList(ue6Var.a).iterator();
        while (it.hasNext()) {
            aVar.d((ijd) it.next());
        }
        aVar.c(ue6Var.b);
        ftw ftwVarV = ftw.V();
        ftwVarV.Y(jz5.U(CaptureRequest.FLASH_MODE), 0);
        aVar.c(new jz5(w2z.U(ftwVarV)));
        return aVar.e();
    }

    public final boolean b(ArrayList arrayList, boolean z) {
        if (this.a && z) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) ((CaptureRequest) obj).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
