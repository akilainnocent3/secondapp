package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st1 extends kni0 {
    public m3w<?> b;

    @Override // defpackage.kni0
    public final boolean g(i3w<?> i3wVar) {
        this.b.getClass();
        return i3wVar == u8j0.a;
    }

    @Override // defpackage.kni0
    public final <T> T i(i3w<T> i3wVar) {
        this.b.getClass();
        if (i3wVar != u8j0.a) {
            wkn.c("Check failed.");
        }
        return (T) this.b.getValue();
    }
}
