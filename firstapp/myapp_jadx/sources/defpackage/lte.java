package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class lte<T, K> implements Sequence<T> {
    public final Sequence<T> a;
    public final Function1<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public lte(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<T> iterator() {
        return new kte(this.a.iterator(), this.b);
    }
}
