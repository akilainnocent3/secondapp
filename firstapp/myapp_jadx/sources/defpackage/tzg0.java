package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tzg0 extends qlr implements Function1<x44.a, Boolean> {
    public final /* synthetic */ FocusTargetNode a;
    public final /* synthetic */ FocusTargetNode b;
    public final /* synthetic */ lk40 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ t4i.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzg0(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, lk40 lk40Var, int i, t4i.a aVar) {
        super(1);
        this.a = focusTargetNode;
        this.b = focusTargetNode2;
        this.c = lk40Var;
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
        boolean zJ = hoc0.j(this.d, this.e, this.c, focusTargetNode);
        Boolean boolValueOf = Boolean.valueOf(zJ);
        if (zJ || !aVar2.a()) {
            return boolValueOf;
        }
        return null;
    }
}
