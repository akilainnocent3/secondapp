package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class jm60 extends Dialog {
    public Context a;
    public FloatingActionButton b;
    public TextView c;
    public AppCompatButton d;
    public a e;
    public String f;

    public static final class a {
        public final String a;
        public final String b;
        public final bt80 c;
        public final bgh d;
        public int e;

        public a(String str, String str2, bt80 bt80Var, bgh bghVar, int i) {
            this.a = str;
            this.b = str2;
            this.c = bt80Var;
            this.d = bghVar;
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
        Bundle bundleA = whs.a("popup_name", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "button_name", str2);
        bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str);
        bundleA.putString("user_state", str3);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("popup_action", bundleA);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x014a  */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String strB;
        String strB2;
        FloatingActionButton floatingActionButton;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sh_error_dialog_container);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.error_action_button);
        viewFindViewById2.getClass();
        this.d = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.error_dialog_close);
        viewFindViewById3.getClass();
        this.b = (FloatingActionButton) viewFindViewById3;
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: hm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jm60 jm60Var = this.a;
                String str = jm60Var.f;
                AppCompatButton appCompatButton2 = jm60Var.d;
                if (appCompatButton2 == null) {
                    Intrinsics.n("errorActionButton");
                    throw null;
                }
                jm60.a(str, appCompatButton2.getText().toString());
                jm60.a aVar = jm60Var.e;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.c.invoke();
                jm60Var.dismiss();
            }
        });
        FloatingActionButton floatingActionButton2 = this.b;
        if (floatingActionButton2 == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton2.setOnClickListener(new im60(this, 0));
        Context context = this.a;
        HashMap mapA = pcg.a(context);
        a aVar = this.e;
        if (aVar == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        String str = (String) mapA.get(aVar.a);
        TextView textView = this.c;
        if (textView == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        if (str != null) {
            op5 op5Var = op5.a;
            a aVar2 = this.e;
            if (aVar2 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            String str2 = aVar2.a;
            op5Var.getClass();
            strB = op5.b(str, str2, null);
        } else {
            strB = null;
        }
        textView.setText(strB);
        HashMap mapA2 = pcg.a(context);
        a aVar3 = this.e;
        if (aVar3 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        String str3 = (String) mapA2.get(aVar3.b);
        AppCompatButton appCompatButton2 = this.d;
        if (appCompatButton2 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        a aVar4 = this.e;
        if (aVar4 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        appCompatButton2.setText(aVar4.b);
        AppCompatButton appCompatButton3 = this.d;
        if (appCompatButton3 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        if (str3 != null) {
            op5 op5Var2 = op5.a;
            a aVar5 = this.e;
            if (aVar5 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            String str4 = aVar5.b;
            op5Var2.getClass();
            strB2 = op5.b(str3, str4, null);
        } else {
            strB2 = null;
        }
        appCompatButton3.setText(strB2);
        a aVar6 = this.e;
        if (aVar6 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (aVar6.b.equals(context.getString(R.string.label_dialog_add_money))) {
            floatingActionButton = this.b;
            if (floatingActionButton != null) {
                Intrinsics.n("closeButton");
                throw null;
            }
            floatingActionButton.setVisibility(0);
        } else {
            a aVar7 = this.e;
            if (aVar7 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            if (aVar7.b.equals(context.getString(R.string.label_dialog_tryagain))) {
                floatingActionButton = this.b;
                if (floatingActionButton != null) {
                    Intrinsics.n("closeButton");
                    throw null;
                }
                floatingActionButton.setVisibility(0);
            }
        }
        a aVar8 = this.e;
        if (aVar8 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (aVar8.e == 0) {
            aVar8.e = context.getColor(R.color.sh_error_btn_color);
        }
        TextView textView2 = this.c;
        if (textView2 == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        CharSequence text = textView2.getText();
        if (text == null || StringsKt.U(text)) {
            TextView textView3 = this.c;
            if (textView3 == null) {
                Intrinsics.n("errorMessage");
                throw null;
            }
            a aVar9 = this.e;
            if (aVar9 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            textView3.setText(aVar9.a);
        }
        AppCompatButton appCompatButton4 = this.d;
        if (appCompatButton4 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        a aVar10 = this.e;
        if (aVar10 != null) {
            appCompatButton4.setBackgroundColor(aVar10.e);
        } else {
            Intrinsics.n("errorInfo");
            throw null;
        }
    }
}
