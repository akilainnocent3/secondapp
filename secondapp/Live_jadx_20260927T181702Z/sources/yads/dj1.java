package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dj1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f148228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f148229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f148230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f148231d;

    public /* synthetic */ dj1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int iRound = Math.round(kl3.c(this.f148230c) * this.f148229b);
        ViewGroup.LayoutParams layoutParams = this.f148228a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int iMax = (int) Math.max(Math.min(size, iRound), 0.0d);
        hj1 hj1Var = this.f148231d;
        hj1Var.f150155a = i10;
        hj1Var.f150156b = View.MeasureSpec.makeMeasureSpec(iMax, mode);
        return this.f148231d;
    }

    public dj1(View view, float f10, Context context, hj1 hj1Var) {
        this.f148228a = view;
        this.f148229b = f10;
        this.f148230c = context;
        this.f148231d = hj1Var;
    }
}
