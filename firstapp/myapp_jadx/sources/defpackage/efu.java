package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class efu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ efu(int i, int i2, haj hajVar, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ofu.b((rgu) this.b, (Function1) this.c, (Function1) this.d, (a) obj, qj40.a(9));
                break;
            default:
                ((Integer) obj2).getClass();
                n6z.a((UiText) this.b, (UiText) this.c, (Function0) this.d, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
