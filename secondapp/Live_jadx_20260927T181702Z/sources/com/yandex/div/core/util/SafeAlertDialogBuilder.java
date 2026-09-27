package com.yandex.div.core.util;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.c;
import k.b1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SafeAlertDialogBuilder {

    @l
    private final c.a alertDialogBuilder;

    public SafeAlertDialogBuilder(@l Context context) {
        this.alertDialogBuilder = new c.a(context);
    }

    @l
    public final SafeAlertDialog create() {
        return new SafeAlertDialog(this.alertDialogBuilder.create());
    }

    @l
    public final SafeAlertDialogBuilder setMessage(@b1 int i10) {
        this.alertDialogBuilder.k(i10);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setNegativeButton(@b1 int i10, @m DialogInterface.OnClickListener onClickListener) {
        this.alertDialogBuilder.setNegativeButton(i10, onClickListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setOnCancelListener(@m DialogInterface.OnCancelListener onCancelListener) {
        this.alertDialogBuilder.u(onCancelListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setOnDismissListener(@m DialogInterface.OnDismissListener onDismissListener) {
        this.alertDialogBuilder.v(onDismissListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setPositiveButton(@b1 int i10, @m DialogInterface.OnClickListener onClickListener) {
        this.alertDialogBuilder.setPositiveButton(i10, onClickListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setTitle(@b1 int i10) {
        this.alertDialogBuilder.F(i10);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setView(@m View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        this.alertDialogBuilder.setView(view);
        return this;
    }

    @l
    public final SafeAlertDialog show() {
        SafeAlertDialog safeAlertDialogCreate = create();
        safeAlertDialogCreate.show();
        return safeAlertDialogCreate;
    }

    @l
    public final SafeAlertDialogBuilder setMessage(@m CharSequence charSequence) {
        this.alertDialogBuilder.l(charSequence);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setNegativeButton(@l String str, @m DialogInterface.OnClickListener onClickListener) {
        this.alertDialogBuilder.p(str, onClickListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setPositiveButton(@l String str, @m DialogInterface.OnClickListener onClickListener) {
        this.alertDialogBuilder.y(str, onClickListener);
        return this;
    }

    @l
    public final SafeAlertDialogBuilder setTitle(@m CharSequence charSequence) {
        this.alertDialogBuilder.setTitle(charSequence);
        return this;
    }
}
