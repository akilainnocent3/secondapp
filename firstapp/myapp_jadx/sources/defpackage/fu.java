package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fu {

    public static final class a extends fu {
        public final uf00<ahh> a;
        public final boolean b;
        public final boolean c;

        public a(uf00<ahh> uf00Var, boolean z, boolean z2) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(articles=");
            sb.append(this.a);
            sb.append(", isLoadingMore=");
            sb.append(this.b);
            sb.append(", hasNextPage=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class b extends fu {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Error(errorMessage=", this.a, ")");
        }
    }

    public static final class c extends fu {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 327359446;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
