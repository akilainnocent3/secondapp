package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ou00 {
    public final Throwable a;

    public static final class a extends ou00 {
        public final vu00 b;
        public final Integer c;
        public final Throwable d;
        public final boolean e;

        public a(vu00 vu00Var, Integer num, Exception exc, boolean z) {
            super(exc);
            this.b = vu00Var;
            this.c = num;
            this.d = exc;
            this.e = z;
        }

        @Override // defpackage.ou00
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
            return this.b == aVar.b && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Throwable th = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HttpsError(error=");
            sb.append(this.b);
            sb.append(", bizCode=");
            sb.append(this.c);
            sb.append(", throwable=");
            sb.append(this.d);
            sb.append(", shouldExitGame=");
            return ruw.a(sb, this.e, ')');
        }
    }

    public static final class b extends ou00 {
        public final bjb0 b;
        public final Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bjb0 bjb0Var, Throwable th) {
            super(th);
            bjb0Var.getClass();
            this.b = bjb0Var;
            this.c = th;
        }

        @Override // defpackage.ou00
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

    public ou00(Throwable th) {
        this.a = th;
    }

    public Throwable a() {
        return this.a;
    }
}
