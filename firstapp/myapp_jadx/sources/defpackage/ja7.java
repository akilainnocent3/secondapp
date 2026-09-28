package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lja7;", "Landroidx/fragment/app/d;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ja7 extends d {
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireActivity(), 0);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.dialog_chat_guideline);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(R.style.AnimBottom);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ((ProgressButton) dialog.findViewById(R.id.btn_ok)).setOnClickListener(new View.OnClickListener() { // from class: ia7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.dismiss();
            }
        });
        String strD = sn5.d(this, R.string.component_wap_share_bet__chat_room_guidelines, new Object[0]);
        WebView webView = (WebView) dialog.findViewById(R.id.webview_description);
        webView.getClass();
        String strE = c8i0.e(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL("x-data://base", strD, "text/html; charset=utf-8", "UTF-8", null);
        webView.setWebViewClient(new b8i0(webView, strE));
        return dialog;
    }
}
