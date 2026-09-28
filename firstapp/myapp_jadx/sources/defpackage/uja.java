package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uja extends IllegalStateException {
    public final String a;

    public uja(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
