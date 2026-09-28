package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.SportExtension;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ifb0 implements Runnable {
    public final /* synthetic */ lfb0 a;

    @Override // java.lang.Runnable
    public final void run() {
        List<SportExtension> list;
        lfb0 lfb0Var = this.a;
        synchronized (lfb0Var) {
            try {
                if (lfb0Var.b()) {
                    return;
                }
                bi50<BaseResponse<List<SportExtension>>> bi50VarExecute = ap0.b().o().execute();
                if (bi50VarExecute.a.getIsSuccessful()) {
                    BaseResponse<List<SportExtension>> baseResponse = bi50VarExecute.b;
                    if (baseResponse != null && (list = baseResponse.data) != null) {
                        vn20.i("sportybet", "pref_key_sport_extension", lfb0Var.a.toJson(list), true);
                        lfb0Var.a();
                    }
                    vn20.h(System.currentTimeMillis(), "pref_key_sport_extension_last_check_time", true);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
