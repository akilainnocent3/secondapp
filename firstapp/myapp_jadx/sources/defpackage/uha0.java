package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uha0 {
    public final String a;
    public final BookingData b;
    public final boolean c;

    public uha0(String str, BookingData bookingData, boolean z) {
        str.getClass();
        this.a = str;
        this.b = bookingData;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uha0)) {
            return false;
        }
        uha0 uha0Var = (uha0) obj;
        return Intrinsics.g(this.a, uha0Var.a) && this.b.equals(uha0Var.b) && this.c == uha0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialShareCodeState(shareCode=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", isPublished=");
        return mq0.a(sb, this.c, ")");
    }
}
