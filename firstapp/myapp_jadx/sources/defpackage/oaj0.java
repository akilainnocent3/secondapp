package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class oaj0 extends t7m {
    public BigDecimal f;
    public a i;
    public String v;
    public gbn w;
    public wsm y;
    public psm z;

    /* JADX INFO: loaded from: classes5.dex */
    public interface a {
        void f1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t7m, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.i = (a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } catch (Exception unused) {
            this.y.g("WinningDialogFragment", "", new NullPointerException("Fail to set the window TRANSPARENT"), null);
        }
        return layoutInflater.inflate(R.layout.iwqk_fragment_winning_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        ((TextView) view.findViewById(R.id.tv_return_amount)).setText(this.z.b() + " " + bjb0.L(this.f, Locale.US));
        view.findViewById(R.id.btn_view_details).setOnClickListener(new View.OnClickListener() { // from class: kaj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.dismiss();
            }
        });
        view.findViewById(R.id.btn_next_round).setOnClickListener(new View.OnClickListener() { // from class: laj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.dismiss();
            }
        });
        view.findViewById(R.id.close_win_dlg).setOnClickListener(new View.OnClickListener() { // from class: maj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.dismiss();
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: naj0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                oaj0 oaj0Var = this.a;
                oaj0.a aVar = oaj0Var.i;
                if (aVar != null) {
                    aVar.f1();
                }
                oaj0Var.dismiss();
                return true;
            }
        });
        if (!TextUtils.equals(this.v, "https://s.sporty.net/ke/main/res/bc6f624bd2732642a0620f20c85d78a4.png")) {
            view.findViewById(R.id.btn_next_round).setVisibility(8);
            view.findViewById(R.id.btn_view_details).setVisibility(8);
            view.findViewById(R.id.close_win_dlg).setVisibility(0);
        }
        this.w.a(this.v, imageView);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        setStyle(2, R.style.FullScreenDialogStyle);
        if (getArguments() == null) {
            dismiss();
            return;
        }
        this.f = (BigDecimal) getArguments().getSerializable("arg_return_amount");
        this.v = getArguments().getString("arg_img_path", tYcQsJyaojE.FYCXMAFzHU);
        if (this.f == null) {
            dismiss();
        }
    }
}
