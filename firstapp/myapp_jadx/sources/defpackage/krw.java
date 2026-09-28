package defpackage;

import com.esotericsoftware.spine.android.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherov2.components.MultipliercomponentKt$Multipliercomponent$2", f = "Multipliercomponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class krw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<b> a;
    public final /* synthetic */ dq40<String> b;
    public final /* synthetic */ yp40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krw(ytw<b> ytwVar, dq40<String> dq40Var, yp40 yp40Var, v1b<? super krw> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = dq40Var;
        this.c = yp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new krw(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((krw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b value = this.a.getValue();
        if (value != null) {
            value.a().m(0, this.b.a, this.c.a);
        }
        return Unit.a;
    }
}
