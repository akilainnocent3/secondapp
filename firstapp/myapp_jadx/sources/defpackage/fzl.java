package defpackage;

import com.sportybet.feature.gift.payday.presentation.PaydayGiftBottomSheetActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fzl extends py1 {
    public boolean a = false;

    public fzl() {
        addOnContextAvailableListener(new ezl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((w400) generatedComponent()).G((PaydayGiftBottomSheetActivity) this);
    }
}
