package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX INFO: loaded from: classes5.dex */
public enum px2 {
    c(R.string.bet_history__won, "WIN"),
    d(R.string.bet_history__lost, PBBetHistoryItemDTO.STATUS_LOST),
    e(R.string.bet_history__void, "VOID");

    public final int a;
    public final int b;

    px2(int i, String str) {
        this.a = i;
        this.b = i;
    }
}
