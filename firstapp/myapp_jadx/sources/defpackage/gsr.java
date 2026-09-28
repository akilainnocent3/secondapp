package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gsr implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        return (((Number) pair.b).intValue() - ((Number) pair.a).intValue()) - (((Number) pair2.b).intValue() - ((Number) pair2.a).intValue());
    }
}
