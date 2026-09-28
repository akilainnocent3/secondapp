package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lnf0 implements snf0.a<snf0.b> {
    public final /* synthetic */ String[] a;

    public lnf0(String[] strArr) {
        this.a = strArr;
    }

    @Override // snf0.a
    public final void a(snf0.b bVar) {
        snf0.b bVar2 = bVar;
        String[] strArr = this.a;
        bVar2.c = bnf0.a(strArr[1]);
        bnf0.a(strArr[2]);
        if (bVar2.c == 0) {
            throw null;
        }
    }
}
