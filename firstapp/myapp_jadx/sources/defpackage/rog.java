package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rog {
    public final String a;
    public final ofb0 b;
    public final boolean c;
    public final b380 d;
    public final List<b380> e;

    public rog(String str, ofb0 ofb0Var, boolean z, uss ussVar, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = ofb0Var;
        this.c = z;
        this.d = ussVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rog)) {
            return false;
        }
        rog rogVar = (rog) obj;
        return Intrinsics.g(this.a, rogVar.a) && this.b == rogVar.b && this.c == rogVar.c && Intrinsics.g(this.d, rogVar.d) && Intrinsics.g(this.e, rogVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ofb0 ofb0Var = this.b;
        int iA = mtg0.a((iHashCode + (ofb0Var == null ? 0 : ofb0Var.hashCode())) * 31, 31, this.c);
        b380 b380Var = this.d;
        return this.e.hashCode() + ((iA + (b380Var != null ? b380Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventDetailsSideMenuUiModel(competitionName=");
        sb.append(this.a);
        sb.append(", sportType=");
        sb.append(this.b);
        sb.append(", isSetBasedSport=");
        sb.append(this.c);
        sb.append(", liveSection=");
        sb.append(this.d);
        sb.append(", preMatchSections=");
        return ng1.a(sb, this.e, ")");
    }

    public rog() {
        this(0);
    }

    public rog(int i) {
        this("", null, false, null, m2g.a);
    }
}
