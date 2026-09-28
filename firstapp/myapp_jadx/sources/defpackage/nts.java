package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.LiveSectionViewModel$collectSocketMsg$1$1", f = "LiveSectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nts extends tje0 implements Function2<Object, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pts b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nts(pts ptsVar, v1b<? super nts> v1bVar) {
        super(2, v1bVar);
        this.b = ptsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nts ntsVar = new nts(this.b, v1bVar);
        ntsVar.a = obj;
        return ntsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
        return ((nts) create(obj, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.e.a(obj2);
        return Unit.a;
    }
}
