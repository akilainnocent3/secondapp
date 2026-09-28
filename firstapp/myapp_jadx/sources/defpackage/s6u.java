package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository$requiredLobbyEnabledCache$1", f = "LuckyNumberRepository.kt", l = {235, 236}, m = "invokeSuspend", v = 2)
public final class s6u extends tje0 implements Function1<v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ i6u b;
    public final /* synthetic */ Function1<v1b<Object>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s6u(i6u i6uVar, Function1<? super v1b<Object>, ? extends Object> function1, v1b<? super s6u> v1bVar) {
        super(1, v1bVar);
        this.b = i6uVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new s6u(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<Object> v1bVar) {
        return ((s6u) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (this.b.b(this) != y5bVar) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.a = 2;
        Object objInvoke = this.c.invoke(this);
        return objInvoke == y5bVar ? y5bVar : objInvoke;
    }
}
