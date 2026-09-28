package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$navigateToForgotPasswordScreen$1", f = "EnterPasswordViewModel.kt", l = {384}, m = "invokeSuspend", v = 2)
public final class m9g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p9g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9g(p9g p9gVar, v1b<? super m9g> v1bVar) {
        super(2, v1bVar);
        this.c = p9gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m9g m9gVar = new m9g(this.c, v1bVar);
        m9gVar.b = obj;
        return m9gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m9g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        p9g p9gVar = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                o2k o2kVar = p9gVar.a;
                this.b = null;
                this.a = 1;
                obj = ((mgb0) o2kVar.a).getLastAccount(this);
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
            bVar = (String) obj;
            if (bVar == null) {
                throw new IllegalStateException("Phone number not found");
            }
            zi50.a aVar2 = zi50.b;
            if (!(bVar instanceof zi50.b)) {
                p9gVar.z.a(new e9g.d((String) bVar));
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.e(thA);
                wwd0 wwd0Var = p9gVar.w;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, h9g.a((h9g) value, null, null, vch0.b, null, false, null, 59)));
            }
            return Unit.a;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
