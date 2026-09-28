package defpackage;

import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ecz implements Function1 {
    public final /* synthetic */ OutrightsActivity a;

    public /* synthetic */ ecz(OutrightsActivity outrightsActivity) {
        this.a = outrightsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OutrightsActivity outrightsActivity = this.a;
        e880 e880Var = (e880) obj;
        int i = OutrightsActivity.F;
        if (e880Var != null) {
            try {
                outrightsActivity.F1(e880Var);
            } catch (Exception e) {
                wsm wsmVar = outrightsActivity.E;
                if (wsmVar == null) {
                    Intrinsics.n("crashlyticsHelper");
                    throw null;
                }
                wsmVar.g("Failed to observableSelection", "", e, null);
            }
        }
        return Unit.a;
    }
}
