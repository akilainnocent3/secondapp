package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tapjoy.TJActionRequest;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TJAdUnitActivity;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TJCurrency;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.TJVideoListener;
import com.tapjoy.TJWebView;
import com.tapjoy.Tapjoy;
import com.tapjoy.mraid.view.ActionHandler;
import com.tapjoy.mraid.view.Browser;
import com.tapjoy.mraid.view.MraidView;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cg extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1311 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1313 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1314 = 219010939;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1315 = 51;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f1316 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1317 = -561393916;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1318 = {5, zi.c.f161635m, -13, 13, -11, 17, 34, l3.a.f103520y7, zi.c.f161635m, -5, zi.c.C, -15, 35, -9, -10, 5, zi.c.f161635m, -13, 13, -11, 17, 34, l3.a.f103520y7, 6, 9, -15, 6, -1, 44, -7, -10, 13, -7, 8, -10, 13, zi.c.C, l3.a.B7, -1, 6, -11, 17, 34, 13, -7, 8, -10, 13, zi.c.C, l3.a.B7, -1, 6, -11, 17, 34, 19, -73, zi.c.f161643u, -4, -13, 72, l3.a.f103502w7, -5, 8, -17, 5, 63, -75, 10, 5, -6, zi.c.f161639q, -19, 70, l3.a.f103444p7, -2, zi.c.f161636n, 13, f6.q.f83622z, -4, 8, -3, 48, 13, f6.q.f83622z, -4, 8, -3, 48, zi.c.f161646x, -73, zi.c.f161643u, -4, -13, 72, l3.a.f103502w7, -5, 8, -17, 5, 63, -75, 10, 5, -6, zi.c.f161639q, -19, 70, l3.a.f103444p7, -2, zi.c.f161636n, zi.c.f161643u, -4, 19, f6.q.f83622z, -5, 8, -17, 37, zi.c.f161643u, -4, 19, -12, -3, zi.c.f161638p, 13, -10, 13, -9, 9, -15, 1, 10, zi.c.G, -35, 10, 1, -5, 19, zi.c.f161636n, -10, 13, -9, 9, -15, 1, 10, zi.c.G, -43, zi.c.f161643u, -4, 19, -12, -3, zi.c.f161638p, -29, zi.c.f161635m, -5, zi.c.C, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, zi.c.G, -35, 10, 1, -5, 19, -30, zi.c.f161635m, -5, zi.c.C, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, zi.c.G, -35, 10, 1, -5, 19, -30, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, -2, 3, -5, -9, 48, -17, 9, -42, zi.c.f161635m, -5, zi.c.C, -15, 35, -9, -10, zi.c.f161648z, -11, 9, -13, 0, -3, 50, -7, -10, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, zi.c.f161643u, -4, 19, -12, -3, zi.c.f161638p, -29, zi.c.f161635m, -3, -4, zi.c.G, 9, -10, -8, zi.c.f161636n, 19, l3.a.B7, 6, 9, -8, 8, 2, 2, -11, 28, -36, zi.c.f161639q, -2, 13, -9, 9, -15, 1, 10, zi.c.G, l3.a.f103428n7, zi.c.f161639q, -2, 13, -9, 9, -15, 1, 10, zi.c.G, -35, 10, 1, -5, 19, -30, zi.c.f161639q, -2, -6, zi.c.G, l3.a.C7, 1, zi.c.f161643u, zi.c.f161647y, l3.a.f103428n7, zi.c.f161639q, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f1312 = {-1432428120, 1280577410, -107498678, 997033691, -930604812, -1387762407, -736079987, 282835398, -325445394, -224666713, -614510409, -1510484538, -879457680, 250479336, -2004751562, -44591585, 1884384770, -1870984509};

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1481(TJPlacement tJPlacement) {
        int i10 = f1313 + 57;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        f1313 = (f1311 + 37) % 128;
        return videoListener;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1482(TJPlacementData tJPlacementData) {
        f1313 = (f1311 + 21) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i10 = f1313 + 41;
        f1311 = i10 % 128;
        if (i10 % 2 != 0) {
            return httpResponse;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1485(TJSplitWebView tJSplitWebView) {
        int i10 = f1313 + 85;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String strM1491 = m1491(tJSplitWebView);
        if (i11 == 0) {
            int i12 = 21 / 0;
        }
        return strM1491;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m1489(TJPlacement tJPlacement) {
        f1313 = (f1311 + 29) % 128;
        TJPlacementVideoListener tJPlacementVideoListenerM1481 = m1481(tJPlacement);
        int i10 = f1311 + 1;
        f1313 = i10 % 128;
        if (i10 % 2 == 0) {
            return tJPlacementVideoListenerM1481;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1492(TJPlacement tJPlacement) {
        f1311 = (f1313 + 111) % 128;
        String strM1483 = m1483(tJPlacement);
        f1313 = (f1311 + 47) % 128;
        return strM1483;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m1495(TJPlacement tJPlacement) {
        f1313 = (f1311 + SignalKey.EVENT_ID) % 128;
        TJPlacementListener tJPlacementListenerM1487 = m1487(tJPlacement);
        int i10 = f1311 + 51;
        f1313 = i10 % 128;
        if (i10 % 2 == 0) {
            return tJPlacementListenerM1487;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        String version;
        int i10 = f1311 + 51;
        f1313 = i10 % 128;
        if (i10 % 2 != 0) {
            version = Tapjoy.getVersion();
            int i11 = 58 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i12 = f1311 + 1;
        f1313 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 80 / 0;
        }
        return version;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1486(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        f1313 = (f1311 + 111) % 128;
        m1494(tJPlacement, tJPlacementVideoListener);
        f1313 = (f1311 + 61) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1488(TJPlacementData tJPlacementData) {
        f1311 = (f1313 + 121) % 128;
        String placementName = tJPlacementData.getPlacementName();
        int i10 = f1311 + 37;
        f1313 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 14 / 0;
        }
        return placementName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1490(TJPlacementData tJPlacementData) {
        int i10 = f1313 + 97;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        String strM1488 = m1488(tJPlacementData);
        if (i11 == 0) {
            int i12 = 4 / 0;
        }
        return strM1488;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1493(TJPlacementData tJPlacementData) {
        f1311 = (f1313 + 25) % 128;
        String strM1484 = m1484(tJPlacementData);
        int i10 = f1311 + 53;
        f1313 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 19 / 0;
        }
        return strM1484;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1497(TJPlacementData tJPlacementData) {
        int i10 = f1311 + 65;
        f1313 = i10 % 128;
        if (i10 % 2 != 0) {
            m1482(tJPlacementData);
            throw null;
        }
        String strM1482 = m1482(tJPlacementData);
        f1311 = (f1313 + 47) % 128;
        return strM1482;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static TJPlacementListener m1487(TJPlacement tJPlacement) {
        f1311 = (f1313 + 95) % 128;
        TJPlacementListener listener = tJPlacement.getListener();
        f1311 = (f1313 + 69) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1491(TJSplitWebView tJSplitWebView) {
        f1313 = (f1311 + 7) % 128;
        String lastUrl = tJSplitWebView.getLastUrl();
        int i10 = f1311 + 103;
        f1313 = i10 % 128;
        if (i10 % 2 == 0) {
            return lastUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1494(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1313 + 73;
        f1311 = i10 % 128;
        int i11 = i10 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1496((ViewConfiguration.getEdgeSlop() >> 16) - 219010686, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 561394018 - ImageFormat.getBitsPerPixel(0), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-35) - Color.alpha(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1490((TJPlacementData) list.get(0));
            }
        });
        map.put(m1498(new int[]{-1958801393, 1536172740, -1552717910, -419449448}, TextUtils.indexOf("", "", 0) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1493((TJPlacementData) list.get(0));
            }
        });
        map.put(m1498(new int[]{347814129, 1202057100, 1999056273, 1158179549, -1225331947, 429344231, 1204208215, -1379957247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1497((TJPlacementData) list.get(0));
            }
        });
        map.put(m1498(new int[]{592326598, -1191627709, 961209126, 2091488041}, 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1492((TJPlacement) list.get(0));
            }
        });
        map.put(m1496((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 219010671, (short) View.combineMeasuredStates(0, 0), 561394019 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) - 40).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1495((TJPlacement) list.get(0));
            }
        });
        map.put(m1496((-219010661) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) TextUtils.getCapsMode("", 0, 0), 561394019 - KeyEvent.getDeadChar(0, 0), (byte) KeyEvent.getDeadChar(0, 0), (-35) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1489((TJPlacement) list.get(0));
            }
        });
        map.put(m1498(new int[]{396982242, 1913312082, -2005820419, 1074999625, 1079795563, 14035280, 2007860748, -41227398}, Color.green(0) + 16).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                cg.m1486((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1496((-219010646) - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 561394019, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (-41) - KeyEvent.normalizeMetaState(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cg.m1485((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1311 + 3;
        f1313 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -1983375197:
                if (!str.equals(m1498(new int[]{1788367662, -1299168844, -788196562, -1464319892, 528845518, 2049895542, -155100609, -505625664}, TextUtils.getTrimmedLength("") + 15).intern())) {
                    return null;
                }
                int i10 = (f1313 + 41) % 128;
                f1311 = i10;
                f1313 = (i10 + 115) % 128;
                return TJActionRequest.class;
            case -1687314074:
                if (str.equals(m1496((-219010856) - TextUtils.getOffsetBefore("", 0), (short) TextUtils.getTrimmedLength(""), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 561394015, (byte) TextUtils.getOffsetAfter("", 0), TextUtils.getCapsMode("", 0, 0) - 22).intern())) {
                    return Browser.class;
                }
                return null;
            case -1640254126:
                if (str.equals(m1496((-219010923) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 561394000, (byte) (Color.rgb(0, 0, 0) + 16777216), (-34) - (Process.myPid() >> 22)).intern())) {
                    return TJContentActivity.class;
                }
                return null;
            case -1628534628:
                if (str.equals(m1496(((byte) KeyEvent.getModifierMetaStateMask()) - 219010827, (short) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 561393994, (byte) Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 42).intern())) {
                    return MraidView.class;
                }
                return null;
            case -1429063965:
                if (str.equals(m1498(new int[]{-206982780, -632257139, -666213558, -1173764065, 801065348, -2130148971, 1182828160, -1660557119, -389269465, 323016548}, 19 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return TJPlacementListener.class;
                }
                return null;
            case -1414965228:
                if (!str.equals(m1496((ViewConfiguration.getDoubleTapTimeout() >> 16) - 219010908, (short) KeyEvent.normalizeMetaState(0), 561393981 - (ViewConfiguration.getTouchSlop() >> 8), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-37) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f1311 = (f1313 + 63) % 128;
                return ActionHandler.class;
            case -1147119309:
                if (str.equals(m1498(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, -1828364432, 229228495, -343348292, -1296461557}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 19).intern())) {
                    return TJWebView.class;
                }
                return null;
            case -872754855:
                if (str.equals(m1498(new int[]{-206982780, -632257139, -666213558, -1173764065, 210164872, -1432440980, -243783422, -229988849}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14).intern())) {
                    return TJPlacementData.class;
                }
                return null;
            case -721136035:
                if (!str.equals(m1498(new int[]{1810479381, -1275159330, -157800169, 376916260}, View.combineMeasuredStates(0, 0) + 8).intern())) {
                    return null;
                }
                f1311 = (f1313 + 25) % 128;
                return TJAdUnit.class;
            case -668579974:
                if (str.equals(m1498(new int[]{-56785816, -1218459786, 544439972, -1696898233, 103524388, 692000299, 816474087, 114321682, 78258145, -135697376, 240419135, 463935147, 394975259, 960260976, -2051997848, 476093109}, 31 - Color.green(0)).intern())) {
                    return MraidView.class;
                }
                return null;
            case -593336436:
                if (str.equals(m1498(new int[]{-1963823852, -1634401655, -1807582337, 118756431, -1575206227, -486302986, 2093273251, 1108042160, 1182828160, -1660557119, -389269465, 323016548}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24).intern())) {
                    return TJAwardCurrencyListener.class;
                }
                return null;
            case -217417742:
                if (str.equals(m1496((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 219010896, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 561394015, (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 16).intern())) {
                    return ActionHandler.class;
                }
                return null;
            case 178410181:
                if (str.equals(m1498(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, -1529565126, 463628453, 41622465, 193175627, -1373202361, 1080736451, 695758261, 707893382}, 25 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern())) {
                    return TJSplitWebView.class;
                }
                return null;
            case 206635148:
                if (str.equals(m1496((-219010939) - TextUtils.getOffsetAfter("", 0), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 544616784 - Color.rgb(0, 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-36) - ImageFormat.getBitsPerPixel(0)).intern())) {
                    return TJAdUnitActivity.class;
                }
                return null;
            case 268330895:
                if (str.equals(m1496(TextUtils.getOffsetAfter("", 0) - 219010733, (short) (ViewConfiguration.getPressedStateDuration() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 561394000, (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.combineMeasuredStates(0, 0) - 35).intern())) {
                    return TJAdUnitJSBridge.class;
                }
                return null;
            case 327820672:
                if (str.equals(m1496(Color.alpha(0) - 219010756, (short) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 561394000, (byte) View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 26).intern())) {
                    return TJPlacementVideoListener.class;
                }
                return null;
            case 705136807:
                if (str.equals(m1496((ViewConfiguration.getPressedStateDuration() >> 16) - 219010718, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 561394000 - View.combineMeasuredStates(0, 0), (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTouchSlop() >> 8) - 41).intern())) {
                    return TJCurrency.class;
                }
                return null;
            case 741045788:
                if (!str.equals(m1498(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, 1674312284, -1938627361, 1568932603, -210915843, 316262254, -1900537058, 148088002, 1876152003}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 27).intern())) {
                    return null;
                }
                f1311 = (f1313 + 29) % 128;
                return TJAdUnitActivity.class;
            case 832039888:
                if (!str.equals(m1496((ViewConfiguration.getDoubleTapTimeout() >> 16) - 219010798, (short) View.resolveSize(0, 0), 561394000 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) - 28).intern())) {
                    return null;
                }
                int i11 = f1311 + 125;
                f1313 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                return TJAdUnit.TJAdUnitWebViewListener.class;
            case 906946425:
                if (!str.equals(m1496((ViewConfiguration.getScrollBarSize() >> 8) - 219010812, (short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), AndroidCharacter.getMirror('0') + 12576, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) - 35).intern())) {
                    return null;
                }
                f1311 = (f1313 + 33) % 128;
                return TJVideoListener.class;
            case 1317517621:
                if (str.equals(m1496(ExpandableListView.getPackedPositionGroup(0L) - 219010699, (short) View.MeasureSpec.makeMeasureSpec(0, 0), 561394001 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) - 37).intern())) {
                    return TJSplitWebView.class;
                }
                return null;
            case 1504750787:
                if (str.equals(m1496((ViewConfiguration.getJumpTapTimeout() >> 16) - 219010820, (short) Drawable.resolveOpacity(0, 0), 561394000 - ExpandableListView.getPackedPositionGroup(0L), (byte) ExpandableListView.getPackedPositionGroup(0L), (-42) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    return TJWebView.class;
                }
                return null;
            case 1519750415:
                if (!str.equals(m1496((-219010709) - Drawable.resolveOpacity(0, 0), (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 561394000, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.rgb(0, 0, 0) + 16777176).intern())) {
                    return null;
                }
                f1313 = (f1311 + 111) % 128;
                return TJPlacement.class;
            case 1815593736:
                if (str.equals(m1496(TextUtils.indexOf("", "", 0) - 219010862, (short) ExpandableListView.getPackedPositionGroup(0L), 561393982 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) - 44).intern())) {
                    return Browser.class;
                }
                return null;
            case 1891461874:
                if (str.equals(m1496((ViewConfiguration.getEdgeSlop() >> 16) - 219010776, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 561394000, (byte) TextUtils.getCapsMode("", 0, 0), (-30) - Color.green(0)).intern())) {
                    return TJAdUnit.TJAdUnitVideoListener.class;
                }
                return null;
            case 2041573826:
                if (str.equals(m1498(new int[]{-56785816, -1218459786, 544439972, -1696898233, -12955130, -1193373915, 885133594, 1926772243, -1750476415, 1443389586, -2031916610, 380127639, 1479387215, -1639237244}, 28 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    return TJContentActivity.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1484(TJPlacementData tJPlacementData) {
        f1311 = (f1313 + 115) % 128;
        String url = tJPlacementData.getUrl();
        int i10 = f1311 + 9;
        f1313 = i10 % 128;
        if (i10 % 2 == 0) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1483(TJPlacement tJPlacement) {
        f1311 = (f1313 + 93) % 128;
        String name = tJPlacement.getName();
        f1313 = (f1311 + 17) % 128;
        return name;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1496(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1315;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1318;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1314 + i10] + i13);
                    } else {
                        i14 = (short) (f1316[f1314 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f1314 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f1317);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f1318;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f1316;
                            int i17 = o.f2994;
                            o.f2994 = i17 - 1;
                            o.f2997 = (char) (o.f2996 + (((short) (sArr[i17] + s10)) ^ o.f2995));
                        }
                        sb2.append(o.f2997);
                        o.f2996 = o.f2997;
                        o.f2998++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1498(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1312.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2090(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2089(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1914;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2090(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
