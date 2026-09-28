package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class kle implements tse {
    public final /* synthetic */ vle a;
    public final /* synthetic */ ifx b;
    public final /* synthetic */ SnapshotStateList c;

    public kle(vle vleVar, ifx ifxVar, SnapshotStateList snapshotStateList) {
        this.a = vleVar;
        this.b = ifxVar;
        this.c = snapshotStateList;
    }

    @Override // defpackage.tse
    public final void dispose() {
        xkx xkxVarB = this.a.b();
        ifx ifxVar = this.b;
        xkxVarB.b(ifxVar);
        this.c.remove(ifxVar);
    }
}
