package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s780 {
    public final a a;
    public final a b;
    public final boolean c;

    public static final class a {
        public final lg50 a;
        public final int b;
        public final long c;

        public a(lg50 lg50Var, int i, long j) {
            this.a = lg50Var;
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.a);
            sb.append(", offset=");
            sb.append(this.b);
            sb.append(", selectableId=");
            return uvh.a(sb, this.c, ')');
        }
    }

    public s780(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public static s780 a(s780 s780Var, a aVar, a aVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            aVar = s780Var.a;
        }
        if ((i & 2) != 0) {
            aVar2 = s780Var.b;
        }
        s780Var.getClass();
        return new s780(aVar, aVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s780)) {
            return false;
        }
        s780 s780Var = (s780) obj;
        return Intrinsics.g(this.a, s780Var.a) && Intrinsics.g(this.b, s780Var.b) && this.c == s780Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return ruw.a(sb, this.c, ')');
    }
}
