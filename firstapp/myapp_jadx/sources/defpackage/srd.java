package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$makeDeposit$1", f = "DepositBaseViewModel.kt", l = {181}, m = "invokeSuspend", v = 2)
public final class srd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wrd c;

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$makeDeposit$1$1", f = "DepositBaseViewModel.kt", l = {179}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wrd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wrd wrdVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wrdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mod modVar = this.b.J;
                this.a = 1;
                if (modVar.c.a(this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$makeDeposit$1$result$1", f = "DepositBaseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<qnd, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ wrd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wrd wrdVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wrdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qnd qndVar, v1b<? super Unit> v1bVar) {
            return ((b) create(qndVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qnd qndVar = (qnd) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wrd wrdVar = this.b;
            mod modVar = wrdVar.J;
            int i = wrdVar.N1().a;
            bag bagVar = (bag) wrdVar.y.getValue();
            modVar.getClass();
            qndVar.getClass();
            modVar.b.a(i, bagVar, qndVar, t3g.a);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srd(wrd wrdVar, v1b<? super srd> v1bVar) {
        super(2, v1bVar);
        this.c = wrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        srd srdVar = new srd(this.c, v1bVar);
        srdVar.b = obj;
        return srdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((srd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qxd0<vc8> qxd0VarI2;
        UiText resourceUiText;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        wrd wrdVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            qxd0<uxs> qxd0VarK2 = wrdVar.k2();
            if (qxd0VarK2 != null) {
                qxd0VarK2.a(uxs.LOADING);
            }
            wrdVar.R = Integer.parseInt(wrdVar.E1());
            ej5.c(v5bVar, null, null, new a(wrdVar, null), 3);
            i9e i9eVar = wrdVar.K;
            wvd wvdVarL2 = wrdVar.l2(wrdVar.z1().a.b);
            b bVar = new b(wrdVar, null);
            this.b = null;
            this.a = 1;
            obj = i9eVar.a(wvdVarL2, bVar, this);
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
        x7e x7eVar = (x7e) obj;
        wrdVar.y2();
        if (x7eVar instanceof x7e.d.q) {
            wrdVar.z2();
            x7e.d.q qVar = (x7e.d.q) x7eVar;
            wrd.B2(wrdVar, qVar.e, null, qVar.c, null, null, 54);
        } else if (x7eVar instanceof x7e.b.d) {
            x7e.b.d dVar = (x7e.b.d) x7eVar;
            wrdVar.P = dVar.b;
            wrdVar.Q = dVar.d;
            wrdVar.o2(dVar);
        } else if (!wrdVar.x2(x7eVar) && (qxd0VarI2 = wrdVar.i2()) != null) {
            vc8 vc8VarInvoke = qxd0VarI2.a.invoke();
            vc8VarInvoke.getClass();
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__deposit_failed);
            String message = x7eVar.getMessage();
            if (message != null) {
                s9e0.a.getClass();
                String strA = s9e0.a(message);
                if (strA != null) {
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new StringUiText(strA);
                } else {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
                }
            } else {
                StringUiText stringUiText3 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
            }
            qxd0VarI2.a(vc8.a(vc8VarInvoke, new yzd(resourceUiText2, resourceUiText), false, null, false, 14));
        }
        return Unit.a;
    }
}
