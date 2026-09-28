package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.integrity.DeviceIntegrityRepositoryImpl$getLastVerificationStatus$2", f = "DeviceIntegrityRepositoryImpl.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class kde extends tje0 implements Function2<v5b, v1b<? super rde>, Object> {
    public int a;
    public final /* synthetic */ qde b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kde(qde qdeVar, v1b<? super kde> v1bVar) {
        super(2, v1bVar);
        this.b = qdeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kde(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super rde> v1bVar) {
        return ((kde) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            m2l m2lVar = this.b.d;
            eo20[] eo20VarArr = eo20.a;
            this.a = 1;
            obj = m2lVar.a.getString("device_integrity_status", "NOT_VERIFIED", this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        String str = (String) obj;
        rde.a.getClass();
        str.getClass();
        for (Object obj3 : rde.w) {
            if (Intrinsics.g(((rde) obj3).name(), str)) {
                obj2 = obj3;
                break;
            }
        }
        rde rdeVar = (rde) obj2;
        return rdeVar == null ? rde.i : rdeVar;
    }
}
