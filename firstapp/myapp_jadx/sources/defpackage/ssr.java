package defpackage;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ssr implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tsr tsrVar = (tsr) obj;
        tsr tsrVar2 = (tsr) obj2;
        float f = tsrVar.V.p.U;
        float f2 = tsrVar2.V.p.U;
        return f == f2 ? Intrinsics.h(tsrVar.I(), tsrVar2.I()) : Float.compare(f, f2);
    }
}
