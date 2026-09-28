package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListState", f = "DraggableList.kt", l = {169, 173}, m = "settle$compose_ui", v = 2)
public final class gcf extends x1b {
    public int a;
    public Integer b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fcf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcf(fcf fcfVar, x1b x1bVar) {
        super(x1bVar);
        this.d = fcfVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0.0f, 0, this);
    }
}
