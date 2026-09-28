package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qca0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qca0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx yfxVar = ((uca0) obj).B;
                if (yfxVar != null) {
                    yfxVar.k();
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
            default:
                return (mld0) ((qn70) obj).a(jq40.a(mld0.class), null, null);
        }
    }
}
