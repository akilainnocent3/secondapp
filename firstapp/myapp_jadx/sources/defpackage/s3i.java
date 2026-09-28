package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s3i extends d.c implements w3i {
    public Function1<? super j5i, Unit> D;
    public j5i E;

    public s3i() {
        throw null;
    }

    @Override // defpackage.w3i
    public final void E1(j5i j5iVar) {
        if (Intrinsics.g(this.E, j5iVar)) {
            return;
        }
        this.E = j5iVar;
        this.D.invoke(j5iVar);
    }
}
