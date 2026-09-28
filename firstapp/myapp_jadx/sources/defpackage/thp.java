package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportygames.spindabottle.remote.models.PlaceBetRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class thp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ thp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final KYCActivity kYCActivity = (KYCActivity) obj;
                KYCActivity.Companion companion = KYCActivity.E;
                return new WebChromeClient() { // from class: com.sportybet.android.user.kyc.KYCActivity$kycWebChromeClient$2$1
                    @Override // android.webkit.WebChromeClient
                    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                        webView.getClass();
                        filePathCallback.getClass();
                        fileChooserParams.getClass();
                        kYCActivity.B1(filePathCallback, fileChooserParams);
                        return true;
                    }
                };
            case 1:
                Bundle bundle = new Bundle();
                bundle.putBoolean("data_enable_default_action_bar", false);
                ((Function2) obj).invoke("m/me/loyalty/history", bundle);
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj;
                String str = b8b0Var.C;
                if (str != null && !StringsKt.U(str)) {
                    if (yju.a("br")) {
                        b8b0Var.w0().y1(new PlaceBetRequest(b8b0Var.V, b8b0Var.Q, b8b0Var.C, null, null, b8b0Var.x0, null, 64, null), b8b0Var.getActivity());
                    } else {
                        di10.x1(b8b0Var.w0(), new PlaceBetRequest(b8b0Var.V, b8b0Var.Q, b8b0Var.C, null, null, b8b0Var.x0, null, 64, null));
                    }
                }
                return Unit.a;
        }
    }
}
