package com.sporty.android.platform.features.newotp.agent;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.hay;
import defpackage.hyl;
import defpackage.k9j;
import defpackage.pwx;
import defpackage.vqx;
import defpackage.wwj;
import defpackage.zux;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sporty/android/platform/features/newotp/agent/OTPAgentActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lk9j;", "Lbb40;", "<init>", "()V", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OTPAgentActivity extends hyl implements zux, pwx, k9j, bb40 {
    public static final /* synthetic */ int b = 0;

    public static final class a {
        public static Intent a(Context context, OtpModule otpModule) {
            Intent intent = new Intent(context, (Class<?>) OTPAgentActivity.class);
            intent.putExtra("key - otp module", otpModule);
            return intent;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_otp_agent, (ViewGroup) null, false);
        if (viewInflate == null) {
            bmy.a("rootView");
            return;
        }
        setContentView((FrameLayout) viewInflate);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("key - otp module", OtpModule.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("key - otp module");
            parcelable = (OtpModule) (parcelableExtra instanceof OtpModule ? parcelableExtra : null);
        }
        OtpModule otpModule = (OtpModule) parcelable;
        if (otpModule == null) {
            return;
        }
        getSupportFragmentManager().n0("key - otp result", this, new hay(new wwj(this, 2)));
        vqx vqxVar = new vqx();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("key - module", otpModule);
        vqxVar.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        String str = vqxVar.A;
        aVar.f(android.R.id.content, vqxVar, str);
        aVar.c(str);
        aVar.k(true, true);
    }
}
