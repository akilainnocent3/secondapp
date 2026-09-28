package defpackage;

import androidx.compose.material3.internal.a;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {706}, m = "restartable")
public final class i10<I> extends x1b {
    public /* synthetic */ Object a;
    public int b;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return a.b(null, null, this);
    }
}
