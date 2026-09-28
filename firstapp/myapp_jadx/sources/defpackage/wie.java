package defpackage;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public class wie extends r02 implements View.OnClickListener {
    public String a;
    public boolean e;
    public boolean f;
    public boolean i;
    public b v;
    public a w;
    public String b = "CONFIRM";
    public String c = "CANCEL";
    public String d = "title";
    public int y = R.color.brand_secondary;
    public int z = R.color.text_type1_secondary;
    public int A = R.color.text_type1_primary;
    public int B = 0;
    public int C = 0;
    public boolean D = false;
    public boolean E = true;
    public boolean F = false;

    public interface a {
        void d();
    }

    public interface b {
        void b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dbi_tv_conform) {
            b bVar = this.v;
            if (bVar != null) {
                bVar.b();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (id == R.id.dbi_tv_cancel) {
            a aVar = this.w;
            if (aVar != null) {
                aVar.d();
            }
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null || getActivity().isFinishing() || isDetached()) {
            dismissAllowingStateLoss();
        }
        setCancelable(false);
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (getActivity() == null) {
            itf0.a.d("Fragment " + this + " not attached to an activity.", new Object[0]);
            return super.onCreateDialog(bundle);
        }
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(getActivity());
        aVar.e(R.layout.dialog_basic_info);
        aVar.a.k = false;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.dbi_tv_title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_info);
        TextView textView3 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_conform);
        TextView textView4 = (TextView) bVarCreate.findViewById(R.id.dbi_tv_cancel);
        textView2.setText(this.a);
        textView2.setTextColor(getResources().getColor(this.A));
        textView3.setOnClickListener(this);
        textView3.setText(this.b);
        textView3.setTextColor(getResources().getColor(this.y));
        textView3.setVisibility(this.e ? 0 : 8);
        textView3.setTypeface(null, this.C);
        textView4.setOnClickListener(this);
        textView4.setText(this.c);
        textView4.setTextColor(getResources().getColor(this.z));
        textView4.setVisibility(this.f ? 0 : 8);
        textView4.setTypeface(null, this.B);
        textView.setText(this.d);
        textView.setVisibility(this.i ? 0 : 8);
        textView4.setTypeface(this.D ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        textView3.setTypeface(this.E ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        if (this.F) {
            textView3.setAllCaps(true);
            textView4.setAllCaps(true);
        }
        return bVarCreate;
    }
}
