package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;

/* JADX INFO: loaded from: classes6.dex */
public enum vtp {
    DEPOSIT_PAGE(AnalyticsEvent.DEPOSIT),
    WITHDRAW_PAGE("withdraw"),
    ME_PAGE("me"),
    TRANSACTIONS_PAGE("transactions"),
    LOGIN(JsPluginCommon.GAMES_LOGIN),
    NONE("none");

    public final String a;

    vtp(String str) {
        this.a = str;
    }
}
