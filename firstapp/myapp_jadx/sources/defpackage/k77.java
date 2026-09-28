package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k77 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k77(zqy zqyVar, d dVar, Object obj, boolean z, int i) {
        this.d = zqyVar;
        this.e = dVar;
        this.f = obj;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iA = qj40.a(i2 | 1);
                boolean z = this.b;
                n77.a((OtpSelection) obj4, z, (i6z) obj3, (Function1) this.f, (a) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                ((zqy) obj4).V0((d) obj3, this.f, this.b, (a) obj, qj40.a(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k77(OtpSelection otpSelection, boolean z, i6z i6zVar, Function1 function1, int i) {
        this.d = otpSelection;
        this.b = z;
        this.e = i6zVar;
        this.f = function1;
        this.c = i;
    }
}
