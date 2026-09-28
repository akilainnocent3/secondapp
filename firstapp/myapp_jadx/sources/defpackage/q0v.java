package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q0v implements Function1 {
    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        Outcome outcome = (Outcome) obj;
        if (outcome.enable) {
            String str = outcome.probability;
            if (str != null && !StringsKt.U(str)) {
                String str2 = outcome.probability;
                str2.getClass();
                if (b.g(str2) != null) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
