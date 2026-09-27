package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fj2 implements t31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f149133c = {wb.a(fj2.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), wb.a(fj2.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f149134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f149135b;

    public fj2(ImageView imageView, ProgressBar progressBar) {
        this.f149134a = mm2.a(imageView);
        this.f149135b = mm2.a(progressBar);
    }

    @Override // yads.t31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            lm2 lm2Var = this.f149135b;
            ns.o oVar = f149133c[1];
            ProgressBar progressBar = (ProgressBar) lm2Var.f152056a.get();
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            return;
        }
        lm2 lm2Var2 = this.f149134a;
        ns.o[] oVarArr = f149133c;
        ns.o oVar2 = oVarArr[0];
        ImageView imageView = (ImageView) lm2Var2.f152056a.get();
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        lm2 lm2Var3 = this.f149135b;
        ns.o oVar3 = oVarArr[1];
        ProgressBar progressBar2 = (ProgressBar) lm2Var3.f152056a.get();
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
        }
    }
}
