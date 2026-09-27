package com.yandex.div.core;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface Div2ImageStubProvider {
    public static final Div2ImageStubProvider STUB = new Div2ImageStubProvider() { // from class: com.yandex.div.core.c
        @Override // com.yandex.div.core.Div2ImageStubProvider
        public final Drawable getImageStubDrawable(int i10) {
            return new ColorDrawable(i10);
        }
    };

    @Nullable
    Drawable getImageStubDrawable(@k.k int i10);
}
