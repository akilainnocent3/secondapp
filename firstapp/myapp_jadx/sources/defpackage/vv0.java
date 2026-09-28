package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ vv0(int i, Function0 function0, Function0 function1) {
        this.a = 2;
        this.c = function0;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        haj hajVar = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wv0.b((UiText) obj3, (Function0) hajVar, (a) obj, qj40.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                uro.c((xro) obj3, (Function1) hajVar, (a) obj, qj40.a(9));
                break;
            default:
                ((Integer) obj2).getClass();
                ktx.d((Function0) hajVar, (Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vv0(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = hajVar;
    }
}
