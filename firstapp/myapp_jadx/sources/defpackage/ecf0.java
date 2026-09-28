package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ecf0<T extends OtpData> extends b42<T> {
    public final wwd0 e;
    public final v340 f;
    public final ku90<maf0> i;
    public final t340 v;
    public h5b w;
    public jvd0 y;

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.telegram.TelegramViewModel$handleEvent$12", f = "TelegramViewModel.kt", l = {313}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ q5z b;
        public final /* synthetic */ ecf0<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, q5z q5zVar, ecf0 ecf0Var) {
            super(2, v1bVar);
            this.b = q5zVar;
            this.c = ecf0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0046  */
        /* JADX WARN: Code duplicated, block: B:21:0x004b  */
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
            q5z q5zVar = this.b;
            ecf0<T> ecf0Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                OtpSelection otpSelection = ((q5z.q) q5zVar).a;
                if (otpSelection == OtpSelection.Bio) {
                    d5z d5zVarX1 = ecf0Var.x1();
                    if (d5zVarX1 != null) {
                        this.a = 1;
                        objP0 = d5zVarX1.P0(true, this);
                        if (objP0 == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        nc4Var = null;
                    }
                    wwd0Var = ecf0Var.e;
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
                    ecf0Var.y = kzh.d(new g1i(ecf0Var.N1(otpSelection), new icf0(ecf0Var, otpSelection, null)), o8i0.d(ecf0Var));
                }
                b42.J1(ecf0Var, new nbf0(((q5z.q) q5zVar).a.b));
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objP0 = obj;
            nc4Var = (nc4) objP0;
            wwd0Var = ecf0Var.e;
            do {
                value = wwd0Var.getValue();
                e6zVar = (e6z) value;
                if (nc4Var != null) {
                    cVar = nc4Var.b;
                } else {
                    cVar = null;
                }
            } while (!wwd0Var.g(value, e6z.a(e6zVar, null, null, null, null, null, null, null, null, null, cVar, false, 1535)));
            b42.J1(ecf0Var, new nbf0(((q5z.q) q5zVar).a.b));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.telegram.TelegramViewModel$handleEvent$13", f = "TelegramViewModel.kt", l = {336}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ecf0<T> b;
        public final /* synthetic */ q5z c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, q5z q5zVar, ecf0 ecf0Var) {
            super(2, v1bVar);
            this.b = ecf0Var;
            this.c = q5zVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                final ecf0<T> ecf0Var = this.b;
                d5z d5zVarX1 = ecf0Var.x1();
                if (d5zVarX1 != null) {
                    j6c c = ecf0Var.B1().getC();
                    qd4.c cVar = ((q5z.e) this.c).a;
                    q5z.k kVar = new q5z.k(false, null);
                    Function0 function0 = new Function0() { // from class: fcf0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object value;
                            wwd0 wwd0Var = ecf0Var.e;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
                            return Unit.a;
                        }
                    };
                    Function0 function1 = new Function0() { // from class: gcf0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object value;
                            wwd0 wwd0Var = ecf0Var.e;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, new j7z.c(q5z.l.a), null, null, null, null, false, 2015)));
                            return Unit.a;
                        }
                    };
                    vrk vrkVar = new vrk(ecf0Var, 2);
                    this.a = 1;
                    obj = d5z.S(d5zVarX1, cVar, c, kVar, function0, function1, vrkVar, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecf0(rdd0 rdd0Var) {
        super(rdd0Var);
        rdd0Var.getClass();
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.identity_verification__verify_mobile_title);
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(d08.a.a);
        }
        wwd0 wwd0VarA = xwd0.a(new e6z(resourceUiText, new hz00(a4h.f(arrayList), new gz00.b(0)), 2042));
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        ku90<maf0> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
    }

    @Override // defpackage.b42
    public void E1() {
        wwd0 wwd0Var;
        Object value;
        e6z e6zVar;
        ResourceUiText resourceUiTextK1;
        UiText uiTextM1;
        ArrayList arrayList;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            e6zVar = (e6z) value;
            resourceUiTextK1 = K1(R.string.common_otp_verify__you_have_vnum_vtimetext_left_to_request_another_one);
            uiTextM1 = M1();
            List<OtpSelection> list = z1().a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((OtpSelection) obj) != y1()) {
                    arrayList.add(obj);
                }
            }
        } while (!wwd0Var.g(value, e6z.a(e6zVar, null, uiTextM1, null, null, resourceUiTextK1, null, a4h.f(arrayList), y1(), afu.a(B1()), null, false, 1581)));
        O1();
        b42.J1(this, new mbf0(C1()));
    }

    public ResourceUiText K1(int i) {
        ResourceUiText resourceUiText;
        OTPResponse oTPResponse = z1().c;
        if (!(oTPResponse instanceof OTPResponse.OTP)) {
            oTPResponse = null;
        }
        OTPResponse.OTP otp = (OTPResponse.OTP) oTPResponse;
        if (otp == null) {
            otp = new OTPResponse.OTP(0);
        }
        Integer numValueOf = Integer.valueOf(otp.a);
        OTPResponse oTPResponse2 = z1().c;
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
        return new ResourceUiText(i, ay0.S(new Object[]{numValueOf, resourceUiText}));
    }

    public void L1(q5z q5zVar) {
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
        int i = 2;
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
            kzh.d(new g1i(P1(CollectionsKt.a0(CollectionsKt.A0(((e6z) this.f.a.getValue()).c.a), "", null, null, new dcf0(), 30)), new lcf0(this, null)), o8i0.d(this));
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
            h5b h5bVar = this.w;
            if (h5bVar != null) {
                h5bVar.b();
                return;
            }
            return;
        }
        if (q5zVar instanceof q5z.p) {
            h5b h5bVar2 = this.w;
            if (h5bVar2 != null) {
                h5bVar2.c();
                return;
            }
            return;
        }
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
            jvd0 jvd0Var = this.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            do {
                value6 = wwd0Var.getValue();
            } while (!wwd0Var.g(value6, e6z.a((e6z) value6, null, null, null, null, null, new j7z.c(null), null, null, null, null, false, 2015)));
            return;
        }
        if (q5zVar instanceof q5z.r) {
            O1();
            OtpSelection otpSelectionY1 = y1();
            this.y = kzh.d(new g1i(N1(otpSelectionY1), new icf0(this, otpSelectionY1, null)), o8i0.d(this));
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
        ku90<maf0> ku90Var = this.i;
        if (z2) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, e6z.a((e6z) value3, null, null, null, null, null, null, null, null, null, null, false, 1023)));
            ku90Var.a(maf0.a.a);
            b42.J1(this, new kbf0(0));
            return;
        }
        if (q5zVar instanceof q5z.m) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, e6z.a((e6z) value2, null, null, null, null, null, null, null, null, null, null, false, 1023)));
            ku90Var.a(maf0.e.a);
            b42.J1(this, new kbf0(0));
            return;
        }
        if (q5zVar instanceof q5z.q) {
            ej5.c(o8i0.d(this), null, null, new a(null, q5zVar, this), 3);
            return;
        }
        if (q5zVar instanceof q5z.g) {
            ku90Var.a(maf0.c.a);
            I1(new ebf0(0), k00.d);
            return;
        }
        if (q5zVar.equals(q5z.l.a)) {
            ku90Var.a(new maf0.b(B1()));
            return;
        }
        if (q5zVar instanceof q5z.e) {
            ej5.c(o8i0.d(this), null, null, new b(null, q5zVar, this), 3);
            return;
        }
        if (q5zVar instanceof q5z.b) {
            d5z d5zVarX1 = x1();
            if (d5zVarX1 != null) {
                d5zVarX1.K0(((q5z.b) q5zVar).a.a, new q5z.k(false, null), new seb(this, i));
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

    public UiText M1() {
        Object[] objArr = {6, B1().getA(), B1().getB()};
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_otp_verify__we_have_sent_you_a_vnum_digit_code_to_vcountrycode_vphone_via_telegram, ay0.S(objArr));
    }

    public abstract lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection);

    public final void O1() {
        h5b h5bVar = this.w;
        if (h5bVar != null) {
            h5bVar.a();
        }
        h5b h5bVar2 = new h5b(o8i0.d(this), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, new jcf0(this, null), new kcf0(this, null));
        this.w = h5bVar2;
        h5bVar2.d();
    }

    public abstract lyh<lk50<Unit>> P1(String str);
}
