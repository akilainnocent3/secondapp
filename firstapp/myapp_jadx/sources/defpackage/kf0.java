package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 implements tse {
    public final /* synthetic */ SnapshotStateList a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl c;

    public kf0(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.a = snapshotStateList;
        this.b = obj;
        this.c = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.tse
    public final void dispose() {
        SnapshotStateList snapshotStateList = this.a;
        Object obj = this.b;
        snapshotStateList.remove(obj);
        this.c.d.k((S) obj);
    }
}
