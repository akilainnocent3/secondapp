package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sportybet.plugin.jackpot.data.Ads;

/* JADX INFO: loaded from: classes4.dex */
public final class lx1 implements j5f0<Bitmap> {
    public final /* synthetic */ Ads a;
    public final /* synthetic */ mx1 b;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            sh8.c().e(lx1.this.a.linkUrl);
        }
    }

    public lx1(mx1 mx1Var, Ads ads) {
        this.b = mx1Var;
        this.a = ads;
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
        AspectRatioImageView aspectRatioImageView = this.b.a;
        aspectRatioImageView.setVisibility(0);
        aspectRatioImageView.setOnClickListener(new a());
        aspectRatioImageView.setImageBitmap(bitmap);
    }
}
