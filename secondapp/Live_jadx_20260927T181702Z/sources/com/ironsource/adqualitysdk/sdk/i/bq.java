package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bq extends bd {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f975 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f976 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f977 = -8983181033830927815L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f978 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f979 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f980 = 1538894784;

    public bq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ FiveAd m1020() {
        f975 = (f978 + 37) % 128;
        FiveAd fiveAdM1022 = m1022();
        int i10 = f975 + 31;
        f978 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdM1022;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1023(FiveAdInterface fiveAdInterface) {
        f975 = (f978 + 49) % 128;
        String slotId = fiveAdInterface.getSlotId();
        int i10 = f975 + 37;
        f978 = i10 % 128;
        if (i10 % 2 == 0) {
            return slotId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1024(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 75;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return fiveAdInterface.getAdParameter();
        }
        fiveAdInterface.getAdParameter();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1025(FiveAdInterface fiveAdInterface) {
        f975 = (f978 + 3) % 128;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i10 = f975 + 23;
        f978 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdTag;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static CreativeType m1026(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 115;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            fiveAdInterface.getCreativeType();
            throw null;
        }
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        f978 = (f975 + 3) % 128;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1028(FiveAdCustomLayout fiveAdCustomLayout) {
        f975 = (f978 + 59) % 128;
        String strM1035 = m1035(fiveAdCustomLayout);
        f975 = (f978 + 7) % 128;
        return strM1035;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ CreativeType m1031(FiveAdInterface fiveAdInterface) {
        f978 = (f975 + 47) % 128;
        CreativeType creativeTypeM1026 = m1026(fiveAdInterface);
        int i10 = f978 + 117;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return creativeTypeM1026;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ FiveAdListener m1034(FiveAdInterface fiveAdInterface) {
        int i10 = f978 + 65;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            m1021(fiveAdInterface);
            throw null;
        }
        FiveAdListener fiveAdListenerM1021 = m1021(fiveAdInterface);
        f975 = (f978 + 85) % 128;
        return fiveAdListenerM1021;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1038(FiveAdInterface fiveAdInterface) {
        f975 = (f978 + 67) % 128;
        String strM1023 = m1023(fiveAdInterface);
        int i10 = f978 + 5;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1023;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1040(FiveAdInterface fiveAdInterface) {
        f975 = (f978 + 93) % 128;
        String strM1024 = m1024(fiveAdInterface);
        int i10 = f978 + 7;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1024;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAdListener m1021(FiveAdInterface fiveAdInterface) {
        f978 = (f975 + 7) % 128;
        FiveAdListener listener = fiveAdInterface.getListener();
        f975 = (f978 + 63) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static FiveAd m1022() {
        int i10 = f978 + 99;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return FiveAd.getSingleton();
        }
        int i11 = 50 / 0;
        return FiveAd.getSingleton();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1029(FiveAdInterface fiveAdInterface) {
        f975 = (f978 + 105) % 128;
        String strM1025 = m1025(fiveAdInterface);
        int i10 = f978 + 45;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 9 / 0;
        }
        return strM1025;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1032(FiveAdConfig fiveAdConfig) {
        f978 = (f975 + 73) % 128;
        String strM1027 = m1027(fiveAdConfig);
        int i10 = f978 + 3;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1027;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1035(FiveAdCustomLayout fiveAdCustomLayout) {
        int i10 = f978 + 37;
        f975 = i10 % 128;
        if (i10 % 2 != 0) {
            return fiveAdCustomLayout.getAdvertiserName();
        }
        fiveAdCustomLayout.getAdvertiserName();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1039(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2675 = 0;
                while (true) {
                    int i11 = j.f2675;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2674 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2675;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f976) ^ ((long) f980)) ^ ((long) f979));
                        j.f2675 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1042(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f978 + 83;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        m1033(fiveAdInterface, fiveAdLoadListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1030(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f978 + 97;
        f975 = i10 % 128;
        int i11 = i10 % 2;
        m1041(fiveAdInterface, fiveAdListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1037(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        f978 = (f975 + 1) % 128;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        int i10 = f978 + 49;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1043(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f975 + 119;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        m1037(fiveAdInterface, fiveAdViewEventListener);
        if (i11 != 0) {
            int i12 = 1 / 0;
        }
        int i13 = f978 + 75;
        f975 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        int i10 = f978 + 103;
        f975 = i10 % 128;
        if (i10 % 2 == 0) {
            FiveAd.getSdkSemanticVersion();
            throw null;
        }
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        f978 = (f975 + 7) % 128;
        return sdkSemanticVersion;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1033(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f975 = (f978 + 57) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f975 = (f978 + 125) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1036(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f977);
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1039("\udc60ÝᲥ㕸馃\ufe6f돞跛鼩侊鋧\uf7e8妶굲넅浨瀃ﱘ론뢸", (char) (ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", AndroidCharacter.getMirror('0') - '0', "Ⱐ遏둗◅").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1032((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1039("桲䉰턀ꙻ邏౨\uebea閺㫊鉳惷ꪎ䊋\udd0c䮜\ue552ꅪ늢\udcaf熽笥岄즃䌊", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "捺ퟹጶ奮").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1038((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1036("㉞킯\uf7ab骦릜峰揮\u06dd◅죻\uef29\uf23c鄸된嬕繥ᵪⁿ읻\uea51袢", 58099 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1029((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1036("㉞鵻氃㼊軌妌⢶\uf869䭥ᨯ\ue5d1든ވ횰꙽焑쀪鏋拄춮鵐汫㼗軑姧⢓ﮛ䭝ᨍ\ue537", 44839 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1031((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1039("杋\ued2e⬖\udccf\ue2ecⵔ㤦㻓赤ﮪ족慉\ue01d\ue814챉☘\ufb12⚧釤눾꥓\uf617\uf8ab뿓䖩쑞鄍蠭䢤", (char) (TextUtils.getOffsetAfter("", 0) + 64474), "\u0000\u0000\u0000\u0000", Color.alpha(0) - 1154598813, "揼⸸\udabb泻").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1040((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1036("㉞羅ꓫ历Ἔ쫐\uf1ae봽棅ល썩軜떸慼ⳕ\udb85蝪닟禣╹퀶龂䭾瘢㶔\ue950", View.MeasureSpec.getMode(0) + 52051).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1034((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1039("鈖⩥撶\udecc꽻븊㥄팼괔끃馘嗾眗\ue669䧸쟚媨Ͱڌﺝ뭫꼂焎뼹\ueaf2\ueb9f", (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10807), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "\ude4a㖏㜬먪").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bq.m1030((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1036("㉞\ue597鷛딞浼Ҹ㲞퓵谅ꑉ徾矮\u2fda윚ｆ隨仦昬", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55242).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1020();
            }
        });
        map.put(m1036("㉞ⷳഓ浲䳬갤豆\uefb1켥⽝ບ滏乹ꦵ视\ue934좨⣟࠘殱䯡ꬣ譗\ueaf6쨴⩜\u058b攥䕮\ua48f蓉\ue446잸⟛ݢ", 8111 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bq.m1028((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1039("橙ばꠅ矡᪽膴蔪漶慚ﱚꅑ\uf2bf䤶憭嫸", (char) (TextUtils.indexOf("", "", 0, 0) + 12454), "\u0000\u0000\u0000\u0000", Drawable.resolveOpacity(0, 0) + 11987721, "ञ뛫ꘀ\uf530").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bq.m1042((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1039("綢ꄉݽ\uefbc嵟⩅粐㸇꺩쪲\uf3b9䙞꼓톣萸沎癥וֹᲪ鵃", (char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, "\uf3ea兙\u0e7c謘").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bq.m1043((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f975 + 49;
        f978 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x0120  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123  */
    /* JADX WARN: Code duplicated, block: B:33:0x013b  */
    /* JADX WARN: Code duplicated, block: B:34:0x013e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0158  */
    /* JADX WARN: Code duplicated, block: B:37:0x015b  */
    /* JADX WARN: Code duplicated, block: B:39:0x017f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0183  */
    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX WARN: Code duplicated, block: B:43:0x019c  */
    /* JADX WARN: Code duplicated, block: B:45:0x01be  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x021f  */
    /* JADX WARN: Code duplicated, block: B:56:0x022a  */
    /* JADX WARN: Code duplicated, block: B:57:0x022d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0230  */
    /* JADX WARN: Code duplicated, block: B:60:0x0247  */
    /* JADX WARN: Code duplicated, block: B:61:0x0251  */
    /* JADX WARN: Code duplicated, block: B:63:0x026c  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[SYNTHETIC] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        int i10;
        int i11 = f975 + 97;
        f978 = i11 % 128;
        byte b10 = 2;
        if (i11 % 2 != 0) {
            int i12 = 53 / 0;
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m1039("倢昗\udeb4﹘돥\uf862\ued2f굿\udca8仆", (char) Color.green(0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⺢ﳃ뵴孖").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m1036("㉿䳩켽乷좜䯀쨹䕟잕䛝셬䎘싰崫\udc46府\ud9cd堵\udb4d嗧퐣坠톓像팒剜\uec96濔\uee60梾", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32441).intern())) {
                        b10 = -1;
                    } else {
                        f975 = (f978 + 95) % 128;
                        b10 = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m1039("꜍詾钫\uf32c誉樂\ud9c3ំ恏\udf40鋧悛\ueb9f\ue6e1\udabe\u1aee夰\uef38熶搏㰎卑儂", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", Color.green(0) + 1686834861, "굋謎塤\u0a52").intern())) {
                        b10 = -1;
                    } else {
                        i10 = f975 + 69;
                        f978 = i10 % 128;
                        if (i10 % 2 != 0) {
                            b10 = zi.c.f161636n;
                        } else {
                            b10 = 121;
                        }
                    }
                    break;
                case -939888073:
                    if (!str.equals(m1036("㉿˩匽ꁷ\uf09c쇀ᘬ杙랟蓞핪▭", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12473).intern())) {
                        b10 = -1;
                    }
                    break;
                case -853874964:
                    if (str.equals(m1036("㉿嫭\ue335\u086b邌㧬䘑\uef7d瞣鳱┺뉒", TextUtils.getOffsetAfter("", 0) + 26813).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -735613671:
                    if (str.equals(m1039("Ȳ\u0cd3뭲ꨜᤸ㨬壧픙\uf63b杰沜\uf583迡臓З癦\u2fdc돏題汵ဿ錭짤碭妛瀇懦", (char) (809 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0) - 2104003695, "酧靳⪂\ue103").intern())) {
                        b10 = -1;
                    } else {
                        f975 = (f978 + 105) % 128;
                        b10 = zi.c.f161638p;
                    }
                    break;
                case -624329424:
                    if (str.equals(m1036("㉿略밥\ue7c3⺬噔饄쀿\u0be2느梅㴓搉꿩횦ṍ䄜裈", Drawable.resolveOpacity(0, 0) + 18229).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m1039("㞤ꘊ\udabb\ue9ec酨婽ḭ\ufff9盆喪ɨ⍊↷㵯⤢躴띝꽡㖦හཇ儺碍욓瓣儑䠱韟ᑘ媳惏", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30652), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 702959057, "퇃\ue64d방⭷").intern())) {
                        b10 = -1;
                    } else {
                        b10 = zi.c.f161639q;
                    }
                    break;
                case -189625759:
                    if (str.equals(m1036("㉿霃磩\udda5Ꜵࣂ\ued82뜒ᣕﶷ䝵⣛趩坧㣇鶍杨죖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42323).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -6611420:
                    if (str.equals(m1036("㉿鶟淑㴱资嵖Ⲫﳾ䰵ᰛ\uec5d뾺\u0fec\udfd9꼎", 45007 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 636996201:
                    if (str.equals(m1039("⻚렢艺\ueacc茟蘾䡪釡\ue4e4ꢖ穩㇋⦠㴳", (char) (48865 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "꧊ᖤ\ue05b薾").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m1039("捵\uef0c㮾\ude4a钿ꏕ쥁㼮㴠휉悑⃮蒁啳\ue079滐⇨욺猪\ude2f\ue8c1눚勸謑沂䆙欲\udc9b捛苫쏢\u2fdfᆿჾ텬", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u0000\u0000\u0000\u0000", 1519817406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "빂隒ग़쑁").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m1036("㉿╣ᰩ矅溴䆢륝逵诅\ue297햨쵚\u2438Ῑ皒榶䅭", 5939 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        b10 = -1;
                    } else {
                        f978 = (f975 + 17) % 128;
                        b10 = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m1039("剁\uf10e拋邩쾯굅槷긫\ue356〳욊", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1745777887 - ImageFormat.getBitsPerPixel(0), "\ue0de\u0e74흨䱍").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1835584239:
                    if (str.equals(m1039("쁷\u2d7cඕϺ澣㹚齝춗\uf8f4Ó\u2d76훷⃗뮝뱰\ue4dc㔃艑", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12460), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "\u0eda༢괜\ue830").intern())) {
                        b10 = -1;
                    } else {
                        b10 = zi.c.f161635m;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m1036("㉺\u2d72మ濳亩깍褙\ue8d3쮥⭁ੳ支", 7992 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 2104624789:
                    if (str.equals(m1039("彽볐⊞\ufdcb\uf84b当", (char) (32187 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 1, "헶橵뮱婽").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case -1836618638:
                    if (str.equals(m1039("倢昗\udeb4﹘돥\uf862\ued2f굿\udca8仆", (char) Color.green(0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), "⺢ﳃ뵴孖").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 13;
                    }
                    break;
                case -1782131271:
                    if (str.equals(m1036("㉿䳩켽乷좜䯀쨹䕟잕䛝셬䎘싰崫\udc46府\ud9cd堵\udb4d嗧퐣坠톓像팒剜\uec96濔\uee60梾", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32441).intern())) {
                        b10 = -1;
                    } else {
                        f975 = (f978 + 95) % 128;
                        b10 = 16;
                    }
                    break;
                case -962125644:
                    if (str.equals(m1039("꜍詾钫\uf32c誉樂\ud9c3ំ恏\udf40鋧悛\ueb9f\ue6e1\udabe\u1aee夰\uef38熶搏㰎卑儂", (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", Color.green(0) + 1686834861, "굋謎塤\u0a52").intern())) {
                        b10 = -1;
                    } else {
                        i10 = f975 + 69;
                        f978 = i10 % 128;
                        if (i10 % 2 != 0) {
                            b10 = zi.c.f161636n;
                        } else {
                            b10 = 121;
                        }
                    }
                    break;
                case -939888073:
                    if (!str.equals(m1036("㉿˩匽ꁷ\uf09c쇀ᘬ杙랟蓞핪▭", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12473).intern())) {
                        b10 = -1;
                    }
                    break;
                case -853874964:
                    if (str.equals(m1036("㉿嫭\ue335\u086b邌㧬䘑\uef7d瞣鳱┺뉒", TextUtils.getOffsetAfter("", 0) + 26813).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case -735613671:
                    if (str.equals(m1039("Ȳ\u0cd3뭲ꨜᤸ㨬壧픙\uf63b杰沜\uf583迡臓З癦\u2fdc돏題汵ဿ錭짤碭妛瀇懦", (char) (809 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0) - 2104003695, "酧靳⪂\ue103").intern())) {
                        b10 = -1;
                    } else {
                        f975 = (f978 + 105) % 128;
                        b10 = zi.c.f161638p;
                    }
                    break;
                case -624329424:
                    if (str.equals(m1036("㉿略밥\ue7c3⺬噔饄쀿\u0be2느梅㴓搉꿩횦ṍ䄜裈", Drawable.resolveOpacity(0, 0) + 18229).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case -295916403:
                    if (str.equals(m1039("㞤ꘊ\udabb\ue9ec酨婽ḭ\ufff9盆喪ɨ⍊↷㵯⤢躴띝꽡㖦හཇ儺碍욓瓣儑䠱韟ᑘ媳惏", (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30652), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 702959057, "퇃\ue64d방⭷").intern())) {
                        b10 = -1;
                    } else {
                        b10 = zi.c.f161639q;
                    }
                    break;
                case -189625759:
                    if (str.equals(m1036("㉿霃磩\udda5Ꜵࣂ\ued82뜒ᣕﶷ䝵⣛趩坧㣇鶍杨죖", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42323).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case -6611420:
                    if (str.equals(m1036("㉿鶟淑㴱资嵖Ⲫﳾ䰵ᰛ\uec5d뾺\u0fec\udfd9꼎", 45007 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 636996201:
                    if (str.equals(m1039("⻚렢艺\ueacc茟蘾䡪釡\ue4e4ꢖ穩㇋⦠㴳", (char) (48865 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getDoubleTapTimeout() >> 16, "꧊ᖤ\ue05b薾").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 890103511:
                    if (str.equals(m1039("捵\uef0c㮾\ude4a钿ꏕ쥁㼮㴠휉悑⃮蒁啳\ue079滐⇨욺猪\ude2f\ue8c1눚勸謑沂䆙欲\udc9b捛苫쏢\u2fdfᆿჾ텬", (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "\u0000\u0000\u0000\u0000", 1519817406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "빂隒ग़쑁").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1252059573:
                    if (str.equals(m1036("㉿╣ᰩ矅溴䆢륝逵诅\ue297햨쵚\u2438Ῑ皒榶䅭", 5939 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        b10 = -1;
                    } else {
                        f978 = (f975 + 17) % 128;
                        b10 = 9;
                    }
                    break;
                case 1508614908:
                    if (str.equals(m1039("剁\uf10e拋邩쾯굅槷긫\ue356〳욊", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", 1745777887 - ImageFormat.getBitsPerPixel(0), "\ue0de\u0e74흨䱍").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1835584239:
                    if (str.equals(m1039("쁷\u2d7cඕϺ澣㹚齝춗\uf8f4Ó\u2d76훷⃗뮝뱰\ue4dc㔃艑", (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12460), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "\u0eda༢괜\ue830").intern())) {
                        b10 = -1;
                    } else {
                        b10 = zi.c.f161635m;
                    }
                    break;
                case 1942443945:
                    if (str.equals(m1036("㉺\u2d72మ濳亩깍褙\ue8d3쮥⭁ੳ支", 7992 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 2104624789:
                    if (str.equals(m1039("彽볐⊞\ufdcb\uf84b当", (char) (32187 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 1, "헶橵뮱婽").intern())) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
        }
        switch (b10) {
            case 0:
                return FiveAd.class;
            case 1:
                return CreativeType.class;
            case 2:
                return FiveAdConfig.class;
            case 3:
            case 4:
                return FiveAdCustomLayout.class;
            case 5:
                return FiveAdFormat.class;
            case 6:
                return FiveAdInterface.class;
            case 7:
                return FiveAdInterstitial.class;
            case 8:
                return FiveAdListener.class;
            case 9:
                return FiveAdVideoReward.class;
            case 10:
                return FiveAdState.class;
            case 11:
                return FiveAdLoadListener.class;
            case 12:
                return FiveAdViewEventListener.class;
            case 13:
            case 14:
                return AdActivity.class;
            case 15:
                return FiveAdInterstitialEventListener.class;
            case 16:
                return FiveAdVideoRewardEventListener.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1027(FiveAdConfig fiveAdConfig) {
        int i10 = f975 + 113;
        f978 = i10 % 128;
        int i11 = i10 % 2;
        String str = fiveAdConfig.appId;
        if (i11 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1041(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f975 = (f978 + 69) % 128;
        fiveAdInterface.setListener(fiveAdListener);
        int i10 = f975 + 13;
        f978 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
    }
}
