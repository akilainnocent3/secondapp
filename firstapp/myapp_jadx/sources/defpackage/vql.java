package defpackage;

import com.sportybet.plugin.event.EventActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vql extends py1 {
    public boolean a = false;

    public vql() {
        addOnContextAvailableListener(new uql(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((zkg) generatedComponent()).J2((EventActivity) this);
    }
}
