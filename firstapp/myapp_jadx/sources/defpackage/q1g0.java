package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class q1g0 implements Comparator<Pair<? extends lk40, ? extends List<bb80>>> {
    public static final q1g0 a = new q1g0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Pair<? extends lk40, ? extends List<bb80>> pair, Pair<? extends lk40, ? extends List<bb80>> pair2) {
        Pair<? extends lk40, ? extends List<bb80>> pair3 = pair;
        Pair<? extends lk40, ? extends List<bb80>> pair4 = pair2;
        int iCompare = Float.compare(((lk40) pair3.a).b, ((lk40) pair4.a).b);
        return iCompare != 0 ? iCompare : Float.compare(((lk40) pair3.a).d, ((lk40) pair4.a).d);
    }
}
