package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class kxx extends a implements c9p {
    public static final kxx a = new kxx(c9p.b.a);

    @Override // defpackage.c9p
    @fae
    public final zj7 attachChild(ck7 ck7Var) {
        return lxx.a;
    }

    @Override // defpackage.c9p
    @fae
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.c9p
    public final Sequence<c9p> getChildren() {
        return s3g.a;
    }

    @Override // defpackage.c9p
    @fae
    public final wse invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return lxx.a;
    }

    @Override // defpackage.c9p
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.c9p
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.c9p
    public final boolean isCompleted() {
        return false;
    }

    @Override // defpackage.c9p
    @fae
    public final Object join(v1b<? super Unit> v1bVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.c9p
    @fae
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.c9p
    @fae
    public final wse invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        return lxx.a;
    }

    @Override // defpackage.c9p
    @fae
    public final void cancel(CancellationException cancellationException) {
    }
}
