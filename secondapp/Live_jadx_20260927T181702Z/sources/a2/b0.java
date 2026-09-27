package a2;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import dr.w2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nSpannableStringBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,163:1\n74#1,4:164\n74#1,4:168\n74#1,4:172\n74#1,4:176\n74#1,4:180\n74#1,4:184\n74#1,4:188\n74#1,4:192\n74#1,4:196\n*S KotlinDebug\n*F\n+ 1 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n87#1:164,4\n96#1:168,4\n105#1:172,4\n115#1:176,4\n125#1:180,4\n134#1:184,4\n144#1:188,4\n153#1:192,4\n162#1:196,4\n*E\n"})
public final class b0 {
    @oy.l
    public static final SpannableStringBuilder a(@oy.l SpannableStringBuilder spannableStringBuilder, @k.k int i10, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder b(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannedString c(@oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @oy.l
    public static final SpannableStringBuilder d(@oy.l SpannableStringBuilder spannableStringBuilder, @k.k int i10, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder e(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l Object obj, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder f(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l Object[] objArr, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder g(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder h(@oy.l SpannableStringBuilder spannableStringBuilder, float f10, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f10);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder i(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder j(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder k(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @oy.l
    public static final SpannableStringBuilder l(@oy.l SpannableStringBuilder spannableStringBuilder, @oy.l ds.l<? super SpannableStringBuilder, w2> lVar) {
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
