package defpackage;

import com.sportybet.plugin.myfavorite.widget.QuickAddStakeLayout;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bc30 implements KeyboardView.b {
    public final /* synthetic */ QuickAddStakeLayout a;

    public bc30(QuickAddStakeLayout quickAddStakeLayout) {
        this.a = quickAddStakeLayout;
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void c() {
        QuickAddStakeItem quickAddStakeItem = this.a.K;
        if (quickAddStakeItem == null) {
            Intrinsics.n("currentItem");
            throw null;
        }
        quickAddStakeItem.H.c.setText((CharSequence) null);
        quickAddStakeItem.E(null, false);
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void a() {
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
    public final void b() {
    }
}
