package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class kww implements gv5<BaseResponse<List<Tournament>>> {
    public final /* synthetic */ c6g0 a;
    public final /* synthetic */ qww b;
    public final /* synthetic */ lww c;

    public kww(lww lwwVar, c6g0 c6g0Var, qww qwwVar) {
        this.c = lwwVar;
        this.a = c6g0Var;
        this.b = qwwVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<Tournament>>> su5Var, Throwable th) {
        c6g0 c6g0Var = this.a;
        c6g0Var.i = false;
        lww lwwVar = this.c;
        lwwVar.C.remove(lwwVar.B);
        if (su5Var.isCanceled() || lwwVar.D) {
            return;
        }
        this.b.a(false, c6g0Var);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<Tournament>>> su5Var, bi50<BaseResponse<List<Tournament>>> bi50Var) {
        BaseResponse<List<Tournament>> baseResponse;
        c6g0 c6g0Var = this.a;
        c6g0Var.i = false;
        lww lwwVar = this.c;
        lwwVar.C.remove(lwwVar.B);
        if (su5Var.isCanceled() || lwwVar.D) {
            return;
        }
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        qww qwwVar = this.b;
        if (!isSuccessful || (baseResponse = bi50Var.b) == null) {
            qwwVar.a(false, c6g0Var);
            return;
        }
        ArrayList arrayListC = kgb0.c(baseResponse.data, lwwVar.i, lwwVar.v, lwwVar.K);
        if (arrayListC == null) {
            arrayListC = new ArrayList(0);
        }
        c6g0Var.f = arrayListC;
        if (c6g0Var.d) {
            qwwVar.a(true, c6g0Var);
        }
    }
}
