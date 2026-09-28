package defpackage;

import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.WithdrawConfirmDialogFragment$initViewModel$1$1", f = "WithdrawConfirmDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class blj0 extends tje0 implements Function2<WithdrawConfirmation, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ elj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj0(elj0 elj0Var, v1b<? super blj0> v1bVar) {
        super(2, v1bVar);
        this.b = elj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        blj0 blj0Var = new blj0(this.b, v1bVar);
        blj0Var.a = obj;
        return blj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WithdrawConfirmation withdrawConfirmation, v1b<? super Unit> v1bVar) {
        return ((blj0) create(withdrawConfirmation, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        String strA2;
        WithdrawConfirmation withdrawConfirmation = (WithdrawConfirmation) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        elj0 elj0Var = this.b;
        fme fmeVar = elj0Var.i;
        if (fmeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = fmeVar.C;
        withdrawConfirmation.getClass();
        textView.setText(n4d.a(withdrawConfirmation.getA().subtract(withdrawConfirmation.getB()).subtract(withdrawConfirmation.getC())));
        fme fmeVar2 = elj0Var.i;
        if (fmeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar2.b.setText(n4d.a(withdrawConfirmation.getB()));
        fme fmeVar3 = elj0Var.i;
        if (fmeVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar3.I.setText(n4d.a(withdrawConfirmation.getB()));
        fme fmeVar4 = elj0Var.i;
        if (fmeVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar4.D.setText("- ".concat(n4d.a(withdrawConfirmation.getD())));
        fme fmeVar5 = elj0Var.i;
        if (fmeVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        fmeVar5.B.setText(n4d.a(withdrawConfirmation.getB().subtract(withdrawConfirmation.getD())));
        int iCompareTo = withdrawConfirmation.getD().compareTo(BigDecimal.ZERO);
        fme fmeVar6 = elj0Var.i;
        if (iCompareTo > 0) {
            if (fmeVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar6.G.setVisibility(8);
            fme fmeVar7 = elj0Var.i;
            if (fmeVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar7.F.setVisibility(0);
        } else {
            if (fmeVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar6.G.setVisibility(0);
            fme fmeVar8 = elj0Var.i;
            if (fmeVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar8.F.setVisibility(8);
        }
        if (withdrawConfirmation instanceof WithdrawConfirmation.Bank) {
            fme fmeVar9 = elj0Var.i;
            if (fmeVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar9.y.setText(sn5.d(elj0Var, R.string.page_payment__bank_name, new Object[0]));
            fme fmeVar10 = elj0Var.i;
            if (fmeVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            WithdrawConfirmation.Bank bank = (WithdrawConfirmation.Bank) withdrawConfirmation;
            fmeVar10.i.setText(bank.e);
            fme fmeVar11 = elj0Var.i;
            if (fmeVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar11.y.setVisibility(0);
            fme fmeVar12 = elj0Var.i;
            if (fmeVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar12.i.setVisibility(0);
            fme fmeVar13 = elj0Var.i;
            if (fmeVar13 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar13.z.setText(sn5.d(elj0Var, R.string.page_payment__account_number, new Object[0]));
            fme fmeVar14 = elj0Var.i;
            if (fmeVar14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView2 = fmeVar14.v;
            String str = bank.f;
            String str2 = "--";
            if (str == null || (strA = fu5.a("\\d(?=\\d{4})", str, "*")) == null) {
                strA = "--";
            }
            textView2.setText(strA);
            fme fmeVar15 = elj0Var.i;
            if (fmeVar15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar15.z.setVisibility(0);
            fme fmeVar16 = elj0Var.i;
            if (fmeVar16 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar16.v.setVisibility(0);
            fme fmeVar17 = elj0Var.i;
            if (fmeVar17 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar17.A.setText(sn5.d(elj0Var, R.string.page_withdraw__account_name, new Object[0]));
            fme fmeVar18 = elj0Var.i;
            if (fmeVar18 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView3 = fmeVar18.w;
            String str3 = bank.i;
            if (str3 != null && (strA2 = fu5.a("(?<=\\d{4})\\d", str3, "*")) != null) {
                str2 = strA2;
            }
            textView3.setText(str2);
            fme fmeVar19 = elj0Var.i;
            if (fmeVar19 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar19.A.setVisibility(0);
            fme fmeVar20 = elj0Var.i;
            if (fmeVar20 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar20.w.setVisibility(0);
            fme fmeVar21 = elj0Var.i;
            if (fmeVar21 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            c8i0.o(fmeVar21.f, bank.v.isVisible());
        } else if (withdrawConfirmation instanceof WithdrawConfirmation.MobileMoney) {
            fme fmeVar22 = elj0Var.i;
            if (fmeVar22 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar22.y.setText(sn5.d(elj0Var, R.string.page_withdraw__withdraw_to, new Object[0]));
            fme fmeVar23 = elj0Var.i;
            if (fmeVar23 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            WithdrawConfirmation.MobileMoney mobileMoney = (WithdrawConfirmation.MobileMoney) withdrawConfirmation;
            fmeVar23.i.setText(mobileMoney.e);
            fme fmeVar24 = elj0Var.i;
            if (fmeVar24 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar24.y.setVisibility(0);
            fme fmeVar25 = elj0Var.i;
            if (fmeVar25 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar25.i.setVisibility(0);
            fme fmeVar26 = elj0Var.i;
            if (fmeVar26 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar26.z.setText(sn5.d(elj0Var, R.string.my_account__mobile_number, new Object[0]));
            fme fmeVar27 = elj0Var.i;
            if (fmeVar27 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar27.v.setText(vtu.a(mobileMoney.f));
            fme fmeVar28 = elj0Var.i;
            if (fmeVar28 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar28.z.setVisibility(0);
            fme fmeVar29 = elj0Var.i;
            if (fmeVar29 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar29.v.setVisibility(0);
            fme fmeVar30 = elj0Var.i;
            if (fmeVar30 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            c8i0.o(fmeVar30.f, mobileMoney.i.isVisible());
        } else {
            if (!(withdrawConfirmation instanceof WithdrawConfirmation.Partner)) {
                uhc.a();
                return null;
            }
            fme fmeVar31 = elj0Var.i;
            if (fmeVar31 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar31.y.setText(sn5.d(elj0Var, R.string.page_withdraw__commission_to_partner, new Object[0]));
            fme fmeVar32 = elj0Var.i;
            if (fmeVar32 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            WithdrawConfirmation.Partner partner = (WithdrawConfirmation.Partner) withdrawConfirmation;
            fmeVar32.i.setText(n4d.a(partner.c));
            fme fmeVar33 = elj0Var.i;
            if (fmeVar33 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar33.y.setVisibility(0);
            fme fmeVar34 = elj0Var.i;
            if (fmeVar34 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar34.i.setVisibility(0);
            fme fmeVar35 = elj0Var.i;
            if (fmeVar35 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar35.z.setText(sn5.d(elj0Var, R.string.page_withdraw__partner_code, new Object[0]));
            fme fmeVar36 = elj0Var.i;
            if (fmeVar36 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar36.v.setText(partner.e);
            fme fmeVar37 = elj0Var.i;
            if (fmeVar37 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar37.z.setVisibility(0);
            fme fmeVar38 = elj0Var.i;
            if (fmeVar38 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar38.v.setVisibility(0);
            fme fmeVar39 = elj0Var.i;
            if (fmeVar39 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar39.A.setText(sn5.d(elj0Var, R.string.common_functions__info, new Object[0]));
            fme fmeVar40 = elj0Var.i;
            if (fmeVar40 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar40.w.setText(partner.f);
            fme fmeVar41 = elj0Var.i;
            if (fmeVar41 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar41.A.setVisibility(0);
            fme fmeVar42 = elj0Var.i;
            if (fmeVar42 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fmeVar42.w.setVisibility(0);
        }
        return Unit.a;
    }
}
