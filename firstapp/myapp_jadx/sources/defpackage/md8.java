package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public class md8 extends yol implements View.OnClickListener {
    public boolean B;
    public boolean C;
    public e D;
    public c E;
    public b F;
    public gbn f;
    public CharSequence i;
    public int v;
    public String w;
    public CharSequence y;
    public CharSequence z = "CONFIRM";
    public CharSequence A = "CANCEL";

    public static class a {
        public int a;
        public String b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public mi8 g;
        public ni8 h;
        public boolean i;
        public boolean j;
    }

    public interface b {
        void d();
    }

    public interface c {
        void b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rdf_tv_conform) {
            c cVar = this.E;
            if (cVar != null) {
                cVar.b();
            }
            dismiss();
            return;
        }
        if (id == R.id.rdf_tv_cancel) {
            b bVar = this.F;
            if (bVar != null) {
                bVar.d();
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            dismiss();
        } else {
            this.D = getActivity();
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this.D);
        aVar.e(R.layout.dialog_common_image);
        aVar.a.k = false;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        ImageView imageView = (ImageView) bVarCreate.findViewById(R.id.rdf_iv_icon);
        TextView textView = (TextView) bVarCreate.findViewById(R.id.rdf_tv_title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.rdf_tv_info);
        TextView textView3 = (TextView) bVarCreate.findViewById(R.id.rdf_tv_conform);
        TextView textView4 = (TextView) bVarCreate.findViewById(R.id.rdf_tv_cancel);
        if (TextUtils.isEmpty(this.w)) {
            int i = this.v;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                imageView.setVisibility(8);
            }
        } else {
            this.f.a(this.w, imageView);
        }
        if (TextUtils.isEmpty(this.i)) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.i);
        }
        if (TextUtils.isEmpty(this.y)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(Html.fromHtml(this.y.toString()));
        }
        textView3.setOnClickListener(this);
        textView3.setText(this.z);
        textView3.setVisibility(this.B ? 0 : 8);
        textView4.setOnClickListener(this);
        textView4.setText(this.A);
        textView4.setVisibility(this.C ? 0 : 8);
        return bVarCreate;
    }
}
