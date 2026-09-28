package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kio implements Function2 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        pair.getClass();
        pair2.getClass();
        return Boolean.valueOf(((Boolean) pair.a).booleanValue() == ((Boolean) pair2.a).booleanValue() && Intrinsics.g(pair.b, pair2.b));
    }
}
