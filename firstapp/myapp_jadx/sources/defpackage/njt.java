package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class njt extends c48<long[]> {
    public static long[] j(String str) {
        str.getClass();
        return new long[]{((Number) djx.f.h(str)).longValue()};
    }

    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        if (!bundle.containsKey(str) || hv60.f(str, bundle)) {
            return null;
        }
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        s5b.a(str);
        throw null;
    }

    @Override // defpackage.djx
    public final String b() {
        return "long[]";
    }

    @Override // defpackage.djx
    public final Object c(Object obj, String str) {
        long[] jArr = (long[]) obj;
        long[] jArrJ = j(str);
        if (jArr == null) {
            return jArrJ;
        }
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrJ, 0, jArrCopyOf, length, 1);
        return jArrCopyOf;
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.djx
    public final boolean g(Object obj, Object obj2) {
        Long[] lArr;
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        Long[] lArr2 = null;
        if (jArr != null) {
            lArr = new Long[jArr.length];
            int length = jArr.length;
            for (int i = 0; i < length; i++) {
                lArr[i] = Long.valueOf(jArr[i]);
            }
        } else {
            lArr = null;
        }
        if (jArr2 != null) {
            lArr2 = new Long[jArr2.length];
            int length2 = jArr2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                lArr2[i2] = Long.valueOf(jArr2[i2]);
            }
        }
        return wx0.b(lArr, lArr2);
    }

    @Override // defpackage.c48
    public final long[] h() {
        return new long[0];
    }

    @Override // defpackage.c48
    public final List i(long[] jArr) {
        List<Long> listR;
        long[] jArr2 = jArr;
        if (jArr2 == null || (listR = ay0.R(jArr2)) == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(listR, 10));
        Iterator<T> it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }
}
