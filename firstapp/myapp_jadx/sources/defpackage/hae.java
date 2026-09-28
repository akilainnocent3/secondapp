package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hae {
    public static final a a = new a();

    public static final class a implements Comparator<tsr> {
        @Override // java.util.Comparator
        public final int compare(tsr tsrVar, tsr tsrVar2) {
            tsr tsrVar3 = tsrVar;
            tsr tsrVar4 = tsrVar2;
            int iH = Intrinsics.h(tsrVar3.E, tsrVar4.E);
            return iH != 0 ? iH : Intrinsics.h(tsrVar3.hashCode(), tsrVar4.hashCode());
        }
    }
}
