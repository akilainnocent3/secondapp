package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$setDefaultDepositTextChangeListener$2$1", f = "DepositBaseFragmentLegacy.kt", l = {188}, m = "invokeSuspend", v = 2)
public final class hrd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ Function1<Boolean, Unit> c;
    public final /* synthetic */ lrd d;
    public final /* synthetic */ Function1<String, Unit> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hrd(CharSequence charSequence, Function1<? super Boolean, Unit> function1, lrd lrdVar, Function1<? super String, Unit> function2, v1b<? super hrd> v1bVar) {
        super(2, v1bVar);
        this.b = charSequence;
        this.c = function1;
        this.d = lrdVar;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hrd(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hrd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int length = StringsKt.t0(this.b.toString()).toString().length();
        Function1<Boolean, Unit> function1 = this.c;
        lrd lrdVar = this.d;
        if (length > 0) {
            function1.invoke(Boolean.valueOf(lrdVar.B1(this.e) && lrdVar.q0()));
        } else {
            lrdVar.X0("", ga00.DEPOSIT);
            ClearEditText clearEditTextR0 = lrdVar.r0();
            clearEditTextR0.getClass();
            clearEditTextR0.setError((String) null);
            function1.invoke(Boolean.FALSE);
        }
        jh30 jh30Var = (jh30) lrdVar.U.getValue();
        ClearEditText clearEditTextR1 = lrdVar.r0();
        clearEditTextR1.getClass();
        jh30Var.y1(new ih30(clearEditTextR1.getTextValue(), jh30Var, null));
        return Unit.a;
    }
}
