package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$refreshBioFromAccount$1", f = "PersonalSocialViewModel.kt", l = {358}, m = "invokeSuspend", v = 2)
public final class iq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kq00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq00(kq00 kq00Var, v1b<? super iq00> v1bVar) {
        super(2, v1bVar);
        this.b = kq00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iq00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final kq00 kq00Var = this.b;
            Function1 function1 = new Function1() { // from class: hq00
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String bio;
                    lq00.c cVar = (lq00.c) obj2;
                    AccountInfo accountInfoLastAccountInfo = kq00Var.v.lastAccountInfo();
                    return lq00.c.a(cVar, null, null, (accountInfoLastAccountInfo == null || (bio = accountInfoLastAccountInfo.getBio()) == null || StringsKt.U(bio)) ? null : bio, false, null, 32763);
                }
            };
            this.a = 1;
            Object value = kq00Var.E.a.getValue();
            lq00.c cVar = value instanceof lq00.c ? (lq00.c) value : null;
            if (cVar != null) {
                kq00Var.D.setValue(function1.invoke(cVar));
                unit = Unit.a;
                if (unit != y5b.a) {
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
