package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Ljr20;", "Lp0g;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PrimaryPhone;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jr20 extends p0g<OtpData.PrimaryPhone> implements d5z {
    public final /* synthetic */ d5z w;
    public final ys20 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr20(ys20 ys20Var, rdd0 rdd0Var, d5z d5zVar) {
        super(rdd0Var);
        rdd0Var.getClass();
        d5zVar.getClass();
        this.w = d5zVar;
        this.y = ys20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.F1(bm50.a(ys20.b(this.y, "", "", ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 16)), new m87(this, 1));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.w.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.y.a(otpSelection, z1().b, (OtpData.PrimaryPhone) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p0g
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(ys20.b(this.y, str, z1().b, ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 48)), new l87(this, 1));
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.w.P0(z, v1bVar);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.w.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.w.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.w.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.w.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
