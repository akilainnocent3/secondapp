package defpackage;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class few implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ few(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = MultiMakerActivity.E;
                ((MultiMakerActivity) obj).onBackPressed();
                break;
            default:
                ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
                NavHostFragment.a.a((SportyNewsVideoDetailFragment) obj).j();
                break;
        }
    }
}
