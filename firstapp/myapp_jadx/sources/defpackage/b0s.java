package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b0s {
    public final /* synthetic */ zzr a;

    public b0s(zzr zzrVar) {
        this.a = zzrVar;
    }

    public final gyr.b a(int i) {
        c5a0.a aVar = c5a0.e;
        zzr zzrVar = this.a;
        aVar.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            return zzrVar.p.a(i, ((nzr) ((x5a0) zzrVar.f).getValue()).j, zzrVar.d, new a0s());
        } finally {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        }
    }
}
