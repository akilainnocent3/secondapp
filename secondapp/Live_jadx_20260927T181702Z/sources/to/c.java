package to;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.ads.nativead.NativeAd;
import com.ironsource.Ib;
import com.sports.live.football.tv.models.FormatData;
import com.sports.live.football.tv.models.FormatDataAudio;
import com.sports.live.football.tv.models.MatchesNewModel;
import cv.p0;
import fr.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import t7.y;
import wc.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static int A = 0;
    public static boolean E0 = false;

    @oy.m
    public static NativeAd F0 = null;

    @oy.m
    public static com.facebook.ads.NativeAd G0 = null;
    public static boolean J0 = false;
    public static boolean L0 = false;
    public static boolean N0 = false;
    public static boolean P0 = false;
    public static boolean Q0 = false;
    public static int T0 = 0;
    public static int U0 = 0;
    public static boolean X = false;
    public static boolean Y = false;
    public static boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static boolean f137059a0 = false;

    @oy.l
    public static final String adAfter = "AfterVideo";

    @oy.l
    public static final String adBefore = "BeforeVideo";

    @oy.l
    public static final String adLocation1 = "Location1";

    @oy.l
    public static final String adLocation2bottom = "Location2Bottom";

    @oy.l
    public static final String adLocation2top = "Location2Top";

    @oy.l
    public static final String adLocation2topPermanent = "Location2TopPermanent";

    @oy.l
    public static final String adManagerAds = "admanager";

    @oy.l
    public static final String adMiddle = "Middle";

    @oy.l
    public static final String adUnitId = "Interstitial_Android";

    @oy.l
    public static final String admob = "admob";

    @oy.l
    public static final String algoName = "iso-8859-1";

    @oy.l
    public static final String algoTypeS1 = "SHA-1";

    @oy.l
    public static final String algoTypeS2 = "SHA-256";

    @oy.l
    public static final String amazon = "amazon";

    @oy.l
    public static final String appLovin = "applovin";
    public static final int appVersionCode = 338;

    @oy.l
    public static final String appVersionName = "3.3.8";

    @oy.l
    public static final String asp = "AES";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static boolean f137061b0 = false;

    @oy.l
    public static final String baseIp = "https://ip-api.streamingucms.com/";
    public static final int buildNo = 338;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static boolean f137063c0 = false;

    @oy.l
    public static final String cas_Ai = "casAi";

    @oy.l
    public static final String chName = "UTF-8";

    @oy.l
    public static final String channelApi = "details";

    @oy.l
    public static final String channelAuth = "auth_token";

    @oy.l
    public static final String channelBuild = "build_no";

    @oy.l
    public static final String channelId = "id";

    @oy.l
    public static final String chartBoost = "chartboost";

    @oy.l
    public static final String consentKey = "Consent";

    @oy.l
    public static final String expireFlussonic = "expirelink";

    @oy.l
    public static final String facebook = "facebook";

    @oy.l
    public static final String hlsSource = "hls";

    @oy.l
    public static final String hlsWebType = "hlsweb";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static boolean f137075i0 = false;

    @oy.l
    public static final String instanceVal = "PBKDF2WithHmacSHA1";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f137076j = false;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static boolean f137077j0 = false;

    @oy.l
    public static final String key = "nonenFootBall@Key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f137080l = 0;

    @oy.l
    public static final String modeKey = "Mode";

    @oy.l
    public static final String moreLocation = "More";

    @oy.l
    public static final String mySecretCheckDel = "&";
    public static final int mySecretSize = 16;

    @oy.l
    public static final String nativeAdLocation = "native";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.m
    public static so.h f137086o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f137088p = false;

    @oy.l
    public static final String phraseDel = "@";

    @oy.l
    public static final String playerApp = "playerApp";

    @oy.l
    public static final String preferenceAppOpening = "AppOpen";

    @oy.l
    public static final String preferenceKey = "Message";

    @oy.l
    public static final String preferenceNoteLay = "Notes";

    @oy.l
    public static final String rateUsKey = "rateus";

    @oy.l
    public static final String refererLink = "referer";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.m
    public static y f137094s = null;

    @oy.l
    public static final String salt = "Fit4533op";

    @oy.l
    public static final String sepUrl = ".net";

    @oy.l
    public static final String startApp = "startapp";

    @oy.l
    public static final String stringId = "309";

    @oy.l
    public static final String tap = "Tap";

    @oy.l
    public static final String transForm = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static boolean f137099u0 = false;

    @oy.l
    public static final String unity = "unity";
    public static final boolean unityTestMode = false;

    @oy.l
    public static final String userApi = "get_url";

    @oy.l
    public static final String userBase = "?token=";

    @oy.l
    public static final String userBaseDel = "/";

    @oy.l
    public static final String userBaseExtraDel1 = "999";

    @oy.l
    public static final String userBaseExtraDel2 = "%";

    @oy.l
    public static final String userRepAlgo = "[cCITS]";

    @oy.l
    public static final String userType1 = "flussonic";

    @oy.l
    public static final String userType2 = "cdn";

    @oy.l
    public static final String userType3 = "p24";

    @oy.l
    public static final String userType4 = "cdnp2p";

    @oy.l
    public static final String userType5 = "app";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static boolean f137103w0 = false;

    @oy.l
    public static final String widevine = "license";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static boolean f137105x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f137106y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @oy.m
    public static x f137108z;

    @oy.l
    public static final c INSTANCE = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static String f137058a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static String f137060b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static String f137062c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static String f137064d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static String f137066e = "ExoPlayer-Drm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static String f137068f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static String f137070g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static String f137072h = "php";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f137074i = true;

    @oy.l
    public static final String dash = "dash";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static String f137078k = dash;

    @oy.l
    private static final List<FormatDataAudio> dataFormatsAudio = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f137082m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f137084n = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    public static String f137090q = "none";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    public static String f137092r = "none";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oy.l
    public static String f137096t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @oy.l
    public static String f137098u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @oy.l
    public static String f137100v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @oy.l
    public static String f137102w = "https://www.google.com/";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @oy.l
    public static String f137104x = xc.a.f144821b;
    public static int B = -1;

    @oy.l
    public static String C = "";

    @oy.l
    private static final List<FormatData> dataFormats = new ArrayList();

    @oy.l
    public static String D = "";

    @oy.l
    public static String E = "";

    @oy.l
    public static String F = "";

    @oy.l
    public static String G = "";

    @oy.l
    public static String H = "";

    @oy.l
    public static String I = "";

    @oy.l
    public static String J = "";

    @oy.l
    public static String K = "";

    @oy.l
    public static String L = "";

    @oy.l
    public static String M = "";

    @oy.l
    public static String N = "";

    @oy.l
    public static String O = "";

    @oy.l
    public static String P = "";

    @oy.l
    public static String Q = "none";

    @oy.l
    public static String R = "none";

    @oy.l
    public static String S = "";

    @oy.l
    public static String T = "";

    @oy.l
    public static String U = "none";

    @oy.l
    public static String V = "none";

    @oy.l
    public static String W = "none";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @oy.l
    public static String f137065d0 = "none";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @oy.l
    public static String f137067e0 = "locked";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @oy.l
    public static String f137069f0 = "myUserCheck1";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @oy.l
    public static String f137071g0 = "userIp";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @oy.l
    public static String f137073h0 = "";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @oy.l
    public static String f137079k0 = "";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @oy.l
    public static String f137081l0 = "";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @oy.l
    public static String f137083m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @oy.l
    public static String f137085n0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @oy.l
    public static String f137087o0 = "";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @oy.l
    public static String f137089p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @oy.l
    public static String f137091q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @oy.l
    public static String f137093r0 = "";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @oy.l
    public static String f137095s0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @oy.l
    public static String f137097t0 = "";

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @oy.l
    public static List<String> f137101v0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @oy.l
    public static String f137107y0 = "apps.greek@gmail.com";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @oy.l
    public static String f137109z0 = "Send Email...";

    @oy.l
    public static String A0 = "cementData";

    @oy.l
    public static String B0 = "cementType";

    @oy.l
    public static String C0 = "cementMainData";

    @oy.l
    public static String D0 = "cementMainType";
    public static int H0 = -1;
    public static int I0 = -1;

    @oy.l
    public static String K0 = "";

    @oy.l
    public static String M0 = "";

    @oy.l
    public static String O0 = dash;

    @oy.l
    public static String R0 = "";

    @oy.l
    public static String S0 = "";

    @oy.l
    private static final List<od.a> dataFormatsAudioMedia3 = new ArrayList();

    @oy.l
    private static final List<od.b> dataFormatsMedia3 = new ArrayList();

    @oy.l
    public final List<MatchesNewModel> checkNativeAd(@oy.l List<MatchesNewModel> list) {
        m0.p(list, "list");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 % 5 == 2) {
                arrayList.add(null);
            }
            arrayList.add(list.get(i10));
            if (list.size() == 2 && i10 == 1) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final boolean containsAnyOfIgnoreCase(@oy.l String str, @oy.l List<String> keywords) {
        m0.p(str, "<this>");
        m0.p(keywords, "keywords");
        Iterator<String> it = keywords.iterator();
        while (it.hasNext()) {
            if (p0.l3(str, it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public final int getActualCountCheck() {
        return U0;
    }

    @oy.l
    public final String getAdmobBannerId() {
        return O;
    }

    @oy.l
    public final String getAdmobInterstitial() {
        return D;
    }

    public final boolean getAppLiveStatus() {
        return E0;
    }

    @oy.l
    public final String getAppLovinBannerId() {
        return P;
    }

    @oy.l
    public final String getAppLovinInterstitial() {
        return E;
    }

    @oy.l
    public final String getAppLovinNative() {
        return N;
    }

    public final boolean getApp_update_dialog() {
        return f137077j0;
    }

    @oy.l
    public final String getAuthToken() {
        return f137079k0;
    }

    @oy.l
    public final String getBaseUrlChannel() {
        return f137085n0;
    }

    @oy.l
    public final String getBaseUrlDemo() {
        return f137087o0;
    }

    @oy.m
    public final x getCasAiAdManager() {
        return f137108z;
    }

    @oy.l
    public final String getCasAiId() {
        return f137104x;
    }

    @oy.l
    public final String getCementData() {
        return A0;
    }

    @oy.l
    public final String getCementMainData() {
        return C0;
    }

    @oy.l
    public final String getCementMainType() {
        return D0;
    }

    @oy.l
    public final String getCementType() {
        return B0;
    }

    @oy.l
    public final String getChannel_url_val() {
        return f137093r0;
    }

    @oy.l
    public final String getChartBoostAppID() {
        return H;
    }

    @oy.l
    public final String getChartBoostAppSig() {
        return I;
    }

    @oy.l
    public final String getClearKeyId() {
        return f137064d;
    }

    @oy.l
    public final String getClearKeyKey() {
        return f137062c;
    }

    public final boolean getCountryCodeCheck() {
        return f137076j;
    }

    @oy.l
    public final String getCurrentCountryCode() {
        return f137070g;
    }

    @oy.m
    public final NativeAd getCurrentNativeAd() {
        return F0;
    }

    @oy.m
    public final com.facebook.ads.NativeAd getCurrentNativeAdFacebook() {
        return G0;
    }

    @oy.l
    public final List<FormatData> getDataFormats() {
        return dataFormats;
    }

    @oy.l
    public final List<FormatDataAudio> getDataFormatsAudio() {
        return dataFormatsAudio;
    }

    @oy.l
    public final List<od.a> getDataFormatsAudioMedia3() {
        return dataFormatsAudioMedia3;
    }

    @oy.l
    public final List<od.b> getDataFormatsMedia3() {
        return dataFormatsMedia3;
    }

    @oy.l
    public final String getDefaultString() {
        return f137097t0;
    }

    @oy.l
    public final String getEmptyCheck() {
        return f137083m0;
    }

    @oy.l
    public final String getFacebookPlacementIdInterstitial() {
        return F;
    }

    @oy.l
    public final String getFbPlacementIdBanner() {
        return G;
    }

    @oy.l
    public final String getFilterValue() {
        return f137073h0;
    }

    @oy.l
    public final String getFootballBaseApi() {
        return f137102w;
    }

    @oy.l
    public final String getFootballToken() {
        return S;
    }

    @oy.l
    public final String getGoogleAdMangerBanner() {
        return f137098u;
    }

    @oy.l
    public final String getGoogleAdMangerInterstitial() {
        return f137096t;
    }

    @oy.l
    public final String getGoogleAdMangerNative() {
        return f137100v;
    }

    @oy.l
    public final String getLocation1Provider() {
        return f137090q;
    }

    @oy.l
    public final String getLocation2BottomProvider() {
        return V;
    }

    @oy.l
    public final String getLocation2TopPermanentProvider() {
        return f137065d0;
    }

    @oy.l
    public final String getLocation2TopProvider() {
        return U;
    }

    @oy.l
    public final String getLocationAfter() {
        return W;
    }

    @oy.l
    public final String getLocationBeforeProvider() {
        return R;
    }

    @oy.m
    public final so.h getMListener() {
        return f137086o;
    }

    @oy.l
    public final String getMailId() {
        return f137107y0;
    }

    @oy.l
    public final String getMailText() {
        return f137109z0;
    }

    @oy.l
    public final String getMiddleAdProvider() {
        return Q;
    }

    @oy.l
    public final String getMoreAdProvider() {
        return f137060b;
    }

    @oy.l
    public final String getMyUserCheck1() {
        return f137069f0;
    }

    @oy.l
    public final String getMyUserLock1() {
        return f137067e0;
    }

    @oy.l
    public final String getNativeAdProvider() {
        return T;
    }

    @oy.l
    public final String getNativeAdmob() {
        return J;
    }

    @oy.l
    public final String getNativeFacebook() {
        return M;
    }

    @oy.l
    public final String getNativeFieldVal() {
        return C;
    }

    @oy.m
    public final y getNavDirections() {
        return f137094s;
    }

    @oy.l
    public final String getNextPlayUrl() {
        return O0;
    }

    @oy.l
    public final List<String> getOldSku() {
        return f137101v0;
    }

    @oy.l
    public final String getPassVal() {
        return f137081l0;
    }

    @oy.l
    public final String getPassphraseVal() {
        return f137091q0;
    }

    public final boolean getPlayerActivityInPip() {
        return f137088p;
    }

    @oy.l
    public final String getPlayerButtonText() {
        return S0;
    }

    public final boolean getPlayerSplash_belongs_country() {
        return N0;
    }

    @oy.l
    public final String getPlayerTextValue() {
        return R0;
    }

    public final int getPlayerTypeCount() {
        return T0;
    }

    @oy.l
    public final String getPlayerTypeLink() {
        return M0;
    }

    public final int getPositionClick() {
        return H0;
    }

    public final int getPositionClick2() {
        return A;
    }

    public final int getPositionClick4() {
        return f137080l;
    }

    public final int getPreviousClick() {
        return I0;
    }

    public final int getPreviousClick2() {
        return B;
    }

    public final int getPreviousClick4() {
        return f137082m;
    }

    public final boolean getRateShown() {
        return L0;
    }

    public final boolean getRateUsDialogValue() {
        return J0;
    }

    @oy.l
    public final String getRateUsText() {
        return K0;
    }

    @oy.l
    public final String getRefererValue() {
        return f137078k;
    }

    public final boolean getRemoveAds() {
        return f137099u0;
    }

    public final boolean getSplash() {
        return P0;
    }

    public final boolean getSplash_status() {
        return f137075i0;
    }

    @oy.l
    public final String getStartAppId() {
        return L;
    }

    public final boolean getStreamingBelongsCountry() {
        return f137074i;
    }

    @oy.l
    public final String getTapPositionProvider() {
        return f137092r;
    }

    public final int getTimeValueAtPlayer() {
        return f137084n;
    }

    @oy.l
    public final String getUSER_AGENT() {
        return f137066e;
    }

    @oy.l
    public final String getUnityGameID() {
        return K;
    }

    public final boolean getUpdateScreenStatus() {
        return f137105x0;
    }

    @oy.l
    public final String getUserIp() {
        return f137071g0;
    }

    @oy.l
    public final String getUserLink() {
        return f137095s0;
    }

    @oy.l
    public final String getUserLinkVal() {
        return f137089p0;
    }

    @oy.l
    public final String getUserTypePhp() {
        return f137072h;
    }

    public final boolean getVideoFinish() {
        return f137103w0;
    }

    @oy.l
    public final String getWebUrl() {
        return f137058a;
    }

    @oy.l
    public final String getXForwardedKey() {
        return f137068f;
    }

    public final boolean isCasAiInit() {
        return f137106y;
    }

    public final boolean isChartboostSdkInit() {
        return f137061b0;
    }

    public final boolean isInitAdmobSdk() {
        return X;
    }

    public final boolean isInitApplovin() {
        return Y;
    }

    public final boolean isInitFacebookSdk() {
        return Z;
    }

    public final boolean isPlayerCheck() {
        return Q0;
    }

    public final boolean isPrivateDnsSetup(@oy.l Context context) {
        String privateDnsServerName;
        m0.p(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            Object systemService = context.getSystemService("connectivity");
            m0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            if (linkProperties != null && linkProperties.isPrivateDnsActive()) {
                Log.d("PrivatednsServer", Ib.f59279a + (linkProperties != null ? linkProperties.getPrivateDnsServerName() : null));
                if (linkProperties.getPrivateDnsServerName() != null) {
                    List<String> listQ = h0.Q("adguard", "nextdns", "rethinkdns", "controld");
                    if (linkProperties != null && (privateDnsServerName = linkProperties.getPrivateDnsServerName()) != null && containsAnyOfIgnoreCase(privateDnsServerName, listQ)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isStartAppSdkInit() {
        return f137063c0;
    }

    public final boolean isUnitySdkInit() {
        return f137059a0;
    }

    public final void setActualCountCheck(int i10) {
        U0 = i10;
    }

    public final void setAdmobBannerId(@oy.l String str) {
        m0.p(str, "<set-?>");
        O = str;
    }

    public final void setAdmobInterstitial(@oy.l String str) {
        m0.p(str, "<set-?>");
        D = str;
    }

    public final void setAppLiveStatus(boolean z10) {
        E0 = z10;
    }

    public final void setAppLovinBannerId(@oy.l String str) {
        m0.p(str, "<set-?>");
        P = str;
    }

    public final void setAppLovinInterstitial(@oy.l String str) {
        m0.p(str, "<set-?>");
        E = str;
    }

    public final void setAppLovinNative(@oy.l String str) {
        m0.p(str, "<set-?>");
        N = str;
    }

    public final void setApp_update_dialog(boolean z10) {
        f137077j0 = z10;
    }

    public final void setAuthToken(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137079k0 = str;
    }

    public final void setBaseUrlChannel(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137085n0 = str;
    }

    public final void setBaseUrlDemo(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137087o0 = str;
    }

    public final void setCasAiAdManager(@oy.m x xVar) {
        f137108z = xVar;
    }

    public final void setCasAiId(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137104x = str;
    }

    public final void setCasAiInit(boolean z10) {
        f137106y = z10;
    }

    public final void setCementData(@oy.l String str) {
        m0.p(str, "<set-?>");
        A0 = str;
    }

    public final void setCementMainData(@oy.l String str) {
        m0.p(str, "<set-?>");
        C0 = str;
    }

    public final void setCementMainType(@oy.l String str) {
        m0.p(str, "<set-?>");
        D0 = str;
    }

    public final void setCementType(@oy.l String str) {
        m0.p(str, "<set-?>");
        B0 = str;
    }

    public final void setChannel_url_val(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137093r0 = str;
    }

    public final void setChartBoostAppID(@oy.l String str) {
        m0.p(str, "<set-?>");
        H = str;
    }

    public final void setChartBoostAppSig(@oy.l String str) {
        m0.p(str, "<set-?>");
        I = str;
    }

    public final void setChartboostSdkInit(boolean z10) {
        f137061b0 = z10;
    }

    public final void setClearKeyId(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137064d = str;
    }

    public final void setClearKeyKey(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137062c = str;
    }

    public final void setCountryCodeCheck(boolean z10) {
        f137076j = z10;
    }

    public final void setCurrentCountryCode(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137070g = str;
    }

    public final void setCurrentNativeAd(@oy.m NativeAd nativeAd) {
        F0 = nativeAd;
    }

    public final void setCurrentNativeAdFacebook(@oy.m com.facebook.ads.NativeAd nativeAd) {
        G0 = nativeAd;
    }

    public final void setDefaultString(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137097t0 = str;
    }

    public final void setEmptyCheck(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137083m0 = str;
    }

    public final void setFacebookPlacementIdInterstitial(@oy.l String str) {
        m0.p(str, "<set-?>");
        F = str;
    }

    public final void setFbPlacementIdBanner(@oy.l String str) {
        m0.p(str, "<set-?>");
        G = str;
    }

    public final void setFilterValue(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137073h0 = str;
    }

    public final void setFootballBaseApi(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137102w = str;
    }

    public final void setFootballToken(@oy.l String str) {
        m0.p(str, "<set-?>");
        S = str;
    }

    public final void setGoogleAdMangerBanner(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137098u = str;
    }

    public final void setGoogleAdMangerInterstitial(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137096t = str;
    }

    public final void setGoogleAdMangerNative(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137100v = str;
    }

    public final void setInitAdmobSdk(boolean z10) {
        X = z10;
    }

    public final void setInitApplovin(boolean z10) {
        Y = z10;
    }

    public final void setInitFacebookSdk(boolean z10) {
        Z = z10;
    }

    public final void setLocation1Provider(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137090q = str;
    }

    public final void setLocation2BottomProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        V = str;
    }

    public final void setLocation2TopPermanentProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137065d0 = str;
    }

    public final void setLocation2TopProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        U = str;
    }

    public final void setLocationAfter(@oy.l String str) {
        m0.p(str, "<set-?>");
        W = str;
    }

    public final void setLocationBeforeProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        R = str;
    }

    public final void setMListener(@oy.m so.h hVar) {
        f137086o = hVar;
    }

    public final void setMailId(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137107y0 = str;
    }

    public final void setMailText(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137109z0 = str;
    }

    public final void setMiddleAdProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        Q = str;
    }

    public final void setMoreAdProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137060b = str;
    }

    public final void setMyUserCheck1(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137069f0 = str;
    }

    public final void setMyUserLock1(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137067e0 = str;
    }

    public final void setNativeAdProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        T = str;
    }

    public final void setNativeAdmob(@oy.l String str) {
        m0.p(str, "<set-?>");
        J = str;
    }

    public final void setNativeFacebook(@oy.l String str) {
        m0.p(str, "<set-?>");
        M = str;
    }

    public final void setNativeFieldVal(@oy.l String str) {
        m0.p(str, "<set-?>");
        C = str;
    }

    public final void setNavDirections(@oy.m y yVar) {
        f137094s = yVar;
    }

    public final void setNextPlayUrl(@oy.l String str) {
        m0.p(str, "<set-?>");
        O0 = str;
    }

    public final void setOldSku(@oy.l List<String> list) {
        m0.p(list, "<set-?>");
        f137101v0 = list;
    }

    public final void setPassVal(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137081l0 = str;
    }

    public final void setPassphraseVal(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137091q0 = str;
    }

    public final void setPlayerActivityInPip(boolean z10) {
        f137088p = z10;
    }

    public final void setPlayerButtonText(@oy.l String str) {
        m0.p(str, "<set-?>");
        S0 = str;
    }

    public final void setPlayerCheck(boolean z10) {
        Q0 = z10;
    }

    public final void setPlayerSplash_belongs_country(boolean z10) {
        N0 = z10;
    }

    public final void setPlayerTextValue(@oy.l String str) {
        m0.p(str, "<set-?>");
        R0 = str;
    }

    public final void setPlayerTypeCount(int i10) {
        T0 = i10;
    }

    public final void setPlayerTypeLink(@oy.l String str) {
        m0.p(str, "<set-?>");
        M0 = str;
    }

    public final void setPositionClick(int i10) {
        H0 = i10;
    }

    public final void setPositionClick2(int i10) {
        A = i10;
    }

    public final void setPositionClick4(int i10) {
        f137080l = i10;
    }

    public final void setPreviousClick(int i10) {
        I0 = i10;
    }

    public final void setPreviousClick2(int i10) {
        B = i10;
    }

    public final void setPreviousClick4(int i10) {
        f137082m = i10;
    }

    public final void setRateShown(boolean z10) {
        L0 = z10;
    }

    public final void setRateUsDialogValue(boolean z10) {
        J0 = z10;
    }

    public final void setRateUsText(@oy.l String str) {
        m0.p(str, "<set-?>");
        K0 = str;
    }

    public final void setRefererValue(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137078k = str;
    }

    public final void setRemoveAds(boolean z10) {
        f137099u0 = z10;
    }

    public final void setSplash(boolean z10) {
        P0 = z10;
    }

    public final void setSplash_status(boolean z10) {
        f137075i0 = z10;
    }

    public final void setStartAppId(@oy.l String str) {
        m0.p(str, "<set-?>");
        L = str;
    }

    public final void setStartAppSdkInit(boolean z10) {
        f137063c0 = z10;
    }

    public final void setStreamingBelongsCountry(boolean z10) {
        f137074i = z10;
    }

    public final void setTapPositionProvider(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137092r = str;
    }

    public final void setTimeValueAtPlayer(int i10) {
        f137084n = i10;
    }

    public final void setUSER_AGENT(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137066e = str;
    }

    public final void setUnityGameID(@oy.l String str) {
        m0.p(str, "<set-?>");
        K = str;
    }

    public final void setUnitySdkInit(boolean z10) {
        f137059a0 = z10;
    }

    public final void setUpdateScreenStatus(boolean z10) {
        f137105x0 = z10;
    }

    public final void setUserIp(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137071g0 = str;
    }

    public final void setUserLink(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137095s0 = str;
    }

    public final void setUserLinkVal(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137089p0 = str;
    }

    public final void setUserTypePhp(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137072h = str;
    }

    public final void setVideoFinish(boolean z10) {
        f137103w0 = z10;
    }

    public final void setWebUrl(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137058a = str;
    }

    public final void setXForwardedKey(@oy.l String str) {
        m0.p(str, "<set-?>");
        f137068f = str;
    }

    public final void toast(@oy.l Context context, @oy.l String msg) {
        m0.p(context, "<this>");
        m0.p(msg, "msg");
        Toast.makeText(context, msg, 1).show();
    }
}
