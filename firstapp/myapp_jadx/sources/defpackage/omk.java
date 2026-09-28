package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$tryLaunchInfo$1", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class omk extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ hmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(hmk hmkVar, v1b<? super omk> v1bVar) {
        super(2, v1bVar);
        this.b = hmkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        omk omkVar = new omk(this.b, v1bVar);
        omkVar.a = ((Boolean) obj).booleanValue();
        return omkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((omk) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.C.m(Boolean.valueOf(z));
        return Unit.a;
    }
}
