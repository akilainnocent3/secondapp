package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class dn8 {
    public static final /* synthetic */ long b = s0o.a.objectFieldOffset(dn8.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public dn8(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return vt5.b(sb, this.a, ']');
    }
}
