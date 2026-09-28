package com.sportybet.android.luckynumber;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import defpackage.bwl;
import defpackage.cgd;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.k5b;
import defpackage.k8u;
import defpackage.l8u;
import defpackage.mkh;
import defpackage.mwo;
import defpackage.nas;
import defpackage.nlh;
import defpackage.odd;
import defpackage.qlh;
import defpackage.rym;
import defpackage.s52;
import defpackage.tug;
import defpackage.u420;
import defpackage.v420;
import defpackage.zi50;
import defpackage.zvo;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/luckynumber/LuckyNumberWebView;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "Lv420;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LuckyNumberWebView extends bwl implements v420 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final String E;
    public static final Regex w = new Regex("[^A-Za-z0-9._-]");
    public static final byte[] y = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] z = {-1, -40, -1};
    public rym b;
    public k5b c;
    public odd d;
    public cgd e;
    public u420.f f = new u420.f("unknown");
    public String i = "";
    public final Object v = new Object();

    /* JADX INFO: loaded from: classes.dex */
    public final class a {
        public a() {
        }

        @JavascriptInterface
        public final void postMessage(String str, String str2, String str3) {
            Regex regex = LuckyNumberWebView.w;
            if (str2 == null || StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
            } else if (str == null || StringsKt.U(str)) {
                str = null;
            }
            LuckyNumberWebView luckyNumberWebView = LuckyNumberWebView.this;
            nas nasVarA = ebs.a(luckyNumberWebView.getLifecycle());
            k5b k5bVar = luckyNumberWebView.c;
            if (k5bVar != null) {
                ej5.c(nasVarA, k5bVar, null, new l8u(luckyNumberWebView, str3, str, null), 2);
            } else {
                Intrinsics.n("mainDispatcher");
                throw null;
            }
        }

        @JavascriptInterface
        public final void shareImage(String str, String str2, String str3, String str4) {
            String str5;
            String str6 = (str == null || StringsKt.U(str)) ? null : str;
            if (str6 == null) {
                return;
            }
            Regex regex = LuckyNumberWebView.w;
            if (str4 == null || StringsKt.U(str4)) {
                str4 = null;
            }
            if (str4 == null) {
                str5 = (str3 == null || StringsKt.U(str3)) ? null : str3;
            } else {
                str5 = str4;
            }
            LuckyNumberWebView luckyNumberWebView = LuckyNumberWebView.this;
            nas nasVarA = ebs.a(luckyNumberWebView.getLifecycle());
            odd oddVar = luckyNumberWebView.d;
            if (oddVar != null) {
                ej5.c(nasVarA, oddVar, null, new k8u(luckyNumberWebView, str6, str2, str5, null), 2);
            } else {
                Intrinsics.n("ioDispatcher");
                throw null;
            }
        }
    }

    static {
        Charset charset = Charsets.d;
        byte[] bytes = "RIFF".getBytes(charset);
        bytes.getClass();
        A = bytes;
        byte[] bytes2 = "WEBP".getBytes(charset);
        bytes2.getClass();
        B = bytes2;
        byte[] bytes3 = "GIF87a".getBytes(charset);
        bytes3.getClass();
        C = bytes3;
        byte[] bytes4 = "GIF89a".getBytes(charset);
        bytes4.getClass();
        D = bytes4;
        E = "(function() {\n    function canShare() {\n        return true;\n    }\n\n    function getBridge(reject) {\n        var bridge = window.AndroidShareBridge;\n        if (bridge) {\n            return bridge;\n        }\n        reject(new Error('AndroidShareBridge not found.'));\n        return null;\n    }\n\n    function share(data) {\n        return new Promise(function(resolve, reject) {\n            if (!data) {\n                reject(new TypeError('Must provide share data.'));\n                return;\n            }\n\n            var bridge = getBridge(reject);\n            if (!bridge) {\n                return;\n            }\n\n            if (data.files && data.files.length > 0) {\n                shareFile(data, bridge, resolve, reject);\n                return;\n            }\n\n            bridge.postMessage(\n                data.title || '',\n                data.text || '',\n                data.url || ''\n            );\n            resolve();\n        });\n    }\n\n    function shareFile(data, bridge, resolve, reject) {\n        var file = data.files[0];\n        var reader = new FileReader();\n\n        reader.onload = function(event) {\n            bridge.shareImage(\n                event.target.result || '',\n                file.name || '',\n                data.title || '',\n                data.text || ''\n            );\n            resolve();\n        };\n\n        reader.onerror = function() {\n            reject(new Error('Failed to read shared file.'));\n        };\n\n        reader.readAsDataURL(file);\n    }\n\n    function setNavigatorFunction(name, value) {\n        try {\n            Object.defineProperty(navigator, name, {\n                configurable: true,\n                value: value\n            });\n            return;\n        } catch (error) {\n        }\n\n        try {\n            navigator[name] = value;\n        } catch (error) {\n        }\n    }\n\n    setNavigatorFunction('canShare', canShare);\n    setNavigatorFunction('share', share);\n})();";
    }

    public static boolean H1(byte[] bArr) {
        if (J1(0, bArr, y) || J1(0, bArr, z)) {
            return true;
        }
        return (J1(0, bArr, A) && J1(8, bArr, B)) || J1(0, bArr, C) || J1(0, bArr, D);
    }

    public static void I1(File file) {
        if (file.exists() && !file.isDirectory() && !file.delete()) {
            s52.a(file.getAbsolutePath(), "Failed to delete invalid share image folder: ");
            return;
        }
        if (!file.exists() && !file.mkdirs()) {
            s52.a(file.getAbsolutePath(), "Failed to create share image folder: ");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            s52.a(file.getAbsolutePath(), "Failed to list share image folder: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            file2.getClass();
            if (!qlh.j(file2)) {
                s52.a(file2.getAbsolutePath(), "Failed to delete share image cache: ");
                return;
            }
        }
    }

    public static boolean J1(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length >= bArr2.length + i) {
            Iterable intRange = new IntRange(0, bArr2.length - 1, 1);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator<Integer> it = intRange.iterator();
                while (((mwo) it).c) {
                    int iNextInt = ((zvo) it).nextInt();
                    if (bArr[i + iNextInt] == bArr2[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.v420
    public final u420 E() {
        return this.f;
    }

    public final Uri G1(String str, String str2) {
        File file;
        String name;
        String strReplace;
        Object bVar;
        int iT = StringsKt.T(str, ",", 0, false, 6);
        String strO0 = StringsKt.o0(StringsKt.a0(iT != -1 ? str.substring(0, iT) : "", "data:"), ";");
        String strA = null;
        if (!c.u(strO0, "image/", false)) {
            strO0 = null;
        }
        if (strO0 == null) {
            strO0 = "image/png";
        }
        byte[] bArrDecode = Base64.decode(StringsKt.t0(StringsKt.k0(str, ",", str)).toString(), 0);
        bArrDecode.getClass();
        if (!H1(bArrDecode)) {
            String str3 = new String(bArrDecode, Charsets.d);
            String string = StringsKt.t0(StringsKt.k0(str3, ",", str3)).toString();
            try {
                zi50.a aVar = zi50.b;
                bVar = Base64.decode(string, 0);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            byte[] bArr = (byte[]) bVar;
            if (bArr != null && H1(bArr)) {
                bArrDecode = bArr;
            }
        }
        String str4 = "png";
        String strO1 = StringsKt.o0(StringsKt.k0(strO0, "/", strO0), ";");
        int iHashCode = strO1.hashCode();
        if (iHashCode == 111145) {
            strO1.equals("png");
        } else if (iHashCode != 3268712) {
            if (iHashCode == 3645340 && strO1.equals("webp")) {
                str4 = "webp";
            }
        } else if (strO1.equals("jpeg")) {
            str4 = "jpg";
        }
        if (str2 == null || StringsKt.U(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            if (str2.equals("undefined") || str2.equals("null")) {
                str2 = null;
            }
            if (str2 != null && (name = new File(str2).getName()) != null && (strReplace = w.replace(name, "_")) != null && !StringsKt.U(strReplace) && !strReplace.equals(".") && !strReplace.equals("..")) {
                strA = strReplace;
            }
        }
        if (strA == null) {
            strA = "lucky_number_share.".concat(str4);
        }
        if (!StringsKt.M(strA, ".", false)) {
            strA = tug.a(strA, ".", str4);
        }
        synchronized (this.v) {
            File file2 = new File(getCacheDir(), "shared_images");
            I1(file2);
            file = new File(file2, strA);
            nlh.d(file, bArrDecode);
        }
        Uri uriC = mkh.c(this, getPackageName() + ".fileprovider", file);
        uriC.getClass();
        return uriC;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final void initWebView() {
        super.initWebView();
        this.webView.addJavascriptInterface(new a(), "AndroidShareBridge");
        this.webView.getSettings().setTextZoom(100);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView != null) {
            webView.evaluateJavascript(E, null);
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (webView != null) {
            webView.evaluateJavascript(E, null);
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final void onProgressChanged(WebView webView, int i) {
        String url;
        super.onProgressChanged(webView, i);
        if (webView == null || (url = webView.getUrl()) == null || url.equals(this.i)) {
            return;
        }
        this.i = url;
        u420.f fVar = new u420.f(url);
        this.f = fVar;
        rym rymVar = this.b;
        if (rymVar != null) {
            rymVar.d(fVar);
        } else {
            Intrinsics.n("popupQueueManager");
            throw null;
        }
    }
}
