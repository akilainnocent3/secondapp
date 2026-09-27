package yads;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gl2 implements t31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f149676c = {wb.a(gl2.class, "weekQrcodeContainer", "getWeekQrcodeContainer()Landroid/view/ViewGroup;", 0), wb.a(gl2.class, "weekQrcodeImageView", "getWeekQrcodeImageView()Landroid/widget/ImageView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f149677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f149678b;

    public gl2(wd3 wd3Var) {
        this.f149677a = mm2.a(wd3Var.a());
        this.f149678b = mm2.a(wd3Var.b());
    }

    @Override // yads.t31
    public final void a(Drawable drawable) {
        if (drawable == null) {
            lm2 lm2Var = this.f149677a;
            ns.o[] oVarArr = f149676c;
            ns.o oVar = oVarArr[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f152056a.get();
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            lm2 lm2Var2 = this.f149678b;
            ns.o oVar2 = oVarArr[1];
            ImageView imageView = (ImageView) lm2Var2.f152056a.get();
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        lm2 lm2Var3 = this.f149678b;
        ns.o[] oVarArr2 = f149676c;
        ns.o oVar3 = oVarArr2[1];
        ImageView imageView2 = (ImageView) lm2Var3.f152056a.get();
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        lm2 lm2Var4 = this.f149677a;
        ns.o oVar4 = oVarArr2[0];
        ViewGroup viewGroup2 = (ViewGroup) lm2Var4.f152056a.get();
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        lm2 lm2Var5 = this.f149678b;
        ns.o oVar5 = oVarArr2[1];
        ImageView imageView3 = (ImageView) lm2Var5.f152056a.get();
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(0);
    }
}
