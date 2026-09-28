package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class aa0 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ w420 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(PopupLayout popupLayout, w420 w420Var) {
        super(1);
        this.a = popupLayout;
        this.b = w420Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        w420 w420Var = this.b;
        PopupLayout popupLayout = this.a;
        popupLayout.setPositionProvider(w420Var);
        popupLayout.n();
        return new z90();
    }
}
