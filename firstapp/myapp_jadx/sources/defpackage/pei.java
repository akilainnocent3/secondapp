package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pei implements qei {
    public static final pei a = new pei();

    @Override // defpackage.qei
    public final ResourceUiText a() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.bet_history__2up_early_payout);
    }

    @Override // defpackage.qei
    public final int b() {
        return R.drawable.ic__feature__match_status_2up;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pei);
    }

    public final int hashCode() {
        return -1457085437;
    }

    public final String toString() {
        return "TwoUp";
    }
}
