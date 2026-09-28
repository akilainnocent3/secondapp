package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class ynz<T> implements mi10<T> {
    public static final ynz<Object> e = new ynz<>(xmz.b.g);
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    public ynz(int i, int i2, List list) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((msg0) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.mi10
    public final int a() {
        return this.c + this.b + this.d;
    }

    @Override // defpackage.mi10
    public final int b() {
        return this.b;
    }

    public final qai0.a c(int i) {
        ArrayList arrayList;
        int iIntValue = i - this.c;
        int i2 = 0;
        while (true) {
            arrayList = this.a;
            if (iIntValue < ((msg0) arrayList.get(i2)).b.size() || i2 >= b.j(arrayList)) {
                break;
            }
            iIntValue -= ((msg0) arrayList.get(i2)).b.size();
            i2++;
        }
        msg0 msg0Var = (msg0) arrayList.get(i2);
        int i3 = i - this.c;
        int iA = ((a() - i) - this.d) - 1;
        int iG = g();
        int iH = h();
        int i4 = msg0Var.c;
        List<Integer> list = msg0Var.d;
        if (list != null && b.i(list).e(iIntValue)) {
            iIntValue = list.get(iIntValue).intValue();
        }
        return new qai0.a(i4, iIntValue, i3, iA, iG, iH);
    }

    @Override // defpackage.mi10
    public final int d() {
        return this.c;
    }

    public final T e(int i) {
        if (i < 0 || i >= a()) {
            ks40.a(a(), efe0.a(i, "Index: ", ", Size: "));
            return null;
        }
        int i2 = i - this.c;
        if (i2 < 0 || i2 >= this.b) {
            return null;
        }
        return getItem(i2);
    }

    @Override // defpackage.mi10
    public final int f() {
        return this.d;
    }

    public final int g() {
        Integer numValueOf;
        int[] iArr = ((msg0) CollectionsKt.T(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // defpackage.mi10
    public final T getItem(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((msg0) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((msg0) arrayList.get(i2)).b.get(i);
    }

    public final int h() {
        Integer numValueOf;
        int[] iArr = ((msg0) CollectionsKt.b0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final qqz<T> i(xmz<T> xmzVar) {
        xmzVar.getClass();
        boolean z = xmzVar instanceof xmz.b;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(xmzVar instanceof xmz.a)) {
                ib5.a("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            xmz.a aVar = (xmz.a) xmzVar;
            int i = aVar.b;
            int i2 = aVar.d;
            IntRange intRange = new IntRange(i, aVar.c, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                msg0 msg0Var = (msg0) it.next();
                for (int i3 : msg0Var.a) {
                    if (intRange.e(i3)) {
                        size += msg0Var.b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i4 = this.b - size;
            this.b = i4;
            if (aVar.a == kxs.b) {
                int i5 = this.c;
                this.c = i2;
                return new qqz.c(size, i2, i5);
            }
            int i6 = this.d;
            this.d = i2;
            return new qqz.b(this.c + i4, size, i2, i6);
        }
        xmz.b bVar = (xmz.b) xmzVar;
        List<msg0<T>> list = bVar.b;
        Iterator<T> it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((msg0) it2.next()).b.size();
        }
        int iOrdinal = bVar.a.ordinal();
        if (iOrdinal == 0) {
            ib5.a("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (iOrdinal == 1) {
            int i7 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = bVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                p48.w(((msg0) it3.next()).b, arrayList2);
            }
            return new qqz.d(arrayList2, this.c, i7);
        }
        if (iOrdinal != 2) {
            uhc.a();
            return null;
        }
        int i8 = this.d;
        int i9 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = bVar.d;
        int i10 = this.c + i9;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            p48.w(((msg0) it4.next()).b, arrayList3);
        }
        return new qqz.a(i10, this.d, i8, arrayList3);
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(getItem(i2));
        }
        String strA0 = CollectionsKt.a0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        f78.b(this.c, " placeholders), ", strA0, ", (", sb);
        return zk1.a(this.d, " placeholders)]", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ynz(xmz.b<T> bVar) {
        this(bVar.c, bVar.d, bVar.b);
        bVar.getClass();
    }
}
