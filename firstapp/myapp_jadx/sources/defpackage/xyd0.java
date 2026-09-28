package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.NestedWebView;
import com.sportybet.plugin.webcontainer.WebViewWrapperServiceImpl;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxyd0;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xyd0 extends s4m {
    public String A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public EventSource F;
    public heb0 G;
    public uqm f;
    public str<String> i;
    public str<String> v;
    public lvs w;
    public azd0 y;
    public WebViewWrapperServiceImpl z;

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.A = arguments.getString(AnalyticsParam.EVENT_PARAM_EVENT_ID);
            this.B = arguments.getString("sport_id");
            this.C = arguments.getBoolean("is_live");
            this.D = arguments.getBoolean("is_virtual_live");
            this.E = arguments.getBoolean("virtual_query_param", false);
            this.F = (EventSource) ((Parcelable) rj5.a(arguments, "event_source", EventSource.class));
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.spm_dialog_statistics, (ViewGroup) null, false);
        int i = R.id.btn_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.btn_close, viewInflate);
        if (appCompatImageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.tv_title;
            TextView textView = (TextView) h5e.a(R.id.tv_title, viewInflate);
            if (textView != null) {
                i = R.id.view_top;
                View viewA = h5e.a(R.id.view_top, viewInflate);
                if (viewA != null) {
                    i = R.id.web_view;
                    NestedWebView nestedWebView = (NestedWebView) h5e.a(R.id.web_view, viewInflate);
                    if (nestedWebView != null) {
                        this.G = new heb0(constraintLayout, appCompatImageView, constraintLayout, textView, viewA, nestedWebView);
                        Dialog dialog = new Dialog(requireActivity(), R.style.BottomDialog);
                        dialog.requestWindowFeature(1);
                        heb0 heb0Var = this.G;
                        if (heb0Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        dialog.setContentView(heb0Var.a);
                        dialog.setCanceledOnTouchOutside(true);
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
                        heb0 heb0Var2 = this.G;
                        if (heb0Var2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        heb0Var2.d.setVisibility(this.C ? 0 : 8);
                        heb0Var2.c.setOnClickListener(new View.OnClickListener() { // from class: uyd0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.dismiss();
                            }
                        });
                        heb0Var2.b.setOnClickListener(new View.OnClickListener() { // from class: vyd0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.dismiss();
                            }
                        });
                        WebViewWrapperServiceImpl webViewWrapperServiceImpl = this.z;
                        if (webViewWrapperServiceImpl == null) {
                            Intrinsics.n("webViewWrapperService");
                            throw null;
                        }
                        webViewWrapperServiceImpl.installJsBridge(requireActivity(), heb0Var2.f, new WebViewClient(), new WebChromeClient());
                        m0();
                        return dialog;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static final class a {
        public static xyd0 a(String str, String str2, boolean z, EventSource eventSource) {
            str.getClass();
            str2.getClass();
            xyd0 xyd0Var = new xyd0();
            Pair pair = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str);
            Pair pair2 = new Pair("sport_id", str2);
            Pair pair3 = new Pair(vZBMKENANSz.TqkemvJlgwNq, Boolean.valueOf(z));
            Boolean bool = Boolean.FALSE;
            xyd0Var.setArguments(vj5.a(pair, pair2, pair3, new Pair("is_virtual_live", bool), new Pair("virtual_query_param", bool), new Pair("event_source", eventSource)));
            return xyd0Var;
        }
    }

    public final void m0() {
        final String strConcat;
        String sourceId;
        heb0 heb0Var = this.G;
        if (heb0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        final NestedWebView nestedWebView = heb0Var.f;
        String str = this.A;
        String str2 = this.B;
        EventSource eventSource = this.F;
        String strE = c8i0.e(nestedWebView);
        uqm uqmVar = this.f;
        if (uqmVar == null) {
            Intrinsics.n("accountHelper");
            throw null;
        }
        String languageCode = uqmVar.getLanguageCode();
        languageCode.getClass();
        if (str != null && str2 != null && this.C) {
            azd0 azd0Var = this.y;
            if (azd0Var == null) {
                Intrinsics.n("statisticsWidgetUrlBuilder");
                throw null;
            }
            strConcat = azd0Var.a(str, eventSource, languageCode, strE);
        } else if (str != null && str2 != null) {
            lvs lvsVar = this.w;
            if (lvsVar == null) {
                Intrinsics.n("liveTrackerWidgetUrlBuilder");
                throw null;
            }
            strConcat = lvs.c(lvsVar, str, str2, eventSource, languageCode, strE, Integer.valueOf(nestedWebView.getMeasuredHeight()), null, 192);
        } else if (str != null && this.D) {
            str<String> strVar = this.i;
            if (strVar == null) {
                Intrinsics.n("liveVirtualTrackerUrl");
                throw null;
            }
            String str3 = strVar.get();
            str3.getClass();
            strConcat = yk10.a(Uri.parse(str3).buildUpon().appendQueryParameter("matchId", str).build().toString(), "&popup-view=true");
        } else {
            if (str == null) {
                dismiss();
                return;
            }
            if (eventSource != null && (sourceId = eventSource.getSourceId(true)) != null) {
                str = sourceId;
            }
            str<String> strVar2 = this.v;
            if (strVar2 == null) {
                Intrinsics.n("matchTrackerUrl");
                throw null;
            }
            String str4 = strVar2.get();
            String str5 = ((Object) str4) + URLEncoder.encode(str) + "&popup-view=true&theme=" + strE;
            strConcat = this.E ? str5.concat("&is_live_virtual=true") : str5;
        }
        itf0.a aVar = itf0.a;
        aVar.q(lobGSRIlnSGJY.tiwlFnfTHpoD);
        aVar.a("[StatisticsDialogFragment] loadUrl url=%s", strConcat);
        nestedWebView.post(new Runnable() { // from class: wyd0
            @Override // java.lang.Runnable
            public final void run() {
                nestedWebView.loadUrl(strConcat);
            }
        });
    }
}
