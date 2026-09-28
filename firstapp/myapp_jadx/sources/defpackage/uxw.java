package defpackage;

import android.view.View;
import com.sportybet.plugin.myfavorite.widget.QuickAddStakeLayout;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;

/* JADX INFO: loaded from: classes5.dex */
public final class uxw implements g6i0 {
    public final QuickAddStakeLayout a;
    public final KeyboardView b;

    public uxw(QuickAddStakeLayout quickAddStakeLayout, QuickAddStakeItem quickAddStakeItem, QuickAddStakeItem quickAddStakeItem2, QuickAddStakeItem quickAddStakeItem3, KeyboardView keyboardView) {
        this.a = quickAddStakeLayout;
        this.b = keyboardView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
