package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.dtg0;
import defpackage.f0b;
import defpackage.gaj;
import defpackage.hf0;
import defpackage.hh0;
import defpackage.iaj;
import defpackage.if0;
import defpackage.jf0;
import defpackage.mf0;
import defpackage.pf0;
import defpackage.pp8;
import defpackage.qlr;
import defpackage.s9g;
import defpackage.x5a0;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
    public final /* synthetic */ dtg0<Object> a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Function1<d<Object>, f0b> c;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> d;
    public final /* synthetic */ SnapshotStateList<Object> e;
    public final /* synthetic */ iaj<pf0, Object, androidx.compose.runtime.a, Integer, Unit> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(dtg0<Object> dtg0Var, Object obj, Function1<? super d<Object>, f0b> function1, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl, SnapshotStateList<Object> snapshotStateList, iaj<? super pf0, Object, ? super androidx.compose.runtime.a, ? super Integer, Unit> iajVar) {
        super(2);
        this.a = dtg0Var;
        this.b = obj;
        this.c = function1;
        this.d = animatedContentTransitionScopeImpl;
        this.e = snapshotStateList;
        this.f = iajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            f0b f0bVarY = aVar2.y();
            Function1<d<Object>, f0b> function1 = this.c;
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.d;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (f0bVarY == c0042a) {
                f0bVarY = function1.invoke(animatedContentTransitionScopeImpl);
                aVar2.r(f0bVarY);
            }
            f0b f0bVar = (f0b) f0bVarY;
            dtg0<Object> dtg0Var = this.a;
            dtg0.b<Object> bVarF = dtg0Var.f();
            ytw ytwVar = dtg0Var.d;
            Object objA = bVarF.a();
            Object obj = this.b;
            boolean zB = aVar2.b(Intrinsics.g(objA, obj));
            Object objY = aVar2.y();
            if (zB || objY == c0042a) {
                objY = Intrinsics.g(dtg0Var.f().a(), obj) ? g.a : function1.invoke(animatedContentTransitionScopeImpl).b;
                aVar2.r(objY);
            }
            g gVar = (g) objY;
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.g(obj, ((x5a0) ytwVar).getValue()));
                aVar2.r(objY2);
            }
            AnimatedContentTransitionScopeImpl.a aVar3 = (AnimatedContentTransitionScopeImpl.a) objY2;
            s9g s9gVar = f0bVar.a;
            boolean zA = aVar2.A(f0bVar);
            Object objY3 = aVar2.y();
            if (zA || objY3 == c0042a) {
                objY3 = new hf0(f0bVar);
                aVar2.r(objY3);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.layout.j.a(androidx.compose.ui.d.a.b, (gaj) objY3);
            ((x5a0) aVar3.b).setValue(Boolean.valueOf(Intrinsics.g(obj, ((x5a0) ytwVar).getValue())));
            androidx.compose.ui.d dVarN = dVarA.n(aVar3);
            boolean zA2 = aVar2.A(obj);
            Object objY4 = aVar2.y();
            if (zA2 || objY4 == c0042a) {
                objY4 = new if0(obj);
                aVar2.r(objY4);
            }
            Function1 function2 = (Function1) objY4;
            boolean zM = aVar2.M(gVar);
            Object objY5 = aVar2.y();
            if (zM || objY5 == c0042a) {
                objY5 = new jf0(gVar);
                aVar2.r(objY5);
            }
            hh0.a(this.a, function2, dVarN, s9gVar, gVar, (Function2) objY5, pp8.b(-143346359, new mf0(this.e, obj, animatedContentTransitionScopeImpl, this.f), aVar2), aVar2, 12582912);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
