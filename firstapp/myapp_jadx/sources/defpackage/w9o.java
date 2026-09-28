package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w9o<T> {
    public final boolean a;
    public final m9o b;
    public final boolean c;
    public final boolean d;
    public final m9o e;
    public final boolean f;
    public final m9o g;
    public final List<T> h;

    /* JADX WARN: Multi-variable type inference failed */
    public w9o(boolean z, m9o m9oVar, boolean z2, boolean z3, m9o m9oVar2, boolean z4, m9o m9oVar3, List<? extends T> list) {
        list.getClass();
        this.a = z;
        this.b = m9oVar;
        this.c = z2;
        this.d = z3;
        this.e = m9oVar2;
        this.f = z4;
        this.g = m9oVar3;
        this.h = list;
    }

    public static w9o a(w9o w9oVar, m9o.a aVar, boolean z, boolean z2, m9o.a aVar2, boolean z3, m9o.a aVar3, List list, int i) {
        boolean z4 = (i & 1) != 0 ? w9oVar.a : false;
        m9o m9oVar = aVar;
        if ((i & 2) != 0) {
            m9oVar = w9oVar.b;
        }
        if ((i & 4) != 0) {
            z = w9oVar.c;
        }
        if ((i & 8) != 0) {
            z2 = w9oVar.d;
        }
        m9o m9oVar2 = aVar2;
        if ((i & 16) != 0) {
            m9oVar2 = w9oVar.e;
        }
        if ((i & 32) != 0) {
            z3 = w9oVar.f;
        }
        m9o m9oVar3 = aVar3;
        if ((i & 64) != 0) {
            m9oVar3 = w9oVar.g;
        }
        if ((i & 128) != 0) {
            list = w9oVar.h;
        }
        List list2 = list;
        w9oVar.getClass();
        list2.getClass();
        m9o m9oVar4 = m9oVar3;
        boolean z5 = z3;
        m9o m9oVar5 = m9oVar2;
        boolean z6 = z2;
        return new w9o(z4, m9oVar, z, z6, m9oVar5, z5, m9oVar4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9o)) {
            return false;
        }
        w9o w9oVar = (w9o) obj;
        return this.a == w9oVar.a && Intrinsics.g(this.b, w9oVar.b) && this.c == w9oVar.c && this.d == w9oVar.d && Intrinsics.g(this.e, w9oVar.e) && this.f == w9oVar.f && Intrinsics.g(this.g, w9oVar.g) && Intrinsics.g(this.h, w9oVar.h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        m9o m9oVar = this.b;
        int iA = mtg0.a(mtg0.a((iHashCode + (m9oVar == null ? 0 : m9oVar.hashCode())) * 31, 31, this.c), 31, this.d);
        m9o m9oVar2 = this.e;
        int iA2 = mtg0.a((iA + (m9oVar2 == null ? 0 : m9oVar2.hashCode())) * 31, 31, this.f);
        m9o m9oVar3 = this.g;
        return this.h.hashCode() + ((iA2 + (m9oVar3 != null ? m9oVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinBetHistoryContentPageData(initialLoading=");
        sb.append(this.a);
        sb.append(", initialError=");
        sb.append(this.b);
        sb.append(", hasNextPage=");
        nng.a(", isNextPageLoading=", ", nextPageError=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", isRefreshing=");
        sb.append(this.f);
        sb.append(", refreshError=");
        sb.append(this.g);
        sb.append(", tickets=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
