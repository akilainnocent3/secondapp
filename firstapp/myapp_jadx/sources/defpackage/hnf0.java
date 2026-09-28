package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hnf0 implements snf0.a<snf0.c> {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ boolean[] b;

    public hnf0(String[] strArr, boolean[] zArr) {
        this.a = strArr;
        this.b = zArr;
    }

    @Override // snf0.a
    public final void a(snf0.c cVar) {
        int i = Integer.parseInt(this.a[1]);
        cVar.m = i;
        if (i != -1) {
            this.b[0] = true;
        }
    }
}
