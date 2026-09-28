package com.sportybet.plugin.realsports.data;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;

/* JADX INFO: loaded from: classes2.dex */
public enum QuickMarketSpotEnum {
    MAIN_PAGE_LIVE_EVENTS("A"),
    MAIN_PAGE_PRE_MATCH("B"),
    LIVE_PAGE_LIVE_EVENTS("C"),
    LIVE_PAGE_UPCOMING_EVENTS("D"),
    SPORTS_PAGE_PRE_MATCH(LxHElgWAiSeM.vueorceDchpRvWL),
    SPORTS_MULTI_MAKER_PAGE_PRE_MATCH(QQWMbKFOuTf.XKBToMrIyCCinJ);

    private String blockCode;

    QuickMarketSpotEnum(String str) {
        this.blockCode = str;
    }

    public String getBlockCode() {
        return this.blockCode;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }
}
