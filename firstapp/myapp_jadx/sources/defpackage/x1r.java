package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$2", f = "LNPlaceBetViewModel.kt", l = {630}, m = "invokeSuspend", v = 2)
public final class x1r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2r b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$2$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<dqh0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ f2r b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, f2r f2rVar) {
            super(2, v1bVar);
            this.b = f2rVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.b);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dqh0 dqh0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(dqh0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ku90<r0r> ku90Var = this.b.m0;
            dqh0 dqh0Var = (dqh0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (u1r.a(dqh0Var) || dqh0Var.getOutcomeId() != null) {
                ku90Var.a(new r0r.b(nvp.a.a));
            } else {
                StringUiText stringUiText = vch0.a;
                ku90Var.a(new r0r.b(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__odds_retrieval_error_toast), false)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.b = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x1r(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((x1r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f2r f2rVar = this.b;
            v340 v340Var = f2rVar.c0;
            a aVar = new a(null, f2rVar);
            this.a = 1;
            if (kzh.b(v340Var, aVar, this) == y5bVar) {
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
