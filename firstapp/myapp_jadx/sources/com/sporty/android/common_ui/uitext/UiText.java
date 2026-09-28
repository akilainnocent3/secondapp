package com.sporty.android.common_ui.uitext;

import android.content.Context;
import android.os.Parcelable;
import defpackage.nk0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/common_ui/uitext/UiText;", "Landroid/os/Parcelable;", "<init>", "()V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class UiText implements Parcelable {
    public nk0 a(Context context) {
        context.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        bVar.f(e(context));
        return bVar.m();
    }

    public abstract CharSequence e(Context context);

    public final String g(Context context) {
        context.getClass();
        return e(context).toString();
    }

    public final ConcatUiText h(UiText uiText) {
        uiText.getClass();
        return new ConcatUiText(new UiText[]{this, uiText});
    }
}
