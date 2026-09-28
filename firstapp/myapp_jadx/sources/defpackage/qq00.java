package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$parseJsonAsync$1", f = "PersonalSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mq00 a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ Class<Object> c;
    public final /* synthetic */ Function1<Object, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq00(mq00 mq00Var, JSONObject jSONObject, Class<Object> cls, Function1<Object, Unit> function1, v1b<? super qq00> v1bVar) {
        super(2, v1bVar);
        this.a = mq00Var;
        this.b = jSONObject;
        this.c = cls;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qq00(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.d.invoke(this.a.f.fromJson(this.b.toString(), (Class) this.c));
        return Unit.a;
    }
}
