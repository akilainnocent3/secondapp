package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$toggleShowBalance$1", f = "MeViewModel.kt", l = {429}, m = "invokeSuspend", v = 2)
public final class phv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phv(rhv rhvVar, v1b<? super phv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new phv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((phv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rhv rhvVar = this.b;
            boolean z = ((cgv) rhvVar.O.getValue()).e.a;
            nev nevVar = rhvVar.b;
            this.a = 1;
            if (nevVar.b.setShowBalance(!z, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
