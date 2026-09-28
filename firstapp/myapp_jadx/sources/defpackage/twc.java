package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class twc<T> implements myh {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ Function1<Long, Unit> b;
    public final /* synthetic */ du5 c;
    public final /* synthetic */ IntRange d;

    /* JADX WARN: Multi-variable type inference failed */
    public twc(zzr zzrVar, Function1<? super Long, Unit> function1, du5 du5Var, IntRange intRange) {
        this.a = zzrVar;
        this.b = function1;
        this.c = du5Var;
        this.d = intRange;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        ((Number) obj).intValue();
        zzr zzrVar = this.a;
        int iH = zzrVar.h() / 12;
        int iH2 = (zzrVar.h() % 12) + 1;
        this.b.invoke(new Long(this.c.e(this.d.a + iH, iH2).e));
        return Unit.a;
    }
}
