package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o420 extends qlr implements Function0<Boolean> {
    public final /* synthetic */ PopupLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o420(PopupLayout popupLayout) {
        super(0);
        this.a = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        PopupLayout popupLayout = this.a;
        urr parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.e()) {
            parentLayoutCoordinates = null;
        }
        return Boolean.valueOf((parentLayoutCoordinates == null || popupLayout.m3getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
