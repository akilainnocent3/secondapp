package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hht extends Dialog {
    public TextView a;
    public TextView b;
    public TextView c;
    public a d;
    public final String e;

    public static final class a {
        public final String a;
        public final String b;
        public final Function0<Unit> c;
        public final Function0<Unit> d;
        public int e;

        public a(String str, String str2, Function0<Unit> function0, Function0<Unit> function1, int i) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = function0;
            this.d = function1;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + x7g.a(x7g.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            int i = this.e;
            StringBuilder sbA = ux5.a("ErrorInfo(message=", this.a, ", btnText=", this.b, ", onConfirm=");
            sbA.append(this.c);
            sbA.append(", onClose=");
            sbA.append(this.d);
            sbA.append(", btnBgColor=");
            return zk1.a(i, ")", sbA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hht(Context context, String str) {
        super(context);
        context.getClass();
        this.e = str;
        setCancelable(false);
    }

    public static void b(String str, String str2) {
        zj60 bridge;
        String str3 = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
        Bundle bundleA = whs.a("popup_name", "Login", "button_name", str);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str2);
        bundleA.putString("user_state", str3);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }

    public final void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.flags &= -5;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.trans_black_color);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    public final void c(String str, String str2, Function0 function0, Function0 function1, int i) {
        str.getClass();
        str2.getClass();
        this.d = new a(str, str2, function0, function1, i);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sg_login_dialog_container);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.login_button);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.exit_button);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.c = textView;
        op5 op5Var = op5.a;
        TextView textView2 = this.b;
        if (textView2 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        TextView textView3 = this.a;
        if (textView3 == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        op5.r(op5Var, b.f(textView2, textView, textView3), null, 4);
        TextView textView4 = this.b;
        if (textView4 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        textView4.setOnClickListener(new View.OnClickListener() { // from class: fht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hht hhtVar = this.a;
                try {
                    TextView textView5 = hhtVar.b;
                    if (textView5 == null) {
                        Intrinsics.n("loginButton");
                        throw null;
                    }
                    hht.b(textView5.getText().toString(), hhtVar.e);
                    hhtVar.dismiss();
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                } catch (Exception unused) {
                }
            }
        });
        TextView textView5 = this.c;
        if (textView5 == null) {
            Intrinsics.n("exitButton");
            throw null;
        }
        textView5.setOnClickListener(new View.OnClickListener() { // from class: ght
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hht hhtVar = this.a;
                TextView textView6 = hhtVar.c;
                if (textView6 == null) {
                    Intrinsics.n("exitButton");
                    throw null;
                }
                hht.b(textView6.getText().toString(), hhtVar.e);
                hht.a aVar = hhtVar.d;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.c.invoke();
                hhtVar.dismiss();
            }
        });
        a aVar = this.d;
        if (aVar == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (aVar.e == 0) {
            aVar.e = getContext().getColor(R.color.button_green);
        }
        TextView textView6 = this.b;
        if (textView6 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        a aVar2 = this.d;
        if (aVar2 != null) {
            textView6.setBackgroundColor(aVar2.e);
        } else {
            Intrinsics.n("errorInfo");
            throw null;
        }
    }
}
