package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class toy implements Comparator<tsr> {
    public static final toy a = new toy();

    @Override // java.util.Comparator
    public final int compare(tsr tsrVar, tsr tsrVar2) {
        tsr tsrVar3 = tsrVar;
        tsr tsrVar4 = tsrVar2;
        int iH = Intrinsics.h(tsrVar4.E, tsrVar3.E);
        return iH != 0 ? iH : Intrinsics.h(tsrVar3.hashCode(), tsrVar4.hashCode());
    }
}
