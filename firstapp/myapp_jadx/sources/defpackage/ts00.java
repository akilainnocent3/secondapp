package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lts00;", "Lgoi0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PhoneMigration;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ts00 extends goi0<OtpData.PhoneMigration> implements d5z {
    public final es00 A;
    public final /* synthetic */ d5z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts00(es00 es00Var, rdd0 rdd0Var, d5z d5zVar) {
        super(rdd0Var);
        rdd0Var.getClass();
        d5zVar.getClass();
        this.z = d5zVar;
        this.A = es00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.F1(bm50.a(this.A.b("", "", ((OtpData.PhoneMigration) B1()).d, ((OtpData.PhoneMigration) B1()).e, true)), new ss00(this, 0));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.z.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection) {
        return this.A.a(otpSelection, z1().b, (OtpData.PhoneMigration) B1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.goi0
    public final lyh<lk50<Unit>> O1(String str) {
        return b42.F1(bm50.a(this.A.b(str, z1().b, ((OtpData.PhoneMigration) B1()).d, ((OtpData.PhoneMigration) B1()).e, false)), new jsh(this, 1));
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.z.P0(z, v1bVar);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.z.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.z.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.z.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
