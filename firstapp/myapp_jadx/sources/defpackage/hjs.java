package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hjs extends RecyclerView.d0 {
    public void a(int i) {
        this.itemView.setTag(R.id.root, this);
    }

    public void b(int i, mfb0 mfb0Var, RegularMarketRule regularMarketRule) {
        a(i);
    }

    public final void d(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (z) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.itemView.setVisibility(0);
        } else {
            this.itemView.setVisibility(8);
            layoutParams.height = 0;
            layoutParams.width = 0;
        }
    }

    public void c() {
    }
}
