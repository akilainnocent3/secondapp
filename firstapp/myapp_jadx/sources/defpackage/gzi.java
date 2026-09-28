package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gzi {
    public static final nbn a(nbn nbnVar, boolean z) {
        if (!z) {
            return nbnVar;
        }
        cc5 cc5VarSource = nbnVar.source();
        return (cc5VarSource.y(0L, z4d.b) || cc5VarSource.y(0L, z4d.a)) ? obn.b(new y740(new fzi(nbnVar.source())), nbnVar.getFileSystem()) : nbnVar;
    }
}
