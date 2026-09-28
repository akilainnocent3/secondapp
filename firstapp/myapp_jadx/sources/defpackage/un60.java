package defpackage;

import com.sportygames.sportyherov2.components.SHToastContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.components.SHToastContainer$showRainToastWithFade$1", f = "SHToastContainer.kt", l = {108}, m = "invokeSuspend", v = 1)
public final class un60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SHToastContainer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un60(SHToastContainer sHToastContainer, v1b v1bVar) {
        super(2, v1bVar);
        this.b = sHToastContainer;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new un60(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((un60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(3000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.b.setVisibility(8);
        return Unit.a;
    }
}
