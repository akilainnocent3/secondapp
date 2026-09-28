package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ua70 {
    public final ResourceUiText a;
    public final UiText b;
    public final qcn<sc70> c;
    public final String d;
    public final String e;

    public ua70(ResourceUiText resourceUiText, UiText uiText, qcn qcnVar, String str, String str2) {
        uiText.getClass();
        qcnVar.getClass();
        this.a = resourceUiText;
        this.b = uiText;
        this.c = qcnVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua70)) {
            return false;
        }
        ua70 ua70Var = (ua70) obj;
        return this.a.equals(ua70Var.a) && Intrinsics.g(this.b, ua70Var.b) && Intrinsics.g(this.c, ua70Var.c) && this.d.equals(ua70Var.d) && this.e.equals(ua70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(shu.a(this.c, yvf.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballOpenBetsCellState(ticketNumberUiText=");
        sb.append(this.a);
        sb.append(", titleUiText=");
        sb.append(this.b);
        sb.append(", selectionStates=");
        sb.append(this.c);
        sb.append(", stakeText=");
        sb.append(this.d);
        sb.append(", winningAmountValueText=");
        return uf80.a(sb, this.e, ")");
    }
}
