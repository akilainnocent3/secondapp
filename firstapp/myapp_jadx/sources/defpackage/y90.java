package defpackage;

import androidx.compose.ui.window.PopupLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class y90 extends qlr implements Function0<Unit> {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ x420 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ asr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(PopupLayout popupLayout, Function0<Unit> function0, x420 x420Var, String str, asr asrVar) {
        super(0);
        this.a = popupLayout;
        this.b = function0;
        this.c = x420Var;
        this.d = str;
        this.e = asrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.k(this.b, this.c, this.d, this.e);
        return Unit.a;
    }
}
