package defpackage;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class plz implements ylz {
    public final Fragment a;
    public final Context b;
    public final kd c;

    public plz(Fragment fragment, Context context, kd kdVar) {
        this.a = fragment;
        this.b = context;
        this.c = kdVar;
    }

    @Override // defpackage.ylz
    public final void a() {
        nk2 binding;
        zt50 zt50Var;
        nk2 binding2;
        Fragment fragment = this.a;
        if (!(fragment instanceof zy10) || this.b == null) {
            return;
        }
        kd kdVar = this.c;
        ImageView imageView = kdVar != null ? (ImageView) kdVar.v.findViewById(R.id.pr_image_bet1) : null;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        zy10 zy10Var = (zy10) fragment;
        zy10Var.v1 = true;
        zt50 zt50Var2 = zy10Var.b;
        if (zt50Var2 == null || (binding = zt50Var2.S.getBinding()) == null || binding.A.getVisibility() != 0 || (zt50Var = zy10Var.b) == null || (binding2 = zt50Var.S.getBinding()) == null) {
            return;
        }
        binding2.A.performClick();
    }

    @Override // defpackage.ylz
    public final void b() {
        nk2 binding;
        zt50 zt50Var;
        nk2 binding2;
        Fragment fragment = this.a;
        if (!(fragment instanceof zy10) || this.b == null) {
            return;
        }
        kd kdVar = this.c;
        ImageView imageView = kdVar != null ? (ImageView) kdVar.v.findViewById(R.id.pr_image_bet3) : null;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        zy10 zy10Var = (zy10) fragment;
        zy10Var.x1 = true;
        zt50 zt50Var2 = zy10Var.b;
        if (zt50Var2 == null || (binding = zt50Var2.z.getBinding()) == null || binding.A.getVisibility() != 0 || (zt50Var = zy10Var.b) == null || (binding2 = zt50Var.z.getBinding()) == null) {
            return;
        }
        binding2.A.performClick();
    }

    @Override // defpackage.ylz
    public final void c() {
        nk2 binding;
        zt50 zt50Var;
        nk2 binding2;
        Fragment fragment = this.a;
        if (!(fragment instanceof zy10) || this.b == null) {
            return;
        }
        kd kdVar = this.c;
        ImageView imageView = kdVar != null ? (ImageView) kdVar.v.findViewById(R.id.pr_image_bet2) : null;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        zy10 zy10Var = (zy10) fragment;
        zy10Var.w1 = true;
        zt50 zt50Var2 = zy10Var.b;
        if (zt50Var2 == null || (binding = zt50Var2.R.getBinding()) == null || binding.A.getVisibility() != 0 || (zt50Var = zy10Var.b) == null || (binding2 = zt50Var.R.getBinding()) == null) {
            return;
        }
        binding2.A.performClick();
    }
}
