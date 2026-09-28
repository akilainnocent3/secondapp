package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fkv implements oya {
    public final /* synthetic */ mkv.a a;
    public final /* synthetic */ pjv b;

    public /* synthetic */ fkv(mkv.a aVar, pjv pjvVar) {
        this.a = aVar;
        this.b = pjvVar;
    }

    @Override // defpackage.oya
    public final void accept(Object obj) {
        mkv.a aVar = this.a;
        ((mkv) obj).M(aVar.a, aVar.b, this.b);
    }
}
