package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.o8e0;
import defpackage.sge0;
import defpackage.uge0;
import defpackage.uj30;
import defpackage.vge0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements uj30 {
    public static final uge0 a;
    public static final uge0 b;
    public static final HashSet c;
    public static final HashSet d;

    static {
        uge0 uge0Var = new uge0();
        vge0.d dVar = vge0.d.b;
        vge0.b bVar = vge0.b.VGA;
        o8e0 o8e0Var = vge0.e;
        bVar.getClass();
        o8e0 o8e0Var2 = vge0.e;
        uge0Var.a(vge0.a.a(dVar, bVar, o8e0Var2));
        vge0.d dVar2 = vge0.d.a;
        vge0.b bVar2 = vge0.b.PREVIEW;
        bVar2.getClass();
        uge0Var.a(vge0.a.a(dVar2, bVar2, o8e0Var2));
        vge0.b bVar3 = vge0.b.MAXIMUM;
        bVar3.getClass();
        uge0Var.a(vge0.a.a(dVar, bVar3, o8e0Var2));
        a = uge0Var;
        uge0 uge0Var2 = new uge0();
        sge0.a(uge0Var2, vge0.a.a(dVar2, bVar2, o8e0Var2), dVar2, bVar, o8e0Var2);
        uge0Var2.a(vge0.a.a(dVar, bVar3, o8e0Var2));
        b = uge0Var2;
        c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));
        d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));
    }

    public static boolean c() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
