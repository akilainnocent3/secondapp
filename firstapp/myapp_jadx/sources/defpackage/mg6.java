package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mg6 {
    public final wae a;
    public final BookingCodeInfoDto b;
    public final List<Event> c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final Integer i;
    public final boolean j;

    public mg6(wae waeVar, BookingCodeInfoDto bookingCodeInfoDto, List list, Integer num, String str, String str2, int i, Integer num2, boolean z, int i2) {
        waeVar = (i2 & 1) != 0 ? null : waeVar;
        bookingCodeInfoDto = (i2 & 2) != 0 ? null : bookingCodeInfoDto;
        list = (i2 & 4) != 0 ? null : list;
        num = (i2 & 8) != 0 ? null : num;
        String str3 = (i2 & 16) != 0 ? null : "";
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 64) != 0 ? null : str2;
        i = (i2 & 256) != 0 ? 0 : i;
        num2 = (i2 & 512) != 0 ? null : num2;
        z = (i2 & 1024) != 0 ? false : z;
        this.a = waeVar;
        this.b = bookingCodeInfoDto;
        this.c = list;
        this.d = num;
        this.e = str3;
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = num2;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg6)) {
            return false;
        }
        mg6 mg6Var = (mg6) obj;
        return this.a == mg6Var.a && Intrinsics.g(this.b, mg6Var.b) && Intrinsics.g(this.c, mg6Var.c) && Intrinsics.g(this.d, mg6Var.d) && Intrinsics.g(this.e, mg6Var.e) && Intrinsics.g(this.f, mg6Var.f) && Intrinsics.g(this.g, mg6Var.g) && this.h == mg6Var.h && Intrinsics.g(this.i, mg6Var.i) && this.j == mg6Var.j;
    }

    public final int hashCode() {
        wae waeVar = this.a;
        int iHashCode = (waeVar == null ? 0 : waeVar.hashCode()) * 31;
        BookingCodeInfoDto bookingCodeInfoDto = this.b;
        int iHashCode2 = (iHashCode + (bookingCodeInfoDto == null ? 0 : bookingCodeInfoDto.hashCode())) * 31;
        List<Event> list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iA = gpp.a(this.h, (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 961, 31);
        Integer num2 = this.i;
        return Boolean.hashCode(this.j) + ((iA + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardItemUiState(destination=");
        sb.append(this.a);
        sb.append(", selectedCard=");
        sb.append(this.b);
        sb.append(", events=");
        sb.append(this.c);
        sb.append(", bizCode=");
        sb.append(this.d);
        sb.append(", message=");
        hxa.c(sb, this.e, ", shareCode=", this.f, ", shareUrl=");
        wxa.b(this.h, this.g, ", summery=null, source=", ", orderType=", sb);
        sb.append(this.i);
        sb.append(", isSmartRemixAvailable=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public mg6() {
        this(null, null, null, null, null, null, 0, null, false, 2047);
    }
}
