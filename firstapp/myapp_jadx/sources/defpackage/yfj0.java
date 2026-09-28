package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yfj0 {

    public static final class a extends yfj0 {
        public final rcj0 a;

        public a(rcj0 rcj0Var) {
            rcj0Var.getClass();
            this.a = rcj0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DoubleOrNothing(status=" + this.a + ")";
        }
    }

    public static final class b extends yfj0 {
        public final mfj0 a;
        public final String b;

        public b(mfj0 mfj0Var, String str) {
            this.a = mfj0Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            mfj0 mfj0Var = this.a;
            return this.b.hashCode() + ((mfj0Var == null ? 0 : mfj0Var.hashCode()) * 31);
        }

        public final String toString() {
            return "Lose(myEventsState=" + this.a + ", totalWonText=" + this.b + ")";
        }
    }

    public static final class c extends yfj0 {
        public final mfj0 a;
        public final String b;

        public c(mfj0 mfj0Var, String str) {
            this.a = mfj0Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            mfj0 mfj0Var = this.a;
            return this.b.hashCode() + ((mfj0Var == null ? 0 : mfj0Var.hashCode()) * 31);
        }

        public final String toString() {
            return "Win(myEventsState=" + this.a + ", totalWonText=" + this.b + ")";
        }
    }
}
