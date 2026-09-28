package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsViewModel$checkDeviceManagementFeatureEnabled$1", f = "SettingsViewModel.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class em80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nm80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em80(nm80 nm80Var, v1b<? super em80> v1bVar) {
        super(2, v1bVar);
        this.c = nm80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        em80 em80Var = new em80(this.c, v1bVar);
        em80Var.b = obj;
        return em80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((em80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        nm80 nm80Var = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                k7k k7kVar = nm80Var.f;
                this.b = null;
                this.a = 1;
                obj = k7kVar.a(this);
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
            bVar = (Boolean) obj;
            bVar.getClass();
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            boolean zBooleanValue = ((Boolean) bVar).booleanValue();
            wwd0 wwd0Var = nm80Var.D;
            do {
                value = wwd0Var.getValue();
                bm80 bm80Var = (bm80) value;
                z = bm80Var.b;
                bm80Var.getClass();
            } while (!wwd0Var.g(value, new bm80(zBooleanValue, z)));
            if (zBooleanValue) {
                nm80Var.x1(la.a, k00.d);
            }
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.d(a320.a("Get device management enabled failed: ", thA), new Object[0]);
        }
        return Unit.a;
    }
}
