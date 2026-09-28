package defpackage;

import com.sporty.android.platform.features.luckywheel.LuckyWheelActivity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dwl extends py1 {
    public boolean a = false;

    public dwl() {
        addOnContextAvailableListener(new cwl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((o8u) generatedComponent()).Q0((LuckyWheelActivity) this);
    }
}
