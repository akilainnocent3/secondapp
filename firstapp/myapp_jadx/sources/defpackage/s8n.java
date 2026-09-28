package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public class s8n extends isl implements View.OnClickListener {
    public a A;
    public String B;
    public Context C;
    public psm f;
    public int i;
    public int v;
    public int w;
    public int y;
    public String z;

    public interface a {
        void a();

        void b();

        void c();
    }

    @Override // defpackage.isl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.C = context;
        setCancelable(false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_banner) {
            a aVar = this.A;
            if (aVar != null) {
                aVar.c();
            }
            dismiss();
            return;
        }
        if (id == R.id.tv_confirm) {
            a aVar2 = this.A;
            if (aVar2 != null) {
                aVar2.a();
            }
            dismiss();
            return;
        }
        if (id == R.id.tv_negative) {
            a aVar3 = this.A;
            if (aVar3 != null) {
                aVar3.b();
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.i = getArguments().getInt("arg_title_res_id", 0);
            this.v = getArguments().getInt("arg_description_res_id", 0);
            this.z = getArguments().getString("arg_description");
            this.w = getArguments().getInt("arg_positive_text_res_id", 0);
            this.y = getArguments().getInt("arg_negative_text_res_id", 0);
            this.B = getArguments().getString("arg_image");
        }
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(this.C);
        aVar.e(R.layout.dialog_bvn_pending_receive);
        aVar.a.k = false;
        b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.tv_info);
        TextView textView3 = (TextView) bVarCreate.findViewById(R.id.tv_confirm);
        TextView textView4 = (TextView) bVarCreate.findViewById(R.id.tv_negative);
        ImageView imageView = (ImageView) bVarCreate.findViewById(R.id.iv_banner);
        int i = this.i;
        if (i != 0) {
            textView.setText(sn5.d(this, i, new Object[0]));
        }
        if (this.v != 0) {
            boolean zN = this.f.n();
            int i2 = this.v;
            if (zN) {
                textView2.setText(Html.fromHtml(sn5.d(this, i2, new Object[0])));
            } else {
                textView2.setText(sn5.d(this, i2, new Object[0]));
            }
        } else {
            String str = this.z;
            if (str != null) {
                textView2.setText(str);
            }
        }
        int i3 = this.w;
        if (i3 != 0) {
            textView3.setText(sn5.d(this, i3, new Object[0]));
        }
        int i4 = this.y;
        if (i4 != 0) {
            textView4.setText(sn5.d(this, i4, new Object[0]));
            textView4.setVisibility(0);
            textView4.setOnClickListener(this);
        }
        if (TextUtils.isEmpty(this.B)) {
            imageView.setVisibility(8);
        } else {
            sh8.a().a(this.B, imageView);
        }
        textView3.setOnClickListener(this);
        imageView.setOnClickListener(this);
        return bVarCreate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.C = null;
    }
}
