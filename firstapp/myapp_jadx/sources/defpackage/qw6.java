package defpackage;

import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qw6 {
    public final long a;
    public final mz6 b;
    public final b27 c;
    public final List<m0u> d;
    public final String e;
    public final String f;
    public final ChallengeType g;
    public final int h;
    public final String i;
    public final long j;
    public final long k;
    public final long l;
    public final int m;
    public final t27 n;
    public final ArrayList o;
    public final ArrayList p;

    public qw6(long j, mz6 mz6Var, b27 b27Var, List list, String str, String str2, ChallengeType challengeType, int i, String str3, long j2, long j3, long j4, int i2, t27 t27Var, ArrayList arrayList, ArrayList arrayList2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        challengeType.getClass();
        this.a = j;
        this.b = mz6Var;
        this.c = b27Var;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = challengeType;
        this.h = i;
        this.i = str3;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = i2;
        this.n = t27Var;
        this.o = arrayList;
        this.p = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw6)) {
            return false;
        }
        qw6 qw6Var = (qw6) obj;
        return this.a == qw6Var.a && this.b == qw6Var.b && this.c == qw6Var.c && Intrinsics.g(this.d, qw6Var.d) && Intrinsics.g(this.e, qw6Var.e) && Intrinsics.g(this.f, qw6Var.f) && this.g == qw6Var.g && this.h == qw6Var.h && Intrinsics.g(this.i, qw6Var.i) && this.j == qw6Var.j && this.k == qw6Var.k && this.l == qw6Var.l && this.m == qw6Var.m && this.n.equals(qw6Var.n) && this.o.equals(qw6Var.o) && this.p.equals(qw6Var.p);
    }

    public final int hashCode() {
        int iA = gpp.a(this.h, (this.g.hashCode() + gmf0.a(gmf0.a(ai50.a((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31);
        String str = this.i;
        return this.p.hashCode() + vt5.a(this.o, (this.n.hashCode() + gpp.a(this.m, f87.a(f87.a(f87.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.j, 31), this.k, 31), this.l, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Challenge(id=");
        sb.append(this.a);
        sb.append(", configType=");
        sb.append(this.b);
        sb.append(", publishState=");
        sb.append(this.c);
        sb.append(", tiers=");
        sb.append(this.d);
        hxa.c(sb, ", title=", this.e, ", typeDisplay=", this.f);
        sb.append(", challengeType=");
        sb.append(this.g);
        sb.append(", topRankLimit=");
        sb.append(this.h);
        u4.a(sb, ", url=", this.i, ", lastParticipationTime=");
        sb.append(this.j);
        g41.a(this.k, ", publishedTime=", ", unpublishedTime=", sb);
        to10.a(sb, this.l, ", participantCount=", this.m);
        sb.append(", rules=");
        sb.append(this.n);
        sb.append(", championRewards=");
        sb.append(this.o);
        sb.append(", topRankingRewards=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
