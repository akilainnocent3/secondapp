package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class yc80 implements Sequence<Object> {
    public final /* synthetic */ Function2 a;

    public yc80(Function2 function2) {
        this.a = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        return zc80.a(this.a);
    }
}
