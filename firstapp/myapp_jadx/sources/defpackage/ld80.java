package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class ld80 extends gd80 {
    public static knh d(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new knh(sequence, true, function1);
    }

    public static Object e(knh knhVar) {
        knh.a aVar = new knh.a(knhVar);
        if (aVar.hasNext()) {
            return aVar.next();
        }
        return null;
    }

    public static ruh f(u48 u48Var, Function1 function1) {
        return new ruh(u48Var, function1, kd80.a);
    }

    public static String g(Sequence sequence, String str, unc uncVar, int i) {
        if ((i & 32) != 0) {
            uncVar = null;
        }
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            oae0.a(sb, obj, uncVar);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static <T> T h(Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            ibh0.a("Sequence is empty.");
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static ysg0 i(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new ysg0(sequence, function1);
    }

    public static knh j(Sequence sequence, Function1 function1) {
        sequence.getClass();
        return new knh(new ysg0(sequence, function1), false, new hd80());
    }

    public static <T> List<T> k(Sequence<? extends T> sequence) {
        sequence.getClass();
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return m2g.a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
