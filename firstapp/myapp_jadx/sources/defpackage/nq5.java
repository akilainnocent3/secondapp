package defpackage;

import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.cmaccount.registration.updatephonenumber.CMUpdatePhoneNumberViewModel$submitRegistration$2", f = "CMUpdatePhoneNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nq5 extends tje0 implements Function2<ws40, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oq5 b;
    public final /* synthetic */ nm5.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq5(oq5 oq5Var, nm5.a aVar, v1b<? super nq5> v1bVar) {
        super(2, v1bVar);
        this.b = oq5Var;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nq5 nq5Var = new nq5(this.b, this.c, v1bVar);
        nq5Var.a = obj;
        return nq5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ws40 ws40Var, v1b<? super Unit> v1bVar) {
        return ((nq5) create(ws40Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ws40 ws40Var = (ws40) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = ws40Var instanceof ws40.b;
        nm5.a aVar = null;
        oq5 oq5Var = this.b;
        if (z) {
            nm5 nm5Var = oq5Var.e;
            ws40.b bVar = (ws40.b) ws40Var;
            String str = bVar.b;
            nm5Var.getClass();
            str.getClass();
            nm5.a aVar2 = nm5Var.a;
            if (aVar2 != null) {
                String str2 = aVar2.a;
                String str3 = aVar2.c;
                RegisterRevampConfig registerRevampConfig = aVar2.d;
                registerRevampConfig.getClass();
                aVar = new nm5.a(str2, str, str3, registerRevampConfig);
            }
            nm5Var.a = aVar;
            ku90<rkh0> ku90Var = oq5Var.y;
            a aVar3 = oq5Var.f;
            String str4 = bVar.a;
            RegisterRevampConfig registerRevampConfig2 = this.c.d;
            aVar3.getClass();
            ku90Var.a.a(new rkh0.b(a.b(str, str4, registerRevampConfig2)));
        } else if (ws40Var instanceof ws40.c) {
            oq5Var.e.a = null;
            ku90<rkh0> ku90Var2 = oq5Var.y;
            ws40.c cVar = (ws40.c) ws40Var;
            ku90Var2.a.a(new rkh0.c(cVar.a, cVar.b));
        } else {
            if (!(ws40Var instanceof ws40.a)) {
                uhc.a();
                return null;
            }
            ws40.a aVar4 = (ws40.a) ws40Var;
            if (aVar4 instanceof ws40.a.b) {
                wwd0 wwd0Var = oq5Var.v;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, skh0.a((skh0) value, null, ((ws40.a.b) aVar4).a, null, uxs.DISABLE, 47)));
            } else {
                if (!(aVar4 instanceof ws40.a.C1265a)) {
                    oq5Var.getClass();
                    uhc.a();
                    return null;
                }
                oq5Var.x1(((ws40.a.C1265a) aVar4).a);
            }
            Unit unit = Unit.a;
        }
        return Unit.a;
    }
}
