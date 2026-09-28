package com.sportybet.android.account;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.RegistrationData;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.permission.PermissionActivity;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import com.sportybet.plugin.webcontainer.callback.LDWebChromeClient;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import com.sportybet.plugin.webcontainer.viewmodel.WebViewViewModel;
import defpackage.a7i;
import defpackage.azm;
import defpackage.bjb0;
import defpackage.cyb;
import defpackage.dk;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.ex40;
import defpackage.f78;
import defpackage.fx40;
import defpackage.haj;
import defpackage.itf0;
import defpackage.j1m;
import defpackage.jq40;
import defpackage.k00;
import defpackage.lfy;
import defpackage.lx5;
import defpackage.ml5;
import defpackage.osp;
import defpackage.p010;
import defpackage.paj;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qt00;
import defpackage.r010;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.sc80;
import defpackage.sn5;
import defpackage.svr;
import defpackage.syi0;
import defpackage.to20;
import defpackage.uts;
import defpackage.uw40;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.wae;
import defpackage.yd;
import defpackage.yv40;
import defpackage.zd;
import defpackage.zi50;
import defpackage.zux;
import defpackage.zv40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sportybet/android/account/RegistrationKYCWebViewActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "Lzux;", "Lpwx;", "Lto20;", "Li8;", "Lk9j;", "<init>", "()V", "c", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RegistrationKYCWebViewActivity extends j1m implements zux, pwx, to20 {
    public static final b y = new b();
    public static final a z = new a();
    public final String b = Integer.toHexString(System.identityHashCode(this));
    public final fx40 c = new fx40(this, new a7i(this, 2));
    public final q8i0 d = new q8i0(jq40.a(dk.class), new g(), new f(), new h());
    public final ee<OtpModule<OtpData.PhoneMigration>> e = com.sporty.android.platform.features.newotp.agent.b.a(this, new Function1() { // from class: tw40
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            OtpData.PhoneMigration phoneMigration = (OtpData.PhoneMigration) obj;
            RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
            phoneMigration.getClass();
            OTPResult<OTPGeneralResult> oTPResult = phoneMigration.f;
            if (oTPResult instanceof OTPResult.Success) {
                dk dkVar = (dk) this.a.d.getValue();
                String token = ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken();
                token.getClass();
                dkVar.i.put("main_account_token", token);
                boolean otpForSubsidiaryAccountEnabled = dkVar.e.getOtpForSubsidiaryAccountEnabled();
                PhoneMigrateParams phoneMigrateParams = dkVar.e;
                if (otpForSubsidiaryAccountEnabled) {
                    dkVar.y1(phoneMigrateParams);
                } else {
                    dkVar.x1(phoneMigrateParams);
                }
            }
            return Unit.a;
        }
    });
    public final ee<OtpModule<OtpData.PhoneMigration>> f = com.sporty.android.platform.features.newotp.agent.b.a(this, new svr(this, 1));
    public azm i;
    public rdd0 v;
    public sc80 w;

    public static final class a extends vd<yv40, zv40> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            yv40 yv40Var = (yv40) obj;
            yv40Var.getClass();
            Intent intent = new Intent(context, (Class<?>) RegistrationKYCWebViewActivity.class);
            String str = yv40Var.b;
            KycSource kycSource = KycSource.DEPOSIT;
            String strS = bjb0.S("/m/wv/kyc_collect?source=" + kycSource.getValue());
            itf0.a aVar = itf0.a;
            aVar.q("SB_REG_KYC_WEBVIEW");
            Boolean bool = Boolean.TRUE;
            Boolean boolValueOf = Boolean.valueOf(str != null);
            String simpleName = context.getClass().getSimpleName();
            RegistrationKYCWebViewActivity.y.getClass();
            aVar.a("contract.createIntent, source=%s, enableDefaultActionBar=%s, titlePresent=%s, context=%s, url=%s", kycSource, bool, boolValueOf, simpleName, b.b(strS));
            Bundle bundle = new Bundle();
            syi0.b(strS, bundle);
            intent.putExtras(bundle);
            intent.putExtra("data_enable_default_action_bar", true);
            String str2 = yv40Var.a;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("data_cookies", lx5.a("accessToken=", str2, ";kyc_collect_token=", ""));
            intent.putExtra(UserCertConstants.EXTRA_SOURCE, kycSource.getValue());
            if (str != null) {
                intent.putExtra("title", str);
            }
            return intent;
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            return (intent != null && i == -1) ? zv40.b.a : zv40.a.a;
        }
    }

    public static final class b {
        public static Intent a(Context context, KycSource kycSource, String str, boolean z) {
            context.getClass();
            kycSource.getClass();
            str.getClass();
            String strS = bjb0.S("/m/wv/kyc_collect?source=" + kycSource.getValue());
            itf0.a aVar = itf0.a;
            aVar.q("SB_REG_KYC_WEBVIEW");
            aVar.a("genIntent, source=%s, showActionBar=%s, context=%s, url=%s", kycSource, Boolean.valueOf(z), context.getClass().getSimpleName(), b(strS));
            Intent intent = new Intent(context, (Class<?>) RegistrationKYCWebViewActivity.class);
            Bundle bundle = new Bundle();
            syi0.b(strS, bundle);
            intent.putExtras(bundle);
            if (z && kycSource == KycSource.DEPOSIT) {
                intent.putExtra("data_enable_default_action_bar", true);
                intent.putExtra("title", sn5.b(context, R.string.common_functions__deposit, new Object[0]));
            } else {
                intent.putExtra("data_enable_default_action_bar", false);
            }
            intent.putExtra("data_cookies", str);
            intent.putExtra(UserCertConstants.EXTRA_SOURCE, kycSource.getValue());
            return intent;
        }

        public static String b(String str) {
            Object bVar;
            if (str == null || StringsKt.U(str)) {
                return str;
            }
            try {
                zi50.a aVar = zi50.b;
                Uri uri = Uri.parse(str);
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                sb.append(uri.getHost());
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                sb.append(path);
                bVar = sb.toString();
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bVar = "<invalid-url>";
            }
            return (String) bVar;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String strJ1;
            webView.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (registrationKYCWebViewActivity.countryButler.x() && (strJ1 = RegistrationKYCWebViewActivity.J1(str)) != null) {
                registrationKYCWebViewActivity.K1(new osp.c0(strJ1, registrationKYCWebViewActivity.H1()));
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String strJ1;
            webView.getClass();
            webResourceRequest.getClass();
            webResourceError.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (registrationKYCWebViewActivity.countryButler.x() && webResourceRequest.isForMainFrame() && (strJ1 = RegistrationKYCWebViewActivity.J1(webResourceRequest.getUrl().toString())) != null) {
                int errorCode = webResourceError.getErrorCode();
                CharSequence description = webResourceError.getDescription();
                registrationKYCWebViewActivity.K1(new osp.a0(strJ1, errorCode, description != null ? description.toString() : null));
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            webView.getClass();
            httpAuthHandler.getClass();
            str.getClass();
            str2.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (registrationKYCWebViewActivity.countryButler.x()) {
                registrationKYCWebViewActivity.K1(new osp.x(str));
            }
            httpAuthHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String strJ1;
            webView.getClass();
            webResourceRequest.getClass();
            webResourceResponse.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (registrationKYCWebViewActivity.countryButler.x() && webResourceRequest.isForMainFrame() && (strJ1 = RegistrationKYCWebViewActivity.J1(webResourceRequest.getUrl().toString())) != null) {
                registrationKYCWebViewActivity.K1(new osp.y(strJ1, webResourceResponse.getStatusCode()));
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            webView.getClass();
            sslErrorHandler.getClass();
            sslError.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (registrationKYCWebViewActivity.countryButler.x()) {
                registrationKYCWebViewActivity.K1(new osp.d0(sslError.getPrimaryError()));
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            webView.getClass();
            webResourceRequest.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (!registrationKYCWebViewActivity.countryButler.x() || !webResourceRequest.isForMainFrame()) {
                return null;
            }
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            registrationKYCWebViewActivity.K1(new osp.z(string, webResourceRequest.getMethod(), registrationKYCWebViewActivity.H1(), webResourceRequest.isRedirect(), webResourceRequest.isForMainFrame()));
            return null;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.getClass();
            webResourceRequest.getClass();
            b bVar = RegistrationKYCWebViewActivity.y;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = RegistrationKYCWebViewActivity.this;
            if (!registrationKYCWebViewActivity.countryButler.x()) {
                return false;
            }
            String string = webResourceRequest.getUrl().toString();
            string.getClass();
            registrationKYCWebViewActivity.K1(new osp.b0(string, webResourceRequest.getMethod(), webResourceRequest.isRedirect(), webResourceRequest.isForMainFrame()));
            return false;
        }
    }

    public static final class d extends LDWebChromeClient {
        public d(boolean z) {
            super(RegistrationKYCWebViewActivity.this, Boolean.valueOf(z));
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        @Override // com.sportybet.plugin.webcontainer.callback.LDWebChromeClient, android.webkit.WebChromeClient
        public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
            int size;
            int i;
            String str;
            webView.getClass();
            valueCallback.getClass();
            fileChooserParams.getClass();
            final fx40 fx40Var = RegistrationKYCWebViewActivity.this.c;
            RegistrationKYCWebViewActivity registrationKYCWebViewActivity = (RegistrationKYCWebViewActivity) fx40Var.b.b;
            itf0.a aVar = itf0.a;
            aVar.q("SB_REG_KYC_WEBVIEW");
            aVar.a("onShowFileChooser, params={%s}, replacingPending=%s, %s", fx40.g(fileChooserParams), Boolean.valueOf(fx40Var.c != null), RegistrationKYCWebViewActivity.G1(registrationKYCWebViewActivity));
            fx40Var.d(null, "new_file_chooser_request");
            fx40Var.d = SystemClock.elapsedRealtime();
            fx40Var.c = valueCallback;
            if (fileChooserParams.isCaptureEnabled()) {
                ArrayList arrayListE = fx40.e(fileChooserParams);
                if (!arrayListE.isEmpty()) {
                    if (!arrayListE.isEmpty()) {
                        int size2 = arrayListE.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj = arrayListE.get(i2);
                            i2++;
                            String str2 = (String) obj;
                            if (Intrinsics.g(str2, "*/*") || kotlin.text.c.u(str2, "image/", false) || fx40.k.contains(str2)) {
                            }
                        }
                    }
                }
                itf0.a aVar2 = itf0.a;
                aVar2.q("SB_REG_KYC_WEBVIEW");
                aVar2.a("fileChooser route=camera, params={%s}, %s", fx40.g(fileChooserParams), RegistrationKYCWebViewActivity.G1(registrationKYCWebViewActivity));
                aVar2.q("SB_REG_KYC_WEBVIEW");
                aVar2.a("requestCameraPermission, %s", RegistrationKYCWebViewActivity.G1(registrationKYCWebViewActivity));
                PermissionActivity.z1(fx40Var.a, new String[]{"android.permission.CAMERA"}, new ex40(fx40Var));
                return true;
            }
            ArrayList arrayListE2 = fx40.e(fileChooserParams);
            if (!arrayListE2.isEmpty()) {
                if (!arrayListE2.isEmpty()) {
                    int size3 = arrayListE2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size3) {
                            Object obj2 = arrayListE2.get(i3);
                            i3++;
                            if (Intrinsics.g((String) obj2, "*/*")) {
                            }
                        } else if (!arrayListE2.isEmpty()) {
                            size = arrayListE2.size();
                            i = 0;
                            while (i < size) {
                                Object obj3 = arrayListE2.get(i);
                                i++;
                                str = (String) obj3;
                                if (kotlin.text.c.u(str, "image/", false)) {
                                }
                            }
                        }
                    }
                } else if (!arrayListE2.isEmpty()) {
                    size = arrayListE2.size();
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayListE2.get(i);
                        i++;
                        str = (String) obj4;
                        if (kotlin.text.c.u(str, "image/", false) && !fx40.k.contains(str)) {
                            ArrayList arrayListE3 = fx40.e(fileChooserParams);
                            ArrayList arrayList = new ArrayList();
                            int size4 = arrayListE3.size();
                            int i4 = 0;
                            while (i4 < size4) {
                                Object obj5 = arrayListE3.get(i4);
                                i4++;
                                String str3 = (String) obj5;
                                if (StringsKt.M(str3, "/", false) && !kotlin.text.c.u(str3, ".", false)) {
                                    arrayList.add(obj5);
                                }
                            }
                            boolean zIsEmpty = arrayList.isEmpty();
                            List listC = arrayList;
                            if (zIsEmpty) {
                                listC = kotlin.collections.a.c("image/*");
                            }
                            final String[] strArr = (String[]) listC.toArray(new String[0]);
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("SB_REG_KYC_WEBVIEW");
                            Boolean boolValueOf = Boolean.valueOf(fileChooserParams.getMode() == 1);
                            String string = Arrays.toString(strArr);
                            string.getClass();
                            aVar3.a("fileChooser route=document_picker, multiple=%s, mimeTypes=%s, params={%s}, %s", boolValueOf, string, fx40.g(fileChooserParams), RegistrationKYCWebViewActivity.G1(registrationKYCWebViewActivity));
                            fx40Var.f("document_picker", new Function0() { // from class: xw40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    fx40 fx40Var2 = fx40Var;
                                    fx40Var2.getClass();
                                    WebChromeClient.FileChooserParams fileChooserParams2 = fileChooserParams;
                                    String[] strArr2 = strArr;
                                    if (fileChooserParams2 == null || fileChooserParams2.getMode() != 1) {
                                        fx40Var2.i.b(strArr2);
                                    } else {
                                        fx40Var2.j.b(strArr2);
                                    }
                                    return Unit.a;
                                }
                            });
                            return true;
                        }
                    }
                }
            }
            int iA = yd.a.a();
            zd.b.a aVar4 = zd.b.a.a;
            final qt00 qt00Var = new qt00();
            qt00Var.a = zd.d.a;
            qt00Var.b = iA;
            aVar4.getClass();
            qt00Var.c = aVar4;
            itf0.a aVar5 = itf0.a;
            aVar5.q("SB_REG_KYC_WEBVIEW");
            aVar5.a("fileChooser route=photo_picker, multiple=%s, params={%s}, %s", Boolean.valueOf(fileChooserParams.getMode() == 1), fx40.g(fileChooserParams), RegistrationKYCWebViewActivity.G1(registrationKYCWebViewActivity));
            fx40Var.f("photo_picker", new Function0() { // from class: ww40
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    fx40 fx40Var2 = fx40Var;
                    fx40Var2.getClass();
                    WebChromeClient.FileChooserParams fileChooserParams2 = fileChooserParams;
                    qt00 qt00Var2 = qt00Var;
                    if (fileChooserParams2 == null || fileChooserParams2.getMode() != 1) {
                        fx40Var2.g.b(qt00Var2);
                    } else {
                        fx40Var2.h.b(qt00Var2);
                    }
                    return Unit.a;
                }
            });
            return true;
        }
    }

    public static final class e implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return RegistrationKYCWebViewActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return RegistrationKYCWebViewActivity.this.getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return RegistrationKYCWebViewActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static String G1(RegistrationKYCWebViewActivity registrationKYCWebViewActivity) {
        Intent intent = registrationKYCWebViewActivity.getIntent();
        String str = registrationKYCWebViewActivity.b;
        int iMyPid = Process.myPid();
        int taskId = registrationKYCWebViewActivity.getTaskId();
        String stringExtra = intent != null ? intent.getStringExtra(UserCertConstants.EXTRA_SOURCE) : null;
        String url = registrationKYCWebViewActivity.webView.getUrl();
        y.getClass();
        String strB = b.b(url);
        boolean z2 = registrationKYCWebViewActivity.c.c != null;
        boolean zIsFinishing = registrationKYCWebViewActivity.isFinishing();
        boolean zIsDestroyed = registrationKYCWebViewActivity.isDestroyed();
        StringBuilder sbA = ml5.a(iMyPid, "instance=", str, ", pid=", ", taskId=");
        f78.b(taskId, ", source=", stringExtra, ", webUrl=", sbA);
        uts.b(strB, ", pendingCallback=", ", finishing=", sbA, z2);
        sbA.append(zIsFinishing);
        sbA.append(", destroyed=");
        sbA.append(zIsDestroyed);
        return sbA.toString();
    }

    public static final Unit I1(RegistrationKYCWebViewActivity registrationKYCWebViewActivity, RegistrationKYC$Result registrationKYC$Result) {
        if (registrationKYC$Result == null) {
            return Unit.a;
        }
        RegistrationData registrationData = registrationKYC$Result.c;
        boolean z2 = registrationKYC$Result.b;
        if (z2 && registrationData != null && registrationData.hasUserCertStatus()) {
            int i = registrationData.userCertStatus;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.a("userCertStatus from WebView: %s", Integer.valueOf(i));
            ej5.c(ebs.a(registrationKYCWebViewActivity.getLifecycle()), null, null, new uw40(registrationKYCWebViewActivity, i, null), 3);
        } else {
            registrationKYCWebViewActivity.webViewViewModel.updateUserCertStatus();
        }
        Intent intentPutExtra = new Intent().putExtra("data", registrationKYC$Result);
        intentPutExtra.getClass();
        if (registrationKYCWebViewActivity.countryButler.x()) {
            registrationKYCWebViewActivity.K1(new osp.w(registrationKYCWebViewActivity.H1(), z2 ? "kyc_confirmed" : "kyc_canceled"));
        }
        registrationKYCWebViewActivity.setResult(z2 ? -1 : 0, intentPutExtra);
        registrationKYCWebViewActivity.finish();
        return Unit.a;
    }

    public static String J1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (StringsKt.M(str, "kyc_collect", false)) {
            return "kyc_collect";
        }
        return StringsKt.M(str, "accessToken/extend", false) ? "access_token_extend" : "others";
    }

    public final String H1() {
        String stringExtra = getIntent().getStringExtra(UserCertConstants.EXTRA_SOURCE);
        return stringExtra == null ? "unknown" : stringExtra;
    }

    public final void K1(osp ospVar) {
        rdd0 rdd0Var = this.v;
        if (rdd0Var != null) {
            rdd0Var.a(ospVar, k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final LDWebChromeClient createWebChromeClient() {
        return new d(allowCameraPermissionRequest());
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final boolean enableProcessBar() {
        return false;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final void initWebView() {
        super.initWebView();
        this.client.setDelegeteWebViewClient(new c());
    }

    @Override // defpackage.py1, defpackage.i8
    public final void onAccountChange(Account account) {
        super.onAccountChange(account);
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("onAccountChange, accountNull=%s, %s", Boolean.valueOf(account == null), G1(this));
        if (account == null) {
            if (this.countryButler.x()) {
                K1(new osp.w(H1(), "account_logged_out"));
            }
            finish();
            azm azmVar = this.i;
            if (azmVar != null) {
                azmVar.d(wae.HOME);
            } else {
                Intrinsics.n("router");
                throw null;
            }
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.r1k
    public final boolean onBackPressedCompat() {
        itf0.a aVar = itf0.a;
        aVar.q("SB_REG_KYC_WEBVIEW");
        aVar.a("onBackPressed, %s", G1(this));
        if (this.countryButler.x()) {
            K1(new osp.w(H1(), "back_pressed"));
        }
        WebViewActivityUtils.onRegistrationKYCResult(new RegistrationKYC$Result(getIntent().getStringExtra(UserCertConstants.EXTRA_SOURCE), false, null));
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (H1().equals(KycSource.REGISTRATION.getValue()) && this.w == null) {
            Intrinsics.n("seonSessionProvider");
            throw null;
        }
        if (this.countryButler.x()) {
            K1(new osp.u(H1()));
        }
        this.webView.getSettings().setSupportZoom(false);
        this.webView.getSettings().setBuiltInZoomControls(false);
        this.webView.getSettings().setDisplayZoomControls(false);
        AppCompatImageView leftCloseButton = getLeftCloseButton();
        if (leftCloseButton != null) {
            leftCloseButton.setOnClickListener(new View.OnClickListener() { // from class: sw40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
                    this.a.onBackPressed();
                }
            });
        }
        WebViewViewModel webViewViewModel = this.webViewViewModel;
        int i = 1;
        if (webViewViewModel != null) {
            webViewViewModel.getRegistrationKYCResult().f(this, new e(new p010(this, 1)));
        }
        ((WebViewActivity) this).accountHelper.addAccountChangeListener(this);
        WebViewViewModel webViewViewModel2 = this.webViewViewModel;
        if (webViewViewModel2 != null) {
            webViewViewModel2.getKycDuplicateIdResult().f(this, new e(new r010(this, i)));
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        if (H1().equals(KycSource.REGISTRATION.getValue()) && this.w == null) {
            Intrinsics.n("seonSessionProvider");
            throw null;
        }
        if (this.countryButler.x()) {
            K1(new osp.v(H1(), isFinishing()));
        }
        fx40 fx40Var = this.c;
        fx40Var.getClass();
        fx40Var.d(null, "activity_destroy");
        super.onDestroy();
        ((WebViewActivity) this).accountHelper.removeAccountChangeListener(this);
    }
}
