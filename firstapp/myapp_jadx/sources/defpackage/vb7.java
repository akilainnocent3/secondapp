package defpackage;

import com.sportybet.feature.gift.gift.presentation.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vb7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (v8k) ((qn70) obj).a(jq40.a(v8k.class), null, null);
            default:
                ((Function1) obj).invoke(b.C0362b.a);
                return Unit.a;
        }
    }
}
