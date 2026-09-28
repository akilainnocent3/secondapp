package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class twh extends c48<float[]> {
    public static float[] j(String str) {
        str.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "float[]";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        float[] fArr = (float[]) obj;
        float[] fArrJ = j(str);
        if (fArr == null) {
            return fArrJ;
        }
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrJ, 0, fArrCopyOf, length, 1);
        return fArrCopyOf;
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        Float[] fArr;
        float[] fArr2 = (float[]) obj;
        float[] fArr3 = (float[]) obj2;
        Float[] fArr4 = null;
        if (fArr2 != null) {
            fArr = new Float[fArr2.length];
            int length = fArr2.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Float.valueOf(fArr2[i]);
            }
        } else {
            fArr = null;
        }
        if (fArr3 != null) {
            fArr4 = new Float[fArr3.length];
            int length2 = fArr3.length;
            for (int i2 = 0; i2 < length2; i2++) {
                fArr4[i2] = Float.valueOf(fArr3[i2]);
            }
        }
        return wx0.b(fArr, fArr4);
    }

    @Override // defpackage.c48
    public final float[] h() {
        return new float[0];
    }

    @Override // defpackage.c48
    public final List i(float[] fArr) {
        List<Float> listP;
        float[] fArr2 = fArr;
        if (fArr2 == null || (listP = ay0.P(fArr2)) == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(listP, 10));
        Iterator<T> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
