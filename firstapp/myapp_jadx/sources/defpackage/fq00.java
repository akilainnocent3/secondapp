package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$onUpdateBio$1", f = "PersonalSocialViewModel.kt", l = {344}, m = "invokeSuspend", v = 2)
public final class fq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kq00 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq00(kq00 kq00Var, String str, v1b<? super fq00> v1bVar) {
        super(2, v1bVar);
        this.b = kq00Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fq00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            kq00 kq00Var = this.b;
            Object value = kq00Var.E.a.getValue();
            lq00.c cVar = value instanceof lq00.c ? (lq00.c) value : null;
            if (cVar != null) {
                wwd0 wwd0Var = kq00Var.D;
                lq00.c cVarA = lq00.c.a(cVar, null, null, this.c, false, null, 32763);
                wwd0Var.getClass();
                wwd0Var.k(null, cVarA);
                unit = Unit.a;
                if (unit != y5bVar) {
                    unit = Unit.a;
                }
            } else {
                unit = Unit.a;
            }
            if (unit == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
