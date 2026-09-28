package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public interface c9p extends CoroutineContext.Element {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
    }

    public static final class b implements CoroutineContext.a<c9p> {
        public static final /* synthetic */ b a = new b();
    }

    zj7 attachChild(ck7 ck7Var);

    @fae
    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    @fae
    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    Sequence<c9p> getChildren();

    s680 getOnJoin();

    c9p getParent();

    wse invokeOnCompletion(Function1<? super Throwable, Unit> function1);

    wse invokeOnCompletion(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(v1b<? super Unit> v1bVar);

    @fae
    c9p plus(c9p c9pVar);

    boolean start();
}
