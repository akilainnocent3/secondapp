package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class v4k {
    public final BookingData a;
    public final List<Selection> b;

    /* JADX WARN: Multi-variable type inference failed */
    public v4k(BookingData bookingData, List<? extends Selection> list) {
        this.a = bookingData;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4k)) {
            return false;
        }
        v4k v4kVar = (v4k) obj;
        return this.a.equals(v4kVar.a) && this.b.equals(v4kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GetCodeSelectionsResult(dto=" + this.a + ", selections=" + this.b + ")";
    }
}
