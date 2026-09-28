package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ya implements gv5<BaseResponse<xdp>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ za b;

    public ya(za zaVar, String str) {
        this.b = zaVar;
        this.a = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
        za zaVar = this.b;
        e activity = zaVar.getActivity();
        if (activity == null || activity.isFinishing() || zaVar.isDetached()) {
            return;
        }
        zaVar.C.setLoading(false);
        zaVar.u0(zaVar.B.getText());
        zaVar.p0();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
        za zaVar = this.b;
        e activity = zaVar.getActivity();
        if (activity == null || activity.isFinishing() || zaVar.isDetached()) {
            return;
        }
        zaVar.C.setLoading(false);
        zaVar.u0(zaVar.B.getText());
        BaseResponse<xdp> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            zaVar.o0();
            return;
        }
        int i = baseResponse.bizCode;
        if (i != 10000) {
            if (i == 11611) {
                zaVar.r0(baseResponse.message);
                return;
            }
            if (i != 11703) {
                if (i == 11000 || i == 11001) {
                    zaVar.B.setError(sn5.d(zaVar, zaVar.D, new Object[0]));
                    return;
                }
                switch (i) {
                    case 11600:
                        zaVar.r0(baseResponse.message);
                        break;
                    case 11601:
                        break;
                    case 11602:
                        zaVar.n0(baseResponse.message);
                        break;
                    default:
                        zyf0.c(1, baseResponse.message);
                        break;
                }
                return;
            }
            return;
        }
        lop.a(zaVar.B);
        boolean zA = zaVar.N.a();
        String str = this.a;
        if (zA) {
            avz avzVar = zaVar.M;
            FragmentManager supportFragmentManager = zaVar.requireActivity().getSupportFragmentManager();
            avzVar.getClass();
            supportFragmentManager.getClass();
            ci80 ci80Var = new ci80();
            Bundle bundle = new Bundle();
            bundle.putString("mobile", str);
            ci80Var.setArguments(bundle);
            avz.b(supportFragmentManager, ci80Var);
            return;
        }
        bi80 bi80Var = new bi80();
        Bundle bundleA = mll0.a("mobile", str);
        RegisterRevampConfig registerRevampConfig = zaVar.getArguments() == null ? null : (RegisterRevampConfig) zaVar.getArguments().getParcelable("key_register_revamp_config");
        if (registerRevampConfig != null) {
            bundleA.putParcelable("key_register_revamp_config", registerRevampConfig);
        }
        bi80Var.setArguments(bundleA);
        FragmentManager supportFragmentManager2 = zaVar.requireActivity().getSupportFragmentManager();
        supportFragmentManager2.getClass();
        a aVar = new a(supportFragmentManager2);
        aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        aVar.f(android.R.id.content, bi80Var, null);
        aVar.c("OTPUNIFY");
        aVar.k(true, true);
        lop.a(zaVar.B);
    }
}
