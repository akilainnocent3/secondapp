package defpackage;

import androidx.fragment.app.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oh5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oh5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zpz zpzVar = (zpz) obj;
                return new Pair(Integer.valueOf(zpzVar.k()), Boolean.valueOf(zpzVar.k.c()));
            default:
                uca0 uca0Var = (uca0) obj;
                azm azmVar = uca0Var.f;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.HOME);
                e activity = uca0Var.getActivity();
                if (activity != null) {
                    wc.a(activity);
                }
                return Unit.a;
        }
    }
}
