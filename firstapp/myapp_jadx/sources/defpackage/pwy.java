package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$FlyingBallAnimation$4$1", f = "OngoingComponent.kt", l = {758}, m = "invokeSuspend", v = 1)
public final class pwy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ytw<Boolean> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwy(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.b = str;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pwy(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pwy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            int i2 = bxy.a;
            Boolean bool = Boolean.FALSE;
            ytwVar.setValue(bool);
            if (c.l(this.b, "ROUND_PRE_START", true)) {
                this.a = 1;
                if (hkd.b(520L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                ytwVar.setValue(bool);
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        int i3 = bxy.a;
        ytwVar.setValue(Boolean.TRUE);
        return Unit.a;
    }
}
