package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q3d0 {
    public final a a;
    public final UiText b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public enum a {
        HIT("selection_result_hit_icon", Integer.valueOf(R.drawable.ic__feature__match_status_won)),
        MISSED("selection_result_miss_icon", Integer.valueOf(R.drawable.ic__feature__match_status_lost));

        public final Integer a;
        public final String b;

        a(String str, Integer num) {
            this.a = num;
            this.b = str;
        }
    }

    public q3d0(a aVar, UiText uiText, String str, String str2, String str3) {
        uiText.getClass();
        str3.getClass();
        this.a = aVar;
        this.b = uiText;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = "@";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3d0)) {
            return false;
        }
        q3d0 q3d0Var = (q3d0) obj;
        return this.a == q3d0Var.a && Intrinsics.g(this.b, q3d0Var.b) && this.c.equals(q3d0Var.c) && this.d.equals(q3d0Var.d) && Intrinsics.g(this.e, q3d0Var.e) && this.f.equals(q3d0Var.f);
    }

    public final int hashCode() {
        a aVar = this.a;
        return this.f.hashCode() + gmf0.a(gmf0.a(gmf0.a(yvf.a((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltySettlementSelectionState(result=");
        sb.append(this.a);
        sb.append(", betTypeTitle=");
        sb.append(this.b);
        sb.append(", marketTitleText=");
        hxa.c(sb, this.c, ", outcomeText=", this.d, ", oddsText=");
        return kwi.a(sb, this.e, ", delimiter=", this.f, ")");
    }
}
