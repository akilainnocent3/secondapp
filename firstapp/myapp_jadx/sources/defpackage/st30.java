package defpackage;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.realsports.data.ShareImageData;

/* JADX INFO: loaded from: classes5.dex */
public final class st30 extends WebViewClient {
    public final /* synthetic */ RSportsBetTicketDetailsActivity a;

    public st30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity) {
        this.a = rSportsBetTicketDetailsActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
        String str2 = rSportsBetTicketDetailsActivity.Q;
        int i = rSportsBetTicketDetailsActivity.R;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strA = tug.a("window.shareWinCard.drawSharePic('", sh8.b().toJson(new ShareImageData(a8b.d().trim(), i, Double.parseDouble(str2.replace(",", "")), rSportsBetTicketDetailsActivity.l0.getCountryCode().getCode())), "');");
        rSportsBetTicketDetailsActivity.o0.postDelayed(rSportsBetTicketDetailsActivity.p0, 15000L);
        WebView webView2 = rSportsBetTicketDetailsActivity.P;
        if (webView2 != null) {
            webView2.evaluateJavascript(strA, null);
        }
    }
}
