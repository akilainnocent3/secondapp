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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class cc extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1245 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1246 = {'I', 'V', 'i', 'd', 'e', 'o', 'P', 'l', 'a', 'y', 'r', 'L', 's', 't', 'n', 'S', 'A', 'C', 'c', 'k', 'w', fw.b.f85389p, 'm', 'W', 'b', 'T', 'M', 'R', 'p', 'f', 'B', 'E', 'v', 'J', 'K', 'N'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1247 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1248 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1249;

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static SAInterface m1406() {
        int i10 = f1245 + 13;
        f1249 = i10 % 128;
        if (i10 % 2 == 0) {
            return SAVideoAd.getListener();
        }
        SAVideoAd.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m1407() {
        int i10 = f1245 + 89;
        f1249 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1406();
        }
        m1406();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1410(SAAd sAAd) {
        int i10 = f1249 + 13;
        f1245 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1411(sAAd);
        }
        m1411(sAAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1412(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1249 + 63;
        f1245 = i10 % 128;
        int i11 = i10 % 2;
        m1413(sABannerAd, sAInterface);
        if (i11 == 0) {
            int i12 = 30 / 0;
        }
        int i13 = f1245 + 63;
        f1249 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 3 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1413(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1245 + 97;
        f1249 = i10 % 128;
        int i11 = i10 % 2;
        sABannerAd.setListener(sAInterface);
        if (i11 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1409("\t\u0002\u0016\u000b\u0001\u000e\u0001\u001c\u0003#\u0011\u0000\u009e", 12 - ExpandableListView.getPackedPositionChild(0L), (byte) (47 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cc.m1410((SAAd) list.get(0));
            }
        });
        map.put(m1408("\u0002\u0000\u000f\ufff1\u0004\uffff\u0000\nￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r", 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 105).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return cc.m1407();
            }
        });
        map.put(m1408("\u000b\f�\u0006�\n\u000b�\fￚ\ufff9\u0006\u0006�\n￤\u0001", KeyEvent.getDeadChar(0, 0) + 17, false, View.resolveSizeAndState(0, 0, 0) + 6, KeyEvent.keyCodeFromString("") + 109).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                cc.m1412((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        f1245 = (f1249 + 25) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -1959951430:
                if (str.equals(m1409("\u000f\u0004\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u0003\u000b\u0010\u0002\u0011\u0010\u0007\u0001\u000b\n\u0001\u0007\u0004\u0003\u0005¼", View.MeasureSpec.getSize(0) + 27, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 69)).intern())) {
                    return AdVideoPlayerControllerView.class;
                }
                return null;
            case -1855458488:
                if (str.equals(m1408("\u0007\r\u000b\b\u0005\u0005\ufffe\u000b\uffef\u0002\ufffe\u0010￥\u0002\f\r\ufffe\u0007\ufffe\u000b￢\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￜ\b", 34 - KeyEvent.keyCodeFromString(""), false, 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.rgb(0, 0, 0) + 16777324).intern())) {
                    return IVideoPlayerControllerView.Listener.class;
                }
                return null;
            case -1788589794:
                if (str.equals(m1408("\u0001\uffde\u0002\u0004\u0001\u0006\u000f\uffdf\u0011\r\u0006\u000f\u0000\ufff0\ufffe\u0013\ufffe\uffe7\u0014\u0002\u0006\ufff3", 21 - ((byte) KeyEvent.getModifierMetaStateMask()), true, 2 - View.resolveSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 104).intern())) {
                    return AdViewJavaScriptBridge.class;
                }
                return null;
            case -1718372116:
                if (str.equals(m1409("\u0010\u0011 !\u0002\u0010·", 7 - TextUtils.indexOf("", "", 0, 0), (byte) (ExpandableListView.getPackedPositionType(0L) + 67)).intern())) {
                    return SAEvent.class;
                }
                return null;
            case -1711491530:
                if (str.equals(m1408("\f\u000b\u0010\b\ufffa￨\ufff4", 7 - Color.green(0), false, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, (ViewConfiguration.getTapTimeout() >> 16) + 94).intern())) {
                    return SAMedia.class;
                }
                return null;
            case -1305374924:
                if (str.equals(m1408("\u0003\u0011\r\u000b\u0003ￌ\u0011\u0002\tￌ\u000e\u0013\u0000\n\u0007\u0011\u0006\u0003\u0010ￌ\u000b\uffff\f\uffff\u0005\u0003\u0002ￌ\ufff1\uffdf￫\uffff\f\uffff\u0005\u0003\u0002\uffdf\u0002\uffdf\u0001\u0012\u0007\u0014\u0007\u0012\u0017\u0012\u0014ￌ\u0011\u0013\u000e\u0003\u0010\uffff\u0015", 56 - MotionEvent.axisFromString(""), false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, KeyEvent.getDeadChar(0, 0) + 103).intern())) {
                    return SAManagedAdActivity.class;
                }
                return null;
            case -1292741795:
                if (str.equals(m1408("\u0005\ufff3\b\ufff3\u0005\u0006\ufff3\u0016", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8, false, 8 - TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 83).intern())) {
                    return SAVASTAd.class;
                }
                return null;
            case -1246480821:
                if (str.equals(m1408("\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￚ￼\r\u0002\u000f\u0002\r\u0012", 18 - TextUtils.indexOf((CharSequence) "", '0'), false, 18 - ExpandableListView.getPackedPositionChild(0L), 107 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -983382056:
                if (str.equals(m1409("\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u0003\u000b\u0010\u0002\u0011\u0010\u0007\u0001\u000b\n\u0001Á", 21 - Drawable.resolveOpacity(0, 0), (byte) (79 - Color.blue(0))).intern())) {
                    return VideoPlayerController.class;
                }
                return null;
            case -926853969:
                if (!str.equals(m1409("\u0010\u0011\u001c\u0003\u0010\u0018\u0002\u0011\u0010\u0000", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, (byte) (84 - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    return null;
                }
                f1249 = (f1245 + 7) % 128;
                return SAResponse.class;
            case -877887884:
                if (str.equals(m1408("\u0003\ufff0￣\u0011\uffff\u0003\ufff0\f\uffff\u0006\u0006\t\f\u000e\b\t\uffdd\f\uffff\u0013\ufffb\u0006￪\t\uffff\ufffe", Color.argb(0, 0, 0, 0) + 26, true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, 107 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return IVideoPlayerControllerView.class;
                }
                return null;
            case -844831949:
                if (!str.equals(m1408("\u0016\ufffe\t￭\f\u0002\u0001\u0006\ufff3￦\u000f\u0002", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, KeyEvent.normalizeMetaState(0) + 104).intern())) {
                    return null;
                }
                f1245 = (f1249 + 63) % 128;
                return IVideoPlayer.class;
            case -499959157:
                if (str.equals(m1409("\u0010\u0011\u0002\f\u0010\u0001\u000b\u001c\u0006\u0014Ã", ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.f161636n, (byte) (94 - TextUtils.indexOf("", "", 0, 0))).intern())) {
                    return SAInterface.class;
                }
                return null;
            case -279114759:
                if (str.equals(m1408("\u0010�\u0007\u0004\u000e\u0003\u0000\r\uffc9\u0011\u0004\uffff\u0000\n￫\u0007￼\u0014\u0000\r\uffc9\ufff1\u0004\uffff\u0000\n￫\u0007￼\u0014\u0000\rￜ\ufffe\u000f\u0004\u0011\u0004\u000f\u0014\u000f\u0011\uffc9\u000e\u0010\u000b\u0000\r￼\u0012\u0000\u000e\n\b\u0000\uffc9\u000e\uffff\u0006\uffc9\u000b", TextUtils.getCapsMode("", 0, 0) + 61, false, 'X' - AndroidCharacter.getMirror('0'), View.resolveSize(0, 0) + 106).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -258874416:
                if (!str.equals(m1409("\u0010\u0011\u0002\u0003\u0004\u0005\u0004\u0011²", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77)).intern())) {
                    return null;
                }
                f1249 = (f1245 + 109) % 128;
                return SAVideoAd.class;
            case 2537233:
                if (!str.equals(m1409("\u0010\u0011\u000f\u0004", 3 - ImageFormat.getBitsPerPixel(0), (byte) (View.resolveSize(0, 0) + 15)).intern())) {
                    return null;
                }
                f1245 = (f1249 + 103) % 128;
                return SAAd.class;
            case 102107741:
                if (!str.equals(m1409("\u0010\u0011\u0002\f\u0010\u0001\u0006\u0010\u000e\u0001\u000e\u0001\t\b\u000f\u0004", 16 - TextUtils.indexOf("", "", 0, 0), (byte) (Color.alpha(0) + 87)).intern())) {
                    return null;
                }
                f1245 = (f1249 + 105) % 128;
                return SAInterstitialAd.class;
            case 347965699:
                if (!str.equals(m1408("\u0007\ufffe\u000b￢\uffef\u0002�\ufffe\b￩\u0005\ufffa\u0012\ufffe\u000bￜ\b\u0007\r\u000b\b\u0005\u0005\ufffe\u000b￥\u0002\f\r\ufffe", 30 - (Process.myPid() >> 22), false, TextUtils.indexOf("", "") + 3, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 108).intern())) {
                    return null;
                }
                int i10 = f1245 + 33;
                f1249 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return IVideoPlayerController.Listener.class;
            case 511814123:
                if (str.equals(m1408("\b\u0005\ufff9\f\b\u001a\ufff6￤\ufffa", 8 - TextUtils.indexOf((CharSequence) "", '0', 0), false, 6 - Color.green(0), 98 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    return SAWebView.class;
                }
                return null;
            case 562364207:
                if (str.equals(m1409("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\n\u0010\u0017\u000b\u000f\u000e\u000b\u0004ÂÂ\n\u0010", 22 - View.MeasureSpec.getMode(0), (byte) (View.combineMeasuredStates(0, 0) + 86)).intern())) {
                    return IVideoPlayerController.class;
                }
                return null;
            case 690451442:
                if (str.equals(m1408("\u0010\f\u0005\u000e\uffff\uffef�\u0012�￦\u0013\u0001\u0005\ufff2\u0000\uffdd\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0001\u0003\u0000\u0005\u000e\uffde", 30 - ExpandableListView.getPackedPositionGroup(0L), true, 16 - (Process.myPid() >> 22), 105 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    return AdViewJavaScriptBridge.Listener.class;
                }
                return null;
            case 816054202:
                if (str.equals(m1409("\u0010\u0011\u000f\u0017\r\u000e\u0004\u0017\u0016\u0005\u0019\u0000\u0003\u0005\u0095", 15 - View.getDefaultSize(0, 0), (byte) (30 - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    return SACustomWebView.class;
                }
                return null;
            case 846064660:
                if (!str.equals(m1408("\u0002\n\r\u0014\ufff4￢￥\u0006\u0015", 8 - TextUtils.lastIndexOf("", '0', 0, 0), false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, ((byte) KeyEvent.getModifierMetaStateMask()) + 101).intern())) {
                    return null;
                }
                f1249 = (f1245 + 115) % 128;
                return SADetails.class;
            case 912139882:
                if (!str.equals(m1409("\u0010\u0011\u0004\r\r\u001b\u001c\u0002\u0004\u0003Ï", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 110)).intern())) {
                    return null;
                }
                int i11 = f1245 + 63;
                f1249 = i11 % 128;
                if (i11 % 2 == 0) {
                    return SAVASTMedia.class;
                }
                throw null;
            case 947295484:
                if (str.equals(m1408("\u0000\uffde\f\u0002\u0001\u0006\ufff3\uffde\ufff0\u0016\u0011\u0006\u0013\u0006\u0011", 15 - TextUtils.indexOf("", "", 0, 0), true, 10 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 105).intern())) {
                    return SAVideoActivity.class;
                }
                return null;
            case 1067523235:
                if (!str.equals(m1408("\u0013\u0002￠\u0003￠\u0003\u0004\u0006\u0000\r\u0000￬￠\ufff2\u0018\u0013\b\u0015\b", ((Process.getThreadPriority(0) + 20) >> 6) + 19, true, TextUtils.getOffsetAfter("", 0) + 14, (ViewConfiguration.getEdgeSlop() >> 16) + 102).intern())) {
                    return null;
                }
                int i12 = f1249 + 49;
                f1245 = i12 % 128;
                return i12 % 2 == 0 ? IVideoPlayerController.class : SAManagedAdActivity.class;
            case 1179812605:
                if (str.equals(m1408("ￊ\u0001\t\u000b\u000f\u0001\u0013�\u000e\u0001\f\u0011\u000fￊ\u0012\u0010\u0000\uffdd\b�\u0005\u0010\u0005\u0010\u000f\u000e\u0001\u0010\n￥\uffdd\uffefￊ\u000e\u0001\u0004\u000f\u0005\b\ufffe\u0011\fￊ\u0007\u0000\u000f", ImageFormat.getBitsPerPixel(0) + 47, true, (Process.myTid() >> 22) + 16, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 105).intern())) {
                    return SAInterstitialAd.class;
                }
                return null;
            case 1233891357:
                if (!str.equals(m1408("\u0005\u0012￣￡\ufff3\u0005\u0016\t\u0014\u0001", 10 - TextUtils.indexOf("", "", 0, 0), true, TextUtils.getTrimmedLength("") + 5, 101 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    return null;
                }
                f1245 = (f1249 + 87) % 128;
                return SACreative.class;
            case 1635726011:
                if (str.equals(m1409("\u0010\u0011\u0002\u0003\u0004\u0005\u000b\u0017\b\u0001\u0013\u0014", '<' - AndroidCharacter.getMirror('0'), (byte) (KeyEvent.getDeadChar(0, 0) + 117)).intern())) {
                    return SAVideoClick.class;
                }
                return null;
            case 1852615901:
                if (str.equals(m1409("\u0010\u0011 \u0006ææ\n\u0010\u000f\u0004", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, (byte) (120 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern())) {
                    return SABannerAd.class;
                }
                return null;
            case 1864912441:
                if (str.equals(m1408("\ufff0￤\ufff6\u001a\b\f\ufff9\u0007￤\u0007\b\n\u0004\u0011\u0004", View.MeasureSpec.getSize(0) + 15, true, 3 - ExpandableListView.getPackedPositionType(0L), Color.rgb(0, 0, 0) + 16777314).intern())) {
                    return SAManagedAdView.class;
                }
                return null;
            case 1888267954:
                if (str.equals(m1408("\u0011\ufffe\b\u0005\u000f\u0004\u0001ￊ\uffef\uffdd\ufff2\u0005\u0000\u0001\u000b\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\u0010\u0012ￊ\u000f\u0011\f\u0001\u000e�\u0013\u0001\u000f\u000b\t\u0001ￊ\u000f\u0000\u0007ￊ\f", 44 - View.MeasureSpec.getSize(0), false, TextUtils.getOffsetAfter("", 0) + 23, TextUtils.indexOf("", "", 0, 0) + 105).intern())) {
                    return SAVideoActivity.class;
                }
                return null;
            case 1968274797:
                if (str.equals(m1408("\u0013\u0001\u000f\u000b\t\u0001\uffdd\u0000\u000f\uffdd", TextUtils.indexOf((CharSequence) "", '0') + 11, false, 9 - TextUtils.getOffsetBefore("", 0), 105 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    return AwesomeAds.class;
                }
                return null;
            case 1976248583:
                if (str.equals(m1409("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\n\u0010\b\u0005\r\u000e\u0002\u0010\n\u0010", TextUtils.getCapsMode("", 0, 0) + 20, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 108)).intern())) {
                    return IVideoPlayer.Listener.class;
                }
                return null;
            case 2044807796:
                if (str.equals(m1408("\f\u000f\n\ufffe\u0011\ufff0\uffde￠\u000f\u0002\ufffe\u0011\u0006\u0013\u0002￣", TextUtils.lastIndexOf("", '0', 0, 0) + 17, false, 5 - Color.red(0), 104 - Color.red(0)).intern())) {
                    return SACreativeFormat.class;
                }
                return null;
            case 2057982119:
                if (str.equals(m1408("\u0006\u001a\u0002\r\ufff1\u0003\u0006\ufff8￢\ufff4\u0013", 11 - ExpandableListView.getPackedPositionType(0L), true, 10 - TextUtils.indexOf("", ""), 100 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    return SAWebPlayer.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m1411(SAAd sAAd) {
        f1245 = (f1249 + 11) % 128;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        f1245 = (f1249 + 17) % 128;
        return jSONObjectWriteToJson;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        String sDKVersionNumber;
        int i10 = f1249 + 109;
        f1245 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
                int i11 = 82 / 0;
            } else {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
            }
            int i12 = f1249 + 81;
            f1245 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 53 / 0;
            }
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return hu.m2304().m2306().m2406(SAVersion.class, m1408("\uffdd\fￚ\u000b\u0013ￓ\r\u000b\u0013\n\u000b\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, false, 6 - (ViewConfiguration.getTouchSlop() >> 8), 85 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1409(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f1246;
                char c10 = f1248;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1408(String str, int i10, boolean z10, int i11, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f1247);
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
}
