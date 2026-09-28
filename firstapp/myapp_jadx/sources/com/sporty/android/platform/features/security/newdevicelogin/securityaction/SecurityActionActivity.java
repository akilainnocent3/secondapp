package com.sporty.android.platform.features.security.newdevicelogin.securityaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.auth.AuthNavigatorImpl;
import com.sportybet.android.gp.tz.R;
import defpackage.au7;
import defpackage.azm;
import defpackage.cyb;
import defpackage.e480;
import defpackage.h480;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.k2m;
import defpackage.k9j;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s380;
import defpackage.saj;
import defpackage.to20;
import defpackage.uqm;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.x5a0;
import defpackage.y0c;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/platform/features/security/newdevicelogin/securityaction/SecurityActionActivity;", "Lpy1;", "Lto20;", "Lk9j;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SecurityActionActivity extends k2m implements to20, k9j {
    public static final /* synthetic */ int f = 0;
    public final q8i0 b = new q8i0(jq40.a(h480.class), new c(), new b(), new d());
    public final q8i0 c = new q8i0(jq40.a(au7.class), new f(), new e(), new g());
    public AuthNavigatorImpl d;
    public azm e;

    public static final /* synthetic */ class a extends saj implements Function2<String, String, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            SecurityActionActivity securityActionActivity = (SecurityActionActivity) this.receiver;
            int i = SecurityActionActivity.f;
            boolean zB0 = ((h480) securityActionActivity.b.getValue()).c.b0();
            AuthNavigatorImpl authNavigatorImpl = securityActionActivity.d;
            if (zB0) {
                if (authNavigatorImpl == null) {
                    Intrinsics.n("authNavigator");
                    throw null;
                }
                authNavigatorImpl.launchINTAuthActivity(securityActionActivity, Boolean.FALSE, Boolean.TRUE);
            } else {
                if (authNavigatorImpl == null) {
                    Intrinsics.n("authNavigator");
                    throw null;
                }
                authNavigatorImpl.navigateToForgetPassword(securityActionActivity, str3, str4, AnalyticsParam.FORCE_LOGOUT);
            }
            securityActionActivity.finish();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SecurityActionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SecurityActionActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SecurityActionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SecurityActionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SecurityActionActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SecurityActionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        s380 s380Var;
        Parcelable parcelable2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("device_info_from_popup", LastLoginDeviceInfo.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("device_info_from_popup");
            if (!(parcelableExtra instanceof LastLoginDeviceInfo)) {
                parcelableExtra = null;
            }
            parcelable = (LastLoginDeviceInfo) parcelableExtra;
        }
        LastLoginDeviceInfo lastLoginDeviceInfo = (LastLoginDeviceInfo) parcelable;
        String str = "device_info_from_notification";
        if (lastLoginDeviceInfo == null) {
            Intent intent2 = getIntent();
            intent2.getClass();
            if (i >= 33) {
                parcelable2 = (Parcelable) intent2.getParcelableExtra("device_info_from_notification", LastLoginDeviceInfo.class);
            } else {
                Parcelable parcelableExtra2 = intent2.getParcelableExtra("device_info_from_notification");
                parcelable2 = (LastLoginDeviceInfo) (parcelableExtra2 instanceof LastLoginDeviceInfo ? parcelableExtra2 : null);
            }
            lastLoginDeviceInfo = (LastLoginDeviceInfo) parcelable2;
            if (lastLoginDeviceInfo == null) {
                return;
            }
        }
        if (getIntent().hasExtra("device_info_from_popup")) {
            getIntent().removeExtra("device_info_from_popup");
            str = "device_info_from_popup";
        } else if (!getIntent().hasExtra("device_info_from_notification")) {
            return;
        } else {
            getIntent().removeExtra("device_info_from_notification");
        }
        ((au7) this.c.getValue()).x1(j6c.RESET_PASSWORD);
        h480 h480Var = (h480) this.b.getValue();
        uqm uqmVar = h480Var.b;
        e480 e480Var = e480.a;
        if (str.equals("device_info_from_popup")) {
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.account_protection__reset_account_for_account_protection);
            String phoneNumber = uqmVar.getPhoneNumber();
            phoneNumber.getClass();
            s380Var = new s380(e480Var, resourceUiText, lastLoginDeviceInfo, phoneNumber);
        } else {
            e480 e480Var2 = e480.b;
            StringUiText stringUiText2 = vch0.a;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.account_protection__force_log_out_unknown_device);
            String phoneNumber2 = uqmVar.getPhoneNumber();
            phoneNumber2.getClass();
            s380Var = new s380(e480Var2, resourceUiText2, lastLoginDeviceInfo, phoneNumber2);
        }
        ((x5a0) h480Var.e).setValue(s380Var);
        zn8.a(this, new op8(-458897494, new y0c(this), true));
    }
}
