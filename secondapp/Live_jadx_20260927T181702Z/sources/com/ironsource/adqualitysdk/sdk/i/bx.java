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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.cast.CastStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bx extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1113 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1114;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1115;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1116;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends VideoAdListener implements hg<VideoAdListener> {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f1155 = 1;

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f1156 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean f1159 = true;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f1160 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f1164 = 201;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ch f1165;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private VideoAdListener f1166;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f1163 = {287, 306, 301, 302, 312, 266, 277, 316, 317, 311, 315, 247, 298, 284, 318, 300, 271, 309, 269, 310, 288, 305, 281, 304, 268, 308, 283, 270, 321, 313, 322, 303, 320, 285};

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f1161 = 36968;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f1162 = 635;

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private static char f1157 = 61018;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f1158 = 8246;

        public b(VideoAdListener videoAdListener, ch chVar) {
            this.f1166 = videoAdListener;
            this.f1165 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private VideoAdListener m1307() {
            int i10 = f1156 + 115;
            f1155 = i10 % 128;
            if (i10 % 2 != 0) {
                return this.f1166;
            }
            int i11 = 27 / 0;
            return this.f1166;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m1308(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes(CharEncoding.ISO_8859_1);
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f2988) {
                try {
                    char[] cArr2 = f1163;
                    int i11 = f1164;
                    if (f1159) {
                        int length = bArr.length;
                        m.f2990 = length;
                        char[] cArr3 = new char[length];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i12 = m.f2989;
                            int i13 = m.f2990 - 1;
                            int i14 = m.f2989;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            m.f2989 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f1160) {
                        int length2 = cArr.length;
                        m.f2990 = length2;
                        char[] cArr4 = new char[length2];
                        m.f2989 = 0;
                        while (m.f2989 < m.f2990) {
                            int i15 = m.f2989;
                            int i16 = m.f2990 - 1;
                            int i17 = m.f2989;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            m.f2989 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    m.f2990 = length3;
                    char[] cArr5 = new char[length3];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i18 = m.f2989;
                        int i19 = m.f2990 - 1;
                        int i20 = m.f2989;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        m.f2989 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void onAdClicked() {
            f1155 = (f1156 + 93) % 128;
            bx.this.m773(this, this.f1165, m1308(null, MotionEvent.axisFromString("") + 128, null, "\u0083\u0084\u009a\u0090\u0082\u0092\u0099\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                videoAdListener.onAdClicked();
            }
            int i10 = f1156 + 51;
            f1155 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public void onAdCustomEndCardFound() {
            bx.this.m773(this, this.f1165, m1308(null, (KeyEvent.getMaxKeyCode() >> 16) + 127, null, "\u0083\u008a\u008f\u0085\u0091\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0094\u0085\u0089\u0088\u008f\u0099\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1155 = (f1156 + 99) % 128;
                videoAdListener.onAdCustomEndCardFound();
                f1155 = (f1156 + 103) % 128;
            }
        }

        public void onAdDidReachEnd() {
            bx.this.m773(this, this.f1165, m1308(null, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, null, "\u0083\u008a\u009c\u0096\u0090\u008d\u0084\u009b\u0083\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 101) % 128;
                videoAdListener.onAdDidReachEnd();
            }
            f1155 = (f1156 + 37) % 128;
        }

        public void onAdDismissed() {
            f1155 = (f1156 + 97) % 128;
            bx.this.m773(this, this.f1165, m1308(null, TextUtils.getTrimmedLength("") + 127, null, "\u0083\u0084\u0088\u0088\u0082\u0094\u0088\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1155 = (f1156 + 91) % 128;
                videoAdListener.onAdDismissed();
            }
        }

        public void onAdExpired() {
            f1155 = (f1156 + 45) % 128;
            bx.this.m773(this, this.f1165, m1308(null, 127 - (Process.myTid() >> 22), null, "\u0083\u0084\u008b\u0082\u009e\u009d\u009c\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1155 = (f1156 + 103) % 128;
                videoAdListener.onAdExpired();
            }
        }

        public void onAdLoadFail(PlayerInfo playerInfo) {
            f1156 = (f1155 + 33) % 128;
            bx.this.m773(this, this.f1165, m1308(null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u0092\u0082\u008d\u0091\u0083\u008d\u0085\u0087\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), playerInfo);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                videoAdListener.onAdLoadFail(playerInfo);
                f1155 = (f1156 + 77) % 128;
            }
            f1155 = (f1156 + 15) % 128;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0047  */
        public void onAdLoadSuccess() {
            int i10 = f1155 + 65;
            f1156 = i10 % 128;
            if (i10 % 2 != 0) {
                bx.this.m773(this, this.f1165, m1308(null, 5 >> View.MeasureSpec.getMode(0), null, "\u0088\u0088\u0084\u0090\u0090\u008f\u008e\u0083\u008d\u0085\u0087\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
                if (this.f1166 != null) {
                    this.f1166.onAdLoadSuccess();
                }
            } else {
                bx.this.m773(this, this.f1165, m1308(null, 127 - View.MeasureSpec.getMode(0), null, "\u0088\u0088\u0084\u0090\u0090\u008f\u008e\u0083\u008d\u0085\u0087\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
                if (this.f1166 != null) {
                    this.f1166.onAdLoadSuccess();
                }
            }
            int i11 = f1156 + 103;
            f1155 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public void onAdSkipped() {
            f1156 = (f1155 + 111) % 128;
            bx.this.m773(this, this.f1165, m1308(null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), null, "\u0083\u0084\u009e\u009e\u0082\u009a\u008e\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                int i10 = f1155 + 33;
                f1156 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onAdSkipped();
                if (i11 != 0) {
                    int i12 = 9 / 0;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0048  */
        public void onAdStarted() {
            int i10 = f1156 + 119;
            f1155 = i10 % 128;
            if (i10 % 2 == 0) {
                bx.this.m773(this, this.f1165, m1308(null, Color.rgb(0, 0, 0) - 16777089, null, "\u0083\u0084\u0089\u008b\u008d\u0089\u008e\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
                if (this.f1166 != null) {
                    this.f1166.onAdStarted();
                }
            } else {
                bx.this.m773(this, this.f1165, m1308(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u0083\u0084\u0089\u008b\u008d\u0089\u008e\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
                if (this.f1166 != null) {
                    this.f1166.onAdStarted();
                }
            }
            f1156 = (f1155 + 3) % 128;
        }

        public void onCustomCTACLick(boolean z10) {
            bx.this.m773(this, this.f1165, m1308(null, TextUtils.getTrimmedLength("") + 127, null, "\u009a\u0090\u0082\u0087\u0099\u0086¢\u0099\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), Boolean.valueOf(z10));
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 1) % 128;
                videoAdListener.onCustomCTACLick(z10);
            }
            int i10 = f1156 + 55;
            f1155 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 91 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x004d  */
        public void onCustomCTALoadFail() {
            int i10 = f1155 + 13;
            f1156 = i10 % 128;
            if (i10 % 2 != 0) {
                bx.this.m773(this, this.f1165, m1308(null, 21 / (ViewConfiguration.getScrollBarFadeDuration() + 14), null, "\u0092\u0082\u008d\u0091\u0083\u008d\u0085\u0087\u0086¢\u0099\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[1]);
                if (this.f1166 != null) {
                    this.f1166.onCustomCTALoadFail();
                }
            } else {
                bx.this.m773(this, this.f1165, m1308(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0092\u0082\u008d\u0091\u0083\u008d\u0085\u0087\u0086¢\u0099\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
                if (this.f1166 != null) {
                    this.f1166.onCustomCTALoadFail();
                }
            }
            f1155 = (f1156 + 89) % 128;
        }

        public void onCustomCTAShow() {
            int i10 = f1156 + 37;
            f1155 = i10 % 128;
            if (i10 % 2 == 0) {
                bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠㍖៥\ue84a昸⥸릺⮳獓", 114 / Process.getGidForName("")).intern(), new Object[1]);
                if (this.f1166 == null) {
                    return;
                }
            } else {
                bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠㍖៥\ue84a昸⥸릺⮳獓", Process.getGidForName("") + 32).intern(), new Object[0]);
                if (this.f1166 == null) {
                    return;
                }
            }
            f1156 = (f1155 + SignalKey.EVENT_ID) % 128;
            this.f1166.onCustomCTAShow();
        }

        public void onCustomEndCardClick(String str) {
            bx.this.m773(this, this.f1165, m1308(null, TextUtils.getOffsetBefore("", 0) + 127, null, "\u009a\u0090\u0082\u0092\u0099\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0094\u0085\u0089\u0088\u008f\u0099\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), str);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                int i10 = f1156 + 45;
                f1155 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onCustomEndCardClick(str);
                if (i11 == 0) {
                    int i12 = 27 / 0;
                }
            }
            int i13 = f1155 + 81;
            f1156 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 60 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x004f  */
        public void onCustomEndCardShow(String str) {
            int i10 = f1155 + 35;
            f1156 = i10 % 128;
            if (i10 % 2 != 0) {
                bx bxVar = bx.this;
                ch chVar = this.f1165;
                String strIntern = m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠៚ㅃ돟緶戉쿺誱榲⥸릺⮳獓", (ViewConfiguration.getKeyRepeatDelay() >> 47) * 97).intern();
                Object[] objArr = new Object[1];
                objArr[1] = str;
                bxVar.m773(this, chVar, strIntern, objArr);
                if (this.f1166 != null) {
                    this.f1166.onCustomEndCardShow(str);
                }
            } else {
                bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈ꋻ甬忧攉\uf322儠៚ㅃ돟緶戉쿺誱榲⥸릺⮳獓", 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), str);
                if (this.f1166 != null) {
                    this.f1166.onCustomEndCardShow(str);
                }
            }
            f1155 = (f1156 + 37) % 128;
        }

        public void onDefaultEndCardClick(String str) {
            f1156 = (f1155 + 63) % 128;
            bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈脇쳟쨗媭⦧搝ද\uf722\udec2遪ᱨ꧰ꧻ\uda64⤊䠷喎㲍㥝ꭆ", TextUtils.indexOf((CharSequence) "", '0', 0) + 38).intern(), str);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 53) % 128;
                videoAdListener.onDefaultEndCardClick(str);
                f1155 = (f1156 + 89) % 128;
            }
        }

        public void onDefaultEndCardShow(String str) {
            bx.this.m773(this, this.f1165, m1308(null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "¡\u0085\u0096\u008e\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u0089\u0092\u008f\u008d \u0084\u0093\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), str);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 101) % 128;
                videoAdListener.onDefaultEndCardShow(str);
            }
            f1155 = (f1156 + 79) % 128;
        }

        public void onEndCardClosed(Boolean bool) {
            f1155 = (f1156 + 71) % 128;
            bx.this.m773(this, this.f1165, m1308(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0083\u0084\u0088\u0085\u0092\u0099\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), bool);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                videoAdListener.onEndCardClosed(bool);
                f1155 = (f1156 + 65) % 128;
            }
        }

        public void onEndCardLoadFail(Boolean bool) {
            f1155 = (f1156 + 31) % 128;
            bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈៚ㅃ돟緶戉쿺䘧ꆝ\ue4bf㲨\uea2fኢ섡䢋㕭\udaf2", 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), bool);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 25) % 128;
                videoAdListener.onEndCardLoadFail(bool);
                f1155 = (f1156 + 15) % 128;
            }
        }

        public void onEndCardLoadSuccess(Boolean bool) {
            bx.this.m773(this, this.f1165, m1308(null, 127 - Color.green(0), null, "\u0088\u0088\u0084\u0090\u0090\u008f\u008e\u0083\u008d\u0085\u0087\u0083\u008b\u008d\u0099\u0083\u008a\u009c\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), bool);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 109) % 128;
                videoAdListener.onEndCardLoadSuccess(bool);
                f1155 = (f1156 + 71) % 128;
            }
        }

        public void onEndCardSkipped(Boolean bool) {
            f1155 = (f1156 + 59) % 128;
            bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈៚ㅃ돟緶戉쿺誱榲蓨つꔻ孯컝ᐆ", Color.red(0) + 32).intern(), bool);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                videoAdListener.onEndCardSkipped(bool);
                f1156 = (f1155 + 79) % 128;
            }
        }

        public void onLeaveApp() {
            f1156 = (f1155 + 23) % 128;
            bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈氵袗\ud7a8\uf634철地ꔻ孯", 26 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                f1156 = (f1155 + 49) % 128;
                videoAdListener.onLeaveApp();
                f1156 = (f1155 + 65) % 128;
            }
        }

        public void onReplay() {
            f1155 = (f1156 + 49) % 128;
            bx.this.m773(this, this.f1165, m1309("ᏻ䣆㘠跼혋⫷䘧ꆝᙣꤖꜹ蟕嚜킈࠻䔤뿶閈鯙\udc5f娸㖣䝉܇", ExpandableListView.getPackedPositionChild(0L) + 25).intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                int i10 = f1156 + 49;
                f1155 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onReplay();
                if (i11 == 0) {
                    int i12 = 42 / 0;
                }
                f1155 = (f1156 + 1) % 128;
            }
        }

        public void onReplayFinish() {
            bx.this.m773(this, this.f1165, m1308(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0096\u0088\u0082\u008a\u0082\u0091\u009f\u008d\u0092\u009e\u0084\u009b\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), new Object[0]);
            VideoAdListener videoAdListener = this.f1166;
            if (videoAdListener != null) {
                int i10 = f1155 + 93;
                f1156 = i10 % 128;
                int i11 = i10 % 2;
                videoAdListener.onReplayFinish();
                if (i11 != 0) {
                    int i12 = 13 / 0;
                }
            }
            int i13 = f1155 + SignalKey.EVENT_ID;
            f1156 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ VideoAdListener mo697() {
            f1156 = (f1155 + 125) % 128;
            VideoAdListener videoAdListenerM1307 = m1307();
            f1155 = (f1156 + 27) % 128;
            return videoAdListenerM1307;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m1309(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (n.f2992) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    n.f2991 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = n.f2991;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1161)) ^ ((c11 >>> 5) + f1157)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1162) ^ ((c12 + i12) ^ ((c12 << 4) + f1158))));
                                i12 -= 40503;
                            }
                            int i14 = n.f2991;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            n.f2991 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0058  */
        public void onAdDismissed(int i10) {
            int i11 = f1155 + 87;
            f1156 = i11 % 128;
            if (i11 % 2 != 0) {
                bx.this.m773(this, this.f1165, m1308(null, (ViewConfiguration.getLongPressTimeout() % SignalKey.EVENT_ID) * 20, null, "\u0088\u0088\u0084\u008b\u0098\u0085\u008b\u0097\u0096\u0089\u0082\u0095\u0083\u0084\u0088\u0088\u0082\u0094\u0088\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), Integer.valueOf(i10));
                if (this.f1166 != null) {
                    this.f1166.onAdDismissed(i10);
                }
            } else {
                bx.this.m773(this, this.f1165, m1308(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0088\u0088\u0084\u008b\u0098\u0085\u008b\u0097\u0096\u0089\u0082\u0095\u0083\u0084\u0088\u0088\u0082\u0094\u0088\u0082\u0093\u0083\u0086\u008a\u0085\u008c\u008b\u0084\u008a\u0084\u0089\u0088\u0082\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), Integer.valueOf(i10));
                if (this.f1166 != null) {
                    this.f1166.onAdDismissed(i10);
                }
            }
            int i12 = f1156 + 3;
            f1155 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        char[] cArr = new char[2355];
        ByteBuffer.wrap("VA\u0087ãõm\"Ù\u0010!\u0017UÆã´qcÌQ;\u0000£þ\u0003Xm\u0089Øû{,ó\u001e0O\u0086±>ã\\Ôí\u0006rwèY\b\u008a»ü*.@î\u0082?5M\u009d\u009a\u0000¨âùg\u0007ÊU§b<°\u008eÁ8ïû<AJÝ\u0098¦©3÷\u0089\u0000RÑö£WtÌF)\u0017¬é\u0006»H\u008cù^E/ß\u00016Ò\u0081¤\u0005\u0000AÑ÷£utÖF9\u0017\u00adé\u0011»`\u008cÛ^D/Ð\u00017Ò\u008d¤\u0010\u0000HÑê£dtÐF(\u0017\u009eé\u0016»V\u008c÷^^/Ì\u00012Ò\u0081/Mþé\u008cN[Öi\u00038¥Æ\u000e\u0094_£çqc\u0000Ê.?ý\u008d\u008b\u000fYt\u0000AÑæ£EtÍF%\u0017°é\u001c\u0000BÑò£Ht×F)\u0017\u00adé\"»w\u008cý^X/Û\u0001?Ò\u0090¤\u0012vxGÛ\u0019Qê ¼\"\u008d\u0086_\u000e1v\u0000MÑá£GtÐF(\u0017\u009eé\u0016»U\u008cê^N/Í\u00014Ò\u008a¤\u0003voGï\u0000VÑò£UtÍF\r\u0017»é\"»w\u008cý^X/Û\u0001?Ò\u0090¤\u0012vx\u0000BÑá£ItÎF?\u0017ºé\u0000»H\u008cù^E/ß\u00016Ò\u0081¤\u00056uç×\u0095YBíp\u0015!«ß!\u008dLºÀhd\u0019ð7\u0018ä°\u0092>@^qÁ/aÜ¿\u008a\u000f½\u009fl=\u001e³É\u0007ûÿªATË\u0006¦1*ã\u008e\u0092\u001a¼òoZ\u0019ÔË´ú+¤\u008bWV\u0001ó0QâÊ\u008c¼¿\u0016i\u0083\u0018lÊøõk§3Q \u0000\u00152\u0084Ýl\u008fÒ¾VNu\u009f×íY:í\b\u0015Y«§!õLÂÀ\u0010daðO\u0018\u009c°ê>8^\tÁWa¤¼ò\u0019Ã»\u0011 \u007fVLü\u009aië\u00869\u0012\u0006\u0080TÙ¢GóþÁb.\u0082¯\u0089~\u0004\f¶Û\u000eéá¸cFÙ\u0014¯#5ñ\u009b\u0080\u0013®á}\\\u000bÂÙ\u0092è ÀÃ\u0011wcØ´V\u0086´×&)\u008c{æLf\u009eÈïUÁ·\u0012>d\u008f¶å\u0087dÙß*'|¨M\u0006\u009f\u0084ñÁÂM\u0014Üe-·£\u0088\u0005Ú\u007f,ñ}_\u000f\u008eÞ:¬\u0095{\u001bIù\u0018kæÁ´«\u0083+Q\u0085 \u0018\u000eúÝs«Ây¨H)\u0016\u0092åj³å\u0082KPÉ>\u008e\r\u0004Û\u0091ª{xóG[\u0015?\u0000MÑá£GtÐF(\u0017\u0096é\u001c»q\u008cý^Y/Í\u0001%Ò\u008d¤\u0003vcGü\u0019\\ê\u0093¼$\u008d\u008c_\u000f1j\u0002ÌÔA¥\u00adw)\u0000VÑò£UtÍF\u0005\u0017±é\u0006»`\u008cê^X/Ê\u00018Ò\u0090¤\u001evkGñ\u0019`ê±¼3\u008d\u009a_\u00191a\u0002ÖÔP¥ºfÃ·[Åÿ\u0012: \u0091q\u0007\u008f½ÝÆêT8òIzg\u008a´,Âô\u0010Ë!Y\u007fé\u008c\u000bÚÕë79µWÉd!²ñÃ\u000b\u0011\u0082.&|^\u008aÊÛ~éþ\u0006\u0014T¤e?³GÁ\u009a\u001e`,ñ}\u000b\u008b¡Ø#öO\u0004ÇUecÇ°2Î¾\u001f\u0012-T{ê\u0088R¦\u008a÷\u0005\u0005§SÝ`K¾ñÏ\u007f\u001d\u0097*%x¸\u0096Æ§võã\u0002\u0019P\u0097a=¿½ÍÕ\u001aK\u0000$Ñ\u0086£\bt¼FD\u0017úép»\u001d\u008c\u0091^5/¡\u0001IÒá¤ov\u000fG\u0090\u00190êî¼Y\u008dñ_y1\u0015\u0002§Ô-¥Ý\u000böÚn¨Ê\u007f\u000fM¤\u001c2â\u0088°ó\u0087aUÇ$O\n¿Ù\u0019¯Á}þLl\u0012Üá>·à\u0086\u0002T\u0080:ü\t\u0014ßÄ®>|·C\u0013\u0011kçÿ¶K\u0084Ëk!9\u0091\b\nÞr¬¯sUAÄ\u0010>æ\u0094µ\u0016\u009bziò8P\u000eòÝ\u0002£\u0080r\u0004@a\u0016ßågË¿\u009a0h\u0092>è\r~ÓÄ¢Jp¢G\u0010\u0015\u008dûóÊC\u0098Öo,=¢\f\bÒ\u0088 àw~¯¶~\u001a\f¼Û+éÓ¸mFç\u0014\u008a#\u0006ñ¢\u00806®Þ}v\u000bøÙ\u0098è\u0007¶§Ey\u0013Î\"fðî\u009e\u0082\u00ad0{º\nJ\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔ\\¥¦w/H\u008b\u001aóìg½Ó\u008fS`¹2\t\u0003\u0092Õê§7xÍJ\\\u001b¦í\f¾\u008e\u0090âbj3È\u0005jÖ\u0081¨\u000by\u008eKä\u001djîØÀ=\u0091¹c\u001d5q\u0006áØA©Ï{'L\u0080\u001e\u0018ðFÁù\u0093Yd©6%\u0007\u008fÙ\r«u\u0000VÑò£UtÍF\u0005\u0017±é\u0006»`\u008cê^X/Ê\u00018Ò\u0090¤\u001evkGñ\u0019qê ¼\"\u008d\u0080_\n1f\u0002ÖÔL\u001e\u0015Ï£¨Çyq\u000bäÜ^î¾¿8\u0000AÑ÷£ctÁF8\u0018ÒÉd»çlO^¬\u000f<ñ\u008e£ø\u0094xFÝ\u0000AÑ÷£PtÜF>\u0017«é\u001b»v\u008cñ^E/Ù\u0001\u0018Ò\u008a¤\u0011ve\u0094ÆEb7ßàBÒ¬\u0083.}¥/þ\u0018bÊÙ»C\u0095¢F10\u0093âîÓ@\u008dÊ~1(\u00ad\\\u0005\u008d\u0081ÿ&(¾\u001akKíµF\u0000MÑÁ£gtðF\b\u0017\u0089é\u001b»`\u008cï\u0000MÑÁ£gtðF\b\u0017\u0096é\u001c»q\u008cý^Y/Í\u0001%Ò\u008d¤\u0003vcGü\u0019\\\u0000MÑÁ£gtðF\b\u0017\u009dé\u0013»k\u008cö^N/ÌµhdÞ\u0016_Áâó\u0000¢\u0085\\>\u000eB9Åëg\u009aå´<g¨\u0011=ÃLòÆ¬x_\u009e\t\u00108²è»9\nK¨\u009c!®ÂÿZ\u0001íS\u008bd\u0001¶\u0086Ç4éÙ:{Ló\u009e\u0093¯\u000f\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6vn\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤5vxGò\u0019Qê§¼5\u008d\u0088_\u000f1{\u0002ðÔP¥«w>H\u0087\u001a÷ìq½Õ¦\u0084w&\u0005¨Ò\u001càä±AOÛ\u001d¾*5ø\u0095\u0089\u0016§øtL\u0002ùÐ´á>¿\u009dLk\u001aù+DùÃ\u0097·¤=r\u009c\u0003jÑóîG¼?\u0000RÑö£QtØF>\u0017»é\u0017»a\u008cÈ^Y/Û\u0001\"Ò\u0081¤\u0019v~Gø\u0019Bê\u0087¼3\u008d\u008a_\u00131}\u0002ÃÔA¥§w)\u0000RÑö£QtØF>\u0017»é\u0017»a\u008cÈ^Y/Û\u0001\"Ò\u0081¤\u0019v~Gø\u0019Bê\u0085¼7\u008d\u008a_\b1`\u0002ÐÔL\u0098jIÎ;iìñÞ\"\u008f\u0086q9#X\u0014ÖÆs·ç\u0099\tJ\u0088<9îSßÒ\u0081ir\u0091$\u001e\u0015°Ç2\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔG¥\u00adw,H\u008f\u001aóìp½Â\u008f^`ã2\u0001\u0003\u0090Õò§pxÚJV\u001b¦í\u001c¾Ö\u0090Ãbg3ó\u0005-Ö³¨8y\u0098Kç\u001dBîÄÀ-\u0091¹c\u000b5C\u0006öØ\\©Ò{8L\u0088\u001e\u0000ð~\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6viGé\u0019Yêµ¼?\u008d\u009d_\u0005\u0000nÑö£Rt\u0097F<\u0017ªé\u0010»k\u008cù^_/×\u0001'Ò\u0081¤YvfGô\u0019Dê¦¼x\u008d\u009a_\u00181d\u0002\u008cÔG¥\u00adw,H\u008f\u001aóìp½Â\u008f^`ã2\u0001\u0003\u0090Õò§pxÚJV\u001b¦í\u001c¾Ö\u0090Ýb\u007f3Â\u00050Ö\u0085¨\u000fy\u008aKñ\u001dQîÒÀ,\u0091¸c.5a\u0006áØA©Í{'L\u0095\u001e\r\u0000VÑò£UtÍF\u001e\u0017ºé\u0005»d\u008cê^O/Û\u00015Ò¥¤\u0014v~Gô\u0019Fêª¼\"\u008d\u0090\u0000PÑÝ£gtÝF\u001a\u0017¶é\u0017»r\u0000HÑê£dtÐF(\u0017\u009eé\u0016»S\u008cñ^N/ÉTð\u0085R÷Ü h\u0012\u0090C%½«ïÓØN\nö{tU¨\u00868ð\u0099\"Û\u0013@Mÿ\u0000HÑê£dtÐF(\u0017\u0093é\u0017»d\u008cü^N/Ì\u00013Ò\u008b¤\u0016vxGù\u0019qê§¼\u0000\u008d\u0080_\u00191x\u0000HÑê£dtÐF(\u0017\u0092é »`\u008cû^_/ÿ\u00015Ò²¤\u001evoGê\u0080SQÞ#dôêÆ\u0006\u0097\u009fi\u001e;h\fïÞM¯Ó\u0081&R®$\u001aöoÇñ\u0099ej©<0\r\u009dB\u0000\u0093\u008dá46\u0088\u0004rUá«Gù'Î\u0089\u001c\u001fm¸Ch\u0090ÑæP\u0012\u0012Ã\u009f±)f©Tk\u0005þûD©\u0006\u009e¾L?=\u0095\u0013vÀÑÉå\u0018hjÄ½i\u008f\u009bÞ< ®rÕEZ\u0000VÑú£BtÜF#\u0017\u009eé\u0016\u0000VÑú£BtÜF#\u0017\u009eé\u0016»I\u008cñ^X/Ê\u00014Ò\u008a¤\u0012vx\u0000VÑú£BtÜF#\u0017\u009eé\u0016»S\u008cñ^N/É\u0000VÑò£UtÍF\u001c\u0017\u00adé\u001d»f\u008cý^X/Í\u0001>Ò\u0096\u0083\u001eR± \t÷\u008eÅg\u0094ãju8%\u000f°Ý\n;âê@\u0098ÎOz}\u0082,<Ò¶\u0080Û·Weó\u0014g:\u008fé'\u009f©MÉ|V\"öÑ(\u0087\u0098¶\u000fd¿\nÖ9|ïú\u009e\fL\u0094s6\u0000HÑê£dtÐF(\u0017\u008dé\u0017»r\u008cù^Y/Ú\u00014Ò\u0080¤6vnGÑ\u0019Yê°¼\"\u008d\u008c_\u00121j\u0002Ð\u0000HÑê£dtÐF(\u0017\u009eé\u0016»S\u008cñ^N/É\u0001\u001dÒ\u008d¤\u0004v~Gø\u0019^ê¦¼$\u0000TÑÑ£ptÐF(\u0017ºé\u001d»D\u008cü^g/×\u0001\"Ò\u0090¤\u0012vdGø\u0019Bè@9öKw\u009cÙ®?ÿ¿\u0001\u001eSw\u0000VÑú£CtÎF\u000f\u0017°é\u001c»q\u008cê^D/Ò\u0001=Ò\u0081¤\u0005v\\Gü\u0019Cê·\u0000VÑú£BtÜF#\u0017\u009eé\u0016»F\u008c÷^E/Ê\u0001#Ò\u008b¤\u001bvfGø\u0019BS\u009f\u00823ð\u008b'\u0015\u0015êDUº×è¥ß2\r\u0089|\u0004\u0000CÑÿ£OtÚF'\u0017\u008bé\u001a»w\u008c÷^^/Ù\u00019\u0000CÑÿ£OtÚF'\u0017\u008bé\u0000»d\u008cû^@/×\u0001?Ò\u0083\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cöÉé\u0018Vjá½c\u008f\u0087Þ\u001b ±rÀE\\\u0097ÀæpÈ\u0088\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cö^h/Ò\u00018Ò\u0087¤\u001cv^Gõ\u0019Bê¬¼#\u008d\u008e_\u0014\u0000CÑü£KtÉF-\u0017±é\u001b»j\u008cö^h/Ò\u00018Ò\u0087¤\u001cv^Gï\u0019Qê ¼=\u008d\u0080_\u00121h\u0000CÑá£CtØF8\u0017¶é\u0004»`z\u0090«2Ù\u0090\u000e\u000b<ëme\u0093×Á³ö8&9÷\u008d\u0085\u001aR `R1Êæì7HEï\u0092w ·ñ\u0001\u000f\u009b]ÐjW¸ãÉgç\u008e1Zàá\u0092UEÇw:&\u008eØ\f\u008a~½ê\u0000MÑö£BtÐF-\u0017\u0099é\u001b»i\u008cý^X\u0000SÑç£GtÍF%\u0017¼é »`\u008cë^D/Ë\u0001#Ò\u0087¤\u0012 Yñý\u0083ZTÂ\u0000WÑá£GtÉF<\u0017ºé\u0000~\u0081¯\u0005Ý¢\n:8Úil\u0097ñÅ³ò( ©Q;\u007fÏ9\u0018èº\u009a\u0018M\u0083\u007fc.íÐ_\u0082;µ\u0093g\u0011\u0016\u00978këÒ\u009d_¿\u008bn\u001a\u001c¾Ë\u0014ùÐ¨CVÊ\u0004\u00863\u001fá¢\u0090<Â¯\u0013&a²¶\u001a\u0084ýÕx+Æy§N;\u009c\u0089í.Ãþ\u0010FfÔ´£\u0085\u001aÛ\u0092\u0000sÑö£RtïF%\u0017»é\u0017»j\u008cÙ^O/ò\u00018Ò\u0097¤\u0003voGó\u0019Uê±\u0000gÑö£RtøF(\u0017\u0095é\u0001»j\u008cöã\u00842\u0015@±\u0097\u001b¥Ëô\u007f\nãX\u0083o\u001a½¼Ì4âÄ1bGÝ\u0095\u008d\u0000gÑö£RtøF(\u0017\u0089é\u0013»v\u008cìD/\u0095¾ç\u001a0°\u0002`SÍ\u00adUÿ#Èµ\u001a*k\u0092\u0000gÑö£RtøF(\u0017\u0092é\u0017»q\u008cù\u0000gÑö£RtøF(\u0017\u009eé\u0001»v\u008cý^_[w\u008aæøB/è\u001d8L\u008d²\u0007àt×ë\u0005TtÀZ2\u0000gÑö£RtøF(\u0017\u009eé\u0001»v\u008cý^_/ë\u0001#Ò\u0088ó3\"¢P\u0006\u0087¬µ|äÏ\u001aGH%\u007f\u00ad\u00ad7Ü\u009eòh!ÜK\u009e\u009a\u000fè«?\u0001\rÑ\\b¢êð\u0088Ç\u0000\u0015\u0098d4Õá\u0004pvÔ¡~\u0093®Â\u001d<\u0095n÷Y\u007f\u008bøúJÔ»\u0000gÑö£RtøF(\u0017\u009bé\u0013»q\u008cù^x/Ê\u0001#Ò\u008d¤\u0019vmGÛ\u0019Yê¦¼:\u008d\u008dFO\u0097Íåo2ô\u0000\u0014Q\u0096¯\nýkÊâ\u0018niöG\u0018\u0094§â\u001a0B\u0001ý_u¬\u009cú\u000eË \u0019>wFDü\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0002Ò\u0090¤\u0005vcGó\u0019W¸`iñ\u001bUÌÿþ/¯\u0088Q\u0014\u0003p4þæA\u0097Ê¹\u001fj\u0087\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0007Ò\u008d¤\u0013voGò\u0019bê¦¼2\u008d\u0080_\u000e1j\u0002ÁÔA¥\u009dw)H\u0082\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0014Ò\u008a¤\u0013vIGü\u0019Bê§¼\u0004\u008d\u008c_\u00181f\u0002ÐÔP¥«w/H»\u001aóìxÃ\u0090\u0012\u0001`¥·\u000f\u0085ßÔx*äx\u0080O\u000e\u009d±ì:Âð\u0011zgäµ\u0098\u0084\u0005Ú\u0084)X\u007fÈN}\u009càò\u008b\u0096WGÆ5bâÈÐ\u0018\u0081¿\u007f#-G\u001aÉÈv¹ý\u0097$Dº2#àyÑÌ\u008fr|\u0097*%\u001bµÉ%§\\\u0094ùBv\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0007Ò\u008d¤\u0013voGò\u0019vêª¼:\u008d\u008c_)1}\u0002ÎÔF¥\u0084w2H\u009d\u001aõ\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0001\u0014Ò\u008a¤\u0013vIGü\u0019Bê§¼\u0003\u008d\u009b_\u00101C\u0002ËÔF¥¼\u0000gÑö£RtøF(\u0017\u008fé\u0013»w\u008cù^F/Í\u0000gÑö£RtïF%\u0017»é\u0017»j\u008cÛ^G/×\u00012Ò\u008f¤\u0004vIGñ\u0019Yê ¼=\u008d½_\u00141}\u0002ÍÔ@¥¯w3\u0000gÑö£RtïF%\u0017»é\u0017»j\u008cÛ^G/×\u00012Ò\u008f¤\u0004vIGñ\u0019Yê ¼=\u008d½_\u000e1n\u0002ÁÔ^¥¡w5H\u0089\u001aÍì}½Ô\u008fN\u0000gÑö£RtúF#\u0017²é\u0002»d\u008cö^B/Ñ\u0001?Ò§¤\u001bvcGþ\u0019[ê\u0097¼>\u008d\u009b_\u00131z\u0002ÅÔ]\u0000gÑö£RtúF>\u0017ºé\u0013»q\u008cñ^]/Û\u0001\u0012Ò\u008b¤\u001avzGü\u0019^êª¼9\u008d\u0087_=1k\u0002ÑJ±\u009b é\u0084>&\fô]e£Íñ½Æ+\u0014¾e\u001aKâ\u0098SîÕ<µ\r=S\u0083 f\u0000gÑö£RtïF-\u0017¬é\u0006»D\u008cü^x/Ñ\u0001$Ò\u0096¤\u0014voGÞ\u0019Bê¦¼7\u008d\u009d_\u00151y\u0002ÇÔF\u0000gÑö£RtôF)\u0017»é\u001b»d\u008cÞ^B/Ò\u00014Ò°¤\u0012vrGé\u0000gÑö£RtêF8\u0017¾é\u0006»l\u008cû^y/Û\u0001\"Ò\u008b¤\u0002vxGþ\u0019Uê\u0097¼3\u008d\u0091_\b\u0000gÑö£RtêF8\u0017¾é\u0006»l\u008cû^y/Û\u0001\"Ò\u008b¤\u0002vxGþ\u0019Uê\u0080¼$\u008d\u008c_\u001d1{\u0002ËÔC¥\u00adw\u000fH\u0097\u001añìq¿énx\u001cÜË`ù°¨0V\u008c\u0004û3sá×\u0090s¾\u00adm\u000f\u001b\u0098Éðøz¦ÈU(\u0003«üp-á_E\u0088ùº)ë©\u0015\u0015Gbpê¢NÓÿý\u0007. X4\u008a\\»îås\u0016µ@&q«£9ÍQ%òôc\u0086ÇQoc«2/Ì\u0086\u009eä©d{È\nN$\u0094÷\u0010\u0081\u0090Sþbe<ÖÏ\u0015\u0099±¨\u0019z\u0088\u0014î'^ñÖ\u00808R\u008am\u001a?`Éà\u0000gÑö£RtúF>\u0017ºé\u0013»q\u008cñ^]/Û\u0001\u0001Ò\u0085¤\u0005vkGð\u0019Cê\u0086¼8\u008d\u009f_\u00151}\u0002ÍÔ[¥¥w>H\u0080\u001aõìB½Æ\u008fH`¾".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 2355);
        f1114 = cArr;
        f1116 = 5763815259003539859L;
    }

    public bx(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static List<String> m1230(AdParams adParams) {
        f1115 = (f1113 + SignalKey.EVENT_ID) % 128;
        List<String> endCardUrlList = adParams.getEndCardUrlList();
        f1115 = (f1113 + 75) % 128;
        return endCardUrlList;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m1231(AdParams adParams) {
        int i10 = f1113 + 69;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            adParams.getEndCardRedirectUrl();
            throw null;
        }
        String endCardRedirectUrl = adParams.getEndCardRedirectUrl();
        int i11 = f1113 + SignalKey.EVENT_ID;
        f1115 = i11 % 128;
        if (i11 % 2 == 0) {
            return endCardRedirectUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static List<String> m1232(AdParams adParams) {
        f1115 = (f1113 + 119) % 128;
        List<String> videoClicks = adParams.getVideoClicks();
        f1113 = (f1115 + 3) % 128;
        return videoClicks;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static List<String> m1233(AdParams adParams) {
        int i10 = f1113 + 5;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            adParams.getVideoFileUrlsList();
            throw null;
        }
        List<String> videoFileUrlsList = adParams.getVideoFileUrlsList();
        int i11 = f1113 + 125;
        f1115 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 29 / 0;
        }
        return videoFileUrlsList;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static List<String> m1234(AdParams adParams) {
        f1113 = (f1115 + 125) % 128;
        List<String> endCardClicks = adParams.getEndCardClicks();
        f1115 = (f1113 + 63) % 128;
        return endCardClicks;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1235(AdParams adParams) {
        f1115 = (f1113 + 87) % 128;
        String videoRedirectUrl = adParams.getVideoRedirectUrl();
        int i10 = f1113 + 71;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return videoRedirectUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1236() {
        int i10 = f1115 + 41;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1239();
        }
        m1239();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ List m1241(AdParams adParams) {
        f1113 = (f1115 + 47) % 128;
        List<String> listM1233 = m1233(adParams);
        f1113 = (f1115 + 69) % 128;
        return listM1233;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ List m1243(AdParams adParams) {
        f1113 = (f1115 + 15) % 128;
        List<String> listM1230 = m1230(adParams);
        int i10 = f1115 + 101;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM1230;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1244(Ad ad2, String str) {
        f1113 = (f1115 + 81) % 128;
        String assetUrl = ad2.getAssetUrl(str);
        f1115 = (f1113 + 101) % 128;
        return assetUrl;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ List m1248(AdParams adParams) {
        f1113 = (f1115 + 47) % 128;
        List<String> listM1234 = m1234(adParams);
        int i10 = f1115 + 43;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM1234;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1250(Ad ad2) {
        int i10 = f1113 + 83;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1240(ad2);
        }
        m1240(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1261(Ad ad2) {
        int i10 = f1115 + 3;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1247(ad2);
        }
        m1247(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ b m1274(bx bxVar, VideoAdListener videoAdListener, ch chVar) {
        f1113 = (f1115 + 79) % 128;
        b bVarM1294 = bxVar.m1294(videoAdListener, chVar);
        f1113 = (f1115 + 89) % 128;
        return bVarM1294;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1285(StaticResource staticResource) {
        int i10 = f1115 + 27;
        f1113 = i10 % 128;
        if (i10 % 2 == 0) {
            m1264(staticResource);
            throw null;
        }
        String strM1264 = m1264(staticResource);
        int i11 = f1115 + 3;
        f1113 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 34 / 0;
        }
        return strM1264;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1295(Ad ad2, String str) {
        int i10 = f1113 + 117;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            m1244(ad2, str);
            throw null;
        }
        String strM1244 = m1244(ad2, str);
        f1115 = (f1113 + 117) % 128;
        return strM1244;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static List<AdData> m1238(Ad ad2, String str) {
        f1115 = (f1113 + 27) % 128;
        List<AdData> beacons = ad2.getBeacons(str);
        f1115 = (f1113 + 15) % 128;
        return beacons;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1239() {
        int i10 = f1113 + 83;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            HyBid.getAppToken();
            throw null;
        }
        String appToken = HyBid.getAppToken();
        int i11 = f1115 + 115;
        f1113 = i11 % 128;
        if (i11 % 2 != 0) {
            return appToken;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1242(Ad ad2) {
        f1113 = (f1115 + 83) % 128;
        String vast = ad2.getVast();
        int i10 = f1115 + 55;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return vast;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1245(AdData adData) {
        int i10 = f1115 + 37;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        String url = adData.getURL();
        if (i11 == 0) {
            int i12 = 40 / 0;
        }
        return url;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m1247(Ad ad2) {
        int i10 = f1113 + 113;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            ad2.getZoneId();
            throw null;
        }
        String zoneId = ad2.getZoneId();
        f1115 = (f1113 + 1) % 128;
        return zoneId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1251(AdData adData) {
        f1113 = (f1115 + 83) % 128;
        String strM1284 = m1284(adData);
        int i10 = f1113 + 125;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
        return strM1284;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1263(AdData adData, String str) {
        f1115 = (f1113 + 21) % 128;
        String strM1277 = m1277(adData, str);
        int i10 = f1113 + 81;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1277;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1275(Ad ad2) {
        f1113 = (f1115 + 117) % 128;
        String strM1242 = m1242(ad2);
        int i10 = f1115 + 77;
        f1113 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 0 / 0;
        }
        return strM1242;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1286(CreativeParams creativeParams) {
        int i10 = f1113 + 27;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1299(creativeParams);
        }
        m1299(creativeParams);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1296(AdData adData) {
        int i10 = f1113 + 25;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        String strM1262 = m1262(adData);
        if (i11 != 0) {
            int i12 = 32 / 0;
        }
        int i13 = f1113 + 65;
        f1115 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 46 / 0;
        }
        return strM1262;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m1237(AdParams adParams) {
        int i10 = f1115 + 25;
        f1113 = i10 % 128;
        if (i10 % 2 == 0) {
            adParams.getId();
            throw null;
        }
        String id2 = adParams.getId();
        f1113 = (f1115 + 13) % 128;
        return id2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1240(Ad ad2) {
        f1115 = (f1113 + 61) % 128;
        String creativeId = ad2.getCreativeId();
        f1115 = (f1113 + 3) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1246(AdParams adParams) {
        f1113 = (f1115 + 7) % 128;
        String adParams2 = adParams.getAdParams();
        f1115 = (f1113 + 11) % 128;
        return adParams2;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdData m1249(Ad ad2, String str) {
        f1115 = (f1113 + SignalKey.EVENT_ID) % 128;
        AdData asset = ad2.getAsset(str);
        f1115 = (f1113 + 15) % 128;
        return asset;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1252(MediaFile mediaFile) {
        int i10 = f1115 + 65;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        String strM1297 = m1297(mediaFile);
        if (i11 == 0) {
            int i12 = 36 / 0;
        }
        return strM1297;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m1266(AdParams adParams) {
        f1115 = (f1113 + 81) % 128;
        List<String> listM1232 = m1232(adParams);
        int i10 = f1113 + 113;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
        }
        return listM1232;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1276(AdData adData) {
        int i10 = f1113 + 45;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        String strM1245 = m1245(adData);
        if (i11 != 0) {
            int i12 = 50 / 0;
        }
        return strM1245;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1287(AdParams adParams) {
        int i10 = f1115 + 61;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        String strM1237 = m1237(adParams);
        if (i11 == 0) {
            int i12 = 92 / 0;
        }
        return strM1237;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1300(AdParams adParams) {
        int i10 = f1115 + 29;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        String strM1246 = m1246(adParams);
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
        int i13 = f1113 + 7;
        f1115 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 23 / 0;
        }
        return strM1246;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1253(StaticResource staticResource) {
        int i10 = f1115 + 125;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1298(staticResource);
        }
        m1298(staticResource);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdData m1267(Ad ad2, String str) {
        f1115 = (f1113 + 77) % 128;
        AdData adDataM1279 = m1279(ad2, str);
        int i10 = f1113 + 85;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return adDataM1279;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1278(AdParams adParams) {
        f1113 = (f1115 + 45) % 128;
        String strM1231 = m1231(adParams);
        f1115 = (f1113 + 119) % 128;
        return strM1231;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m1288(Ad ad2, String str) {
        int i10 = f1113 + 9;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1238(ad2, str);
        }
        m1238(ad2, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1306(VideoAd videoAd) {
        int i10 = f1115 + 95;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM1273 = m1273(videoAd);
        if (i11 == 0) {
            int i12 = 53 / 0;
        }
        return zM1273;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1254(CreativeParams creativeParams) {
        f1113 = (f1115 + 63) % 128;
        String strM1265 = m1265(creativeParams);
        int i10 = f1115 + 41;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1265;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ClickThrough m1268(VideoClicks videoClicks) {
        f1115 = (f1113 + SignalKey.EVENT_ID) % 128;
        ClickThrough clickThroughM1301 = m1301(videoClicks);
        int i10 = f1115 + 25;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return clickThroughM1301;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1281(Wrapper wrapper) {
        int i10 = f1115 + 65;
        f1113 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creativesM1303 = m1303(wrapper);
        if (i11 == 0) {
            int i12 = 7 / 0;
        }
        f1115 = (f1113 + 73) % 128;
        return creativesM1303;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m1289(VideoClicks videoClicks) {
        f1115 = (f1113 + 95) % 128;
        List<ClickTracking> listM1256 = m1256(videoClicks);
        f1113 = (f1115 + 119) % 128;
        return listM1256;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(m1283(1264 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 11 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    return VideoAdView.class;
                }
                return null;
            case -2101083431:
                if (str.equals(m1283(1544 - View.MeasureSpec.getMode(0), (char) (Color.green(0) + 9840), TextUtils.getTrimmedLength("") + 6).intern())) {
                    return InLine.class;
                }
                return null;
            case -2095699225:
                if (!str.equals(m1283((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 642, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23).intern())) {
                    return null;
                }
                break;
            case -2049897434:
                if (str.equals(m1283(1426 - MotionEvent.axisFromString(""), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 21450), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    return VideoClicks.class;
                }
                return null;
            case -2030915791:
                if (str.equals(m1283(1031 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 61).intern())) {
                    return VastRewardedActivity.class;
                }
                return null;
            case -2022878658:
                if (str.equals(m1283(44 - KeyEvent.normalizeMetaState(0), (char) (Process.myPid() >> 22), 14 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return RequestManager.class;
                }
                return null;
            case -1973009238:
                if (str.equals(m1283(1549 - TextUtils.indexOf((CharSequence) "", '0'), (char) (59066 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern())) {
                    return VastAdSource.class;
                }
                return null;
            case -1867123455:
                if (str.equals(m1283(947 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 62 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    return HyBidRewardedActivity.class;
                }
                return null;
            case -1758764491:
                if (str.equals(m1283((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1617, (char) (14683 - Color.green(0)), ExpandableListView.getPackedPositionChild(0L) + 15).intern())) {
                    return CreativeParams.class;
                }
                return null;
            case -1741983831:
                if (str.equals(m1283(1384 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (59392 - ((byte) KeyEvent.getModifierMetaStateMask())), (Process.myPid() >> 22) + 8).intern())) {
                    return AdParams.class;
                }
                return null;
            case -1692490108:
                if (str.equals(m1283(ExpandableListView.getPackedPositionGroup(0L) + 1535, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 31444), 9 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return Creatives.class;
                }
                return null;
            case -1668741680:
                if (str.equals(m1283(358 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) KeyEvent.getDeadChar(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 25).intern())) {
                    return VastInterstitialPresenter.class;
                }
                return null;
            case -1474059205:
                if (str.equals(m1283(Color.red(0) + 1233, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 51636), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    return PNWebView.class;
                }
                return null;
            case -1454339106:
                if (str.equals(m1283((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 227, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20028), View.MeasureSpec.makeMeasureSpec(0, 0) + 32).intern())) {
                    return HyBidInterstitialBroadcastSender.class;
                }
                return null;
            case -1305745411:
                if (str.equals(m1283(804 - Color.argb(0, 0, 0, 0), (char) Color.blue(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16).intern())) {
                    return HyBidRewardedAd.class;
                }
                return null;
            case -1042733280:
                if (str.equals(m1283(58 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14).intern())) {
                    return AdSourceConfig.class;
                }
                return null;
            case -1040143378:
                if (str.equals(m1283(Color.argb(0, 0, 0, 0) + 129, (char) ExpandableListView.getPackedPositionGroup(0L), 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    return MraidAdPresenter.class;
                }
                return null;
            case -1034806157:
                if (str.equals(m1283(Color.green(0) + 1599, (char) (Process.getGidForName("") + 1), (KeyEvent.getMaxKeyCode() >> 16) + 7).intern())) {
                    return Wrapper.class;
                }
                return null;
            case -1007287447:
                if (str.equals(m1283(1011 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) Color.alpha(0), Color.red(0) + 21).intern())) {
                    return HyBidRewardedActivity.class;
                }
                return null;
            case -917597044:
                if (str.equals(m1283(480 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (2967 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "", 0) + 70).intern())) {
                    return MraidInterstitialActivity.class;
                }
                return null;
            case -889171374:
                if (str.equals(m1283(549 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (45051 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getTrimmedLength("") + 25).intern())) {
                    return MraidInterstitialActivity.class;
                }
                return null;
            case -844922724:
                if (str.equals(m1283(731 - View.MeasureSpec.getSize(0), (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9).intern())) {
                    return MRAIDView.class;
                }
                return null;
            case -801627293:
                if (str.equals(m1283(758 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 11 - (Process.myPid() >> 22)).intern())) {
                    return MRAIDBanner.class;
                }
                return null;
            case -747024196:
                if (str.equals(m1283(TextUtils.getTrimmedLength("") + 849, (char) (View.resolveSizeAndState(0, 0, 0) + 42700), 28 - Color.argb(0, 0, 0, 0)).intern())) {
                    return HyBidRewardedBroadcastSender.class;
                }
                return null;
            case -729230458:
                if (str.equals(m1283(1276 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 13 - TextUtils.indexOf("", "")).intern())) {
                    return VastProcessor.class;
                }
                return null;
            case -709708726:
                if (str.equals(m1283(72 - (Process.myPid() >> 22), (char) ExpandableListView.getPackedPositionType(0L), (KeyEvent.getMaxKeyCode() >> 16) + 13).intern())) {
                    return HyBidAdSource.class;
                }
                return null;
            case -617879491:
                if (!str.equals(m1283(Gravity.getAbsoluteGravity(0, 0) + 1438, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), KeyEvent.normalizeMetaState(0) + 12).intern())) {
                    return null;
                }
                f1113 = (f1115 + 81) % 128;
                return ClickThrough.class;
            case -594285390:
                if (str.equals(m1283(1249 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), View.getDefaultSize(0, 0) + 15).intern())) {
                    return VideoAdListener.class;
                }
                return null;
            case -589715152:
                if (str.equals(m1283((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1186, (char) (jl.c.f100601g - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20).intern())) {
                    return PNAPIContentInfoView.class;
                }
                return null;
            case -587420703:
                if (str.equals(m1283(View.MeasureSpec.getMode(0) + 1606, (char) (32471 - (Process.myTid() >> 22)), 12 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    return VASTAdTagURI.class;
                }
                return null;
            case -567645543:
                if (str.equals(m1283(KeyEvent.getDeadChar(0, 0) + 1148, (char) (ViewConfiguration.getTapTimeout() >> 16), 22 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return HyBidLeaderboardAdView.class;
                }
                return null;
            case -520974940:
                if (!str.equals(m1283(679 - TextUtils.indexOf((CharSequence) "", '0'), (char) (6292 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return null;
                }
                f1113 = (f1115 + 53) % 128;
                return AdResponse.class;
            case -514201671:
                if (str.equals(m1283(144 - Process.getGidForName(""), (char) Drawable.resolveOpacity(0, 0), 15 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    return VastAdPresenter.class;
                }
                return null;
            case -385055469:
                if (str.equals(m1283(1571 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 10 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return MediaFiles.class;
                }
                return null;
            case -348198615:
                if (str.equals(m1283(1483 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 21).intern())) {
                    return CompanionClickThrough.class;
                }
                return null;
            case -242952691:
                if (str.equals(m1283(258 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 45017), 16 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    return PNInterstitialAd.class;
                }
                return null;
            case -232966702:
                if (!str.equals(m1283(TextUtils.indexOf("", "") + 690, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 15 - View.combineMeasuredStates(0, 0)).intern())) {
                    return null;
                }
                int i10 = f1113 + 15;
                f1115 = i10 % 128;
                if (i10 % 2 != 0) {
                    return UserDataManager.class;
                }
                return AdvertisingInfo.class;
            case -217201711:
                if (str.equals(m1283((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1325, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.B).intern())) {
                    return HyBidRewardedAd.Listener.class;
                }
                return null;
            case -205981873:
                if (str.equals(m1283(TextUtils.indexOf("", "", 0) + 1288, (char) (33614 - Color.red(0)), 10 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return PlayerInfo.class;
                }
                return null;
            case -150968480:
                if (str.equals(m1283(((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.E, (char) (12567 - Color.argb(0, 0, 0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 10).intern())) {
                    return MediaFile.class;
                }
                return null;
            case -133293208:
                if (!str.equals(m1283(1348 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 19).intern())) {
                    return null;
                }
                int i11 = f1113 + 67;
                f1115 = i11 % 128;
                if (i11 % 2 != 0) {
                    return VideoAdController.class;
                }
                return HyBidAdView.Listener.class;
            case -114588646:
                if (str.equals(m1283(1410 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 17 - View.combineMeasuredStates(0, 0)).intern())) {
                    return VideoAdController.class;
                }
                return null;
            case CastStatusCodes.ERROR_DEVICE_ID_FLAGS_NOT_SET /* 2115 */:
                if (!str.equals(m1283((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + TTAdConstant.STYLE_SIZE_RADIO_2_3, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 7764), View.MeasureSpec.getSize(0) + 2).intern())) {
                    return null;
                }
                int i12 = f1115 + 53;
                f1113 = i12 % 128;
                if (i12 % 2 == 0) {
                    return AdData.class;
                }
                return Ad.class;
            case 2658924:
                if (str.equals(m1283(AndroidCharacter.getMirror('0') + 1547, (char) (KeyEvent.keyCodeFromString("") + 8207), (Process.myTid() >> 22) + 4).intern())) {
                    return Vast.class;
                }
                return null;
            case 22955995:
                if (str.equals(m1283(View.MeasureSpec.makeMeasureSpec(0, 0) + 1220, (char) (ExpandableListView.getPackedPositionChild(0L) + 4675), KeyEvent.keyCodeFromString("") + 13).intern())) {
                    return PNMRectAdView.class;
                }
                return null;
            case 63078110:
                if (str.equals(m1283((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 675, (char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myTid() >> 22) + 5).intern())) {
                    return AdExt.class;
                }
                return null;
            case 70165004:
                if (!str.equals(m1283(ViewConfiguration.getTouchSlop() >> 8, (char) (22024 - Process.getGidForName("")), View.combineMeasuredStates(0, 0) + 5).intern())) {
                    return null;
                }
                f1115 = (f1113 + 35) % 128;
                return HyBid.class;
            case 152629510:
                if (str.equals(m1283((ViewConfiguration.getScrollBarSize() >> 8) + 1112, (char) View.resolveSize(0, 0), (Process.myPid() >> 22) + 8).intern())) {
                    return PNAdView.class;
                }
                return null;
            case 254077974:
                if (str.equals(m1283(768 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Color.red(0) + 46377), 20 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    return AdPresenterDecorator.class;
                }
                return null;
            case 271735736:
                if (str.equals(m1283(ExpandableListView.getPackedPositionType(0L) + 12, (char) (22584 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    return UserDataManager.class;
                }
                return null;
            case 282218207:
                if (str.equals(m1283(275 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (49290 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 29 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    return InterstitialPresenterDecorator.class;
                }
                return null;
            case 287435653:
                if (str.equals(m1283(160 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.getOffsetAfter("", 0) + 14).intern())) {
                    return BrowserManager.class;
                }
                return null;
            case 353872196:
                if (str.equals(m1283((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, (char) (61131 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 17).intern())) {
                    return ImpressionManager.class;
                }
                return null;
            case 378666444:
                if (str.equals(m1283(View.getDefaultSize(0, 0) + 85, (char) (12059 - (ViewConfiguration.getTapTimeout() >> 16)), 15 - KeyEvent.normalizeMetaState(0)).intern())) {
                    return VastTagAdSource.class;
                }
                return null;
            case 424904237:
                if (str.equals(m1283(1440 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17).intern())) {
                    return ViewControllerVast.class;
                }
                return null;
            case 441957133:
                if (str.equals(m1283(TextUtils.lastIndexOf("", '0') + 1171, (char) Color.blue(0), 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    return HyBidMRectAdView.class;
                }
                return null;
            case 476474561:
                if (str.equals(m1283(TextUtils.indexOf("", "", 0, 0) + 384, (char) (26285 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 70 - KeyEvent.normalizeMetaState(0)).intern())) {
                    return HyBidInterstitialActivity.class;
                }
                return null;
            case 482776408:
                if (str.equals(m1283(193 - Color.red(0), (char) (View.resolveSizeAndState(0, 0, 0) + 48599), (ViewConfiguration.getEdgeSlop() >> 16) + 34).intern())) {
                    return HyBidInterstitialBroadcastReceiver.class;
                }
                return null;
            case 485976319:
                if (str.equals(m1283(5 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (5908 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0') + 8).intern())) {
                    return AdCache.class;
                }
                return null;
            case 504900231:
                if (str.equals(m1283(454 - View.MeasureSpec.getSize(0), (char) (108 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    return HyBidInterstitialActivity.class;
                }
                return null;
            case 591135468:
                if (str.equals(m1283(1463 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - (Process.myTid() >> 22)).intern())) {
                    return Companion.class;
                }
                return null;
            case 606183598:
                if (str.equals(m1283(306 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 4038), 28 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    return InterstitialPresenterFactory.class;
                }
                return null;
            case 676623548:
                if (str.equals(m1283(View.getDefaultSize(0, 0) + 1581, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 14 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return StaticResource.class;
                }
                return null;
            case 767767497:
                if (str.equals(m1283((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1093, (char) View.getDefaultSize(0, 0), 20 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    return VastRewardedActivity.class;
                }
                return null;
            case 789926062:
                if (str.equals(m1283(107 - TextUtils.getCapsMode("", 0, 0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 22 - (Process.myTid() >> 22)).intern())) {
                    return BannerPresenterFactory.class;
                }
                return null;
            case 862687632:
                if (str.equals(m1283(903 - (Process.myTid() >> 22), (char) View.resolveSize(0, 0), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return RewardedPresenterFactory.class;
                }
                return null;
            case 956069326:
                if (str.equals(m1283(723 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (23635 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), AndroidCharacter.getMirror('0') - ')').intern())) {
                    return VASTtag.class;
                }
                return null;
            case 1002796579:
                if (!str.equals(m1283(TextUtils.getTrimmedLength("") + 100, (char) ExpandableListView.getPackedPositionGroup(0L), (Process.myTid() >> 22) + 7).intern())) {
                    return null;
                }
                f1113 = (f1115 + 53) % 128;
                return Auction.class;
            case 1044987291:
                if (str.equals(m1283(TextUtils.indexOf("", "", 0, 0) + 174, (char) (13885 - View.MeasureSpec.getMode(0)), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    return HyBidInterstitialAd.class;
                }
                return null;
            case 1150879268:
                if (str.equals(m1283(Drawable.resolveOpacity(0, 0) + 1472, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51626), Drawable.resolveOpacity(0, 0) + 12).intern())) {
                    return CompanionAds.class;
                }
                return null;
            case 1164559907:
                if (str.equals(m1283(740 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) + 17).intern())) {
                    return MRAIDInterstitial.class;
                }
                return null;
            case 1199380782:
                if (str.equals(m1283(KeyEvent.keyCodeFromString("") + 927, (char) (38972 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20).intern())) {
                    return VastRewardedPresenter.class;
                }
                return null;
            case 1228519789:
                if (!str.equals(m1283(573 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.red(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 68).intern())) {
                    return null;
                }
                break;
            case 1241891335:
                if (str.equals(m1283((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 705, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38036), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 18).intern())) {
                    return RemoteConfigAppInfo.class;
                }
                return null;
            case 1250739860:
                if (str.equals(m1283(1120 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.indexOf("", "", 0), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    return HyBidAdView.class;
                }
                return null;
            case 1296210799:
                if (!str.equals(m1283(1298 - Color.red(0), (char) (KeyEvent.getDeadChar(0, 0) + 15274), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27).intern())) {
                    return null;
                }
                int i13 = f1115 + 5;
                f1113 = i13 % 128;
                if (i13 % 2 != 0) {
                    return HyBidInterstitialAd.Listener.class;
                }
                return ImpressionManager.class;
            case 1373883333:
                if (str.equals(m1283(333 - Drawable.resolveOpacity(0, 0), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26).intern())) {
                    return MraidInterstitialPresenter.class;
                }
                return null;
            case 1402445010:
                if (str.equals(m1283(1206 - (Process.myPid() >> 22), (char) (16976 - TextUtils.indexOf("", "", 0, 0)), Color.green(0) + 14).intern())) {
                    return PNBannerAdView.class;
                }
                return null;
            case 1506578400:
                if (str.equals(m1283((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1131, (char) (ExpandableListView.getPackedPositionGroup(0L) + 21688), 16 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    return HyBidBannerAdView.class;
                }
                return null;
            case 1521679714:
                if (str.equals(m1283(788 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (Color.green(0) + 59627), 16 - Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    return PresenterFactory.class;
                }
                return null;
            case 1607572150:
                if (str.equals(m1283(820 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 29 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return HyBidRewardedBroadcastReceiver.class;
                }
                return null;
            case 1877773523:
                if (str.equals(m1283(1505 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22).intern())) {
                    return CompanionClickTracking.class;
                }
                return null;
            case 1885066191:
                if (str.equals(m1283((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1527, (char) (ViewConfiguration.getEdgeSlop() >> 16), 8 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return Creative.class;
                }
                return null;
            case 1955369613:
                if (!str.equals(m1283(669 - Gravity.getAbsoluteGravity(0, 0), (char) (43143 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 6).intern())) {
                    return null;
                }
                int i14 = f1113 + 43;
                f1115 = i14 % 128;
                if (i14 % 2 != 0) {
                    return VastTagAdSource.class;
                }
                return AdData.class;
            case 1969459009:
                if (str.equals(m1283(877 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 26).intern())) {
                    return RewardedPresenterDecorator.class;
                }
                return null;
            case 2079062148:
                if (str.equals(m1283(Gravity.getAbsoluteGravity(0, 0) + 1367, (char) ((-16777216) - Color.rgb(0, 0, 0)), 18 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    return b.class;
                }
                return null;
            case 2107600959:
                if (str.equals(m1283((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1450, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12).intern())) {
                    return ClickTracking.class;
                }
                return null;
            case 2117435870:
                if (str.equals(m1283(1241 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Color.rgb(0, 0, 0) + 16777216), '7' - AndroidCharacter.getMirror('0')).intern())) {
                    return VideoAd.class;
                }
                return null;
            default:
                return null;
        }
        f1113 = (f1115 + 71) % 128;
        return VastInterstitialActivity.class;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1255(AdParams adParams) {
        int i10 = f1113 + 85;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            m1235(adParams);
            throw null;
        }
        String strM1235 = m1235(adParams);
        f1113 = (f1115 + SignalKey.EVENT_ID) % 128;
        return strM1235;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdParams m1271(VideoAdController videoAdController) {
        f1113 = (f1115 + 75) % 128;
        AdParams adParamsM1304 = m1304(videoAdController);
        int i10 = f1115 + 35;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return adParamsM1304;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdData m1279(Ad ad2, String str) {
        int i10 = f1113 + 69;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return ad2.getMeta(str);
        }
        ad2.getMeta(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CompanionAds m1290(Creative creative) {
        int i10 = f1113 + 33;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        CompanionAds companionAdsM1258 = m1258(creative);
        if (i11 != 0) {
            int i12 = 22 / 0;
        }
        f1113 = (f1115 + 69) % 128;
        return companionAdsM1258;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdData m1257(Ad ad2, String str) {
        int i10 = f1113 + 15;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            m1249(ad2, str);
            throw null;
        }
        AdData adDataM1249 = m1249(ad2, str);
        int i11 = f1115 + 73;
        f1113 = i11 % 128;
        if (i11 % 2 != 0) {
            return adDataM1249;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1272(VideoAd videoAd, VideoAdListener videoAdListener) {
        f1115 = (f1113 + 109) % 128;
        m1282(videoAd, videoAdListener);
        f1115 = (f1113 + 67) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1277(AdData adData, String str) {
        int i10 = f1115 + 35;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return adData.getStringField(str);
        }
        adData.getStringField(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CompanionClickThrough m1291(Companion companion) {
        f1115 = (f1113 + 9) % 128;
        CompanionClickThrough companionClickThroughM1280 = m1280(companion);
        int i10 = f1113 + 121;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return companionClickThroughM1280;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1259(VastAdSource vastAdSource) {
        f1115 = (f1113 + 65) % 128;
        Creatives creativesM1269 = m1269(vastAdSource);
        int i10 = f1115 + 55;
        f1113 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
        }
        return creativesM1269;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1282(VideoAd videoAd, VideoAdListener videoAdListener) {
        f1115 = (f1113 + 103) % 128;
        videoAd.setAdListener(videoAdListener);
        f1113 = (f1115 + 79) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Creatives m1292(InLine inLine) {
        f1113 = (f1115 + 9) % 128;
        Creatives creativesM1302 = m1302(inLine);
        int i10 = f1113 + 93;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 53 / 0;
        }
        return creativesM1302;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        int i10 = f1115 + 71;
        f1113 = i10 % 128;
        if (i10 % 2 == 0) {
            HyBid.getHyBidVersion();
            throw null;
        }
        String hyBidVersion = HyBid.getHyBidVersion();
        f1115 = (f1113 + 41) % 128;
        return hyBidVersion;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ VASTAdTagURI m1260(Wrapper wrapper) {
        f1113 = (f1115 + 21) % 128;
        VASTAdTagURI vASTAdTagURIM1270 = m1270(wrapper);
        f1115 = (f1113 + 37) % 128;
        return vASTAdTagURIM1270;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m1273(VideoAd videoAd) {
        f1115 = (f1113 + 71) % 128;
        boolean zIsRewarded = videoAd.isRewarded();
        int i10 = f1113 + 13;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 76 / 0;
        }
        return zIsRewarded;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static CompanionClickThrough m1280(Companion companion) {
        f1113 = (f1115 + 97) % 128;
        CompanionClickThrough companionClickThrough = companion.getCompanionClickThrough();
        int i10 = f1115 + 95;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return companionClickThrough;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1293(Ad ad2) {
        int i10 = f1113 + 33;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1305(ad2);
        }
        m1305(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1262(AdData adData) {
        int i10 = f1113 + 95;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return adData.getJS();
        }
        adData.getJS();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1284(AdData adData) {
        int i10 = f1113 + 111;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        String html = adData.getHtml();
        if (i11 != 0) {
            int i12 = 46 / 0;
        }
        f1113 = (f1115 + 81) % 128;
        return html;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1283(1632 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (49132 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1236();
            }
        });
        map.put(m1283(TextUtils.indexOf("", "") + 1643, (char) (49863 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return Boolean.valueOf(bx.m1306((VideoAd) list.get(0)));
            }
        });
        map.put(m1283((ViewConfiguration.getJumpTapTimeout() >> 16) + 1660, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bx.m1272((VideoAd) list.get(0), (VideoAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1283(1726 - AndroidCharacter.getMirror('0'), (char) ExpandableListView.getPackedPositionType(0L), 9 - View.resolveSize(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.35
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1293((Ad) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1687, (char) (58339 - (ViewConfiguration.getEdgeSlop() >> 16)), 15 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.32
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1250((Ad) list.get(0));
            }
        });
        map.put(m1283(1702 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.31
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1275((Ad) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1711, (char) (17480 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.getDefaultSize(0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.39
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1261((Ad) list.get(0));
            }
        });
        map.put(m1283(Color.argb(0, 0, 0, 0) + IronSourceConstants.errorCode_TEST_SUITE_DISABLED, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 8 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.40
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1267((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1283((Process.myTid() >> 22) + 1731, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.38
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1257((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1283((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1740, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 23312), 12 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1288((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1283((KeyEvent.getMaxKeyCode() >> 16) + 1753, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 13 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1295((Ad) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1283(Process.getGidForName("") + 1767, (char) (62292 - (Process.myTid() >> 22)), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1251((AdData) list.get(0));
            }
        });
        map.put(m1283((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1779, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 19449), 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1296((AdData) list.get(0));
            }
        });
        map.put(m1283(1790 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (54661 - Process.getGidForName("")), View.MeasureSpec.getMode(0) + 12).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1276((AdData) list.get(0));
            }
        });
        map.put(m1283(1802 - Drawable.resolveOpacity(0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.getMode(0) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1263((AdData) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1283(1822 - TextUtils.indexOf("", "", 0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 17964), 22 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1274(bx.this, (VideoAdListener) list.get(0), chVar);
            }
        });
        map.put(m1283(ExpandableListView.getPackedPositionGroup(0L) + 1845, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 17 - Color.blue(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1300((AdParams) list.get(0));
            }
        });
        map.put(m1283(TextUtils.getOffsetBefore("", 0) + 1862, (char) (47111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1287((AdParams) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1875, (char) ('0' - AndroidCharacter.getMirror('0')), 27 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1255((AdParams) list.get(0));
            }
        });
        map.put(m1283(1901 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 29 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1278((AdParams) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1930, (char) (50167 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1266((AdParams) list.get(0));
            }
        });
        map.put(m1283(KeyEvent.getDeadChar(0, 0) + 1953, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 38448), 23 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1248((AdParams) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1977, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1241((AdParams) list.get(0));
            }
        });
        map.put(m1283(2005 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1243((AdParams) list.get(0));
            }
        });
        map.put(m1283(2031 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1271((VideoAdController) list.get(0));
            }
        });
        map.put(m1283(2041 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1268((VideoClicks) list.get(0));
            }
        });
        map.put(m1283(2067 - Color.blue(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 31).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1289((VideoClicks) list.get(0));
            }
        });
        map.put(m1283(2099 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1291((Companion) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2121, (char) (Process.myPid() >> 22), Color.red(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.25
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1290((Creative) list.get(0));
            }
        });
        map.put(m1283(2145 - ExpandableListView.getPackedPositionGroup(0L), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 19158), View.MeasureSpec.getSize(0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1292((InLine) list.get(0));
            }
        });
        map.put(m1283(2163 - TextUtils.indexOf("", "", 0), (char) (Color.rgb(0, 0, 0) + 16777216), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1259((VastAdSource) list.get(0));
            }
        });
        map.put(m1283(2187 - Color.red(0), (char) View.getDefaultSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.28
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1252((MediaFile) list.get(0));
            }
        });
        map.put(m1283((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + CastStatusCodes.ERROR_STOPPING_SERVICE_FAILED, (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.27
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1253((StaticResource) list.get(0));
            }
        });
        map.put(m1283(TextUtils.getOffsetBefore("", 0) + 2224, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-16777187) - Color.rgb(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.30
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1285((StaticResource) list.get(0));
            }
        });
        map.put(m1283((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2252, (char) (Color.blue(0) + 49038), 19 - View.resolveSizeAndState(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.29
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1281((Wrapper) list.get(0));
            }
        });
        map.put(m1283((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2272, (char) (ExpandableListView.getPackedPositionGroup(0L) + 64535), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.26
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1260((Wrapper) list.get(0));
            }
        });
        map.put(m1283(KeyEvent.normalizeMetaState(0) + 2294, (char) (TextUtils.lastIndexOf("", '0') + 9622), TextUtils.indexOf("", "") + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.33
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1254((CreativeParams) list.get(0));
            }
        });
        map.put(m1283(View.resolveSizeAndState(0, 0, 0) + 2323, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 32 - View.MeasureSpec.getMode(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.34
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bx.m1286((CreativeParams) list.get(0));
            }
        });
        f1115 = (f1113 + 3) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Creatives m1269(VastAdSource vastAdSource) {
        f1115 = (f1113 + 51) % 128;
        Creatives creatives = vastAdSource.getCreatives();
        int i10 = f1115 + 55;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1283(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1114[i10 + i12]) ^ (((long) i12) * f1116)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1264(StaticResource staticResource) {
        f1113 = (f1115 + 15) % 128;
        String creativeType = staticResource.getCreativeType();
        f1115 = (f1113 + 43) % 128;
        return creativeType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static VASTAdTagURI m1270(Wrapper wrapper) {
        int i10 = f1113 + 119;
        f1115 = i10 % 128;
        if (i10 % 2 != 0) {
            wrapper.getVastAdTagURI();
            throw null;
        }
        VASTAdTagURI vastAdTagURI = wrapper.getVastAdTagURI();
        int i11 = f1115 + 119;
        f1113 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 82 / 0;
        }
        return vastAdTagURI;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1265(CreativeParams creativeParams) {
        int i10 = f1113 + 33;
        f1115 = i10 % 128;
        if (i10 % 2 == 0) {
            return creativeParams.getCreativeData();
        }
        creativeParams.getCreativeData();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<ClickTracking> m1256(VideoClicks videoClicks) {
        f1113 = (f1115 + 13) % 128;
        List<ClickTracking> clickTrackingList = videoClicks.getClickTrackingList();
        f1113 = (f1115 + 77) % 128;
        return clickTrackingList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static CompanionAds m1258(Creative creative) {
        f1115 = (f1113 + 75) % 128;
        CompanionAds companionAds = creative.getCompanionAds();
        int i10 = f1115 + 79;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return companionAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m1305(Ad ad2) {
        int i10 = f1115 + 39;
        f1113 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                JSONObject json = ad2.toJson();
                int i11 = f1113 + 71;
                f1115 = i11 % 128;
                if (i11 % 2 == 0) {
                    return json;
                }
                throw null;
            }
            ad2.toJson();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private b m1294(VideoAdListener videoAdListener, ch chVar) {
        b bVar = new b(videoAdListener, chVar);
        f1113 = (f1115 + 113) % 128;
        return bVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdParams m1304(VideoAdController videoAdController) {
        f1113 = (f1115 + 11) % 128;
        AdParams adParams = videoAdController.getAdParams();
        f1115 = (f1113 + 91) % 128;
        return adParams;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ClickThrough m1301(VideoClicks videoClicks) {
        f1115 = (f1113 + 65) % 128;
        ClickThrough clickThrough = videoClicks.getClickThrough();
        f1115 = (f1113 + 71) % 128;
        return clickThrough;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Creatives m1302(InLine inLine) {
        f1115 = (f1113 + 81) % 128;
        Creatives creatives = inLine.getCreatives();
        int i10 = f1115 + 59;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1297(MediaFile mediaFile) {
        f1113 = (f1115 + 85) % 128;
        String text = mediaFile.getText();
        int i10 = f1115 + 35;
        f1113 = i10 % 128;
        if (i10 % 2 != 0) {
            return text;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1298(StaticResource staticResource) {
        f1115 = (f1113 + 125) % 128;
        String text = staticResource.getText();
        f1115 = (f1113 + 23) % 128;
        return text;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Creatives m1303(Wrapper wrapper) {
        int i10 = f1113 + 3;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        Creatives creatives = wrapper.getCreatives();
        if (i11 != 0) {
            int i12 = 47 / 0;
        }
        int i13 = f1115 + 63;
        f1113 = i13 % 128;
        if (i13 % 2 != 0) {
            return creatives;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1299(CreativeParams creativeParams) {
        int i10 = f1113 + 69;
        f1115 = i10 % 128;
        int i11 = i10 % 2;
        String environmentVars = creativeParams.getEnvironmentVars();
        if (i11 != 0) {
            int i12 = 98 / 0;
        }
        f1115 = (f1113 + 3) % 128;
        return environmentVars;
    }
}
