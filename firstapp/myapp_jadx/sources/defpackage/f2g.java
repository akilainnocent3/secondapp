package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f2g implements gb30<Object> {
    public static final f2g a;
    public static final /* synthetic */ f2g[] b;

    static {
        f2g f2gVar = new f2g("INSTANCE", 0);
        a = f2gVar;
        b = new f2g[]{f2gVar, new f2g("NEVER", 1)};
    }

    public f2g() {
        throw null;
    }

    public static f2g valueOf(String str) {
        return (f2g) Enum.valueOf(f2g.class, str);
    }

    public static f2g[] values() {
        return (f2g[]) b.clone();
    }

    @Override // defpackage.mb30
    public final int b(int i) {
        return 2;
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return this == a;
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

    @Override // defpackage.lk90
    public final void clear() {
    }

    @Override // defpackage.pse
    public final void dispose() {
    }
}
