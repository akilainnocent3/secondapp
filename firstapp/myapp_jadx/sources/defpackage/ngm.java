package defpackage;

import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ngm implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ngm(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                return new mcy("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.History", g8r.INSTANCE, new Annotation[0]);
        }
    }
}
