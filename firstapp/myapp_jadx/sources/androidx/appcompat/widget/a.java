package androidx.appcompat.widget;

import defpackage.fui;
import defpackage.sb90;

/* JADX INFO: loaded from: classes.dex */
public final class a extends fui {
    public final /* synthetic */ AppCompatSpinner.e y;
    public final /* synthetic */ AppCompatSpinner z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, AppCompatSpinner.e eVar) {
        super(appCompatSpinner2);
        this.z = appCompatSpinner;
        this.y = eVar;
    }

    @Override // defpackage.fui
    public final sb90 b() {
        return this.y;
    }

    @Override // defpackage.fui
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.z;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f.k(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
