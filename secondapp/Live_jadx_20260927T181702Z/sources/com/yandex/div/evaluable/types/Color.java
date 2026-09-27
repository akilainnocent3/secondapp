package com.yandex.div.evaluable.types;

import cs.h;
import cv.e;
import cv.p0;
import java.util.Locale;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@h
public final class Color {

    @l
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\ncom/yandex/div/evaluable/types/Color$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX INFO: renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m3350argbH0kstlE(int i10, int i11, int i12, int i13) {
            return Color.m3342constructorimpl((i10 << 24) | (i11 << 16) | (i12 << 8) | i13);
        }

        /* JADX INFO: renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m3351parseC4zCDoM(@l String colorString) throws IllegalArgumentException {
            String str;
            m0.p(colorString, "colorString");
            if (colorString.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (colorString.charAt(0) != '#') {
                throw new IllegalArgumentException(("Unknown color " + colorString).toString());
            }
            int length = colorString.length();
            if (length == 4) {
                char cCharAt = colorString.charAt(1);
                char cCharAt2 = colorString.charAt(2);
                char cCharAt3 = colorString.charAt(3);
                str = new String(new char[]{'f', 'f', cCharAt, cCharAt, cCharAt2, cCharAt2, cCharAt3, cCharAt3});
            } else if (length == 5) {
                char cCharAt4 = colorString.charAt(1);
                char cCharAt5 = colorString.charAt(2);
                char cCharAt6 = colorString.charAt(3);
                char cCharAt7 = colorString.charAt(4);
                str = new String(new char[]{cCharAt4, cCharAt4, cCharAt5, cCharAt5, cCharAt6, cCharAt6, cCharAt7, cCharAt7});
            } else if (length == 7) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ff");
                String strSubstring = colorString.substring(1);
                m0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                str = sb2.toString();
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color " + colorString);
                }
                str = colorString.substring(1);
                m0.o(str, "this as java.lang.String).substring(startIndex)");
            }
            return Color.m3342constructorimpl((int) Long.parseLong(str, e.a(16)));
        }

        /* JADX INFO: renamed from: rgb-B7-1Z8I, reason: not valid java name */
        public final int m3352rgbB71Z8I(int i10, int i11, int i12) {
            return m3350argbH0kstlE(255, i10, i11, i12);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(int i10) {
        this.value = i10;
    }

    /* JADX INFO: renamed from: alpha-impl, reason: not valid java name */
    public static final int m3339alphaimpl(int i10) {
        return i10 >>> 24;
    }

    /* JADX INFO: renamed from: blue-impl, reason: not valid java name */
    public static final int m3340blueimpl(int i10) {
        return i10 & 255;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m3341boximpl(int i10) {
        return new Color(i10);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3343equalsimpl(int i10, Object obj) {
        return (obj instanceof Color) && i10 == ((Color) obj).m3349unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3344equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: green-impl, reason: not valid java name */
    public static final int m3345greenimpl(int i10) {
        return (i10 >> 8) & 255;
    }

    /* JADX INFO: renamed from: red-impl, reason: not valid java name */
    public static final int m3347redimpl(int i10) {
        return (i10 >> 16) & 255;
    }

    @l
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3348toStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('#');
        String hexString = Integer.toHexString(i10);
        m0.o(hexString, "toHexString(value)");
        String upperCase = p0.m4(hexString, 8, '0').toUpperCase(Locale.ROOT);
        m0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb2.append(upperCase);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m3343equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3346hashCodeimpl(this.value);
    }

    @l
    public String toString() {
        return m3348toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3349unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m3342constructorimpl(int i10) {
        return i10;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3346hashCodeimpl(int i10) {
        return i10;
    }
}
