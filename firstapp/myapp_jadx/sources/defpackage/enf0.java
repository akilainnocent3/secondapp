package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class enf0 implements snf0.a<snf0.c> {
    public final /* synthetic */ String[] a;

    public enf0(String[] strArr) {
        this.a = strArr;
    }

    @Override // snf0.a
    public final void a(snf0.c cVar) {
        snf0.c cVar2 = cVar;
        String[] strArr = this.a;
        cVar2.i = Integer.parseInt(strArr[1]);
        cVar2.j = Integer.parseInt(strArr[2]);
    }
}
