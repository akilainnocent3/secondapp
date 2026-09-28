package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Las00;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PhoneMigration;", "Lnd4;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class as00 extends c7z<OtpData.PhoneMigration> implements nd4, d5z {
    public final es00 A;
    public final bg B;
    public final d5z C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as00(v8w v8wVar, rdd0 rdd0Var, es00 es00Var, bg bgVar, d5z d5zVar) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        rdd0Var.getClass();
        bgVar.getClass();
        d5zVar.getClass();
        this.A = es00Var;
        this.B = bgVar;
        this.C = d5zVar;
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.C.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        if (((OtpData.PhoneMigration) B1()).e) {
            return this.C.P0(z, v1bVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        boolean z = ((OtpData.PhoneMigration) B1()).e;
        String str = ((OtpData.PhoneMigration) B1()).d;
        es00 es00Var = this.A;
        es00Var.getClass();
        str.getClass();
        lyz lyzVar = es00Var.b;
        return new cs00(z ? lyzVar.a0(str) : lyzVar.J());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.A.a(otpSelection, z1().b, (OtpData.PhoneMigration) B1());
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.C.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.C.e1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nd4
    public final Object i0(ArrayList arrayList, a7z.b.a aVar) {
        return ((OtpData.PhoneMigration) B1()).e ? this.B.a(arrayList, aVar) : a4h.f(arrayList);
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.C.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.C.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.F1(bm50.a(this.A.b(oLsIjJCWb.wIj, oLsIjJCWb.wIj, ((OtpData.PhoneMigration) B1()).d, ((OtpData.PhoneMigration) B1()).e, true)), new Function1() { // from class: zr00
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                as00 as00Var = this.a;
                as00Var.b = OtpData.PhoneMigration.a((OtpData.PhoneMigration) as00Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }
}
