package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class rs90 implements qs90 {
    public final ResourceUiText a;

    public rs90(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rs90) && this.a.equals(((rs90) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic__feature__won) + gpp.a(R.color.bg_brand_sub_primary_d_lighter, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oe90.a(this.a, "SimulationTicketDetailTicketResultWonState(ticketResultUiText=", ", textColorResId=2131099767, iconResId=2131231740)");
    }
}
