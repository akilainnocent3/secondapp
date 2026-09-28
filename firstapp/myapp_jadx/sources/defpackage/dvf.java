package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameBottomSheetKt$EditUsernameBottomSheet$1$1", f = "EditUsernameBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dvf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ lvf a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvf(lvf lvfVar, String str, v1b<? super dvf> v1bVar) {
        super(2, v1bVar);
        this.a = lvfVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dvf(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dvf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.b;
        lvf lvfVar = this.a;
        lvfVar.A1(str);
        wwd0 wwd0Var = lvfVar.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, kvf.a((kvf) value, null, false, false, null, null, lqh0.a, 0, 191)));
        jvd0 jvd0Var = lvfVar.w;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        lvfVar.w = ej5.c(o8i0.d(lvfVar), null, null, new mvf(null, lvfVar), 3);
        return Unit.a;
    }
}
