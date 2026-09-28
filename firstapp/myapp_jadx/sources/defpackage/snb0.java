package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.twilio.voice.EventGroupType;

/* JADX INFO: loaded from: classes6.dex */
public enum snb0 {
    DEPP_LINK("deep link"),
    OTP("otp"),
    BVN("bvn"),
    ACCOUNT_ACTIVATION("account activation"),
    TWO_FA("two fa"),
    WITHDRAW("withdraw"),
    ME("me"),
    RESET_PIN("reset pin"),
    TRANSFER("transfer"),
    SELF_EXCLUSION("self exclusion"),
    TRANSACTION(JsPluginCommon.GAMES_TRANSACTION),
    HELP("help"),
    WEB_VIEW("web view"),
    SPORTY_GAMES("sporty games"),
    FEEDBACK(EventGroupType.FEEDBACK_EVENT_GROUP),
    FEEDBACK_HISTORY("feedback_history"),
    BET_DETAIL("bet_detail"),
    TICKET_DETAIL("ticket_detail");

    public final String a;

    snb0(String str) {
        this.a = str;
    }
}
