package a2;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final boolean a(@oy.l CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int b(@oy.l CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
