package defpackage;

import com.sportybet.feature.inappreview.InAppReviewDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ksl extends py1 {
    public boolean a = false;

    public ksl() {
        addOnContextAvailableListener(new jsl(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((adn) generatedComponent()).y0((InAppReviewDialogActivity) this);
    }
}
