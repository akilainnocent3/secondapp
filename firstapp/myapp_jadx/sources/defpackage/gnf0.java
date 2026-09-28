package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gnf0 implements snf0.a<snf0.c> {
    public final /* synthetic */ String[] a;

    public gnf0(String[] strArr) {
        this.a = strArr;
    }

    @Override // snf0.a
    public final void a(snf0.c cVar) {
        snf0.c cVar2 = cVar;
        String str = this.a[1];
        if (str.equals("true")) {
            cVar2.k = 90;
        } else if (!str.equals("false")) {
            cVar2.k = Integer.parseInt(str);
        }
        cVar2.l = cVar2.k == 90;
    }
}
