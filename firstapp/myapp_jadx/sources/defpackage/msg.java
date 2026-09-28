package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchRadioStreamData$1", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class msg extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msg(v1b v1bVar, e eVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        msg msgVar = new msg(v1bVar, this.b);
        msgVar.a = obj;
        return msgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((msg) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.l0.m(new UIState.Success(str));
        return Unit.a;
    }
}
