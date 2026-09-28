package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yl70 implements w270 {
    public final String a;
    public final boolean b;
    public final xl70 c;
    public final qcn<d970> d;
    public final String e;
    public final ai70 f;
    public final qcn<n470> g;
    public final UiText h;

    public yl70(String str, boolean z, xl70 xl70Var, qcn<d970> qcnVar, String str2, ai70 ai70Var, qcn<n470> qcnVar2, UiText uiText) {
        str.getClass();
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = str;
        this.b = z;
        this.c = xl70Var;
        this.d = qcnVar;
        this.e = str2;
        this.f = ai70Var;
        this.g = qcnVar2;
        this.h = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl70)) {
            return false;
        }
        yl70 yl70Var = (yl70) obj;
        return Intrinsics.g(this.a, yl70Var.a) && this.b == yl70Var.b && this.c.equals(yl70Var.c) && Intrinsics.g(this.d, yl70Var.d) && this.e.equals(yl70Var.e) && this.f.equals(yl70Var.f) && Intrinsics.g(this.g, yl70Var.g) && this.h.equals(yl70Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shu.a(this.g, (this.f.hashCode() + gmf0.a(shu.a(this.d, (this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("ScheduledFootballUpcomingCellState(matchdayId=", this.a, ", isExpanded=", ", headerState=", this.b);
        sbA.append(this.c);
        sbA.append(", marketTabStates=");
        sbA.append(this.d);
        sbA.append(", selectedMarketType=");
        sbA.append(this.e);
        sbA.append(", selectedMarketHeaderState=");
        sbA.append(this.f);
        sbA.append(", eventOddsRowStates=");
        sbA.append(this.g);
        sbA.append(", seasonIdUiText=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
