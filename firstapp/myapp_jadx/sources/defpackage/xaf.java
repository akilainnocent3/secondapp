package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.state.DraggableLazyListState", f = "DraggableLazyListState.kt", l = {193}, m = "onDragStart$compose_ui", v = 2)
public final class xaf extends x1b {
    public Object a;
    public zyr b;
    public zyr c;
    public float d;
    public /* synthetic */ Object e;
    public final /* synthetic */ abf f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xaf(abf abfVar, x1b x1bVar) {
        super(x1bVar);
        this.f = abfVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(null, 0.0f, this);
    }
}
