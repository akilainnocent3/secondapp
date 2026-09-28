package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class o5i extends qlr implements Function0<Unit> {
    public final /* synthetic */ FocusTargetNode a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5i(FocusTargetNode focusTargetNode) {
        super(0);
        this.a = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.a.q2();
        return Unit.a;
    }
}
