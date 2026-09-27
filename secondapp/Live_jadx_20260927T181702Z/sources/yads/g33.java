package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g33 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f149383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149384c;

    public g33(ArrayList arrayList, ArrayList arrayList2) {
        this.f149383b = arrayList;
        this.f149384c = arrayList2;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 < this.f149384c.size()) {
            return ((Long) this.f149384c.get(i10)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        int iA = ib3.a(this.f149384c, Long.valueOf(j10), false);
        return iA == -1 ? Collections.EMPTY_LIST : (List) this.f149383b.get(iA);
    }

    @Override // yads.r43
    public final int a() {
        return this.f149384c.size();
    }

    @Override // yads.r43
    public final int a(long j10) {
        int i10;
        List list = this.f149384c;
        Long lValueOf = Long.valueOf(j10);
        int i11 = ib3.f150516a;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i10 = iBinarySearch;
        }
        if (i10 < this.f149384c.size()) {
            return i10;
        }
        return -1;
    }
}
