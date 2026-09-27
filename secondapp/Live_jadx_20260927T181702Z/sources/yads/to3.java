package yads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class to3 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f156002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f156003d;

    public to3(ArrayList arrayList) {
        this.f156001b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f156002c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            lo3 lo3Var = (lo3) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f156002c;
            jArr[i11] = lo3Var.f152076b;
            jArr[i11 + 1] = lo3Var.f152077c;
        }
        long[] jArr2 = this.f156002c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f156003d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f156003d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f156001b.size(); i10++) {
            long[] jArr = this.f156002c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                lo3 lo3Var = (lo3) this.f156001b.get(i10);
                o20 o20Var = lo3Var.f152075a;
                if (o20Var.f153322f == -3.4028235E38f) {
                    arrayList2.add(lo3Var);
                } else {
                    arrayList.add(o20Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: yads.ob4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((lo3) obj).f152076b, ((lo3) obj2).f152076b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            o20 o20Var2 = ((lo3) arrayList2.get(i12)).f152075a;
            o20Var2.getClass();
            arrayList.add(new o20(o20Var2.f153318b, o20Var2.f153319c, o20Var2.f153320d, o20Var2.f153321e, (-1) - i12, 1, o20Var2.f153324h, o20Var2.f153325i, o20Var2.f153326j, o20Var2.f153331o, o20Var2.f153332p, o20Var2.f153327k, o20Var2.f153328l, o20Var2.f153329m, o20Var2.f153330n, o20Var2.f153333q, o20Var2.f153334r));
        }
        return arrayList;
    }

    @Override // yads.r43
    public final int a() {
        return this.f156003d.length;
    }

    @Override // yads.r43
    public final int a(long j10) {
        int iA = ib3.a(this.f156003d, j10, false);
        if (iA < this.f156003d.length) {
            return iA;
        }
        return -1;
    }
}
