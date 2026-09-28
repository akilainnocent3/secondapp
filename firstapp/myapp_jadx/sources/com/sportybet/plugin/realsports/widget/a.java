package com.sportybet.plugin.realsports.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sporty.android.core.model.ads.RealSportsAds;
import defpackage.j5f0;
import defpackage.sh8;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j5f0<Bitmap> {
    public final /* synthetic */ RealSportsAds a;
    public final /* synthetic */ NavigationBarLoadingView b;

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.widget.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0431a implements View.OnClickListener {
        public ViewOnClickListenerC0431a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(a.this.a.getLinkUrl());
        }
    }

    public a(NavigationBarLoadingView navigationBarLoadingView, RealSportsAds realSportsAds) {
        this.b = navigationBarLoadingView;
        this.a = realSportsAds;
    }

    @Override // defpackage.j5f0
    public final void a(Drawable drawable) {
        this.b.e.setVisibility(8);
    }

    @Override // defpackage.j5f0
    public final void b(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        NavigationBarLoadingView navigationBarLoadingView = this.b;
        navigationBarLoadingView.e.setVisibility(0);
        navigationBarLoadingView.e.setOnClickListener(new ViewOnClickListenerC0431a());
        navigationBarLoadingView.e.setImageBitmap(bitmap);
    }
}
