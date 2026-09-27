package com.cleveradssolutions.internal.consent;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f43311b;

    public v(a aVar) {
        this.f43311b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f43311b;
        if (aVar.f43259g && aVar.isShowing()) {
            a aVar2 = this.f43311b;
            if (!aVar2.f43261i) {
                TypedArray typedArrayObtainStyledAttributes = aVar2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                aVar2.f43260h = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                aVar2.f43261i = true;
            }
            if (aVar2.f43260h) {
                this.f43311b.cancel();
            }
        }
    }
}
