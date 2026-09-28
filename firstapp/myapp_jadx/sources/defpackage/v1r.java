package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v1r implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ssq ssqVar = (ssq) obj;
        ssq ssqVar2 = (ssq) obj2;
        return Boolean.valueOf(Intrinsics.g(ssqVar != null ? ssqVar.a : null, ssqVar2 != null ? ssqVar2.a : null));
    }
}
