package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerOutcome;
import com.sportybet.plugin.realsports.data.Outcome;

/* JADX INFO: loaded from: classes4.dex */
public final class phw {
    public static final MultiMakerOutcome a(Outcome outcome) {
        if (outcome == null) {
            return new MultiMakerOutcome(null, null, null, null, 0, 63, 0);
        }
        String str = outcome.id;
        if (str == null) {
            str = "";
        }
        String str2 = outcome.odds;
        if (str2 == null) {
            str2 = "";
        }
        String strValueOf = String.valueOf(outcome.probability);
        int i = outcome.isActive;
        String str3 = outcome.desc;
        return new MultiMakerOutcome(str, str2, strValueOf, str3 == null ? "" : str3, i, 32, 0);
    }
}
