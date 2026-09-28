package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uk8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final zk8 zk8Var = (zk8) obj3;
                vhg vhgVar = (vhg) obj;
                if (vhgVar.b) {
                    obj2 = null;
                } else {
                    vhgVar.b = true;
                    obj2 = vhgVar.a;
                }
                unj0 unj0Var = (unj0) obj2;
                if (unj0Var != null) {
                    int i2 = 0;
                    if (unj0Var instanceof unj0.n) {
                        e activity = zk8Var.getActivity();
                        if (activity != null) {
                            int i3 = TxSuccessActivity.A;
                            log0 log0Var = log0.b;
                            unj0.n nVar = (unj0.n) unj0Var;
                            int i4 = nVar.e;
                            m8h0 m8h0Var = (i4 == 2 || i4 != 3) ? m8h0.a : m8h0.b;
                            m8h0 m8h0Var2 = m8h0Var;
                            String str = nVar.d;
                            psm psmVar = zk8Var.f;
                            if (psmVar == null) {
                                Intrinsics.n("countryManager");
                                throw null;
                            }
                            String strF = psmVar.f();
                            BigDecimal bigDecimal = nVar.a;
                            BigDecimal bigDecimal2 = BigDecimal.ZERO;
                            bigDecimal2.getClass();
                            String str2 = nVar.b;
                            s9e0 s9e0Var = s9e0.a;
                            String str3 = zk8Var.F;
                            s9e0Var.getClass();
                            TxSuccessActivity.a.a(activity, new TxSuccessParams.Momo(log0Var, m8h0Var2, str, strF, bigDecimal, bigDecimal2, false, str2, s9e0.a(str3), zk8Var.E, nVar.c), false);
                            activity.finish();
                            Unit unit = Unit.a;
                        }
                    } else if (unj0Var.equals(unj0.c.b)) {
                        String strD = sn5.d(zk8Var, R.string.page_withdraw__your_account_is_under_review_to_ensure_safety_and_security, new Object[0]);
                        Context contextRequireContext = zk8Var.requireContext();
                        contextRequireContext.getClass();
                        sc00.b(contextRequireContext, strD, false, new wk8(zk8Var, i2), new hk8(zk8Var, i2)).show();
                        Unit unit2 = Unit.a;
                    } else if (unj0Var instanceof unj0.a) {
                        String strD2 = ((unj0.a) unj0Var).a;
                        if (strD2.length() == 0) {
                            strD2 = sn5.d(zk8Var, R.string.page_withdraw__account_already_frozen, new Object[0]);
                        }
                        b.a aVar = new b.a(zk8Var.requireContext());
                        AlertController.b bVar = aVar.a;
                        bVar.f = strD2;
                        bVar.k = false;
                        aVar.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: ik8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8Var.dismiss();
                            }
                        });
                        aVar.f();
                    } else if (unj0Var instanceof unj0.b) {
                        b.a aVar2 = new b.a(zk8Var.requireContext());
                        String str4 = ((unj0.b) unj0Var).a;
                        AlertController.b bVar2 = aVar2.a;
                        bVar2.f = str4;
                        bVar2.k = false;
                        aVar2.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: jk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                zk8Var2.dismiss();
                                if (zk8Var2.getActivity() instanceof SwipeRefreshLayout.f) {
                                    LayoutInflater.Factory activity2 = zk8Var2.getActivity();
                                    activity2.getClass();
                                    ((SwipeRefreshLayout.f) activity2).i();
                                }
                            }
                        });
                        aVar2.f();
                    } else if (unj0Var instanceof unj0.e) {
                        String strD3 = ((unj0.e) unj0Var).a;
                        if (strD3.length() == 0) {
                            strD3 = sn5.d(zk8Var, R.string.page_payment__maximum_daily_transaction_value_is_vcurrency_vthreshold_tip, "₦", "9999999");
                        }
                        b.a aVar3 = new b.a(zk8Var.requireContext());
                        AlertController.b bVar3 = aVar3.a;
                        bVar3.f = strD3;
                        bVar3.k = false;
                        aVar3.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: kk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8Var.dismiss();
                            }
                        });
                        aVar3.f();
                    } else if (unj0Var instanceof unj0.d) {
                        b.a aVar4 = new b.a(zk8Var.requireContext());
                        String str5 = ((unj0.d) unj0Var).a;
                        AlertController.b bVar4 = aVar4.a;
                        bVar4.f = str5;
                        bVar4.k = false;
                        aVar4.c(sn5.d(zk8Var, R.string.common_functions__continue, new Object[0]), new DialogInterface.OnClickListener() { // from class: mk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                el8 el8Var = (el8) zk8Var.H.getValue();
                                el8Var.y1(el8Var.x1(true));
                            }
                        });
                        aVar4.b(sn5.d(zk8Var, R.string.common_functions__cancel, new Object[0]), new DialogInterface.OnClickListener() { // from class: nk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                zk8Var2.dismiss();
                                LayoutInflater.Factory activity2 = zk8Var2.getActivity();
                                SwipeRefreshLayout.f fVar = activity2 instanceof SwipeRefreshLayout.f ? (SwipeRefreshLayout.f) activity2 : null;
                                if (fVar != null) {
                                    fVar.i();
                                }
                            }
                        });
                        aVar4.f();
                    } else if (unj0Var instanceof unj0.k) {
                        String strD4 = ((unj0.k) unj0Var).a;
                        if (strD4.length() == 0) {
                            strD4 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a title = new b.a(zk8Var.requireContext()).setTitle(sn5.d(zk8Var, R.string.page_withdraw__withdrawals_blocked, new Object[0]));
                        AlertController.b bVar5 = title.a;
                        bVar5.f = strD4;
                        bVar5.k = false;
                        title.c(sn5.d(zk8Var, R.string.common_functions__home, new Object[0]), new ok8());
                        title.b(sn5.d(zk8Var, R.string.self_exclusion__contact_customer_service, new Object[0]), new DialogInterface.OnClickListener() { // from class: pk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                d0n d0nVar = zk8Var2.v;
                                if (d0nVar == null) {
                                    Intrinsics.n("utils");
                                    throw null;
                                }
                                Context contextRequireContext2 = zk8Var2.requireContext();
                                contextRequireContext2.getClass();
                                d0nVar.b(contextRequireContext2, snb0.WITHDRAW);
                            }
                        });
                        title.f();
                    } else if (unj0Var instanceof unj0.j) {
                        String strD5 = ((unj0.j) unj0Var).a;
                        if (strD5.length() == 0) {
                            strD5 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a title2 = new b.a(zk8Var.requireContext()).setTitle(sn5.d(zk8Var, R.string.page_withdraw__withdrawals_blocked, new Object[0]));
                        AlertController.b bVar6 = title2.a;
                        bVar6.f = strD5;
                        bVar6.k = false;
                        title2.c(sn5.d(zk8Var, R.string.common_functions__home, new Object[0]), new qk8());
                        title2.b(sn5.d(zk8Var, R.string.common_functions__transactions, new Object[0]), new xk8());
                        title2.f();
                    } else if (unj0Var instanceof unj0.m) {
                        String strD6 = ((unj0.m) unj0Var).a;
                        if (strD6.length() == 0) {
                            strD6 = sn5.d(zk8Var, R.string.common_payment_providers__pending_request_content, new Object[0]);
                        }
                        Context contextRequireContext2 = zk8Var.requireContext();
                        contextRequireContext2.getClass();
                        sc00.b(contextRequireContext2, strD6, true, new bk8(zk8Var, i2), new ck8(zk8Var, i2)).show();
                        Unit unit3 = Unit.a;
                    } else if (unj0Var instanceof unj0.i) {
                        String strD7 = ((unj0.i) unj0Var).a;
                        if (strD7.length() == 0) {
                            strD7 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a aVar5 = new b.a(zk8Var.requireContext());
                        AlertController.b bVar7 = aVar5.a;
                        bVar7.f = strD7;
                        bVar7.k = false;
                        b.a title3 = aVar5.setTitle(sn5.d(zk8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title3.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: dk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8Var.dismiss();
                            }
                        });
                        title3.f();
                    } else if (unj0Var instanceof unj0.f) {
                        String strD8 = ((unj0.f) unj0Var).a;
                        if (strD8.length() == 0) {
                            strD8 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a aVar6 = new b.a(zk8Var.requireContext());
                        AlertController.b bVar8 = aVar6.a;
                        bVar8.f = strD8;
                        bVar8.k = false;
                        b.a title4 = aVar6.setTitle(sn5.d(zk8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title4.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: ek8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                zk8Var2.dismiss();
                                LayoutInflater.Factory activity2 = zk8Var2.getActivity();
                                SwipeRefreshLayout.f fVar = activity2 instanceof SwipeRefreshLayout.f ? (SwipeRefreshLayout.f) activity2 : null;
                                if (fVar != null) {
                                    fVar.i();
                                }
                            }
                        });
                        title4.f();
                    } else if (unj0Var instanceof unj0.h) {
                        String strD9 = ((unj0.h) unj0Var).a;
                        if (strD9.length() == 0) {
                            strD9 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        }
                        b.a aVar7 = new b.a(zk8Var.requireContext());
                        AlertController.b bVar9 = aVar7.a;
                        bVar9.f = strD9;
                        bVar9.k = false;
                        b.a title5 = aVar7.setTitle(sn5.d(zk8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title5.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: fk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                zk8Var2.dismiss();
                                LayoutInflater.Factory activity2 = zk8Var2.getActivity();
                                SwipeRefreshLayout.f fVar = activity2 instanceof SwipeRefreshLayout.f ? (SwipeRefreshLayout.f) activity2 : null;
                                if (fVar != null) {
                                    fVar.i();
                                }
                            }
                        });
                        title5.f();
                    } else {
                        if (!unj0Var.equals(unj0.g.b)) {
                            uhc.a();
                            return null;
                        }
                        String strD10 = sn5.d(zk8Var, R.string.page_payment__sorry_your_payment_request_has_a_problem_options_tip, new Object[0]);
                        b.a aVar8 = new b.a(zk8Var.requireContext());
                        AlertController.b bVar10 = aVar8.a;
                        bVar10.f = strD10;
                        bVar10.k = false;
                        b.a title6 = aVar8.setTitle(sn5.d(zk8Var, R.string.page_payment__error_during_transaction, new Object[0]));
                        title6.c(sn5.d(zk8Var, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: gk8
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                zk8 zk8Var2 = zk8Var;
                                zk8Var2.dismiss();
                                LayoutInflater.Factory activity2 = zk8Var2.getActivity();
                                SwipeRefreshLayout.f fVar = activity2 instanceof SwipeRefreshLayout.f ? (SwipeRefreshLayout.f) activity2 : null;
                                if (fVar != null) {
                                    fVar.i();
                                }
                            }
                        });
                        title6.f();
                    }
                }
                return Unit.a;
            default:
                ((Function1) obj3).invoke(new zxq.q(((Integer) obj).intValue()));
                return Unit.a;
        }
    }
}
