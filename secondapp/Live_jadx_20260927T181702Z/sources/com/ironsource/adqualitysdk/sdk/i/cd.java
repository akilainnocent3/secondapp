package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import androidx.media.AudioAttributesCompat;
import com.vungle.ads.internal.signals.SignalKey;
import com.vungle.warren.AdActivity;
import com.vungle.warren.AdvertisementPresentationFactory;
import com.vungle.warren.PlayAdCallback;
import com.vungle.warren.Vungle;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.VungleBanner;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.VungleWebViewActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.presenter.MRAIDAdPresenter;
import com.vungle.warren.ui.view.LocalAdView;
import com.vungle.warren.ui.view.MRAIDAdView;
import com.vungle.warren.ui.view.VungleBannerView;
import com.vungle.warren.ui.view.VungleNativeView;
import com.vungle.warren.ui.view.VungleWebClient;
import com.vungle.warren.ui.view.WebViewAPI;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cd extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1253 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1254 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1255 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1256 = 37669;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1257 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1258 = 176;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1259;

    public cd(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m1414() {
        f1253 = (f1254 + 117) % 128;
        Class clsM1415 = m1415();
        hu.m2304().m2307();
        try {
            Iterator<Field> it = hu.m2304().m2307().m2256(clsM1415, hq.m2251().m2242(String.class).m2241(8).m2240(16).m2243()).iterator();
            f1254 = (f1253 + 121) % 128;
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (str.startsWith(m1420("菀뾮ऌ\ude59᫁‽㻊♖拫㰽읦衻", (char) Color.red(0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getFadingEdgeLength() >> 16, "㗷ོ禌圙").intern()) || str.startsWith(m1420("邳릺撶⛭攃ᴃ\ue093优쯮鳘뻔", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "\u0000\u0000\u0000\u0000", 1474229890 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "脆\udef6蕗较").intern())) {
                    return str.split(m1421(wo.g.f143517x2, AndroidCharacter.getMirror('0') - '/', false, 1 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 236).intern())[0];
                }
            }
            f1253 = (f1254 + 47) % 128;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Class m1415() {
        int i10 = f1253 + 17;
        f1254 = i10 % 128;
        if (i10 % 2 != 0) {
            return VungleApiClient.class;
        }
        int i11 = 40 / 0;
        return VungleApiClient.class;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Map<String, String> m1416(Advertisement advertisement) {
        f1253 = (f1254 + 29) % 128;
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        f1254 = (f1253 + 11) % 128;
        return downloadableUrls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m1417(Advertisement advertisement) {
        f1254 = (f1253 + 7) % 128;
        Map<String, String> mapM1416 = m1416(advertisement);
        int i10 = f1253 + 47;
        f1254 = i10 % 128;
        if (i10 % 2 != 0) {
            return mapM1416;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1419(Advertisement advertisement) {
        f1253 = (f1254 + SignalKey.EVENT_ID) % 128;
        String strM1426 = m1426(advertisement);
        f1254 = (f1253 + 117) % 128;
        return strM1426;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1423(Placement placement) {
        f1253 = (f1254 + 65) % 128;
        boolean zM1427 = m1427(placement);
        f1253 = (f1254 + 75) % 128;
        return zM1427;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1424(Advertisement advertisement) {
        int i10 = f1254 + 17;
        f1253 = i10 % 128;
        int i11 = i10 % 2;
        String strM1422 = m1422(advertisement);
        if (i11 != 0) {
            int i12 = 95 / 0;
        }
        return strM1422;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Placement m1425(Repository repository, String str) {
        f1254 = (f1253 + 69) % 128;
        Placement placementM1418 = m1418(repository, str);
        int i10 = f1254 + 109;
        f1253 = i10 % 128;
        if (i10 % 2 == 0) {
            return placementM1418;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1422(Advertisement advertisement) {
        int i10 = f1254 + 13;
        f1253 = i10 % 128;
        int i11 = i10 % 2;
        String campaign = advertisement.getCampaign();
        if (i11 != 0) {
            int i12 = 37 / 0;
        }
        f1254 = (f1253 + 59) % 128;
        return campaign;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1420("⋧Ⓔټ횠㜣錤졚\uec9b茅❙呵ᗄ", (char) (KeyEvent.getMaxKeyCode() >> 16), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "Ꭿ㻗滶뵽").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cd.m1425((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1421("￠\n\u0000\ufffb￼\u0011\u0000\r\u0000\u000b\u0005￼\ufffa\u0005", ExpandableListView.getPackedPositionChild(0L) + 15, true, 3 - Gravity.getAbsoluteGravity(0, 0), 329 - AndroidCharacter.getMirror('0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return Boolean.valueOf(cd.m1423((Placement) list.get(0)));
            }
        });
        map.put(m1421("￠\u0013\u0004\u0006\u0003￨\u0013\u0004\n\u0011\u0000￬\u0003", Color.rgb(0, 0, 0) + 16777229, true, 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + AudioAttributesCompat.O).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cd.m1419((Advertisement) list.get(0));
            }
        });
        map.put(m1421("￼\uffde\u000f\u0000\u0002\t\u0002\u0004￼\u000b\b", (ViewConfiguration.getEdgeSlop() >> 16) + 11, true, 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 276 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cd.m1424((Advertisement) list.get(0));
            }
        });
        map.put(m1421("\u0005\b\ufffa�\ufffa\ufffb\u0005\ufffe￮\u000b\u0005\f\u0000\ufffe\r\uffdd\b\u0010\u0007", 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, ImageFormat.getBitsPerPixel(0) + 13, 279 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cd.m1417((Advertisement) list.get(0));
            }
        });
        int i10 = f1254 + 11;
        f1253 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        String strMo774 = mo774();
        if (strMo774 == null) {
            f1253 = (f1254 + 61) % 128;
            return null;
        }
        int i10 = f1253 + 55;
        f1254 = i10 % 128;
        return i10 % 2 == 0 ? strMo774.split(m1421(wo.g.f143517x2, 1 % (KeyEvent.getMaxKeyCode() * 50), true, Color.alpha(0), 26994 >>> Color.blue(1)).intern())[0] : strMo774.split(m1421(wo.g.f143517x2, (KeyEvent.getMaxKeyCode() >> 16) + 1, false, Color.alpha(0) + 1, 223 - Color.blue(0)).intern())[1];
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo774() {
        if (this.f1259 == null) {
            int i10 = f1254 + 93;
            f1253 = i10 % 128;
            if (i10 % 2 != 0) {
                String strM1414 = m1414();
                this.f1259 = strM1414;
                m768(strM1414);
                throw null;
            }
            String strM1415 = m1414();
            this.f1259 = strM1415;
            m768(strM1415);
            f1253 = (f1254 + 99) % 128;
        }
        return this.f1259;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m1418(Repository repository, String str) {
        f1254 = (f1253 + 47) % 128;
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        int i10 = f1254 + 95;
        f1253 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
        return placement;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1421(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            try {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f1258);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -2075872274:
                if (str.equals(m1421("\ufff1\ufff6￥￭￨￥\b\ufff4\u0016\t\u0017\t\u0012\u0018\t\u0016", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, false, 16 - KeyEvent.getDeadChar(0, 0), 268 - Color.argb(0, 0, 0, 0)).intern())) {
                    return MRAIDAdPresenter.class;
                }
                return null;
            case -2012803321:
                if (str.equals(m1421("\u0002\t\u0004\u000b\u0012\u0013ￋ\n\f\u0000\u0014\u0002\u0006\ufff3\u0002\u0013\u0006\u0011\ufffe￫\u0002\t\u0004\u000b\u0012\ufff3ￋ\u0014\u0002\u0006\u0013ￋ\u0006\u0012ￋ\u000b\u0002\u000f\u000f\ufffe\u0014ￋ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, true, (-16777206) - Color.rgb(0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 275).intern())) {
                    return VungleNativeView.class;
                }
                return null;
            case -1853707364:
                if (str.equals(m1421("\u000b\u0004\t\u0002\uffdf\ufffe\u000b\u000b\u0002\u000f\ufff3\u0006\u0002\u0014\u0000\f\nￋ\u0013\u0012\u000b\u0004\t\u0002ￋ\u0014\ufffe\u000f\u000f\u0002\u000bￋ\u0012\u0006ￋ\u0013\u0006\u0002\u0014ￋ\ufff3\u0012", 42 - Drawable.resolveOpacity(0, 0), false, TextUtils.getTrimmedLength("") + 14, (Process.myPid() >> 22) + 275).intern())) {
                    return VungleBannerView.class;
                }
                return null;
            case -1850654380:
                if (str.equals(m1421("\b\u0005\u0006\ufffb￨\n", (ViewConfiguration.getScrollBarSize() >> 8) + 6, true, MotionEvent.axisFromString("") + 6, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 281).intern())) {
                    return Report.class;
                }
                return null;
            case -1836618638:
                if (str.equals(m1420("딢띡읪⤬\u12b6䄚锵\u18fe∖靼", (char) Color.alpha(0), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "妻䈑ﲞ픿").intern())) {
                    return AdActivity.class;
                }
                return null;
            case -1740904301:
                if (!str.equals(m1420("皳ᢣ٣㱁彾袘絾\uded8絬䟗ᨊ", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", 104975561 - (Process.myTid() >> 22), "줰䇌됆訄").intern())) {
                    return null;
                }
                int i10 = f1253 + 57;
                f1254 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return LocalAdView.class;
            case -1721428911:
                if (!str.equals(m1421("�￮\r\u0006\uffff\u0004", 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, (ViewConfiguration.getEdgeSlop() >> 16) + 1, (-16776936) - Color.rgb(0, 0, 0)).intern())) {
                    return null;
                }
                f1253 = (f1254 + 67) % 128;
                return Vungle.class;
            case -1057659822:
                if (str.equals(m1420("松\uf41c\ue049䅠㗲ꬑčጸᬼᣌ헷瞤횬蓆ሓ覕칼띲죫꾉黳\ue456\udd38铿ࣄ癃텢Ȑ꣤釿佱蹨톧齍䦍浧", (char) TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0') + 1, "ⰳલ䚆\uf1f3").intern())) {
                    return AdContract.AdvertisementPresenter.EventListener.class;
                }
                return null;
            case -965507231:
                if (str.equals(m1420("\ue11dꐐ౩嶠嚁\ue2dd\u0efa͊簺痉", (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0), "ഴ\udf18\ueffc떆").intern())) {
                    return WebViewAPI.class;
                }
                return null;
            case -899612152:
                if (str.equals(m1420("浟聠￼ⲭ섎\ueaa8榙婻奫㨒䜼\uf42c㖾佉싀댻ヸ龑㕅鋌㍦⟺⽙廼ଢ଼\ue77c聗\ue0b6ﴞ覻䓴℉酌餇螚锁䫟抯\udd3f樖⻟퇷", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34063), "\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0), "샕쎧ฆ킅").intern())) {
                    return VungleWebViewActivity.class;
                }
                return null;
            case -828205665:
                if (!str.equals(m1421("\u0014\u0010\"\ufff8�￬\ufff4\uffef￬\u000f\u0001", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, false, 3 - ExpandableListView.getPackedPositionType(0L), 261 - Color.red(0)).intern())) {
                    return null;
                }
                int i11 = f1254 + 105;
                f1253 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                return MRAIDAdView.class;
            case -747599243:
                if (str.equals(m1420("ᭈ펉搹䧋\u0a5d綽\uf36c狤꤀ꎣ", (char) TextUtils.indexOf("", "", 0, 0), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "錺幡㾸ĺ").intern())) {
                    return AdContract.class;
                }
                return null;
            case -498060603:
                if (str.equals(m1420("뜛넸뮣겜縹㨵⬽㨜䥂", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0) - 979990878, "ꉎ隆ⳅ笝").intern())) {
                    return Placement.class;
                }
                return null;
            case -350701718:
                if (!str.equals(m1421("\u0003\u0007�\b\u0003\u0006\r￦\ufff9\u0004", 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 7, 284 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    return null;
                }
                int i12 = f1253 + 21;
                f1254 = i12 % 128;
                if (i12 % 2 == 0) {
                    return null;
                }
                return Repository.class;
            case -92732536:
                if (!str.equals(m1420("\uec74죧핧燑奂브쌹ϛ㢧䖆㏸竐叹◭휾ᣩ谱㛕䪂齚ꁧ\uf831涕ᒂⱖ䊔曍鑕⊦皍", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 6152), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMinimumFlingVelocity() >> 16, "꾔\uf69c࠱ᘘ").intern())) {
                    return null;
                }
                int i13 = f1253 + 1;
                f1254 = i13 % 128;
                if (i13 % 2 == 0) {
                    return null;
                }
                return VungleBanner.class;
            case 156342925:
                if (str.equals(m1420("紖礹쨣ໆ᪖븗沉邮餙夼잰ᆑ乗衡્\uf492", (char) (53178 - TextUtils.indexOf("", "", 0)), "\u0000\u0000\u0000\u0000", ((byte) KeyEvent.getModifierMetaStateMask()) + 1, "쵋沟뫽훏").intern())) {
                    return VungleNativeView.class;
                }
                return null;
            case 315438882:
                if (str.equals(m1420("ᗐ\uec8f붩݃怎ꄻ닮Ὰ鑚\uee3b䚻ꆤ限뀙矘翜", (char) (36186 - Color.red(0)), "\u0000\u0000\u0000\u0000", TextUtils.getCapsMode("", 0, 0), "떛㥗娡ⲍ").intern())) {
                    return VungleBannerView.class;
                }
                return null;
            case 332396988:
                if (!str.equals(m1421("\u0003￢\u0005\ufff7\n\u0006\u0018\ufff8\u0006", AndroidCharacter.getMirror('0') - '\'', false, Color.green(0) + 7, 271 - Color.argb(0, 0, 0, 0)).intern())) {
                    return null;
                }
                f1254 = (f1253 + 87) % 128;
                return WebAdContract.WebAdView.class;
            case 505165239:
                if (!str.equals(m1420("\uddcd뻋튀딏譅緂붫\ue9c1枊\uee71푅틐艿꺈ɂ숑듁浣﮶뇊酋", (char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", 1824554566 - KeyEvent.normalizeMetaState(0), "䛇쁾퍬첉").intern())) {
                    return null;
                }
                int i14 = f1253 + 67;
                f1254 = i14 % 128;
                if (i14 % 2 == 0) {
                    return VungleActivity.class;
                }
                return VungleWebViewActivity.class;
            case 670892517:
                if (str.equals(m1420("䵿㊗ㄺྑ溌ᐤ\ued08⡝๐蜶\u0b9b猙\uf451", (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 50065), "\u0000\u0000\u0000\u0000", Color.green(0) - 249661578, "瘔ṷ釱\u0bc3").intern())) {
                    return Advertisement.class;
                }
                return null;
            case 746354589:
                if (str.equals(m1420("ପ奱䬂\uf432㴓\ue9c1\uf0c6☯\uea97Ԯ㭣떝흲⮻", (char) (3730 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "◪녖鈌⤎").intern())) {
                    return LocalAdContract.LocalPresenter.class;
                }
                return null;
            case 798818448:
                if (str.equals(m1420("Ụེ귩헶䄳㒻㇍ￋ⊬", (char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getJumpTapTimeout() >> 16) - 951369717, "ଢ଼䭀ே剞").intern())) {
                    return LocalAdContract.LocalView.class;
                }
                return null;
            case 1033471823:
                if (str.equals(m1420("磙э耑쭻㮄꒹ꋦ炷俄ꨎᓕ怌칪믂麗객돢ᛩ샪ꕥ꽞䲵\uda8f氚䕗옸Ȝ곌\ue94b\udc2a䣓붤툣훗ƾ", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength("") - 422573814, "૰퀉맦ꈙ").intern())) {
                    return VungleActivity.class;
                }
                return null;
            case 1110462460:
                if (str.equals(m1420("꾔傌塤\ud7a5䕉享ެ漺곝౩贉\uee20ꑙ", (char) (AndroidCharacter.getMirror('0') + 56902), "\u0000\u0000\u0000\u0000", (-585159854) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "厫Ἣ盝闞").intern())) {
                    return WebViewAPI.MRAIDDelegate.class;
                }
                return null;
            case 1205766784:
                if (str.equals(m1421("\uffd8￼\u0003\ufffe\u0005\f￭\u0010\u000b\u0000\r\u0000\u000b\ufffa", 14 - Color.blue(0), true, (ViewConfiguration.getScrollBarSize() >> 8) + 7, 281 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return VungleActivity.class;
                }
                return null;
            case 1208038126:
                if (str.equals(m1421("�\uffde\u0007\u0004\u0000\t\u000f\ufff1\u0010\t\u0002\u0007\u0000\ufff2\u0000", AndroidCharacter.getMirror('0') - '!', false, 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 278).intern())) {
                    return VungleWebClient.class;
                }
                return null;
            case 1230133745:
                if (str.equals(m1420("龟贐\ue878\uf308יּ⋘梁饿왛뼟仈톿揵䘡", (char) (43914 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionGroup(0L), "즊샐訢춫").intern())) {
                    return WebAdContract.WebAdPresenter.class;
                }
                return null;
            case 1461477995:
                if (!str.equals(m1420("밿\ue29e㞔⡓羪⡘ῄ汿⁃\udaa2ᖁ뮹Ꟈ妆ꥃ譻씛䰖ꚮ繛侏값મ稶⦝㾉檩뼈陠᪉噢梗", (char) (7139 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), "䟁욷\ue3bd봛").intern())) {
                    return null;
                }
                int i15 = f1253 + 63;
                f1254 = i15 % 128;
                if (i15 % 2 == 0) {
                    return null;
                }
                return AdvertisementPresentationFactory.class;
            case 1611471226:
                if (str.equals(m1420("ⶆ쫮\ue96b⑸裴곬ⷂ첛臵␟I垅ꦩ藣導痣", (char) (TextUtils.getCapsMode("", 0, 0) + 38882), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0), "៧䕋\ue260羗").intern())) {
                    return LocalAdPresenter.class;
                }
                return null;
            case 1731532800:
                if (str.equals(m1420("ྶ蘅뒤ꐂ\uec0f୲짎\ue4a1\u2073꾙ㆊ雙\uea61콄頶", (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37180), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getFadingEdgeLength() >> 16) + 991498507, "\u0bd5ᤑ㰻\udc91").intern())) {
                    return LocalAdContract.class;
                }
                return null;
            case 1766407901:
                if (!str.equals(m1421("\uffdd￼\t\t\u0000\r\ufff1\u0010\t\u0002\u0007\u0000", View.MeasureSpec.getMode(0) + 12, false, 5 - TextUtils.indexOf((CharSequence) "", '0'), Color.argb(0, 0, 0, 0) + 277).intern())) {
                    return null;
                }
                int i16 = f1253 + 55;
                f1254 = i16 % 128;
                if (i16 % 2 == 0) {
                    return null;
                }
                return VungleBanner.class;
            case 1777696764:
                if (str.equals(m1420("ᘞસ跩鄳膵䝣윅碦漳ꭦ廀쬝诤팄", (char) (17582 - View.resolveSize(0, 0)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0'), "\ue356鶰깓⽄").intern())) {
                    return PlayAdCallback.class;
                }
                return null;
            case 1861686093:
                if (str.equals(m1420("臢峍䐶䍒鰜\uf44c릆杬擲퍧滴벆鰦\ue7d7互靾̚뀦罪魢멆ँ\uec52ᛢ〉鉆憋㞥ẵ盖࠺ᕻ％", (char) View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollBarSize() >> 8) + 1237998001, "녆쩙扉\ue029").intern())) {
                    return AdContract.AdvertisementPresenter.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1420(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1257) ^ ((long) f1255)) ^ ((long) f1256));
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
    private static boolean m1427(Placement placement) {
        int i10 = f1253 + 101;
        f1254 = i10 % 128;
        int i11 = i10 % 2;
        boolean zIsIncentivized = placement.isIncentivized();
        if (i11 == 0) {
            int i12 = 60 / 0;
        }
        f1254 = (f1253 + 37) % 128;
        return zIsIncentivized;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1426(Advertisement advertisement) {
        int i10 = f1253 + 19;
        f1254 = i10 % 128;
        if (i10 % 2 == 0) {
            advertisement.getAdMarketId();
            throw null;
        }
        String adMarketId = advertisement.getAdMarketId();
        f1253 = (f1254 + 31) % 128;
        return adMarketId;
    }
}
