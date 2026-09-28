package com.sportybet.plugin.sportydesk.widgets;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.twilio.voice.Call;
import com.twilio.voice.CallException;
import defpackage.arg0;
import defpackage.c8b;
import defpackage.ev5;
import defpackage.f130;
import defpackage.gpf0;
import defpackage.hwr;
import defpackage.i88;
import defpackage.itf0;
import defpackage.psm;
import java.util.Map;
import okhttp3.internal.luBk.Chyeyik;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SportyDeskWebView extends WebView {
    public final AccountHelperEntryPointImpl a;
    public final psm b;
    public boolean c;
    public JSONObject d;
    public final b e;

    /* JADX INFO: loaded from: classes7.dex */
    public static class a {
        @JavascriptInterface
        public void sendCmd(String str) {
            i88 i88Var;
            try {
                if (TextUtils.isEmpty(str)) {
                    i88Var = null;
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    i88Var = new i88(jSONObject.optString("appName"), jSONObject.optString("eventType"), jSONObject.optJSONObject("data"));
                }
            } catch (JSONException e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_PLEASED);
                aVar.o(e);
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_PLEASED);
            aVar2.a("app_receiver.sendCmd: " + i88Var, new Object[0]);
            if (i88Var == null || !TextUtils.equals(i88Var.a, "SPORTY_DESK")) {
                return;
            }
            ((Handler) gpf0.a.getValue()).post(new f130(i88Var, 1));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class b {
        public b() {
        }
    }

    public SportyDeskWebView(Context context) {
        super(context);
        this.a = new AccountHelperEntryPointImpl();
        this.b = (psm) hwr.b(new c8b(0)).getValue();
        this.d = null;
        this.e = new b();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        addJavascriptInterface(new a(), "app_receiver");
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        arg0[] arg0VarArr = arg0.a;
        jSONObject.put("type", 3);
        JSONObject jSONObject2 = this.d;
        if (jSONObject2 != null) {
            jSONObject.put("entity", jSONObject2);
            return jSONObject;
        }
        jSONObject.put("entity", new JSONObject());
        return jSONObject;
    }

    public final void c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        b bVar = this.e;
        bVar.getClass();
        try {
            jSONObject2 = new JSONObject();
            jSONObject2.put("appName", "SPORTY_BET");
            jSONObject2.put("eventType", str);
            jSONObject2.put("data", jSONObject);
        } catch (JSONException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_WEB);
            aVar.o(e);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            String str2 = "javascript:window.sportydesk_receiver.sendCmd('" + jSONObject2 + "');";
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_PLEASED);
            aVar2.a("runJs: %s", str2);
            SportyDeskWebView.this.evaluateJavascript(str2, null);
        }
    }

    @Override // android.webkit.WebView
    public final void loadData(String str, String str2, String str3) {
        a();
        super.loadData(str, str2, str3);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        a();
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        a();
        super.loadUrl(str);
    }

    public void setAppVoicePermission(boolean z) {
        try {
            c("APP_HAS_VOICE_PERMISSION", new JSONObject().putOpt("permission", Boolean.valueOf(z)));
        } catch (JSONException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.o(e);
        }
    }

    public void setBetTicketData(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void setInitData(String str) {
        psm psmVar = this.b;
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = this.a;
        try {
            String code = psmVar.getCountryCode().getCode();
            String lastAccessToken = accountHelperEntryPointImpl.getAccountHelper().getLastAccessToken();
            String str2 = "";
            if (lastAccessToken == null) {
                lastAccessToken = "";
            }
            String strB = psmVar.B();
            if (strB == null) {
                strB = "";
            }
            String languageCode = accountHelperEntryPointImpl.getAccountHelper().getLanguageCode();
            if (languageCode == null) {
                languageCode = "";
            }
            String userId = accountHelperEntryPointImpl.getAccountHelper().getUserId();
            if (userId == null) {
                userId = "";
            }
            String lastAccount = accountHelperEntryPointImpl.getAccountHelper().getLastAccount();
            if (lastAccount == null) {
                lastAccount = "";
            }
            JSONObject jSONObjectPutOpt = new JSONObject().putOpt(psmVar.r() ? "email" : "phone", lastAccount).putOpt("defaultLanguage", languageCode).putOpt("sporty", new JSONObject().putOpt("token", lastAccessToken).putOpt("country", code).putOpt("currency", strB).putOpt("userCountry", code)).putOpt("metaTags", new JSONObject().putOpt("country", code)).putOpt("userId", userId).putOpt("token", lastAccessToken).putOpt("country", code);
            String avatarUrl = accountHelperEntryPointImpl.getAccountHelper().getAvatarUrl();
            if (avatarUrl != null) {
                str2 = avatarUrl;
            }
            JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("avatarImgUrl", str2).putOpt("appVersion", "1.82.2");
            Boolean bool = Boolean.TRUE;
            c("INIT", jSONObjectPutOpt2.putOpt("supportVoice", bool).putOpt("selectedEntity", b()).putOpt("capabilities", new JSONObject().putOpt("supportTwilioVoiceCall", bool)));
        } catch (JSONException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.o(e);
        }
    }

    public void setCallState(Call call, ev5 ev5Var, CallException callException) {
        try {
            JSONObject jSONObjectPutOpt = new JSONObject().putOpt("callState", ev5Var.name());
            if (callException != null) {
                jSONObjectPutOpt.putOpt(AnalyticsParam.EVENT_PARAM_EXCEPTION, new JSONObject().putOpt("errorCode", Integer.valueOf(callException.getErrorCode())).putOpt(LhMGMAwwhzjwfz.cHsgdb, callException.getMessage()).putOpt("explanation", callException.getExplanation()));
            }
            c("START_CALL", jSONObjectPutOpt);
        } catch (JSONException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.o(e);
        }
    }

    public void setLoginData(boolean z, String str, int i, String str2) {
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = this.a;
        psm psmVar = this.b;
        try {
            String lastAccount = accountHelperEntryPointImpl.getAccountHelper().getLastAccount();
            if (lastAccount == null) {
                lastAccount = "";
            }
            String userId = accountHelperEntryPointImpl.getAccountHelper().getUserId();
            if (userId == null) {
                userId = "";
            }
            String strB = psmVar.B();
            if (strB == null) {
                strB = "";
            }
            String code = psmVar.getCountryCode().getCode();
            if (code == null) {
                code = "";
            }
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str = "";
            }
            JSONObject jSONObjectPutOpt = jSONObject.putOpt("token", str).putOpt("bizCode", Integer.valueOf(i)).putOpt(psmVar.r() ? "email" : Chyeyik.FwbLZGNvP, lastAccount).putOpt("userId", userId).putOpt("currency", strB).putOpt("userCountry", code).putOpt("metaTags", new JSONObject().putOpt("country", code));
            if (str2 == null) {
                str2 = "";
            }
            c(z ? "LOGIN_POP" : AnalyticsEvent.LOGIN, jSONObjectPutOpt.putOpt("avatarImgUrl", str2).putOpt("selectedEntity", b()));
        } catch (JSONException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PLEASED);
            aVar.o(e);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        a();
        super.loadUrl(str, map);
    }

    public SportyDeskWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new AccountHelperEntryPointImpl();
        this.b = (psm) hwr.b(new c8b(0)).getValue();
        this.d = null;
        this.e = new b();
    }

    public SportyDeskWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new AccountHelperEntryPointImpl();
        this.b = (psm) hwr.b(new c8b(0)).getValue();
        this.d = null;
        this.e = new b();
    }
}
