package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class nui extends l8l {
    public static final Range<Integer> d = new Range<>(30, 30);
    public final int a = 60;
    public final int b = 60;
    public final kch c = kch.b;

    @Override // defpackage.l8l
    public final kch a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.a);
        sb.append(", maxFps=");
        return rr1.b(sb, this.b, ')');
    }
}
