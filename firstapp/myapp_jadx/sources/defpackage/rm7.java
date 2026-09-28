package defpackage;

import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rm7 extends hl30 {
    public final RealBetHistoryOrderDto a;
    public boolean b;
    public boolean c;
    public final boolean d;
    public final boolean e;

    public rm7(RealBetHistoryOrderDto realBetHistoryOrderDto, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = realBetHistoryOrderDto;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static rm7 b(rm7 rm7Var, boolean z, int i) {
        RealBetHistoryOrderDto realBetHistoryOrderDto = rm7Var.a;
        boolean z2 = rm7Var.b;
        boolean z3 = rm7Var.c;
        boolean z4 = (i & 16) != 0 ? rm7Var.e : true;
        rm7Var.getClass();
        realBetHistoryOrderDto.getClass();
        return new rm7(realBetHistoryOrderDto, z2, z3, z, z4);
    }

    @Override // defpackage.hl30
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm7)) {
            return false;
        }
        rm7 rm7Var = (rm7) obj;
        return Intrinsics.g(this.a, rm7Var.a) && this.b == rm7Var.b && this.c == rm7Var.c && this.d == rm7Var.d && this.e == rm7Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder("ChooseBetOrderItem(entity=");
        sb.append(this.a);
        sb.append(", dateShowEnabled=");
        sb.append(z);
        sb.append(", yearShowEnabled=");
        nng.a(", isPublishLoading=", ", isPublished=", sb, z2, this.d);
        return mq0.a(sb, this.e, ")");
    }
}
