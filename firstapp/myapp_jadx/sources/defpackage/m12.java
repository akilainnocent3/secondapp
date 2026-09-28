package defpackage;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public class m12 extends bml {
    public static boolean w;
    public boolean f;
    public uqm i;
    public gzm v;

    public m12() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = this instanceof xym;
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return w ? AnimationUtils.loadAnimation(getActivity(), R.anim.gone) : super.onCreateAnimation(i, z, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f) {
            this.v.a(getActivity(), false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f) {
            this.v.a(getActivity(), true);
        }
    }

    public m12(int i) {
        super(i);
    }
}
