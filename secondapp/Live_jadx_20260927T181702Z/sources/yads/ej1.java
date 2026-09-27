package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ej1 implements ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f148727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f148728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f148729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hj1 f148730d;

    public /* synthetic */ ej1(View view, float f10, Context context) {
        this(view, f10, context, new hj1());
    }

    @Override // yads.ij1
    public final hj1 a(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        Context context = this.f148729c;
        wl3 wl3Var = kl3.f151600a;
        int iRound = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f148728b);
        ViewGroup.LayoutParams layoutParams = this.f148727a.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            iRound = (iRound - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f148730d.f150155a = View.MeasureSpec.makeMeasureSpec((int) Math.max(Math.min(size, iRound), 0.0d), mode);
        hj1 hj1Var = this.f148730d;
        hj1Var.f150156b = i11;
        return hj1Var;
    }

    public ej1(View view, float f10, Context context, hj1 hj1Var) {
        this.f148727a = view;
        this.f148728b = f10;
        this.f148729c = context;
        this.f148730d = hj1Var;
    }
}
