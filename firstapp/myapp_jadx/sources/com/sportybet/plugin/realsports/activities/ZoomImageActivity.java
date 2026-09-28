package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportybet.plugin.realsports.widget.ZoomImageView;
import defpackage.py1;
import defpackage.rck0;
import defpackage.sck0;
import defpackage.sh8;
import defpackage.v23;
import defpackage.zch0;

/* JADX INFO: loaded from: classes7.dex */
public class ZoomImageActivity extends py1 {
    public static final /* synthetic */ int z = 0;
    public ZoomImageView a;
    public Bitmap b;
    public LoadingView c;
    public ImageView d;
    public String e;
    public String f;
    public String i;
    public String v;
    public int w;
    public int y;

    public final void A1() throws Throwable {
        this.e = getIntent().getStringExtra("param_image_uri");
        this.f = getIntent().getStringExtra("param_booking_code");
        this.i = getIntent().getStringExtra("param_country_code");
        this.v = getIntent().getStringExtra("param_code_source");
        boolean booleanExtra = getIntent().getBooleanExtra("param_show_close_bg", true);
        if (TextUtils.isEmpty(this.e)) {
            this.c.K();
            this.c.setOnClickListener(new View.OnClickListener() { // from class: qck0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ZoomImageActivity.z;
                    this.a.z1();
                }
            });
            z1();
        } else {
            Bitmap bitmapI = zch0.i(this, Uri.parse(this.e), this.w * 2, false);
            this.b = bitmapI;
            this.a.setImageBitmap(bitmapI);
        }
        if (booleanExtra) {
            return;
        }
        this.d.setBackgroundResource(0);
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.black)));
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_zoom_image);
        setTitle("preview");
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(R.color.black_60_percent_transparent)));
        this.w = getResources().getDisplayMetrics().heightPixels;
        this.y = getResources().getDisplayMetrics().widthPixels;
        ZoomImageView zoomImageView = (ZoomImageView) findViewById(R.id.img_content);
        this.a = zoomImageView;
        zoomImageView.F = this;
        zoomImageView.setOnImageClickListener(new rck0(this));
        this.c = (LoadingView) findViewById(R.id.loading_view);
        ImageView imageView = (ImageView) findViewById(R.id.btn_close);
        this.d = imageView;
        imageView.setOnClickListener(new v23(this, 1));
        A1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        setIntent(intent);
        A1();
    }

    public final void z1() {
        sh8.a().c(getIntent().getStringExtra("param_fetch_uri"), new sck0(this));
    }
}
