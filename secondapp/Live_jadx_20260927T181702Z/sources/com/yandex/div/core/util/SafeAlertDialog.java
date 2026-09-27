package com.yandex.div.core.util;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.c;
import k.c0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SafeAlertDialog {

    @l
    private final c alertDialog;

    public SafeAlertDialog(@l c cVar) {
        this.alertDialog = cVar;
    }

    private final void setupTapjackingProtection(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setFilterTouchesWhenObscured(true);
            }
        }
    }

    public final void cancel() {
        this.alertDialog.cancel();
    }

    public final boolean checkEqualReference(@l DialogInterface dialogInterface) {
        return this.alertDialog == dialogInterface;
    }

    public final void dismiss() {
        this.alertDialog.dismiss();
    }

    @m
    public final <T extends View> T findViewById(@c0 int i10) {
        return (T) this.alertDialog.findViewById(i10);
    }

    public final void hide() {
        this.alertDialog.hide();
    }

    public final void show() {
        this.alertDialog.show();
        setupTapjackingProtection(this.alertDialog.g(), this.alertDialog.f(-1), this.alertDialog.f(-2), this.alertDialog.f(-3));
    }
}
