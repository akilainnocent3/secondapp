package defpackage;

import com.sportybet.feature.gift.gift.presentation.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftScreenKt$GiftRoute$2$1", f = "GiftScreen.kt", l = {86}, m = "invokeSuspend", v = 2)
public final class ssk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zpz b;
    public final /* synthetic */ ytw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssk(zpz zpzVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = zpzVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ssk(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ssk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            int iOrdinal = ((i) this.c.getValue()).a.ordinal();
            if (iOrdinal == 0) {
                i = 0;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                i = 1;
            }
            zpz zpzVar = this.b;
            if (zpzVar.k() != i) {
                this.a = 1;
                if (zpzVar.f(i, yi0.d(0.0f, 0.0f, null, 7), this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
