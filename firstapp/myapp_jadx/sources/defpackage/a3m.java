package defpackage;

import com.sportybet.feature.settings.shortcutwidget.ShortcutWidgetConfigureActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a3m extends py1 {
    public boolean a = false;

    public a3m() {
        addOnContextAvailableListener(new z2m(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((u790) generatedComponent()).a2((ShortcutWidgetConfigureActivity) this);
    }
}
