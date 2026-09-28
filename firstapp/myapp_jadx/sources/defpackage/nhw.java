package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nhw {
    public final float a;
    public final float b;
    public final float c;
    public final Float d;

    public nhw(float f, float f2, float f3, Float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhw)) {
            return false;
        }
        nhw nhwVar = (nhw) obj;
        return Float.compare(this.a, nhwVar.a) == 0 && Float.compare(this.b, nhwVar.b) == 0 && Float.compare(this.c, nhwVar.c) == 0 && Intrinsics.g(this.d, nhwVar.d);
    }

    public final int hashCode() {
        int iA = tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        Float f = this.d;
        return iA + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "MultiMakerOddsRangeSeekBarUiState(minProgress=" + this.a + ", maxProgress=" + this.b + ", leftProgress=" + this.c + ", rightProgress=" + this.d + ")";
    }

    public /* synthetic */ nhw(int i) {
        this(1.0f, 100.0f, 1.0f, Float.valueOf(100.0f));
    }
}
