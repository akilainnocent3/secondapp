package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(since = "Use Composable InfoDialog instead")
public class mgn extends d implements View.OnClickListener {
    public String a;
    public e b;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.di_tv_conform) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            dismiss();
        } else {
            this.b = getActivity();
        }
        if (getArguments() != null) {
            this.a = getArguments().getString("param1");
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(this.b);
        aVar.e(R.layout.dialog_info);
        aVar.a.k = false;
        b bVarCreate = aVar.create();
        bVarCreate.show();
        bVarCreate.findViewById(R.id.di_tv_conform).setOnClickListener(this);
        ((TextView) bVarCreate.findViewById(R.id.di_tv_info)).setText(this.a);
        return bVarCreate;
    }
}
