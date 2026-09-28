package com.sportybet.android.payment.security.nameupdate.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import defpackage.au7;
import defpackage.bjb0;
import defpackage.cyb;
import defpackage.ee;
import defpackage.haj;
import defpackage.itf0;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.kex;
import defpackage.lfy;
import defpackage.lq70;
import defpackage.m3j;
import defpackage.paj;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.sn5;
import defpackage.syi0;
import defpackage.to20;
import defpackage.tx5;
import defpackage.uhc;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vxl;
import defpackage.x02;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sportybet/android/payment/security/nameupdate/presentation/activity/NameUpdateWebViewActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "Lzux;", "Lpwx;", "Lto20;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NameUpdateWebViewActivity extends vxl implements zux, pwx, to20 {
    public static final /* synthetic */ int e = 0;
    public com.sporty.android.platform.features.newotp.util.a c;
    public final q8i0 b = new q8i0(jq40.a(au7.class), new d(), new c(), new e());
    public final ee<OtpModule<OtpData.NameUpdate>> d = com.sporty.android.platform.features.newotp.agent.b.a(this, new Function1() { // from class: jex
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return NameUpdateWebViewActivity.G1(this.a, (OtpData.NameUpdate) obj);
        }
    });

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static void a(Context context) {
            context.getClass();
            String strS = bjb0.S("/m/wv/mismatch-name-upload");
            Intent intent = new Intent(context, (Class<?>) NameUpdateWebViewActivity.class);
            intent.setFlags(268435456);
            Bundle bundle = new Bundle();
            syi0.b(strS, bundle);
            intent.putExtras(bundle);
            intent.putExtra("title", sn5.b(context, R.string.common_functions__identity_verification, new Object[0]));
            context.startActivity(intent);
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ m3j a;

        public b(m3j m3jVar) {
            this.a = m3jVar;
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

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return NameUpdateWebViewActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return NameUpdateWebViewActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return NameUpdateWebViewActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final Unit G1(NameUpdateWebViewActivity nameUpdateWebViewActivity, OtpData.NameUpdate nameUpdate) {
        nameUpdate.getClass();
        OTPResult<OTPUpdateNameResult> oTPResult = nameUpdate.f;
        if (!(oTPResult instanceof OTPResult.NoResult)) {
            int i = 0;
            if (oTPResult instanceof OTPResult.Success) {
                String str = nameUpdate.e;
                String token = ((OTPUpdateNameResult) ((OTPResult.Success) oTPResult).a).getToken();
                WebView webView = nameUpdateWebViewActivity.webView;
                if (webView != null) {
                    String strA = tx5.a("window.", str, "(\"", token, "\");");
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_JAVA_SCRIPT);
                    aVar.a("evaluateJavascript ".concat(strA), new Object[0]);
                    webView.evaluateJavascript(strA, null);
                }
            } else {
                if (!(oTPResult instanceof OTPResult.Failed)) {
                    uhc.a();
                    return null;
                }
                UiText uiTextD1 = ((OTPResult.Failed) oTPResult).getB();
                uiTextD1.getClass();
                nameUpdateWebViewActivity.showDialog(nameUpdateWebViewActivity, uiTextD1.e(nameUpdateWebViewActivity).toString(), new x02(i));
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0048  */
    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        NameUpdateWebViewActivity nameUpdateWebViewActivity;
        super.onCreate(bundle);
        ((au7) this.b.getValue()).x1(j6c.UPDATE_NAME);
        if (bundle != null) {
            boolean z = bundle.getBoolean("key - have restart");
            Boolean boolValueOf = Boolean.valueOf(z);
            if (!z) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                StringUiText stringUiText = vch0.a;
                nameUpdateWebViewActivity = this;
                lq70.a.b(supportFragmentManager, nameUpdateWebViewActivity, new ResourceUiText(R.string.identity_verification__insufficient_ram), new ResourceUiText(R.string.identity_verification__insufficient_ram_detail), new kex(0), 496);
            } else {
                nameUpdateWebViewActivity = this;
            }
        } else {
            nameUpdateWebViewActivity = this;
        }
        nameUpdateWebViewActivity.webViewViewModel.getNameMissMatchOTP().f(nameUpdateWebViewActivity, new b(new m3j(nameUpdateWebViewActivity, 1)));
        AppCompatImageView leftCloseButton = nameUpdateWebViewActivity.getLeftCloseButton();
        if (leftCloseButton != null) {
            leftCloseButton.setImageResource(R.drawable.ic_action_bar_back);
        }
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity
    public final void onHandleMessage(String str) {
        if (TextUtils.equals(str, "finishWeb")) {
            Toast.makeText(this, R.string.identity_verification__successfully_submit_the_documents, 1).show();
        }
    }

    @Override // defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key - have restart", true);
    }
}
