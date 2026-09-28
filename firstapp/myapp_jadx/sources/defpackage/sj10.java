package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sj10 {
    public static final sj10 b = new sj10();
    public final boolean a;

    public sj10(int i) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sj10) {
            return this.a == ((sj10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return mq0.a(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public sj10() {
        this(false);
    }

    public sj10(boolean z) {
        this.a = z;
    }
}
