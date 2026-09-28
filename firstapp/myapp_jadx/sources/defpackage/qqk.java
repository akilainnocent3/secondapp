package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.e;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qqk implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ haj f;
    public final /* synthetic */ Object i;

    public /* synthetic */ qqk(e6z e6zVar, OtpData.Register register, Function1 function1, Function0 function0, UiText uiText, int i, int i2) {
        this.d = e6zVar;
        this.e = register;
        this.f = function1;
        this.b = function0;
        this.i = uiText;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.i;
        haj hajVar = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(this.c | 1);
                e.b((g.b) obj5, this.b, (Function0) obj4, (Function0) hajVar, (Function0) obj3, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = qj40.a(9);
                p5z.a((e6z) obj5, (OtpData.Register) obj4, (Function1) hajVar, this.b, (UiText) obj3, (a) obj, iA2, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qqk(g.b bVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.d = bVar;
        this.b = function0;
        this.e = function1;
        this.f = function2;
        this.i = function3;
        this.c = i;
    }
}
