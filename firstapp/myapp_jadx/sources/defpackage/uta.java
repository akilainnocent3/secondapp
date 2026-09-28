package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uta implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xta b;
    public final /* synthetic */ vtp c;

    public /* synthetic */ uta(boolean z, xta xtaVar, vtp vtpVar) {
        this.a = z;
        this.b = xtaVar;
        this.c = vtpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.a) {
            gym.a(this.b.c, new osp.e(this.c));
        }
        return Unit.a;
    }
}
