package defpackage;

import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lew implements Function0 {
    public final /* synthetic */ MultiMakerActivity a;

    public /* synthetic */ lew(MultiMakerActivity multiMakerActivity) {
        this.a = multiMakerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        kid0 kid0Var = this.a.f;
        if (kid0Var != null) {
            kid0Var.e.E();
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
