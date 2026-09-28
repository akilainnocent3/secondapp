package com.sportybet.plugin.webcontainer.utils;

import android.content.Intent;
import android.webkit.CookieManager;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.kyc.phonemigration.KYCDuplicateIDWebViewResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.data.LaunchOTP;
import com.sportybet.feature.gameslobby.model.GamesLobbyResult;
import com.sportybet.feature.horseracing.model.BmSdkResult;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import defpackage.fdt;
import defpackage.h0j0;
import defpackage.hp0;
import defpackage.itf0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\u00020\u000bH\u0007b\u0002\b\fJ\u0014\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007b\u0002\b\fJ\u0014\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007b\u0002\b\fJ\u0014\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0007b\u0002\b\fJ\u0014\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0016H\u0007b\u0002\b\fJ\f\u0010\u0017\u001a\u00020\u000bH\u0007b\u0002\b\fJ\u0014\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007b\u0002\b\fJ\u001c\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0007b\u0002\b\fJ\u0014\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007b\u0002\b\fJ\f\u0010 \u001a\u00020\u000bH\u0007b\u0002\b\fJ\u0014\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H\u0007b\u0002\b\fJ\f\u0010$\u001a\u00020\u000bH\u0007b\u0002\b\fJ\f\u0010%\u001a\u00020\u000bH\u0007b\u0002\b\fJ\u0014\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0005H\u0007b\u0002\b\fJ\u0014\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0007b\u0002\b\fJ\u0016\u0010+\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007b\u0002\b\fJ\u0016\u0010,\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010-H\u0007b\u0002\b\fJ\f\u0010.\u001a\u00020\u000bH\u0007b\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b0\u0012\b\b1\u0012\u0004\b\u0003\u0010\u0002¨\u0006/"}, d2 = {"Lcom/sportybet/plugin/webcontainer/utils/WebViewActivityUtils;", "", "<init>", "()V", "URL_HOW_TO_PLAY_DEPOSIT", "", "URL_HOW_TO_PLAY_WITHDRAW", "URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY", "URL_HOW_TO_PLAY_HOW_TO_WITHDRAW", "URL_HOW_TO_PLAY_WITHHOLDING_TAX", "closeWebViewActivity", "", "Lkotlin/jvm/JvmStatic;", "onRegistrationKYCResult", AnalyticsParam.EVENT_PARAM_RESULT, "Lcom/sportybet/android/account/RegistrationKYC$Result;", "onAccountActivationResult", "data", "Lcom/sporty/android/core/model/account/AccountActivationData;", "onGamesLobbyResult", "Lcom/sportybet/feature/gameslobby/model/GamesLobbyResult;", "onBmSdkResult", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "removeAllCookies", "onMatchTrackerHeightReceived", "height", "", "onOpenBottomSheetReceived", "title", "content", "onShareWinImageReceived", "dataUrl", "onGenerateShareImageJsErrorReceived", "onLaunchOTP", "launchOTP", "Lcom/sportybet/android/data/LaunchOTP;", "onOpenMarket", "goBack", "onSaveCloudflareResult", "token", "launchAddNewPhoneFlow", "phoneMigration", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "onFacialRecognition", "onTelegramLogin", "Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "showEmailTwoStepAuthSuccessSnackbar", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WebViewActivityUtils {
    public static final int $stable = 0;
    public static final WebViewActivityUtils INSTANCE = new WebViewActivityUtils();
    public static final String URL_HOW_TO_PLAY_DEPOSIT = "/m/help#/how-to-play/others/how-to-deposit";
    public static final String URL_HOW_TO_PLAY_HOW_TO_WITHDRAW = "/m/help#/how-to-play/others/how-to-withdraw";
    public static final String URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY = "/m/help#/how-to-play/others/how-to-view-transactions-and-bet-history";
    public static final String URL_HOW_TO_PLAY_WITHDRAW = "/m/help#/how-to-play/others/how-to-withdraw";
    public static final String URL_HOW_TO_PLAY_WITHHOLDING_TAX = "/m/help#/how-to-play/others/withholding-tax";

    private WebViewActivityUtils() {
    }

    public static final void closeWebViewActivity() {
        Intent intentPutExtra = new Intent("com.sportybet.action.JS_EVENT").setPackage(hp0.A.getPackageName()).putExtra("eventName", "finishWeb");
        intentPutExtra.getClass();
        fdt.a(hp0.A).c(intentPutExtra);
    }

    public static final void goBack() {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "goBack");
        fdt.a(hp0.A).c(intent);
    }

    public static final void launchAddNewPhoneFlow(KYCDuplicateIDWebViewResponse phoneMigration) {
        phoneMigration.getClass();
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "duplicateID");
        intent.putExtra("data", phoneMigration);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onAccountActivationResult(AccountActivationData data) {
        data.getClass();
        Intent intentPutExtra = new Intent("com.sportybet.action.JS_EVENT").setPackage(hp0.A.getPackageName()).putExtra("eventName", "accountActivationResult").putExtra("data", data);
        intentPutExtra.getClass();
        fdt.a(hp0.A).c(intentPutExtra);
    }

    public static final void onBmSdkResult(BmSdkResult result) {
        result.getClass();
        Intent intentPutExtra = new Intent("com.sportybet.action.JS_EVENT").setPackage(hp0.A.getPackageName()).putExtra("eventName", "bmSdkResult").putExtra("data", result);
        intentPutExtra.getClass();
        fdt.a(hp0.A).c(intentPutExtra);
    }

    public static final void onFacialRecognition(String result) {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "facialRecognitionResult");
        if (result == null) {
            result = "";
        }
        intent.putExtra("data", result);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onGamesLobbyResult(GamesLobbyResult result) {
        result.getClass();
        Intent intentPutExtra = new Intent("com.sportybet.action.JS_EVENT").setPackage(hp0.A.getPackageName()).putExtra("eventName", "gamesLobbyResult").putExtra("data", result);
        intentPutExtra.getClass();
        fdt.a(hp0.A).c(intentPutExtra);
    }

    public static final void onGenerateShareImageJsErrorReceived() {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "generateShareImageJSReturnNull");
        fdt.a(hp0.A).c(intent);
    }

    public static final void onLaunchOTP(LaunchOTP launchOTP) {
        launchOTP.getClass();
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "nameMissMatch");
        intent.putExtra("data", launchOTP);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onMatchTrackerHeightReceived(int height) {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "updateMatchTrackerHeight");
        intent.putExtra("data", height);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onOpenBottomSheetReceived(String title, String content) {
        title.getClass();
        content.getClass();
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "openBottomSheet");
        intent.putExtra("data", new String[]{title, content});
        fdt.a(hp0.A).c(intent);
    }

    public static final void onOpenMarket() {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "openMarket");
        fdt.a(hp0.A).c(intent);
    }

    public static final void onRegistrationKYCResult(RegistrationKYC$Result result) {
        result.getClass();
        Intent intentPutExtra = new Intent("com.sportybet.action.JS_EVENT").setPackage(hp0.A.getPackageName()).putExtra("eventName", "registrationKYCResult").putExtra("data", result);
        intentPutExtra.getClass();
        fdt.a(hp0.A).c(intentPutExtra);
    }

    public static final void onSaveCloudflareResult(String token) {
        token.getClass();
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "preloadCloudflare");
        intent.putExtra("data", token);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onShareWinImageReceived(String dataUrl) {
        dataUrl.getClass();
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "generateImage");
        intent.putExtra("data", dataUrl);
        fdt.a(hp0.A).c(intent);
    }

    public static final void onTelegramLogin(JsBridgeParams result) {
        if (result == null) {
            return;
        }
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "telegramLogin");
        intent.putExtra("data", result.getJsonParams());
        fdt.a(hp0.A).c(intent);
    }

    public static final void removeAllCookies() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WEB);
        aVar.a("remove WebView cookies", new Object[0]);
        try {
            CookieManager cookieManagerA = h0j0.a();
            if (cookieManagerA != null) {
                cookieManagerA.removeAllCookies(null);
                cookieManagerA.flush();
            }
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_WEB);
            aVar2.p(e, "Unable to remove cookies", new Object[0]);
        }
    }

    public static final void showEmailTwoStepAuthSuccessSnackbar() {
        Intent intent = new Intent("com.sportybet.action.JS_EVENT");
        intent.setPackage(hp0.A.getPackageName());
        intent.putExtra("eventName", "showTwoFASuccessSnackbar");
        fdt.a(hp0.A).c(intent);
    }
}
