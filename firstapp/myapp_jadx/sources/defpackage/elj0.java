package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lelj0;", "Landroidx/fragment/app/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class elj0 extends v7m implements View.OnClickListener {
    public d900 f;
    public fme i;
    public a v;
    public final q8i0 w;

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ zkj0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zkj0 zkj0Var) {
            super(0);
            this.a = zkj0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? elj0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public elj0() {
        ttr ttrVarA = hwr.a(a1s.c, new b(new zkj0(this)));
        this.w = new q8i0(jq40.a(xlj0.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        int id = view.getId();
        q8i0 q8i0Var = this.w;
        if (id == R.id.confirm) {
            ((xlj0) q8i0Var.getValue()).i.a(Unit.a);
            return;
        }
        if (id == R.id.cancel) {
            ((xlj0) q8i0Var.getValue()).w.a(Unit.a);
            return;
        }
        if (id == R.id.wh_tax_help) {
            d900 d900Var = this.f;
            if (d900Var != null) {
                d900Var.a();
            } else {
                Intrinsics.n("paymentRouter");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        this.i = fme.a(getLayoutInflater());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bo8 bo8Var = new bo8(contextRequireContext, R.style.BottomDialog);
        bo8Var.requestWindowFeature(1);
        fme fmeVar = this.i;
        if (fmeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = fmeVar.a;
        constraintLayout.getClass();
        bo8Var.setContentView(constraintLayout);
        Window window = bo8Var.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(R.style.AnimBottom);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        a aVar = new a(false);
        this.v = aVar;
        bo8Var.c.a(bo8Var, aVar);
        fme fmeVar2 = this.i;
        if (fmeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar2.e.setOnClickListener(this);
        fme fmeVar3 = this.i;
        if (fmeVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar3.d.setOnClickListener(this);
        fme fmeVar4 = this.i;
        if (fmeVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar4.E.setOnClickListener(this);
        fme fmeVar5 = this.i;
        if (fmeVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mla.i(fmeVar5.H, new op8(-1428655203, new Function2() { // from class: alj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ihj0.a((WithdrawAlertHintStatus) wyh.c(((xlj0) this.a.w.getValue()).d, aVar2, 0, 7).getValue(), true, null, aVar2, 48, 4);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        xlj0 xlj0Var = (xlj0) this.w.getValue();
        wwd0 wwd0Var = xlj0Var.c;
        psm psmVar = xlj0Var.a;
        g1i g1iVar = new g1i(new f1i(wwd0Var), new blj0(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(xlj0Var.f, new clj0(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(xlj0Var.y, new dlj0(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        fme fmeVar6 = this.i;
        if (fmeVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar6.c.setText(sn5.d(this, R.string.common_functions__amount_label, psmVar.f()));
        fme fmeVar7 = this.i;
        if (fmeVar7 != null) {
            fmeVar7.J.setText(sn5.d(this, R.string.common_functions__amount_label, psmVar.f()));
            return bo8Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public static final class a extends cny {
        @Override // defpackage.cny
        public final void b() {
        }
    }
}
