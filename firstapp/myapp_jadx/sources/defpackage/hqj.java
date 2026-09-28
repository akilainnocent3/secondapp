package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$3", f = "GameplayScreen.kt", l = {268}, m = "invokeSuspend", v = 1)
public final class hqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ooj b;
    public final /* synthetic */ Map<Long, gly> c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ Map<Long, s28> e;
    public final /* synthetic */ m6a0<Long, Boolean> f;
    public final /* synthetic */ SnapshotStateList<q28> i;
    public final /* synthetic */ long[] v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqj(ooj oojVar, Map map, ytw ytwVar, Map map2, m6a0 m6a0Var, SnapshotStateList snapshotStateList, long[] jArr, v1b v1bVar) {
        super(2, v1bVar);
        this.b = oojVar;
        this.c = map;
        this.d = ytwVar;
        this.e = map2;
        this.f = m6a0Var;
        this.i = snapshotStateList;
        this.v = jArr;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hqj(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pr50 pr50Var = ((ooj.d) this.b).a;
            this.a = 1;
            if (eqj.d(this.c, this.d, this.e, this.f, this.i, this.v, pr50Var, false, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
