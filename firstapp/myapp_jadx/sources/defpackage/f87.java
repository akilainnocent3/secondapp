package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f87 {
    public static int a(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static /* synthetic */ void b(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
}
