package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x90 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ x420 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ asr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(PopupLayout popupLayout, Function0<Unit> function0, x420 x420Var, String str, asr asrVar) {
        super(1);
        this.a = popupLayout;
        this.b = function0;
        this.c = x420Var;
        this.d = str;
        this.e = asrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        PopupLayout popupLayout = this.a;
        popupLayout.C.addView(popupLayout, popupLayout.params);
        popupLayout.k(this.b, this.c, this.d, this.e);
        return new w90(popupLayout);
    }
}
