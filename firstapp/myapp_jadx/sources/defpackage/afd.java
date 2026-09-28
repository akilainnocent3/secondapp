package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.core.datastore.DefaultPreferenceDataStore$getBoolean$3", f = "PreferenceDataStoreImpl.kt", l = {215}, m = "invokeSuspend", v = 2)
public final class afd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zed b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ tqc<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afd(zed zedVar, String str, boolean z, tqc<Boolean> tqcVar, v1b<? super afd> v1bVar) {
        super(2, v1bVar);
        this.b = zedVar;
        this.c = str;
        this.d = z;
        this.e = tqcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new afd(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((afd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        tqc<Boolean> tqcVar = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                zed zedVar = this.b;
                String str = this.c;
                boolean z = this.d;
                this.a = 1;
                obj = zedVar.getBoolean(str, z, this);
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
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            tqcVar.onSuccess(bool);
        } catch (Exception e) {
            tqcVar.a(e);
        }
        return Unit.a;
    }
}
