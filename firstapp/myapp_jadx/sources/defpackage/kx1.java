package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.sporty.android.core.model.ads.RealSportsAds;

/* JADX INFO: loaded from: classes7.dex */
public final class kx1 implements j5f0<Bitmap> {
    public final /* synthetic */ RealSportsAds a;
    public final /* synthetic */ ix1 b;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(kx1.this.a.getLinkUrl());
        }
    }

    public kx1(ix1 ix1Var, RealSportsAds realSportsAds) {
        this.b = ix1Var;
        this.a = realSportsAds;
    }

    @Override // defpackage.j5f0
    public final void a(Drawable drawable) {
        this.b.a.setVisibility(8);
    }

    @Override // defpackage.j5f0
    public final void b(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        ImageView imageView = this.b.a;
        imageView.setVisibility(0);
        imageView.setOnClickListener(new a());
        imageView.setImageBitmap(bitmap);
    }
}
