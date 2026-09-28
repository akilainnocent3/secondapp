package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.data.LiabilitiesResponse;

/* JADX INFO: loaded from: classes7.dex */
public final class m9s {
    public final LiabilitiesResponse a;
    public final Boolean b;
    public final BookingData c;

    public m9s(LiabilitiesResponse liabilitiesResponse, Boolean bool, BookingData bookingData) {
        this.a = liabilitiesResponse;
        this.b = bool;
        this.c = bookingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9s)) {
            return false;
        }
        m9s m9sVar = (m9s) obj;
        return this.a.equals(m9sVar.a) && this.b.equals(m9sVar.b) && this.c.equals(m9sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LiabilityWithBookingCodeData(liabilitiesResponse=" + this.a + ", isSmartRemixAvailable=" + this.b + ", bookingData=" + this.c + ")";
    }
}
