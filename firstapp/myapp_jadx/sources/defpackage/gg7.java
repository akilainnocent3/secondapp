package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.ui.ChatScreenKt$SendMessageUI$1$1", f = "ChatScreen.kt", l = {}, m = "invokeSuspend", v = 1)
public final class gg7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ hh7 a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg7(hh7 hh7Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = hh7Var;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gg7(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gg7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (((Boolean) this.b.getValue()).booleanValue()) {
            wwd0 wwd0Var = this.a.F;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
        }
        return Unit.a;
    }
}
