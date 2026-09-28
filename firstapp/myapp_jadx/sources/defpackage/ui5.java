package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.BuildAndGoViewModel$uiState$1", f = "BuildAndGoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ui5 extends tje0 implements iaj<ni5, zs, Boolean, v1b<? super ni5>, Object> {
    public /* synthetic */ ni5 a;
    public /* synthetic */ zs b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui5(f fVar, v1b<? super ui5> v1bVar) {
        super(4, v1bVar);
        this.d = fVar;
    }

    @Override // defpackage.iaj
    public final Object d(ni5 ni5Var, zs zsVar, Boolean bool, v1b<? super ni5> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ui5 ui5Var = new ui5(this.d, v1bVar);
        ui5Var.a = ni5Var;
        ui5Var.b = zsVar;
        ui5Var.c = zBooleanValue;
        return ui5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ni5 ni5Var = this.a;
        zs zsVar = this.b;
        boolean z = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        f fVar = this.d;
        AssetsInfo assetsInfoC = fVar.a.c();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(assetsInfoC != null ? assetsInfoC.balance : 0L);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalB = p54.b(bigDecimalValueOf);
        String strF = fVar.A.f();
        String strJ = fVar.z.j();
        strJ.getClass();
        return ni5.a(ni5Var, zsVar, bigDecimalB, strF, strJ, z, null, null, null, false, false, 0, 2016);
    }
}
