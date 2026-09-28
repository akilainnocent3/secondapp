package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vx50 extends Dialog {
    public final Context a;
    public TextView b;
    public AppCompatButton c;
    public AppCompatButton d;
    public a e;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final Function0<Unit> d;
        public final Function0<Unit> e;

        public a(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function1) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = function0;
            this.e = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.e.hashCode() + x7g.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ErrorInfo(message=", this.a, ", positiveBtnText=", this.b, ", negativeBtnText=");
            sbA.append(this.c);
            sbA.append(", onPositiveButtonClick=");
            sbA.append(this.d);
            sbA.append(", onNegativeButtonClick=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx50(Context context) {
        super(context);
        context.getClass();
        this.a = context;
        setCancelable(false);
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
            window3.setBackgroundDrawableResource(R.color.trans_black_60);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    public final void b(String str, String str2, String str3, Function0 function0, Function0 function1) {
        str.getClass();
        str2.getClass();
        this.e = new a(str, str2, str3, function0, function1);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        requestWindowFeature(1);
        setContentView(R.layout.roulette_error_dialog);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.pos_button);
        viewFindViewById2.getClass();
        this.c = (AppCompatButton) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.neg_button);
        viewFindViewById3.getClass();
        this.d = (AppCompatButton) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.error_dialog_close);
        viewFindViewById4.getClass();
        AppCompatButton appCompatButton = this.c;
        if (appCompatButton == null) {
            Intrinsics.n("positiveButton");
            throw null;
        }
        appCompatButton.setOnClickListener(new np10(this, i));
        AppCompatButton appCompatButton2 = this.d;
        if (appCompatButton2 == null) {
            Intrinsics.n("negativeButton");
            throw null;
        }
        appCompatButton2.setOnClickListener(new w4j(this, 1));
        TextView textView = this.b;
        if (textView == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        a aVar = this.e;
        if (aVar == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        textView.setText(aVar.a);
        AppCompatButton appCompatButton3 = this.c;
        if (appCompatButton3 == null) {
            Intrinsics.n("positiveButton");
            throw null;
        }
        a aVar2 = this.e;
        if (aVar2 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        appCompatButton3.setText(aVar2.b);
        AppCompatButton appCompatButton4 = this.d;
        if (appCompatButton4 == null) {
            Intrinsics.n("negativeButton");
            throw null;
        }
        a aVar3 = this.e;
        if (aVar3 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        appCompatButton4.setText(aVar3.c);
        AppCompatButton appCompatButton5 = this.c;
        if (appCompatButton5 == null) {
            Intrinsics.n("positiveButton");
            throw null;
        }
        appCompatButton5.setBackgroundColor(this.a.getColor(R.color.rut_error_bg_color));
        a aVar4 = this.e;
        if (aVar4 == null) {
            Intrinsics.n("errorInfo");
            throw null;
        }
        String str = aVar4.c;
        if (str == null || str.length() == 0) {
            AppCompatButton appCompatButton6 = this.d;
            if (appCompatButton6 != null) {
                appCompatButton6.setVisibility(8);
                return;
            } else {
                Intrinsics.n("negativeButton");
                throw null;
            }
        }
        AppCompatButton appCompatButton7 = this.d;
        if (appCompatButton7 != null) {
            appCompatButton7.setVisibility(0);
        } else {
            Intrinsics.n("negativeButton");
            throw null;
        }
    }
}
