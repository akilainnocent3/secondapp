package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bd4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bd4(ld4 ld4Var, int i, CharSequence charSequence) {
        this.c = ld4Var;
        this.b = i;
        this.d = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ld4) obj2).q0(i2, (CharSequence) obj);
                break;
            default:
                TabLayout tabLayout = (TabLayout) obj2;
                ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
                tabLayout.s(((SportyNewsListFragment) obj).o0().c.k(i2), true);
                tabLayout.setScrollPosition(i2, 0.0f, true);
                break;
        }
    }

    public /* synthetic */ bd4(TabLayout tabLayout, SportyNewsListFragment sportyNewsListFragment, int i) {
        this.c = tabLayout;
        this.d = sportyNewsListFragment;
        this.b = i;
    }
}
