package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f28467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f28468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f28469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f28470d;

    public r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f28467a = viewGroup;
        this.f28468b = size;
        this.f28469c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f28470d.removeView(this.f28467a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f28469c, this.f28468b.getWidth()), AppLovinSdkUtils.dpToPx(this.f28469c, this.f28468b.getHeight()));
        layoutParams.addRule(13);
        this.f28467a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f28469c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f28469c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f28469c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.zd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29872b.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f28469c);
        this.f28470d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f28470d.setBackgroundColor(Integer.MIN_VALUE);
        this.f28470d.addView(imageButton);
        this.f28470d.addView(this.f28467a);
        this.f28470d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ae
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26549b.b(view);
            }
        });
        setContentView(this.f28470d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }
}
