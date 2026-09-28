package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p0g<T extends OtpData> extends b42<T> {
    public final wwd0 e;
    public final ku90<lwf> f;
    public h5b i;
    public jvd0 v;

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.email.EmailViewModel$handleEvent$12", f = "EmailViewModel.kt", l = {328}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ q5z b;
        public final /* synthetic */ p0g<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, p0g p0gVar, q5z q5zVar) {
            super(2, v1bVar);
            this.b = q5zVar;
            this.c = p0gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045  */
        /* JADX WARN: Code duplicated, block: B:21:0x0049  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nc4 nc4Var;
            Object objP0;
            wwd0 wwd0Var;
            Object value;
            e6z e6zVar;
            qd4.c cVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            p0g<T> p0gVar = this.c;
            if (i == 0) {
                uj50.b(obj);
                OtpSelection otpSelection = ((q5z.q) this.b).a;
                if (otpSelection == OtpSelection.Bio) {
                    d5z d5zVarX1 = p0gVar.x1();
                    if (d5zVarX1 != null) {
                        this.a = 1;
                        objP0 = d5zVarX1.P0(true, this);
                        if (objP0 == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        nc4Var = null;
                    }
                    wwd0Var = p0gVar.e;
                    do {
                        value = wwd0Var.getValue();
                        e6zVar = (e6z) value;
                        if (nc4Var != null) {
                            cVar = nc4Var.b;
                        } else {
                            cVar = null;
                        }
                    } while (!wwd0Var.g(value, e6z.a(e6zVar, null, null, null, null, null, null, null, null, null, cVar, false, 1535)));
                } else {
                    p0gVar.v = kzh.d(new g1i(p0gVar.M1(otpSelection), new t0g(p0gVar, otpSelection, null)), o8i0.d(p0gVar));
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objP0 = obj;
            nc4Var = (nc4) objP0;
            wwd0Var = p0gVar.e;
            do {
                value = wwd0Var.getValue();
                e6zVar = (e6z) value;
                if (nc4Var != null) {
                    cVar = nc4Var.b;
                } else {
                    cVar = null;
                }
            } while (!wwd0Var.g(value, e6z.a(e6zVar, null, null, null, null, null, null, null, null, null, cVar, false, 1535)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.email.EmailViewModel$handleEvent$13", f = "EmailViewModel.kt", l = {351}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ p0g<T> b;
        public final /* synthetic */ q5z c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, p0g p0gVar, q5z q5zVar) {
            super(2, v1bVar);
            this.b = p0gVar;
            this.c = q5zVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                final p0g<T> p0gVar = this.b;
                d5z d5zVarX1 = p0gVar.x1();
                if (d5zVarX1 != null) {
                    j6c c = p0gVar.B1().getC();
                    qd4.c cVar = ((q5z.e) this.c).a;
                    q5z.k kVar = new q5z.k(false, null);
                    q0g q0gVar = new q0g(p0gVar, 0);
                    ieb iebVar = new ieb(p0gVar, i2);
                    Function1 function1 = new Function1() { // from class: r0g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object value;
                            j7z.b bVar = (j7z.b) obj2;
                            wwd0 wwd0Var = p0gVar.e;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, bVar, null, null, null, null, false, 2015)));
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    obj = d5z.S(d5zVarX1, cVar, c, kVar, q0gVar, iebVar, function1, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.email.EmailViewModel$startCountDown$1", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
        public /* synthetic */ long a;
        public final /* synthetic */ p0g<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p0g<T> p0gVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = p0gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = ((Number) obj).longValue();
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
            return ((c) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object[] objArr;
            long j = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.e;
            do {
                value = wwd0Var.getValue();
                objArr = new Object[]{String.valueOf(j / 1000)};
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, new i6z.a(new ResourceUiText(R.string.register_login_int__countdown_sec, ay0.S(objArr))), null, null, null, null, null, null, false, 2039)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.email.EmailViewModel$startCountDown$2", f = "EmailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ p0g<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p0g<T> p0gVar, v1b<? super d> v1bVar) {
            super(1, v1bVar);
            this.a = p0gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new d(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((d) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.a.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, i6z.b.a, null, null, null, null, null, null, false, 2039)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0g(rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_otp_verify__verify_email);
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(d08.a.a);
        }
        this.e = xwd0.a(new e6z(resourceUiText, new hz00(a4h.f(arrayList), new gz00.b(0)), 2042));
        this.f = new ku90<>();
    }

    public static ResourceUiText K1(p0g p0gVar) {
        ResourceUiText resourceUiText;
        OTPResponse oTPResponse = p0gVar.z1().c;
        if (!(oTPResponse instanceof OTPResponse.OTP)) {
            oTPResponse = null;
        }
        OTPResponse.OTP otp = (OTPResponse.OTP) oTPResponse;
        if (otp == null) {
            otp = new OTPResponse.OTP(0);
        }
        Integer numValueOf = Integer.valueOf(otp.a);
        OTPResponse oTPResponse2 = p0gVar.z1().c;
        OTPResponse.OTP otp2 = (OTPResponse.OTP) (oTPResponse2 instanceof OTPResponse.OTP ? oTPResponse2 : null);
        if (otp2 == null) {
            otp2 = new OTPResponse.OTP(0);
        }
        if (otp2.a > 1) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_otp_verify__l_times);
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_otp_verify__l_time);
        }
        return new ResourceUiText(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one, ay0.S(new Object[]{numValueOf, resourceUiText}));
    }

    @Override // defpackage.b42
    public final void E1() {
        wwd0 wwd0Var;
        Object value;
        e6z e6zVar;
        ResourceUiText resourceUiTextK1;
        ArrayList arrayList;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            e6zVar = (e6z) value;
            resourceUiTextK1 = K1(this);
            List<OtpSelection> list = z1().a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((OtpSelection) obj) != y1()) {
                    arrayList.add(obj);
                }
            }
        } while (!wwd0Var.g(value, e6z.a(e6zVar, null, new ResourceUiText(R.string.common_otp_verify__we_have_sent_you_a_vnum_digit_code_to_email, ay0.S(new Object[0])), null, null, resourceUiTextK1, null, a4h.f(arrayList), y1(), afu.a(B1()), null, false, 1581)));
        N1();
        b42.J1(this, new mbf0(C1()));
    }

    public final void L1(q5z q5zVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        Object value10;
        e6z e6zVar;
        Object value11;
        e6z e6zVar2;
        hz00 hz00Var;
        uf00<d08> uf00Var;
        q5zVar.getClass();
        boolean z = q5zVar instanceof q5z.s;
        int i = 1;
        wwd0 wwd0Var = this.e;
        if (z) {
            do {
                value11 = wwd0Var.getValue();
                e6zVar2 = (e6z) value11;
                hz00Var = e6zVar2.c;
                uf00Var = ((q5z.s) q5zVar).a;
            } while (!wwd0Var.g(value11, e6z.a(e6zVar2, null, null, hz00.a(hz00Var, uf00Var, null, 2), null, null, null, null, null, null, null, false, 2043)));
            if (uf00Var == null || !uf00Var.isEmpty()) {
                Iterator<d08> it = uf00Var.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof d08.b)) {
                        return;
                    }
                }
            }
            kzh.d(new g1i(O1(CollectionsKt.a0(CollectionsKt.A0(((e6z) wwd0Var.getValue()).c.a), "", null, null, new xe7(i), 30)), new u0g(this, null)), o8i0.d(this));
            return;
        }
        if (q5zVar instanceof q5z.t) {
            do {
                value10 = wwd0Var.getValue();
                e6zVar = (e6z) value10;
            } while (!wwd0Var.g(value10, e6z.a(e6zVar, null, null, hz00.a(e6zVar.c, null, ((q5z.t) q5zVar).a, 1), null, null, null, null, null, null, null, false, 2043)));
            return;
        }
        if (q5zVar instanceof q5z.n) {
            h5b h5bVar = this.i;
            if (h5bVar != null) {
                h5bVar.b();
                return;
            }
            return;
        }
        if (q5zVar instanceof q5z.p) {
            h5b h5bVar2 = this.i;
            if (h5bVar2 != null) {
                h5bVar2.c();
                return;
            }
            return;
        }
        int i2 = 0;
        if (q5zVar instanceof q5z.k) {
            do {
                value9 = wwd0Var.getValue();
            } while (!wwd0Var.g(value9, e6z.a((e6z) value9, null, null, null, null, null, new j7z.c(((q5z.k) q5zVar).a ? new q5z.t(new gz00.b(0)) : null), null, null, null, null, false, 2015)));
            return;
        }
        if (q5zVar instanceof q5z.h) {
            do {
                value8 = wwd0Var.getValue();
            } while (!wwd0Var.g(value8, e6z.a((e6z) value8, null, null, null, null, null, new j7z.c(q5z.a.a), null, null, null, null, false, 2015)));
            return;
        }
        if (q5zVar instanceof q5z.i) {
            do {
                value7 = wwd0Var.getValue();
            } while (!wwd0Var.g(value7, e6z.a((e6z) value7, null, null, null, null, null, new j7z.c(null), null, null, null, null, false, 2015)));
            return;
        }
        if (q5zVar instanceof q5z.f) {
            jvd0 jvd0Var = this.v;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, e6z.a((e6z) value6, null, null, null, null, null, new j7z.c(null), null, null, null, null, false, 2015)));
            return;
        }
        if (q5zVar instanceof q5z.r) {
            N1();
            OtpSelection otpSelectionY1 = y1();
            this.v = kzh.d(new g1i(M1(otpSelectionY1), new t0g(this, otpSelectionY1, null)), o8i0.d(this));
            I1(new jbf0(0), k00.d);
            return;
        }
        if (q5zVar instanceof q5z.o) {
            do {
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, e6z.a((e6z) value5, null, null, null, null, null, null, null, null, null, null, true, 1023)));
            return;
        }
        if (q5zVar instanceof q5z.j) {
            do {
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, e6z.a((e6z) value4, null, null, null, null, null, null, null, null, null, null, false, 1023)));
            return;
        }
        boolean z2 = q5zVar instanceof q5z.a;
        ku90<lwf> ku90Var = this.f;
        if (z2) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, e6z.a((e6z) value3, null, null, null, null, null, null, null, null, null, null, false, 1023)));
            ku90Var.a(lwf.a.a);
            b42.J1(this, new kbf0(0));
            return;
        }
        if (q5zVar instanceof q5z.m) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, e6z.a((e6z) value2, null, null, null, null, null, null, null, null, null, null, false, 1023)));
            ku90Var.a(lwf.e.a);
            b42.J1(this, new kbf0(0));
            return;
        }
        if (q5zVar instanceof q5z.q) {
            ej5.c(o8i0.d(this), null, null, new a(null, this, q5zVar), 3);
            b42.J1(this, new nbf0(((q5z.q) q5zVar).a.b));
            return;
        }
        if (q5zVar instanceof q5z.g) {
            ku90Var.a(lwf.c.a);
            I1(new ebf0(0), k00.d);
            return;
        }
        if (q5zVar.equals(q5z.l.a)) {
            ku90Var.a(new lwf.b(B1()));
            return;
        }
        if (q5zVar instanceof q5z.e) {
            ej5.c(o8i0.d(this), null, null, new b(null, this, q5zVar), 3);
            return;
        }
        if (q5zVar instanceof q5z.b) {
            d5z d5zVarX1 = x1();
            if (d5zVarX1 != null) {
                d5zVarX1.K0(((q5z.b) q5zVar).a.a, new q5z.k(false, null), new o0g(this, i2));
                return;
            }
            return;
        }
        if (q5zVar.equals(q5z.c.a)) {
            d5z d5zVarX2 = x1();
            if (d5zVarX2 != null) {
                d5zVarX2.e1();
                return;
            }
            return;
        }
        if (!q5zVar.equals(q5z.d.a)) {
            uhc.a();
        } else {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, null, null, null, null, null, false, 1535)));
        }
    }

    public abstract lyh<lk50<OTPResponse>> M1(OtpSelection otpSelection);

    public final void N1() {
        h5b h5bVar = this.i;
        if (h5bVar != null) {
            h5bVar.a();
        }
        h5b h5bVar2 = new h5b(o8i0.d(this), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, new c(this, null), new d(this, null));
        this.i = h5bVar2;
        h5bVar2.d();
    }

    public abstract lyh<lk50<Unit>> O1(String str);
}
