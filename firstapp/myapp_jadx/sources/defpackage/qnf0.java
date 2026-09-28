package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qnf0 implements snf0.a<snf0.c> {
    public final /* synthetic */ String[] a;

    public qnf0(String[] strArr) {
        this.a = strArr;
    }

    @Override // snf0.a
    public final void a(snf0.c cVar) {
        snf0.c cVar2 = cVar;
        String[] strArr = this.a;
        cVar2.c = Integer.parseInt(strArr[1]);
        cVar2.d = Integer.parseInt(strArr[2]);
        cVar2.e = Integer.parseInt(strArr[3]);
        cVar2.f = Integer.parseInt(strArr[4]);
    }
}
