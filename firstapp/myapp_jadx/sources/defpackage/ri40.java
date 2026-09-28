package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ri40 {
    public final String a;
    public final String b;
    public final String c;
    public final List<Event> d;
    public final List<Selection> e;

    public ri40(String str, String str2, List list, int i, List list2) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, "", (List<? extends Event>) ((i & 8) != 0 ? m2g.a : list), (List<? extends Selection>) ((i & 16) != 0 ? m2g.a : list2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri40)) {
            return false;
        }
        ri40 ri40Var = (ri40) obj;
        return Intrinsics.g(this.a, ri40Var.a) && Intrinsics.g(this.b, ri40Var.b) && Intrinsics.g(this.c, ri40Var.c) && Intrinsics.g(this.d, ri40Var.d) && Intrinsics.g(this.e, ri40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ai50.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("RecommendCodeItem(shareCode=", this.a, ", countryCode=", this.b, ", shareUrl=");
        kya0.b(this.c, ", events=", ", selections=", sbA, this.d);
        return ng1.a(sbA, this.e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ri40(String str, String str2, String str3, List<? extends Event> list, List<? extends Selection> list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public ri40() {
        this((String) null, (String) null, (List) null, 31, (List) null);
    }
}
