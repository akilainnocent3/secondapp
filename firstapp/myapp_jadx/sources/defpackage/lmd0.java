package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lmd0 {
    public final Throwable a;

    public static final class a extends lmd0 {
        public final jnd0 b;
        public final Integer c;
        public final Throwable d;

        public a(jnd0 jnd0Var, Integer num, Exception exc) {
            super(exc);
            this.b = jnd0Var;
            this.c = num;
            this.d = exc;
        }

        @Override // defpackage.lmd0
        public final Throwable a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Throwable th = this.d;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HttpsError(error=");
            sb.append(this.b);
            sb.append(", bizCode=");
            sb.append(this.c);
            sb.append(", throwable=");
            return vt5.b(sb, this.d, ')');
        }
    }

    public static final class b extends lmd0 {
        public final b3 b;
        public final Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b3 b3Var, Throwable th) {
            super(th);
            b3Var.getClass();
            this.b = b3Var;
            this.c = th;
        }

        @Override // defpackage.lmd0
        public final Throwable a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Throwable th = this.c;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WebSocketError(error=");
            sb.append(this.b);
            sb.append(", throwable=");
            return vt5.b(sb, this.c, ')');
        }
    }

    public lmd0(Throwable th) {
        this.a = th;
    }

    public Throwable a() {
        return this.a;
    }
}
