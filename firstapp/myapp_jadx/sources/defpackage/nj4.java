package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nj4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nj4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(Boolean.FALSE);
                return Unit.a;
            case 1:
                return (c) ((Function0) ((ytw) obj).getValue()).invoke();
            default:
                ((m410) obj).J0();
                return Unit.a;
        }
    }
}
