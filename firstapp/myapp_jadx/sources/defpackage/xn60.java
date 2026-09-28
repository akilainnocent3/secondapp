package defpackage;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class xn60 implements zn60 {
    public final Fragment a;
    public final Context b;
    public final kd c;

    public xn60(Fragment fragment, Context context, kd kdVar) {
        this.a = fragment;
        this.b = context;
        this.c = kdVar;
    }

    @Override // defpackage.zn60
    public final void a() {
        Fragment fragment = this.a;
        if (!(fragment instanceof x7c0) || this.b == null) {
            return;
        }
        kd kdVar = this.c;
        ImageView imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet1) : null;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        x7c0 x7c0Var = (x7c0) fragment;
        x7c0Var.f = true;
        x7c0Var.v0(x7c0Var.S0(), null);
    }

    @Override // defpackage.zn60
    public final void b() {
        Fragment fragment = this.a;
        if (!(fragment instanceof x7c0) || this.b == null) {
            return;
        }
        kd kdVar = this.c;
        ImageView imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet) : null;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        x7c0 x7c0Var = (x7c0) fragment;
        x7c0Var.e = true;
        x7c0Var.v0(x7c0Var.R0(), null);
    }
}
