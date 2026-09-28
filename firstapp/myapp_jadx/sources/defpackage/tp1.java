package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
public final class tp1 extends x1b {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return up1.c(null, this);
    }
}
