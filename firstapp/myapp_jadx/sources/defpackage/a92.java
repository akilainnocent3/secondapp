package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public class a92 extends d {
    public int A;
    public String B;
    public int C;
    public a D;
    public Context E;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public boolean i = false;
    public boolean v = false;
    public int w;
    public int y;
    public int z;

    public interface a {
        void L();

        void p();
    }

    public static class b {
        public int a;
        public final int d;
        public String e;
        public String f;
        public a g;
        public String h;
        public int b = R.string.common_functions__ok;
        public int c = 0;
        public int i = 0;
        public boolean j = false;
        public boolean k = false;
        public int l = R.dimen.pin_withdraw_icon_width;
        public int m = R.dimen.pin_withdraw_icon_height;
        public int n = R.dimen.transfer_layout_width;
        public int o = R.dimen.transfer_layout_height;

        public b(int i, int i2) {
            this.a = i;
            this.d = i2;
        }
    }

    public static a92 j0(b bVar) {
        a92 a92Var = new a92();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_title_res_id", bVar.a);
        bundle.putInt("arg_des_res_id", bVar.d);
        bundle.putString("arg_des_string", bVar.e);
        bundle.putString("arg_des_res_arg", bVar.f);
        bundle.putString("arg_img_url", bVar.h);
        bundle.putInt("arg_img_src", bVar.i);
        bundle.putBoolean("arg_custom_width_height", bVar.j);
        bundle.putBoolean("arg_custom_layout", bVar.k);
        bundle.putInt("arg_dimen_width", bVar.l);
        bundle.putInt("arg_dimen_height", bVar.m);
        bundle.putInt("arg_dimen_layout_height", bVar.o);
        bundle.putInt("arg_dimen_layout_width", bVar.n);
        bundle.putInt("arg_button_res", bVar.b);
        bundle.putInt("arg_cancel_button_res", bVar.c);
        a92Var.setArguments(bundle);
        a92Var.D = bVar.g;
        return a92Var;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.E = context;
        setCancelable(false);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.a = getArguments().getInt("arg_title_res_id", 0);
            this.d = getArguments().getInt("arg_des_res_id", 0);
            this.e = getArguments().getString("arg_des_string", "");
            this.B = getArguments().getString("arg_img_url", "");
            this.C = getArguments().getInt("arg_img_src", 0);
            this.i = getArguments().getBoolean("arg_custom_width_height", false);
            this.v = getArguments().getBoolean("arg_custom_layout", false);
            this.z = getArguments().getInt("arg_dimen_width", 0);
            this.A = getArguments().getInt("arg_dimen_height", 0);
            this.w = getArguments().getInt("arg_dimen_layout_width", 0);
            this.y = getArguments().getInt("arg_dimen_layout_height", 0);
            this.b = getArguments().getInt("arg_button_res", 0);
            this.c = getArguments().getInt("arg_cancel_button_res", 0);
            this.f = getArguments().getString("arg_des_res_arg");
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(this.E);
        aVar.e(R.layout.dialog_basic_confirm);
        aVar.a.k = false;
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.show();
        TextView textView = (TextView) bVarCreate.findViewById(R.id.tv_dialog_title);
        TextView textView2 = (TextView) bVarCreate.findViewById(R.id.tv_dialog_description);
        ImageView imageView = (ImageView) bVarCreate.findViewById(R.id.img_icon);
        Button button = (Button) bVarCreate.findViewById(R.id.btn_continue);
        Button button2 = (Button) bVarCreate.findViewById(R.id.btn_cancel);
        int i = this.a;
        if (i != 0) {
            textView.setText(sn5.d(this, i, new Object[0]));
        }
        if (this.d != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f);
            int i2 = this.d;
            if (zIsEmpty) {
                textView2.setText(nae0.a(sn5.d(this, i2, new Object[0])));
            } else {
                textView2.setText(nae0.a(sn5.d(this, i2, this.f)));
            }
        } else {
            textView2.setText(this.e);
        }
        int i3 = this.b;
        if (i3 != 0) {
            button.setText(sn5.d(this, i3, new Object[0]));
        }
        int i4 = this.c;
        if (i4 != 0) {
            button2.setText(sn5.d(this, i4, new Object[0]));
            button2.setVisibility(0);
        } else {
            button2.setVisibility(8);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: y82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a92 a92Var = this.a;
                a92.a aVar2 = a92Var.D;
                if (aVar2 != null) {
                    aVar2.L();
                    a92Var.dismiss();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: z82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a92 a92Var = this.a;
                a92.a aVar2 = a92Var.D;
                if (aVar2 != null) {
                    aVar2.p();
                    a92Var.dismiss();
                }
            }
        });
        if (TextUtils.isEmpty(this.B)) {
            int i5 = this.C;
            if (i5 != 0) {
                imageView.setImageResource(i5);
            }
        } else {
            sh8.a().a(this.B, imageView);
        }
        if (this.i) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) getResources().getDimension(this.z);
            ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) getResources().getDimension(this.A);
            imageView.setLayoutParams(layoutParams);
        }
        if (this.v) {
            bVarCreate.getWindow().setLayout((int) getResources().getDimension(this.w), (int) getResources().getDimension(this.y));
        }
        return bVarCreate;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.E = null;
    }
}
