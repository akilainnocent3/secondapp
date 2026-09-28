package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class kt50 extends c590 {
    public final SideSheetBehavior<? extends View> a;

    public kt50(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.c590
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.c590
    public final float b(int i) {
        float f = this.a.B;
        return (f - i) / (f - d());
    }

    @Override // defpackage.c590
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.c590
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, (sideSheetBehavior.B - sideSheetBehavior.A) - sideSheetBehavior.D);
    }

    @Override // defpackage.c590
    public final int e() {
        return this.a.B;
    }

    @Override // defpackage.c590
    public final int f() {
        return this.a.B;
    }

    @Override // defpackage.c590
    public final int g() {
        return d();
    }

    @Override // defpackage.c590
    public final <V extends View> int h(V v) {
        return v.getLeft() - this.a.D;
    }

    @Override // defpackage.c590
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // defpackage.c590
    public final int j() {
        return 0;
    }

    @Override // defpackage.c590
    public final boolean k(float f) {
        return f < 0.0f;
    }

    @Override // defpackage.c590
    public final boolean l(View view) {
        return view.getLeft() > (d() + this.a.B) / 2;
    }

    @Override // defpackage.c590
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.c590
    public final boolean n(View view, float f) {
        return Math.abs((f * this.a.z) + ((float) view.getRight())) > 0.5f;
    }

    @Override // defpackage.c590
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // defpackage.c590
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.B;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
