package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class ay0 extends xx0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes8.dex */
    public static final class a<T> implements Sequence<T> {
        public final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public final Iterator<T> iterator() {
            return ix0.a(this.a);
        }
    }

    public static <T> int A(T[] tArr) {
        tArr.getClass();
        return tArr.length - 1;
    }

    public static Float B(float[] fArr, int i) {
        fArr.getClass();
        if (i < 0 || i >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i]);
    }

    public static Object C(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int D(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int E(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static String F(String str, char[] cArr) {
        cArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (char c : cArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            sb.append(c);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String G(Object[] objArr, String str, String str2, String str3, yw40 yw40Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            yw40Var = null;
        }
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            oae0.a(sb, obj, yw40Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static <T> T H(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        ibh0.a("Array is empty.");
        return null;
    }

    public static int I(Object obj, Object[] objArr) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Float J(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static int K(int[] iArr, lx30.Companion aVar) {
        aVar.getClass();
        if (iArr.length != 0) {
            return iArr[lx30.b.f(iArr.length)];
        }
        ibh0.a("Array is empty.");
        return 0;
    }

    public static char L(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            ibh0.a("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        hb5.a("Array has more than one element.");
        return (char) 0;
    }

    public static final void M(Object[] objArr, LinkedHashSet linkedHashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List<Character> N(char[] cArr) {
        cArr.getClass();
        int length = cArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static List<Double> O(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List<Float> P(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List<Integer> Q(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return m2g.a;
        }
        int iA = 0;
        if (length == 1) {
            return kotlin.collections.a.c(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int length2 = iArr.length;
        while (iA < length2) {
            iA = ndv.a(iArr[iA], iA, 1, arrayList);
        }
        return arrayList;
    }

    public static List<Long> R(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static <T> List<T> S(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(tArr[0]);
        }
        List<T> listAsList = Arrays.asList(Arrays.copyOf(tArr, tArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static List<Boolean> T(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return m2g.a;
        }
        if (length == 1) {
            return kotlin.collections.a.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static ArrayList U(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new tw0(objArr, false));
    }

    public static <T> Set<T> V(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return t3g.a;
        }
        if (length == 1) {
            return wi80.b(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(jpu.a(tArr.length));
        M(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Sequence<T> r(T[] tArr) {
        tArr.getClass();
        return tArr.length == 0 ? s3g.a : new a(tArr);
    }

    public static boolean s(Object obj, Object[] objArr) {
        objArr.getClass();
        return D(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean t(char[] cArr, char c) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static List u(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            kb5.a(pe4.b(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return m2g.a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return S(objArr);
        }
        return length == 1 ? kotlin.collections.a.c(objArr[length2 - 1]) : xx0.c(xx0.k(length2 - length, length2, objArr));
    }

    public static ArrayList v(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T w(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[0];
        }
        ibh0.a("Array is empty.");
        return null;
    }

    public static Float x(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static IntRange y(int[] iArr) {
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static int z(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }
}
