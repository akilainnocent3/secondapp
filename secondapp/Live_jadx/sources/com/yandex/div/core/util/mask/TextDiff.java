package com.yandex.div.core.util.mask;

import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TextDiff {

    @l
    public static final Companion Companion = new Companion(null);
    private final int added;
    private final int removed;
    private final int start;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final TextDiff build(@l String str, @l String str2) {
            if (str.length() > str2.length()) {
                TextDiff textDiffBuild = build(str2, str);
                return new TextDiff(textDiffBuild.getStart(), textDiffBuild.getRemoved(), textDiffBuild.getAdded());
            }
            int length = str2.length() - 1;
            int length2 = str2.length() - str.length();
            int i10 = 0;
            while (i10 < length && i10 < str.length() && str.charAt(i10) == str2.charAt(i10)) {
                i10++;
            }
            while (true) {
                int i11 = length - length2;
                if (i11 < i10 || str.charAt(i11) != str2.charAt(length)) {
                    break;
                }
                length--;
            }
            int i12 = (length + 1) - i10;
            return new TextDiff(i10, i12, i12 - length2);
        }

        private Companion() {
        }
    }

    public TextDiff(int i10, int i11, int i12) {
        this.start = i10;
        this.added = i11;
        this.removed = i12;
    }

    public static /* synthetic */ TextDiff copy$default(TextDiff textDiff, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = textDiff.start;
        }
        if ((i13 & 2) != 0) {
            i11 = textDiff.added;
        }
        if ((i13 & 4) != 0) {
            i12 = textDiff.removed;
        }
        return textDiff.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.added;
    }

    public final int component3() {
        return this.removed;
    }

    @l
    public final TextDiff copy(int i10, int i11, int i12) {
        return new TextDiff(i10, i11, i12);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextDiff)) {
            return false;
        }
        TextDiff textDiff = (TextDiff) obj;
        return this.start == textDiff.start && this.added == textDiff.added && this.removed == textDiff.removed;
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.start * 31) + this.added) * 31) + this.removed;
    }

    @l
    public String toString() {
        return "TextDiff(start=" + this.start + ", added=" + this.added + ", removed=" + this.removed + ')';
    }
}
