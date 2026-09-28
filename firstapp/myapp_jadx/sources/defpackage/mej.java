package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.network.metadata.GaidProvider$get$2", f = "GaidProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mej extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public final /* synthetic */ nej a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mej(nej nejVar, v1b<? super mej> v1bVar) {
        super(2, v1bVar);
        this.a = nejVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mej(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((mej) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        try {
            sm.a aVarA = sm.a(this.a.a);
            if (aVarA.b) {
                return null;
            }
            return aVarA.a;
        } catch (Exception e) {
            itf0.a.n(inm.a("Failed to read GAID: ", e.getMessage()), new Object[0]);
            return null;
        }
    }
}
