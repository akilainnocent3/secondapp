package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarOngoingCarOverlayKt$SportyCarOngoingCarOverlay$2$1", f = "SportyCarOngoingCarOverlay.kt", l = {}, m = "invokeSuspend", v = 1)
public final class anb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ fnb0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ isw d;
    public final /* synthetic */ isw e;
    public final /* synthetic */ isw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anb0(String str, fnb0 fnb0Var, float f, isw iswVar, isw iswVar2, isw iswVar3, v1b<? super anb0> v1bVar) {
        super(2, v1bVar);
        this.a = str;
        this.b = fnb0Var;
        this.c = f;
        this.d = iswVar;
        this.e = iswVar2;
        this.f = iswVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new anb0(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((anb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.a;
        int iHashCode = str.hashCode();
        isw iswVar = this.f;
        fnb0 fnb0Var = this.b;
        isw iswVar2 = this.e;
        isw iswVar3 = this.d;
        if (iHashCode != -1111393803) {
            if (iHashCode != 1599022634) {
                if (iHashCode == 1862985098 && str.equals("ROUND_ONGOING")) {
                    iswVar3.A(1.0f);
                    iswVar2.A(fnb0Var.b);
                    iswVar.A(1.0f);
                }
            } else if (str.equals("ROUND_END_WAIT")) {
                iswVar3.A(0.0f);
                iswVar2.A((-this.c) * fnb0Var.a);
                iswVar.A(0.1f);
            }
        } else if (str.equals("ROUND_PRE_START")) {
            iswVar3.A(1.0f);
            iswVar2.A(fnb0Var.b);
            iswVar.A(1.0f);
        }
        return Unit.a;
    }
}
