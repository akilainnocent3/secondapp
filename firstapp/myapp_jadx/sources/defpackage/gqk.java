package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface gqk {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements gqk {
        public final String a;
        public final String b;

        public a(String str, String str2) {
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
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return tx5.a("ApplyGift(giftId=", this.a, ", giftAmount=", this.b, ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements gqk {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1262484827;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements gqk {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RefreshGiftIfNeeded(usableGiftCurrentBalances=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements gqk {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1963514807;
        }

        public final String toString() {
            return "RemoveGift";
        }
    }
}
