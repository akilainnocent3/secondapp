package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class u48 implements Sequence<Object> {
    public final /* synthetic */ Iterable a;

    public u48(Iterable iterable) {
        this.a = iterable;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return this.a.iterator();
    }
}
