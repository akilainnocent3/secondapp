package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class olv {
    public final a a;
    public final String b;
    public final Boolean c;
    public final int d;
    public final int e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("LEFT_WIN", 0);
            a = aVar;
            a aVar2 = new a("RIGHT_WIN", 1);
            b = aVar2;
            a aVar3 = new a("DRAW", 2);
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

    public olv(a aVar, String str, Boolean bool, int i, int i2) {
        this.a = aVar;
        this.b = str;
        this.c = bool;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olv)) {
            return false;
        }
        olv olvVar = (olv) obj;
        return this.a == olvVar.a && Intrinsics.g(this.b, olvVar.b) && Intrinsics.g(this.c, olvVar.c) && this.d == olvVar.d && this.e == olvVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return Integer.hashCode(this.e) + gpp.a(this.d, (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MeetingRecord(result=");
        sb.append(this.a);
        sb.append(", winTeamName=");
        sb.append(this.b);
        sb.append(", winTeamInHome=");
        sb.append(this.c);
        sb.append(", homeScore=");
        sb.append(this.d);
        sb.append(", awayScore=");
        return zk1.a(this.e, ")", sb);
    }
}
