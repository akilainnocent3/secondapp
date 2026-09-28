package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ghm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ ghm(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mhm.c((nhm) obj4, (xbm) obj3, (iaj) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                fvv.d((UiText) obj4, (v0u) obj3, (Function0) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
