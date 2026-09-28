package defpackage;

import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class jsc {
    public final String a;
    public final char b;
    public final String c;

    public jsc(char c, String str) {
        this.a = str;
        this.b = c;
        this.c = c.p(str, String.valueOf(c), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsc)) {
            return false;
        }
        jsc jscVar = (jsc) obj;
        return this.a.equals(jscVar.a) && this.b == jscVar.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
