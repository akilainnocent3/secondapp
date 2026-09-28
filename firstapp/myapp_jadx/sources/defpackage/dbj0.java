package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class dbj0 implements pdd0 {
    public final int a;

    public dbj0(int i) {
        this.a = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.DATA_GAME_TYPE, String.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbj0) && this.a == ((dbj0) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "winning_popup__remix_bet_btn__click";
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "WinningPopupRemixBetClickEvent(bizType=", ")");
    }
}
