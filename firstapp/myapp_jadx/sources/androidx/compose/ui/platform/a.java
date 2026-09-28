package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.qlr;
import defpackage.t3i;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends qlr implements Function1<FocusTargetNode, Boolean> {
    public final /* synthetic */ t3i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t3i t3iVar) {
        super(1);
        this.a = t3iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.D(this.a.a));
    }
}
