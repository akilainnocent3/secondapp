package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.yq0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c extends yq0 {
    private boolean waitingForDismissAllowingStateLoss;

    public c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.waitingForDismissAllowingStateLoss = z;
        if (bottomSheetBehavior.c0 == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof b) {
            b bVar = (b) getDialog();
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = bVar.f;
            bottomSheetBehavior2.p0.remove(bVar.E);
        }
        a aVar = new a();
        ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehavior.p0;
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
        bottomSheetBehavior.L(5);
    }

    private boolean tryDismissWithAnimation(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof b)) {
            return false;
        }
        boolean z2 = ((b) dialog).g().X;
        return false;
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.d
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new b(getContext(), getTheme());
    }

    public c(int i) {
        super(i);
    }

    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                c.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
        }
    }
}
