package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface yg60 extends zxq.i {

    public static final class a implements yg60 {
        public final String a;
        public final int b;

        public a(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        @Override // zxq.i
        public final String getMarketId() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "AddNumber(marketId=", this.a, ", number=", ")");
        }
    }

    public static final class b implements yg60 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // zxq.i
        public final String getMarketId() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "QuickPick(marketId=null, balls=0)";
        }
    }

    public static final class c implements yg60 {
        public final String a;
        public final int b;

        public c(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        @Override // zxq.i
        public final String getMarketId() {
            return this.a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return d830.a(this.b, "RemoveNumber(marketId=", this.a, ", number=", ")");
        }
    }
}
