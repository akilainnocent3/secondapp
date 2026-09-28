package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zsp {
    public final a a;
    public final String b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a i;
        public static final a v;
        public static final /* synthetic */ a[] w;

        static {
            a aVar = new a("Hidden", 0);
            a = aVar;
            a aVar2 = new a("CertSubmitted", 1);
            b = aVar2;
            a aVar3 = new a("DocumentSubmitted", 2);
            c = aVar3;
            a aVar4 = new a("DocumentSubmittedWithCertSubmitted", 3);
            d = aVar4;
            a aVar5 = new a("DocumentRejected", 4);
            e = aVar5;
            a aVar6 = new a("SimpleConfirm", 5);
            f = aVar6;
            a aVar7 = new a("DocumentRejectedWithCertSubmitted", 6);
            i = aVar7;
            a aVar8 = new a("DocumentSubmittedWithSimpleConfirm", 7);
            v = aVar8;
            w = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) w.clone();
        }
    }

    public zsp(a aVar, String str, String str2) {
        aVar.getClass();
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsp)) {
            return false;
        }
        zsp zspVar = (zsp) obj;
        return this.a == zspVar.a && Intrinsics.g(this.b, zspVar.b) && Intrinsics.g(this.c, zspVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KycHintState(type=");
        sb.append(this.a);
        sb.append(", rejectTitle=");
        sb.append(this.b);
        sb.append(", rejectReason=");
        return uf80.a(sb, this.c, ")");
    }

    public zsp() {
        this(null, 7);
    }

    public /* synthetic */ zsp(a aVar, int i) {
        this((i & 1) != 0 ? a.a : aVar, null, null);
    }
}
