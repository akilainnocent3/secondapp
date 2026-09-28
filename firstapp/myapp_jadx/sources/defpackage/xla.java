package defpackage;

import androidx.compose.runtime.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xla implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xla(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((b) obj).U();
            case 1:
                return Float.valueOf(((fmt) obj).g());
            default:
                ((fff0) obj).onCancel();
                return Unit.a;
        }
    }
}
