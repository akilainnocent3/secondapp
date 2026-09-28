package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xqz<Key, Value> {
    public final List<wqz.b.c<Key, Value>> a;
    public final Integer b;
    public final iqz c;
    public final int d;

    public xqz(List<wqz.b.c<Key, Value>> list, Integer num, iqz iqzVar, int i) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = iqzVar;
        this.d = i;
    }

    public final wqz.b.c<Key, Value> a(int i) {
        List<wqz.b.c<Key, Value>> list = this.a;
        if (list != null && list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((wqz.b.c) it.next()).a.isEmpty()) {
                int size = i - this.d;
                int i2 = 0;
                while (i2 < b.j(list) && size > b.j(list.get(i2).a)) {
                    size -= list.get(i2).a.size();
                    i2++;
                }
                return size < 0 ? (wqz.b.c) CollectionsKt.T(list) : list.get(i2);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xqz)) {
            return false;
        }
        xqz xqzVar = (xqz) obj;
        return Intrinsics.g(this.a, xqzVar.a) && Intrinsics.g(this.b, xqzVar.b) && this.c == xqzVar.c && this.d == xqzVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Integer num = this.b;
        return Integer.hashCode(this.d) + this.c.hashCode() + iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return rr1.b(sb, this.d, ')');
    }
}
