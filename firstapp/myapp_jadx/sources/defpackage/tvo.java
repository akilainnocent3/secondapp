package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tvo extends c48<int[]> {
    public static int[] j(String str) {
        str.getClass();
        return new int[]{((Number) djx.b.h(str)).intValue()};
    }

    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "integer[]";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        int[] iArr = (int[]) obj;
        int[] iArrJ = j(str);
        return iArr != null ? xx0.o(iArr, iArrJ) : iArrJ;
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        Integer[] numArr;
        int[] iArr = (int[]) obj;
        int[] iArr2 = (int[]) obj2;
        Integer[] numArr2 = null;
        if (iArr != null) {
            numArr = new Integer[iArr.length];
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                numArr[i] = Integer.valueOf(iArr[i]);
            }
        } else {
            numArr = null;
        }
        if (iArr2 != null) {
            numArr2 = new Integer[iArr2.length];
            int length2 = iArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                numArr2[i2] = Integer.valueOf(iArr2[i2]);
            }
        }
        return wx0.b(numArr, numArr2);
    }

    @Override // defpackage.c48
    public final int[] h() {
        return new int[0];
    }

    @Override // defpackage.c48
    public final List i(int[] iArr) {
        List<Integer> listQ;
        int[] iArr2 = iArr;
        if (iArr2 == null || (listQ = ay0.Q(iArr2)) == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(listQ, 10));
        Iterator<T> it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
