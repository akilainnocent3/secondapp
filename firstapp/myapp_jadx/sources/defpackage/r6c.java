package defpackage;

import com.sportybet.android.social.presentation.custom.CustomCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r6c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r6c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = CustomCodeActivity.f;
                wix.c((hjx) obj2, (CustomCodeActivity) obj);
                break;
            default:
                ((Function1) obj2).invoke((prg) obj);
                break;
        }
        return Unit.a;
    }
}
