package f0;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,283:1\n288#2,10:284\n301#2,14:294\n318#2:308\n323#2:309\n328#2:310\n333#2:311\n338#2,61:312\n403#2,17:373\n423#2,6:390\n433#2,60:396\n501#2,9:456\n514#2,22:465\n540#2,7:487\n551#2,19:494\n574#2,6:513\n584#2,6:519\n594#2,5:525\n603#2,8:530\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n89#1:284,10\n98#1:294,14\n108#1:308\n118#1:309\n128#1:310\n133#1:311\n145#1:312,61\n155#1:373,17\n165#1:390,6\n176#1:396,60\n185#1:456,9\n210#1:465,22\n215#1:487,7\n223#1:494,19\n250#1:513,6\n259#1:519,6\n269#1:525,5\n280#1:530,8\n*E\n"})
public final class c<E> implements Collection<E>, Set<E>, es.b, es.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public int[] f81842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public Object[] f81843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81844d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a extends b0<E> {
        public a() {
            super(c.this.h());
        }

        @Override // f0.b0
        public E a(int i10) {
            return c.this.p(i10);
        }

        @Override // f0.b0
        public void b(int i10) {
            c.this.j(i10);
        }
    }

    @cs.k
    public c() {
        this(0, 1, null);
    }

    public final void a(@oy.l c<? extends E> array) {
        kotlin.jvm.internal.m0.p(array, "array");
        int iH = array.h();
        d(h() + iH);
        if (h() != 0) {
            for (int i10 = 0; i10 < iH; i10++) {
                add(array.p(i10));
            }
            return;
        }
        if (iH > 0) {
            fr.q.I0(array.f(), f(), 0, 0, iH, 6, null);
            fr.q.K0(array.e(), e(), 0, 0, iH, 6, null);
            if (h() != 0) {
                throw new ConcurrentModificationException();
            }
            n(iH);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iN;
        int iH = h();
        if (e10 == null) {
            iN = e.p(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = e.n(this, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i11 = ~iN;
        if (iH >= f().length) {
            int i12 = 8;
            if (iH >= 8) {
                i12 = (iH >> 1) + iH;
            } else if (iH < 4) {
                i12 = 4;
            }
            int[] iArrF = f();
            Object[] objArrE = e();
            e.d(this, i12);
            if (iH != h()) {
                throw new ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                fr.q.I0(iArrF, f(), 0, 0, iArrF.length, 6, null);
                fr.q.K0(objArrE, e(), 0, 0, objArrE.length, 6, null);
            }
        }
        if (i11 < iH) {
            int i13 = i11 + 1;
            fr.q.z0(f(), f(), i13, i11, iH);
            fr.q.B0(e(), e(), i13, i11, iH);
        }
        if (iH != h() || i11 >= f().length) {
            throw new ConcurrentModificationException();
        }
        f()[i11] = i10;
        e()[i11] = e10;
        n(h() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@oy.l Collection<? extends E> elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        d(h() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (h() != 0) {
            m(g0.a.f85758a);
            l(g0.a.f85760c);
            n(0);
        }
        if (h() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@oy.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i10) {
        int iH = h();
        if (f().length < i10) {
            int[] iArrF = f();
            Object[] objArrE = e();
            e.d(this, i10);
            if (h() > 0) {
                fr.q.I0(iArrF, f(), 0, 0, h(), 6, null);
                fr.q.K0(objArrE, e(), 0, 0, h(), 6, null);
            }
        }
        if (h() != iH) {
            throw new ConcurrentModificationException();
        }
    }

    @oy.l
    public final Object[] e() {
        return this.f81843c;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iH = h();
            for (int i10 = 0; i10 < iH; i10++) {
                if (!((Set) obj).contains(p(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @oy.l
    public final int[] f() {
        return this.f81842b;
    }

    public int g() {
        return this.f81844d;
    }

    public final int h() {
        return this.f81844d;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrF = f();
        int iH = h();
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            i10 += iArrF[i11];
        }
        return i10;
    }

    public final boolean i(@oy.l c<? extends E> array) {
        kotlin.jvm.internal.m0.p(array, "array");
        int iH = array.h();
        int iH2 = h();
        for (int i10 = 0; i10 < iH; i10++) {
            remove(array.p(i10));
        }
        return iH2 != h();
    }

    public final int indexOf(@oy.m Object obj) {
        return obj == null ? e.p(this) : e.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return h() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @oy.l
    public Iterator<E> iterator() {
        return new a();
    }

    public final E j(int i10) {
        int i11;
        Object[] objArr;
        int iH = h();
        E e10 = (E) e()[i10];
        if (iH <= 1) {
            clear();
            return e10;
        }
        int i12 = iH - 1;
        if (f().length <= 8 || h() >= f().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                fr.q.z0(f(), f(), i10, i13, iH);
                fr.q.B0(e(), e(), i10, i13, iH);
            }
            e()[i12] = null;
        } else {
            int iH2 = h() > 8 ? h() + (h() >> 1) : 8;
            int[] iArrF = f();
            Object[] objArrE = e();
            e.d(this, iH2);
            if (i10 > 0) {
                fr.q.I0(iArrF, f(), 0, 0, i10, 6, null);
                objArr = objArrE;
                fr.q.K0(objArr, e(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrE;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                fr.q.z0(iArrF, f(), i11, i14, iH);
                fr.q.B0(objArr, e(), i11, i14, iH);
            }
        }
        if (iH != h()) {
            throw new ConcurrentModificationException();
        }
        n(i12);
        return e10;
    }

    public final void l(@oy.l Object[] objArr) {
        kotlin.jvm.internal.m0.p(objArr, "<set-?>");
        this.f81843c = objArr;
    }

    public final void m(@oy.l int[] iArr) {
        kotlin.jvm.internal.m0.p(iArr, "<set-?>");
        this.f81842b = iArr;
    }

    public final void n(int i10) {
        this.f81844d = i10;
    }

    public final E p(int i10) {
        return (E) e()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@oy.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@oy.l Collection<? extends Object> elements) {
        kotlin.jvm.internal.m0.p(elements, "elements");
        boolean z10 = false;
        for (int iH = h() - 1; -1 < iH; iH--) {
            if (!fr.r0.a2(elements, e()[iH])) {
                j(iH);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    @oy.l
    public final Object[] toArray() {
        return fr.q.l1(this.f81843c, 0, this.f81844d);
    }

    @oy.l
    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(h() * 14);
        sb2.append(fw.b.f85382i);
        int iH = h();
        for (int i10 = 0; i10 < iH; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eP = p(i10);
            if (eP != this) {
                sb2.append(eP);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(fw.b.f85383j);
        String string = sb2.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    @cs.k
    public c(int i10) {
        this.f81842b = g0.a.f85758a;
        this.f81843c = g0.a.f85760c;
        if (i10 > 0) {
            e.d(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @oy.l
    public final <T> T[] toArray(@oy.l T[] array) {
        kotlin.jvm.internal.m0.p(array, "array");
        T[] tArr = (T[]) d.a(array, this.f81844d);
        fr.q.B0(this.f81843c, tArr, 0, 0, this.f81844d);
        kotlin.jvm.internal.m0.m(tArr);
        return tArr;
    }

    public /* synthetic */ c(int i10, int i11, kotlin.jvm.internal.x xVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public c(@oy.m c<? extends E> cVar) {
        this(0);
        if (cVar != null) {
            a(cVar);
        }
    }

    public c(@oy.m Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@oy.m E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator itA = kotlin.jvm.internal.i.a(eArr);
            while (itA.hasNext()) {
                add(itA.next());
            }
        }
    }
}
