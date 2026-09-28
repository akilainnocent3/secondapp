package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
public final class qnz extends tje0 implements Function2<myh<? super Integer>, v1b<? super Unit>, Object> {
    public final /* synthetic */ onz<Object, Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnz(onz<Object, Object> onzVar, v1b<? super qnz> v1bVar) {
        super(2, v1bVar);
        this.a = onzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qnz(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Integer> myhVar, v1b<? super Unit> v1bVar) {
        return ((qnz) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        onz<Object, Object> onzVar = this.a;
        onzVar.i.c(new Integer(onzVar.g));
        return Unit.a;
    }
}
