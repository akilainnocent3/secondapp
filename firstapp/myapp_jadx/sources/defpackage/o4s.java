package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class o4s extends RecyclerView.d0 {
    public final ImageView a;
    public final TextView b;
    public final ConstraintLayout c;
    public final TextView d;
    public final TextView e;
    public final MaterialButton f;

    public o4s(View view) {
        super(view);
        rx80.a aVarH = new rx80().h();
        aVarH.c(rx80.m);
        fcv fcvVar = new fcv(aVarH.a());
        this.a = (ImageView) view.findViewById(R.id.icon_menu);
        this.b = (TextView) view.findViewById(R.id.menu_txt);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.ll_toggle);
        this.c = constraintLayout;
        this.d = (TextView) constraintLayout.findViewById(R.id.on_textview);
        this.e = (TextView) constraintLayout.findViewById(R.id.off_textview);
        this.f = (MaterialButton) constraintLayout.findViewById(R.id.switch_circle);
        constraintLayout.setBackground(fcvVar);
    }
}
