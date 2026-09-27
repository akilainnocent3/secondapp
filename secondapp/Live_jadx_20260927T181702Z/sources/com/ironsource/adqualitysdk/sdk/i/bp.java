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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.hyprmx.android.sdk.placement.PlacementType;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bp extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f962 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f963;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f964;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f965;

    static {
        char[] cArr = new char[1080];
        ByteBuffer.wrap("\u0097ýä\u0083q#Í¿ZVÖÅ#k°\u000f\f\u008d\u0099?\u0015¤bA¥iÖ\u0006C\u0089ÿ+hßär\u0011\u0097\u0082\u0091>t«¾'\u0011P¼\u0000Hs\u0014æªZ5ÍùAy\u0000Hs\u0014æªZ5ÍùAy´Í'\u0094\u009b\u0006\u000e¡\u00820õÀipÜåO\u0093Ã\u0011\u0000Ps\u0001æ»Z$ÍÑAL´ë'\u0095\u009b\u001c\u000e\u0081\u0082;õßiy\u0000As\t\u0000Ds\bæªZ\"ÍÚAE´ë'\u0095\u009b\u000b\u000e¬\u0082\nõÀipÜíO\u0093Ã\u0011à§\u0093è\u0006HºÜ-,¡·T\u001dÇi{ûîtbÔ\u0015+\u0089\u009f<:¯`#àÖF\u0000Hs\u0014æªZ5ÍùAy´Þ'\u0089\u009b\u0007\u000e¥\u0082'õÝihÜàO\u0093Ã\u0010\u0005\u001dvAãÿ_`È¬D,±\u008c\"Ë\u009e_\u000bÖ\u0087~ð\u009fl>Ù\u008bJÊÆB3í¯+\u0018\u0093\u0094-\u0001¢rÅîi[ò×\b@¾¼&)\\\u009aû\u0016m\u0083á;lH\rÝ¸aföÓzW\u008fñ\u001c\u0086 \n5¢¹cÎÁR}çât\u008bø\u0003\r¶\u0091V&\u008bªk?ïL\u0095Ð\u007fe£éE~Ë\u0082m\u0017\u0018¤\u008a(5½ºÁ\u0012VçÚ{o\u0005ü\u009a\u0000\u0016\u0095\u0096\u0019v®ñ2eG,Ô\u0084X%íÄqq\u0086ð\nx\u009f\u0017,\u0091°)Å×IXÞÿc\u0093÷\b\u0004²\u0088\u0004\u001dÜ¡f6Á»\u0097Ï\u001b\u0000Hs\u0014æªZ5ÍùAy´À'\u0094\u009b'\u000e³\u0082$õÊinÜúO·Ã\u00006¤ªT\u001dÜ\u0091~\u0004ðw\u0088\u0000cs\u0002æ·ZiÍÜAX´þ'\u0089\u009b\u0005\u000e\u00ad\u0082lõÎirÜíO\u0084Ã\f6¹ªY\u001d\u0084\u0091d\u0004àw\u009aëp^ªÒ[EÑ¹{,\t\u009f\u0085\u0013-\u0086¿ú\u001dmèátT\nÇ\u0095;\u0019®\u0099\"`\u0095ô\tG|\u0013ï\u0084c*ÖÎJZ½×1`¤\u0004\u0017´\u008b<þÞrPåè\u0000Hs\u0014æªZ5ÍùAy´Á'\u009d\u009b\u000e\u000e°\u00820õùiuÜìO\u0081Ã\u00066¢ª|\u001dÉ\u0091c\u0004íw\u0087ë7^¿ÒA]'.F»ó\u0007-\u0090\u0098\u001c\u001céºzÍÆASéß(¨\u008a46\u0081©\u0012À\u009eHký÷\u001d@ÀÌ Y¤*Þ¶4\u0003î\u008f\u001f\u0018\u0095ä?qMÂÁNiÛû§Y0¬¼0\tN\u009aÑf]óÝ\u007f%È¹T*!T²Ô>]\u008b\u0091\u0017\bà¥l\"ùFJØÖm£\u0087/\t¸£\u0005Ó\u0091[bå\u0000Hs\u0014æªZ5ÍùAy´Ü'\u009e\u009b\u0019\u000e \u0082+õÝiyÜíO¿Ã\r6¶ªR\u001dØ\u0091z\u0004åw\u0085ë7^¤ÒVEä¹q,\u000b\u009f\u0085\u0013/\u0086¯úGmÙ¶¶Å×Pbì¼{\t÷\u008d\u0002+\u0091\\-Ð¸x4¹C\u001bß§j8ùQuÙ\u0080l\u001c\u008c«Q'±²5ÁO]¥è\u007fd\u008eó\u0004\u000f®\u009aÜ)P¥ø0jLÈÛ=W¡âßq@\u008dÌ\u0018L\u0094©#+¿¬ÊÕY^Õè`\fü\u0098\u000b\n\u0087¸\u0012Ã¡g=íH\u000fÄ\u0090S0îBzÑ\u0089c\u0005Ñ\u0090\u0004,¾»06ZBÚÑrmìÜ\u0082¯Þ:`\u0086ÿ\u00113\u009d³h\u0006ûPGÑÒz^Þ)\fµ³\u00004\u0093\u007f\u001fÆêtv\u0083Á\u0012M²Ø\"«W7ñ\u0082s3\u0015@IÕ÷ihþ¤r$\u0087\u0085\u0014Ç¨F=ü±IÆ\u009bZ$ï£|èðQ\u0005ã\u0099\u0014.\u0085¢%7µDÀØfmä\u0000Hs\u0014æªZ5ÍùAy´Ù'\u009e\u009b\n\u000e\u0081\u00820õÎizÜïO\u009fÃ\u00006\u0086ªT\u001dÏ\u0091`\u0004Çw\u009eë0^¿ÒJEÊ¹~,\u0013\u009f\u0089\u0013+\u0000Os\u000bæ¼Z\"ÍÆAb´ï'\u0098\u009b\u0000\u000e°\u0082\u0007õÁihÜàO\u0082Ã\u001a\u0018\tkVþæBMÕ\u0098Y\u001e¬¶?Ã\u0083_\u0016è\u009aSí\u0093q(Ä²WËÛIL\u008d?Òªb\u0016É\u0081\u001c\r\u009aø2kG×ÛBlÎÍ¹'%\u008aÜ\u0096¯Ê:t\u0086ë\u0011'\u009d§h\u001cû@G×Òy^ò)<µ\u00ad\u0000%\u0093M\u001fþêav\u008dÁ\u0000M»Ø5«C7ì\u0082p\u000e\u0094Va%=°\u0083\f\u001c\u009bÐ\u0017Pâêq Í X\u0095Ô\u000f£Ð?\\\u008aÅ\u0019¨\u0095\t`\u0096üzK÷ÇLRÂ!´½\u001b\b\u0087\u0084cS÷ «µ\u0015\t\u008a\u009eF\u0012Æç~t\"È±]\u000fÑ\u008f¦G:Æ\u008fT\u001c\u001f\u0090µe\nùõNVÂÇWU$:¸\u0093\r\u001b\u0081ë\u0016vêÈ\u007f²ïà\u009c¼\t\u0002µ\u009d\"Q®Ñ[qÈ6t¢á+m\u0083\u001ab\u0086Ã%\fVPÃî\u007fqè½d=\u0091\u009d\u0002Ú¾N+Ç§oÐ\u008eL/ù\u008ejÞæN\u0013ñ\u008f\u00178\u009a5\u008fFÓÓmoòø>t¾\u0081\u0006\u0012Z®É;w·÷À>\\²é+zFöÁ\u0003e\u009f²(\f¤¾1'BZÞük~Ü\u009b¯ß:h\u0086ö\u0011\u0012\u009d£h3ûJGËÒd^ä)3µ©\u00003\u0093F\u001fÛêav\u009bÁ2MªØ#«Q7ï\u0082q\u000e\u0089\u0099\u0003Ù\u001dªA?ÿ\u0083`\u0014¬\u0098,m\u0088þÅBT×ð[T,\u0095°'\u0005¨\u0096Ñ\u001aYïés\u0004Ä\u009aH0\u008e¶ýêhTÔËC\u0007Ï\u0087:#©n\u0015ÿ\u0080[\fÿ{>ç\u008cR\u0003ÁzMò¸B$¯\u00931\u001f\u009b\u008a6ùfeÓÐA\\£Ë57\u0089¢ó_j,6¹\u0088\u0005\u0017\u0092Û\u001e[ëîx«Ä%Q\u0080Ý\u0013ªè6L\u0083ê\u0010·\u009c5i\u009bõiBáÎA[ß\u0000cs\u0002æ·ZiÍÜAX´þ'\u0089\u009b\u0005\u000e\u00ad\u0082lõÎirÜíO\u0084Ã\f6¹ªY\u001d\u0084\u0091d\u0004àw\u009aëp^¤ÒNEÀ¹`,\u0013\u009f\u008d\u0013 \u0086èú{mÙá}T\bÇª;\f®\u0083\"\\\u0095ô\t\u007f|\u0006ï\u0087c=ÖýJJ½â1j¤\u0006\u0017´\u008b>þÎÞË\u00ad¤8\u0002\u0084¼\u0013}\u009fïjvù%E¥Ð\u001f\\\u0088+j·Ó\u0002j\u00918\u001d¥è\u0019tòÃrOîÚZ©15\u0081Bp1\u001f¤¹\u0018\u001f\u008fÅ\u0003Pöüe\u009eÙ<L£À6·Ð+n\u009eÝ\r\u008d\u0081\u001dt¤èA_éÓhFá5\u0089©<\u001c»\u0090G\u0007çûwn\u0004õ\u0013\u0086|\u0013Ú¯r8¤´\u0001A\u0083Òÿny\u0000gs\bæ®Z\u0017ÍØA@´í'\u009e\u009b\u0005\u000e°\u0082,õÛiHÜðO\u0086Ã\u00066\u0095ªS\u001dß\u0091z\u0000gs\bæ®Z\u0003ÍÑAQ´ë'\u0095\u009b\f\u000e°\u0082,õÌieÜÁO\u0099Ã\u000f6´ªX\u001dØ\u0091^\u0004êw\u0082ë*^ªÒVEÆ¹w\u0000gs\bæ®Z\u0003ÍÝAR´ú'\u0089\u009b\u0001\u000e·\u00827õÛisÜûO¿Ã\u0007áÙ\u0092¶\u0007\u0010»©,f þUSÆ z»ï\u000ec\u0092\u0014e\u0088á=X®&\"©×\u001cKìüxpÅå_\u0096=ãT\u0090;\u0005\u009d¹$.õ¢wWÑÄ§x:í\u0082a\u0014\u0016ø\u008ak?Û¬± 1\u0000gs\bæ®Z\u0017ÍÕAS´ï'\u0096\u009b\r\u000e¡\u0082'õÝio\u0000Rs(æ\u008dZ\u0006ÍæAe´Ë'¿\u008b\u009eøômYÑÕF1Ê¥?\r¬e\u0010ë\u0085K\tÔ~4\u0000Is#æ\u008cZ\u0006ÍøAh´Ê\u0000Ns\"æ\u008eZ\u0018ÍýAo´Ç'¯\u009b!\u000e\u0094\u0082\u000eõæiFÜÌO²".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1080);
        f965 = cArr;
        f964 = 2198696679238169453L;
    }

    public bp(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1002(String str) {
        switch (str.hashCode()) {
            case -1617199657:
                if (str.equals(m1014(1058 - ExpandableListView.getPackedPositionGroup(0L), (char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0') + 8).intern())) {
                    return PlacementType.INVALID;
                }
                break;
            case -1372958932:
                if (str.equals(m1014(ExpandableListView.getPackedPositionType(0L) + 1046, (char) (TextUtils.getCapsMode("", 0, 0) + 35799), TextUtils.indexOf((CharSequence) "", '0', 0) + 13).intern())) {
                    return PlacementType.INTERSTITIAL;
                }
                break;
            case -65580248:
                if (str.equals(m1014((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1064, (char) ((-1) - TextUtils.lastIndexOf("", '0')), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15).intern())) {
                    return PlacementType.NOT_INITIALIZED;
                }
                break;
            case 543046670:
                if (str.equals(m1014(TextUtils.indexOf((CharSequence) "", '0', 0) + IronSourceError.ERROR_IS_SHOW_EXCEPTION, (char) (ImageFormat.getBitsPerPixel(0) + 1), 8 - TextUtils.getTrimmedLength("")).intern())) {
                    f962 = (f963 + 31) % 128;
                    return PlacementType.REWARDED;
                }
                break;
        }
        int i10 = f962 + 53;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ DependencyHolder m1003() {
        f963 = (f962 + 75) % 128;
        DependencyHolder dependencyHolderM1001 = m1001();
        f962 = (f963 + 77) % 128;
        return dependencyHolderM1001;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ PreloadedVastData m1004(DependencyHolder dependencyHolder) {
        f963 = (f962 + 99) % 128;
        PreloadedVastData preloadedVastDataM1007 = m1007(dependencyHolder);
        f962 = (f963 + 3) % 128;
        return preloadedVastDataM1007;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m1008(String str) {
        f962 = (f963 + 17) % 128;
        Object objM1002 = m1002(str);
        f963 = (f962 + 37) % 128;
        return objM1002;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1012(DependencyHolder dependencyHolder) {
        int i10 = f962 + 81;
        f963 = i10 % 128;
        int i11 = i10 % 2;
        String strM1017 = m1017(dependencyHolder);
        if (i11 != 0) {
            int i12 = 94 / 0;
        }
        return strM1017;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m1015(WebTrafficObject webTrafficObject) {
        int i10 = f963 + 123;
        f962 = i10 % 128;
        if (i10 % 2 == 0) {
            m1018(webTrafficObject);
            throw null;
        }
        List<WebTrafficObject.WebTrafficURL> listM1018 = m1018(webTrafficObject);
        int i11 = f963 + 113;
        f962 = i11 % 128;
        if (i11 % 2 != 0) {
            return listM1018;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementController m1016(HyprMXController hyprMXController) {
        f962 = (f963 + 35) % 128;
        PlacementController placementControllerM1010 = m1010(hyprMXController);
        f963 = (f962 + 97) % 128;
        return placementControllerM1010;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1005(Ad ad2) {
        f962 = (f963 + 37) % 128;
        String strM1009 = m1009(ad2);
        int i10 = f963 + 89;
        f962 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1009;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1013(PreloadedVastData preloadedVastData) {
        int i10 = f963 + 7;
        f962 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1019 = m1019(preloadedVastData);
        if (i11 == 0) {
            int i12 = 74 / 0;
        }
        return jSONObjectM1019;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1014(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f965[i10 + i12]) ^ (((long) i12) * f964)) ^ ((long) c10));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        f963 = (f962 + 21) % 128;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(m1014(MotionEvent.axisFromString("") + 1, (char) (38828 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 12).intern()).get(null);
                int i10 = f963 + 37;
                f962 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 54 / 0;
                }
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m2304().m2306().m2406(BuildConfig.class, m1014(13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42295), '<' - AndroidCharacter.getMirror('0')).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:135:0x054e A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x046e, code lost:
    
        if (r9.equals(m1014(android.text.TextUtils.indexOf("", "", 0) + 110, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1364), android.view.View.MeasureSpec.getMode(0) + 31).intern()) != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0218, code lost:
    
        if (r9.equals(m1014((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 280, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), 25 - (android.view.KeyEvent.getMaxKeyCode() >> 16)).intern()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02b7, code lost:
    
        if (r9.equals(m1014(android.graphics.ImageFormat.getBitsPerPixel(0) + 306, (char) (23876 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 56 - android.widget.ExpandableListView.getPackedPositionChild(0)).intern()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02b9, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.bp.f963 + 43;
        com.ironsource.adqualitysdk.sdk.i.bp.f962 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c5, code lost:
    
        if ((r0 % 2) != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c7, code lost:
    
        r0 = 34 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02ca, code lost:
    
        return com.hyprmx.android.sdk.activity.HyprMXOfferViewerActivity.class;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo693(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bp.mo693(java.lang.String):java.lang.Class");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1006(OfferCacheEntity offerCacheEntity) {
        f963 = (f962 + 71) % 128;
        String strM1011 = m1011(offerCacheEntity);
        f962 = (f963 + 89) % 128;
        return strM1011;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1011(OfferCacheEntity offerCacheEntity) {
        f962 = (f963 + 11) % 128;
        String str = offerCacheEntity.clickThroughUrl;
        f963 = (f962 + 119) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementController m1010(HyprMXController hyprMXController) {
        f962 = (f963 + 89) % 128;
        PlacementController placementController = hyprMXController.getPlacementController();
        f962 = (f963 + 15) % 128;
        return placementController;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m1014(TextUtils.lastIndexOf("", '0') + 865, (char) (57004 - Drawable.resolveOpacity(0, 0)), View.MeasureSpec.getMode(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1015((WebTrafficObject) list.get(0));
            }
        });
        map.put(m1014(ExpandableListView.getPackedPositionChild(0L) + 888, (char) (View.MeasureSpec.getSize(0) + 16919), TextUtils.indexOf((CharSequence) "", '0', 0) + 29).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1006((OfferCacheEntity) list.get(0));
            }
        });
        map.put(m1014(Color.alpha(0) + 915, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62836), 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1005((Ad) list.get(0));
            }
        });
        map.put(m1014(924 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((byte) KeyEvent.getModifierMetaStateMask()) + zi.c.f161647y).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1008((String) list.get(0));
            }
        });
        map.put(m1014((Process.myPid() >> 22) + 944, (char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) + 28).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1003();
            }
        });
        map.put(m1014(Drawable.resolveOpacity(0, 0) + 971, (char) View.combineMeasuredStates(0, 0), 16 - (Process.myPid() >> 22)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1012((DependencyHolder) list.get(0));
            }
        });
        map.put(m1014(987 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 57790), 22 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1016((HyprMXController) list.get(0));
            }
        });
        map.put(m1014(1010 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (58163 - TextUtils.getOffsetAfter("", 0)), 16 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1004((DependencyHolder) list.get(0));
            }
        });
        map.put(m1014(TextUtils.indexOf("", "", 0) + 1025, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - TextUtils.lastIndexOf("", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bp.m1013((PreloadedVastData) list.get(0));
            }
        });
        int i10 = f962 + 1;
        f963 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 87 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static PreloadedVastData m1007(DependencyHolder dependencyHolder) {
        int i10 = f963 + SignalKey.EVENT_ID;
        f962 = i10 % 128;
        if (i10 % 2 == 0) {
            dependencyHolder.getPreloadedData();
            throw null;
        }
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        int i11 = f962 + 125;
        f963 = i11 % 128;
        if (i11 % 2 == 0) {
            return preloadedData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1009(Ad ad2) {
        f962 = (f963 + 83) % 128;
        String str = ad2.type;
        f963 = (f962 + 67) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static DependencyHolder m1001() {
        f963 = (f962 + 33) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        int i10 = f963 + 81;
        f962 = i10 % 128;
        if (i10 % 2 != 0) {
            return dependencyHolder;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<WebTrafficObject.WebTrafficURL> m1018(WebTrafficObject webTrafficObject) {
        f963 = (f962 + 105) % 128;
        List<WebTrafficObject.WebTrafficURL> list = webTrafficObject.urls;
        int i10 = f962 + 93;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m1019(PreloadedVastData preloadedVastData) {
        f963 = (f962 + 45) % 128;
        JSONObject parameters = preloadedVastData.getParameters();
        int i10 = f963 + 1;
        f962 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 6 / 0;
        }
        return parameters;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1017(DependencyHolder dependencyHolder) {
        int i10 = f963 + 19;
        f962 = i10 % 128;
        int i11 = i10 % 2;
        String distributorId = dependencyHolder.getDistributorId();
        if (i11 == 0) {
            int i12 = 1 / 0;
        }
        int i13 = f962 + 51;
        f963 = i13 % 128;
        if (i13 % 2 == 0) {
            return distributorId;
        }
        throw null;
    }
}
