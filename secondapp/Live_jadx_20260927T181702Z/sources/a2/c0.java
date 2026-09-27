package a2;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSpannableString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n31#2,4:67\n13579#3,2:71\n*S KotlinDebug\n*F\n+ 1 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n32#1:67,4\n32#1:71,2\n*E\n"})
public final class c0 {
    public static final void a(@oy.l Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void b(@oy.l Spannable spannable, int i10, int i11, @oy.l Object obj) {
        spannable.setSpan(obj, i10, i11, 17);
    }

    public static final void c(@oy.l Spannable spannable, @oy.l ms.l lVar, @oy.l Object obj) {
        spannable.setSpan(obj, lVar.m().intValue(), lVar.d().intValue(), 17);
    }

    @oy.l
    public static final Spannable d(@oy.l CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }
}
