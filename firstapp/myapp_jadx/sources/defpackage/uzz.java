package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.basepay.TransactionSuccessActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.kyc.KYCActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luzz;", "Lm12;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class uzz extends czl {
    public d0n B;
    public fbh0 C;

    public uzz() {
        this.z = false;
        this.A = false;
    }

    public final void n0(h000 h000Var) {
        e activity;
        e activity2;
        h000Var.getClass();
        if (h000Var.equals(h000.a.a)) {
            zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
            return;
        }
        if (h000Var.equals(h000.d.a)) {
            yrh0.t(requireContext(), KYCActivity.class, true);
            return;
        }
        if (h000Var instanceof h000.c) {
            fbh0 fbh0Var = this.C;
            if (fbh0Var == null) {
                Intrinsics.n("uiRouterManager");
                throw null;
            }
            wae waeVar = ((h000.c) h000Var).a;
            fbh0Var.e(o7d.a(waeVar));
            if (waeVar != wae.HOME || (activity2 = getActivity()) == null) {
                return;
            }
            activity2.finish();
            return;
        }
        if (h000Var instanceof h000.e) {
            e eVarRequireActivity = requireActivity();
            h000.e eVar = (h000.e) h000Var;
            String str = eVar.a;
            UiText uiText = eVar.b;
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            uiText.getClass();
            TransactionSuccessActivity.z1(eVarRequireActivity, str, uiText.e(contextRequireContext).toString(), eVar.c, eVar.d, eVar.f, eVar.e, false);
            return;
        }
        if (!(h000Var instanceof h000.f)) {
            if (!h000Var.equals(h000.b.a)) {
                uhc.a();
                return;
            }
            d0n d0nVar = this.B;
            if (d0nVar == null) {
                Intrinsics.n("utils");
                throw null;
            }
            e eVarRequireActivity2 = requireActivity();
            eVarRequireActivity2.getClass();
            d0nVar.b(eVarRequireActivity2, snb0.ME);
            return;
        }
        Bundle bundle = new Bundle();
        h000.f fVar = (h000.f) h000Var;
        Boolean bool = fVar.a;
        if (bool != null) {
            bundle.putBoolean(AnalyticsEvent.DEPOSIT, bool.booleanValue());
        }
        aqg0 aqg0Var = fVar.b;
        if (aqg0Var != null) {
            bundle.putInt("key_param_tx_category", aqg0Var.a);
        }
        fbh0 fbh0Var2 = this.C;
        if (fbh0Var2 == null) {
            Intrinsics.n("uiRouterManager");
            throw null;
        }
        fbh0Var2.c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        if (!fVar.c || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putSerializable("ENTRANCE_ARG", tj5.b(this));
        setArguments(arguments);
    }
}
