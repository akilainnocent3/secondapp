package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class fky implements tqc<String> {
    @Override // defpackage.tqc
    public final void a(Exception exc) {
        eky o4dVar;
        ljy.a aVar = ljy.c;
        ljy.a aVar2 = ljy.c;
        aVar.getClass();
        int iOrdinal = ljy.a.a("DECIMAL").ordinal();
        if (iOrdinal == 0) {
            o4dVar = new o4d();
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            o4dVar = new lw();
        }
        gky.a = o4dVar;
    }

    @Override // defpackage.tqc
    public final void onSuccess(String str) {
        eky o4dVar;
        String str2 = str;
        str2.getClass();
        ljy.c.getClass();
        int iOrdinal = ljy.a.a(str2).ordinal();
        if (iOrdinal == 0) {
            o4dVar = new o4d();
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            o4dVar = new lw();
        }
        gky.a = o4dVar;
    }
}
