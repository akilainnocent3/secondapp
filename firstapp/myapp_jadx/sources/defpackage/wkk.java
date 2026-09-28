package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface wkk {

    public static final class a implements wkk {
        public static final a a = new a();
    }

    public static final class b implements wkk {
        public static final b a = new b();
    }

    public static final class c implements wkk {
        public final uf00<kkk> a;

        public c(uf00<kkk> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(infoList=" + this.a + ")";
        }
    }
}
