package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableLazyListItemKt$DraggableLazyListItem$2$1", f = "DraggableLazyListItem.kt", l = {}, m = "invokeSuspend", v = 2)
public final class raf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ abf a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raf(abf abfVar, Integer num, v1b v1bVar) {
        super(2, v1bVar);
        this.a = abfVar;
        this.b = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new raf(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((raf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.l.add(this.b);
        return Unit.a;
    }
}
