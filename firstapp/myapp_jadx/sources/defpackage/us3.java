package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class us3 {
    public final String a;
    public final String b;
    public final a c;
    public final int d;
    public final qcn<kt3> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("FAKE_FIRST", 1);
            b = aVar2;
            a aVar3 = new a("FAKE_LAST", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public us3(String str, String str2, a aVar, int i, qcn<kt3> qcnVar) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = i;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us3)) {
            return false;
        }
        us3 us3Var = (us3) obj;
        return this.a.equals(us3Var.a) && this.b.equals(us3Var.b) && this.c == us3Var.c && this.d == us3Var.d && Intrinsics.g(this.e, us3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetslipRecommendationPagerPageState(pagerKey=", this.a, ", pageId=", this.b, ", boundaryType=");
        sbA.append(this.c);
        sbA.append(", contentPaddingEnd=");
        sbA.append(this.d);
        sbA.append(", selections=");
        return ts3.a(sbA, this.e, ")");
    }
}
