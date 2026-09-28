package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class m400 implements g6i0 {
    public final ConstraintLayout a;

    public m400(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TabLayout tabLayout) {
        this.a = constraintLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
