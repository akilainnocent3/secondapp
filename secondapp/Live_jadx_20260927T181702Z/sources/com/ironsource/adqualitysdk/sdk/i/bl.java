package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.google.android.gms.cast.CastStatusCodes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import f2.h0;
import io.bidmachine.AdContentType;
import io.bidmachine.AdFullScreenListener;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdView;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.CreativeFormat;
import io.bidmachine.FullScreenAd;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.view.MediaView;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r7.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bl extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f858 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f859 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f860 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f861;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("Q^\u001esÏ:¼ÖmàÚ\u008f\u008a4{\u0014(S\u0099ûF²6!\u0000AOK\u009e\u001díâ<Ò\u008b\u009fÛ\u007f*'y\fÈó\u0017¯gu¶QêÜ¥Öt\u0087\u0007yÖRa\u00061ëÀµ\u0093\u009c\u0000AOK\u009e\bíä<Ø\u008b\u008eÛuvB9Hè\u001b\u009bûJÓý\u0084\u00adJ\\)\u000f\t¾Áa°\u0011hÀ{s\t\"âÕ¶\u0084\u00964rç(\u0096\f\u0000AOK\u009e\u0012íä<Ï\u008b\u009fÛ\u007f*'y\u001dÈÕØA\u0097KF\f5èäÍS\u009e\u0003\u007fò:¡\f#!l+½lÎ\u0088\u001f\u00ad¨þø\u001f\tZZlë\u00974×D\u0017\u00955&nw\u0097\u0080ÕÑõa\r²]\u0000AOK\u009e-íÙ<Å\u008b\u009bÛ\u007f\u0000AOK\u009e\bíä<Ù\u008b\u009c\u0000BON\u009e0íã<Ù\u008b\u0099ÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011ù;¶7gI\u0014\u009aÅ rà\"5ÓY\u0080d1©\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTð£ ò\u009eBq\u0091+à\u000f/\u0082~\u0099Îk\u001dWl\u0006»ò\n´Y£©Mø6Gõ\u0000BOF\u009e:íÀ<Ý\u008b\u0088Ûr* y\u0016ÈÂÂ«\u008d¯\\Ó/)þ4Ia\u0019\u009bèÉ»ÿ\n+Õ~¥\u0088o¥ »ñÝ\u0082\nS.äd´\u008aEÊ\u0016Ø§.xB\b\u008eÙ³jñoã èñ\u0095\u0082@Ssä\u0005´ÑE\u0097\u0016³\u0000IOA\u009e*íè<Î\u008b\u0098Ûn* y\fÈÎ\u0017·gi¶u\u0005\u0007ð£¿«nÀ\u001d\u0002Ì${r+\u0084ÚÊ\u0089æ8$ç]\u0097\u0083F\u0092õà¤\u000bS_\u0002\u007f²\u009baÁ\u0010å\u0000FOZ\u009e2íá<ï\u008b\u0088Ûh*,y\u001dÈÉ\u0017\u0097gac¯,¨ýØ\u008e\u0006_?èH¸\u008bIØ\u001aÿ«1t`\u0004\u009eÕ¦fäÒÄ\u009dÃL³?mîTY4\túø¥«\u0086\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ë\u0000NON\u009e*íä<Ê\u008b\u008eÛ[*-\u0000NON\u009e*íä<Ê\u008b\u008eÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011zª5ªäÎ\u0097\u0000F.ñj¡³PÈ\u0003ø²*mS\u001d·Ì¹\u007fâ.\u0001&ZiB¸!Ëä\u001aÆ\u00ad\u0087ýw\f%_1îËè\\§Dv'\u0005âÔÀc\u00813qÂ#\u0091: Àÿ«\u008f\u007f^_í\u0003¼ùK½¿\u0014ð\u0000!{R£\u0083·4Èd8\u0095fÆ_w\u00ad¨ùØ0\t\u0006º@ëº\u001câMÄ\u0000ROF\u009e=íå<ñ\u008b\u008eÛ~* y\u0019Èñ\u0017¿g`¶C\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTà£¨ò\u0093Bw\u0091#à\u0018/È~²Îk\u001d\u0017l:»þ\n¥Y\u009d©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ëCC\fSÝ/®ý\u007fÆÈ®\u0098ci=:\u0014\u008b×T±$QõBF\u0002\u0017îà¢±\u008c\u0001~Ò\"\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©rø:Gæ\u0096Ôå\u008f5_\u0084RÓ\f\"åq®À\u0088\u0010h_;®óýßL\u0093\u009c}ë7:\u000b\t¯F¥\u008b%Ä5\u0015Wf\u008c·°\u0000ÂP\u0011¡UòyC¹\u009c×ì\u0019=%\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5l\u0084JÓ\u0004\"êq¢À\u008e\u0010P\u0000MO]\u009e?íä<Ø\u008b¯Ûs*(y\u0014ÈÈ\u0017±gD¶W\u0005\u0017Tû£·ò\u0099Bk\u00917¼óóÐ\"£Q3\u0080I7\u0003gú\u0096µÅ\u0087tE«#Ûæ\nÐ¹\u0092èa\u001f:NNþæ-¿\\\u008f\u0093\u0012Â&rè¡ÈÐ\u0091\u0007c¶xå(\u0015ÆD¢û{*EY4\u0089ö8Ïo\u0091\u009ecÍ<|+¬Úã¼\u0012~APð\u001c ðWª\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009c\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009cBS\u0091'à\u000e/Ø~¾Îd\u001d\\l\u001a\u0000MO]\u009e?íä<Ø\u008b½Ûs*,y\u000f\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¶5f\u0084[Ó\u001a@?\u000f/ÞM\u00ad\u0096|ªËÏ\u009b\u0001j^9}\u0088\u0099WÍ'\u0004ö2Et\u0014\u008eãÖ²ðpD?\\î?\u009dëLïû\u009a«|Z2\t\u001c¸Üg°\u0017n\u001dURv\u0083\u0005ð\u0095!ï\u0096¥Æ\\7\u0013d!Õã\n\u0085z@«v\u00184IÇ¾\u009cïè_@\u008c\u0019ý)2´c\u009bÓ]\u0000|q*¦\u008f\u0017\u0091D ´få\fZÂ\u008bîø¢(@\u0099&Î\r?Ël\u008eÝ¸\r^B\r³ÅàéQ¥\u0081Kö\u0001'=(Ïg×¶´Å`\u0014s£\u001bóæ\u0002§\u0084\u009cË¿\u001aÌi\\¸&\u000fl_\u0095®ÚýèL*\u0093Lã\u00892¿\u0081ýÐ\u000e'Uv!Æ\u0089\u0015Ðdà«}úRJ\u0094\u0099µèã?F\u008eXÝi-¯|ÅÃ\u000b\u0012'ak±\u0089\u0000ïWÄ¦\u0002õGDq\u0094\u0080ÛÎ*\u001dy>kÁ$Ñõ³\u0086hWTà&°òA\u0093\u0012\u009d£N|-\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5k\u0084hÓ\u0004\"ùq¼ù°¶¨gË\u0014\u001fÅ\frd\"\u0099ÓØ\u0080Ò1(îC\u009e\u0097O·üë\u00ad\u0011ZU\u0000ROJ\u009e/íø<Ù\u008b\u0098Ûn*\fy\u0000ÈÓ\u0017³gk¶G\u0005\nTý£¯¡\u0097îº?ÚL9\u009d%*hz\u009a\u008bÕØéi.¶gÆ\u0091\u0017©\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&y9ÈÃ\u0017»\u0000gOJ\u009e*íÏ<É\u008b\u0085Û~*%y\u001d¥\u0013ê>;^H½\u0099¡.ì~\u001e\u008fQÜmmª\u0000gOJ\u009e*íÉ<Õ\u008b\u0098Ûj*%y\u0019ÈÞ\u0017\u0094gd¶Z\u0005\rT÷£³\u0000gOJ\u009e*íÏ<Ý\u008b\u0085Ût*,y\nÈâ\u0017®gq¶d\u0005\u0011Tý£µò\u009fBS\u0091'à\u000e/Ø\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&#]lp½\u0010Îö\u001fâ¨¾øM\t\u0012Z+ëó\u0019\u0084V©\u0087Éô-%-\u0092mÂ\u00983Þ`òÑ2\u000eP~¯¯³\u0000gOJ\u009e*íÝ<Ð\u008b\u008aÛy*,y\u0015ÈÂ\u0017¸gq¶}\u0005\u0007\u0019îVÃ\u0087£ôE%Q\u00926Âê3°`\u0094\u000f§@\u008a\u0091êâ\u001e3\u0019\u0084GÔ¶%ìvÊÇ.\u0018r\u0000sOJ\u009e*íÄ<Ò\u008b\u009fÛ\u007f*;y\u000bÈÓ\u0017¿gq¶]\u0005\u0002Tþ£\u008dò\u0099Bl\u0091:à\u0018/Â~¾ÎxÎ\u009d\u0081¤PÄ#1ò7Er\u0015\u0095äÕ·ò\u0006,Ù\\©§x³Ëþ\u009a\bmJ<p\u008c\u0094_ÒÿO°va\u0016\u0012óÃát¹$HÕ\u0010\u008667×è\u0083\u0098JI|ú:«À\\\u0098\r¾\u0097 Ø\r\tmz\u008f«\u0083\u001cØL\r½|îP_\u0094\u0080þð\u000e!\u001a\u0092WÃ¡\u0000gOJ\u009e*íÏ<Å\u008b\u009fÛ\u007f*\u001ay\fÈÕ\u0017¿gk¶S\u00ad\u0012â&3Z@\u0098\u0091\u009f&ïv\u0018\u0087PÔfe°ºòÊ\u001a\u001b\u0017¨gù\u0090\u000eØ_îï\b".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1179);
        f861 = cArr;
        f858 = -1616313329768902865L;
    }

    public bl(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m861(Ad ad2) {
        f859 = (f860 + 25) % 128;
        String id2 = ad2.getId();
        int i10 = f859 + 41;
        f860 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
        return id2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Ad.Video m862(Ad ad2) {
        int i10 = f859 + 21;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return ad2.getVideo();
        }
        ad2.getVideo();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static List<Any> m863(Ad ad2) {
        f859 = (f860 + 25) % 128;
        List<Any> extProtoList = ad2.getExtProtoList();
        int i10 = f860 + 95;
        f859 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m866(Ad ad2, int i10) {
        f860 = (f859 + 61) % 128;
        String strM894 = m894(ad2, i10);
        int i11 = f860 + 115;
        f859 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 17 / 0;
        }
        return strM894;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m872(Ad ad2) {
        f859 = (f860 + 9) % 128;
        String strM861 = m861(ad2);
        int i10 = f860 + 75;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM861;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m879(Ad.Display display) {
        f859 = (f860 + 91) % 128;
        String strM865 = m865(display);
        int i10 = f860 + 39;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM865;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m883(Any any) {
        int i10 = f859 + 97;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        ByteString byteStringM871 = m871(any);
        if (i11 == 0) {
            int i12 = 6 / 0;
        }
        f860 = (f859 + 7) % 128;
        return byteStringM871;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display.Banner m891(Ad.Display display) {
        f860 = (f859 + 29) % 128;
        Ad.Display.Banner bannerM884 = m884(display);
        f859 = (f860 + 93) % 128;
        return bannerM884;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m869(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        f859 = (f860 + 69) % 128;
        m876(interstitialAd, interstitialListener);
        int i10 = f860 + 121;
        f859 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m873(AdRequestParameters adRequestParameters) {
        int i10 = f859 + 23;
        f860 = i10 % 128;
        if (i10 % 2 == 0) {
            m889(adRequestParameters);
            throw null;
        }
        String strM889 = m889(adRequestParameters);
        f859 = (f860 + 113) % 128;
        return strM889;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m880(Ad ad2, int i10) {
        int i11 = f859 + SignalKey.EVENT_ID;
        f860 = i11 % 128;
        int i12 = i11 % 2;
        String strM888 = m888(ad2, i10);
        if (i12 == 0) {
            int i13 = 4 / 0;
        }
        return strM888;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display m885(Ad ad2) {
        f859 = (f860 + 5) % 128;
        Ad.Display displayM864 = m864(ad2);
        int i10 = f860 + 55;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return displayM864;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Video m892(Ad ad2) {
        f860 = (f859 + 27) % 128;
        Ad.Video videoM862 = m862(ad2);
        int i10 = f859 + 19;
        f860 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 30 / 0;
        }
        return videoM862;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m875(BannerView bannerView, BannerListener bannerListener) {
        int i10 = f859 + 99;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        m868(bannerView, bannerListener);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m881(Ad ad2) {
        f860 = (f859 + 75) % 128;
        List<Any> listM863 = m863(ad2);
        f859 = (f860 + 47) % 128;
        return listM863;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m886(ByteString byteString) {
        int i10 = f860 + 3;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return m878(byteString);
        }
        m878(byteString);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m895(AdRequestParameters adRequestParameters) {
        f859 = (f860 + 25) % 128;
        String strM867 = m867(adRequestParameters);
        f860 = (f859 + 99) % 128;
        return strM867;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m877((ViewConfiguration.getEdgeSlop() >> 16) + 929, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41455), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m879((Ad.Display) list.get(0));
            }
        });
        map.put(m877(KeyEvent.keyCodeFromString("") + 942, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m887((Ad.Video) list.get(0));
            }
        });
        map.put(m877(953 - TextUtils.getCapsMode("", 0, 0), (char) View.combineMeasuredStates(0, 0), 9 - Color.green(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m866((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m877((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 962, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42356), TextUtils.getOffsetBefore("", 0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m885((Ad) list.get(0));
            }
        });
        map.put(m877(972 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m891((Ad.Display) list.get(0));
            }
        });
        map.put(m877(View.getDefaultSize(0, 0) + 988, (char) ExpandableListView.getPackedPositionGroup(0L), 21 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m890((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m877(1009 - Color.green(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 8 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m892((Ad) list.get(0));
            }
        });
        map.put(m877(KeyEvent.getDeadChar(0, 0) + 1017, (char) (9018 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m880((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m877(1028 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6627), Process.getGidForName("") + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m872((Ad) list.get(0));
            }
        });
        map.put(m877((Process.myTid() >> 22) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m873((AdRequestParameters) list.get(0));
            }
        });
        map.put(m877((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1053, (char) (6537 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m895((AdRequestParameters) list.get(0));
            }
        });
        map.put(m877(MotionEvent.axisFromString("") + 1064, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4032), 11 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m896((RequestExtension) list.get(0));
            }
        });
        map.put(m877(Drawable.resolveOpacity(0, 0) + 1074, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 22 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bl.m869((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m877(1097 - View.resolveSize(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 52974), TextUtils.indexOf((CharSequence) "", '0') + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bl.m882((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m877(1116 - TextUtils.indexOf("", "", 0, 0), (char) (65340 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                bl.m875((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m877(1132 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38727), 15 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m881((Ad) list.get(0));
            }
        });
        map.put(m877(1149 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.MeasureSpec.getSize(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m883((Any) list.get(0));
            }
        });
        map.put(m877(1161 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44400), 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bl.m886((ByteString) list.get(0));
            }
        });
        int i10 = f859 + 83;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m882(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i10 = f859 + 11;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        m870(rewardedAd, rewardedListener);
        if (i11 == 0) {
            int i12 = 35 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m887(Ad.Video video) {
        f859 = (f860 + 67) % 128;
        String strM893 = m893(video);
        f860 = (f859 + 35) % 128;
        return strM893;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m896(RequestExtension requestExtension) {
        int i10 = f860 + 123;
        f859 = i10 % 128;
        if (i10 % 2 != 0) {
            m874(requestExtension);
            throw null;
        }
        String strM874 = m874(requestExtension);
        f860 = (f859 + 101) % 128;
        return strM874;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        hz hzVarM2306;
        Class<BidMachine> cls;
        String strM877;
        int i10 = f860 + 31;
        f859 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                hzVarM2306 = hu.m2304().m2306();
                cls = BidMachine.class;
                strM877 = m877(0 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), (char) (22158 % (ViewConfiguration.getPressedStateDuration() >> 20)), 47 / (ViewConfiguration.getJumpTapTimeout() - 43));
            } else {
                hzVarM2306 = hu.m2304().m2306();
                cls = BidMachine.class;
                strM877 = m877(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 20736), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12);
            }
            return hzVarM2306.m2406(cls, strM877.intern());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m878(ByteString byteString) {
        f859 = (f860 + 55) % 128;
        String stringUtf8 = byteString.toStringUtf8();
        int i10 = f860 + 91;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return stringUtf8;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m890(Ad.Display.Banner banner) {
        int i10 = f860 + 39;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> listM897 = m897(banner);
        if (i11 != 0) {
            int i12 = 34 / 0;
        }
        return listM897;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(m877(TextUtils.indexOf((CharSequence) "", '0') + 382, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48966), TextUtils.lastIndexOf("", '0') + 18).intern())) {
                    return RichMediaListener.class;
                }
                return null;
            case -2032115546:
                if (!str.equals(m877(TextUtils.indexOf((CharSequence) "", '0', 0) + 190, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 28645), (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern())) {
                    return null;
                }
                f859 = (f860 + 119) % 128;
                return CreativeFormat.class;
            case -1921270373:
                if (str.equals(m877((ViewConfiguration.getScrollDefaultDelay() >> 16) + 738, (char) (28690 - (ViewConfiguration.getScrollBarSize() >> 8)), 12 - Color.argb(0, 0, 0, 0)).intern())) {
                    return VastActivity.class;
                }
                return null;
            case -1798479256:
                if (str.equals(m877(AndroidCharacter.getMirror('0') + 702, (char) ((-16769738) - Color.rgb(0, 0, 0)), 47 - View.combineMeasuredStates(0, 0)).intern())) {
                    return VastActivity.class;
                }
                return null;
            case -1683121555:
                if (!str.equals(m877((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 178, (char) (ExpandableListView.getPackedPositionChild(0L) + 49898), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12).intern())) {
                    return null;
                }
                int i10 = f859 + 1;
                f860 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return BidMachineAd.class;
            case -1628534628:
                if (str.equals(m877(676 - TextUtils.indexOf("", ""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 10).intern())) {
                    return MraidView.class;
                }
                return null;
            case -1627944928:
                if (str.equals(m877(112 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 14 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    return BannerListener.class;
                }
                return null;
            case -1518365947:
                if (str.equals(m877(897 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63973), Color.alpha(0) + 16).intern())) {
                    return VastViewListener.class;
                }
                return null;
            case -1507727624:
                if (str.equals(m877(281 - ExpandableListView.getPackedPositionType(0L), (char) (Process.myPid() >> 22), 37 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return MediaView.class;
                }
                return null;
            case -1371195010:
                if (str.equals(m877(Drawable.resolveOpacity(0, 0) + 246, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 12).intern())) {
                    return FullScreenAd.class;
                }
                return null;
            case -1246480821:
                if (str.equals(m877(448 - TextUtils.getOffsetBefore("", 0), (char) (View.getDefaultSize(0, 0) + 17173), 19 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case -1146475727:
                if (str.equals(m877(796 - MotionEvent.axisFromString(""), (char) (10393 - (ViewConfiguration.getTouchSlop() >> 8)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7).intern())) {
                    return VastView.class;
                }
                return null;
            case -1087582685:
                if (!str.equals(m877((ViewConfiguration.getWindowTouchSlop() >> 8) + 634, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16).intern())) {
                    return null;
                }
                f859 = (f860 + 91) % 128;
                return MraidInterstitial.class;
            case -1011229113:
                if (str.equals(m877((Process.myPid() >> 22) + 588, (char) (48272 - KeyEvent.getDeadChar(0, 0)), 46 - Color.red(0)).intern())) {
                    return MraidDialogActivity.class;
                }
                return null;
            case -838844802:
                if (str.equals(m877(TextUtils.getCapsMode("", 0, 0) + 805, (char) (View.resolveSizeAndState(0, 0, 0) + 34047), 43 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return VastView.class;
                }
                return null;
            case -642689680:
                if (str.equals(m877(KeyEvent.normalizeMetaState(0) + 721, (char) (TextUtils.indexOf("", "") + 16498), KeyEvent.getDeadChar(0, 0) + 17).intern())) {
                    return MraidViewListener.class;
                }
                return null;
            case -609786639:
                if (!str.equals(m877(356 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 9736), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return null;
                }
                int i11 = f859 + 13;
                f860 = i11 % 128;
                if (i11 % 2 != 0) {
                    return RewardedAd.class;
                }
                return BannerListener.class;
            case -589219056:
                if (str.equals(m877(TextUtils.lastIndexOf("", '0', 0, 0) + 13, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 14).intern())) {
                    return AdContentType.class;
                }
                return null;
            case -572702516:
                if (str.equals(m877(70 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 55296), 8 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    return AdRequest.class;
                }
                return null;
            case -475472046:
                if (str.equals(m877(41 - View.MeasureSpec.getMode(0), (char) (30211 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf("", "", 0, 0) + 20).intern())) {
                    return AdFullScreenListener.class;
                }
                return null;
            case -211807062:
                if (str.equals(m877(167 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 11).intern())) {
                    return BidMachine.class;
                }
                return null;
            case -150492023:
                if (str.equals(m877(271 - TextUtils.lastIndexOf("", '0', 0), (char) (53897 - Gravity.getAbsoluteGravity(0, 0)), 9 - TextUtils.indexOf("", "", 0)).intern())) {
                    return MediaView.class;
                }
                return null;
            case CastStatusCodes.ERROR_DEVICE_ID_FLAGS_NOT_SET /* 2115 */:
                if (str.equals(m877(TextUtils.lastIndexOf("", '0', 0, 0) + i1.d.HandlerC1208d.f123903r, (char) (ExpandableListView.getPackedPositionType(0L) + 2542), (Process.myPid() >> 22) + 2).intern())) {
                    return Ad.class;
                }
                return null;
            case 1282165:
                if (str.equals(m877(Color.red(0) + 685, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 35 - TextUtils.lastIndexOf("", '0')).intern())) {
                    return MraidView.class;
                }
                return null;
            case 3368703:
                if (str.equals(m877(25 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 60060), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9).intern())) {
                    return Ad.Display.class;
                }
                return null;
            case 141091039:
                if (str.equals(m877(529 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 40).intern())) {
                    return MraidActivity.class;
                }
                return null;
            case 320151695:
                if (str.equals(m877(212 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 14).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 503762424:
                if (str.equals(m877(34 - Color.argb(0, 0, 0, 0), (char) ((-1) - Process.getGidForName("")), KeyEvent.keyCodeFromString("") + 7).intern())) {
                    return Ad.Video.class;
                }
                return null;
            case 529939434:
                if (str.equals(m877((ViewConfiguration.getWindowTouchSlop() >> 8) + 99, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 7).intern())) {
                    return AdsType.class;
                }
                return null;
            case 625873720:
                if (str.equals(m877((ViewConfiguration.getKeyRepeatDelay() >> 16) + 859, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 38 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return MraidAdView.class;
                }
                return null;
            case 713768498:
                if (str.equals(m877(TextUtils.lastIndexOf("", '0') + 341, (char) (31461 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14).intern())) {
                    return NativeMediaView.class;
                }
                return null;
            case 737636858:
                if (str.equals(m877(467 - View.getDefaultSize(0, 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 48).intern())) {
                    return VideoPlayerActivity.class;
                }
                return null;
            case 742497451:
                if (str.equals(m877((ViewConfiguration.getFadingEdgeLength() >> 16) + 411, (char) Color.red(0), 38 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                    return RichMediaView.class;
                }
                return null;
            case 745946635:
                if (str.equals(m877(326 - Color.argb(0, 0, 0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern())) {
                    return NativeListener.class;
                }
                return null;
            case 961844241:
                if (str.equals(m877(174 - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 63865), 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return BannerView.class;
                }
                return null;
            case 1125320581:
                if (!str.equals(m877(204 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (28586 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 9 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return null;
                }
                f860 = (f859 + 75) % 128;
                return ImageData.class;
            case 1165508119:
                if (str.equals(m877(View.combineMeasuredStates(0, 0) + 61, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 10).intern())) {
                    return AdListener.class;
                }
                return null;
            case 1212533506:
                if (str.equals(m877(TextUtils.lastIndexOf("", '0', 0, 0) + 366, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 59407), ((Process.getThreadPriority(0) + 20) >> 6) + 16).intern())) {
                    return RewardedListener.class;
                }
                return null;
            case 1297340448:
                if (str.equals(m877(226 - KeyEvent.normalizeMetaState(0), (char) (61674 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 20 - KeyEvent.normalizeMetaState(0)).intern())) {
                    return InterstitialListener.class;
                }
                return null;
            case 1387614166:
                if (!str.equals(m877(80 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 9056), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20).intern())) {
                    return null;
                }
                int i12 = f860 + 111;
                int i13 = i12 % 128;
                f859 = i13;
                if (i12 % 2 != 0) {
                    return null;
                }
                int i14 = i13 + 57;
                f860 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 11 / 0;
                }
                return AdRequestParameters.class;
            case 1395486086:
                if (str.equals(m877(Drawable.resolveOpacity(0, 0) + 516, (char) (35687 - TextUtils.lastIndexOf("", '0')), 12 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    return MraidActivity.class;
                }
                return null;
            case 1444286894:
                if (!str.equals(m877(568 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 19).intern())) {
                    return null;
                }
                int i16 = f859 + 105;
                f860 = i16 % 128;
                if (i16 % 2 == 0) {
                    return null;
                }
                return MraidDialogActivity.class;
            case 1461955341:
                if (!str.equals(m877((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 398, (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.green(0) + 13).intern())) {
                    return null;
                }
                int i17 = f859 + 39;
                f860 = i17 % 128;
                if (i17 % 2 == 0) {
                    return null;
                }
                return RichMediaView.class;
            case 1494941328:
                if (!str.equals(m877(912 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) + h0.f82386s).intern())) {
                    return null;
                }
                f859 = (f860 + 73) % 128;
                return RequestExtension.class;
            case 1917129446:
                if (str.equals(m877((ViewConfiguration.getScrollBarFadeDuration() >> 16) + i1.d.HandlerC1208d.f123894i, (char) (TextUtils.getOffsetBefore("", 0) + 25570), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14).intern())) {
                    return MediaAssetType.class;
                }
                return null;
            case 1955913096:
                if (str.equals(m877(106 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7).intern())) {
                    return AdView.class;
                }
                return null;
            case 2034998687:
                if (str.equals(m877(848 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (AndroidCharacter.getMirror('0') + 27484), 11 - (Process.myTid() >> 22)).intern())) {
                    return MraidAdView.class;
                }
                return null;
            case 2110329530:
                if (str.equals(m877((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 317, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf("", "", 0) + 8).intern())) {
                    return NativeAd.class;
                }
                return null;
            case 2112955383:
                if (str.equals(m877((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650, (char) ((-16777216) - Color.rgb(0, 0, 0)), 25 - View.combineMeasuredStates(0, 0)).intern())) {
                    return MraidInterstitialListener.class;
                }
                return null;
            case 2136410007:
                if (str.equals(m877(135 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 31).intern())) {
                    return BannerView.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m871(Any any) {
        int i10 = f860 + 19;
        f859 = i10 % 128;
        if (i10 % 2 != 0) {
            any.getValue();
            throw null;
        }
        ByteString value = any.getValue();
        int i11 = f859 + 91;
        f860 = i11 % 128;
        if (i11 % 2 != 0) {
            return value;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m877(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f861[i10 + i12]) ^ (((long) i12) * f858)) ^ ((long) c10));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Ad.Display.Banner m884(Ad.Display display) {
        f860 = (f859 + 53) % 128;
        Ad.Display.Banner banner = display.getBanner();
        f860 = (f859 + 109) % 128;
        return banner;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m874(RequestExtension requestExtension) {
        int i10 = f859 + 63;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        String sellerId = requestExtension.getSellerId();
        if (i11 == 0) {
            int i12 = 43 / 0;
        }
        return sellerId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m888(Ad ad2, int i10) {
        f859 = (f860 + 31) % 128;
        String adomain = ad2.getAdomain(i10);
        int i11 = f860 + 21;
        f859 = i11 % 128;
        if (i11 % 2 == 0) {
            return adomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m876(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i10 = f860 + 25;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setListener(interstitialListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m889(AdRequestParameters adRequestParameters) {
        int i10 = f859 + 103;
        f860 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = adRequestParameters.getPlacementId();
        if (i11 == 0) {
            int i12 = 79 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m865(Ad.Display display) {
        int i10 = f860 + 23;
        f859 = i10 % 128;
        if (i10 % 2 == 0) {
            return display.getAdm();
        }
        display.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Ad.Display m864(Ad ad2) {
        f859 = (f860 + 105) % 128;
        Ad.Display display = ad2.getDisplay();
        int i10 = f859 + 105;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return display;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m867(AdRequestParameters adRequestParameters) {
        f859 = (f860 + 59) % 128;
        String name = adRequestParameters.getAdsType().getName();
        int i10 = f859 + 51;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return name;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m870(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        f859 = (f860 + 113) % 128;
        rewardedAd.setListener(rewardedListener);
        f860 = (f859 + 37) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m868(BannerView bannerView, BannerListener bannerListener) {
        f860 = (f859 + 83) % 128;
        bannerView.setListener(bannerListener);
        f859 = (f860 + 87) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m893(Ad.Video video) {
        int i10 = f859 + 95;
        f860 = i10 % 128;
        if (i10 % 2 != 0) {
            return video.getAdm();
        }
        video.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m894(Ad ad2, int i10) {
        int i11 = f860 + 99;
        f859 = i11 % 128;
        if (i11 % 2 != 0) {
            ad2.getBundle(i10);
            throw null;
        }
        String bundle = ad2.getBundle(i10);
        int i12 = f860 + 41;
        f859 = i12 % 128;
        if (i12 % 2 == 0) {
            return bundle;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Any> m897(Ad.Display.Banner banner) {
        int i10 = f860 + 41;
        f859 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> extProtoList = banner.getExtProtoList();
        if (i11 != 0) {
            int i12 = 7 / 0;
        }
        f859 = (f860 + 45) % 128;
        return extProtoList;
    }
}
