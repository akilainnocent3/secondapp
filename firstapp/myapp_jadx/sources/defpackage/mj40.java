package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mj40 {
    public final List<BookingCodeInfoDto> a;
    public final boolean b;
    public final int c;

    public mj40(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj40)) {
            return false;
        }
        mj40 mj40Var = (mj40) obj;
        return Intrinsics.g(this.a, mj40Var.a) && this.b == mj40Var.b && this.c == mj40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendedCodesDomainModel(recommendedCodes=");
        sb.append(this.a);
        sb.append(", hasMore=");
        sb.append(this.b);
        sb.append(", nextIndex=");
        return zk1.a(this.c, ")", sb);
    }

    public mj40() {
        this(0);
    }

    public mj40(int i) {
        this(0, m2g.a, true);
    }
}
