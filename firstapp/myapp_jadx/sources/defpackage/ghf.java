package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ghf {
    public final e16 a;
    public final ihf b;
    public final boolean c;

    public static final class a {
        public static dhf a(e16 e16Var) {
            Long l = (Long) e16Var.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return (dhf) ehf.a.get(l);
            }
            return null;
        }
    }

    public ghf(e16 e16Var) {
        this.a = e16Var;
        this.b = ihf.a(e16Var);
        int[] iArr = (int[]) e16Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 18) {
                    z = true;
                    break;
                }
            }
        }
        this.c = z;
    }

    public static boolean a(dhf dhfVar, dhf dhfVar2) {
        boolean zB = dhfVar2.b();
        int i = dhfVar2.a;
        km20.g("Fully specified range is not actually fully specified.", zB);
        int i2 = dhfVar.a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = dhfVar.b;
        return i3 == 0 || i3 == dhfVar2.b;
    }

    public static boolean b(dhf dhfVar, dhf dhfVar2, HashSet hashSet) {
        if (hashSet.contains(dhfVar2)) {
            return a(dhfVar, dhfVar2);
        }
        pgt.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dhfVar + "\nCandidate dynamic range:\n  " + dhfVar2);
        return false;
    }

    public static dhf c(dhf dhfVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (dhfVar.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dhf dhfVar2 = (dhf) it.next();
            km20.f(dhfVar2, "Fully specified DynamicRange cannot be null.");
            int i = dhfVar2.a;
            km20.g("Fully specified DynamicRange must have fully defined encoding.", dhfVar2.b());
            if (i != 1 && b(dhfVar, dhfVar2, hashSet)) {
                return dhfVar2;
            }
        }
        return null;
    }

    public static void d(HashSet hashSet, dhf dhfVar, ihf ihfVar) {
        km20.g("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set<dhf> setC = ihfVar.a.c(dhfVar);
        if (setC.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setC);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dhfVar + "\nConstraints:\n  " + TextUtils.join("\n  ", setC) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }
}
