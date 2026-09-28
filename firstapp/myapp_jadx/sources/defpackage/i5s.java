package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class i5s {
    public static boolean f;
    public final n4p a;
    public final uqm b;
    public final azm c;
    public final x4s d;
    public final jpk e;

    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements gd8.a {
        public a() {
        }

        @Override // gd8.a
        public final b a(e eVar) {
            eVar.getClass();
            b.a aVar = new b.a(eVar);
            aVar.d(R.string.page_instant_virtual__insufficient_balance);
            aVar.a(R.string.page_instant_virtual__please_make_a_deposit_to_continue);
            final i5s i5sVar = i5s.this;
            b bVarCreate = aVar.setPositiveButton(R.string.common_functions__deposit, new DialogInterface.OnClickListener() { // from class: g5s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    i5sVar.c.d(wae.DEPOSIT);
                    dialogInterface.dismiss();
                }
            }).setNegativeButton(R.string.common_functions__cancel, new h5s()).create();
            bVarCreate.getClass();
            return bVarCreate;
        }
    }

    static {
        new BigDecimal(10000);
    }

    public i5s(n4p n4pVar, uqm uqmVar, azm azmVar, x4s x4sVar, jpk jpkVar) {
        uqmVar.getClass();
        azmVar.getClass();
        x4sVar.getClass();
        jpkVar.getClass();
        this.a = n4pVar;
        this.b = uqmVar;
        this.c = azmVar;
        this.d = x4sVar;
        this.e = jpkVar;
    }

    public static void b(uqm uqmVar, Activity activity, yfo yfoVar) {
        uqmVar.getClass();
        activity.getClass();
        c(uqmVar, activity, yfoVar, false);
    }

    public static void c(uqm uqmVar, Activity activity, yfo yfoVar, boolean z) {
        uqmVar.getClass();
        activity.getClass();
        if (f) {
            return;
        }
        f = true;
        final d5s d5sVar = new d5s(yfoVar, 0);
        if (z) {
            uqmVar.demandNewAccount(activity, new tit() { // from class: e5s
                @Override // defpackage.tit
                public final void w(Account account, boolean z2) {
                    d5sVar.invoke(account, Boolean.valueOf(z2));
                }
            });
        } else {
            uqmVar.demandAccount(activity, new tit() { // from class: f5s
                @Override // defpackage.tit
                public final void w(Account account, boolean z2) {
                    d5sVar.invoke(account, Boolean.valueOf(z2));
                }
            });
        }
    }

    public final String a(Context context, String str, AssetsInfo assetsInfo, String str2) {
        context.getClass();
        str.getClass();
        String strP = c.p(StringsKt.t0(str).toString(), ",", "", false);
        int length = strP.length();
        n4p n4pVar = this.a;
        if (length == 0 || strP.equals(".")) {
            return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(n4pVar.j, RoundingMode.CEILING));
        }
        if (c.u(strP, ".", false)) {
            return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(n4pVar.j, RoundingMode.CEILING));
        }
        try {
            double d = Double.parseDouble(strP);
            double d2 = n4pVar.j;
            if (d < d2) {
                return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(d2, RoundingMode.CEILING));
            }
            double d3 = n4pVar.k;
            if (d > d3) {
                return sn5.b(context, R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, bjb0.Z(d3, RoundingMode.FLOOR));
            }
            double d4 = assetsInfo != null ? assetsInfo.balance * 1.0E-4d : 0.0d;
            m780 m780VarT0 = this.e.t0(str2);
            return ((m780VarT0 == null || bjb0.d0(m780VarT0.a) + d4 < d) && d > d4 && this.b.getAccount() != null) ? sn5.b(context, R.string.page_instant_virtual__less_balanc, new Object[0]) : "";
        } catch (Exception unused) {
            return sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(n4pVar.j, RoundingMode.CEILING));
        }
    }

    public final void d(e eVar) {
        eVar.getClass();
        try {
            gd8.j0(new a()).showNow(eVar.getSupportFragmentManager(), "dialog");
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("InstantWinUtil");
            aVar.e(e);
        }
    }
}
