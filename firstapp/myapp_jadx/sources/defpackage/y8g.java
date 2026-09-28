package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.account.international.resetpwd.ui.ResetPwdFragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class y8g implements gv5<BaseResponse<xdp>> {
    public final /* synthetic */ z8g a;

    public y8g(z8g z8gVar) {
        this.a = z8gVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
        z8g z8gVar = this.a;
        e activity = z8gVar.getActivity();
        if (activity == null || activity.isFinishing() || z8gVar.isDetached() || su5Var.isCanceled()) {
            return;
        }
        z8gVar.F = null;
        z8gVar.D.setLoading(false);
        zyf0.d("");
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
        z8g z8gVar = this.a;
        e activity = z8gVar.getActivity();
        if (activity == null || activity.isFinishing() || z8gVar.isDetached() || su5Var.isCanceled()) {
            return;
        }
        z8gVar.F = null;
        BaseResponse<xdp> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            z8gVar.D.setLoading(false);
            zyf0.d("");
            return;
        }
        if (baseResponse.bizCode != 10000) {
            z8gVar.C.setError(baseResponse.message);
            z8gVar.D.setLoading(false);
            return;
        }
        if (baseResponse.data != null) {
            z8gVar.D.setLoading(false);
            String strB = lal.b(baseResponse.data, "token");
            if (z8gVar.K.r()) {
                ResetPwdFragment resetPwdFragment = new ResetPwdFragment();
                Bundle bundle = new Bundle();
                bundle.putString("token", strB);
                bundle.putBoolean("from_settings_password", true);
                resetPwdFragment.setArguments(bundle);
                FragmentManager supportFragmentManager = z8gVar.getActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar = new a(supportFragmentManager);
                aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                aVar.f(android.R.id.content, resetPwdFragment, null);
                aVar.c(null);
                aVar.k(true, true);
                return;
            }
            if (z8gVar.M.a()) {
                avz avzVar = z8gVar.L;
                FragmentManager supportFragmentManager2 = z8gVar.getActivity().getSupportFragmentManager();
                avzVar.getClass();
                supportFragmentManager2.getClass();
                strB.getClass();
                c57 c57Var = new c57();
                Bundle bundle2 = new Bundle();
                bundle2.putString("token", strB);
                c57Var.setArguments(bundle2);
                avz.b(supportFragmentManager2, c57Var);
                return;
            }
            d57 d57Var = new d57();
            Bundle bundle3 = new Bundle();
            bundle3.putString("token", strB);
            d57Var.setArguments(bundle3);
            FragmentManager supportFragmentManager3 = z8gVar.getActivity().getSupportFragmentManager();
            supportFragmentManager3.getClass();
            a aVar2 = new a(supportFragmentManager3);
            aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
            aVar2.f(android.R.id.content, d57Var, null);
            aVar2.c(null);
            aVar2.k(true, true);
        }
    }
}
