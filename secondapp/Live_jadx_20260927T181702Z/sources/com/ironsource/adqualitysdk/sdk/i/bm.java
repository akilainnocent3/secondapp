package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdController;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.ApsAdView;
import com.amazon.aps.ads.activity.ApsAdActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBActivity;
import com.amazon.device.ads.DTBAdActivity;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdBaseBannerListener;
import com.amazon.device.ads.DTBAdBaseInterstitialListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdExpandedListener;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBAdViewSupportClient;
import com.amazon.device.ads.DTBFetchFactory;
import com.amazon.device.ads.DTBFetchManager;
import com.amazon.device.ads.DTBInterstitialActivity;
import com.amazon.device.ads.DTBRenderer;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class bm extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f880 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f881;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f882;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f883;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends HashMap<String, DTBFetchManager> implements hg<HashMap<String, DTBFetchManager>> {

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f907 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f908 = {'D', 'T', 'B', 'F', 'e', 't', 'c', 'h', 'M', 'a', 'n', 'g', 'r', 'k', 'H', 's', 'p', kj.e.f102543c, fw.b.f85389p, 'E', 'G', 'I', 'J', 'K', 'L'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f909 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f910 = 5;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f912;

        public a(HashMap<String, DTBFetchManager> map, ch chVar) {
            super(map);
            this.f912 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private DTBFetchManager m945(String str, DTBFetchManager dTBFetchManager) {
            f907 = (f909 + 89) % 128;
            bm.this.m773(this, this.f912, m947("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000e\u0005\u000e\u0001\r\u000e\u0013\u000e\u0011\u0005\t\u0005\u0011\u0012\u0011\u0013¸", 28 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (68 - ExpandableListView.getPackedPositionType(0L))).intern(), str, dTBFetchManager);
            DTBFetchManager dTBFetchManager2 = (DTBFetchManager) super.put(str, dTBFetchManager);
            int i10 = f907 + 63;
            f909 = i10 % 128;
            if (i10 % 2 == 0) {
                return dTBFetchManager2;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private HashMap<String, DTBFetchManager> m946() {
            f909 = (f907 + 57) % 128;
            return this;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f909 = (f907 + 19) % 128;
            DTBFetchManager dTBFetchManagerM945 = m945((String) obj, (DTBFetchManager) obj2);
            f909 = (f907 + 79) % 128;
            return dTBFetchManagerM945;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ HashMap<String, DTBFetchManager> mo697() {
            f909 = (f907 + 91) % 128;
            HashMap<String, DTBFetchManager> mapM946 = m946();
            f907 = (f909 + 121) % 128;
            return mapM946;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m947(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                try {
                    char[] cArr2 = f908;
                    char c10 = f910;
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
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends ThreadPoolExecutor implements hg<ThreadPoolExecutor>, AutoCloseable {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f913 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f914;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f915 = {'T', 37814, 10157, 48036, 20405, 58279, 30669, 3032, 40911, 13286, 51163, 23321, 61186, 33554, 5937, 43823, 16165, 54042, 26445, 64356, 36725, 9063, 46733, 19096, 56965};

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f916 = 3708850498202801140L;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ch f918;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            super(corePoolSize, maximumPoolSize, threadPoolExecutor.getKeepAliveTime(timeUnit), timeUnit, threadPoolExecutor.getQueue());
            this.f918 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private ThreadPoolExecutor m949() {
            int i10 = f914 + 125;
            f913 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 59 / 0;
            }
            return this;
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            v1.h.a(this);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f914 = (f913 + 111) % 128;
            bm.this.m773(this, this.f918, m948(Process.myPid() >> 22, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "", 0) + 25).intern(), runnable);
            super.execute(runnable);
            f914 = (f913 + 79) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ ThreadPoolExecutor mo697() {
            f914 = (f913 + 9) % 128;
            ThreadPoolExecutor threadPoolExecutorM949 = m949();
            f914 = (f913 + 23) % 128;
            return threadPoolExecutorM949;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m948(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1653) {
                try {
                    char[] cArr = new char[i11];
                    d.f1652 = 0;
                    while (true) {
                        int i12 = d.f1652;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f915[i10 + i12]) ^ (((long) i12) * f916)) ^ ((long) c10));
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
    }

    static {
        char[] cArr = new char[1191];
        ByteBuffer.wrap("\u0000.\u0085Õ\u000bÓ\u0091Õ\u0017§\u009d§#\u009e©×/¥µÜ;ßÁÛGÞ\u000f`\u008aº\u0004\u008d\u009e¹\u0018º\u0092³,¨¦¬ «º·4£Î½HºÂ¼\u0000D\u0085«\u000b¼\u0091¼\u0017\u009f\u009d\u008f#\u0093©\u008f/\u0091µ\u0083;\u008f\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0085!\u0091§\u008d-\u0095³\u008b9\u0095¿\u0099\u0000D\u0085«\u000b¼\u0091´\u0017\u0092\u009d\u008f#\u009f©\u008b/\u008bµ\u0083;\u009fÁ\u0081G\u009dÍ\u0092S\u009eÙ°_\u0093å\u009bk\u0087ñ\u009bw\u0085ý\u009f\u0083\u0093\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015®\u009b\u0088!\u0091§\u0081-\u0091³\u00919\u0095¿\u0089E«Ë·Q¼×°]\u009aã¹i\u00adï±u¡û¿\u0081¡\u0007\u00ad\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009dº#\u0099©\u008d/\u0091µ\u0081;\u009fÁ\u0081G\u008d\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0091G\u0091Í\u0085S\u009bÙ\u0092_\u0095åÁk\u008fñ\u0089w\u009fýÅ\u0083®\t½\u008fª\u0015¦\u009b\u0082!¤§\u0087-\u0097³\u008b9\u0097¿\u0089E«Ë§\u0088\u0007\rè\u0083ÿ\u0019ÿ\u009fÛ\u0015ñ«×!Î§Þ=Æ³ÆIÂÏÞEÄÛØQÓ×ß\u0000Y\u0085¶\u000b¡\u0091¡\u0017\u0085\u009dª#\u0088©\u0085/\u0081µ\u008f;\u0099\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081ºÖ?9±.+.\u00ad\n';\u0099\r\u0013\u0018\u0095\u001a\u000f\n\u0081\n{\u0014ý\u0003Z\u0018ß÷QàËàMÄÇñyÏóÀuÓ\u0080]\u0005®\u008b\u00ad\u0011í\u0097£\u001d¨£¥)½¯©5§»æA¯Ç¯M»Ó¥Y¬ß«eÿë±q·÷¡}û\u0003\u0090\u0089\u0083\u000f\u0094\u0095\u0098\u001b¼¡\u008d'³\u00ad¸3«^-ÛÂUÕÏÕIñÃÁ}ú÷êqô\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d\u00ad#\u0093©\u009c/\u008fµ¤;\u0083Á\u0085G\u0084Í\u009cS\u0080Ù\u0085_³å\u0083k\u0087ñ\u0088w\u0082ý\u009fÇhB\u0087Ì\u0090V\u0097ÐµZ£äµn½è\u0092rºü¹\u0006\u00ad\u0080·\n\u00ad\u0094§\u009dé\u0018\u0006\u0096\u0011\f\u0016\u008a4\u0000\"¾44<²\u0018(;¦5\\9Ú>P;Î-jWï¸a¯û¼}\u008a÷\u0086I\u008dÃ\u008fE\u0099ß\u0081Q\u0097\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u0097/\u0096µ\u0092;\u0084Á¹G\u009dÍ\u0080S\u0086Ù\u0094_\u009eå\u008ak\u009c´Y1¶¿¡%¡£\u0085)¤\u0097\u0086\u001d\u0097\u009b\u0080\u0001¨\u008f\u008au\u0086ó\u0087y\u008bç\u009dm ë\u0084Q\u0081ß\u0087E\u0095Ã\u009fI\u00937\u0085\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d¹#\u009b©\u008a/\u009dµ¾;\u0098Á\u0081G\u0091Í\u0081S\u0081Ù\u0085_\u0099å\u009bk\u0087ñ\u008cw\u0080ý§\u0083\u0083\t\u009a\u008f\u009c\u0015\u0082\u009b\u0088!\u0080§\u0096Ù\u0092\\}ÒjHjÎNDnúMpCöBlCâA\u0018@\u009eIÄìA\u0003Ï\u0014U\u0014Ó0Y\u0016ç*m!ë1q1ÿ:\u00058\u00838\t\u0017\u00973\u001d*\u009b,!\"¯(5 ³6\u0000D\u0085«\u000b¼\u0091¼\u0017\u0098\u009d²#\u0094©\u008d/\u009dµ\u0085;\u0085Á\u0081G\u009dÍ\u0087S\u009bÙ\u0090_\u009cå£k\u0087ñ\u009ew\u0098ý\u008e\u0083\u0084\t\u008c\u008f\u009au\u0080ðo~xäxb\\èsVWÜNZHÀVN\\´T2B\u0000T\u0085½\u000b³\u0091\u009c\u0017\u0092\u009d\u009a#\u009d©\u009c/\u008aµ¿;\u0097Á\u0086G\u009cÍ¾S\u0093Ù\u0081\u0000T\u0085½\u000b»\u0091\u0085\u0017\u0099\u009d\u0098#\u008f©\u008d/\u0097µ\u0085;¥Á\u0090G\u0086Í\u0085S\u009bÙ\u0092_\u0095dÃá\ro\u000fõ6s\u0010ù\rG\u001dÍ\tK\tÑ\u0001_\u001d¥\u0003#\u001f©\u00107\u001c½2;\u0011\u0081\u0019\u000f\u0005\u0095\u0019\u0013\u0007\u0099\u001dç\u0011\u0000c\u0085\u0090\u000b\u0093\u0091Ó\u0017\u009d\u009d\u0096#\u009b©\u0083/\u0097µ\u0099;ØÁ\u0094G\u0084Í\u0080SÜÙ\u0090_\u0094å\u009ckÀñ\u008cw\u008fý\u009f\u0083\u0083\t\u009f\u008f\u0081\u0015\u0093\u009b\u009f!Ë§¥-\u0093³\u00919¨¿\u008eE«Ë»Q¯×¯]¯ã³i\u00adï±u¶ûº\u0081\u0094\u0007·\u008d§\u0013»\u0099§\u001f¹¥»+·Æ5CûÍùWÈÑì[Îåíoùéåsõýë\u0007õ\u0081ù9\r¼þ2ý¨½.ó¤ø\u001aõ\u0090í\u0016ù\u008c÷\u0002¶øú~êôîj²àþfúÜòR®ÈâNáÄñºí0ñ¶ï,ý¢ñ\u0018¥\u009eË\u0014ý\u008aÿ\u0000Î\u0086ê|ðòÓhÇîÛdÃÚÝPÃÖÏÑ\nTÄÚÆ@÷ÆÓLæòØx×þÄ\u0093ó\u0016=\u0098?\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d¸#\u0095©\u0097/\u008cµ\u0085;\u0099Á\u0099G\u0098Í\u0096S\u0080\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d·#\u0093©\u008a/\u008cµ\u0092;\u0098Á\u0090G\u0086\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u0081G¸Í\u009aS\u0081Ù\u0085_\u0095å\u0081k\u008bñ\u009f\u0094q\u0011¿\u009f½\u0005\u008c\u0083¨\t\u008d·¥=»»¥!¦¯²\"Å§\u000b)\t³85\u001c¿+\u0001\u0007\u008b\r\r\u0019\u0000A\u0085\u008f\u000b\u008d\u0091¼\u0017\u0098\u009d©#\u009f©\u0088/\u008dµ\u0092;\u0085Á\u00810\u009bµf;v¡@'p\u00adw\u0013M\u0099`\u001f} +%Ö«Æ1÷·Õ=Ã\u0083Õ\tÝ\u008fò\u0015Ú\u009bÙaÍç×mÍóÇyôÿÒEÐËÖQÀ×Î]Ä#Ã\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í±S\u009bÙ\u0095_¹å\u008b,\u009c©a'q½G;c±R\u000fd\u0085q\u0003s\u0099c\u0017cí}kjáK\u007f{õosjÉ`G|Ý`[rÑY¯u\u009a±\u001fL\u0091\\\u000bj\u008dN\u0007\u007f¹I3\\µ^/N¡N[PÝGWlÉICWÅT\u007f\\ñKkHíSgR\u0019R\u0093j\u0015L\u008f]\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í¡S\u0097Ù\u009f_\u0094å\u008ak\u009cñ\u0084w\u0082ý\u008c\u0083§\t\u0088\u008f\u0098a\u009fäbjrðDv`üQBgÈrNpÔ`Z` ~&i¬Y2o¸g>l\u0084r\nd\u0090|\u0016z\u009ctâPhdî~t{úr@xh\"íßcÏùü\u007fÜõØKÞÁÉGÑÝÆSå©Ù/Õ¥Ó;Ø±õ7Ñ\u008dÙ\u0003ù\u0099Í\u001fØ\u0095ÛëÊaßçÙ}áóÖIÓÏÕEÉÛÊQô×Ä-è£ú9õ¿êÉ2LÏÂßXéÞÍTüêÊ`ßæÝ|ÍòÍ\bÓ\u008eÄ\u0004ç\u009aÃ\u0010×\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d©#\u009f©\u008a/\u0088µ\u0098;\u0098Á\u0086G\u0091Í£S\u0080Ù\u0098_\u0093å\u008ak¾ñ\u0082w\u0085ý\u0085\u0083\u009e ñ%\f«\u001c1*·\u000e=>\u0083\u0005\t\u0015\u008f\u000b\u00152\u009b\fa\fç\u0016m0ó1y.ÿ\"U\u0004Ðù^éÄßBûÈËvðüàzþàÕnñ\u0094Â\u0012î\u0098à\u0006ô¬H)µ§¥=\u0093»·1\u0087\u008f¼\u0005¬\u0083²\u0019\u0088\u0097¬m¸ë\u0088a¹ÿ©uªó¶I®Ç¦]±\u0000i\u0085\u008c\u000b¿\u0091\u0099\u0017¯\u009d\u0092#\u0080©\u009c/±µ\u0099;\u0082Á\u0090G\u0086Í\u0080S\u0086Ù\u0098_\u0084å\u0086k\u008fñ\u0081w\u00adý\u008f\u009eÚ\u001b4\u0095\"\u000f%\u00891\u0003'½\u00177\u0002±\u0007++¥;_/Ù%S\fÍ*G+Á={9õ%o-é\u0018c3\u001d=\u00971\u00116\u008b;\u0005-¿\u00119<³*a\u009eäpjfðavuücBSÈFN@ÔrZn k&|¬z2`¸~>^\u0084w\na\u0090f\u0016x\u009cuâr\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/ªµ\u0092;\u0087Á\u0080G\u0091Í\u0080S\u0086É\u0080L}ÂmXXÞrTxêT`pæy|\u007f^¹ÛDUTÏsIPÃL}G÷BqvëFeA\u009fE\u0019^\u0000g\u0085\u009a\u000b\u008a\u0091®\u0017\u0090\u009d\u0094#\u008e©¬/\u008dµ\u009e;\u0092\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u008c\u009d\u0088#»©\u009d/¾µ\u0098;\u0084Á\u0098G\u0095Í\u0087\u0000g\u0085\u009a\u000b\u008a\u0091¼\u0017\u0098\u009d·#\u0095©\u0098/\u009cµ\u0092;\u0084þF{»õ«o\u009dé¹c\u008cÝ²W½Ñ®".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1191);
        f882 = cArr;
        f883 = 1286376246626059775L;
    }

    public bm(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m898(ApsAd apsAd) {
        int i10 = f880 + 91;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAd.getSlotUuid();
        }
        apsAd.getSlotUuid();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static Map<String, String> m899(DTBAdResponse dTBAdResponse) {
        f881 = (f880 + 9) % 128;
        Map<String, String> defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i10 = f880 + 99;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m901() {
        f881 = (f880 + 9) % 128;
        String appKey = AdRegistration.getAppKey();
        f880 = (f881 + 63) % 128;
        return appKey;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBFetchFactory m905() {
        f881 = (f880 + 3) % 128;
        DTBFetchFactory dTBFetchFactory = DTBFetchFactory.getInstance();
        int i10 = f881 + 21;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static List<DTBAdSize> m907(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 61;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getDTBAds();
            throw null;
        }
        List<DTBAdSize> dTBAds = dTBAdResponse.getDTBAds();
        int i11 = f881 + 1;
        f880 = i11 % 128;
        if (i11 % 2 != 0) {
            return dTBAds;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ DTBAdView m908(ApsAd apsAd) {
        int i10 = f880 + 67;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return m904(apsAd);
        }
        m904(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m911(ApsAd apsAd) {
        f880 = (f881 + 125) % 128;
        ApsAdRequest apsAdRequestM906 = m906(apsAd);
        f880 = (f881 + 17) % 128;
        return apsAdRequestM906;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m916(DTBAdResponse dTBAdResponse) {
        int i10 = f881 + 39;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String crid = dTBAdResponse.getCrid();
        if (i11 == 0) {
            int i12 = 55 / 0;
        }
        int i13 = f880 + 43;
        f881 = i13 % 128;
        if (i13 % 2 == 0) {
            return crid;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m919(DTBAdResponse dTBAdResponse) {
        f881 = (f880 + 1) % 128;
        List<DTBAdSize> listM907 = m907(dTBAdResponse);
        int i10 = f880 + 39;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 39 / 0;
        }
        return listM907;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Map m922(DTBAdResponse dTBAdResponse) {
        f881 = (f880 + SignalKey.EVENT_ID) % 128;
        Map<String, String> mapM899 = m899(dTBAdResponse);
        int i10 = f881 + 29;
        f880 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 35 / 0;
        }
        return mapM899;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdFormat m923(ApsAd apsAd) {
        f881 = (f880 + 7) % 128;
        ApsAdFormat apsAdFormatM900 = m900(apsAd);
        int i10 = f880 + 5;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return apsAdFormatM900;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m926(ApsAd apsAd) {
        int i10 = f881 + SignalKey.EVENT_ID;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String strM915 = m915(apsAd);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        return strM915;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ApsAdRequest m929(ApsAd apsAd) {
        f881 = (f880 + 53) % 128;
        ApsAdRequest apsAdRequestM920 = m920(apsAd);
        f881 = (f880 + 15) % 128;
        return apsAdRequestM920;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Bundle m933(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 37;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        Bundle bundleM903 = m903(dTBAdResponse);
        if (i11 != 0) {
            int i12 = 34 / 0;
        }
        return bundleM903;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ a m939(bm bmVar, HashMap map, ch chVar) {
        int i10 = f880 + 115;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        a aVarM934 = bmVar.m934((HashMap<String, DTBFetchManager>) map, chVar);
        if (i11 != 0) {
            int i12 = 77 / 0;
        }
        f880 = (f881 + 27) % 128;
        return aVarM934;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static HashMap<String, Object> m902(DTBAdResponse dTBAdResponse) {
        f880 = (f881 + 119) % 128;
        HashMap<String, Object> renderingMap = dTBAdResponse.getRenderingMap();
        f881 = (f880 + 9) % 128;
        return renderingMap;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static Bundle m903(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 69;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdResponse.getRenderingBundle();
        }
        dTBAdResponse.getRenderingBundle();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static ApsAdRequest m906(ApsAd apsAd) {
        f881 = (f880 + 1) % 128;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        f881 = (f880 + 53) % 128;
        return adLoader;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m909() {
        int i10 = f880 + 7;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return m901();
        }
        m901();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ DTBFetchFactory m912() {
        f881 = (f880 + 81) % 128;
        DTBFetchFactory dTBFetchFactoryM905 = m905();
        f881 = (f880 + 27) % 128;
        return dTBFetchFactoryM905;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static JSONObject m917(DTBAdSize dTBAdSize) {
        f881 = (f880 + 57) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f880 = (f881 + 87) % 128;
        return pubSettings;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m918(ApsAd apsAd) {
        f881 = (f880 + 77) % 128;
        String bidInfo = apsAd.getBidInfo();
        int i10 = f880 + 25;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return bidInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static AdType m921(DTBAdSize dTBAdSize) {
        f880 = (f881 + 71) % 128;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        int i10 = f880 + 31;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return dTBAdType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdType m924(DTBAdSize dTBAdSize) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        AdType adTypeM921 = m921(dTBAdSize);
        if (i11 == 0) {
            int i12 = 8 / 0;
        }
        return adTypeM921;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m927(DTBAdResponse dTBAdResponse) {
        f880 = (f881 + 45) % 128;
        String strM913 = m913(dTBAdResponse);
        int i10 = f880 + 19;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
        return strM913;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m930(DTBAdResponse dTBAdResponse) {
        f881 = (f880 + 73) % 128;
        String strM916 = m916(dTBAdResponse);
        int i10 = f881 + 17;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM916;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m936(ApsAd apsAd) {
        f880 = (f881 + 99) % 128;
        String strM918 = m918(apsAd);
        int i10 = f881 + 3;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM918;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ c m940(bm bmVar, ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return bmVar.m941(threadPoolExecutor, chVar);
        }
        bmVar.m941(threadPoolExecutor, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static ApsAdFormat m900(ApsAd apsAd) {
        f880 = (f881 + SignalKey.EVENT_ID) % 128;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i10 = f881 + 41;
        f880 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 23 / 0;
        }
        return apsAdFormat;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static DTBAdView m904(ApsAd apsAd) {
        int i10 = f881 + 35;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return apsAd.getAdView();
        }
        apsAd.getAdView();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m910(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 99;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdResponse.getImpressionUrl();
            throw null;
        }
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        int i11 = f880 + 63;
        f881 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        return impressionUrl;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m913(DTBAdResponse dTBAdResponse) {
        f880 = (f881 + 17) % 128;
        String bidId = dTBAdResponse.getBidId();
        f880 = (f881 + 13) % 128;
        return bidId;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m915(ApsAd apsAd) {
        f880 = (f881 + 113) % 128;
        String pricePoint = apsAd.getPricePoint();
        f881 = (f880 + 11) % 128;
        return pricePoint;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static ApsAdRequest m920(ApsAd apsAd) {
        int i10 = f880 + 71;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        if (i11 != 0) {
            int i12 = 38 / 0;
        }
        int i13 = f881 + 17;
        f880 = i13 % 128;
        if (i13 % 2 != 0) {
            return apsAdRequest;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m925(DTBAdResponse dTBAdResponse) {
        int i10 = f880 + 9;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        HashMap<String, Object> mapM902 = m902(dTBAdResponse);
        if (i11 != 0) {
            int i12 = 54 / 0;
        }
        return mapM902;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m928(DTBAdSize dTBAdSize) {
        f880 = (f881 + 55) % 128;
        String strM944 = m944(dTBAdSize);
        f881 = (f880 + 79) % 128;
        return strM944;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m932(DTBAdSize dTBAdSize) {
        int i10 = f881 + 119;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return m914(dTBAdSize);
        }
        m914(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m937(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f881 = (f880 + 117) % 128;
        String strM931 = m931(dTBAdResponse, dTBAdSize);
        f880 = (f881 + 95) % 128;
        return strM931;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m942(ApsAd apsAd) {
        int i10 = f881 + 33;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return m898(apsAd);
        }
        m898(apsAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m914(DTBAdSize dTBAdSize) {
        f880 = (f881 + 125) % 128;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        int i10 = f880 + 71;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return zIsInterstitialAd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m931(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        int i10 = f881 + 1;
        f880 = i10 % 128;
        int i11 = i10 % 2;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        if (i11 == 0) {
            int i12 = 10 / 0;
        }
        int i13 = f881 + 21;
        f880 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 37 / 0;
        }
        return pricePoints;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m938(DTBAdSize dTBAdSize) {
        int i10 = f881 + 125;
        f880 = i10 % 128;
        if (i10 % 2 != 0) {
            return m917(dTBAdSize);
        }
        m917(dTBAdSize);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m943(DTBAdResponse dTBAdResponse) {
        f881 = (f880 + 81) % 128;
        String strM910 = m910(dTBAdResponse);
        f880 = (f881 + 3) % 128;
        return strM910;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo691() {
        HashMap map = new HashMap();
        map.put(m935((ViewConfiguration.getKeyRepeatDelay() >> 16) + 753, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 12540), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m909();
            }
        });
        map.put(m935(762 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41036 - (KeyEvent.getMaxKeyCode() >> 16)), 24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m912();
            }
        });
        map.put(m935(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 786, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m927((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935(803 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (11515 - View.MeasureSpec.getMode(0)), 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m930((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935(826 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39638), View.MeasureSpec.getSize(0) + 26).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m943((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 851, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m925((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935(876 - TextUtils.lastIndexOf("", '0'), (char) (TextUtils.indexOf("", "", 0, 0) + 25080), 27 - TextUtils.lastIndexOf("", '0', 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.23
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m933((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935(905 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (26693 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 37 - ExpandableListView.getPackedPositionType(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m922((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935((ViewConfiguration.getWindowTouchSlop() >> 8) + 942, (char) (TextUtils.indexOf((CharSequence) "", '0') + 51542), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.21
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m919((DTBAdResponse) list.get(0));
            }
        });
        map.put(m935(959 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.alpha(0) + 23).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m937((DTBAdResponse) list.get(0), (DTBAdSize) list.get(1));
            }
        });
        map.put(m935(KeyEvent.keyCodeFromString("") + 981, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41110), Drawable.resolveOpacity(0, 0) + 17).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m928((DTBAdSize) list.get(0));
            }
        });
        map.put(m935(999 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (21859 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m924((DTBAdSize) list.get(0));
            }
        });
        map.put(m935(1013 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44079 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m938((DTBAdSize) list.get(0));
            }
        });
        map.put(m935((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1032, (char) (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return Boolean.valueOf(bm.m932((DTBAdSize) list.get(0)));
            }
        });
        map.put(m935(Process.getGidForName("") + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (char) (40633 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m939(bm.this, (HashMap) list.get(0), chVar);
            }
        });
        map.put(m935(TextUtils.lastIndexOf("", '0') + 1086, (char) (TextUtils.indexOf("", "", 0) + 25085), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m940(bm.this, (ThreadPoolExecutor) list.get(0), chVar);
            }
        });
        map.put(m935(1108 - Drawable.resolveOpacity(0, 0), (char) Color.red(0), 14 - TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m929((ApsAd) list.get(0));
            }
        });
        map.put(m935((ViewConfiguration.getTouchSlop() >> 8) + 1123, (char) (51687 - View.combineMeasuredStates(0, 0)), 9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m936((ApsAd) list.get(0));
            }
        });
        map.put(m935(1133 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (24286 - ExpandableListView.getPackedPositionType(0L)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m926((ApsAd) list.get(0));
            }
        });
        map.put(m935(1146 - Color.blue(0), (char) View.combineMeasuredStates(0, 0), 11 - TextUtils.indexOf("", "")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m942((ApsAd) list.get(0));
            }
        });
        map.put(m935((ViewConfiguration.getTouchSlop() >> 8) + 1157, (char) ((-1) - MotionEvent.axisFromString("")), 13 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m923((ApsAd) list.get(0));
            }
        });
        map.put(m935(1171 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m911((ApsAd) list.get(0));
            }
        });
        map.put(m935(View.getDefaultSize(0, 0) + 1182, (char) (65058 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bm.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo694(List<Object> list, ch chVar) {
                return bm.m908((ApsAd) list.get(0));
            }
        });
        f881 = (f880 + 13) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo692() {
        Matcher matcher = Pattern.compile(m935(Color.red(0), (char) Color.red(0), (-16777203) - Color.rgb(0, 0, 0)).intern()).matcher(mo774());
        if (!matcher.matches()) {
            return null;
        }
        int i10 = f880 + 21;
        f881 = i10 % 128;
        String strGroup = matcher.group(i10 % 2 == 0 ? 1 : 0);
        int i11 = f881 + 59;
        f880 = i11 % 128;
        if (i11 % 2 != 0) {
            return strGroup;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private a m934(HashMap<String, DTBFetchManager> map, ch chVar) {
        a aVar = new a(map, chVar);
        f880 = (f881 + 65) % 128;
        return aVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final String mo774() {
        int i10 = f881 + 23;
        f880 = i10 % 128;
        if (i10 % 2 == 0) {
            AdRegistration.getVersion();
            throw null;
        }
        String version = AdRegistration.getVersion();
        f881 = (f880 + 75) % 128;
        return version;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m935(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f882[i10 + i12]) ^ (((long) i12) * f883)) ^ ((long) c10));
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x06b8  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo693(String str) {
        byte b10;
        byte b11;
        switch (str.hashCode()) {
            case -2137858584:
                if (!str.equals(m935((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 203, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 29), 10 - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    b10 = -1;
                } else {
                    f881 = (f880 + 29) % 128;
                    b10 = 8;
                }
                break;
            case -2133119933:
                if (!str.equals(m935(673 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f880 + 105;
                    f881 = i10 % 128;
                    b11 = i10 % 2 != 0 ? (byte) 33 : (byte) 34;
                    b10 = b11;
                }
                break;
            case -1987686071:
                if (!str.equals(m935(482 - View.combineMeasuredStates(0, 0), (char) (MotionEvent.axisFromString("") + 30149), 13 - Color.argb(0, 0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 24;
                }
                break;
            case -1885106463:
                if (!str.equals(m935(27 - (Process.myPid() >> 22), (char) View.getDefaultSize(0, 0), 11 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    f880 = (f881 + 57) % 128;
                    b10 = 1;
                }
                break;
            case -1879113962:
                if (!str.equals(m935(280 - View.getDefaultSize(0, 0), (char) (24169 - Gravity.getAbsoluteGravity(0, 0)), 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case -1879025222:
                if (!str.equals(m935(240 - Drawable.resolveOpacity(0, 0), (char) (23180 - AndroidCharacter.getMirror('0')), 10 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f881 + 115;
                    f880 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (byte) 11 : (byte) 105;
                }
                break;
            case -1554728876:
                if (!str.equals(m935(93 - Process.getGidForName(""), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.combineMeasuredStates(0, 0) + 45).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1464660218:
                if (!str.equals(m935(395 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case -1358954558:
                if (!str.equals(m935((Process.myPid() >> 22) + 311, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 50987), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -1293925587:
                if (!str.equals(m935(71 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1291566264:
                if (!str.equals(m935((ViewConfiguration.getEdgeSlop() >> 16) + 741, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12).intern())) {
                    b10 = -1;
                } else {
                    b10 = 39;
                }
                break;
            case -1092884085:
                if (!str.equals(m935(153 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ('0' - AndroidCharacter.getMirror('0')), ImageFormat.getBitsPerPixel(0) + 36).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -1090060454:
                if (!str.equals(m935(216 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Color.green(0), 11 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -832298225:
                if (!str.equals(m935(495 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 16).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.C;
                }
                break;
            case -791598050:
                if (!str.equals(m935((KeyEvent.getMaxKeyCode() >> 16) + 721, (char) (TextUtils.indexOf("", "", 0, 0) + 37936), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f881 + 7;
                    f880 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 37 : (byte) 122;
                }
                break;
            case -723985259:
                if (!str.equals(m935(341 - Color.red(0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 27155), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case -696695160:
                if (!str.equals(m935((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 33 - (Process.myTid() >> 22)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -694845532:
                if (!str.equals(m935(Color.alpha(0) + 139, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -466918522:
                if (!str.equals(m935(371 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46109 - View.resolveSize(0, 0)), 24 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case -341719851:
                if (!str.equals(m935(352 - View.resolveSize(0, 0), (char) View.MeasureSpec.getMode(0), 19 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f880 + 75;
                    f881 = i13 % 128;
                    b11 = i13 % 2 != 0 ? (byte) 118 : zi.c.f161643u;
                    b10 = b11;
                }
                break;
            case -300800492:
                if (!str.equals(m935(TextUtils.getOffsetAfter("", 0) + d1.n.f77587u, (char) Color.blue(0), Color.alpha(0) + 17).intern())) {
                    b10 = -1;
                } else {
                    int i14 = f881 + 89;
                    f880 = i14 % 128;
                    b10 = i14 % 2 != 0 ? zi.c.D : (byte) 127;
                }
                break;
            case -197992833:
                if (!str.equals(m935((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 528, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25729), 23 - Color.red(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.E;
                }
                break;
            case -27446238:
                if (!str.equals(m935(TextUtils.getOffsetBefore("", 0) + 436, (char) (50345 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 21 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 22;
                }
                break;
            case 66052:
                if (!str.equals(m935(665 - View.combineMeasuredStates(0, 0), (char) (37810 - TextUtils.indexOf("", "")), KeyEvent.normalizeMetaState(0) + 3).intern())) {
                    b10 = -1;
                } else {
                    b10 = 32;
                }
                break;
            case 63478087:
                if (!str.equals(m935(Drawable.resolveOpacity(0, 0) + 668, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5).intern())) {
                    b10 = -1;
                } else {
                    b10 = 33;
                }
                break;
            case 355568411:
                if (!str.equals(m935((ViewConfiguration.getDoubleTapTimeout() >> 16) + 688, (char) (Process.myTid() >> 22), TextUtils.getOffsetBefore("", 0) + 13).intern())) {
                    b10 = -1;
                } else {
                    b10 = 35;
                }
                break;
            case 568188517:
                if (!str.equals(m935(Gravity.getAbsoluteGravity(0, 0) + 326, (char) (40365 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 15 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case 620798166:
                if (!str.equals(m935((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 227, (char) (TextUtils.indexOf((CharSequence) "", '0') + 47763), 13 - Color.argb(0, 0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 788901082:
                if (!str.equals(m935(View.resolveSize(0, 0) + 423, (char) (TextUtils.indexOf("", "", 0, 0) + 55766), 13 - TextUtils.indexOf("", "")).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161647y;
                }
                break;
            case 1036908700:
                if (!str.equals(m935(14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 3874), 14 - TextUtils.indexOf("", "", 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 1251356764:
                if (!str.equals(m935((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, (char) (14702 - View.getDefaultSize(0, 0)), 41 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    f881 = (f880 + 13) % 128;
                    b10 = zi.c.H;
                }
                break;
            case 1306698049:
                if (!str.equals(m935(ExpandableListView.getPackedPositionType(0L) + 187, (char) (34883 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ((Process.getThreadPriority(0) + 20) >> 6) + 17).intern())) {
                    b10 = -1;
                } else {
                    f880 = (f881 + 51) % 128;
                    b10 = 7;
                }
                break;
            case 1328085269:
                if (!str.equals(m935(((Process.getThreadPriority(0) + 20) >> 6) + 457, (char) Color.red(0), TextUtils.indexOf("", "", 0) + 25).intern())) {
                    b10 = -1;
                } else {
                    b10 = 23;
                }
                break;
            case 1340383521:
                if (!str.equals(m935((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 732, (char) (8836 - (Process.myPid() >> 22)), 9 - Color.alpha(0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 38;
                }
                break;
            case 1340427404:
                if (!str.equals(m935(TextUtils.lastIndexOf("", '0', 0) + 657, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53579), 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 31;
                }
                break;
            case 1600627740:
                if (!str.equals(m935((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 700, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 19 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    b10 = -1;
                } else {
                    f881 = (f880 + 53) % 128;
                    b10 = 36;
                }
                break;
            case 1648408950:
                if (!str.equals(m935(602 - View.resolveSizeAndState(0, 0, 0), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 50804), (Process.myTid() >> 22) + 13).intern())) {
                    b10 = -1;
                } else {
                    b10 = 29;
                }
                break;
            case 1713728997:
                if (!str.equals(m935(ExpandableListView.getPackedPositionChild(0L) + 552, (char) (AndroidCharacter.getMirror('0') - '0'), Color.red(0) + 51).intern())) {
                    b10 = -1;
                } else {
                    b10 = 28;
                }
                break;
            case 2019413793:
                if (!str.equals(m935(249 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Color.argb(0, 0, 0, 0) + 32830), (ViewConfiguration.getWindowTouchSlop() >> 8) + 31).intern())) {
                    b10 = -1;
                } else {
                    b10 = zi.c.f161636n;
                }
                break;
            case 2144664800:
                if (!str.equals(m935((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 289, (char) (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 22).intern())) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return AdRegistration.class;
            case 1:
            case 2:
                return DTBActivity.class;
            case 3:
            case 4:
                return DTBInterstitialActivity.class;
            case 5:
            case 6:
                return DTBAdActivity.class;
            case 7:
                return DTBAdInterstitial.class;
            case 8:
                return DTBAdLoader.class;
            case 9:
                return DTBAdRequest.class;
            case 10:
                return DTBAdResponse.class;
            case 11:
            case 12:
                return DTBAdView.class;
            case 13:
                return DTBAdSize.class;
            case 14:
                return DTBAdViewSupportClient.class;
            case 15:
                return DTBFetchFactory.class;
            case 16:
                return DTBFetchManager.class;
            case 17:
                return DTBRenderer.class;
            case 18:
                return DTBAdBannerListener.class;
            case 19:
                return DTBAdBaseBannerListener.class;
            case 20:
                return DTBAdBaseInterstitialListener.class;
            case 21:
                return DTBAdCallback.class;
            case 22:
                return DTBAdExpandedListener.class;
            case 23:
                return DTBAdInterstitialListener.class;
            case 24:
                return DTBAdListener.class;
            case 25:
                return a.class;
            case 26:
                return c.class;
            case 27:
            case 28:
                return ApsInterstitialActivity.class;
            case 29:
            case 30:
                return ApsAdActivity.class;
            case 31:
                return ApsAdView.class;
            case 32:
                return Aps.class;
            case 33:
                return ApsAd.class;
            case 34:
                return ApsAdController.class;
            case 35:
                return ApsAdListener.class;
            case 36:
                return ApsAdRequestListener.class;
            case 37:
                return ApsAdFormat.class;
            case 38:
                return ApsAdType.class;
            case 39:
                return ApsAdRequest.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m944(DTBAdSize dTBAdSize) {
        int i10 = f880 + 95;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            dTBAdSize.getSlotUUID();
            throw null;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        int i11 = f880 + 25;
        f881 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 4 / 0;
        }
        return slotUUID;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private c m941(ThreadPoolExecutor threadPoolExecutor, ch chVar) {
        c cVar = new c(threadPoolExecutor, chVar);
        f880 = (f881 + 105) % 128;
        return cVar;
    }
}
