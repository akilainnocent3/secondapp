package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.assign.viewmodel.AssignedCustomCodeViewModel$init$1", f = "AssignedCustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lz0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ oz0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gdc c;
    public final /* synthetic */ jz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(oz0 oz0Var, String str, gdc gdcVar, jz0 jz0Var, v1b<? super lz0> v1bVar) {
        super(2, v1bVar);
        this.a = oz0Var;
        this.b = str;
        this.c = gdcVar;
        this.d = jz0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lz0(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lz0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        oz0 oz0Var = this.a;
        wwd0 wwd0Var = oz0Var.a;
        kz0 kz0Var = (kz0) wwd0Var.getValue();
        String lastNickName = oz0Var.e.getLastNickName();
        if (lastNickName == null) {
            lastNickName = "";
        }
        boolean z = kz0Var.a;
        String str = this.b;
        str.getClass();
        kz0 kz0Var2 = new kz0(z, str, this.c, lastNickName, this.d);
        wwd0Var.getClass();
        wwd0Var.k(null, kz0Var2);
        return Unit.a;
    }
}
