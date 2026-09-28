package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ps90 implements qs90 {
    public final ResourceUiText a;

    public ps90(ResourceUiText resourceUiText) {
        this.a = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps90) && this.a.equals(((ps90) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.text_inverse_primary) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oe90.a(this.a, "SimulationTicketDetailTicketResultLostState(ticketResultUiText=", ", textColorResId=2131101781)");
    }
}
