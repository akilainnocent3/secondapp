package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends qlr implements Function1<jxo, Unit> {
    public final /* synthetic */ PopupLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(PopupLayout popupLayout) {
        super(1);
        this.a = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(jxo jxoVar) {
        jxo jxoVar2 = jxoVar;
        long j = jxoVar2.a;
        PopupLayout popupLayout = this.a;
        popupLayout.m4setPopupContentSizefhxjrPA(jxoVar2);
        popupLayout.n();
        return Unit.a;
    }
}
