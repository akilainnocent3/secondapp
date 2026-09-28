package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uri {
    public final int a;
    public final List<nqi> b;
    public final List<nqi> c;
    public final List<nqi> d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public uri(int i, List list, List list2, List list3, String str, int i2) {
        this(i, (i2 & 2) != 0 ? m2g.a : list, (i2 & 4) != 0 ? m2g.a : list2, (i2 & 8) != 0 ? m2g.a : list3, (i2 & 16) != 0 ? null : str, false, false);
    }

    public static uri b(uri uriVar, int i, List list, List list2, List list3, String str, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = uriVar.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            list = uriVar.b;
        }
        List list4 = list;
        if ((i2 & 4) != 0) {
            list2 = uriVar.c;
        }
        List list5 = list2;
        if ((i2 & 8) != 0) {
            list3 = uriVar.d;
        }
        List list6 = list3;
        if ((i2 & 16) != 0) {
            str = uriVar.e;
        }
        String str2 = str;
        if ((i2 & 32) != 0) {
            z = uriVar.f;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = uriVar.g;
        }
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new uri(i3, list4, list5, list6, str2, z3, z2);
    }

    public final uri a() {
        return b(this, 0, null, null, null, null, false, false, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uri c(Function1<? super nqi, nqi> function1) {
        List<nqi> list = this.b;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        List<nqi> list2 = this.c;
        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(function1.invoke(it2.next()));
        }
        List<nqi> list3 = this.d;
        ArrayList arrayList3 = new ArrayList(l48.r(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(function1.invoke(it3.next()));
        }
        return b(this, 0, arrayList, arrayList2, arrayList3, null, false, false, 113);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uri)) {
            return false;
        }
        uri uriVar = (uri) obj;
        return this.a == uriVar.a && Intrinsics.g(this.b, uriVar.b) && Intrinsics.g(this.c, uriVar.c) && Intrinsics.g(this.d, uriVar.d) && Intrinsics.g(this.e, uriVar.e) && this.f == uriVar.f && this.g == uriVar.g;
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a(ai50.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForYouFeedState(followingCount=");
        sb.append(this.a);
        sb.append(", followedAccounts=");
        sb.append(this.b);
        sb.append(", suggestedAccounts=");
        qpu.a(", popularAccounts=", ", nextCursor=", sb, this.c, this.d);
        uts.b(this.e, ", isLoadingMore=", ", isRefreshing=", sb, this.f);
        return mq0.a(sb, this.g, ")");
    }

    public uri(int i, List<nqi> list, List<nqi> list2, List<nqi> list3, String str, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = str;
        this.f = z;
        this.g = z2;
    }
}
