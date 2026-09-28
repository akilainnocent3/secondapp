package com.sportygames.commons;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.views.activity.GamesLobbyMainActivity;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import defpackage.a6b;
import defpackage.ak60;
import defpackage.b21;
import defpackage.b5;
import defpackage.ba5;
import defpackage.bb;
import defpackage.bk60;
import defpackage.c0g0;
import defpackage.ci2;
import defpackage.efe0;
import defpackage.ein;
import defpackage.ej5;
import defpackage.f1t;
import defpackage.fse;
import defpackage.gku;
import defpackage.i1z;
import defpackage.ibs;
import defpackage.j2z;
import defpackage.jpu;
import defpackage.juj;
import defpackage.krp;
import defpackage.kzh;
import defpackage.las;
import defpackage.lob0;
import defpackage.lrp;
import defpackage.lyh;
import defpackage.mth;
import defpackage.n2g;
import defpackage.nzf0;
import defpackage.oxj;
import defpackage.p8z;
import defpackage.pfd;
import defpackage.pr0;
import defpackage.q80;
import defpackage.qrp;
import defpackage.rgf;
import defpackage.sjj;
import defpackage.sny;
import defpackage.suj;
import defpackage.t3t;
import defpackage.t3w;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v6s;
import defpackage.w4c;
import defpackage.x82;
import defpackage.xae;
import defpackage.xnh0;
import defpackage.ytw;
import defpackage.ywj;
import defpackage.zag;
import defpackage.zj60;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.h;
import kotlin.time.i;

/* JADX INFO: loaded from: classes7.dex */
public class SportyGamesManager implements b5 {
    private static final v5b SEGMENT_SCOPE;
    private static String currentLanguageCode;
    public static DecimalFormatSymbols decimalFormatSymbols;
    private static String deviceId;
    public static Locale locale;
    private static String sportySoccerGameActivityToken;
    private static String sportySoccerToken;
    public static Integer LobbyCurrentPage = 0;
    private static SportyGamesManager single_instance = null;
    private static zj60 sgLibraryBridge = null;
    private static String baseUrl = null;
    private static long versionCode = 0;
    private static String baseUrlCMS = null;
    private static String baseUrlSocket = null;
    private static String baseUrlChat = null;
    private static String basePrefixUrl = null;
    private static String userId = null;
    private static String patronId = null;
    private static Context applicationContext = null;
    private static String userImage = null;
    private static String nickName = null;
    private static String language = null;
    private static String gameName = null;
    private static String screenName = null;

    public class a implements v5b {
        @Override // defpackage.v5b
        public final CoroutineContext getCoroutineContext() {
            pfd pfdVar = fse.a;
            return gku.a;
        }
    }

    public interface b {
    }

    static {
        t3w t3wVar = ein.a;
        lrp lrpVarA = sjj.a();
        Pair[] pairArr = {new Pair(qrp.a, Boolean.TRUE)};
        lrpVarA.getClass();
        krp krpVar = lrpVarA.a;
        j2z j2zVar = krpVar.e;
        Map<? extends qrp, ? extends Object> mapB = jpu.b(pairArr[0]);
        j2zVar.getClass();
        mapB.getClass();
        j2zVar.a.putAll(mapB);
        v6s v6sVar = v6s.b;
        q80 q80Var = new q80();
        q80Var.b = v6sVar;
        if (!(krpVar.a instanceof n2g)) {
            StringBuilder sb = new StringBuilder("Trying to register Koin logger '");
            sb.append(q80Var);
            b21 b21Var = krpVar.a;
            sb.append("' but ");
            sb.append(b21Var);
            sb.append(" is already registered!");
            throw new IllegalStateException(sb.toString().toString());
        }
        krpVar.a = q80Var;
        t3w t3wVar2 = ein.a;
        t3wVar2.getClass();
        List<t3w> listC = kotlin.collections.a.c(t3wVar2);
        listC.getClass();
        if (((v6s) krpVar.a.b).compareTo(v6sVar) <= 0) {
            i.a.a.getClass();
            h.a.getClass();
            long jB = h.b();
            lrpVarA.a(listC);
            long jB2 = i.a.C0776a.b(jB);
            int size = krpVar.d.b.size();
            b21 b21Var2 = krpVar.a;
            StringBuilder sbA = efe0.a(size, "Started ", " definitions in ");
            kotlin.time.b.a aVar = kotlin.time.b.b;
            sbA.append(kotlin.time.b.j(jB2, rgf.MICROSECONDS) / 1000.0d);
            sbA.append(" ms");
            b21Var2.e(v6sVar, sbA.toString());
        } else {
            lrpVarA.a(listC);
        }
        sportySoccerToken = null;
        sportySoccerGameActivityToken = null;
        currentLanguageCode = "";
        deviceId = "";
        Locale locale2 = Locale.US;
        locale = locale2;
        decimalFormatSymbols = new DecimalFormatSymbols(locale2);
        SEGMENT_SCOPE = new a();
    }

    private String fetchBaseUrlFromGradle() {
        if (checkIsDomainBR()) {
            return "https://www.sporty.bet.br/api/";
        }
        if (checkIsDomainZA()) {
            return "https://www.sportybet.co.za/api/";
        }
        if (checkIsDomainMX()) {
            return "https://www.sportybet.mx/api/";
        }
        if (checkIsDomainCM()) {
            return "https://www.sportybet.co.cm/api/";
        }
        return checkIsDomainMZ() ? "https://www.sportybet.co.mz/api/" : "https://www.sportybet.com/api/";
    }

    private String fetchChatUrlFromGradle() {
        if (checkIsDomainBR()) {
            return "wss://www.sporty.bet.br/";
        }
        if (checkIsDomainZA()) {
            return "wss://www.sportybet.co.za/";
        }
        if (checkIsDomainMX()) {
            return "wss://www.sportybet.mx/";
        }
        if (checkIsDomainCM()) {
            return "wss://www.sportybet.co.cm/";
        }
        return checkIsDomainMZ() ? "wss://www.sportybet.co.mz/" : "wss://www.sportybet.com/";
    }

    private String fetchFeaturedBaseUrlFromGradle(String str) {
        if (str.equalsIgnoreCase("br")) {
            return "https://www.sporty.bet.br/api/";
        }
        if (str.equalsIgnoreCase("mx")) {
            return "https://www.sportybet.mx/api/";
        }
        if (str.equalsIgnoreCase("za")) {
            return "https://www.sportybet.co.za/api/";
        }
        if (str.equalsIgnoreCase("cm")) {
            return "https://www.sportybet.co.cm/api/";
        }
        return str.equalsIgnoreCase("mz") ? "https://www.sportybet.co.mz/api/" : "https://www.sportybet.com/api/";
    }

    private String fetchFeaturedPrefixUrlFromGradle(String str) {
        if (str.equalsIgnoreCase("br")) {
            return "https://www.sporty.bet.br/";
        }
        if (str.equalsIgnoreCase("mx")) {
            return "https://www.sportybet.mx/";
        }
        if (str.equalsIgnoreCase("za")) {
            return "https://www.sportybet.co.za/";
        }
        if (str.equalsIgnoreCase("cm")) {
            return "https://www.sportybet.co.cm/";
        }
        return str.equalsIgnoreCase("mz") ? "https://www.sportybet.co.mz/" : "https://www.sportybet.com/";
    }

    private String fetchPrefixUrlFromGradle() {
        if (checkIsDomainBR()) {
            return "https://www.sporty.bet.br/";
        }
        if (checkIsDomainZA()) {
            return "https://www.sportybet.co.za/";
        }
        if (checkIsDomainMX()) {
            return "https://www.sportybet.mx/";
        }
        if (checkIsDomainCM()) {
            return "https://www.sportybet.co.cm/";
        }
        return checkIsDomainMZ() ? "https://www.sportybet.co.mz/" : "https://www.sportybet.com/";
    }

    private String fetchSocketUrlFromGradle() {
        if (checkIsDomainBR()) {
            return "wss://www.sporty.bet.br/ws/";
        }
        if (checkIsDomainZA()) {
            return "wss://www.sportybet.co.za/ws/";
        }
        if (checkIsDomainMX()) {
            return "wss://www.sportybet.mx/ws/";
        }
        if (checkIsDomainCM()) {
            return "wss://www.sportybet.co.cm/ws/";
        }
        return checkIsDomainMZ() ? "wss://www.sportybet.co.mz/ws/" : "wss://www.sportybet.com/ws/";
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static String getCurrentLanguageCode() {
        return currentLanguageCode;
    }

    public static String getGameName() {
        return gameName;
    }

    public static synchronized SportyGamesManager getInstance() {
        SportyGamesManager sportyGamesManager;
        sportyGamesManager = single_instance;
        if (sportyGamesManager == null) {
            sportyGamesManager = new SportyGamesManager();
            single_instance = sportyGamesManager;
        }
        return sportyGamesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$getUserSegmentOnce$0(b bVar, Object obj, v1b v1bVar) {
        View view;
        t3t t3tVar = (t3t) bVar;
        ibs ibsVar = t3tVar.a;
        Fragment fragment = t3tVar.b;
        Context context = t3tVar.c;
        ytw ytwVar = t3tVar.d;
        if (ibsVar != null) {
            boolean zG = false;
            if (obj != null) {
                try {
                    zG = Intrinsics.g(obj.toString(), "GamesDominant");
                } catch (Exception unused) {
                }
            }
            if (zG) {
                try {
                    Object featuredView = getInstance().getFeaturedView(fragment.getActivity(), context, ibsVar);
                    view = featuredView instanceof View ? (View) featuredView : null;
                } catch (Exception unused2) {
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    ytwVar.setValue(view);
                }
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$getUserSegmentOnce$1(lyh lyhVar, b bVar, v5b v5bVar, v1b v1bVar) {
        return kzh.b(lyhVar, new p8z(bVar), v1bVar);
    }

    public static void setApplicationContext(Context context) {
        applicationContext = context.getApplicationContext();
    }

    public static void setCurrentLanguageCode(String str) {
        currentLanguageCode = str;
    }

    private String setDeviceId(Context context) {
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        if (!validAndroidId(string)) {
            String string2 = UUID.randomUUID().toString();
            deviceId = string2;
            return string2;
        }
        string.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = string.getBytes(charset);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                char[] cArr = c0g0.a;
                sb.append(cArr[(b2 & 240) >>> 4]);
                sb.append(cArr[b2 & 15]);
            }
            String string3 = sb.toString();
            Locale locale2 = Locale.US;
            locale2.getClass();
            String lowerCase = string3.toLowerCase(locale2);
            lowerCase.getClass();
            string = lowerCase;
        } catch (Exception e) {
            e.printStackTrace();
        }
        String lowerCase2 = string.toLowerCase(Locale.US);
        deviceId = lowerCase2;
        return lowerCase2;
    }

    public static void setGameName(String str) {
        gameName = str;
    }

    private void setParameters() {
        setBaseUrl();
        setBaseUrlCMS();
        setBaseUrlSocket();
        setBaseUrlChat();
        setBasePrefixUrl();
    }

    private void setParametersWith(Context context) {
        if (context != null) {
            setDeviceId(context);
            setVersionCode(context);
        }
    }

    private void setSgLibraryBridgeIfNotAlreadySet(ba5 ba5Var) {
        if (ba5Var == null || sgLibraryBridge != null) {
            return;
        }
        sgLibraryBridge = new bk60(ba5Var);
    }

    private boolean validAndroidId(String str) {
        if (str == null || str.length() < 10 || TextUtils.equals("02:00:00:00:00:00", str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != ':') {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b5
    public void addAccountUpdatedListener(bb bbVar) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            bbVar.getClass();
            ((bk60) zj60Var).a.addAccountUpdatedListener(bbVar);
        }
    }

    public String baseUrlLobbyWeb() {
        return fetchPrefixUrlFromGradle() + getInstance().getCountry() + "/";
    }

    public boolean checkIsDomainBR() {
        String country = getCountry();
        if (country == null) {
            return false;
        }
        return country.equalsIgnoreCase("br");
    }

    public boolean checkIsDomainCM() {
        String country = getCountry();
        if (country == null) {
            return false;
        }
        return country.equalsIgnoreCase("cm");
    }

    public boolean checkIsDomainMX() {
        String country = getCountry();
        if (country == null) {
            return false;
        }
        return country.equalsIgnoreCase("mx");
    }

    public boolean checkIsDomainMZ() {
        String country = getCountry();
        if (country == null) {
            return false;
        }
        return country.equalsIgnoreCase("mz");
    }

    public boolean checkIsDomainZA() {
        String country = getCountry();
        if (country == null) {
            return false;
        }
        return country.equalsIgnoreCase("za");
    }

    public void exit() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            ((bk60) zj60Var).a.j();
        }
    }

    public String fetchBaseUrlGamesExternalFromGradle(String str) {
        if (str.equalsIgnoreCase("br")) {
            return "https://www.sporty.bet.br/api/";
        }
        if (str.equalsIgnoreCase("mx")) {
            return "https://www.sportybet.mx/api/";
        }
        if (str.equalsIgnoreCase("za")) {
            return "https://www.sportybet.co.za/api/";
        }
        if (str.equalsIgnoreCase("cm")) {
            return "https://www.sportybet.co.cm/api/";
        }
        return str.equalsIgnoreCase("mz") ? "https://www.sportybet.co.mz/api/" : "https://www.sportybet.com/api/";
    }

    @Override // defpackage.b5
    public String fetchCountry() {
        return getCountry();
    }

    public void fetchFirstDepositState(las lasVar, x82<mth, String> x82Var) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null && lasVar != null && x82Var != null) {
            ej5.c(lasVar, null, null, new ak60((bk60) zj60Var, x82Var, null), 3);
        } else if (x82Var != null) {
            x82Var.onError("Bridge or lifecycle scope is null.");
        }
    }

    @Override // defpackage.b5
    public String fetchPatronId() {
        return patronId;
    }

    @Override // defpackage.b5
    public String fetchUserId() {
        return userId;
    }

    @Override // defpackage.b5
    public long fetchversionCode() {
        return versionCode;
    }

    @Override // defpackage.b5
    public String getAccessToken() {
        xnh0 user = getUser();
        if (user != null) {
            return user.a;
        }
        return null;
    }

    @Override // defpackage.b5
    public Context getAppContext() {
        return applicationContext;
    }

    public String getBasePrefixUrl() {
        return basePrefixUrl;
    }

    @Override // defpackage.b5
    public String getBaseUrl() {
        return baseUrl;
    }

    public String getBaseUrlCMS() {
        return baseUrlCMS;
    }

    @Override // defpackage.b5
    public String getBaseUrlChat() {
        return baseUrlChat;
    }

    @Override // defpackage.b5
    public String getBaseUrlSocket() {
        return baseUrlSocket;
    }

    public zj60 getBridge() {
        return sgLibraryBridge;
    }

    public String getCountry() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var == null) {
            return null;
        }
        String countryCode = ((bk60) zj60Var).a.getCountryCode();
        return (countryCode.equalsIgnoreCase("br") && getEnvironment() == zag.b) ? "int" : countryCode;
    }

    public Integer getCountryContactUsPhoneResId() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return Integer.valueOf(((bk60) zj60Var).a.e());
        }
        return null;
    }

    @Override // defpackage.b5
    public String getCountryCurrency() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.g();
        }
        return null;
    }

    public String getCountryName(Context context) {
        zj60 zj60Var;
        if (context == null || (zj60Var = sgLibraryBridge) == null) {
            return null;
        }
        return ((bk60) zj60Var).a.c();
    }

    @Override // defpackage.b5
    public DecimalFormatSymbols getDecimalFormatSymbols() {
        return decimalFormatSymbols;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDomain(Context context) {
        if (getEnvironment() == zag.b) {
            if (checkIsDomainZA()) {
                return context.getString(R.string.uat_domain_za);
            }
            if (checkIsDomainMX()) {
                return context.getString(R.string.uat_domain_mx);
            }
            if (checkIsDomainCM()) {
                return context.getString(R.string.uat_domain_cm);
            }
            return checkIsDomainMZ() ? context.getString(R.string.uat_domain_mz) : context.getString(R.string.uat_domain);
        }
        if (checkIsDomainZA()) {
            return context.getString(R.string.live_domain_za);
        }
        if (checkIsDomainMX()) {
            return context.getString(R.string.live_domain_mx);
        }
        if (checkIsDomainBR()) {
            return context.getString(R.string.live_domain_br);
        }
        if (checkIsDomainCM()) {
            return context.getString(R.string.live_domain_cm);
        }
        return checkIsDomainMZ() ? context.getString(R.string.live_domain_mz) : context.getString(R.string.live_domain);
    }

    public zag getEnvironment() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.i();
        }
        return null;
    }

    public String getFeaturedLanguageCode() {
        return language;
    }

    public Object getFeaturedView(Object obj, Context context, ibs ibsVar) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            bk60 bk60Var = (bk60) zj60Var;
            if (obj != null && context != null && ibsVar != null) {
                juj jujVar = obj instanceof juj ? (juj) obj : null;
                if (jujVar != null) {
                    return bk60Var.a.p(jujVar, context, ibsVar);
                }
            }
        }
        return null;
    }

    @Override // defpackage.b5
    public String getLanguageCode() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null && ((bk60) zj60Var).a.getLanguageCode() != null) {
            return ((bk60) sgLibraryBridge).a.getLanguageCode();
        }
        String str = language;
        return str != null ? str : "en";
    }

    public suj getLobbyEntranceFragment(f1t f1tVar, Bundle bundle) {
        suj sujVar = new suj();
        if (bundle != null && !bundle.isEmpty()) {
            sujVar.setArguments(bundle);
        }
        return sujVar;
    }

    public GamesLobbyMainFragment getLobbyFragment() {
        return new GamesLobbyMainFragment();
    }

    public oxj getLobbyV2FallbackFragment() {
        return new oxj();
    }

    public ywj getLobbyV2Fragment() {
        return new ywj();
    }

    @Override // defpackage.b5
    public Locale getLocale() {
        return locale;
    }

    @Override // defpackage.b5
    public String getNickName() {
        return nickName;
    }

    @Override // defpackage.b5
    public String getNullableCountry() {
        return getCountry();
    }

    @Override // defpackage.b5
    public String getNullableUserId() {
        return getUserId();
    }

    public i1z getOpenTelemetry() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.f();
        }
        return null;
    }

    public String getOperId() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.d();
        }
        return null;
    }

    public String getPatronId() {
        return patronId;
    }

    public String getPlatform() {
        return "ANDROID";
    }

    public String getScreenName() {
        return getInstance().getBaseUrl().replace("api/", "") + screenName;
    }

    public String getSportySoccerGameActivityToken() {
        return sportySoccerGameActivityToken;
    }

    public String getSportySoccerToken() {
        return sportySoccerToken;
    }

    public String getSubCountry() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.getCountryCode();
        }
        return null;
    }

    public xnh0 getUser() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            return ((bk60) zj60Var).a.k();
        }
        return null;
    }

    public String getUserId() {
        return userId;
    }

    @Override // defpackage.b5
    public String getUserImage() {
        return userImage;
    }

    public void getUserSegmentOnce(b bVar) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var == null || bVar == null) {
            return;
        }
        lob0 lob0VarL = ((bk60) zj60Var).a.l();
        v5b v5bVar = SEGMENT_SCOPE;
        pfd pfdVar = fse.a;
        ej5.b(v5bVar, gku.a, a6b.a, new ci2(lob0VarL, bVar));
    }

    @Override // defpackage.b5
    public long getVersionCode() {
        return versionCode;
    }

    @Override // defpackage.b5
    public void gotoSportyBet(xae xaeVar, Bundle bundle) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            xaeVar.getClass();
            ((bk60) zj60Var).a.h(xaeVar, bundle);
        }
    }

    public void gotoSportyGame(GameDetails gameDetails, Context context, String str, String str2) {
        ArrayList<OnboardingItem> arrayListA = sny.a(context, str);
        int i = 0;
        if (!arrayListA.isEmpty()) {
            for (int i2 = 0; i2 < arrayListA.size(); i2++) {
                if (!Boolean.TRUE.equals(arrayListA.get(i2).getIsView())) {
                    i = i2;
                    break;
                }
            }
        }
        String betcontainer_clean = gameDetails.getMetaInfo() != null ? gameDetails.getMetaInfo().getBetcontainer_clean() : null;
        String fbgdialog_old = gameDetails.getMetaInfo() != null ? gameDetails.getMetaInfo().getFbgdialog_old() : null;
        String sporthero_oldflow = gameDetails.getMetaInfo() != null ? gameDetails.getMetaInfo().getSporthero_oldflow() : null;
        Intent intent = new Intent(context, (Class<?>) GameMainActivity.class);
        intent.putExtra(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str);
        intent.putExtra("game_position", i);
        intent.putExtra("source", str2);
        intent.putExtra("betcontainer_clean", betcontainer_clean);
        intent.putExtra("fbgdialog_old", fbgdialog_old);
        intent.putExtra("sporthero_oldflow", sporthero_oldflow);
        intent.putExtra("gameDetail", gameDetails);
        context.startActivity(intent);
    }

    public void initGamesSDK(Context context, ba5 ba5Var) {
        setSgLibraryBridgeIfNotAlreadySet(ba5Var);
        setParameters();
        setParametersWith(context);
    }

    @Override // defpackage.b5
    public boolean isSideLoading(Context context) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var == null) {
            return false;
        }
        context.getClass();
        return ((bk60) zj60Var).a.isSideLoading(context);
    }

    @Override // defpackage.b5
    public void logEvent(String str, Bundle bundle) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            ((bk60) zj60Var).a(str, bundle);
        }
    }

    @Override // defpackage.b5
    public void logNonFatalException(Throwable th, Map<String, String> map) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            th.getClass();
            map.getClass();
            ((bk60) zj60Var).a.logNonFatalException(th, map);
        }
    }

    public void openAppLink(String str) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            str.getClass();
            ((bk60) zj60Var).a.o(str);
        }
    }

    @Override // defpackage.b5
    public void removeAccountUpdatedListener(bb bbVar) {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            bbVar.getClass();
            ((bk60) zj60Var).a.removeAccountUpdatedListener(bbVar);
        }
    }

    public void renewUserAccessToken() {
        zj60 zj60Var = sgLibraryBridge;
        if (zj60Var != null) {
            nzf0.a = true;
            ((bk60) zj60Var).a.m();
        }
    }

    public void setBasePrefixUrl() {
        basePrefixUrl = fetchPrefixUrlFromGradle();
    }

    public void setBaseUrl() {
        baseUrl = fetchBaseUrlFromGradle() + getInstance().getCountry() + "/games/";
    }

    public void setBaseUrlCMS() {
        baseUrlCMS = fetchPrefixUrlFromGradle() + getInstance().getCountry() + "/";
    }

    public void setBaseUrlChat() {
        baseUrlChat = fetchChatUrlFromGradle();
    }

    public void setBaseUrlExternalGames(String str) {
        baseUrl = fetchBaseUrlGamesExternalFromGradle(str) + str + "/games/";
    }

    public void setBaseUrlFeatured(String str) {
        baseUrl = pr0.a(new StringBuilder(), fetchFeaturedBaseUrlFromGradle(str), str, "/games/");
        baseUrlCMS = pr0.a(new StringBuilder(), fetchFeaturedPrefixUrlFromGradle(str), str, "/");
    }

    public void setBaseUrlSocket() {
        baseUrlSocket = fetchSocketUrlFromGradle() + getInstance().getCountry() + "/";
    }

    public void setFeaturedLanguageCode(String str) {
        language = str;
    }

    @Override // defpackage.b5
    public void setNickName(String str) {
        nickName = str;
    }

    public void setPatronId(String str) {
        patronId = str;
    }

    public void setScreenName(String str) {
        screenName = str;
    }

    public void setSportySoccerGameActivityToken(String str) {
        sportySoccerGameActivityToken = str;
    }

    public void setSportySoccerToken(String str) {
        sportySoccerToken = str;
    }

    public void setUserId(String str) {
        userId = str;
    }

    @Override // defpackage.b5
    public void setUserImage(String str) {
        userImage = str;
    }

    public void setVersionCode(Context context) {
        versionCode = w4c.a(context);
    }

    public void start(Context context, Bundle bundle, ba5 ba5Var) {
        if (ba5Var == null) {
            return;
        }
        initGamesSDK(context, ba5Var);
        if (bundle != null && bundle.containsKey("source") && "featured_games".equals(bundle.getString("source"))) {
            Intent intent = new Intent(context, (Class<?>) GamesLobbyMainActivity.class);
            intent.setFlags(268435456);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    public oxj getLobbyV2FallbackFragment(f1t f1tVar) {
        return new oxj();
    }

    public ywj getLobbyV2Fragment(f1t f1tVar) {
        return new ywj();
    }

    public suj getLobbyEntranceFragment(f1t f1tVar) {
        return getLobbyEntranceFragment(f1tVar, null);
    }
}
