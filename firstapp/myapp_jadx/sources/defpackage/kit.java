package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class kit extends Dialog {
    public TextView a;
    public AppCompatButton b;
    public AppCompatButton c;
    public a d;
    public String e;

    public static final class a {
        public final String a;
        public final String b;
        public final pw50 c;
        public final qw50 d;
        public int e;

        public a(String str, String str2, pw50 pw50Var, qw50 qw50Var, int i) {
            this.a = str;
            this.b = str2;
            this.c = pw50Var;
            this.d = qw50Var;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
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

    public static void a(String str, String str2) {
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

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sh_login_dialog_container);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.login_button);
        viewFindViewById2.getClass();
        this.b = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.exit_button);
        viewFindViewById3.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById3;
        this.c = appCompatButton;
        op5 op5Var = op5.a;
        AppCompatButton appCompatButton2 = this.b;
        if (appCompatButton2 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        TextView textView = this.a;
        if (textView == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        op5.r(op5Var, b.f(appCompatButton2, appCompatButton, textView), null, 4);
        AppCompatButton appCompatButton3 = this.b;
        if (appCompatButton3 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        appCompatButton3.setOnClickListener(new View.OnClickListener() { // from class: iit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kit kitVar = this.a;
                AppCompatButton appCompatButton4 = kitVar.b;
                if (appCompatButton4 == null) {
                    Intrinsics.n("loginButton");
                    throw null;
                }
                kit.a(appCompatButton4.getText().toString(), kitVar.e);
                kitVar.dismiss();
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            }
        });
        AppCompatButton appCompatButton4 = this.c;
        if (appCompatButton4 == null) {
            Intrinsics.n("exitButton");
            throw null;
        }
        appCompatButton4.setOnClickListener(new View.OnClickListener() { // from class: jit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kit kitVar = this.a;
                AppCompatButton appCompatButton5 = kitVar.c;
                if (appCompatButton5 == null) {
                    Intrinsics.n("exitButton");
                    throw null;
                }
                kit.a(appCompatButton5.getText().toString(), kitVar.e);
                kit.a aVar = kitVar.d;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.c.invoke();
                kitVar.dismiss();
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
        AppCompatButton appCompatButton5 = this.b;
        if (appCompatButton5 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        a aVar2 = this.d;
        if (aVar2 != null) {
            appCompatButton5.setBackgroundColor(aVar2.e);
        } else {
            Intrinsics.n("errorInfo");
            throw null;
        }
    }
}
