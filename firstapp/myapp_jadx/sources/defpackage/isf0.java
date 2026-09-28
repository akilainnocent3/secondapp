package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.TierMenuKt$TierListView$1$5$1$1", f = "TierMenu.kt", l = {321}, m = "emit", v = 2)
public final class isf0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fsf0.e.a<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isf0(fsf0.e.a<Object> aVar, v1b<? super isf0> v1bVar) {
        super(v1bVar);
        this.b = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
