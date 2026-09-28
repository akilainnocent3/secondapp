package defpackage;

import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public final class mvo {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
