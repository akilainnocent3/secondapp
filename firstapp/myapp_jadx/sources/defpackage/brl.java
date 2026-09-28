package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class brl extends py1 {
    public boolean a = false;

    public brl() {
        addOnContextAvailableListener(new arl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((mbi) generatedComponent()).b2((FootballFamilySettlementActivity) this);
    }
}
