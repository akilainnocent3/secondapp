package com.cleveradssolutions.internal.content.nativead;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.x;
import com.cleveradssolutions.internal.services.q;
import com.cleveradssolutions.sdk.nativead.CASNativeView;
import dr.w2;
import f2.e1;
import f2.p2;
import f2.q3;
import f2.z1;
import k1.g0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends x implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Activity f43452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.cleveradssolutions.mediation.k f43453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f43454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CountDownTimer f43455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43456k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Activity activity, com.cleveradssolutions.mediation.k adContent) {
        super(activity, R.style.Theme.NoTitleBar.Fullscreen);
        m0.p(activity, "activity");
        m0.p(adContent, "adContent");
        this.f43452g = activity;
        this.f43453h = adContent;
        this.f43454i = 5000L;
        this.f43456k = -1;
    }

    public static final q3 f(View v10, q3 insets) {
        m0.p(v10, "v");
        m0.p(insets, "insets");
        g0 g0VarF = insets.f(q3.m.i() | q3.m.c());
        m0.o(g0VarF, "getInsets(...)");
        v10.setPadding(g0VarF.f101692a, g0VarF.f101693b, g0VarF.f101694c, g0VarF.f101695d);
        return q3.f82506c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v10) {
        m0.p(v10, "v");
        dismiss();
    }

    @Override // androidx.appcompat.app.x, androidx.activity.s, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        q qVar = q.f43760b;
        try {
            this.f43456k = this.f43452g.getRequestedOrientation();
            Activity activity = this.f43452g;
            activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation == 2 ? 0 : 1);
            w2 w2Var = w2.f79517a;
        } catch (Throwable th2) {
            com.cleveradssolutions.internal.m.a(th2, com.cleveradssolutions.internal.d.a(qVar, new StringBuilder(), ": Request orientation "), 6, "CAS.AI");
        }
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Context context = getContext();
        m0.o(context, "getContext(...)");
        CASNativeView cASNativeView = new CASNativeView(context);
        int i10 = displayMetrics.widthPixels;
        m0.m(displayMetrics);
        cASNativeView.setAdTemplateSize(wc.f.f142742d.e(is.d.L0(i10 / displayMetrics.density), is.d.L0(displayMetrics.heightPixels / displayMetrics.density)));
        cASNativeView.getRenderer$com_cleveradssolutions_sdk_android_release().o(cASNativeView, this.f43453h, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.argb(105, 0, 0, 0));
        float f10 = displayMetrics.density;
        int i11 = (int) ((30 * f10) + 0.5f);
        int i12 = (int) ((10 * f10) + 0.5f);
        FrameLayout frameLayout = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11, 8388661);
        layoutParams.topMargin = i12;
        layoutParams.rightMargin = i12;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(gradientDrawable);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(com.cleveradssolutions.sdk.android.a.b.f43912i);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setVisibility(8);
        imageView.setOnClickListener(this);
        frameLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setShadowLayer(displayMetrics.density * 2.0f, 0.0f, 0.0f, -16777216);
        frameLayout.addView(textView);
        this.f43455j = new i(textView, imageView, this, this.f43454i).start();
        cASNativeView.addView(frameLayout);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setContentView(cASNativeView);
        com.cleveradssolutions.internal.j.j(getWindow());
        q qVar2 = q.f43760b;
        try {
            Window window = getWindow();
            m0.m(window);
            if (Build.VERSION.SDK_INT < 35) {
                p2.c(window, false);
            }
            window.addFlags(Integer.MIN_VALUE);
            w2 w2Var2 = w2.f79517a;
        } catch (Throwable th3) {
            com.cleveradssolutions.internal.m.a(th3, com.cleveradssolutions.internal.d.a(qVar2, new StringBuilder(), ": Set fullscreen failed "), 6, "CAS.AI");
        }
        z1.j2(cASNativeView, new e1() { // from class: com.cleveradssolutions.internal.content.nativead.j
            @Override // f2.e1
            public final q3 a(View view, q3 q3Var) {
                return k.f(view, q3Var);
            }
        });
        com.cleveradssolutions.mediation.api.b listener = this.f43453h.getListener();
        if (listener != null) {
            listener.w(this.f43453h);
        }
    }

    @Override // androidx.appcompat.app.x, androidx.activity.s, android.app.Dialog
    public final void onStop() {
        super.onStop();
        q qVar = q.f43760b;
        try {
            this.f43452g.setRequestedOrientation(this.f43456k);
            w2 w2Var = w2.f79517a;
        } catch (Throwable th2) {
            com.cleveradssolutions.internal.m.a(th2, com.cleveradssolutions.internal.d.a(qVar, new StringBuilder(), ": Restore orientation "), 6, "CAS.AI");
        }
        CountDownTimer countDownTimer = this.f43455j;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f43455j = null;
        com.cleveradssolutions.mediation.api.b listener = this.f43453h.getListener();
        if (listener != null) {
            listener.H(this.f43453h);
            listener.L(this.f43453h);
        }
        q qVar2 = q.f43760b;
        try {
            this.f43453h.destroy();
            w2 w2Var2 = w2.f79517a;
        } catch (Throwable th3) {
            com.cleveradssolutions.internal.m.a(th3, com.cleveradssolutions.internal.d.a(qVar2, new StringBuilder(), ": Destroy ad "), 6, "CAS.AI");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            com.cleveradssolutions.internal.a.l(getWindow());
        }
    }
}
