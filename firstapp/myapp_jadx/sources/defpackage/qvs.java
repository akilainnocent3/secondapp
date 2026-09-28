package defpackage;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qvs extends bvl {
    public rle f;
    public str<String> i;
    public WebViewWrapperServiceImpl v;
    public final a w = new a();

    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra;
            if (Intrinsics.g(intent != null ? intent.getStringExtra("eventName") : null, "updateMatchTrackerHeight") && (intExtra = intent.getIntExtra("data", 0)) != 0) {
                qvs.this.n0(bqe.c() * intExtra);
            }
        }
    }

    public final Event m0() {
        Parcelable parcelable;
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("ARG_EVENT", Event.class);
        } else {
            Parcelable parcelable2 = bundleRequireArguments.getParcelable("ARG_EVENT");
            if (!(parcelable2 instanceof Event)) {
                parcelable2 = null;
            }
            parcelable = (Event) parcelable2;
        }
        Event event = (Event) parcelable;
        if (event != null) {
            return event;
        }
        hb5.a("Event must not be null.");
        return null;
    }

    public final void n0(float f) {
        rle rleVar = this.f;
        rleVar.getClass();
        WebView webView = rleVar.d;
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        if (layoutParams == null) {
            bmy.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = (int) f;
            webView.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_live_virtual_match_tracker, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.imagebutton_match_tracker_dialog_close;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.imagebutton_match_tracker_dialog_close, viewInflate);
        if (imageButton != null) {
            i = R.id.textview_match_tracker_dialog_title;
            if (((TextView) h5e.a(R.id.textview_match_tracker_dialog_title, viewInflate)) != null) {
                i = R.id.view_match_tracker_dialog_top_bar;
                View viewA = h5e.a(R.id.view_match_tracker_dialog_top_bar, viewInflate);
                if (viewA != null) {
                    i = R.id.webview_match_tracker_dialog;
                    WebView webView = (WebView) h5e.a(R.id.webview_match_tracker_dialog, viewInflate);
                    if (webView != null) {
                        this.f = new rle(constraintLayout, imageButton, viewA, webView);
                        Dialog dialog = new Dialog(requireActivity(), R.style.BottomDialog);
                        rle rleVar = this.f;
                        rleVar.getClass();
                        dialog.setContentView(rleVar.a);
                        mfb0 mfb0VarE = lfb0.d().e(m0().sport.id);
                        if (!b3.S(m0().eventId) || mfb0VarE == null) {
                            dismiss();
                            return dialog;
                        }
                        float fL = mfb0VarE.l();
                        rle rleVar2 = this.f;
                        rleVar2.getClass();
                        int iA = bqe.a(14.0f);
                        ConstraintLayout constraintLayout2 = rleVar2.a;
                        constraintLayout2.getClass();
                        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                        if (layoutParams == null) {
                            bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(iA, 0, iA, 0);
                        constraintLayout2.setLayoutParams(marginLayoutParams);
                        int i2 = 1;
                        constraintLayout2.setOnClickListener(new y4j(this, i2));
                        rleVar2.b.setOnClickListener(new z4j(this, i2));
                        WebView webView2 = rleVar2.d;
                        WebViewWrapperServiceImpl webViewWrapperServiceImpl = this.v;
                        if (webViewWrapperServiceImpl == null) {
                            Intrinsics.n("webViewWrapperService");
                            throw null;
                        }
                        webViewWrapperServiceImpl.installJsBridge(requireActivity(), webView2, new WebViewClient(), new WebChromeClient());
                        qry.a(webView2, new pvs(webView2, this, fL));
                        str<String> strVar = this.i;
                        if (strVar == null) {
                            Intrinsics.n("liveVirtualMatchTrackerBaseUrl");
                            throw null;
                        }
                        webView2.loadUrl(Uri.parse(strVar.get()).buildUpon().appendQueryParameter("matchId", m0().eventId).build().toString());
                        Window window = dialog.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                            window.setWindowAnimations(R.style.AnimBottom);
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.gravity = 17;
                            attributes.width = -1;
                            attributes.height = -1;
                            window.setAttributes(attributes);
                        }
                        fdt.a(requireActivity()).b(this.w, new IntentFilter("com.sportybet.action.JS_EVENT"));
                        return dialog;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fdt.a(requireActivity()).d(this.w);
        WebViewWrapperServiceImpl webViewWrapperServiceImpl = this.v;
        if (webViewWrapperServiceImpl == null) {
            Intrinsics.n("webViewWrapperService");
            throw null;
        }
        rle rleVar = this.f;
        rleVar.getClass();
        webViewWrapperServiceImpl.uninstallJsBridge(rleVar.d);
        this.f = null;
        super.onDestroyView();
    }
}
