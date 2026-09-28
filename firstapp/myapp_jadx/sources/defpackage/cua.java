package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class cua extends d implements View.OnClickListener {
    public String a = "CONFIRM";
    public String b = "CANCEL";
    public String c;
    public String d;
    public ppj0 e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.confirm_btn) {
            if (id == R.id.cancel_btn) {
                dismiss();
            }
        } else {
            ppj0 ppj0Var = this.e;
            if (ppj0Var != null) {
                hqj0 hqj0VarV0 = ppj0Var.a.P0();
                ej5.c(o8i0.d(hqj0VarV0), null, null, new bqj0(hqj0VarV0, null), 3);
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
        aVar.e(R.layout.dialog_confirm_transfer);
        aVar.a.k = false;
        b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.transfer_number);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.amount);
        Button button = (Button) bVarCreate.findViewById(R.id.confirm_btn);
        button.setText(this.a);
        button.setOnClickListener(this);
        Button button2 = (Button) bVarCreate.findViewById(R.id.cancel_btn);
        button2.setText(this.b);
        button2.setOnClickListener(this);
        textView.setText(this.c);
        textView2.setText(this.d);
        return bVarCreate;
    }
}
