package com.sportybet.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.a;
import com.sportybet.android.gp.tz.R;
import defpackage.ea50;
import defpackage.fdf;
import defpackage.fug;
import defpackage.gbn;
import defpackage.gv6;
import defpackage.hre;
import defpackage.o7d;
import defpackage.py1;
import defpackage.sh8;
import defpackage.wae;
import defpackage.x6f;
import defpackage.xib0;

/* JADX INFO: loaded from: classes.dex */
public class BirthVerifySuccessActivity extends py1 implements View.OnClickListener {
    public ImageView a;
    public ImageView b;
    public ImageView c;
    public ImageView d;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.view_gift_btn) {
            sh8.c().e(o7d.a(wae.ME_GIFTS));
            finish();
        } else if (id == R.id.back_btn) {
            getOnBackPressedDispatcher().d();
        } else if (id == R.id.info_btn) {
            startActivity(new Intent(this, (Class<?>) VerifyDobInfoActivity.class));
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_birth_success);
        int intExtra = getIntent().getIntExtra("bvn_success_code", -1);
        Button button = (Button) findViewById(R.id.view_gift_btn);
        this.a = (ImageView) findViewById(R.id.gift_image);
        ImageView imageView = (ImageView) findViewById(R.id.back_btn);
        TextView textView = (TextView) findViewById(R.id.info_btn);
        TextView textView2 = (TextView) findViewById(R.id.gift_send_msg);
        TextView textView3 = (TextView) findViewById(R.id.gift_cong_title);
        this.b = (ImageView) findViewById(R.id.top_bg);
        this.c = (ImageView) findViewById(R.id.down_bg);
        this.d = (ImageView) findViewById(R.id.light_image);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        if (intExtra == 101) {
            textView3.setText(getCMSString(R.string.component_bvn__congratulations, new Object[0]));
            textView2.setVisibility(0);
            ImageView imageView2 = this.a;
            imageView2.setVisibility(0);
            ea50 ea50VarH = a.b(this).e(this).p(xib0.GIF_BVN_GIFT).e(hre.c).o(0).h(0);
            ea50VarH.getClass();
            ea50 ea50Var = (ea50) ea50VarH.z(x6f.c, new gv6());
            ea50Var.L(new fdf(imageView2), null, ea50Var, fug.a);
        } else if (intExtra == 103) {
            textView3.setText(getCMSString(R.string.component_bvn__your_dob_has_been_verified, new Object[0]));
            textView2.setVisibility(8);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.a.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) getResources().getDimension(R.dimen.bvn_gift_icon_width);
            ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) getResources().getDimension(R.dimen.bvn_gift_icon_height);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) getResources().getDimension(R.dimen.bvn_gift_icon_bottommargin);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            sh8.a().a(xib0.IMAGE_BVN_GIFT_OPEN, this.a);
            this.a.setLayoutParams(layoutParams);
            this.a.setScaleType(ImageView.ScaleType.FIT_XY);
            this.a.setVisibility(0);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        gbn gbnVarA = sh8.a();
        gbnVarA.a(xib0.IMAGE_BVN_UP, this.b);
        gbnVarA.a(xib0.IMAGE_BVN_LIGHT, this.d);
        gbnVarA.d(i, this.b, xib0.IMAGE_BVN_UP);
        gbnVarA.d(i, this.c, xib0.IMAGE_BVN_DOWN);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
    }
}
