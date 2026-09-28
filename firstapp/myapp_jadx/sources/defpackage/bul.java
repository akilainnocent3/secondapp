package defpackage;

import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bul extends py1 {
    public boolean a = false;

    public bul() {
        addOnContextAvailableListener(new aul(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((bup) generatedComponent()).g((KycRejectBottomSheetActivity) this);
    }
}
