package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y3g implements nb30<Object> {
    public static final y3g a;
    public static final /* synthetic */ y3g[] b;

    static {
        y3g y3gVar = new y3g("INSTANCE", 0);
        a = y3gVar;
        b = new y3g[]{y3gVar};
    }

    public y3g() {
        throw null;
    }

    public static y3g valueOf(String str) {
        return (y3g) Enum.valueOf(y3g.class, str);
    }

    public static y3g[] values() {
        return (y3g[]) b.clone();
    }

    @Override // defpackage.mb30
    public final int b(int i) {
        return 2;
    }

    @Override // defpackage.lk90
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.lk90
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.lk90
    public final Object poll() {
        return null;
    }

    @Override // defpackage.bee0
    public final void request(long j) {
        gee0.e(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // defpackage.bee0
    public final void cancel() {
    }

    @Override // defpackage.lk90
    public final void clear() {
    }
}
