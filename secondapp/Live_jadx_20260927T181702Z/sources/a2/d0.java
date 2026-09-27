package a2;

import android.text.Spanned;
import android.text.SpannedString;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final /* synthetic */ <T> T[] a(Spanned spanned, int i10, int i11) {
        m0.y(4, "T");
        return (T[]) spanned.getSpans(i10, i11, Object.class);
    }

    public static /* synthetic */ Object[] b(Spanned spanned, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = spanned.length();
        }
        m0.y(4, "T");
        return spanned.getSpans(i10, i11, Object.class);
    }

    @oy.l
    public static final Spanned c(@oy.l CharSequence charSequence) {
        return SpannedString.valueOf(charSequence);
    }
}
