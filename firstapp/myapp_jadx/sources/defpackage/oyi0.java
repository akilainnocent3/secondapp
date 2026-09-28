package defpackage;

import android.location.LocationManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.views.MainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.twilio.voice.EventKeys;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class oyi0 {
    public final MainActivity a;
    public final WebView b;
    public final String c;
    public final kju d;
    public final SportyGamesManager e;
    public final eal f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Loyi0$a;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "type", EventKeys.PAYLOAD, "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("type")
        private final String type = "";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName(EventKeys.PAYLOAD)
        private final String payload = null;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPayload() {
            return this.payload;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.type, aVar.type) && Intrinsics.g(this.payload, aVar.payload);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.payload;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("BonusVaultData(type=", this.type, ", payload=", this.payload, ")");
        }
    }

    public oyi0(MainActivity mainActivity, WebView webView, String str, kju kjuVar) {
        str.getClass();
        this.a = mainActivity;
        this.b = webView;
        this.c = str;
        this.d = kjuVar;
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        sportyGamesManager.getClass();
        this.e = sportyGamesManager;
        this.f = new eal();
    }

    @JavascriptInterface
    public final void postMessage(String str, final String str2) {
        if (Intrinsics.g(str, this.c)) {
            final MainActivity mainActivity = this.a;
            mainActivity.runOnUiThread(new Runnable() { // from class: nyi0
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // java.lang.Runnable
                public final void run() {
                    Double dH;
                    oyi0 oyi0Var = this.a;
                    kju kjuVar = oyi0Var.d;
                    String str3 = oyi0Var.c;
                    MainActivity mainActivity2 = kjuVar.a;
                    List<String> list = MainActivity.R;
                    dn80 dn80Var = (dn80) mainActivity2.a;
                    if (d0j0.b(dn80Var != null ? dn80Var.e.getUrl() : null, SportyGamesManager.getInstance().getDomain(mainActivity2))) {
                        ConcurrentHashMap<Integer, f0j0> concurrentHashMap = jzi0.a;
                        if (jzi0.a(oyi0Var.b, str3)) {
                            MainActivity mainActivity3 = oyi0Var.a;
                            SportyGamesManager sportyGamesManager = oyi0Var.e;
                            int iHashCode = str3.hashCode();
                            String str4 = str2;
                            MainActivity mainActivity4 = mainActivity;
                            switch (iHashCode) {
                                case -2070082430:
                                    if (str3.equals("ExitCaptureGameBackPress") && str4 != null) {
                                        mainActivity4.z = str4;
                                    }
                                    break;
                                case -2015259423:
                                    if (str3.equals("bonus_game_callbacks") && str4 != null) {
                                        try {
                                            oyi0.a aVar = (oyi0.a) oyi0Var.f.e(str4, oyi0.a.class);
                                            if (aVar != null) {
                                                String type = aVar.getType();
                                                if (Intrinsics.g(type, "BonusGameName")) {
                                                    String payload = aVar.getPayload();
                                                    if (payload == null) {
                                                        payload = "";
                                                    }
                                                    mainActivity3.v = true;
                                                    dn80 dn80Var2 = (dn80) mainActivity3.a;
                                                    if (dn80Var2 != null) {
                                                        dn80Var2.w.setText(payload);
                                                    }
                                                } else if (Intrinsics.g(type, "BonusGameExit")) {
                                                    mainActivity3.v = false;
                                                    String str5 = mainActivity3.i;
                                                    if (str5 == null || StringsKt.U(str5)) {
                                                        mainActivity3.finish();
                                                    } else {
                                                        dn80 dn80Var3 = (dn80) mainActivity3.a;
                                                        if (dn80Var3 != null) {
                                                            dn80Var3.w.setText(mainActivity3.i);
                                                        }
                                                    }
                                                }
                                                Unit unit = Unit.a;
                                            }
                                        } catch (qep unused) {
                                            Unit unit2 = Unit.a;
                                            return;
                                        }
                                    }
                                    break;
                                case -1879308617:
                                    if (str3.equals("GameLoaded")) {
                                        pfd pfdVar = fse.a;
                                        ej5.c(w5b.a(gku.a), null, null, new bku(mainActivity4, null), 3);
                                        break;
                                    }
                                    break;
                                case -940242166:
                                    if (str3.equals("withdraw")) {
                                        sportyGamesManager.gotoSportyBet(xae.e, null);
                                        break;
                                    }
                                    break;
                                case -123727509:
                                    if (str3.equals("GameLoadedDuration") && str4 != null && (dH = b.h(str4)) != null) {
                                        mainActivity4.N = dH.doubleValue();
                                        mainActivity4.O = true;
                                        mainActivity4.E1();
                                    }
                                    break;
                                case 3127582:
                                    if (str3.equals(JsPluginCommon.GAMES_EXIT)) {
                                        ((l1z) mainActivity4.c.getValue()).h(mainActivity4.f, mainActivity4.i);
                                        mainActivity4.finish();
                                        break;
                                    }
                                    break;
                                case 64181727:
                                    if (str3.equals("ExitRecommendationGameClick")) {
                                        GameDetails gameDetails = (GameDetails) new eal().e(str4, GameDetails.class);
                                        gameDetails.getClass();
                                        yjj.c(new yjj(), gameDetails, mainActivity4, null, 0, "All", null, 96);
                                        mainActivity4.finish();
                                        break;
                                    }
                                    break;
                                case 103149417:
                                    if (str3.equals(JsPluginCommon.GAMES_LOGIN)) {
                                        sportyGamesManager.gotoSportyBet(xae.a, null);
                                        break;
                                    }
                                    break;
                                case 337854370:
                                    if (str3.equals(JsPluginCommon.GAMES_ADD_MONEY)) {
                                        sportyGamesManager.gotoSportyBet(xae.c, null);
                                        break;
                                    }
                                    break;
                                case 425781429:
                                    if (str3.equals("ShowBettorLimitModal") && str4 != null) {
                                        try {
                                            krh0.k(mainActivity3, Integer.parseInt(str4));
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            return;
                                        }
                                    }
                                    break;
                                case 921067572:
                                    if (str3.equals("ExitRecommendationShow")) {
                                        mainActivity4.w = true;
                                        break;
                                    }
                                    break;
                                case 1410663384:
                                    if (str3.equals("ExitRecommendationStayClick")) {
                                        mainActivity4.w = false;
                                        break;
                                    }
                                    break;
                                case 1888250451:
                                    if (str3.equals("NoGPSData")) {
                                        try {
                                            Object systemService = mainActivity4.getSystemService(LastLoginDeviceInfo.KEY_LOCATION);
                                            systemService.getClass();
                                            mainActivity4.I1(!((LocationManager) systemService).isProviderEnabled("gps"));
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            return;
                                        }
                                        break;
                                    }
                                    break;
                                case 2141246174:
                                    if (str3.equals(JsPluginCommon.GAMES_TRANSACTION)) {
                                        sportyGamesManager.gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", str4));
                                        break;
                                    }
                                    break;
                            }
                        }
                    }
                }
            });
        }
    }
}
