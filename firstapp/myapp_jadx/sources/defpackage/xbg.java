package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xbg extends Dialog {
    public final Activity a;
    public FloatingActionButton b;
    public TextView c;
    public AppCompatButton d;
    public AppCompatButton e;
    public a f;
    public final String i;

    public static final class a {
        public final String a;
        public final String b;
        public final Function0<Unit> c;
        public final Function0<Unit> d;
        public int e;
        public final boolean f;
        public final boolean g;
        public final Function0<Unit> h;

        public a(String str, String str2, Function0<Unit> function0, Function0<Unit> function1, int i, boolean z, boolean z2, Function0<Unit> function2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = function0;
            this.d = function1;
            this.e = i;
            this.f = z;
            this.g = z2;
            this.h = function2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h.equals(aVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + mtg0.a(mtg0.a(gpp.a(this.e, x7g.a(x7g.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
        }

        public final String toString() {
            int i = this.e;
            StringBuilder sbA = ux5.a("ErrorInfo(message=", this.a, ", btnText=", this.b, ", onConfirm=");
            sbA.append(this.c);
            sbA.append(", onClose=");
            sbA.append(this.d);
            sbA.append(", btnBgColor=");
            sbA.append(i);
            sbA.append(", showClose=");
            sbA.append(this.f);
            sbA.append(", showTwoButtons=");
            sbA.append(this.g);
            sbA.append(", onExitCall=");
            sbA.append(this.h);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbg(Activity activity, String str) {
        super(activity);
        activity.getClass();
        str.getClass();
        this.a = activity;
        this.i = str;
        setCancelable(false);
    }

    public static void b(String str, String str2) {
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

    public static void c(xbg xbgVar, String str, String str2, Function0 function0, Function0 function1, int i, int i2) {
        int i3 = (i2 & 16) != 0 ? 0 : i;
        boolean z = (i2 & 32) == 0;
        wbg wbgVar = new wbg();
        xbgVar.getClass();
        str.getClass();
        str2.getClass();
        xbgVar.f = new a(str, str2, function0, function1, i3, z, false, wbgVar);
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

    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x019e  */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String strB;
        String strB2;
        String string;
        FloatingActionButton floatingActionButton;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sg_error_dialog_container);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.error_action_button);
        viewFindViewById2.getClass();
        this.d = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.error_cross_button);
        viewFindViewById3.getClass();
        this.e = (AppCompatButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.error_dialog_close);
        viewFindViewById4.getClass();
        this.b = (FloatingActionButton) viewFindViewById4;
        AppCompatButton appCompatButton = this.d;
        if (appCompatButton == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        appCompatButton.setOnClickListener(new tbg(this, 0));
        FloatingActionButton floatingActionButton2 = this.b;
        if (floatingActionButton2 == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton2.setOnClickListener(new ubg(this, 0));
        AppCompatButton appCompatButton2 = this.e;
        if (appCompatButton2 == null) {
            Intrinsics.n("errorCrossButton");
            throw null;
        }
        appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: vbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xbg xbgVar = this.a;
                xbg.b(xbgVar.i, AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                xbg.a aVar = xbgVar.f;
                if (aVar == null) {
                    Intrinsics.n("errorInfo");
                    throw null;
                }
                aVar.h.invoke();
                xbgVar.dismiss();
            }
        });
        TextView textView = this.c;
        if (textView == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        a aVar = this.f;
        if (aVar == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        textView.setText(aVar.a);
        Activity activity = this.a;
        HashMap mapA = pcg.a(activity);
        a aVar2 = this.f;
        if (aVar2 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        String str = (String) mapA.get(aVar2.a);
        TextView textView2 = this.c;
        if (textView2 == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        if (str != null) {
            op5 op5Var = op5.a;
            a aVar3 = this.f;
            if (aVar3 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            String str2 = aVar3.a;
            op5Var.getClass();
            strB = op5.b(str, str2, null);
        } else {
            a aVar4 = this.f;
            if (aVar4 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            strB = aVar4.a;
        }
        textView2.setText(strB);
        HashMap mapA2 = pcg.a(activity);
        a aVar5 = this.f;
        if (aVar5 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        String str3 = (String) mapA2.get(aVar5.b);
        String str4 = (String) pcg.a(activity).get(activity.getString(R.string.label_dialog_exit));
        AppCompatButton appCompatButton3 = this.d;
        if (appCompatButton3 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        a aVar6 = this.f;
        if (aVar6 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        appCompatButton3.setText(aVar6.b);
        AppCompatButton appCompatButton4 = this.d;
        if (appCompatButton4 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        if (str3 != null) {
            op5 op5Var2 = op5.a;
            a aVar7 = this.f;
            if (aVar7 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            String str5 = aVar7.b;
            op5Var2.getClass();
            strB2 = op5.b(str3, str5, null);
        } else {
            a aVar8 = this.f;
            if (aVar8 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            strB2 = aVar8.b;
        }
        appCompatButton4.setText(strB2);
        AppCompatButton appCompatButton5 = this.e;
        if (appCompatButton5 == null) {
            Intrinsics.n("errorCrossButton");
            throw null;
        }
        if (str4 != null) {
            op5 op5Var3 = op5.a;
            String string2 = activity.getString(R.string.label_dialog_exit);
            string2.getClass();
            op5Var3.getClass();
            string = op5.b(str4, string2, null);
        } else {
            string = activity.getString(R.string.label_dialog_exit);
            string.getClass();
        }
        appCompatButton5.setText(string);
        a aVar9 = this.f;
        if (aVar9 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (Intrinsics.g(aVar9.b, activity.getString(R.string.label_dialog_add_money))) {
            floatingActionButton = this.b;
            if (floatingActionButton != null) {
                Intrinsics.n("closeButton");
                throw null;
            }
            floatingActionButton.setVisibility(0);
        } else {
            a aVar10 = this.f;
            if (aVar10 == null) {
                Intrinsics.n("errorInfo");
                throw null;
            }
            if (aVar10.f) {
                floatingActionButton = this.b;
                if (floatingActionButton != null) {
                    Intrinsics.n("closeButton");
                    throw null;
                }
                floatingActionButton.setVisibility(0);
            }
        }
        a aVar11 = this.f;
        if (aVar11 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        boolean z = aVar11.g;
        AppCompatButton appCompatButton6 = this.e;
        if (z) {
            if (appCompatButton6 == null) {
                Intrinsics.n("errorCrossButton");
                throw null;
            }
            appCompatButton6.setVisibility(0);
        } else {
            if (appCompatButton6 == null) {
                Intrinsics.n("errorCrossButton");
                throw null;
            }
            appCompatButton6.setVisibility(8);
        }
        a aVar12 = this.f;
        if (aVar12 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        if (aVar12.e == 0) {
            aVar12.e = activity.getColor(R.color.button_green);
        }
        AppCompatButton appCompatButton7 = this.d;
        if (appCompatButton7 == null) {
            Intrinsics.n("errorActionButton");
            throw null;
        }
        a aVar13 = this.f;
        if (aVar13 != null) {
            appCompatButton7.setBackgroundColor(aVar13.e);
        } else {
            Intrinsics.n("errorInfo");
            throw null;
        }
    }
}
