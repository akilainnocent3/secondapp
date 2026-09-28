package defpackage;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class bm60 implements tn60 {
    public final Fragment a;
    public final Context b;
    public final kd c;

    public bm60(Fragment fragment, Context context, kd kdVar) {
        this.a = fragment;
        this.b = context;
        this.c = kdVar;
    }

    @Override // defpackage.tn60
    public final void a() {
        ImageView imageView;
        qq80 binding;
        Fragment fragment = this.a;
        boolean z = fragment instanceof q1c0;
        kd kdVar = this.c;
        Context context = this.b;
        if (!z) {
            if (!(fragment instanceof m410) || context == null) {
                return;
            }
            imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet1) : null;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ((m410) fragment).s0();
            return;
        }
        if (context != null) {
            imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet1) : null;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            q1c0 q1c0Var = (q1c0) fragment;
            q1c0Var.n0 = true;
            w3c0 w3c0Var = (w3c0) q1c0Var.b;
            if (w3c0Var == null || (binding = w3c0Var.e.getBinding()) == null || binding.I.getVisibility() != 0) {
                return;
            }
            q1c0Var.t0();
        }
    }

    @Override // defpackage.tn60
    public final void b() {
        ImageView imageView;
        qq80 binding;
        Fragment fragment = this.a;
        boolean z = fragment instanceof q1c0;
        kd kdVar = this.c;
        Context context = this.b;
        if (!z) {
            if (!(fragment instanceof m410) || context == null) {
                return;
            }
            imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet) : null;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ((m410) fragment).u0();
            return;
        }
        if (context != null) {
            imageView = kdVar != null ? (ImageView) kdVar.b.findViewById(R.id.image_bet) : null;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            q1c0 q1c0Var = (q1c0) fragment;
            q1c0Var.m0 = true;
            w3c0 w3c0Var = (w3c0) q1c0Var.b;
            if (w3c0Var == null || (binding = w3c0Var.d.getBinding()) == null || binding.I.getVisibility() != 0) {
                return;
            }
            q1c0Var.u0();
        }
    }
}
