package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$sendOTP$1", f = "OtpSelectorViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i7z extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c7z<OtpData> b;
    public final /* synthetic */ OtpSelection c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7z(c7z<OtpData> c7zVar, OtpSelection otpSelection, v1b<? super i7z> v1bVar) {
        super(2, v1bVar);
        this.b = c7zVar;
        this.c = otpSelection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i7z i7zVar = new i7z(this.b, this.c, v1bVar);
        i7zVar.a = obj;
        return i7zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i7z) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        c7z<OtpData> c7zVar = this.b;
        if (z) {
            wwd0 wwd0Var = c7zVar.f;
            do {
                value3 = wwd0Var.getValue();
                objA3 = (z6z) value3;
                z6z.a aVar = (z6z.a) (!(objA3 instanceof z6z.a) ? null : objA3);
                if (aVar != null) {
                    objA3 = z6z.a.a(aVar, j7z.d.a, null, false, 1019);
                }
            } while (!wwd0Var.g(value3, objA3));
        } else if (lk50Var instanceof lk50.c) {
            c7zVar.K1(this.c, (OTPResponse) ((lk50.c) lk50Var).a, null);
            wwd0 wwd0Var2 = c7zVar.f;
            do {
                value2 = wwd0Var2.getValue();
                objA2 = (z6z) value2;
                z6z.a aVar2 = (z6z.a) (!(objA2 instanceof z6z.a) ? null : objA2);
                if (aVar2 != null) {
                    objA2 = z6z.a.a(aVar2, new j7z.c(null), null, false, 1019);
                }
            } while (!wwd0Var2.g(value2, objA2));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            j7z.b bVarA1 = b42.A1(c7zVar, (lk50.a) lk50Var, new j3q(c7zVar, 1));
            wwd0 wwd0Var3 = c7zVar.f;
            wwd0 wwd0Var4 = c7zVar.f;
            z6z z6zVar = (z6z) wwd0Var3.getValue();
            if (z6zVar instanceof z6z.a) {
                do {
                    value = wwd0Var4.getValue();
                    objA = (z6z) value;
                    z6z.a aVar3 = (z6z.a) (!(objA instanceof z6z.a) ? null : objA);
                    if (aVar3 != null) {
                        objA = z6z.a.a(aVar3, bVarA1, null, false, 1019);
                    }
                } while (!wwd0Var4.g(value, objA));
            } else if (Intrinsics.g(z6zVar, z6z.d.a)) {
                z6z.b bVar = new z6z.b(bVarA1.a, bVarA1.b);
                wwd0Var4.getClass();
                wwd0Var4.k(null, bVar);
            }
        }
        return Unit.a;
    }
}
