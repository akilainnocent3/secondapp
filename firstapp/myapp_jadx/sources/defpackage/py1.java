package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.base.a;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 Ð\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Ñ\u0001Ò\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010\u0005J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\u0005J\u000f\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b%\u0010\u0005J\u0019\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0018J\u0015\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0013¢\u0006\u0004\b,\u0010 J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0005J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0005J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u0010\u0005J/\u00107\u001a\u0002062\b\b\u0001\u00102\u001a\u0002012\u0016\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010403\"\u0004\u0018\u000104¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b9\u0010\u0005J.\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u0002062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0<H\u0096\u0001¢\u0006\u0004\b?\u0010@J6\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\u00062\u0006\u0010A\u001a\u0002062\u0006\u0010;\u001a\u0002062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0<H\u0096\u0001¢\u0006\u0004\b?\u0010BJ\u0010\u0010C\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\bC\u0010\u0005J\u0013\u0010D\u001a\u00020\b*\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u0005J\u000f\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bG\u0010\u0005J\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00132\u0006\u0010O\u001a\u00020LH\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010T\u001a\u00020\b2\u0006\u0010R\u001a\u0002062\u0006\u0010=\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010\u0005J\u000f\u0010W\u001a\u00020\bH\u0002¢\u0006\u0004\bW\u0010\u0005J\u000f\u0010X\u001a\u00020\bH\u0002¢\u0006\u0004\bX\u0010\u0005J\u0013\u0010Y\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bY\u0010KR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010b\u001a\u00020a8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010+\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010lR\u0016\u0010o\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001c\u0010\u0080\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010x\u001a\u0004\b~\u0010\u007fR*\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R*\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R*\u0010¥\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R7\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u0002060«\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\b¬\u0001\u0010\u00ad\u0001\u0012\u0005\b²\u0001\u0010\u0005\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010´\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R*\u0010»\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R*\u0010Â\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R*\u0010É\u0001\u001a\u00030È\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R\u0016\u0010Ï\u0001\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u0018¨\u0006Ó\u0001"}, d2 = {"Lpy1;", "Lr1k;", "Li8;", "Ly02;", "<init>", "()V", "Landroid/content/Context;", "newBase", "", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "", "avoidNavigationBarOverlap", "addContentView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;Z)V", "showRationalPermissions", "()Z", "", "latitude", "longitude", "getAddressFromLocation", "(DD)V", "isForPlacingBet", "requestTheUserLocation", "(Z)V", "checkAndRequestPermissions", "showPermissionDeniedMessage", "onResume", "onPause", "onDestroy", "Landroid/accounts/Account;", "account", "onAccountChange", "(Landroid/accounts/Account;)V", "isRequireBetslipBtnLater", "requireBetslipBtnLater", "setRequireBetslipBtnLater", "recreateActivity", "keepActivity", "disableKeepActivity", "saveDataBeforeRecreate", "", "resId", "", "", "args", "", "getCMSString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "dismissDialog", "ctx", "errMsg", "Lkotlin/Function0;", py1.ACTION, "Landroidx/appcompat/app/b;", "showDialog", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/appcompat/app/b;", "title", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/appcompat/app/b;", "clearDialog", "applyNavigationBarOverlapPadding", "(Landroid/view/View;)V", "showPermissionRationaleDialog", "observeLanguage", "Lv5b;", "Lc9p;", "collectCloudflareParams", "(Lv5b;)Lc9p;", "Landroid/content/Intent;", "prepareIntentForRecreateActivity", "()Landroid/content/Intent;", "intent", "isActivityNeedRestart", "(Landroid/content/Intent;)Z", py1.SITE_KEY, "Lj6c;", "preloadCloudflare", "(Ljava/lang/String;Lj6c;)V", "registerCloudflareResultBroadcastReceiver", "unregisterCloudflareResultBroadcastReceiver", "destroyCloudflareWebView", "collectSurveyVisibility", "Lpsm;", "countryManager", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "Luqm;", "accountHelper", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "Ljb40;", "realtimeCMSRepo", "Ljb40;", "requireAccount", "Z", "requireBetslipBtn", "requireSportyDeskBtn", "shouldRecreateActivity", "Landroid/webkit/WebView;", "cloudflareWebView", "Landroid/webkit/WebView;", "Lst7;", "cloudflareResultBroadcastReceiver", "Lst7;", "Lomr;", "languageViewModel$delegate", "Lttr;", "getLanguageViewModel", "()Lomr;", "languageViewModel", "Lau7;", "cloudflareViewModel$delegate", "getCloudflareViewModel", "()Lau7;", "cloudflareViewModel", "Lgtm;", "foreground", "Lgtm;", "getForeground", "()Lgtm;", "setForeground", "(Lgtm;)V", "Lmet;", "locationHelperFactory", "Lmet;", "getLocationHelperFactory", "()Lmet;", "setLocationHelperFactory", "(Lmet;)V", "Lmrm;", "betslipManager", "Lmrm;", "getBetslipManager", "()Lmrm;", "setBetslipManager", "(Lmrm;)V", "Lgzm;", "sportyDeskManager", "Lgzm;", "getSportyDeskManager", "()Lgzm;", "setSportyDeskManager", "(Lgzm;)V", "Lsym;", "popupQueueOverlayManager", "Lsym;", "getPopupQueueOverlayManager", "()Lsym;", "setPopupQueueOverlayManager", "(Lsym;)V", "Li0j0;", "webViewWrapperService", "Li0j0;", "getWebViewWrapperService", "()Li0j0;", "setWebViewWrapperService", "(Li0j0;)V", "Lstr;", "cloudflareUrl", "Lstr;", "getCloudflareUrl", "()Lstr;", "setCloudflareUrl", "(Lstr;)V", "getCloudflareUrl$annotations", "Loje0;", "surveyWebViewManager", "Loje0;", "getSurveyWebViewManager", "()Loje0;", "setSurveyWebViewManager", "(Loje0;)V", "Ltta;", "confirmNameDialogLauncher", "Ltta;", "getConfirmNameDialogLauncher", "()Ltta;", "setConfirmNameDialogLauncher", "(Ltta;)V", "Lmgb0;", "accountManager", "Lmgb0;", "getAccountManager", "()Lmgb0;", "setAccountManager", "(Lmgb0;)V", "Lqet;", "locationPermissionHelper", "Lqet;", "getLocationPermissionHelper", "()Lqet;", "setLocationPermissionHelper", "(Lqet;)V", "isDialogShowing", "Companion", "b", "a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class py1 extends a implements i8, y02 {
    public static final int $stable = 8;
    private static final String ACTION = "action";
    private static final String AuthActivityName = "com.sportybet.android.auth.AuthActivity";
    private static final String IntAuthActivityName = "com.sportybet.android.account.international.AuthActivity";
    public static final String PENDING_RECREATE_ACTIVITY = "PENDING_RECREATE_ACTIVITY";
    private static final String SITE_KEY = "siteKey";
    private static final String SelfExclusionDialogActivityName = "com.sportybet.android.user.SelfExclusionDialogActivity";
    private static final String THEME = "theme";
    protected uqm accountHelper;
    public mgb0 accountManager;
    public mrm betslipManager;
    private st7 cloudflareResultBroadcastReceiver;
    public str<String> cloudflareUrl;
    private WebView cloudflareWebView;
    public tta confirmNameDialogLauncher;
    public psm countryManager;
    public gtm foreground;
    public met locationHelperFactory;
    public qet locationPermissionHelper;
    public sym popupQueueOverlayManager;
    private jb40 realtimeCMSRepo;
    private boolean requireAccount;
    private boolean requireBetslipBtn;
    private boolean requireBetslipBtnLater;
    private boolean requireSportyDeskBtn;
    public gzm sportyDeskManager;
    public oje0 surveyWebViewManager;
    public i0j0 webViewWrapperService;
    private final /* synthetic */ b12 $$delegate_0 = new b12();
    private boolean shouldRecreateActivity = true;

    /* JADX INFO: renamed from: languageViewModel$delegate, reason: from kotlin metadata */
    private final ttr languageViewModel = new q8i0(jq40.a(omr.class), new l(), new k(), new m());

    /* JADX INFO: renamed from: cloudflareViewModel$delegate, reason: from kotlin metadata */
    private final ttr cloudflareViewModel = new q8i0(jq40.a(au7.class), new o(), new n(), new p());

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lpy1$b;", "", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface b {
        jb40 I();

        uqm getAccountHelper();
    }

    public static final class c implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public c(View view, View view2, int i, int i2) {
            this.a = view;
            this.b = view2;
            this.c = i;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int[] iArr = new int[2];
            View view = this.b;
            view.getLocationInWindow(iArr);
            int height = view.getHeight() + iArr[1];
            int height2 = view.getRootView().getHeight();
            int i = this.c;
            int iE = this.d + kotlin.ranges.f.e(height - (height2 - i), 0, i);
            if (view.getPaddingBottom() != iE) {
                view.getClass();
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iE);
            }
        }
    }

    @c0d(c = "com.sporty.android.common.base.BaseActivity$collectCloudflareParams$1", f = "BaseActivity.kt", l = {389}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ py1 a;

            public a(py1 py1Var) {
                this.a = py1Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                j6c j6cVar;
                rt7 rt7Var = (rt7) obj;
                String str = rt7Var.a;
                j6c j6cVar2 = rt7Var.b;
                if (str.length() > 0 && j6cVar2 != (j6cVar = j6c.INITIAL)) {
                    py1 py1Var = this.a;
                    py1Var.preloadCloudflare(str, j6cVar2);
                    py1Var.getCloudflareViewModel().x1(j6cVar);
                }
                return Unit.a;
            }
        }

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return py1.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to py1$d for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L10:
                defpackage.uj50.b(r6)
                goto L2f
            L14:
                defpackage.uj50.b(r6)
                py1 r6 = defpackage.py1.this
                au7 r1 = defpackage.py1.access$getCloudflareViewModel(r6)
                t340 r1 = r1.e
                py1$d$a r4 = new py1$d$a
                r4.<init>(r6)
                r5.a = r3
                a390<T> r6 = r1.a
                java.lang.Object r5 = r6.collect(r4, r5)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: py1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.common.base.BaseActivity$collectSurveyVisibility$1", f = "BaseActivity.kt", l = {508}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ py1 a;

            public a(py1 py1Var) {
                this.a = py1Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                if (((dje0) obj) == dje0.a) {
                    FragmentManager supportFragmentManager = null;
                    try {
                        Context contextB = dvi.b(this.a);
                        contextB.getClass();
                        supportFragmentManager = ((androidx.fragment.app.e) contextB).getSupportFragmentManager();
                        if (supportFragmentManager.H("SurveyDialogFragment") != null) {
                            itf0.a aVar = itf0.a;
                            aVar.q("SurveyDialogFragment");
                            aVar.a("a dialog is already on the screen", new Object[0]);
                        } else if (supportFragmentManager != null && !supportFragmentManager.K) {
                            new pie0().show(supportFragmentManager, "SurveyDialogFragment");
                        }
                    } catch (ClassCastException unused) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("SurveyDialogFragment");
                        aVar2.a("Can't get fragment manager", new Object[0]);
                    }
                }
                return Unit.a;
            }
        }

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return py1.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to py1$e for r5v2 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L10:
                defpackage.uj50.b(r6)
                goto L2f
            L14:
                defpackage.uj50.b(r6)
                py1 r6 = defpackage.py1.this
                oje0 r1 = r6.getSurveyWebViewManager()
                t340 r1 = r1.m
                py1$e$a r4 = new py1$e$a
                r4.<init>(r6)
                r5.a = r3
                a390<T> r6 = r1.a
                java.lang.Object r5 = r6.collect(r4, r5)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                defpackage.fkd.a()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: py1.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.common.base.BaseActivity$onAccountChange$1", f = "BaseActivity.kt", l = {360, 362}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return py1.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r6.c(r4, r1, r5) == r0) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 2
                r3 = 1
                py1 r4 = defpackage.py1.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                defpackage.uj50.b(r6)
                goto L46
            L12:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L19:
                defpackage.uj50.b(r6)
                goto L2d
            L1d:
                defpackage.uj50.b(r6)
                mgb0 r6 = r4.getAccountManager()
                r5.a = r3
                java.lang.Object r6 = r6.getUserCertStatus(r5)
                if (r6 != r0) goto L2d
                goto L45
            L2d:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r1 = 310(0x136, float:4.34E-43)
                if (r6 != r1) goto L46
                tta r6 = r4.getConfirmNameDialogLauncher()
                vtp r1 = defpackage.vtp.LOGIN
                r5.a = r2
                java.lang.Object r5 = r6.c(r4, r1, r5)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: py1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.common.base.BaseActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "BaseActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ py1 b;
        public final /* synthetic */ py1 c;

        @c0d(c = "com.sporty.android.common.base.BaseActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "BaseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ py1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(py1 py1Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = py1Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.collectCloudflareParams(v5bVar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(py1 py1Var, v1b v1bVar, py1 py1Var2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = py1Var;
            this.c = py1Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new g(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.common.base.BaseActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2", f = "BaseActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ py1 b;
        public final /* synthetic */ py1 c;

        @c0d(c = "com.sporty.android.common.base.BaseActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2$1", f = "BaseActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ py1 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(py1 py1Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = py1Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.collectSurveyVisibility(v5bVar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(py1 py1Var, v1b v1bVar, py1 py1Var2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = py1Var;
            this.c = py1Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new h(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(this.c, null);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class i extends WebViewClient {
        public i() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            py1 py1Var = py1.this;
            py1Var.getCloudflareViewModel().y1(qt7.a);
            au7 cloudflareViewModel = py1Var.getCloudflareViewModel();
            cloudflareViewModel.getClass();
            ej5.c(o8i0.d(cloudflareViewModel), cloudflareViewModel.b, null, new vt7(str, cloudflareViewModel, null), 2);
        }
    }

    public static final class j implements lfy, paj {
        public final /* synthetic */ oy1 a;

        public j(oy1 oy1Var) {
            this.a = oy1Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return py1.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class l extends qlr implements Function0<v8i0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return py1.this.getViewModelStore();
        }
    }

    public static final class m extends qlr implements Function0<cyb> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return py1.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class n extends qlr implements Function0<r8i0.c> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return py1.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class o extends qlr implements Function0<v8i0> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return py1.this.getViewModelStore();
        }
    }

    public static final class p extends qlr implements Function0<cyb> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return py1.this.getDefaultViewModelCreationExtras();
        }
    }

    public static /* synthetic */ void addContentView$default(py1 py1Var, View view, ViewGroup.LayoutParams layoutParams, boolean z, int i2, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: addContentView");
            return;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        py1Var.addContentView(view, layoutParams, z);
    }

    private final void applyNavigationBarOverlapPadding(View view) {
        final int paddingBottom = view.getPaddingBottom();
        zmy zmyVar = new zmy() { // from class: ly1
            @Override // defpackage.zmy
            public final l8j0 b(View view2, l8j0 l8j0Var) {
                return py1.applyNavigationBarOverlapPadding$lambda$0(paddingBottom, view2, l8j0Var);
            }
        };
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(view, zmyVar);
        r6i0.c.c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l8j0 applyNavigationBarOverlapPadding$lambda$0(int i2, View view, l8j0 l8j0Var) {
        view.getClass();
        l8j0Var.getClass();
        qry.a(view, new c(view, view, l8j0Var.a.g(2).d, i2));
        return l8j0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c9p collectCloudflareParams(v5b v5bVar) {
        return ej5.c(v5bVar, null, null, new d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c9p collectSurveyVisibility(v5b v5bVar) {
        return ej5.c(v5bVar, null, null, new e(null), 3);
    }

    private final void destroyCloudflareWebView() {
        WebView webView = this.cloudflareWebView;
        if (webView == null) {
            return;
        }
        getWebViewWrapperService().uninstallJsBridge(webView);
        webView.clearHistory();
        webView.clearCache(true);
        webView.onPause();
        webView.removeAllViews();
        webView.destroy();
        this.cloudflareWebView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final au7 getCloudflareViewModel() {
        return (au7) this.cloudflareViewModel.getValue();
    }

    private final omr getLanguageViewModel() {
        return (omr) this.languageViewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[RETURN] */
    private final boolean isActivityNeedRestart(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return true;
        }
        String className = component.getClassName();
        int iHashCode = className.hashCode();
        if (iHashCode != 72075044) {
            if (iHashCode != 831339343) {
                if (getAccountHelper().isLogin()) {
                    return false;
                }
                return true;
            }
            if (getAccountHelper().isLogin()) {
                return true;
            }
            return false;
        }
        if (className.equals(SelfExclusionDialogActivityName)) {
            return getAccountHelper().isLogin();
        }
        return true;
    }

    private final void observeLanguage() {
        omr languageViewModel = getLanguageViewModel();
        i2i.c(new nmr(uzh.b(r0i.f(languageViewModel.b.getState(), new mmr(null, languageViewModel))), languageViewModel), o8i0.d(languageViewModel).a, 2).f(this, new j(new oy1(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeLanguage$lambda$0(py1 py1Var, Boolean bool) {
        if (py1Var.shouldRecreateActivity && bool.booleanValue()) {
            py1Var.recreateActivity();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void preloadCloudflare(String siteKey, j6c action) {
        String str = getCloudflareUrl().get();
        str.getClass();
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter(SITE_KEY, siteKey).appendQueryParameter(ACTION, action.a);
        Application application = getApplication();
        application.getClass();
        Uri uriBuild = builderAppendQueryParameter.appendQueryParameter(THEME, r0b.b(application)).build();
        i iVar = new i();
        try {
            WebView webView = new WebView(this);
            getWebViewWrapperService().installJsBridge(this, webView, iVar, new WebChromeClient());
            this.cloudflareWebView = webView;
            webView.loadUrl(uriBuild.toString());
        } catch (Exception e2) {
            itf0.a.d("Create cloudflareWebView failed: " + e2, new Object[0]);
            getCloudflareViewModel().y1(qt7.b);
        }
    }

    private final Intent prepareIntentForRecreateActivity() {
        saveDataBeforeRecreate();
        Intent intent = getIntent();
        intent.addFlags(65536);
        return intent;
    }

    private final void registerCloudflareResultBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.sportybet.action.JS_EVENT");
        if (this.cloudflareResultBroadcastReceiver == null) {
            this.cloudflareResultBroadcastReceiver = new st7();
        }
        fdt fdtVarA = fdt.a(this);
        st7 st7Var = this.cloudflareResultBroadcastReceiver;
        if (st7Var != null) {
            fdtVarA.b(st7Var, intentFilter);
        } else {
            Intrinsics.n("cloudflareResultBroadcastReceiver");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionDeniedMessage$lambda$0(py1 py1Var, DialogInterface dialogInterface, int i2) {
        qet locationPermissionHelper = py1Var.getLocationPermissionHelper();
        locationPermissionHelper.getClass();
        py1 py1Var2 = locationPermissionHelper.a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", py1Var2.getPackageName(), null));
        intent.addFlags(268435456);
        py1Var2.startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ny1] */
    private final void showPermissionRationaleDialog() {
        String cMSString = getCMSString(R.string.app_common__location_permission_required, new Object[0]);
        ime.b(this, new ple(getCMSString(R.string.app_common__bet_location_permission_message, new Object[0]), getCMSString(R.string.common_functions__allow, new Object[0]), new DialogInterface.OnClickListener() { // from class: my1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                py1.showPermissionRationaleDialog$lambda$0(this.a, dialogInterface, i2);
            }
        }, getCMSString(R.string.common_functions__deny, new Object[0]), (ny1) new DialogInterface.OnClickListener() { // from class: ny1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                py1.showPermissionRationaleDialog$lambda$1(this.a, dialogInterface, i2);
            }
        }, cMSString, 64));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionRationaleDialog$lambda$0(py1 py1Var, DialogInterface dialogInterface, int i2) {
        qet locationPermissionHelper = py1Var.getLocationPermissionHelper();
        locationPermissionHelper.l.b(locationPermissionHelper.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPermissionRationaleDialog$lambda$1(py1 py1Var, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        py1Var.showPermissionDeniedMessage();
    }

    private final void unregisterCloudflareResultBroadcastReceiver() {
        if (this.cloudflareResultBroadcastReceiver != null) {
            fdt fdtVarA = fdt.a(this);
            st7 st7Var = this.cloudflareResultBroadcastReceiver;
            if (st7Var == null) {
                Intrinsics.n("cloudflareResultBroadcastReceiver");
                throw null;
            }
            fdtVarA.d(st7Var);
            getCloudflareViewModel().y1(qt7.b);
        }
    }

    public final void addContentView(View view, ViewGroup.LayoutParams params, boolean avoidNavigationBarOverlap) {
        super.addContentView(view, params);
        if (!avoidNavigationBarOverlap || view == null) {
            return;
        }
        applyNavigationBarOverlapPadding(view);
    }

    @Override // defpackage.fq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        Locale locale;
        Locale locale2;
        newBase.getClass();
        b bVar = (b) qag.a(newBase, b.class);
        setAccountHelper(bVar.getAccountHelper());
        this.realtimeCMSRepo = bVar.I();
        String languageCode = getAccountHelper().getLanguageCode();
        if (languageCode == null) {
            locale2 = new Locale("en", "US");
        } else if (languageCode.equals("sw")) {
            locale2 = new Locale("sw");
        } else {
            List listSplit$default = StringsKt__StringsKt.split$default(languageCode, new String[]{"-"}, false, 0, 6, null);
            int size = listSplit$default.size();
            if (size == 1) {
                locale = new Locale((String) CollectionsKt.T(listSplit$default));
            } else if (size != 2) {
                locale2 = new Locale("en", "US");
            } else {
                String str = (String) CollectionsKt.T(listSplit$default);
                String upperCase = ((String) CollectionsKt.b0(listSplit$default)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                locale = new Locale(str, upperCase);
            }
            locale2 = locale;
        }
        Resources resources = newBase.getResources();
        resources.getClass();
        Configuration configuration = resources.getConfiguration();
        LocaleList localeList = new LocaleList(locale2);
        LocaleList.setDefault(localeList);
        configuration.setLocale(locale2);
        configuration.setLocales(localeList);
        if (Build.VERSION.SDK_INT >= 25) {
            newBase = newBase.createConfigurationContext(configuration);
            newBase.getClass();
        } else {
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        ContextWrapper contextWrapper = new ContextWrapper(newBase);
        Configuration configuration2 = contextWrapper.getResources().getConfiguration();
        boolean z = this instanceof bb40;
        configuration2.getClass();
        jb40 jb40Var = this.realtimeCMSRepo;
        if (jb40Var != null) {
            super.attachBaseContext(new ln5(contextWrapper, z, configuration2, jb40Var));
        } else {
            Intrinsics.n("realtimeCMSRepo");
            throw null;
        }
    }

    public final void checkAndRequestPermissions(boolean isForPlacingBet) {
        qet locationPermissionHelper = getLocationPermissionHelper();
        for (String str : locationPermissionHelper.j) {
            if (o0b.a(locationPermissionHelper.a, str) != 0) {
                f990 f990Var = getLocationPermissionHelper().i;
                if (f990Var != null ? f990Var.a() : false) {
                    showPermissionRationaleDialog();
                    return;
                } else {
                    qet locationPermissionHelper2 = getLocationPermissionHelper();
                    locationPermissionHelper2.l.b(locationPermissionHelper2.j);
                    return;
                }
            }
        }
        getLocationPermissionHelper().b(isForPlacingBet);
    }

    public void clearDialog() {
        b12 b12Var = this.$$delegate_0;
        androidx.appcompat.app.b bVar = b12Var.a;
        if (bVar != null) {
            bVar.dismiss();
        }
        b12Var.a = null;
    }

    public final void disableKeepActivity() {
        this.shouldRecreateActivity = true;
    }

    public void dismissDialog() {
        androidx.appcompat.app.b bVar = this.$$delegate_0.a;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final mgb0 getAccountManager() {
        mgb0 mgb0Var = this.accountManager;
        if (mgb0Var != null) {
            return mgb0Var;
        }
        Intrinsics.n("accountManager");
        throw null;
    }

    public final void getAddressFromLocation(double latitude, double longitude) {
        qet locationPermissionHelper = getLocationPermissionHelper();
        ej5.c(ebs.a(locationPermissionHelper.a.getLifecycle()), null, null, new oet(locationPermissionHelper, latitude, longitude, null), 3);
    }

    public final mrm getBetslipManager() {
        mrm mrmVar = this.betslipManager;
        if (mrmVar != null) {
            return mrmVar;
        }
        Intrinsics.n("betslipManager");
        throw null;
    }

    public final String getCMSString(int resId, Object... args) {
        args.getClass();
        return sn5.b(this, resId, Arrays.copyOf(args, args.length));
    }

    public final str<String> getCloudflareUrl() {
        str<String> strVar = this.cloudflareUrl;
        if (strVar != null) {
            return strVar;
        }
        Intrinsics.n("cloudflareUrl");
        throw null;
    }

    public final tta getConfirmNameDialogLauncher() {
        tta ttaVar = this.confirmNameDialogLauncher;
        if (ttaVar != null) {
            return ttaVar;
        }
        Intrinsics.n("confirmNameDialogLauncher");
        throw null;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final gtm getForeground() {
        gtm gtmVar = this.foreground;
        if (gtmVar != null) {
            return gtmVar;
        }
        Intrinsics.n("foreground");
        throw null;
    }

    public final met getLocationHelperFactory() {
        met metVar = this.locationHelperFactory;
        if (metVar != null) {
            return metVar;
        }
        Intrinsics.n("locationHelperFactory");
        throw null;
    }

    public final qet getLocationPermissionHelper() {
        qet qetVar = this.locationPermissionHelper;
        if (qetVar != null) {
            return qetVar;
        }
        Intrinsics.n("locationPermissionHelper");
        throw null;
    }

    public final sym getPopupQueueOverlayManager() {
        sym symVar = this.popupQueueOverlayManager;
        if (symVar != null) {
            return symVar;
        }
        Intrinsics.n("popupQueueOverlayManager");
        throw null;
    }

    public final gzm getSportyDeskManager() {
        gzm gzmVar = this.sportyDeskManager;
        if (gzmVar != null) {
            return gzmVar;
        }
        Intrinsics.n("sportyDeskManager");
        throw null;
    }

    public final oje0 getSurveyWebViewManager() {
        oje0 oje0Var = this.surveyWebViewManager;
        if (oje0Var != null) {
            return oje0Var;
        }
        Intrinsics.n("surveyWebViewManager");
        throw null;
    }

    public final i0j0 getWebViewWrapperService() {
        i0j0 i0j0Var = this.webViewWrapperService;
        if (i0j0Var != null) {
            return i0j0Var;
        }
        Intrinsics.n("webViewWrapperService");
        throw null;
    }

    public boolean isDialogShowing() {
        androidx.appcompat.app.b bVar = this.$$delegate_0.a;
        if (bVar != null) {
            return bVar.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: isRequireBetslipBtnLater, reason: from getter */
    public final boolean getRequireBetslipBtnLater() {
        return this.requireBetslipBtnLater;
    }

    public final void keepActivity() {
        this.shouldRecreateActivity = false;
    }

    public void onAccountChange(Account account) {
        if (getCountryManager().x()) {
            ej5.c(ebs.a(getLifecycle()), null, null, new f(null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        py1 py1Var;
        if (this instanceof bb40) {
            LayoutInflater layoutInflater = getLayoutInflater();
            androidx.appcompat.app.c delegate = getDelegate();
            delegate.getClass();
            jb40 jb40Var = this.realtimeCMSRepo;
            if (jb40Var == null) {
                Intrinsics.n("realtimeCMSRepo");
                throw null;
            }
            layoutInflater.setFactory2(new lu7(delegate, jb40Var));
        }
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 35 || (this instanceof rlf)) {
            py1Var = this;
        } else {
            int color = getColor(R.color.colorPrimaryDark);
            int color2 = getColor(R.color.background_general_primary);
            int color3 = getColor(R.color.absolute_type3);
            ViewGroup contentView = getContentView();
            if (contentView != null) {
                py1Var = this;
                ulf.b(py1Var, color, color2, color3, contentView, 16);
            } else {
                py1Var = this;
            }
        }
        py1Var.setLocationPermissionHelper(py1Var.getLocationHelperFactory().a(py1Var));
        try {
            py1Var.setRequestedOrientation(1);
        } catch (Exception e2) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BASE_ACTIVITY);
            aVar.f(e2, "Fail to set Portrait Orientation", new Object[0]);
        }
        boolean z = py1Var instanceof vym;
        py1Var.requireAccount = z;
        py1Var.requireBetslipBtn = py1Var instanceof wym;
        py1Var.requireSportyDeskBtn = py1Var instanceof xym;
        if (z) {
            py1Var.getAccountHelper().addAccountChangeListener(py1Var);
        }
        if (py1Var instanceof to20) {
            py1Var.registerCloudflareResultBroadcastReceiver();
            s9s.b bVar = s9s.b.a;
            ej5.c(ebs.a(py1Var.getLifecycle()), null, null, new g(py1Var, null, py1Var), 3);
        }
        s9s.b bVar2 = s9s.b.a;
        ej5.c(ebs.a(py1Var.getLifecycle()), null, null, new h(py1Var, null, py1Var), 3);
        py1Var.observeLanguage();
    }

    @Override // defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        if (this.requireAccount) {
            getAccountHelper().removeAccountChangeListener(this);
        }
        clearDialog();
        unregisterCloudflareResultBroadcastReceiver();
        destroyCloudflareWebView();
        oje0 surveyWebViewManager = getSurveyWebViewManager();
        w5b.c(surveyWebViewManager.l, null);
        h5b h5bVar = surveyWebViewManager.j;
        if (h5bVar != null) {
            h5bVar.a();
        }
        WeakReference<WebView> weakReference = surveyWebViewManager.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        surveyWebViewManager.g = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.requireBetslipBtn && getForeground().b() == 0) {
            getBetslipManager().a(this, false);
        }
        if (this.requireSportyDeskBtn) {
            getSportyDeskManager().a(this, false);
        }
        getPopupQueueOverlayManager().getClass();
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.getClass();
        lop.b(viewFindViewById, Boolean.FALSE);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.requireBetslipBtn && !this.requireBetslipBtnLater && getForeground().b() == 1) {
            getBetslipManager().a(this, true);
        }
        if (this.requireSportyDeskBtn) {
            getSportyDeskManager().a(this, true);
        }
        getPopupQueueOverlayManager().getClass();
    }

    public final void recreateActivity() {
        Intent intentPrepareIntentForRecreateActivity = prepareIntentForRecreateActivity();
        if (intentPrepareIntentForRecreateActivity.getBooleanExtra(PENDING_RECREATE_ACTIVITY, false)) {
            return;
        }
        finish();
        if (isActivityNeedRestart(intentPrepareIntentForRecreateActivity)) {
            startActivity(intentPrepareIntentForRecreateActivity);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    public final void requestTheUserLocation(boolean isForPlacingBet) {
        getLocationPermissionHelper().b(isForPlacingBet);
    }

    public void saveDataBeforeRecreate() {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LANGUAGE);
        aVar.a("saveDataBeforeRecreate", new Object[0]);
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setAccountManager(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.accountManager = mgb0Var;
    }

    public final void setBetslipManager(mrm mrmVar) {
        mrmVar.getClass();
        this.betslipManager = mrmVar;
    }

    public final void setCloudflareUrl(str<String> strVar) {
        strVar.getClass();
        this.cloudflareUrl = strVar;
    }

    public final void setConfirmNameDialogLauncher(tta ttaVar) {
        ttaVar.getClass();
        this.confirmNameDialogLauncher = ttaVar;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setForeground(gtm gtmVar) {
        gtmVar.getClass();
        this.foreground = gtmVar;
    }

    public final void setLocationHelperFactory(met metVar) {
        metVar.getClass();
        this.locationHelperFactory = metVar;
    }

    public final void setLocationPermissionHelper(qet qetVar) {
        qetVar.getClass();
        this.locationPermissionHelper = qetVar;
    }

    public final void setPopupQueueOverlayManager(sym symVar) {
        symVar.getClass();
        this.popupQueueOverlayManager = symVar;
    }

    public final void setRequireBetslipBtnLater(boolean requireBetslipBtnLater) {
        this.requireBetslipBtnLater = requireBetslipBtnLater;
    }

    public final void setSportyDeskManager(gzm gzmVar) {
        gzmVar.getClass();
        this.sportyDeskManager = gzmVar;
    }

    public final void setSurveyWebViewManager(oje0 oje0Var) {
        oje0Var.getClass();
        this.surveyWebViewManager = oje0Var;
    }

    public final void setWebViewWrapperService(i0j0 i0j0Var) {
        i0j0Var.getClass();
        this.webViewWrapperService = i0j0Var;
    }

    public androidx.appcompat.app.b showDialog(Context ctx, String title, String errMsg, Function0<Unit> action) {
        ctx.getClass();
        title.getClass();
        errMsg.getClass();
        action.getClass();
        return this.$$delegate_0.a(ctx, title, errMsg, action);
    }

    public final void showPermissionDeniedMessage() {
        String cMSString = getCMSString(R.string.common_functions__permission_denied, new Object[0]);
        ime.b(this, new ple(getCMSString(R.string.app_common__bet_location_permission_denied_message, new Object[0]), getCMSString(R.string.app_common__open_settings, new Object[0]), new DialogInterface.OnClickListener() { // from class: ky1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                py1.showPermissionDeniedMessage$lambda$0(this.a, dialogInterface, i2);
            }
        }, getCMSString(R.string.common_functions__cancel, new Object[0]), (ny1) null, cMSString, 64));
    }

    public final boolean showRationalPermissions() {
        return shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") || shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION");
    }

    public static /* synthetic */ void getCloudflareUrl$annotations() {
    }

    @Override // defpackage.y02
    public androidx.appcompat.app.b showDialog(Context ctx, String errMsg, Function0<Unit> action) {
        ctx.getClass();
        errMsg.getClass();
        action.getClass();
        return this.$$delegate_0.showDialog(ctx, errMsg, action);
    }
}
