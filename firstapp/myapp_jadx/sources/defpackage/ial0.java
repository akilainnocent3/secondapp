package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class ial0 extends fwk0 {
    public final /* synthetic */ TaskCompletionSource a;

    public ial0(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.kzk0
    public final void o(Status status, ExecuteResult executeResult) {
        status.getClass();
        x5f0.a(status, executeResult, this.a);
    }

    @Override // defpackage.kzk0
    public final void u(Status status, InitResult initResult) {
    }
}
