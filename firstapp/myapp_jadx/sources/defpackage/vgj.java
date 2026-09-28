package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$PlanetAnimationScreen$2$1", f = "GalaxyGoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vgj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ SnapshotStateList<tgj.c> a;
    public final /* synthetic */ v5b b;
    public final /* synthetic */ tgj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgj(SnapshotStateList snapshotStateList, v5b v5bVar, tgj tgjVar, v1b v1bVar) {
        super(2, v1bVar);
        tgj.a aVar = tgj.a.a;
        this.a = snapshotStateList;
        this.b = v5bVar;
        this.c = tgjVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tgj.a aVar = tgj.a.a;
        return new vgj(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vgj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tgj.a aVar = tgj.a.a;
        List listK = b.k(new Integer(0), new Integer(1), new Integer(2));
        SnapshotStateList<tgj.c> snapshotStateList = this.a;
        v5b v5bVar = this.b;
        tgj tgjVar = this.c;
        tgj.r3(snapshotStateList, v5bVar, tgjVar, 0, listK);
        tgj.r3(snapshotStateList, v5bVar, tgjVar, 5, b.k(new Integer(3), new Integer(4), new Integer(5)));
        return Unit.a;
    }
}
