package defpackage;

import com.sportybet.feature.gift.gift.presentation.i;
import com.sportybet.feature.gift.gift.presentation.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$checkPreFtdStatus$1", f = "GiftViewModel.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class oyk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyk(k kVar, v1b<? super oyk> v1bVar) {
        super(2, v1bVar);
        this.b = kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oyk(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oyk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        boolean z;
        wwd0 wwd0Var;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        k kVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (kVar.v.F()) {
                e7e e7eVar = kVar.w;
                this.a = 1;
                objA = e7eVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            }
            z = z;
            wwd0Var = kVar.H;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, null, 0, null, false, z, 2047)));
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        objA = obj;
        boolean z2 = ((Boolean) objA).booleanValue();
        z = z2;
        wwd0Var = kVar.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, null, 0, null, false, z, 2047)));
        return Unit.a;
    }
}
