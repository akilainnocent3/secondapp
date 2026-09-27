package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class br extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f992 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f993 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f994 = -7017710411839432555L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f995 = 6795495270814316623L;

    public br(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m1044(ImpressionData impressionData) {
        f992 = (f993 + 55) % 128;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i10 = f993 + 59;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m1045(ImpressionData impressionData) {
        f992 = (f993 + 75) % 128;
        String campaignId = impressionData.getCampaignId();
        f992 = (f993 + 117) % 128;
        return campaignId;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static String m1046(ImpressionData impressionData) {
        int i10 = f992 + 37;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = impressionData.getCreativeId();
        if (i11 != 0) {
            int i12 = 61 / 0;
        }
        f993 = (f992 + 125) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static MediationManager m1048() {
        MediationManager companion;
        int i10 = f993 + 73;
        f992 = i10 % 128;
        if (i10 % 2 == 0) {
            companion = MediationManager.Companion.getInstance();
            int i11 = 31 / 0;
        } else {
            companion = MediationManager.Companion.getInstance();
        }
        int i12 = f992 + 73;
        f993 = i12 % 128;
        if (i12 % 2 == 0) {
            return companion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1049(ImpressionData impressionData) {
        f992 = (f993 + 87) % 128;
        String demandSource = impressionData.getDemandSource();
        f993 = (f992 + 27) % 128;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1050(ImpressionData impressionData) {
        int i10 = f992 + 81;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String variantId = impressionData.getVariantId();
        if (i11 != 0) {
            int i12 = 19 / 0;
        }
        return variantId;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1052(ImpressionData impressionData) {
        int i10 = f993 + 117;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1053(ImpressionData impressionData) {
        int i10 = f993 + 115;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getRenderingSdk();
        }
        impressionData.getRenderingSdk();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m1054() {
        f993 = (f992 + 97) % 128;
        MediationManager mediationManagerM1048 = m1048();
        f992 = (f993 + 67) % 128;
        return mediationManagerM1048;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ double m1056(ImpressionData impressionData) {
        int i10 = f993 + 13;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1047(impressionData);
        }
        m1047(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m1058(ImpressionData impressionData) {
        f993 = (f992 + 87) % 128;
        String strM1045 = m1045(impressionData);
        f992 = (f993 + 5) % 128;
        return strM1045;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1059(ImpressionData impressionData) {
        f993 = (f992 + 47) % 128;
        String strM1046 = m1046(impressionData);
        f993 = (f992 + 63) % 128;
        return strM1046;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static PlacementType m1060(ImpressionData impressionData) {
        int i10 = f993 + 33;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1063(ImpressionData impressionData) {
        int i10 = f992 + 25;
        f993 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1050(impressionData);
        }
        m1050(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1067(Placement placement) {
        int i10 = f993 + 17;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adTypeM1062 = m1062(placement);
        if (i11 == 0) {
            int i12 = 54 / 0;
        }
        f992 = (f993 + 95) % 128;
        return adTypeM1062;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1071(ImpressionData impressionData) {
        int i10 = f993 + 121;
        f992 = i10 % 128;
        if (i10 % 2 == 0) {
            m1060(impressionData);
            throw null;
        }
        PlacementType placementTypeM1060 = m1060(impressionData);
        f992 = (f993 + 71) % 128;
        return placementTypeM1060;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1077(Constants.AdType adType) {
        f993 = (f992 + 61) % 128;
        PlacementType placementTypeM1080 = m1080(adType);
        f992 = (f993 + 51) % 128;
        return placementTypeM1080;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m1081(MediationManager mediationManager) {
        f992 = (f993 + 119) % 128;
        PlacementsHandler placementsHandlerM1072 = m1072(mediationManager);
        int i10 = f992 + 37;
        f993 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementsHandlerM1072;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static double m1047(ImpressionData impressionData) {
        f993 = (f992 + 9) % 128;
        double netPayout = impressionData.getNetPayout();
        f993 = (f992 + 29) % 128;
        return netPayout;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m1051() {
        f992 = (f993 + 67) % 128;
        boolean zAssertStarted = FairBid.assertStarted();
        int i10 = f993 + 125;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return zAssertStarted;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1055(ImpressionData impressionData) {
        f992 = (f993 + 75) % 128;
        String strM1044 = m1044(impressionData);
        f993 = (f992 + 41) % 128;
        return strM1044;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1057() {
        f992 = (f993 + 119) % 128;
        boolean zM1051 = m1051();
        int i10 = f993 + 121;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM1051;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Constants.AdType m1061(String str) {
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m1085("ﵓﴚ䬔叏붯賑槸\u2002齕ㆮ⺅豘㦯陠䠼⸩", '1' - AndroidCharacter.getMirror('0')).intern())) {
                    int i10 = f993 + 29;
                    f992 = i10 % 128;
                    if (i10 % 2 != 0) {
                        Constants.AdType adType = Constants.AdType.INTERSTITIAL;
                        int i11 = f992 + 111;
                        f993 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return adType;
                        }
                        throw null;
                    }
                }
                return null;
            case 433141802:
                if (str.equals(m1064("\uf81a緌\uf39e楦\uef34攙\udacf", Color.rgb(0, 0, 0) + 16811469).intern())) {
                    return Constants.AdType.UNKNOWN;
                }
                return null;
            case 543046670:
                if (str.equals(m1064("\uf81d႙⤾䆷婑狔譸ꐎ", 59539 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    return Constants.AdType.REWARDED;
                }
                return null;
            case 1951953708:
                if (str.equals(m1064("\uf80d뛵旷ᓰ쏦狺", 20219 - TextUtils.indexOf("", "")).intern())) {
                    f993 = (f992 + 51) % 128;
                    return Constants.AdType.BANNER;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1066(RewardedListener rewardedListener) {
        f993 = (f992 + 93) % 128;
        m1087(rewardedListener);
        int i10 = f993 + 111;
        f992 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1068(String str) {
        int i10 = f992 + 45;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adTypeM1061 = m1061(str);
        if (i11 != 0) {
            int i12 = 0 / 0;
        }
        return adTypeM1061;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m1075(MediationConfig mediationConfig) {
        int i10 = f993 + 85;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        List<AdapterConfiguration> listM1086 = m1086(mediationConfig);
        if (i11 == 0) {
            int i12 = 12 / 0;
        }
        int i13 = f993 + 31;
        f992 = i13 % 128;
        if (i13 % 2 != 0) {
            return listM1086;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1078(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 7;
        f993 = i10 % 128;
        if (i10 % 2 != 0) {
            m1082(adsConfig);
            throw null;
        }
        String strM1082 = m1082(adsConfig);
        f993 = (f992 + 17) % 128;
        return strM1082;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1083(ImpressionData impressionData) {
        f993 = (f992 + 77) % 128;
        String strM1053 = m1053(impressionData);
        f992 = (f993 + 17) % 128;
        return strM1053;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1069(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 11;
        f993 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1073(adsConfig);
        }
        m1073(adsConfig);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1076(InterstitialListener interstitialListener) {
        int i10 = f993 + 73;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        m1065(interstitialListener);
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
        f992 = (f993 + 71) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1079(ImpressionData impressionData) {
        f993 = (f992 + 95) % 128;
        String strM1052 = m1052(impressionData);
        f992 = (f993 + 91) % 128;
        return strM1052;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1084(Placement placement) {
        f992 = (f993 + 27) % 128;
        String strM1074 = m1074(placement);
        int i10 = f993 + 97;
        f992 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 59 / 0;
        }
        return strM1074;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1064("\uf828䬇鹡\ue185㒞蟊쬨ḕ慓뒳ߢ䫎鸞\ue167㑗融쫸ᷗ愗둑ޥ䪍鷥\ue125㐙蝉쪸", View.getDefaultSize(0, 0) + 45869).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1054();
            }
        });
        map.put(m1085("곜겻㠞⃮䬌穒㻆眸컬䊣\ud80b\udb5b树\ue573뺲社詃ߪፇߦ◢馏\uf122ꑎ䜈㱂", -TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1077((Constants.AdType) list.get(0));
            }
        });
        map.put(m1064("\uf828삳褉凍ᩆ\ue2c2ꮫ琅㳴՝췜隳弍⟎\ue070\ua8cc熾㨶ˡ쭵鏘岧┄\ued95뙹绊䞑\u0015좃酿", View.getDefaultSize(0, 0) + 14489).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1071((ImpressionData) list.get(0));
            }
        });
        map.put(m1085("ꅿꄘ斒絢㋽Σꦔ\ue062썆Ἃꇱ䰔斤룜읆\uee6a蟭婇檺邭⡎쐥裢㌃䪿懎⹁함\uece9\u0378䶌瞱ᅘ", -Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1083((ImpressionData) list.get(0));
            }
        });
        map.put(m1085("\uec0f\uec68趠镐㏠ʾ佟ک踶\uf739ꃬ꫟⣔僮왛ࢡ쪝뉵殧癦放Ⱇ觿허ߏ觼⽜㎣ꆙ\ueb4a䲑酺尨䔗틳ﳐﻜ\ua6fc灅媘", 1 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1079((ImpressionData) list.get(0));
            }
        });
        map.put(m1064("\uf828넩樽⌏\udc2e锰丯ܿ뀤椧∸\udb01鐅䴬\u0604뼖栞ℸ\uda1c錛䰒Ԟ빩睙\u2068\ud971鉳䭽Ѿ", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18691).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1070((ImpressionData) list.get(0));
            }
        });
        map.put(m1064("\uf828兕\uaac5ѻ州띄Ç婓도ോ曐끕\u09d5捸볜ᙊ濞륶ዀ汐엊ὅ棋쉒ᯮ界", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43391).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1063((ImpressionData) list.get(0));
            }
        });
        map.put(m1064("\uf828劕굅\uf83b勞궄\uf847匓귄\uf88b卐긕\uf8d5厸깜金叞꺮籠吖껳礪呜꼉戮咜", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43710).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return Double.valueOf(br.m1056((ImpressionData) list.get(0)));
            }
        });
        map.put(m1085("旹斞䩇劷顖꤈Ꟃ\uee34߀マ\u0b5a䉂ꄢ霉淭\ue03c䍫疒쀑黻\uecc8\uebe1≞㵞踼上蓱\udb21⡤ⲃ\ue710", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1059((ImpressionData) list.get(0));
            }
        });
        map.put(m1064("\uf828픷ꈁ网䱖\u19ae\uf693쏡郔渹㬄ࠟ\ue57d뉲辸岈⧾ۣ퐡ꄞ繮䭜ᡅ\uf5bd슄鿿泏㨄ᜌ\ue46b녈躥宁", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11549).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1055((ImpressionData) list.get(0));
            }
        });
        map.put(m1085("馣駄귷딇\udd5b\uec05뤰\uf0c6ﮚ흮乗岰嵸点⣠ﻎ뼱鈢蔜耉႒\u0c51杀⎤牷ꦯ쇼엂퐵쬳ꈝ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1058((ImpressionData) list.get(0));
            }
        });
        map.put(m1085("舮艉ᔻ\u0dcb\uea6c\udb32⸆柸\ue00a澢祛쮏", TextUtils.getOffsetBefore("", 0) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1078((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1064("\uf828⣍姵誩뮧\ueca3ᵗ乻", 53479 - TextUtils.getCapsMode("", 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1069((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1064("\uf828\u0df1ᎍᦟ⽇㕩㬝䃆囲岎抂桉繥萶觜鿽ꖊꮶ녈읺촺틗\ud8f3\uee91", 62939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1075((MediationConfig) list.get(0));
            }
        });
        map.put(m1064("\uf828䱁郭\ue55e⦏縹슮ᛇ孺꿩\uf40f㢢贊텄◁橳뺏̱", 46187 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1067((Placement) list.get(0));
            }
        });
        map.put(m1064("\uf828۽֕ҚͿȝĦ࿋ບඥేଆਕࣅ០ᚳ", TextUtils.indexOf("", "", 0, 0) + 65239).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1084((Placement) list.get(0));
            }
        });
        map.put(m1064("\uf828\ueca7턡언ꨗ黯荢矱届䃟㖣ᨴຠ\uf32e\ue798챢냻ꕾ觀繊", 5261 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1081((MediationManager) list.get(0));
            }
        });
        map.put(m1064("\uf828쵏鋱堡\u2dbf\uf2e2롨跼匂ᢇ\uedd3덭碞", 13669 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return br.m1068((String) list.get(0));
            }
        });
        map.put(m1064("\uf83c楋\udaf9䰥붥⻞遬ƚ猴\ue452嗬윐⢪駃୭粬\uee36彍샩㈙ꎵᓟ虫", TextUtils.getCapsMode("", 0, 0) + 37217).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                br.m1076((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1064("\uf83c弿똑ഢ摾뭑ቐ榮삃➗绹헤Ⳛ萭\udb1d㈑襱\ue04f䝇", View.MeasureSpec.getSize(0) + 42773).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                br.m1066((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1064("\uf82e걯傚ӓꥱ嶤Ǯ뙾媶໖댅枻\u0bcf", 21587 - TextUtils.getTrimmedLength("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return Boolean.valueOf(br.m1057());
            }
        });
        int i10 = f993 + 97;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1070(ImpressionData impressionData) {
        int i10 = f993 + 51;
        f992 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1049(impressionData);
        }
        m1049(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1073(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 101;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String str = adsConfig.store;
        if (i11 != 0) {
            int i12 = 63 / 0;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0271  */
    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        byte b10 = 9;
        switch (str.hashCode()) {
            case -2041833493:
                if (!str.equals(m1085("괦굧ᖃ൲\u10ccↇ玵㩺켆漏菀阹槡죑\ue572", 1 - Color.blue(0)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f992 + 99;
                    f993 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 16 : (byte) 43;
                }
                break;
            case -1598046662:
                if (!str.equals(m1085("봬뵡棥瀕浫尥咙ᵏ\udf19ቸﹼ넳秪떛飖ፆ鮶圝㔪", TextUtils.indexOf("", "", 0) + 1).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f992 + 25;
                    f993 = i11 % 128;
                    if (i11 % 2 == 0) {
                        b10 = 4;
                    } else {
                        b10 = 3;
                    }
                }
                break;
            case -1115843213:
                if (!str.equals(m1085("ᢇᣎ垘你\uf553쐉毉∄窶ⴂ晞蹾\udc40請ÅⰂ㸏桨", 1 - (Process.myTid() >> 22)).intern())) {
                    b10 = -1;
                }
                break;
            case -847426041:
                if (!str.equals(m1064("\uf80e\udb72뺜鈴畟䢗Ⱛལ\ue2e8였饓糵倄㎿ᛣ\uea19춫ꃏ葢枺", 9049 - KeyEvent.keyCodeFromString("")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case -498060603:
                if (!str.equals(m1064("\uf81fؾДɻ^ຳ಄૪࣓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65052).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f993 + 109;
                    f992 = i12 % 128;
                    b10 = i12 % 2 == 0 ? f6.q.f83619w : (byte) 6;
                }
                break;
            case -368841467:
                if (!str.equals(m1064("\uf80c崿눎᜔汮셾♨筜", 42257 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161638p;
                }
                break;
            case -174936018:
                if (!str.equals(m1085("ᎽᏯ鎏譿윙\uf644㣽焣熛\ue902吂\udd54", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern())) {
                    b10 = -1;
                } else {
                    f992 = (f993 + 9) % 128;
                    b10 = zi.c.f161636n;
                }
                break;
            case 99044255:
                if (!str.equals(m1085("ꠍꡝ艹骀뢤觯᜶廪쨼\uf8fd⮿\uf297泑弐䴏僽躔", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161635m;
                }
                break;
            case 438795617:
                if (!str.equals(m1064("\uf801Ӂǭ\u0ef9\u0b8cࢪᖦባέᱭᤑ☢⌮⿒", TextUtils.lastIndexOf("", '0', 0, 0) + 64748).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161639q;
                }
                break;
            case 578208537:
                if (!str.equals(m1085("\ue735\ue773뵿ꖋ\ue6e5\ud7a6怓⧞蔣쟿痿", 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 769047372:
                if (!str.equals(m1064("\uf806涖퍕㤏껡ᒯ穱\ue027喃뭉℈雾", 38327 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 806552769:
                if (!str.equals(m1085("ⱅⰖ捄箹↯ც筛㊓乞\u19dd능黩\ue882븗퐎", -Process.getGidForName("")).intern())) {
                    b10 = -1;
                } else {
                    f992 = (f993 + 31) % 128;
                    b10 = 13;
                }
                break;
            case 1062384924:
                if (!str.equals(m1085("\ue481\ue4d1덯ꮖဌⅇ緦㐺蚰짫茗顇⁝渡\ue596㨼숓貚䡆䓤涣", 1 - TextUtils.indexOf("", "")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1212533506:
                if (!str.equals(m1064("\uf81d鹗㓂쭙應\uf85a黄㕀쯫扃\uf8de齤㗶챸拼葉", (ViewConfiguration.getScrollBarSize() >> 8) + 26237).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f992 + 51;
                    f993 = i13 % 128;
                    if (i13 % 2 == 0) {
                        b10 = 8;
                    } else {
                        b10 = 7;
                    }
                }
                break;
            case 1297340448:
                if (!str.equals(m1085("ꬢ꭫턒짩\ue614흊컷蜭줄ꮈ甞⭗濾ెᎧ褦趒\ueeea빁\uf7e2∗炙尋呐", View.getDefaultSize(0, 0) + 1).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f992 + 65;
                    f993 = i14 % 128;
                    if (i14 % 2 == 0) {
                        b10 = 7;
                    } else {
                        b10 = 65;
                    }
                }
                break;
            case 1775008410:
                if (!str.equals(m1085("ጣ፦疊浩ዞ⎑䥏\u009e焃༰臔곿ퟮ꣖\ue761", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161643u;
                }
                break;
            case 1884304309:
                if (!str.equals(m1064("\uf802筏ﻡ爉\uf5ba棂\uec78濣\ue309暏\ud9dc嵶킒吉\ud7ac䫖", 33636 - MotionEvent.axisFromString("")).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 1955869213:
                if (!str.equals(m1085("\uf36c\uf32d擊簻綾젩\ue8e9ꄯ酈Ṇ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i15 = f992 + 69;
                    f993 = i15 % 128;
                    if (i15 % 2 == 0) {
                        b10 = 2;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 1969669106:
                if (!str.equals(m1064("\uf80e顸㢚\ud8f5祬ᦾ맛婣練", ExpandableListView.getPackedPositionType(0L) + 24659).intern())) {
                    b10 = -1;
                } else {
                    int i16 = f992 + 63;
                    f993 = i16 % 128;
                    if (i16 % 2 == 0) {
                        b10 = 3;
                    } else {
                        b10 = 2;
                    }
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return FairBid.class;
            case 1:
                return MediationManager.class;
            case 2:
                return Constants.AdType.class;
            case 3:
                return FairBid.AdsConfig.class;
            case 4:
                return MediationConfig.class;
            case 5:
                return PlacementsHandler.class;
            case 6:
                return Placement.class;
            case 7:
                return InterstitialListener.class;
            case 8:
                return RewardedListener.class;
            case 9:
                return ImpressionData.class;
            case 10:
                return Interstitial.class;
            case 11:
                return PlacementType.class;
            case 12:
                return Rewarded.class;
            case 13:
                return ShowOptions.class;
            case 14:
                return CachedAd.class;
            case 15:
                return NetworkAdapter.class;
            case 16:
                return AdapterPool.class;
            case 17:
                return AdapterConfiguration.class;
            case 18:
                return EventStream.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1074(Placement placement) {
        f992 = (f993 + 47) % 128;
        String name = placement.getName();
        int i10 = f992 + 87;
        f993 = i10 % 128;
        if (i10 % 2 == 0) {
            return name;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        int i10 = f992 + 53;
        f993 = i10 % 128;
        try {
            try {
                String str = (String) (i10 % 2 != 0 ? FairBid.class.getDeclaredField(m1064("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", 16842065 >>> Color.rgb(1, 1, 0)).intern()) : FairBid.class.getDeclaredField(m1064("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", Color.rgb(0, 0, 0) + 16842065).intern())).get(null);
                int i11 = f992 + 103;
                f993 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 81 / 0;
                }
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2304().m2306().m2406(FairBid.class, m1085("턩텷攡緯ࣥ㦓̠䫻댠ΰ鯀\ue6c6ᗜ롇ﵫ䓸\uf788媛傘㩮堤쒟닃馐㫐愳ᐏ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementsHandler m1072(MediationManager mediationManager) {
        int i10 = f992 + 105;
        f993 = i10 % 128;
        if (i10 % 2 != 0) {
            mediationManager.getPlacementsHandler();
            throw null;
        }
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        f992 = (f993 + 29) % 128;
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m1062(Placement placement) {
        int i10 = f992 + 41;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adType = placement.getAdType();
        if (i11 != 0) {
            int i12 = 38 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1065(InterstitialListener interstitialListener) {
        int i10 = f992 + 13;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1064(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            try {
                f.f2017 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2018 = 0;
                while (true) {
                    int i11 = f.f2018;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f995);
                        f.f2018++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementType m1080(Constants.AdType adType) {
        int i10 = f993 + 103;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        PlacementType placementType = adType.getPlacementType();
        if (i11 == 0) {
            int i12 = 72 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1082(FairBid.AdsConfig adsConfig) {
        int i10 = f992 + 55;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        String str = adsConfig.appId;
        if (i11 != 0) {
            throw null;
        }
        int i12 = f992 + 75;
        f993 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 58 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1086(MediationConfig mediationConfig) {
        int i10 = f993 + 1;
        f992 = i10 % 128;
        int i11 = i10 % 2;
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (i11 == 0) {
            int i12 = 88 / 0;
        }
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1087(RewardedListener rewardedListener) {
        int i10 = f992 + 25;
        f993 = i10 % 128;
        int i11 = i10 % 2;
        Rewarded.setRewardedListener(rewardedListener);
        if (i11 != 0) {
            int i12 = 10 / 0;
        }
        f993 = (f992 + 15) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1085(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            try {
                char[] cArrM2198 = h.m2198(f994, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2198.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f994));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2198, 4, cArrM2198.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
