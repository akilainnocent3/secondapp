package defpackage;

import com.sporty.android.common_ui.widgets.ClearEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseFragmentLegacy$setupQuickInputs$1$2", f = "DepositBaseFragmentLegacy.kt", l = {214}, m = "invokeSuspend", v = 2)
public final class krd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lrd b;

    public static final class a<T> implements myh {
        public final /* synthetic */ lrd a;

        public a(lrd lrdVar) {
            this.a = lrdVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            String str = (String) obj;
            if (str != null) {
                lrd lrdVar = this.a;
                ClearEditText clearEditTextR0 = lrdVar.r0();
                if (clearEditTextR0 != null) {
                    clearEditTextR0.setText(str);
                }
                ClearEditText clearEditTextR1 = lrdVar.r0();
                if (clearEditTextR1 != null) {
                    clearEditTextR1.setSelection(str.length());
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krd(lrd lrdVar, v1b<? super krd> v1bVar) {
        super(2, v1bVar);
        this.b = lrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new krd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((krd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        lrd lrdVar = this.b;
        wwd0 wwd0Var = ((jh30) lrdVar.U.getValue()).i;
        a aVar = new a(lrdVar);
        this.a = 1;
        wwd0Var.collect(aVar, this);
        return y5bVar;
    }
}
