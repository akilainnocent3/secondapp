package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hkv implements oya {
    public final /* synthetic */ mkv.a a;
    public final /* synthetic */ tws b;
    public final /* synthetic */ pjv c;

    public /* synthetic */ hkv(mkv.a aVar, tws twsVar, pjv pjvVar) {
        this.a = aVar;
        this.b = twsVar;
        this.c = pjvVar;
    }

    @Override // defpackage.oya
    public final void accept(Object obj) {
        mkv.a aVar = this.a;
        ((mkv) obj).U(aVar.a, aVar.b, this.b, this.c);
    }
}
