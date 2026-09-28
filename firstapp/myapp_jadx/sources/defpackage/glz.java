package defpackage;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class glz implements hlz {
    public final Fragment a;
    public final Context b;
    public final kd c;

    public glz(Fragment fragment, Context context, kd kdVar) {
        this.a = fragment;
        this.b = context;
        this.c = kdVar;
    }

    @Override // defpackage.hlz
    public final void a() {
        Fragment fragment = this.a;
        if (!(fragment instanceof m410) || this.b == null) {
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
        ((m410) fragment).s0();
    }

    @Override // defpackage.hlz
    public final void b() {
        Fragment fragment = this.a;
        if (!(fragment instanceof m410) || this.b == null) {
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
        ((m410) fragment).u0();
    }
}
