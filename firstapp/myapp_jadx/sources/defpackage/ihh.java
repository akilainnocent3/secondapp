package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ihh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ ihh(Object obj, haj hajVar, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vhh.b((UiText) this.b, (Function0) this.c, (a) obj, qj40.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                rfc0.a((qcn) this.b, (gaj) this.c, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
