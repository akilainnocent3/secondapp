package com.yandex.div.core.font;

import android.graphics.Typeface;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a {
    @Nullable
    public static Typeface a(DivTypefaceProvider divTypefaceProvider, int i10) {
        if (i10 >= 0 && i10 < 350) {
            return divTypefaceProvider.getLight();
        }
        if (i10 < 350 || i10 >= 450) {
            return (i10 < 450 || i10 >= 600) ? divTypefaceProvider.getBold() : divTypefaceProvider.getMedium();
        }
        return divTypefaceProvider.getRegular();
    }

    public static boolean b(DivTypefaceProvider divTypefaceProvider) {
        return false;
    }
}
