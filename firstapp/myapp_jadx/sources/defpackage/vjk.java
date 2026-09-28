package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vjk {

    public static final class a extends vjk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 441461283;
        }

        public final String toString() {
            return "GiftList";
        }
    }

    public static final class b extends vjk {
        public final GiftDetails a;
        public final SelectedGiftData b;
        public final int c;

        public b(GiftDetails giftDetails, SelectedGiftData selectedGiftData, int i) {
            this.a = giftDetails;
            this.b = selectedGiftData;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            GiftDetails giftDetails = this.a;
            int iHashCode = (giftDetails == null ? 0 : giftDetails.hashCode()) * 31;
            SelectedGiftData selectedGiftData = this.b;
            return Integer.hashCode(this.c) + ((iHashCode + (selectedGiftData != null ? selectedGiftData.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GiftValue(newGiftData=");
            sb.append(this.a);
            sb.append(", oldSelectedGiftData=");
            sb.append(this.b);
            sb.append(", giftCount=");
            return zk1.a(this.c, ")", sb);
        }
    }
}
