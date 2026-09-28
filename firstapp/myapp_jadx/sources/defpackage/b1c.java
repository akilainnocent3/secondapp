package defpackage;

import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b1c {
    public static final /* synthetic */ int m = 0;
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final long h;
    public final a i;
    public final String j;
    public final String k;
    public final String l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("NO_EARNING", 0);
            a = aVar;
            a aVar2 = new a("ACTIVE", 1);
            b = aVar2;
            a aVar3 = new a("WAIT_SETTLE", 2);
            c = aVar3;
            a aVar4 = new a("CLAIMABLE", 3);
            d = aVar4;
            a aVar5 = new a("EXPIRED", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    static {
        new b1c("1", 1000L, "USD", "NGN 1000", 1634803200000L, "2021-10-14", 1000L, 1634600400000L, a.d, "1", "14-21 Oct", "1");
    }

    public b1c(String str, long j, String str2, String str3, long j2, String str4, long j3, long j4, a aVar, String str5, String str6, String str7) {
        m.a(str, str2, str5);
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = str4;
        this.g = j3;
        this.h = j4;
        this.i = aVar;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1c)) {
            return false;
        }
        b1c b1cVar = (b1c) obj;
        return Intrinsics.g(this.a, b1cVar.a) && this.b == b1cVar.b && Intrinsics.g(this.c, b1cVar.c) && this.d.equals(b1cVar.d) && this.e == b1cVar.e && this.f.equals(b1cVar.f) && this.g == b1cVar.g && this.h == b1cVar.h && this.i == b1cVar.i && Intrinsics.g(this.j, b1cVar.j) && this.k.equals(b1cVar.k) && this.l.equals(b1cVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + gmf0.a(gmf0.a((this.i.hashCode() + f87.a(f87.a(gmf0.a(f87.a(gmf0.a(gmf0.a(f87.a(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), this.e, 31), 31, this.f), this.g, 31), this.h, 31)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "CreatorCreditViewInfo(batchId=", this.a, ", claimedAmount=");
        hxa.c(sbA, ", currency=", this.c, ", rewardWithCurrency=", this.d);
        g41.a(this.e, ", endTime=", ", lastClaimedTime=", sbA);
        l.a(this.g, this.f, ", potentialReward=", sbA);
        g41.a(this.h, ", startTime=", ", status=", sbA);
        sbA.append(this.i);
        sbA.append(", userId=");
        sbA.append(this.j);
        sbA.append(", period=");
        return kwi.a(sbA, this.k, ", aliasCode=", this.l, ")");
    }
}
