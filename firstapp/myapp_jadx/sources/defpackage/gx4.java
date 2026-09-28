package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gx4 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                return b6f0.b(bOConfigValueBundle);
            default:
                vci vciVar = (vci) obj;
                vciVar.getClass();
                return StringsKt.Z(2, String.valueOf(vciVar.c));
        }
    }
}
