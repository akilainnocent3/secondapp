package f0;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.G5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n299#1,5:762\n299#1,5:767\n59#2,5:772\n59#2,5:777\n59#2,5:782\n59#2,5:788\n1#3:787\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n278#1:762,5\n294#1:767,5\n315#1:772,5\n330#1:777,5\n346#1:782,5\n512#1:788,5\n*E\n"})
public class k3<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public int[] f81999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public Object[] f82000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82001d;

    @cs.k
    public k3() {
        this(0, 1, null);
    }

    @cs.j(name = "__restricted$indexOfValue")
    public final int a(V v10) {
        int i10 = this.f82001d * 2;
        Object[] objArr = this.f82000c;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (kotlin.jvm.internal.m0.g(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f82001d;
        int[] iArr = this.f81999b;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
            this.f81999b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f82000c, i10 * 2);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f82000c = objArrCopyOf;
        }
        if (this.f82001d != i11) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V> T c(Object obj, T t10) {
        int iE = e(obj);
        return iE >= 0 ? (T) this.f82000c[(iE << 1) + 1] : t10;
    }

    public void clear() {
        if (this.f82001d > 0) {
            this.f81999b = g0.a.f85758a;
            this.f82000c = g0.a.f85760c;
            this.f82001d = 0;
        }
        if (this.f82001d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public final int d(K k10, int i10) {
        int i11 = this.f82001d;
        if (i11 == 0) {
            return -1;
        }
        int iA = g0.a.a(this.f81999b, i11, i10);
        if (iA < 0 || kotlin.jvm.internal.m0.g(k10, this.f82000c[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f81999b[i12] == i10) {
            if (kotlin.jvm.internal.m0.g(k10, this.f82000c[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f81999b[i13] == i10; i13--) {
            if (kotlin.jvm.internal.m0.g(k10, this.f82000c[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public int e(K k10) {
        return k10 == null ? f() : d(k10, k10.hashCode());
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k3) {
                if (size() != ((k3) obj).size()) {
                    return false;
                }
                k3 k3Var = (k3) obj;
                int i10 = this.f82001d;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vL = l(i11);
                    Object obj2 = k3Var.get(kG);
                    if (vL == null) {
                        if (obj2 != null || !k3Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.m0.g(vL, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f82001d;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vL2 = l(i13);
                Object obj3 = ((Map) obj).get(kG2);
                if (vL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.m0.g(vL2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.f82001d;
        if (i10 == 0) {
            return -1;
        }
        int iA = g0.a.a(this.f81999b, i10, 0);
        if (iA < 0 || this.f82000c[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f81999b[i11] == 0) {
            if (this.f82000c[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f81999b[i12] == 0; i12--) {
            if (this.f82000c[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public K g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f82001d) {
            z10 = true;
        }
        if (!z10) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (K) this.f82000c[i10 << 1];
    }

    @oy.m
    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f82000c[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@oy.m Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f82000c[(iE << 1) + 1] : v10;
    }

    public void h(@oy.l k3<? extends K, ? extends V> map) {
        kotlin.jvm.internal.m0.p(map, "map");
        int i10 = map.f82001d;
        b(this.f82001d + i10);
        if (this.f82001d != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.g(i11), map.l(i11));
            }
        } else if (i10 > 0) {
            fr.q.z0(map.f81999b, this.f81999b, 0, 0, i10);
            fr.q.B0(map.f82000c, this.f82000c, 0, 0, i10 << 1);
            this.f82001d = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f81999b;
        Object[] objArr = this.f82000c;
        int i10 = this.f82001d;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f82001d <= 0;
    }

    public V j(int i10) {
        if (!(i10 >= 0 && i10 < this.f82001d)) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f82000c;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f82001d;
        if (i12 <= 1) {
            clear();
            return v10;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f81999b;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                fr.q.z0(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f82000c;
                fr.q.B0(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f82000c;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
            this.f81999b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f82000c, i16 << 1);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f82000c = objArrCopyOf;
            if (i12 != this.f82001d) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                fr.q.z0(iArr, this.f81999b, 0, 0, i10);
                fr.q.B0(objArr, this.f82000c, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                fr.q.z0(iArr, this.f81999b, i10, i17, i12);
                fr.q.B0(objArr, this.f82000c, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f82001d) {
            throw new ConcurrentModificationException();
        }
        this.f82001d = i13;
        return v10;
    }

    public V k(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f82001d) {
            z10 = true;
        }
        if (!z10) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f82000c;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f82001d) {
            z10 = true;
        }
        if (!z10) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        return (V) this.f82000c[(i10 << 1) + 1];
    }

    @oy.m
    public V put(K k10, V v10) {
        int i10 = this.f82001d;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iD = k10 != null ? d(k10, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f82000c;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iD;
        int[] iArr = this.f81999b;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
            this.f81999b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f82000c, i13 << 1);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f82000c = objArrCopyOf;
            if (i10 != this.f82001d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f81999b;
            int i14 = i12 + 1;
            fr.q.z0(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f82000c;
            fr.q.B0(objArr2, objArr2, i14 << 1, i12 << 1, this.f82001d << 1);
        }
        int i15 = this.f82001d;
        if (i10 == i15) {
            int[] iArr3 = this.f81999b;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f82000c;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f82001d = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @oy.m
    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    @oy.m
    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return j(iE);
        }
        return null;
    }

    @oy.m
    public V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return k(iE, v10);
        }
        return null;
    }

    public int size() {
        return this.f82001d;
    }

    @oy.l
    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f82001d * 28);
        sb2.append(fw.b.f85382i);
        int i10 = this.f82001d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != sb2) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(G5.T);
            V vL = l(i11);
            if (vL != sb2) {
                sb2.append(vL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(fw.b.f85383j);
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.k
    public k3(int i10) {
        this.f81999b = i10 == 0 ? g0.a.f85758a : new int[i10];
        this.f82000c = i10 == 0 ? g0.a.f85760c : new Object[i10 << 1];
    }

    public boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.m0.g(v10, l(iE))) {
            return false;
        }
        j(iE);
        return true;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !kotlin.jvm.internal.m0.g(v10, l(iE))) {
            return false;
        }
        k(iE, v11);
        return true;
    }

    public /* synthetic */ k3(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public k3(@oy.m k3<? extends K, ? extends V> k3Var) {
        this(0, 1, null);
        if (k3Var != null) {
            h(k3Var);
        }
    }
}
