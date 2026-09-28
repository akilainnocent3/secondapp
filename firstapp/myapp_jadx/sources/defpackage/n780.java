package defpackage;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class n780 {

    public static final class a extends n780 {
        public final Integer a;

        public a(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "Empty(currentBetType=" + this.a + ")";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b extends n780 {
        public final GiftDetails a;
        public final int b;
        public final List<GiftDetails> c;

        public b(GiftDetails giftDetails, int i, List<GiftDetails> list) {
            giftDetails.getClass();
            list.getClass();
            this.a = giftDetails;
            this.b = i;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftReady(gift=");
            sb.append(this.a);
            sb.append(", giftCount=");
            sb.append(this.b);
            sb.append(", giftList=");
            return ng1.a(sb, this.c, ")");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c extends n780 {
        public final GiftDetails a;
        public final String b;
        public final String c;
        public final Boolean d;
        public final Boolean e;
        public final Boolean f;

        public c(GiftDetails giftDetails, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
            giftDetails.getClass();
            this.a = giftDetails;
            this.b = str;
            this.c = str2;
            this.d = bool;
            this.e = bool2;
            this.f = bool3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && Intrinsics.g(this.e, cVar.e) && Intrinsics.g(this.f, cVar.f);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.e;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f;
            return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftSelected(gift=");
            sb.append(this.a);
            sb.append(", originalStake=");
            sb.append(this.b);
            sb.append(", giftValue=");
            x03.a(sb, this.c, ", isChecked=", this.d, ", addToStake=");
            sb.append(this.e);
            sb.append(", isUserSelected=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    public static final class d extends n780 {
        public final List<GiftGroup> a;

        public d(List<GiftGroup> list) {
            list.getClass();
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return p.a("HasGift(giftGroups=", ")", this.a);
        }
    }

    public static final class e extends n780 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 851291459;
        }

        public final String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f extends n780 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2009319789;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
