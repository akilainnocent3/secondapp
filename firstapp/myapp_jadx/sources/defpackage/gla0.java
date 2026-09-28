package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gla0 implements pya {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gla0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pya
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((x360) obj2).invoke(obj);
                break;
            default:
                ((l830) obj2).onNext((f1e0) obj);
                break;
        }
    }
}
