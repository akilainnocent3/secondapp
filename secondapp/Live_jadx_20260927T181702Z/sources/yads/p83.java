package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p83 implements t31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f153813c = {wb.a(p83.class, "trademarkView", "getTrademarkView()Landroid/widget/ImageView;", 0), wb.a(p83.class, "delimiterView", "getDelimiterView()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f153814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f153815b;

    public p83(ImageView imageView, TextView textView) {
        this.f153814a = mm2.a(imageView);
        this.f153815b = mm2.a(textView);
    }

    @Override // yads.t31
    public final void a(Drawable drawable) {
        if (drawable != null) {
            lm2 lm2Var = this.f153814a;
            ns.o[] oVarArr = f153813c;
            ns.o oVar = oVarArr[0];
            ImageView imageView = (ImageView) lm2Var.f152056a.get();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            }
            lm2 lm2Var2 = this.f153815b;
            ns.o oVar2 = oVarArr[1];
            TextView textView = (TextView) lm2Var2.f152056a.get();
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }
}
