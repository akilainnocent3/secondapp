package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bs extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1017 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1018 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1019 = {'M', 'o', 'l', 'c', 'I', 'n', 'i', 't', 'P', 'a', 'r', 'm', 's', 'A', 'd', 'S', 'h', 'w', 'L', 'e', kj.e.f102543c, 'k', 'p', fw.b.f85389p, 'b', 'B', 'v', 'y', 'x', 'g', 'N', 'O', 'Q', 'R', 'T', 'U'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1020 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1021 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1022 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1023 = 4595;

    public bs(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1088() {
        int i10 = f1018 + 7;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            m1089();
            throw null;
        }
        Object objM1089 = m1089();
        int i11 = f1017 + 89;
        f1018 = i11 % 128;
        if (i11 % 2 != 0) {
            return objM1089;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m1089() {
        int i10 = f1018 + 89;
        f1017 = i10 % 128;
        if (i10 % 2 == 0) {
            return Moloco.INSTANCE;
        }
        Moloco moloco = Moloco.INSTANCE;
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ BannerAdShowListener m1091(Banner banner) {
        f1018 = (f1017 + 41) % 128;
        BannerAdShowListener bannerAdShowListenerM1090 = m1090(banner);
        int i10 = f1017 + 87;
        f1018 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
        return bannerAdShowListenerM1090;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1093(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1018 = (f1017 + 1) % 128;
        banner.setAdShowListener(bannerAdShowListener);
        f1018 = (f1017 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1095(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1017 = (f1018 + 87) % 128;
        m1093(banner, bannerAdShowListener);
        int i10 = f1018 + 117;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1092("\u0019\u0017\u0006\u0001\u0002\u0003\u0002\u0004\u0003\r\u000f\u0014\u0005\u0000\r\u0006\u000b\u0003\u0001\u0015", View.MeasureSpec.getSize(0) + 20, (byte) (View.resolveSize(0, 0) + 103)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bs.m1088();
            }
        });
        map.put(m1092("\u0019\u0017\r\u001f\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0010\r\u0004\f\u0017\f\u0012\r\u0019\u0001\u0017\u009d", 22 - MotionEvent.axisFromString(""), (byte) (43 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bs.m1091((Banner) list.get(0));
            }
        });
        map.put(m1092("\r\u0012\r\u001f\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0010\r\u0004\f\u0017\f\u0012\r\u0019\u0001\u0017Ô", 22 - ExpandableListView.getPackedPositionChild(0L), (byte) (Color.alpha(0) + 98)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bs.m1095((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f1018 = (f1017 + 23) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -1984684559:
                if (str.equals(m1094("\ue7ddꛒ쾲ᶴ\u1cffᒸ", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49151), "\u0000\u0000\u0000\u0000", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "葕愞ﺲﶿ").intern())) {
                    return Moloco.class;
                }
                return null;
            case -1940439161:
                if (str.equals(m1092("\u0001\u0002\u0003\u0002\u0004\u0002\u0005\u0000\u0007\b\t\n\u000b\n\u0006\u0011", 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (113 - KeyEvent.getDeadChar(0, 0))).intern())) {
                    return MolocoInitParams.class;
                }
                return null;
            case -1921270373:
                if (!str.equals(m1094("齊﹔ạ勸\ud916쯧ײַ⨫爀ᘀ珋Ꝟ", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), "\u0000\u0000\u0000\u0000", TextUtils.getCapsMode("", 0, 0), "䁘췳䭕蔋").intern())) {
                    return null;
                }
                int i10 = f1018 + 95;
                f1017 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return VastActivity.class;
            case -1483746188:
                if (str.equals(m1094("ቱ贾긪\ud7a4ꎅ旣\ueba9\ue246䴓柌覤膛", (char) Drawable.resolveOpacity(0, 0), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u2e78Ý拓輂").intern())) {
                    return AdFormatType.class;
                }
                return null;
            case -1473265726:
                if (str.equals(m1092("\u0004\u0002\b\u0017\u0007\u0005\u0003\u0002\u0004\u0002\u0012\u000e\u000f\u0014\u0015\u0017\u0012\u001d\u0000\b\r\u0011\u0016\u0007\u0013\u001a\u000b\u0003\u0001\u0017Ü", 'O' - AndroidCharacter.getMirror('0'), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 106)).intern())) {
                    return Banner.class;
                }
                return null;
            case -1435839138:
                if (!str.equals(m1094("墎\ue0fb㓠辵Ӑ痩\uf2d0\ue22d烫蟓胣ة", (char) Color.blue(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatTimeout() >> 16, "欠蹺躋ﳂ").intern())) {
                    return null;
                }
                int i11 = f1017 + 37;
                f1018 = i11 % 128;
                if (i11 % 2 == 0) {
                    return null;
                }
                return FullscreenAd.class;
            case -1413560652:
                if (str.equals(m1092("\u000e\u000f\u0010\u0011\u0005\r\u0018\f\r\u0006\u0017\u0001\u0016\u0007", ExpandableListView.getPackedPositionGroup(0L) + 14, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33)).intern())) {
                    return AdShowListener.class;
                }
                return null;
            case -1323289850:
                if (!str.equals(m1094("\uf1af駩ᛶ泗咘\u10cb܆뭧涉則惜鷚\ua7e1\uf5b4\uef80\ue1fe㛲멷技\uf09f⮬쁴復\ue87d瞖醙Ы窹ꡮ潹鈸Ѹ㴞狒鹺딪䝨큗쯴晆䥾悍톰⫂䲄鍑긻츊얭迠陠입帧뭉發좼牭ṩ쉏\uf138쓨ⲃᨕ㑽뉯빾휖쁗ΐ稖奍躌\u0ea4愼\ue555ඎፁ횅퓚\ue150Ὡ䙲얰\ueced鄕遁밥Ɵ眆㘝㉊", (char) (47695 - View.resolveSizeAndState(0, 0, 0)), "\u0000\u0000\u0000\u0000", (-1598878112) - Color.alpha(0), "恫댎侠侺").intern())) {
                    return null;
                }
                f1017 = (f1018 + 121) % 128;
                return StaticAdActivity.class;
            case -789262976:
                if (!str.equals(m1092("\r\t\n\b\t\u0000\u000e\u000f\u000f\u0001\b\u0007\u0018\b\t\u0019", 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62)).intern())) {
                    return null;
                }
                f1018 = (f1017 + 65) % 128;
                return StaticAdActivity.class;
            case -671875674:
                if (!str.equals(m1094("縜蓿韔昭\ue25b퀫딇軦\ud941㒀鯦櫫ർ", (char) (Gravity.getAbsoluteGravity(0, 0) + 10159), "\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength("") - 1407497253, "\udb1fᭋ꾬뤧").intern())) {
                    return null;
                }
                f1018 = (f1017 + 111) % 128;
                return MediationInfo.class;
            case -556413696:
                if (str.equals(m1092("\u0005\u0000\r\u0019\u0006\u0010\b\u0007\b\u0007\b\u0003\u000e\u000f\u0010\u0011\u0005\r\u0018\f\r\u0006\u0017\u0001\u0016\u0007", 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (105 - Process.getGidForName(""))).intern())) {
                    return InterstitialAdShowListener.class;
                }
                return null;
            case -543102915:
                if (!str.equals(m1094("\u12c1瀃ბ괷ﰐ⸨✽腥鬉痢५\ud805䠺戗ꦟ⌭魞薞\ufadaፇ毝휠", (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "\u0000\u0000\u0000\u0000", (-1) - Process.getGidForName(""), "\ud924잺頤h").intern())) {
                    return null;
                }
                int i12 = f1017 + 43;
                f1018 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return RewardedInterstitialAd.class;
            case -517600968:
                if (str.equals(m1092("\u0004\u0002\b\u0017\u0007\u0005\u0003\u0002\u0004\u0002\u0012\u000e\u000f\u0014\u0016\u001a\u0017\u0001\u0000\r\u000e\u0012\r\u000f\u0014\u000f\u0014\u0019\u0012\t\b\u0013\u000b\u0003\u0010\b\u0000\u0007\u0014\u001a\b\u000f\u0007\u0016\u0002\u0011\u0016\u0007\u0016\u0007\u0012\b\u0001\u000b\u0016\u0007\u0003\u000b\b\u001a\u0006\u000b\n\u0007\u0014\u001a\u0004\u0006\n\u0007\u000f\u000e\u0001\t\b\u0018\u0007\bâ", View.resolveSize(0, 0) + 79, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 104)).intern())) {
                    return MraidActivity.class;
                }
                return null;
            case -316379660:
                if (str.equals(m1092("\u0001\u0002\u0003\u0002\u0004\u0002\u000e\u000f", 8 - Color.red(0), (byte) (View.combineMeasuredStates(0, 0) + 58)).intern())) {
                    return MolocoAd.class;
                }
                return null;
            case 320151695:
                if (str.equals(m1092("\u0005\u0000\r\u0019\u0006\u0010\b\u0007\b\u0007\b\u0003\u000e\u000f", 13 - TextUtils.lastIndexOf("", '0', 0), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 95)).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 664452134:
                if (!str.equals(m1094("‚\uea30붨聠긹\uddb4\udee2횖\udf4e텆\uf88b瘁ࢅ奡촟諵蛮䵋˯㗥䮮ᤂ땊蠩쪒幁宄\ue62e쵈ୋ햝捊\udda4銍璍\uf4cf\uf01f죂ךּڤ穞鹢猙貴ꐡ㓍\uf43aᲽВ\ue04d鉔堅哧ਡ근쌇\uddbfꖙ䤤\uf488॒갽遇켳哞时弫礨悋砭\uec12嫢噶∙ㄿ蟧㭺", (char) ((Process.getThreadPriority(0) + 20) >> 6), "\u0000\u0000\u0000\u0000", View.MeasureSpec.getMode(0) - 2025059546, "☃䰋펇忝").intern())) {
                    return null;
                }
                int i13 = f1018 + 11;
                f1017 = i13 % 128;
                return i13 % 2 != 0 ? StaticAdActivity.class : VastActivity.class;
            case 704479150:
                if (str.equals(m1094("摨ၲ嚡퍇\ue14a\ue88f씍ւ❊춈\u0bce\udb27\uea4d韊그䵦籏骘妭㉅峜꼆䜘㪦꤫率鍰\ue25e끮肐῏\ue034免ᬡ", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, "䘆ኛ鴁㗖").intern())) {
                    return RewardedInterstitialAdShowListener.class;
                }
                return null;
            case 1395486086:
                if (str.equals(m1092("\u0004\u0006\n\u0007\u000f\u000e\u0001\t\b\u0018\u0007\bØ", 13 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 95)).intern())) {
                    return MraidActivity.class;
                }
                return null;
            case 1928690944:
                if (str.equals(m1092("\u001b\u0007®®\u0016\u0007\u000e\u000f\u0010\u0011\u0005\r\u0018\f\r\u0006\u0017\u0001\u0016\u0007", (ViewConfiguration.getWindowTouchSlop() >> 8) + 20, (byte) (View.getDefaultSize(0, 0) + 64)).intern())) {
                    return BannerAdShowListener.class;
                }
                return null;
            case 1982491468:
                if (!str.equals(m1094("抝\ue60c붋║㏀\ue29d", (char) (14343 - (ViewConfiguration.getLongPressTimeout() >> 16)), "\u0000\u0000\u0000\u0000", Process.myTid() >> 22, "⒳\uf428ܨ嬸").intern())) {
                    return null;
                }
                int i14 = f1018 + 43;
                f1017 = i14 % 128;
                return i14 % 2 != 0 ? AdShowListener.class : Banner.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1092(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f1019;
                char c10 = f1022;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2134 = 0;
                    while (true) {
                        int i11 = g.f2134;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2133 = cArr[i11];
                        g.f2131 = cArr[g.f2134 + 1];
                        if (g.f2133 == g.f2131) {
                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                        } else {
                            g.f2132 = g.f2133 / c10;
                            g.f2130 = g.f2133 % c10;
                            g.f2135 = g.f2131 / c10;
                            g.f2128 = g.f2131 % c10;
                            if (g.f2130 == g.f2128) {
                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                int i12 = (g.f2132 * c10) + g.f2130;
                                int i13 = (g.f2135 * c10) + g.f2128;
                                int i14 = g.f2134;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2132 == g.f2135) {
                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                int i15 = (g.f2132 * c10) + g.f2130;
                                int i16 = (g.f2135 * c10) + g.f2128;
                                int i17 = g.f2134;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2132 * c10) + g.f2128;
                                int i19 = (g.f2135 * c10) + g.f2130;
                                int i20 = g.f2134;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2134 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1094(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1021) ^ ((long) f1020)) ^ ((long) f1023));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        f1018 = (f1017 + 7) % 128;
        try {
            String strM2406 = hu.m2304().m2306().m2406(BuildConfig.class, m1094("懃៍帵輎즑쎩䐪䘴맖嵿楇", (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", 1991789381 - (KeyEvent.getMaxKeyCode() >> 16), "䔑롋⡶刬").intern());
            f1017 = (f1018 + 121) % 128;
            return strM2406;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static BannerAdShowListener m1090(Banner banner) {
        f1018 = (f1017 + 69) % 128;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        f1018 = (f1017 + 61) % 128;
        return adShowListener;
    }
}
