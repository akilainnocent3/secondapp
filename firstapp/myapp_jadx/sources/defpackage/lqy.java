package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lqy extends qlr implements Function1<x44.a, Boolean> {
    public final /* synthetic */ FocusTargetNode a;
    public final /* synthetic */ FocusTargetNode b;
    public final /* synthetic */ FocusTargetNode c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t4i.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqy(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i, t4i.a aVar) {
        super(1);
        this.a = focusTargetNode;
        this.b = focusTargetNode2;
        this.c = focusTargetNode3;
        this.d = i;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(x44.a aVar) {
        x44.a aVar2 = aVar;
        FocusTargetNode focusTargetNode = this.b;
        if (this.a != pkd.g(focusTargetNode).getFocusOwner().f()) {
            return Boolean.TRUE;
        }
        boolean zF = mqy.f(focusTargetNode, this.c, this.d, this.e);
        Boolean boolValueOf = Boolean.valueOf(zF);
        if (zF || !aVar2.a()) {
            return boolValueOf;
        }
        return null;
    }
}
