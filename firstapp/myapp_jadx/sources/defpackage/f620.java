package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.popup.PopupQueueManager", f = "PopupQueueManager.kt", l = {246}, m = "restoreQueue", v = 2)
public final class f620 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ a620 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f620(a620 a620Var, x1b x1bVar) {
        super(x1bVar);
        this.b = a620Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Map<h620, Set<u420>> map = a620.l;
        return this.b.m(this);
    }
}
