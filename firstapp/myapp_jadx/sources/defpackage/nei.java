package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nei implements qei {
    public static final nei a = new nei();

    @Override // defpackage.qei
    public final ResourceUiText a() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.bet_history__won);
    }

    @Override // defpackage.qei
    public final int b() {
        return R.drawable.ic__feature__match_status_won;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nei);
    }

    public final int hashCode() {
        return 1895940715;
    }

    public final String toString() {
        return "Normal";
    }
}
