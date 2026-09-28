package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes8.dex */
public final class o78 implements Iterator<List<? extends Integer>>, dhp {
    public final int a;
    public final int b;
    public final int[] c;
    public boolean d;

    public o78(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.d = true;
        if (i < 0 || i2 < 0 || i2 > i) {
            kb5.a(whs.b(i, i2, "Invalid input: n = ", ", k = "));
            throw null;
        }
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
        }
        this.c = iArr;
        if (this.b == 0) {
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [m2g] */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List<Integer> next() {
        ?? arrayList;
        if (!this.d) {
            lrh0.a();
            return null;
        }
        int i = this.b;
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested element count ", " is less than zero."));
            return null;
        }
        boolean z = true;
        int[] iArr = this.c;
        if (i == 0) {
            arrayList = m2g.a;
        } else if (i >= iArr.length) {
            arrayList = ay0.Q(iArr);
        } else if (i == 1) {
            arrayList = a.c(Integer.valueOf(iArr[0]));
        } else {
            arrayList = new ArrayList(i);
            int iA = 0;
            for (int i2 : iArr) {
                iA = ndv.a(i2, iA, 1, arrayList);
                if (iA == i) {
                    break;
                }
            }
        }
        List<Integer> listA0 = CollectionsKt.A0(arrayList);
        int i3 = i - 1;
        while (i3 >= 0 && iArr[i3] == (this.a - i) + i3) {
            i3--;
        }
        if (i3 < 0) {
            z = false;
        } else {
            iArr[i3] = iArr[i3] + 1;
            for (int i4 = i3 + 1; i4 < i; i4++) {
                iArr[i4] = iArr[i4 - 1] + 1;
            }
        }
        this.d = z;
        return listA0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
