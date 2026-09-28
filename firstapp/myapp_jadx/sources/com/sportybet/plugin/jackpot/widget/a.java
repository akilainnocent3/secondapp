package com.sportybet.plugin.jackpot.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sportybet.plugin.jackpot.data.Ads;
import defpackage.j5f0;
import defpackage.sh8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements j5f0<Bitmap> {
    public final /* synthetic */ Ads a;
    public final /* synthetic */ NavigationBarLoadingView b;

    /* JADX INFO: renamed from: com.sportybet.plugin.jackpot.widget.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0420a implements View.OnClickListener {
        public ViewOnClickListenerC0420a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(a.this.a.linkUrl);
        }
    }

    public a(NavigationBarLoadingView navigationBarLoadingView, Ads ads) {
        this.b = navigationBarLoadingView;
        this.a = ads;
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
        navigationBarLoadingView.e.setOnClickListener(new ViewOnClickListenerC0420a());
        navigationBarLoadingView.e.setImageBitmap(bitmap);
    }
}
