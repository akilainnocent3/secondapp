package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0d implements kgt {
    public kgt.a a;

    @Override // defpackage.kgt
    public final kgt.a a() {
        return this.a;
    }

    @Override // defpackage.kgt
    public final void b(String str, kgt.a aVar, String str2, Throwable th) {
        if (str2 != null) {
            vsh0.c(aVar, str, str2);
        }
        if (th != null) {
            vsh0.c(aVar, str, rtg.b(th));
        }
    }
}
