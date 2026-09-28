package defpackage;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.feature.winning.WinningDialogActivity;
import com.sportybet.plugin.realsports.data.ShareImageData;

/* JADX INFO: loaded from: classes6.dex */
public final class iaj0 extends WebViewClient {
    public final /* synthetic */ WinningDialogActivity a;

    public iaj0(WinningDialogActivity winningDialogActivity) {
        this.a = winningDialogActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WinningDialogActivity winningDialogActivity = this.a;
        String str2 = winningDialogActivity.A;
        int i = winningDialogActivity.B;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strA = tug.a("window.shareWinCard.drawSharePic('", sh8.b().toJson(new ShareImageData(a8b.d().trim(), i, Double.parseDouble(str2.replace(",", "")), winningDialogActivity.d.getCountryCode().getCode())), "');");
        winningDialogActivity.W.postDelayed(winningDialogActivity.X, 15000L);
        WebView webView2 = winningDialogActivity.U;
        if (webView2 != null) {
            webView2.evaluateJavascript(strA, null);
        }
    }
}
