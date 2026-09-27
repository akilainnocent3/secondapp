package bl;

import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@AutoValue
public abstract class x implements Comparable<x> {
    public static x b(String str, long j10) {
        return new b(str, j10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(x xVar) {
        return c() < xVar.c() ? -1 : 1;
    }

    public abstract long c();

    public abstract String d();
}
