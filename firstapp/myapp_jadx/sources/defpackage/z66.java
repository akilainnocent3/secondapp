package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z66 extends Dialog {
    public TextView a;
    public AppCompatButton b;
    public final String c;

    public z66(e eVar, String str) {
        super(eVar);
        this.c = str;
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
            window3.setBackgroundDrawableResource(R.color.trans_black_color);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.campaign_end_dialog_container);
        View viewFindViewById = findViewById(R.id.error_message);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.login_button);
        viewFindViewById2.getClass();
        AppCompatButton appCompatButton = (AppCompatButton) viewFindViewById2;
        this.b = appCompatButton;
        appCompatButton.setOnClickListener(new y66(this, 0));
        TextView textView = this.a;
        if (textView == null) {
            Intrinsics.n("errorMessage");
            throw null;
        }
        String str = this.c;
        str.getClass();
        textView.setText(kn5.b(new eo5("campaign_ended_dialog_message", str.concat(" campaign has ended. Stay tuned for upcoming exciting campaigns."), kpu.d(new Pair("{campaignName}", str)))));
        AppCompatButton appCompatButton2 = this.b;
        if (appCompatButton2 == null) {
            Intrinsics.n("loginButton");
            throw null;
        }
        appCompatButton2.setText("Okay");
        AppCompatButton appCompatButton3 = this.b;
        if (appCompatButton3 != null) {
            appCompatButton3.setBackgroundColor(getContext().getColor(R.color.button_green));
        } else {
            Intrinsics.n("loginButton");
            throw null;
        }
    }
}
