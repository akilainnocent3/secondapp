package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.identityverify.IdentityVerifyViewModel$closeVerifyFlow$1", f = "IdentityVerifyViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class h7n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i7n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7n(i7n i7nVar, v1b<? super h7n> v1bVar) {
        super(2, v1bVar);
        this.c = i7nVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h7n h7nVar = new h7n(this.c, v1bVar);
        h7nVar.b = obj;
        return h7nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h7n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                i7n i7nVar = this.c;
                zi50.a aVar = zi50.b;
                lyz lyzVar = i7nVar.a;
                this.b = null;
                this.a = 1;
                obj = lyzVar.y0(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
        return Unit.a;
    }
}
