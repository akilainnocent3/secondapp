package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rhl0 {
    public static /* synthetic */ void a(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }
}
