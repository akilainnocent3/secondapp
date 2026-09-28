package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class oei implements qei {
    public static final oei a = new oei();

    @Override // defpackage.qei
    public final ResourceUiText a() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.bet_history__1up_early_payout);
    }

    @Override // defpackage.qei
    public final int b() {
        return R.drawable.ic__feature__match_status_1up;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oei);
    }

    public final int hashCode() {
        return -1461980771;
    }

    public final String toString() {
        return "OneUp";
    }
}
