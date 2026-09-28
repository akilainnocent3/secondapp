package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 extends qlr implements Function1<urr, Unit> {
    public final /* synthetic */ PopupLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca0(PopupLayout popupLayout) {
        super(1);
        this.a = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(urr urrVar) {
        urr urrVarE0 = urrVar.e0();
        urrVarE0.getClass();
        this.a.m(urrVarE0);
        return Unit.a;
    }
}
