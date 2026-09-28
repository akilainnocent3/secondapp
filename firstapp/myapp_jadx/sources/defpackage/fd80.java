package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class fd80 extends ad80 {
    public static dwa b(Iterator it) {
        it.getClass();
        return new dwa(new ed80(it));
    }

    public static <T> Sequence<T> c(T t, Function1<? super T, ? extends T> function1) {
        function1.getClass();
        return t == null ? s3g.a : new q1k(new bd80(t, 0), function1);
    }
}
