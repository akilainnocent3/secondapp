package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q8e0 {
    public static final wg1 a;
    public static final xnu b;
    public static final xnu c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        a = hoa.a.a(cls, "camera2.streamSpec.streamUseCase");
        xnu xnuVar = new xnu();
        int i = Build.VERSION.SDK_INT;
        tnh0.b bVar = tnh0.b.d;
        tnh0.b bVar2 = tnh0.b.a;
        tnh0.b bVar3 = tnh0.b.b;
        if (i >= 33) {
            tnh0.b bVar4 = tnh0.b.f;
            tnh0.b bVar5 = tnh0.b.c;
            xnuVar.put(4L, ay0.V(new tnh0.b[]{bVar3, bVar4, bVar5}));
            xnuVar.put(1L, ay0.V(new tnh0.b[]{bVar3, bVar4, bVar5}));
            xnuVar.put(2L, wi80.b(bVar2));
            xnuVar.put(3L, wi80.b(bVar));
        }
        b = xnuVar.c();
        xnu xnuVar2 = new xnu();
        if (i >= 33) {
            xnuVar2.put(4L, ay0.V(new tnh0.b[]{bVar3, bVar2, bVar}));
            xnuVar2.put(3L, ay0.V(new tnh0.b[]{bVar3, bVar}));
        }
        c = xnuVar2.c();
    }

    public static final boolean a(e16 e16Var, List<vge0> list) {
        long[] jArr;
        e16Var.getClass();
        if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) e16Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            Iterator<vge0> it = list.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains(Long.valueOf(it.next().c.a))) {
                }
            }
            return true;
        }
        return false;
    }

    public static jz5 b(hoa hoaVar, Long l) {
        wg1 wg1Var = a;
        if (hoaVar.e(wg1Var) && Intrinsics.g(hoaVar.d(wg1Var), l)) {
            return null;
        }
        ftw ftwVarW = ftw.W(hoaVar);
        ftwVarW.Y(wg1Var, l);
        return new jz5(ftwVarW);
    }

    public static boolean c(tnh0.b bVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != tnh0.b.e) {
            Long lValueOf = Long.valueOf(j);
            xnu xnuVar = b;
            if (!xnuVar.containsKey(lValueOf)) {
                return false;
            }
            Object obj = xnuVar.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(bVar);
        }
        Long lValueOf2 = Long.valueOf(j);
        xnu xnuVar2 = c;
        if (!xnuVar2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = xnuVar2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((tnh0.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(e16 e16Var) {
        long[] jArr;
        e16Var.getClass();
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) e16Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public static boolean e(hoa hoaVar, tnh0.b bVar) {
        Object objB = hoaVar.b(snh0.G, Boolean.FALSE);
        objB.getClass();
        if (((Boolean) objB).booleanValue()) {
            return false;
        }
        wg1 wg1Var = i8n.O;
        if (!hoaVar.e(wg1Var)) {
            return false;
        }
        Object objD = hoaVar.d(wg1Var);
        objD.getClass();
        int iIntValue = ((Number) objD).intValue();
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return iIntValue == 2;
        }
        if (iOrdinal != 3) {
            return false;
        }
        zhe.a.b(PreviewUnderExposureQuirk.class);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    public static final boolean f(e16 e16Var, ArrayList arrayList, HashMap map, HashMap map2) {
        boolean z;
        boolean z2;
        e16Var.getClass();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList2 = new ArrayList(map.keySet());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((a21) obj).d().getClass();
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Object obj3 = map.get((snh0) obj2);
                obj3.getClass();
                ((k8e0) obj3).d().getClass();
            }
            long[] jArr = (long[]) e16Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    a21 a21Var = (a21) it.next();
                    hoa hoaVarD = a21Var.d();
                    hoaVarD.getClass();
                    wg1 wg1Var = jz5.P;
                    if (hoaVarD.e(wg1Var)) {
                        hoa hoaVarD2 = a21Var.d();
                        hoaVarD2.getClass();
                        Object objD = hoaVarD2.d(wg1Var);
                        objD.getClass();
                        if (((Number) objD).longValue() == 0) {
                            z = false;
                            z2 = true;
                        } else {
                            z2 = false;
                            z = true;
                        }
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                int size3 = arrayList2.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj4 = arrayList2.get(i4);
                    i4++;
                    snh0 snh0Var = (snh0) obj4;
                    wg1 wg1Var2 = jz5.P;
                    if (snh0Var.e(wg1Var2)) {
                        Object objD2 = snh0Var.d(wg1Var2);
                        objD2.getClass();
                        long jLongValue = ((Number) objD2).longValue();
                        if (jLongValue != 0) {
                            if (z2) {
                                hb5.a("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(jLongValue));
                            z = true;
                        } else if (z) {
                            hb5.a("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        hb5.a("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                        }
                    }
                    int size4 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        Object obj5 = arrayList.get(i5);
                        i5++;
                        a21 a21Var2 = (a21) obj5;
                        hoa hoaVarD3 = a21Var2.d();
                        hoaVarD3.getClass();
                        jz5 jz5VarB = b(hoaVarD3, (Long) hoaVarD3.d(jz5.P));
                        if (jz5VarB != null) {
                            map2.put(a21Var2, a21Var2.j(jz5VarB));
                        }
                    }
                    int size5 = arrayList2.size();
                    while (i < size5) {
                        Object obj6 = arrayList2.get(i);
                        i++;
                        snh0 snh0Var2 = (snh0) obj6;
                        k8e0 k8e0Var = (k8e0) map.get(snh0Var2);
                        k8e0Var.getClass();
                        hoa hoaVarD4 = k8e0Var.d();
                        hoaVarD4.getClass();
                        jz5 jz5VarB2 = b(hoaVarD4, (Long) hoaVarD4.d(jz5.P));
                        if (jz5VarB2 != null) {
                            xk1.a aVarI = k8e0Var.i();
                            aVarI.f = jz5VarB2;
                            map.put(snh0Var2, aVarI.a());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
