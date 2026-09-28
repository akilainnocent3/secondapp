package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.c;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.g;
import com.sportybet.android.gp.tz.R;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fvl;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.op8;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.uxo;
import defpackage.v8i0;
import defpackage.wgt;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/security/newdevicelogin/loginalert/LoginAlertActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lk9j;", "Lrlf;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoginAlertActivity extends fvl implements zux, pwx, k9j, rlf {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(g.class), new b(), new a(), new c());

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LoginAlertActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LoginAlertActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LoginAlertActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final LastLoginDeviceInfo lastLoginDeviceInfo;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (lastLoginDeviceInfo = (LastLoginDeviceInfo) ((Parcelable) uxo.a(intent, "device_info", LastLoginDeviceInfo.class))) == null) {
            return;
        }
        zn8.a(this, new op8(-366582925, new Function2() { // from class: vgt
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = LoginAlertActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    StringBuilder sb = new StringBuilder();
                    LoginAlertActivity loginAlertActivity = this.a;
                    sb.append(loginAlertActivity.getCMSString(R.string.account_protection__account_protection_notification_content, new Object[0]));
                    sb.append("\n\n");
                    LastLoginDeviceInfo lastLoginDeviceInfo2 = lastLoginDeviceInfo;
                    sb.append(loginAlertActivity.getCMSString(R.string.account_protection__device, lastLoginDeviceInfo2.getDevice()));
                    sb.append('\n');
                    sb.append(loginAlertActivity.getCMSString(R.string.account_protection__platform, lastLoginDeviceInfo2.getPlatform()));
                    sb.append('\n');
                    sb.append(loginAlertActivity.getCMSString(R.string.account_protection__ip, lastLoginDeviceInfo2.getIp()));
                    sb.append('\n');
                    sb.append(loginAlertActivity.getCMSString(R.string.account_protection__location, lastLoginDeviceInfo2.getLocation()));
                    c.a(sb.toString(), (g) loginAlertActivity.b.getValue(), aVar, 64);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        t340 t340Var = ((g) this.b.getValue()).i;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new wgt(this, t340Var, null, this), 3);
    }
}
