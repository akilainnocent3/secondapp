package defpackage;

import com.sporty.android.core.model.luckywheel.TicketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wjk {
    public final List<eik> a;
    public final List<TicketInfo> b;
    public final List<z15> c;
    public final int d;

    public wjk(List<eik> list, List<TicketInfo> list2, List<z15> list3, int i) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjk)) {
            return false;
        }
        wjk wjkVar = (wjk) obj;
        return Intrinsics.g(this.a, wjkVar.a) && Intrinsics.g(this.b, wjkVar.b) && Intrinsics.g(this.c, wjkVar.c) && this.d == wjkVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ai50.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = hfb0.a("GiftDisplayData(giftList=", ", ticketList=", ", boostGiftList=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", totalGiftCount=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
