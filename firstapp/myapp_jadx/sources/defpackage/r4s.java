package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class r4s extends c590 {
    public final SideSheetBehavior<? extends View> a;

    public r4s(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.c590
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.c590
    public final float b(int i) {
        float fE = e();
        return (i - fE) / (d() - fE);
    }

    @Override // defpackage.c590
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.c590
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.C + sideSheetBehavior.D);
    }

    @Override // defpackage.c590
    public final int e() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return (-sideSheetBehavior.A) - sideSheetBehavior.D;
    }

    @Override // defpackage.c590
    public final int f() {
        return this.a.D;
    }

    @Override // defpackage.c590
    public final int g() {
        return -this.a.A;
    }

    @Override // defpackage.c590
    public final <V extends View> int h(V v) {
        return v.getRight() + this.a.D;
    }

    @Override // defpackage.c590
    public final int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // defpackage.c590
    public final int j() {
        return 1;
    }

    @Override // defpackage.c590
    public final boolean k(float f) {
        return f > 0.0f;
    }

    @Override // defpackage.c590
    public final boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // defpackage.c590
    public final boolean m(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.c590
    public final boolean n(View view, float f) {
        return Math.abs((f * this.a.z) + ((float) view.getLeft())) > 0.5f;
    }

    @Override // defpackage.c590
    public final void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // defpackage.c590
    public final void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.B) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
