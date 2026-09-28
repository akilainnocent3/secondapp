package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.VoteSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class soi0 extends u88 {
    public final List<VoteSource> c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    public soi0(List<VoteSource> list, String str, String str2, String str3, int i) {
        list.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
    }

    @Override // defpackage.u88
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soi0)) {
            return false;
        }
        soi0 soi0Var = (soi0) obj;
        return Intrinsics.g(this.c, soi0Var.c) && Intrinsics.g(this.d, soi0Var.d) && Intrinsics.g(this.e, soi0Var.e) && Intrinsics.g(this.f, soi0Var.f) && this.g == soi0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + gmf0.a(gmf0.a(gmf0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoteDataSource(voteSources=");
        sb.append(this.c);
        sb.append(", endDate=");
        sb.append(this.d);
        sb.append(", eventId=");
        hxa.c(sb, this.e, ", status=", this.f, ", voteCount=");
        return zk1.a(this.g, ")", sb);
    }

    public soi0() {
        this(m2g.a, "", "", "", 0);
    }
}
