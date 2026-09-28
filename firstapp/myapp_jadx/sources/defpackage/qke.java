package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class qke {
    public static void a(String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z, Dialog dialog, int i, View.OnClickListener onClickListener3, int i2) {
        try {
            dialog.setContentView(R.layout.sg_ss_layout_tutoral_welcome);
            dialog.getWindow().setLayout(-1, -2);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(R.id.ss_title);
            TextView textView2 = (TextView) dialog.findViewById(R.id.ss_message);
            Button button = (Button) dialog.findViewById(R.id.sg_positive_button);
            Button button2 = (Button) dialog.findViewById(R.id.negative_button);
            button.setText(str);
            textView.setText(str3);
            textView2.setText(str4);
            dialog.findViewById(R.id.dialog_cross).setOnClickListener(onClickListener3);
            dialog.findViewById(R.id.dialog_cross).setVisibility(i2);
            button.setBackground(dialog.getContext().getDrawable(i));
            button.setOnClickListener(onClickListener);
            if (z) {
                button2.setText(str2);
                button2.setVisibility(0);
                button2.setOnClickListener(onClickListener2);
            } else {
                button2.setVisibility(8);
            }
            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
