package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public class gc8 extends d implements View.OnClickListener {
    public String a;
    public String b;
    public String c;
    public oj6 d;
    public String e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.confirm_btn) {
            if (id == R.id.cancel_btn) {
                dismiss();
            }
        } else {
            oj6 oj6Var = this.d;
            if (oj6Var != null) {
                oj6Var.onClick(view);
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            dismiss();
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(requireActivity());
        aVar.e(R.layout.dialog_common_confirm);
        aVar.a.k = false;
        b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.tv_title);
        textView.setText(this.a);
        textView.setVisibility(TextUtils.isEmpty(this.a) ? 8 : 0);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.tv_content);
        textView2.setText(this.b);
        textView2.setVisibility(TextUtils.isEmpty(this.b) ? 8 : 0);
        Button button = (Button) bVarCreate.findViewById(R.id.confirm_btn);
        button.setText(this.c);
        button.setVisibility(TextUtils.isEmpty(this.c) ? 8 : 0);
        button.setOnClickListener(this);
        Button button2 = (Button) bVarCreate.findViewById(R.id.cancel_btn);
        button2.setText(this.e);
        button2.setVisibility(TextUtils.isEmpty(this.e) ? 8 : 0);
        button2.setOnClickListener(this);
        return bVarCreate;
    }
}
