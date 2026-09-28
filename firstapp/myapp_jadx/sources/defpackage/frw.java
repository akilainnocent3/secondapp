package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.components.MultipliercomponentKt$MoonAnimationOverlay$1$1$1", f = "Multipliercomponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class frw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frw(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.a = str;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new frw(v1bVar, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((frw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        boolean zEquals = str.equals("ROUND_ONGOING");
        ytw<Boolean> ytwVar = this.b;
        if (zEquals) {
            ytw ytwVar2 = trw.a;
            ytwVar.setValue(Boolean.TRUE);
        } else if (str.equals("ROUND_WAITING")) {
            ytw ytwVar3 = trw.a;
            ytwVar.setValue(Boolean.FALSE);
        }
        return Unit.a;
    }
}
