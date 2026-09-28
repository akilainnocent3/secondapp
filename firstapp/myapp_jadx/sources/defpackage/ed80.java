package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class ed80 implements Sequence<Object> {
    public final /* synthetic */ Iterator a;

    public ed80(Iterator it) {
        this.a = it;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return this.a;
    }
}
