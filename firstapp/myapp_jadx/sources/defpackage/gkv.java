package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gkv implements oya {
    public final /* synthetic */ mkv.a a;
    public final /* synthetic */ tws b;
    public final /* synthetic */ pjv c;
    public final /* synthetic */ int d;

    public /* synthetic */ gkv(mkv.a aVar, tws twsVar, pjv pjvVar, int i) {
        this.a = aVar;
        this.b = twsVar;
        this.c = pjvVar;
        this.d = i;
    }

    @Override // defpackage.oya
    public final void accept(Object obj) {
        mkv mkvVar = (mkv) obj;
        mkv.a aVar = this.a;
        mkvVar.L(aVar.a, aVar.b, this.b, this.c, this.d);
    }
}
