package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a8a0 {
    public final BookingData a;
    public final boolean b;
    public final boolean c;

    public a8a0(BookingData bookingData, boolean z, boolean z2) {
        bookingData.getClass();
        this.a = bookingData;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8a0)) {
            return false;
        }
        a8a0 a8a0Var = (a8a0) obj;
        return Intrinsics.g(this.a, a8a0Var.a) && this.b == a8a0Var.b && this.c == a8a0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialCodeLiabilityState(bookingCode=");
        sb.append(this.a);
        sb.append(", disabled=");
        sb.append(this.b);
        sb.append(", isSmartRemixAvailable=");
        return mq0.a(sb, this.c, ")");
    }
}
