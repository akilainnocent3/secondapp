package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class nle extends Dialog {
    public final Context a;
    public final String b;
    public final Integer c;
    public final Drawable d;
    public final Function0<Unit> e;
    public ole f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nle(Context context, String str, Integer num, Drawable drawable, Function0 function0, int i) {
        super(context);
        num = (i & 4) != 0 ? null : num;
        drawable = (i & 8) != 0 ? null : drawable;
        this.a = context;
        this.b = str;
        this.c = num;
        this.d = drawable;
        this.e = function0;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_how_to_play, (ViewGroup) null, false);
        int i = R.id.card_view_htp;
        CardView cardView = (CardView) h5e.a(R.id.card_view_htp, viewInflate);
        if (cardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.fab_htp_close;
            FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.fab_htp_close, viewInflate);
            if (floatingActionButton != null) {
                i = R.id.tv_htp_title;
                TextView textView = (TextView) h5e.a(R.id.tv_htp_title, viewInflate);
                if (textView != null) {
                    i = R.id.web_view_htp;
                    WebView webView = (WebView) h5e.a(R.id.web_view_htp, viewInflate);
                    if (webView != null) {
                        this.f = new ole(constraintLayout, cardView, floatingActionButton, textView, webView);
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
                        ole oleVar = this.f;
                        if (oleVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        op5.r(op5Var, b.f(oleVar.d), null, 4);
                        Context context = this.a;
                        Typeface typefaceB = th50.b(context, R.font.motley_forces);
                        Typeface typefaceB2 = th50.b(context, R.font.roboto_bold);
                        String str = this.b;
                        if (str == null || !str.equalsIgnoreCase(context.getString(R.string.fh_game_name))) {
                            ole oleVar2 = this.f;
                            if (oleVar2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oleVar2.d.setTypeface(typefaceB2);
                        } else {
                            ole oleVar3 = this.f;
                            if (oleVar3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oleVar3.d.setTypeface(typefaceB);
                        }
                        String string = context.getString(R.string.how_to_play_html_text);
                        string.getClass();
                        String strD = op5.d(string, "", new HashMap());
                        ole oleVar4 = this.f;
                        if (oleVar4 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        xn80.c(oleVar4.e, strD);
                        Integer num = this.c;
                        if (num != null) {
                            ole oleVar5 = this.f;
                            if (oleVar5 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            oleVar5.b.setCardBackgroundColor(num.intValue());
                        } else {
                            Drawable drawable = this.d;
                            if (drawable != null) {
                                ole oleVar6 = this.f;
                                if (oleVar6 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oleVar6.b.setBackground(drawable);
                            }
                        }
                        ole oleVar7 = this.f;
                        if (oleVar7 != null) {
                            oleVar7.c.setOnClickListener(new View.OnClickListener() { // from class: mle
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    zj60 bridge;
                                    nle nleVar = this.a;
                                    Function0<Unit> function0 = nleVar.e;
                                    if (function0 != null) {
                                        function0.invoke();
                                    }
                                    nleVar.dismiss();
                                    String str2 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                                    Bundle bundleA = whs.a("popup_name", "how to play", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                                    bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, nleVar.b);
                                    bundleA.putString("user_state", str2);
                                    SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                    if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
                                        return;
                                    }
                                    ((bk60) bridge).a("popup_action", bundleA);
                                }
                            });
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
