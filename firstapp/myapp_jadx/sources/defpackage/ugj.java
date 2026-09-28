package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$PlanetAnimationScreen$1$1", f = "GalaxyGoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ugj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ SnapshotStateList<tgj.c> a;
    public final /* synthetic */ List<String> b;
    public final /* synthetic */ SnapshotStateList<Pair<gly, gly>> c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugj(SnapshotStateList<tgj.c> snapshotStateList, List<String> list, SnapshotStateList<Pair<gly, gly>> snapshotStateList2, long j, v1b<? super ugj> v1bVar) {
        super(2, v1bVar);
        this.a = snapshotStateList;
        this.b = list;
        this.c = snapshotStateList2;
        this.d = j;
    }

    public static final long k(float f, float f2, long j) {
        return (((long) Float.floatToRawIntBits((f2 / 100.0f) * ((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits((f / 100.0f) * ((int) (j >> 32))) << 32);
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ugj(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ugj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SnapshotStateList<tgj.c> snapshotStateList = this.a;
        snapshotStateList.clear();
        for (int i = 0; i < 9; i++) {
            snapshotStateList.add(new tgj.c(this.b.get(i), 0, 0.0f, 0.0f, 0.01f));
        }
        SnapshotStateList<Pair<gly, gly>> snapshotStateList2 = this.c;
        snapshotStateList2.clear();
        long j = this.d;
        Float.floatToRawIntBits(((int) (j >> 32)) / 2.0f);
        Float.floatToRawIntBits(((int) (4294967295L & j)) / 2.0f);
        p48.w(b.k(new Pair(new gly(k(35.0f, 40.0f, j)), new gly(k(-20.0f, 20.0f, j))), new Pair(new gly(k(32.0f, 45.0f, j)), new gly(k(-20.0f, 35.0f, j))), new Pair(new gly(k(32.0f, 41.0f, j)), new gly(k(-20.0f, 50.0f, j))), new Pair(new gly(k(57.0f, 40.0f, j)), new gly(k(120.0f, 20.0f, j))), new Pair(new gly(k(62.0f, 45.0f, j)), new gly(k(120.0f, 35.0f, j))), new Pair(new gly(k(62.0f, 41.0f, j)), new gly(k(120.0f, 50.0f, j)))), snapshotStateList2);
        return Unit.a;
    }
}
