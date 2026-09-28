package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tj60 extends Dialog {
    public final Context a;
    public final boolean b;
    public final Function0<Unit> c;
    public so80 d;

    public tj60(Context context, boolean z, Function0 function0) {
        super(context);
        this.a = context;
        this.b = z;
        this.c = function0;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String strD;
        super.onCreate(bundle);
        requestWindowFeature(1);
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_howtoplay_dialog_sh, (ViewGroup) null, false);
        int i = R.id.card_view_sh_htp;
        CardView cardView = (CardView) h5e.a(R.id.card_view_sh_htp, viewInflate);
        if (cardView != null) {
            i = R.id.fab_sh_htp_close;
            FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.fab_sh_htp_close, viewInflate);
            if (floatingActionButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.tv_sh_htp_title;
                TextView textView = (TextView) h5e.a(R.id.tv_sh_htp_title, viewInflate);
                if (textView != null) {
                    i = R.id.web_view_sh_htp;
                    WebView webView = (WebView) h5e.a(R.id.web_view_sh_htp, viewInflate);
                    if (webView != null) {
                        this.d = new so80(constraintLayout, cardView, floatingActionButton, textView, webView);
                        setContentView(constraintLayout);
                        Window window = getWindow();
                        if (window != null) {
                            window.setLayout(-1, -1);
                        }
                        Window window2 = getWindow();
                        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                        if (attributes != null) {
                            attributes.gravity = 17;
                        }
                        if (attributes != null) {
                            attributes.flags &= -5;
                        }
                        Window window3 = getWindow();
                        if (window3 != null) {
                            window3.setAttributes(attributes);
                        }
                        Window window4 = getWindow();
                        if (window4 != null) {
                            window4.setBackgroundDrawableResource(R.color.dialog_bg_color);
                        }
                        op5 op5Var = op5.a;
                        so80 so80Var = this.d;
                        if (so80Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        op5.r(op5Var, b.f(so80Var.d), null, 4);
                        so80 so80Var2 = this.d;
                        if (so80Var2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        so80Var2.d.setTextColor(Color.parseColor("#ab8867"));
                        so80 so80Var3 = this.d;
                        if (so80Var3 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        so80Var3.b.setCardBackgroundColor(Color.parseColor("#382c21"));
                        so80 so80Var4 = this.d;
                        if (so80Var4 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        WebView webView2 = so80Var4.e;
                        Context context = this.a;
                        boolean z = this.b;
                        String strD2 = "";
                        if (z) {
                            try {
                                String string = context.getString(R.string.how_to_play_without_rain_html_text);
                                string.getClass();
                                strD = op5.d(string, "", new HashMap());
                            } catch (Exception unused) {
                            }
                        } else {
                            strD = "";
                        }
                        if (!z || TextUtils.isEmpty(strD)) {
                            String string2 = context.getString(R.string.how_to_play_html_text);
                            string2.getClass();
                            strD2 = op5.d(string2, "", new HashMap());
                        } else {
                            strD2 = strD;
                        }
                        xn80.c(webView2, "<b>" + strD2 + "</b>");
                        so80 so80Var5 = this.d;
                        if (so80Var5 != null) {
                            so80Var5.c.setOnClickListener(new m7p(this, 1));
                            return;
                        } else {
                            Intrinsics.n("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
