package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ttu implements uni0 {
    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        String strA;
        nk0Var.getClass();
        String str = nk0Var.b;
        if (str == null || (strA = fu5.a("\\d(?=\\d{4})", str, "*")) == null) {
            strA = "--";
        }
        return new wsg0(new nk0(strA), mly.a.a);
    }
}
