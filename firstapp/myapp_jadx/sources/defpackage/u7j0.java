package defpackage;

import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class u7j0 implements zmv {
    public final m54.a a;

    public u7j0(m54.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.zmv
    public final int a(owo owoVar, long j, int i, asr asrVar) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (asrVar == asr.a ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return f.e(this.a.a(i, i2, asrVar), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7j0) && this.a.equals(((u7j0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
