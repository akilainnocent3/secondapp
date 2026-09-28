package defpackage;

import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.UserNote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jqf0 {
    public final List<hl30> a;
    public final int b;
    public final String c;
    public final BoreDrawConfig d;
    public final String e;
    public final UserNote f;

    /* JADX WARN: Multi-variable type inference failed */
    public jqf0(List<? extends hl30> list, int i, String str, BoreDrawConfig boreDrawConfig, String str2, UserNote userNote) {
        str2.getClass();
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = boreDrawConfig;
        this.e = str2;
        this.f = userNote;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqf0)) {
            return false;
        }
        jqf0 jqf0Var = (jqf0) obj;
        return this.a.equals(jqf0Var.a) && this.b == jqf0Var.b && Intrinsics.g(this.c, jqf0Var.c) && this.d.equals(jqf0Var.d) && Intrinsics.g(this.e, jqf0Var.e) && Intrinsics.g(this.f, jqf0Var.f);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iA2 = gmf0.a((this.d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
        UserNote userNote = this.f;
        return iA2 + (userNote != null ? userNote.hashCode() : 0);
    }

    public final String toString() {
        return "TicketDetailsData(dataList=" + this.a + ", winningStatus=" + this.b + ", verifyCode=" + this.c + ", boreDrawConfig=" + this.d + ", orderId=" + this.e + ", userNote=" + this.f + ")";
    }
}
