package f0;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.G5;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n+ 3 CollectionPlatformUtils.jvm.kt\nandroidx/collection/CollectionPlatformUtils\n*L\n1#1,263:1\n250#2,9:264\n263#2,5:273\n271#2,5:278\n279#2,7:283\n294#2,9:290\n327#2,30:299\n360#2,2:329\n327#2,37:331\n367#2,3:368\n327#2,30:371\n371#2:401\n376#2,4:402\n383#2:406\n387#2,4:407\n395#2,5:411\n401#2:417\n406#2,5:418\n414#2,4:423\n422#2,9:427\n435#2:436\n440#2:437\n422#2,9:438\n445#2,8:447\n456#2,17:455\n476#2,21:472\n24#3:416\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n123#1:264,9\n126#1:273,5\n135#1:278,5\n144#1:283,7\n155#1:290,9\n161#1:299,30\n168#1:329,2\n168#1:331,37\n179#1:368,3\n179#1:371,30\n179#1:401\n182#1:402,4\n198#1:406\n204#1:407,4\n210#1:411,5\n210#1:417\n216#1:418,5\n226#1:423,4\n238#1:427,9\n241#1:436\n244#1:437\n244#1:438,9\n247#1:447,8\n253#1:455,17\n261#1:472,21\n210#1:416\n*E\n"})
public class m3<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public /* synthetic */ boolean f82036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public /* synthetic */ int[] f82037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public /* synthetic */ Object[] f82038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @cs.g
    public /* synthetic */ int f82039e;

    @cs.k
    public m3() {
        this(0, 1, null);
    }

    public void a(int i10, E e10) {
        int i11 = this.f82039e;
        if (i11 != 0 && i10 <= this.f82037c[i11 - 1]) {
            o(i10, e10);
            return;
        }
        if (this.f82036b && i11 >= this.f82037c.length) {
            n3.z(this);
        }
        int i12 = this.f82039e;
        if (i12 >= this.f82037c.length) {
            int iE = g0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f82037c, iE);
            kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
            this.f82037c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f82038d, iE);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f82038d = objArrCopyOf;
        }
        this.f82037c[i12] = i10;
        this.f82038d[i12] = e10;
        this.f82039e = i12 + 1;
    }

    public void b() {
        int i10 = this.f82039e;
        Object[] objArr = this.f82038d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f82039e = 0;
        this.f82036b = false;
    }

    @oy.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m3<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m0.n(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m3<E> m3Var = (m3) objClone;
        m3Var.f82037c = (int[]) this.f82037c.clone();
        m3Var.f82038d = (Object[]) this.f82038d.clone();
        return m3Var;
    }

    public boolean d(int i10) {
        return k(i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001c A[RETURN] */
    public boolean e(E e10) {
        if (this.f82036b) {
            n3.z(this);
        }
        int i10 = this.f82039e;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f82038d[i11] == e10) {
                if (i11 >= 0) {
                    return true;
                }
                return false;
            }
            i11++;
        }
        i11 = -1;
        if (i11 >= 0) {
            return true;
        }
        return false;
    }

    @dr.o(message = "Alias for remove(int).", replaceWith = @dr.g1(expression = "remove(key)", imports = {}))
    public void f(int i10) {
        r(i10);
    }

    @oy.m
    public E g(int i10) {
        return (E) n3.g(this, i10);
    }

    public E i(int i10, E e10) {
        return (E) n3.h(this, i10, e10);
    }

    @cs.j(name = "getIsEmpty")
    public final boolean j() {
        return m();
    }

    public int k(int i10) {
        if (this.f82036b) {
            n3.z(this);
        }
        return g0.a.a(this.f82037c, this.f82039e, i10);
    }

    public int l(E e10) {
        if (this.f82036b) {
            n3.z(this);
        }
        int i10 = this.f82039e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f82038d[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean m() {
        return y() == 0;
    }

    public int n(int i10) {
        if (this.f82036b) {
            n3.z(this);
        }
        return this.f82037c[i10];
    }

    public void o(int i10, E e10) {
        int iA = g0.a.a(this.f82037c, this.f82039e, i10);
        if (iA >= 0) {
            this.f82038d[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f82039e && this.f82038d[i11] == n3.f82051a) {
            this.f82037c[i11] = i10;
            this.f82038d[i11] = e10;
            return;
        }
        if (this.f82036b && this.f82039e >= this.f82037c.length) {
            n3.z(this);
            i11 = ~g0.a.a(this.f82037c, this.f82039e, i10);
        }
        int i12 = this.f82039e;
        if (i12 >= this.f82037c.length) {
            int iE = g0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f82037c, iE);
            kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
            this.f82037c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f82038d, iE);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f82038d = objArrCopyOf;
        }
        int i13 = this.f82039e;
        if (i13 - i11 != 0) {
            int[] iArr = this.f82037c;
            int i14 = i11 + 1;
            fr.q.z0(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f82038d;
            fr.q.B0(objArr, objArr, i14, i11, this.f82039e);
        }
        this.f82037c[i11] = i10;
        this.f82038d[i11] = e10;
        this.f82039e++;
    }

    public void p(@oy.l m3<? extends E> other) {
        kotlin.jvm.internal.m0.p(other, "other");
        int iY = other.y();
        for (int i10 = 0; i10 < iY; i10++) {
            int iN = other.n(i10);
            E eZ = other.z(i10);
            int iA = g0.a.a(this.f82037c, this.f82039e, iN);
            if (iA >= 0) {
                this.f82038d[iA] = eZ;
            } else {
                int i11 = ~iA;
                if (i11 >= this.f82039e || this.f82038d[i11] != n3.f82051a) {
                    if (this.f82036b && this.f82039e >= this.f82037c.length) {
                        n3.z(this);
                        i11 = ~g0.a.a(this.f82037c, this.f82039e, iN);
                    }
                    int i12 = this.f82039e;
                    if (i12 >= this.f82037c.length) {
                        int iE = g0.a.e(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f82037c, iE);
                        kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
                        this.f82037c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f82038d, iE);
                        kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
                        this.f82038d = objArrCopyOf;
                    }
                    int i13 = this.f82039e;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.f82037c;
                        int i14 = i11 + 1;
                        fr.q.z0(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.f82038d;
                        fr.q.B0(objArr, objArr, i14, i11, this.f82039e);
                    }
                    this.f82037c[i11] = iN;
                    this.f82038d[i11] = eZ;
                    this.f82039e++;
                } else {
                    this.f82037c[i11] = iN;
                    this.f82038d[i11] = eZ;
                }
            }
        }
    }

    @oy.m
    public E q(int i10, E e10) {
        E e11 = (E) n3.g(this, i10);
        if (e11 == null) {
            int iA = g0.a.a(this.f82037c, this.f82039e, i10);
            if (iA >= 0) {
                this.f82038d[iA] = e10;
                return e11;
            }
            int i11 = ~iA;
            if (i11 < this.f82039e && this.f82038d[i11] == n3.f82051a) {
                this.f82037c[i11] = i10;
                this.f82038d[i11] = e10;
                return e11;
            }
            if (this.f82036b && this.f82039e >= this.f82037c.length) {
                n3.z(this);
                i11 = ~g0.a.a(this.f82037c, this.f82039e, i10);
            }
            int i12 = this.f82039e;
            if (i12 >= this.f82037c.length) {
                int iE = g0.a.e(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.f82037c, iE);
                kotlin.jvm.internal.m0.o(iArrCopyOf, "copyOf(...)");
                this.f82037c = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f82038d, iE);
                kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
                this.f82038d = objArrCopyOf;
            }
            int i13 = this.f82039e;
            if (i13 - i11 != 0) {
                int[] iArr = this.f82037c;
                int i14 = i11 + 1;
                fr.q.z0(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.f82038d;
                fr.q.B0(objArr, objArr, i14, i11, this.f82039e);
            }
            this.f82037c[i11] = i10;
            this.f82038d[i11] = e10;
            this.f82039e++;
        }
        return e11;
    }

    public void r(int i10) {
        n3.p(this, i10);
    }

    public boolean s(int i10, @oy.m Object obj) {
        int iK = k(i10);
        if (iK < 0 || !kotlin.jvm.internal.m0.g(obj, z(iK))) {
            return false;
        }
        t(iK);
        return true;
    }

    public void t(int i10) {
        if (this.f82038d[i10] != n3.f82051a) {
            this.f82038d[i10] = n3.f82051a;
            this.f82036b = true;
        }
    }

    @oy.l
    public String toString() {
        if (y() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f82039e * 28);
        sb2.append(fw.b.f85382i);
        int i10 = this.f82039e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(n(i11));
            sb2.append(G5.T);
            E eZ = z(i11);
            if (eZ != this) {
                sb2.append(eZ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(fw.b.f85383j);
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public void u(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            t(i10);
            i10++;
        }
    }

    @oy.m
    public E v(int i10, E e10) {
        int iK = k(i10);
        if (iK < 0) {
            return null;
        }
        Object[] objArr = this.f82038d;
        E e11 = (E) objArr[iK];
        objArr[iK] = e10;
        return e11;
    }

    public boolean w(int i10, E e10, E e11) {
        int iK = k(i10);
        if (iK < 0 || !kotlin.jvm.internal.m0.g(this.f82038d[iK], e10)) {
            return false;
        }
        this.f82038d[iK] = e11;
        return true;
    }

    public void x(int i10, E e10) {
        if (this.f82036b) {
            n3.z(this);
        }
        this.f82038d[i10] = e10;
    }

    public int y() {
        if (this.f82036b) {
            n3.z(this);
        }
        return this.f82039e;
    }

    public E z(int i10) {
        if (this.f82036b) {
            n3.z(this);
        }
        Object[] objArr = this.f82038d;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        h hVar = h.f81919a;
        throw new ArrayIndexOutOfBoundsException();
    }

    @cs.k
    public m3(int i10) {
        if (i10 == 0) {
            this.f82037c = g0.a.f85758a;
            this.f82038d = g0.a.f85760c;
        } else {
            int iE = g0.a.e(i10);
            this.f82037c = new int[iE];
            this.f82038d = new Object[iE];
        }
    }

    public /* synthetic */ m3(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
