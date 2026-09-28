package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$safelyEmitMFAEvent$2", f = "MFAViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zcu extends tje0 implements Function2<Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zcu zcuVar = new zcu(2, v1bVar);
        zcuVar.a = ((Number) obj).intValue();
        return zcuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Boolean> v1bVar) {
        return ((zcu) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(i == 0);
    }
}
