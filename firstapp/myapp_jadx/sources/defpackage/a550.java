package defpackage;

import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sporty.android.core.model.remixbet.RemixBetResponse;
import com.sportybet.feature.remixbet.presentation.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.presentation.RemixBetViewModel$loadData$1", f = "RemixBetViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class a550 extends tje0 implements Function1<v1b<? super RemixBetResponse>, Object> {
    public int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ RemixBetRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a550(g gVar, RemixBetRequest remixBetRequest, v1b<? super a550> v1bVar) {
        super(1, v1bVar);
        this.b = gVar;
        this.c = remixBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new a550(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super RemixBetResponse> v1bVar) {
        return ((a550) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        i450 i450Var = this.b.a;
        this.a = 1;
        Object objA = i450Var.a(this.c, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
