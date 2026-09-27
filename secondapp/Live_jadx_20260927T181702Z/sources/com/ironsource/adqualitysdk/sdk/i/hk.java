package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.util.List;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class hk extends WebViewClient implements bb.e, cl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2330 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2331;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2332;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2333;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WebViewClient f2334;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WebViewClient f2335;

    static {
        char[] cArr = new char[1031];
        ByteBuffer.wrap("ãðº~P½îÅ\u0085>#nù¸\u0097À.+ÄRb\u009a8Ý×\u0003mo\u000b\u008a¡Àx\b\u0016©¬þK'áx¿¹\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDá\u009e\u0002ø@Q¤«Ë\u0005\u0001_x¸±\u0012úl7Æ$\u001f½yöÓ,,Õ\u00044]¿·{\t*bóÄý\u001epp;É±#\u0080\u0085fß\u00170È\u008a\u009aìPF\u001b\u009fòñaK ¬à\u0006¯Xi²y\u000bæm¹ÇB\u0019\u001crÉÔ\u0085.r\u0080\u000fÙÐ3\u0083\u0095?îà@¡\u009adü\bUë¯¹\u0001][\u0002¼È\u0016\u0081hHÂ\u0013\u001bÞ}Ý×D(ÿ\u0082¥ä,\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDá\u009e\u0002ø@Q¤«Ë\u0005\u0001_x¸±\u0012úl7Æ$\u001fºyáÓ1,\u0089\u0086Ýà\u0007:D\u0093Å\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\u0017Ûf4¹\u008eëè!Bj\u009b\u0083õ\u0010OQ¨\u0091\u0002Þ\\\u0018¶\b\u000f\u0097iÈÃ3\u001dmv¸Ðô*\u0003\u0084~Ý¡7ò\u0091Nê\u0091DÐ\u009e\u0015øyQ\u009a«È\u0005,_s¸¹\u0012ðl9Æb\u001f¯y¬Ó2,\u0099\u0086Éà\u0001:U\u0093\u009fíÜGMî\u009d·\u0016]Òã\u0083\u0088Z.TôÙ\u009a\u0092#\u0018É)oÔ5®ÚD`=\u0006ã¬¨u}\u001bÊ¡\u0085F^ìH²ÛX\u009eál\u0087\u0019-ãó¥\u0098_><Äõj¢3hÙ=\u007f\u0080\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f´iÁÃ;\u001d}v\u0092Ðù*\"\u0084aÝ·7è\u0091Yê\u009c¿\u008bæ\u0000\fÄ²\u0095ÙL\u007fB¥ÏË\u0084r\u000e\u0098?>Âd¸\u008bR1+Wõý¾$kJÜð\u0093\u0017H½^ãÍ\t\u0088°fÖ\u0001|ó¢²ÉHo;\u0095ñ;©b\u007f\u0088<.\u0091US\u0000VYÝ³\u0019\rHf\u0091À\u009f\u001a\u0012tYÍÓ'â\u0081\u001fÛe4\u008f\u008eöè(Bc\u009b¶õ\u0001ON¨\u0095\u0002\u0083\\\f¶S\u000f\u0098iÆÃ#\u001dov\u008eÐí*+\u0084~Ý¥7ð\u0091Jê\u009bDÓ\u009e1øZQ\u008a«Â\u0005\u0016_|¸¿\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f°iÏÃ3\u001dUvµÐþ*5\u0084ZÝ¡7ä\u0091Uê\u008aDÑ\u009e\u0013øXQ\u009bA\u0013\u0018\u0098ò\\L\r'Ô\u0081Ú[W5\u001c\u008c\u0096f§ÀZ\u009a uÊÏ³©m\u0003&Úó´D\u000e\u000béÐCÆ\u001dU÷\u0010Nà(\u0093\u0082i\\+7ë\u0091°k\u007fÅ:\u009c×v¤Ð\u0018«Á\u0005\u0090\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¢iÏÃ.\u001duv\u0086Ðõ*?\u0084}Ý¦7í\u0091Uê\u008bDÇ\u009e\u0019øCQ\u0086\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ó\u00816ÛR4¿\u008eþè%BV\u009b¥õ\u000fOM¨\u0096\u0002Ý\\\u0005¶[\u000f\u0097iÉÃ3\u001dv\u0080¢Ù)3í\u008d¼æe@k\u009aæô\u00adM'§\u0016\u0001ë[\u0091´{\u000e\u0002hÜÂ\u0097\u001bBuõÏº(a\u0082wÜï6 \u008fVé7Cß\u009d\u009eöGP\u0012ªý\u0004\u0086]P·\u000e\u0011¯jzÄ7\u001eßx¢Ñ|+7\u0085èß\u00898F9ª`!\u008aå4´_mùc#îM¥ô/\u001e\u001e¸ãâ\u0099\rs·\nÑÔ{\u009f¢JÌýv²\u0091i;\u007feì\u008f©6YP*úÐ$\u0092ORé\t\u0013Æ½\u0083äx\u000e\u001c¨¿ÓR})§íÁ¬hu\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u00877ì\u0091Uê\u009dDÚ\u009e\u0004øoQ\u008d«Ö\u0005\u0014_N¸½\u0012ål%Æi\u001f»yðMj\u0014áþ%@t+\u00ad\u008d£W.9e\u0080ïjÐÌ\u0016\u0096Wy\u0093ÃÊ¥\t\u000fLÖÏ¸<\u0002eå²Oø\u0011*ûiBë$à\u008e\u001dPe;\u009e\u009dÜg\u0006ÉN\u0090\u009dzÊÜw§\u0094\t÷Ó6µf\u001c©æÿH\f\u0012Võ\u0085_Ï!-\u008bFR\u00964Þ\u009e\na Ëã\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u008c7ô\u0091Hê\u0088Dõ\u009e\u0005øXQ\u0080«ö\u0005\u0005_m¸\u00ad\u0012ñl#Æx\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u001f¶@\u000f\u008biÕÃ0\u001d|v\u009bÐæ*)\u0084zÝ¶7é\u0091Xê\u009dDÿ\u009e\u0015øUQ\u00ad«Ò\u0005\u0005_r¸¬\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f±iÎÃ4\u001dyvºÐô* \u0084mÝ 7Ë\u0091Yê\u0081Dñ\u009e\u0006øIQ\u0086«Ð\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f·iÃÃ=\u001dtv±ÐÓ*$\u0084iÝª7ç\u0091Yê\u009c\u0000EYÎ³\n\r[f\u0082À\u008c\u001a\u0001tJÍÀ'ñ\u0081\fÛv4\u009c\u008eåè;Bp\u009b¥õ\u0012O]¨\u0086\u0002\u0090\\\u0003¶F\u000f¶iÅÃ?\u001d}v½Ðæ*)\u0084lÝ\u00887ï\u0091[ê\u0091DÚ\u009e\"øIQ\u0099«Ñ\u0005\u0005_o¸¬\u008e*×¡=e\u00834èíNã\u0094nú%C¯©\u009e\u000fcU\u0019ºó\u0000\u008afTÌ\u001f\u0015Ê{}Á2&é\u008cÿÒl8)\u0081ÙçªMP\u0093\u0012øÒ^\u0089¤F\n\u0003Sã¹\u009b\u001f'dçÊ\u009e\u0010mv1ßè%¹f\u009b?\u0010ÕÔk\u0085\u0000\\¦R|ß\u0012\u0094«\u001eA/çÒ½¨RBè;\u008eå$®ý{\u0093Ì)\u0083ÎXdN:ÝÐ\u0098ih\u000f\u001b¥ì{¢\u0010o¶<LÂâ¤»uQ=÷\u0087\u008cU\"\u0019øé\u009e\u009d7XÍ\u001f\u0000gYÙ³\f\rcf\u0082ÀÍ\u001a\u0018tTÍ\u0085'ø\u0081\u000fÛq4²\u008eÚè!Ba\u009b·õ?OT¨\u009d\u0002Õ\\\u0002¶\\þ\u0095§+Mþó\u0092\u0098`>\täÿ\u008a´3DÙ\u0007\u007fÏ%\u0091Êap\u0012\u0016Ó¼\u0093e\\\u000bú".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1031);
        f2333 = cArr;
        f2331 = 697491909067233724L;
    }

    public hk(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f2334 = webViewClient;
        this.f2335 = webViewClient2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r9 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.hk.f2330 = (r2 + 115) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 != false) goto L16;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2210(android.webkit.WebView r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hk.m2210(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m2211() {
        int i10 = (f2332 + 57) % 128;
        f2330 = i10;
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            return false;
        }
        int i11 = i10 + 65;
        f2332 = i11 % 128;
        if (i11 % 2 == 0) {
            return !webViewClient.getClass().equals(WebViewClient.class);
        }
        webViewClient.getClass().equals(WebViewClient.class);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WebViewClient m2212() {
        int i10 = f2332 + 105;
        f2330 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f2334;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m2213() {
        int i10 = f2330;
        WebViewClient webViewClient = this.f2335;
        int i11 = i10 + 99;
        f2332 = i11 % 128;
        if (i11 % 2 == 0) {
            return webViewClient;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        int i10 = f2330 + 21;
        f2332 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2335.doUpdateVisitedHistory(webView, str, z10);
                int i11 = 69 / 0;
            } else {
                this.f2335.doUpdateVisitedHistory(webView, str, z10);
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(View.MeasureSpec.getSize(0), (char) (58279 - (ViewConfiguration.getLongPressTimeout() >> 16)), 22 - TextUtils.indexOf("", "", 0)).intern(), m2209(View.resolveSizeAndState(0, 0, 0) + 522, (char) (Color.blue(0) + 32999), 44 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.doUpdateVisitedHistory(webView, str, z10);
            return;
        }
        int i12 = f2330 + 83;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
        } else {
            webViewClient.doUpdateVisitedHistory(webView, str, z10);
            int i13 = 18 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        f2332 = (f2330 + 51) % 128;
        try {
            this.f2335.onFormResubmission(webView, message, message2);
            f2330 = (f2332 + 95) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209(Color.red(0), (char) (58279 - View.MeasureSpec.getSize(0)), 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2209((ViewConfiguration.getTapTimeout() >> 16) + 456, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ImageFormat.getBitsPerPixel(0) + 40).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2334;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        } catch (Error e10) {
            kd.m2827(m2209((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (Color.green(0) + 58279), 22 - Drawable.resolveOpacity(0, 0)).intern(), m2209(View.resolveSize(0, 0) + 495, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 27).intern(), e10, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        int i10 = f2332 + 93;
        f2330 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2335.onLoadResource(webView, str);
                int i11 = 69 / 0;
            } else {
                this.f2335.onLoadResource(webView, str);
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getPressedStateDuration() >> 16, (char) (58278 - TextUtils.indexOf((CharSequence) "", '0', 0)), 22 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), m2209((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 302, (char) (49101 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            f2330 = (f2332 + 93) % 128;
            return;
        }
        int i12 = f2332 + 27;
        f2330 = i12 % 128;
        if (i12 % 2 != 0) {
            webViewClient.onLoadResource(webView, str);
        } else {
            webViewClient.onLoadResource(webView, str);
            int i13 = 64 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 23)
    public void onPageCommitVisible(WebView webView, String str) {
        int i10 = f2330 + 37;
        f2332 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2335.onPageCommitVisible(webView, str);
                throw null;
            }
            this.f2335.onPageCommitVisible(webView, str);
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onPageCommitVisible(webView, str);
                return;
            }
            int i11 = f2332 + 59;
            f2330 = i11 % 128;
            if (i11 % 2 != 0) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                webViewClient.onPageCommitVisible(webView, str);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getPressedStateDuration() >> 16, (char) (58279 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m2209(234 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61144), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        int i10 = f2332 + 41;
        f2330 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2335.onPageFinished(webView, str);
                int i11 = 80 / 0;
            } else {
                this.f2335.onPageFinished(webView, str);
            }
        } catch (Throwable th2) {
            kd.m2827(m2209((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58279), 21 - MotionEvent.axisFromString("")).intern(), m2209(268 - View.MeasureSpec.getMode(0), (char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 35).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onPageFinished(webView, str);
            return;
        }
        int i12 = f2330 + 61;
        f2332 = i12 % 128;
        if (i12 % 2 == 0) {
            webViewClient.onPageFinished(webView, str);
        } else {
            webViewClient.onPageFinished(webView, str);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f2335.onPageStarted(webView, str, bitmap);
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (58279 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern(), m2209(233 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (61144 - (Process.myTid() >> 22)), View.MeasureSpec.getSize(0) + 34).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            f2332 = (f2330 + 111) % 128;
            webViewClient.onPageStarted(webView, str, bitmap);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        int i10 = f2332 + 123;
        f2330 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 21)
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        f2330 = (f2332 + 121) % 128;
        try {
            this.f2335.onReceivedClientCertRequest(webView, clientCertRequest);
        } catch (Throwable th2) {
            kd.m2827(m2209((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (58279 - Color.blue(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 23).intern(), m2209(View.MeasureSpec.makeMeasureSpec(0, 0) + 604, (char) View.getDefaultSize(0, 0), 47 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th2, false);
        }
        try {
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                f2330 = (f2332 + 61) % 128;
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        } catch (Throwable th3) {
            kd.m2827(m2209(View.MeasureSpec.makeMeasureSpec(0, 0), (char) (58279 - (KeyEvent.getMaxKeyCode() >> 16)), 22 - ExpandableListView.getPackedPositionType(0L)).intern(), m2209(652 - View.getDefaultSize(0, 0), (char) (19759 - TextUtils.indexOf("", "")), ((Process.getThreadPriority(0) + 20) >> 6) + 51).intern(), th3, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        int i11 = f2332 + 115;
        f2330 = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                this.f2335.onReceivedError(webView, i10, str, str2);
                throw null;
            }
            this.f2335.onReceivedError(webView, i10, str, str2);
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onReceivedError(webView, i10, str, str2);
                return;
            }
            int i12 = f2330 + 59;
            f2332 = i12 % 128;
            if (i12 % 2 == 0) {
                webViewClient.onReceivedError(webView, i10, str, str2);
            } else {
                webViewClient.onReceivedError(webView, i10, str, str2);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(View.resolveSize(0, 0), (char) (58279 - TextUtils.getOffsetBefore("", 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22).intern(), m2209(468 - AndroidCharacter.getMirror('0'), (char) (16727 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 36).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        try {
            this.f2335.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            f2332 = (f2330 + 69) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209(Process.myTid() >> 22, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58278), TextUtils.getOffsetAfter("", 0) + 22).intern(), m2209(704 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) Color.alpha(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        int i10 = f2330 + 77;
        f2332 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f2335.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            f2332 = (f2330 + 95) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209(ExpandableListView.getPackedPositionType(0L), (char) (58279 - Color.blue(0)), TextUtils.getTrimmedLength("") + 22).intern(), m2209(910 - (Process.myTid() >> 22), (char) (TextUtils.getOffsetBefore("", 0) + 36463), ((byte) KeyEvent.getModifierMetaStateMask()) + 41).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            f2332 = (f2330 + 27) % 128;
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        int i10 = f2330 + 99;
        f2332 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2335.onReceivedLoginRequest(webView, str, str2, str3);
                int i11 = 24 / 0;
            } else {
                this.f2335.onReceivedLoginRequest(webView, str, str2, str3);
            }
        } catch (Throwable th2) {
            kd.m2827(m2209((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (58279 - Gravity.getAbsoluteGravity(0, 0)), 22 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m2209(Color.alpha(0) + 867, (char) ExpandableListView.getPackedPositionGroup(0L), 42 - ExpandableListView.getPackedPositionChild(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            f2332 = (f2330 + 85) % 128;
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i10 = f2332 + 65;
        f2330 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2335.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
            this.f2335.onReceivedSslError(webView, sslErrorHandler, sslError);
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                return;
            }
            int i11 = f2332 + 115;
            f2330 = i11 % 128;
            if (i11 % 2 != 0) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getEdgeSlop() >> 16, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58279), 22 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2209((-16776651) - Color.rgb(0, 0, 0), (char) (14831 - View.resolveSizeAndState(0, 0, 0)), 39 - TextUtils.getCapsMode("", 0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            this.f2335.onRenderProcessGone(webView, renderProcessGoneDetail);
            f2332 = (f2330 + 77) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (Color.rgb(0, 0, 0) + 16835495), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22).intern(), m2209(949 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26334), (Process.myTid() >> 22) + 40).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            return true;
        }
        boolean zOnRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
        int i10 = f2330 + 21;
        f2332 = i10 % 128;
        if (i10 % 2 == 0) {
            return zOnRenderProcessGone;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f10, float f11) {
        int i10 = f2332 + 99;
        f2330 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                this.f2335.onScaleChanged(webView, f10, f11);
                throw null;
            }
            this.f2335.onScaleChanged(webView, f10, f11);
            WebViewClient webViewClient = this.f2334;
            if (webViewClient == null) {
                super.onScaleChanged(webView, f10, f11);
                return;
            }
            int i11 = f2332 + 111;
            f2330 = i11 % 128;
            if (i11 % 2 != 0) {
                webViewClient.onScaleChanged(webView, f10, f11);
            } else {
                webViewClient.onScaleChanged(webView, f10, f11);
                throw null;
            }
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getTouchSlop() >> 8, (char) (58279 - ExpandableListView.getPackedPositionGroup(0L)), 21 - TextUtils.lastIndexOf("", '0')).intern(), m2209(832 - View.MeasureSpec.getMode(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 35 - View.resolveSizeAndState(0, 0, 0)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i10 = f2330 + 25;
        f2332 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2335.onTooManyRedirects(webView, message, message2);
                int i11 = 79 / 0;
            } else {
                this.f2335.onTooManyRedirects(webView, message, message2);
            }
            f2330 = (f2332 + 113) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 58280), TextUtils.indexOf("", "", 0, 0) + 22).intern(), m2209(381 - ExpandableListView.getPackedPositionGroup(0L), (char) (AndroidCharacter.getMirror('0') - '0'), 39 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        int i12 = f2332 + 21;
        f2330 = i12 % 128;
        if (i12 % 2 != 0) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            webViewClient.onTooManyRedirects(webView, message, message2);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2335.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58279), 22 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), m2209(792 - Color.alpha(0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', 0, 0) + 41).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        f2330 = (f2332 + 77) % 128;
        webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        int i10 = f2332 + 61;
        f2330 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        f2330 = (f2332 + 71) % 128;
        try {
            this.f2335.shouldInterceptRequest(webView, str);
            f2332 = (f2330 + 9) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209(KeyEvent.keyCodeFromString(""), (char) (58279 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22).intern(), m2209(ImageFormat.getBitsPerPixel(0) + 339, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18), 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            return webViewClient.shouldInterceptRequest(webView, str);
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, str);
        int i10 = f2330 + 91;
        f2332 = i10 % 128;
        if (i10 % 2 == 0) {
            return webResourceResponseShouldInterceptRequest;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        try {
            this.f2335.shouldOverrideKeyEvent(webView, keyEvent);
        } catch (Throwable th2) {
            kd.m2827(m2209((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) (View.resolveSizeAndState(0, 0, 0) + 58279), 22 - View.MeasureSpec.getSize(0)).intern(), m2209((ViewConfiguration.getPressedStateDuration() >> 16) + 749, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 43 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        f2332 = (f2330 + 89) % 128;
        boolean zShouldOverrideKeyEvent = webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        f2332 = (f2330 + 59) % 128;
        return zShouldOverrideKeyEvent;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = f2330 + 49;
        f2332 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2210 = m2210(webView, str, false);
        f2330 = (f2332 + 47) % 128;
        return zM2210;
    }

    @t0(api = 24)
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2214(WebView webView, WebResourceRequest webResourceRequest, boolean z10) {
        boolean zShouldOverrideUrlLoading;
        try {
            if (this.f2335.shouldOverrideUrlLoading(webView, webResourceRequest) || z10) {
                WebViewClient webViewClient = this.f2334;
                if (webViewClient instanceof hk) {
                    int i10 = f2330 + 65;
                    f2332 = i10 % 128;
                    int i11 = i10 % 2;
                    ((hk) webViewClient).m2214(webView, webResourceRequest, true);
                }
                return true;
            }
            f2330 = (f2332 + 21) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209((Process.getThreadPriority(0) + 20) >> 6, (char) (58280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21).intern(), m2209(125 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 54 - KeyEvent.keyCodeFromString("")).intern(), th2, false);
        }
        WebViewClient webViewClient2 = this.f2334;
        if (webViewClient2 != null) {
            int i12 = f2330 + 91;
            f2332 = i12 % 128;
            try {
                if (i12 % 2 != 0) {
                    zShouldOverrideUrlLoading = webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                    int i13 = 40 / 0;
                } else {
                    zShouldOverrideUrlLoading = webViewClient2.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                return zShouldOverrideUrlLoading;
            } catch (Throwable th3) {
                kd.m2827(m2209(Process.myPid() >> 22, (char) (KeyEvent.keyCodeFromString("") + 58279), ExpandableListView.getPackedPositionGroup(0L) + 22).intern(), m2209(178 - Color.argb(0, 0, 0, 0), (char) TextUtils.getCapsMode("", 0, 0), 'h' - AndroidCharacter.getMirror('0')).intern(), th3, false);
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        f2332 = (f2330 + 7) % 128;
        boolean zM2214 = m2214(webView, webResourceRequest, false);
        int i10 = f2332 + 37;
        f2330 = i10 % 128;
        if (i10 % 2 != 0) {
            return zM2214;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f2335.onReceivedError(webView, webResourceRequest, webResourceError);
            f2332 = (f2330 + 1) % 128;
        } catch (Throwable th2) {
            kd.m2827(m2209((-1) - TextUtils.lastIndexOf("", '0'), (char) (58279 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.rgb(0, 0, 0) + 16777238).intern(), m2209((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 419, (char) (16726 - KeyEvent.keyCodeFromString("")), 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            f2332 = (f2330 + 55) % 128;
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    @t0(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        f2330 = (f2332 + 57) % 128;
        try {
            this.f2335.shouldInterceptRequest(webView, webResourceRequest);
        } catch (Throwable th2) {
            kd.m2827(m2209(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (58279 - Color.alpha(0)), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2209(Color.rgb(0, 0, 0) + 16777554, (char) (20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 43 - ExpandableListView.getPackedPositionType(0L)).intern(), th2, false);
        }
        WebViewClient webViewClient = this.f2334;
        if (webViewClient != null) {
            int i10 = f2330 + 45;
            f2332 = i10 % 128;
            if (i10 % 2 == 0) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            throw null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo767(String str, List<Object> list, ch chVar) {
        f2332 = (f2330 + 101) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != 368095040) {
            if (iHashCode != 381550901 || !str.equals(m2209(989 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                return null;
            }
            f2332 = (f2330 + 11) % 128;
        } else {
            if (!str.equals(m2209((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1013, (char) (65265 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18).intern())) {
                return null;
            }
            int i10 = f2330 + 5;
            f2332 = i10 % 128;
            if (i10 % 2 == 0) {
                return m2213();
            }
        }
        return m2212();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2209(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2333[i10 + i12]) ^ (((long) i12) * f2331)) ^ ((long) c10));
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
