package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface zlz extends zxq.i {

    public static final class a implements zlz {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        @Override // zxq.i
        public final String getMarketId() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("SelectItem(outcomeId=", this.a, ", marketId=", this.b, ")");
        }
    }
}
