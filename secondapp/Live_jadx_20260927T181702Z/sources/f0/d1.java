package f0;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.G5;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n*L\n1#1,243:1\n218#2:244\n229#2,5:245\n223#2,11:250\n239#2,8:261\n239#2,8:269\n250#2,9:277\n263#2,5:286\n271#2,7:291\n286#2,9:298\n320#2,12:307\n299#2,18:319\n334#2,21:337\n358#2,2:358\n360#2:361\n364#2,5:362\n373#2,2:367\n299#2,18:369\n376#2:387\n380#2:388\n384#2:389\n385#2:393\n388#2,2:395\n299#2,18:397\n391#2:415\n396#2:416\n397#2:420\n400#2,2:422\n299#2,18:424\n404#2:442\n409#2:443\n410#2:447\n413#2,2:449\n299#2,18:451\n416#2,2:469\n421#2,2:471\n299#2,18:473\n424#2:491\n429#2,2:492\n299#2,18:494\n432#2,6:512\n442#2:518\n447#2:519\n452#2,8:520\n463#2,6:528\n299#2,18:534\n470#2,10:552\n483#2,21:562\n1#3:360\n59#4,3:390\n63#4:394\n59#4,3:417\n63#4:421\n59#4,3:444\n63#4:448\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n92#1:244\n92#1:245,5\n99#1:250,11\n103#1:261,8\n106#1:269,8\n115#1:277,9\n118#1:286,5\n127#1:291,7\n138#1:298,9\n144#1:307,12\n144#1:319,18\n144#1:337,21\n150#1:358,2\n150#1:361\n161#1:362,5\n164#1:367,2\n164#1:369,18\n164#1:387\n171#1:388\n183#1:389\n183#1:393\n183#1:395,2\n183#1:397,18\n183#1:415\n195#1:416\n195#1:420\n195#1:422,2\n195#1:424,18\n195#1:442\n203#1:443\n203#1:447\n203#1:449,2\n203#1:451,18\n203#1:469,2\n209#1:471,2\n209#1:473,18\n209#1:491\n218#1:492,2\n218#1:494,18\n218#1:512,6\n221#1:518\n224#1:519\n227#1:520,8\n233#1:528,6\n233#1:534,18\n233#1:552,10\n241#1:562,21\n150#1:360\n183#1:390,3\n183#1:394\n195#1:417,3\n195#1:421\n203#1:444,3\n203#1:448\n*E\n"})
public class d1<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public /* synthetic */ boolean f81855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public /* synthetic */ long[] f81856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public /* synthetic */ Object[] f81857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @cs.g
    public /* synthetic */ int f81858e;

    @cs.k
    public d1() {
        this(0, 1, null);
    }

    public void a(long j10, E e10) {
        int i10 = this.f81858e;
        if (i10 != 0 && j10 <= this.f81856c[i10 - 1]) {
            n(j10, e10);
            return;
        }
        if (this.f81855b) {
            long[] jArr = this.f81856c;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f81857d;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != e1.f81871a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f81855b = false;
                this.f81858e = i11;
            }
        }
        int i13 = this.f81858e;
        if (i13 >= this.f81856c.length) {
            int iF = g0.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f81856c, iF);
            kotlin.jvm.internal.m0.o(jArrCopyOf, "copyOf(...)");
            this.f81856c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f81857d, iF);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f81857d = objArrCopyOf;
        }
        this.f81856c[i13] = j10;
        this.f81857d[i13] = e10;
        this.f81858e = i13 + 1;
    }

    public void b() {
        int i10 = this.f81858e;
        Object[] objArr = this.f81857d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f81858e = 0;
        this.f81855b = false;
    }

    @oy.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d1<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.m0.n(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        d1<E> d1Var = (d1) objClone;
        d1Var.f81856c = (long[]) this.f81856c.clone();
        d1Var.f81857d = (Object[]) this.f81857d.clone();
        return d1Var;
    }

    public boolean d(long j10) {
        return j(j10) >= 0;
    }

    public boolean e(E e10) {
        return k(e10) >= 0;
    }

    @dr.o(message = "Alias for `remove(key)`.", replaceWith = @dr.g1(expression = "remove(key)", imports = {}))
    public void f(long j10) {
        int iB = g0.a.b(this.f81856c, this.f81858e, j10);
        if (iB < 0 || this.f81857d[iB] == e1.f81871a) {
            return;
        }
        this.f81857d[iB] = e1.f81871a;
        this.f81855b = true;
    }

    @oy.m
    public E g(long j10) {
        int iB = g0.a.b(this.f81856c, this.f81858e, j10);
        if (iB < 0 || this.f81857d[iB] == e1.f81871a) {
            return null;
        }
        return (E) this.f81857d[iB];
    }

    public E i(long j10, E e10) {
        int iB = g0.a.b(this.f81856c, this.f81858e, j10);
        return (iB < 0 || this.f81857d[iB] == e1.f81871a) ? e10 : (E) this.f81857d[iB];
    }

    public int j(long j10) {
        if (this.f81855b) {
            int i10 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != e1.f81871a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f81855b = false;
            this.f81858e = i11;
        }
        return g0.a.b(this.f81856c, this.f81858e, j10);
    }

    public int k(E e10) {
        if (this.f81855b) {
            int i10 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != e1.f81871a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f81855b = false;
            this.f81858e = i11;
        }
        int i13 = this.f81858e;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f81857d[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public boolean l() {
        return w() == 0;
    }

    public long m(int i10) {
        if (!(i10 >= 0 && i10 < this.f81858e)) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f81855b) {
            int i11 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != e1.f81871a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f81855b = false;
            this.f81858e = i12;
        }
        return this.f81856c[i10];
    }

    public void n(long j10, E e10) {
        int iB = g0.a.b(this.f81856c, this.f81858e, j10);
        if (iB >= 0) {
            this.f81857d[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f81858e && this.f81857d[i10] == e1.f81871a) {
            this.f81856c[i10] = j10;
            this.f81857d[i10] = e10;
            return;
        }
        if (this.f81855b) {
            int i11 = this.f81858e;
            long[] jArr = this.f81856c;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f81857d;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != e1.f81871a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f81855b = false;
                this.f81858e = i12;
                i10 = ~g0.a.b(this.f81856c, i12, j10);
            }
        }
        int i14 = this.f81858e;
        if (i14 >= this.f81856c.length) {
            int iF = g0.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f81856c, iF);
            kotlin.jvm.internal.m0.o(jArrCopyOf, "copyOf(...)");
            this.f81856c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f81857d, iF);
            kotlin.jvm.internal.m0.o(objArrCopyOf, "copyOf(...)");
            this.f81857d = objArrCopyOf;
        }
        int i15 = this.f81858e;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f81856c;
            int i16 = i10 + 1;
            fr.q.A0(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f81857d;
            fr.q.B0(objArr2, objArr2, i16, i10, this.f81858e);
        }
        this.f81856c[i10] = j10;
        this.f81857d[i10] = e10;
        this.f81858e++;
    }

    public void o(@oy.l d1<? extends E> other) {
        kotlin.jvm.internal.m0.p(other, "other");
        int iW = other.w();
        for (int i10 = 0; i10 < iW; i10++) {
            n(other.m(i10), other.x(i10));
        }
    }

    @oy.m
    public E p(long j10, E e10) {
        E eG = g(j10);
        if (eG == null) {
            n(j10, e10);
        }
        return eG;
    }

    public void q(long j10) {
        int iB = g0.a.b(this.f81856c, this.f81858e, j10);
        if (iB < 0 || this.f81857d[iB] == e1.f81871a) {
            return;
        }
        this.f81857d[iB] = e1.f81871a;
        this.f81855b = true;
    }

    public boolean r(long j10, E e10) {
        int iJ = j(j10);
        if (iJ < 0 || !kotlin.jvm.internal.m0.g(e10, x(iJ))) {
            return false;
        }
        s(iJ);
        return true;
    }

    public void s(int i10) {
        if (this.f81857d[i10] != e1.f81871a) {
            this.f81857d[i10] = e1.f81871a;
            this.f81855b = true;
        }
    }

    @oy.m
    public E t(long j10, E e10) {
        int iJ = j(j10);
        if (iJ < 0) {
            return null;
        }
        Object[] objArr = this.f81857d;
        E e11 = (E) objArr[iJ];
        objArr[iJ] = e10;
        return e11;
    }

    @oy.l
    public String toString() {
        if (w() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f81858e * 28);
        sb2.append(fw.b.f85382i);
        int i10 = this.f81858e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append(G5.T);
            E eX = x(i11);
            if (eX != sb2) {
                sb2.append(eX);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(fw.b.f85383j);
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public boolean u(long j10, E e10, E e11) {
        int iJ = j(j10);
        if (iJ < 0 || !kotlin.jvm.internal.m0.g(this.f81857d[iJ], e10)) {
            return false;
        }
        this.f81857d[iJ] = e11;
        return true;
    }

    public void v(int i10, E e10) {
        if (!(i10 >= 0 && i10 < this.f81858e)) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f81855b) {
            int i11 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != e1.f81871a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f81855b = false;
            this.f81858e = i12;
        }
        this.f81857d[i10] = e10;
    }

    public int w() {
        if (this.f81855b) {
            int i10 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != e1.f81871a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f81855b = false;
            this.f81858e = i11;
        }
        return this.f81858e;
    }

    public E x(int i10) {
        if (!(i10 >= 0 && i10 < this.f81858e)) {
            g0.f.c("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f81855b) {
            int i11 = this.f81858e;
            long[] jArr = this.f81856c;
            Object[] objArr = this.f81857d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != e1.f81871a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f81855b = false;
            this.f81858e = i12;
        }
        return (E) this.f81857d[i10];
    }

    @cs.k
    public d1(int i10) {
        if (i10 == 0) {
            this.f81856c = g0.a.f85759b;
            this.f81857d = g0.a.f85760c;
        } else {
            int iF = g0.a.f(i10);
            this.f81856c = new long[iF];
            this.f81857d = new Object[iF];
        }
    }

    public /* synthetic */ d1(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
