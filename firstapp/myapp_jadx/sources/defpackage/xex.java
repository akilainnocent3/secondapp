package defpackage;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class xex {
    public final StaticLayout a;
    public final float b;

    public xex(StaticLayout staticLayout, float f) {
        this.a = staticLayout;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xex)) {
            return false;
        }
        xex xexVar = (xex) obj;
        return this.a.equals(xexVar.a) && Float.compare(this.b, xexVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NativeTextLayout(staticLayout=" + this.a + ", maxLineWidth=" + this.b + ")";
    }
}
