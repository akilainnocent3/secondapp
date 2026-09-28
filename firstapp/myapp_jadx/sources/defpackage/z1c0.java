package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: classes8.dex */
public final class z1c0 extends ujc<Drawable> {
    public final /* synthetic */ int d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ ImageView f;
    public final /* synthetic */ Context i;
    public final /* synthetic */ String v;

    public z1c0(int i, ImageView imageView, ImageView imageView2, Context context, String str) {
        this.d = i;
        this.e = imageView;
        this.f = imageView2;
        this.i = context;
        this.v = str;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        Drawable drawable = (Drawable) obj;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        int i = this.d;
        int i2 = (int) (intrinsicWidth * (i / intrinsicHeight));
        ImageView imageView = this.e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i2;
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.f;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        layoutParams2.width = i2;
        imageView2.setLayoutParams(layoutParams2);
        imageView.requestLayout();
        imageView2.requestLayout();
        Context context = this.i;
        xa50 xa50VarC = a.b(context).c(context);
        xa50VarC.getClass();
        String str = this.v;
        ea50 ea50VarA = na7.a(xa50VarC, Drawable.class, str);
        lo80 lo80Var = lo80.a;
        po80 po80Var = new po80(xa50VarC, str, ea50VarA, lo80Var);
        hre.e eVar = hre.d;
        eVar.getClass();
        po80Var.c(eVar);
        hb50 hb50VarN = new hb50().n(i2, i);
        hb50VarN.getClass();
        po80Var.a(hb50VarN);
        po80Var.d();
        po80Var.e(imageView);
        xa50 xa50VarC2 = a.b(context).c(context);
        xa50VarC2.getClass();
        po80 po80Var2 = new po80(xa50VarC2, str, na7.a(xa50VarC2, Drawable.class, str), lo80Var);
        po80Var2.c(eVar);
        hb50 hb50VarN2 = new hb50().n(i2, i);
        hb50VarN2.getClass();
        po80Var2.a(hb50VarN2);
        po80Var2.d();
        po80Var2.e(imageView2);
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
    }
}
