package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class e5y {
    public static e5y b;
    public final wdy a = new wdy();

    /* JADX WARN: Type inference failed for: r3v2, types: [vdy] */
    public final ddy a() {
        wdy wdyVar = this.a;
        l830<wdy> l830Var = wdyVar.a;
        final udy udyVar = new udy(wdyVar, 0);
        ?? r3 = new pya() { // from class: vdy
            @Override // defpackage.pya
            public final void accept(Object obj) {
                udyVar.invoke(obj);
            }
        };
        l830Var.getClass();
        return new ddy(l830Var, r3);
    }
}
