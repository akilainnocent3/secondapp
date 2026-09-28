package defpackage;

import android.os.Build;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vhe implements qya {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // defpackage.qya
    public final void accept(Object obj) {
        boolean z;
        vj30 vj30Var = (vj30) obj;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 33) {
            String str = Build.MANUFACTURER;
            if ("SAMSUNG".equalsIgnoreCase(str)) {
                String str2 = Build.DEVICE;
                if (!"F2Q".equalsIgnoreCase(str2) && !"Q2Q".equalsIgnoreCase(str2)) {
                    if (("OPPO".equalsIgnoreCase(str) || !"OP4E75L1".equalsIgnoreCase(Build.DEVICE)) && (!"LENOVO".equalsIgnoreCase(str) || !"Q706F".equalsIgnoreCase(Build.DEVICE))) {
                        z = false;
                    }
                }
                z = true;
            } else if ("OPPO".equalsIgnoreCase(str)) {
                z = false;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (vj30Var.a(SurfaceViewStretchedQuirk.class, z)) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if ("XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL)) {
            z2 = true;
        }
        if (vj30Var.a(SurfaceViewNotCroppedByParentQuirk.class, z2)) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        yhe.a = new yj30(arrayList);
        pgt.a("DeviceQuirks", "view DeviceQuirks = ".concat(yj30.d(yhe.a)));
    }
}
