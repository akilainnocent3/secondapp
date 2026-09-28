package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$animationTo$6$1", f = "SBCardNumber.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
public final class rb60 extends tje0 implements Function2<v5b, v1b<? super ui0<Float, ij0>>, Object> {
    public int a;
    public final /* synthetic */ Pair<wd0<Float, ij0>, Float> b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb60(Pair<wd0<Float, ij0>, Float> pair, int i, v1b<? super rb60> v1bVar) {
        super(2, v1bVar);
        this.b = pair;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rb60(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ui0<Float, ij0>> v1bVar) {
        return ((rb60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        Pair<wd0<Float, ij0>, Float> pair = this.b;
        wd0<Float, ij0> wd0Var = pair.a;
        Float f = pair.b;
        gzg0 gzg0VarE = yi0.e(this.c, 0, xkf.d, 2);
        this.a = 1;
        Object objA = wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12);
        return objA == y5bVar ? y5bVar : objA;
    }
}
