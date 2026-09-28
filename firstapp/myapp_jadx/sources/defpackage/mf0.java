package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends qlr implements gaj<jh0, a, Integer, Unit> {
    public final /* synthetic */ SnapshotStateList<Object> a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> c;
    public final /* synthetic */ iaj<pf0, Object, a, Integer, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mf0(SnapshotStateList<Object> snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl, iaj<? super pf0, Object, ? super a, ? super Integer, Unit> iajVar) {
        super(3);
        this.a = snapshotStateList;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
        this.d = iajVar;
    }

    @Override // defpackage.gaj
    public final Unit invoke(jh0 jh0Var, a aVar, Integer num) {
        jh0 jh0Var2 = jh0Var;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(jh0Var2) : aVar2.A(jh0Var2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            SnapshotStateList<Object> snapshotStateList = this.a;
            boolean zM = aVar2.M(snapshotStateList);
            Object obj = this.b;
            boolean zA = zM | aVar2.A(obj);
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.c;
            boolean zA2 = zA | aVar2.A(animatedContentTransitionScopeImpl);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA2 || objY == c0042a) {
                objY = new lf0(snapshotStateList, obj, animatedContentTransitionScopeImpl);
                aVar2.r(objY);
            }
            xvf.c(jh0Var2, (Function1) objY, aVar2);
            rtw<Object, twd0<jxo>> rtwVar = animatedContentTransitionScopeImpl.d;
            jh0Var2.getClass();
            rtwVar.m(obj, ((kh0) jh0Var2).b);
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = new qf0(jh0Var2);
                aVar2.r(objY2);
            }
            this.d.d((qf0) objY2, obj, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
