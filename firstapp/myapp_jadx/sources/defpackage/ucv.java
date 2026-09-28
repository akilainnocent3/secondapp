package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;

/* JADX INFO: loaded from: classes4.dex */
public enum ucv {
    None(null),
    Transaction(JsPluginCommon.GAMES_TRANSACTION),
    Withdraw("withdraw");

    public final String a;

    ucv(String str) {
        this.a = str;
    }
}
