package com.startapp.sdk.internal;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class da {
    public static final String a(InputMethodSubtype inputMethodSubtype) {
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        return TextUtils.isEmpty(languageTag) ? inputMethodSubtype.getLocale() : languageTag;
    }
}
