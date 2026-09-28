package defpackage;

import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class flt extends qlr implements Function0<Unit> {
    public final /* synthetic */ blt a;
    public final /* synthetic */ wgz b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flt(blt bltVar, wgz wgzVar, long j) {
        super(0);
        this.a = bltVar;
        this.b = wgzVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ykt yktVarX1;
        ysr ysrVar = this.a.f;
        y.a placementScope = null;
        if (zsr.a(ysrVar.a) || ysrVar.c) {
            ywx ywxVar = ysrVar.a().I;
            if (ywxVar != null) {
                placementScope = ywxVar.A;
            }
        } else {
            ywx ywxVar2 = ysrVar.a().I;
            if (ywxVar2 != null && (yktVarX1 = ywxVar2.x1()) != null) {
                placementScope = yktVarX1.A;
            }
        }
        if (placementScope == null) {
            placementScope = this.b.getPlacementScope();
        }
        ykt yktVarX2 = ysrVar.a().x1();
        yktVarX2.getClass();
        y.a.x(placementScope, yktVarX2, this.c);
        return Unit.a;
    }
}
