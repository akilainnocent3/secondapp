package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.gifthint.InstantWinGiftHintHandlerImpl$initGiftHint$2", f = "InstantWinGiftHintHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jfo extends tje0 implements Function2<ink, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ lfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfo(lfo lfoVar, v1b<? super jfo> v1bVar) {
        super(2, v1bVar);
        this.b = lfoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jfo jfoVar = new jfo(this.b, v1bVar);
        jfoVar.a = obj;
        return jfoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ink inkVar, v1b<? super Unit> v1bVar) {
        return ((jfo) create(inkVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ink inkVar = (ink) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.g.setValue(inkVar);
        return Unit.a;
    }
}
