package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class ity {
    public final gty a;
    public final oty b;
    public final qty c;
    public final y8j d;
    public final ety e;
    public final rty f;
    public final dty g;
    public Long h;

    @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.presentation.OneUpPromoSurfacePresenter$observeEligibility$1", f = "OneUpPromoSurfacePresenter.kt", l = {145}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ ity c;

        /* JADX INFO: renamed from: ity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.oneuppromo.presentation.OneUpPromoSurfacePresenter$observeEligibility$1$1", f = "OneUpPromoSurfacePresenter.kt", l = {146}, m = "invokeSuspend", v = 2)
        public static final class C0698a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ity b;

            /* JADX INFO: renamed from: ity$a$a$a, reason: collision with other inner class name */
            public static final class C0699a<T> implements myh {
                public final /* synthetic */ ity a;

                public C0699a(ity ityVar) {
                    this.a = ityVar;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    this.a.f.a();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0698a(ity ityVar, v1b<? super C0698a> v1bVar) {
                super(2, v1bVar);
                this.b = ityVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0698a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0698a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    ity ityVar = this.b;
                    pty.b bVarB = ityVar.b.b();
                    C0699a c0699a = new C0699a(ityVar);
                    this.a = 1;
                    if (bVarB.collect(c0699a, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ibs ibsVar, ity ityVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ibsVar;
            this.c = ityVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                s9s.b bVar = s9s.b.d;
                C0698a c0698a = new C0698a(this.c, null);
                this.a = 1;
                if (m850.b(this.b, bVar, c0698a, this) == y5bVar) {
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

    public ity(gty gtyVar, oty otyVar, qty qtyVar, y8j y8jVar, ety etyVar, rty rtyVar) {
        y8jVar.getClass();
        this.a = gtyVar;
        this.b = otyVar;
        this.c = qtyVar;
        this.d = y8jVar;
        this.e = etyVar;
        this.f = rtyVar;
        this.g = new dty();
    }

    public final void a(final lty ltyVar, Event event, RegularMarketRule regularMarketRule, Function0<Unit> function0) {
        mty mtyVar;
        ltyVar.getClass();
        oty otyVar = this.b;
        gty gtyVar = this.a;
        nty ntyVarA = otyVar.a(gtyVar, event, regularMarketRule);
        String str = event != null ? event.eventId : null;
        if (str == null) {
            str = "";
        }
        final hty htyVar = new hty(function0, this, ntyVarA);
        ntyVarA.getClass();
        ltyVar.a();
        nty.a aVar = nty.a.a;
        boolean zAdd = false;
        if (ntyVarA.equals(aVar)) {
            mtyVar = null;
        } else if (ntyVarA.equals(nty.c.a)) {
            mtyVar = new mty(R.string.common_functions__most_users_choose_1up, true, true, true);
        } else {
            if (!ntyVarA.equals(nty.b.a)) {
                uhc.a();
                return;
            }
            mtyVar = new mty(R.string.common_functions__top_1up_pick, false, false, false);
        }
        if (mtyVar == null) {
            return;
        }
        boolean z = mtyVar.d;
        final Function0 function1 = z ? new Function0() { // from class: kty
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                qty qtyVar = ltyVar.b;
                ((rdd0) qtyVar.a).a(bty.a, k00.d);
                htyVar.invoke();
                return Unit.a;
            }
        } : null;
        y8i0 y8i0Var = ltyVar.a.a;
        LinearLayout linearLayout = y8i0Var.a;
        linearLayout.setVisibility(0);
        TextView textView = y8i0Var.e;
        int i = mtyVar.a;
        boolean z2 = mtyVar.c;
        sn5.f(textView, i, new Object[0]);
        LinearLayout linearLayout2 = y8i0Var.b;
        boolean z3 = mtyVar.b;
        linearLayout2.setVisibility((z3 || z2) ? 0 : 8);
        y8i0Var.d.setVisibility(z3 ? 0 : 8);
        y8i0Var.c.setVisibility(z2 ? 0 : 8);
        linearLayout.setClickable(z);
        linearLayout.setOnClickListener(function1 != null ? new View.OnClickListener() { // from class: f64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function1.invoke();
            }
        } : null);
        dty dtyVar = ltyVar.c;
        LinkedHashSet linkedHashSet = dtyVar.a;
        if (!ntyVarA.equals(aVar)) {
            if (ntyVarA.equals(nty.b.a)) {
                dtyVar.b = true;
            } else {
                if (!ntyVarA.equals(nty.c.a)) {
                    uhc.a();
                    return;
                }
                if (dtyVar.b) {
                    linkedHashSet.clear();
                    dtyVar.b = false;
                }
                zAdd = linkedHashSet.add(new dty.a(gtyVar, str));
            }
        }
        if (zAdd) {
            ((rdd0) ltyVar.b.a).a(cty.a, k00.d);
        }
    }

    public final lty b(y8i0 y8i0Var) {
        return new lty(y8i0Var, this.c, this.g, this.d);
    }

    public final void c(ibs ibsVar) {
        ibsVar.getClass();
        ej5.c(ebs.a(ibsVar.getLifecycle()), null, null, new a(ibsVar, this, null), 3);
    }

    public final void d() {
        dty dtyVar = this.g;
        dtyVar.a.clear();
        dtyVar.b = false;
    }
}
