package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class hxs {
    public final boolean a;

    public static final class a extends hxs {
        public final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false);
            th.getClass();
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(endOfPaginationReached=");
            sb.append(this.a);
            sb.append(", error=");
            return vt5.b(sb, this.b, ')');
        }
    }

    public static final class b extends hxs {
        public static final b b = new b(false);

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
        }
    }

    public static final class c extends hxs {
        public static final c b = new c(true);
        public static final c c = new c(false);

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.a == ((c) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return ruw.a(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
        }
    }

    public hxs(boolean z) {
        this.a = z;
    }
}
