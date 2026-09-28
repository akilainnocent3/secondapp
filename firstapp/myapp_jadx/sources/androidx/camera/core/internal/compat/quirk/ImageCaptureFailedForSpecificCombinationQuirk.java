package androidx.camera.core.internal.compat.quirk;

import defpackage.aq20;
import defpackage.h8n;
import defpackage.pnh0;
import defpackage.snh0;
import defpackage.tnh0;
import defpackage.uj30;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements uj30 {
    public static final HashSet a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean c(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                pnh0 pnh0Var = (pnh0) it.next();
                if (pnh0Var instanceof aq20) {
                    z = true;
                } else if (pnh0Var instanceof h8n) {
                    z3 = true;
                } else if (pnh0Var.h.e(snh0.I)) {
                    z2 = pnh0Var.h.P() == tnh0.b.d;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
