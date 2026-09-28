package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.ComposeRoundHistoryContainerKt$ComposeRoundHistoryContainer$2$1$1", f = "ComposeRoundHistoryContainer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class hja extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Coefficients a;
    public final /* synthetic */ SnapshotStateList<Coefficients> b;
    public final /* synthetic */ PreviousMultiplierResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hja(Coefficients coefficients, SnapshotStateList<Coefficients> snapshotStateList, PreviousMultiplierResponse previousMultiplierResponse, v1b<? super hja> v1bVar) {
        super(2, v1bVar);
        this.a = coefficients;
        this.b = snapshotStateList;
        this.c = previousMultiplierResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hja(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hja) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Coefficients coefficients = this.a;
        if (coefficients.isNew()) {
            SnapshotStateList<Coefficients> snapshotStateList = this.b;
            if (!snapshotStateList.contains(coefficients)) {
                snapshotStateList.add(0, coefficients);
                if (snapshotStateList.size() > this.c.getLimit()) {
                    snapshotStateList.remove(snapshotStateList.size() - 1);
                }
            }
        }
        return Unit.a;
    }
}
