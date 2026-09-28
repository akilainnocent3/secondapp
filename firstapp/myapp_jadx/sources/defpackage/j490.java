package defpackage;

import androidx.compose.animation.n;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class j490 extends qlr implements Function1<lza, Unit> {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j490(n nVar) {
        super(1);
        this.a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lza lzaVar) {
        lza lzaVar2 = lzaVar;
        lzaVar2.b2();
        SnapshotStateList<grr> snapshotStateList = this.a.w;
        if (snapshotStateList.size() > 1) {
            o48.v(new c490(), snapshotStateList);
        }
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).a(lzaVar2);
        }
        return Unit.a;
    }
}
