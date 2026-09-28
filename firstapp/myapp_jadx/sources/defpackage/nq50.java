package defpackage;

import android.os.SystemClock;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public abstract class nq50<T extends OtpData> extends b42<T> {
    public h5b A;
    public h5b B;
    public to50 C;
    public jvd0 D;
    public jvd0 E;
    public jvd0 F;
    public final ResourceUiText G;
    public final fq50 e;
    public final wwd0 f;
    public final v340 i;
    public final ku90<vo50> v;
    public final t340 w;
    public final ku90<UiText> y;
    public final t340 z;

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$handleEvent$4", f = "ReversedOTPViewModel.kt", l = {458}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ cp50 b;
        public final /* synthetic */ nq50<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, cp50 cp50Var, nq50 nq50Var) {
            super(2, v1bVar);
            this.b = cp50Var;
            this.c = nq50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0042  */
        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nc4 nc4Var;
            wwd0 wwd0Var;
            Object value;
            sq50 sq50Var;
            qd4.c cVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            nq50<T> nq50Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                OtpSelection otpSelection = ((cp50.m) this.b).a;
                if (otpSelection == OtpSelection.Bio) {
                    d5z d5zVarX1 = nq50Var.x1();
                    if (d5zVarX1 != null) {
                        this.a = 1;
                        obj = d5zVarX1.P0(true, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        nc4Var = null;
                    }
                    wwd0Var = nq50Var.f;
                    do {
                        value = wwd0Var.getValue();
                        sq50Var = (sq50) value;
                        if (nc4Var != null) {
                            cVar = nc4Var.b;
                        } else {
                            cVar = null;
                        }
                    } while (!wwd0Var.g(value, sq50.a(sq50Var, null, null, null, null, null, cVar, 63)));
                } else {
                    nq50Var.D = kzh.d(new g1i(nq50Var.Q1(otpSelection), new pq50(nq50Var, otpSelection, null)), o8i0.d(nq50Var));
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            nc4Var = (nc4) obj;
            wwd0Var = nq50Var.f;
            do {
                value = wwd0Var.getValue();
                sq50Var = (sq50) value;
                if (nc4Var != null) {
                    cVar = nc4Var.b;
                } else {
                    cVar = null;
                }
            } while (!wwd0Var.g(value, sq50.a(sq50Var, null, null, null, null, null, cVar, 63)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$handleEvent$5", f = "ReversedOTPViewModel.kt", l = {487}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ nq50<T> b;
        public final /* synthetic */ cp50 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, cp50 cp50Var, nq50 nq50Var) {
            super(2, v1bVar);
            this.b = nq50Var;
            this.c = cp50Var;
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
            Object objT;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                final nq50<T> nq50Var = this.b;
                d5z d5zVarX1 = nq50Var.x1();
                if (d5zVarX1 != null) {
                    qd4.c cVar = ((cp50.e) this.c).a;
                    j6c c = nq50Var.B1().getC();
                    cp50.g gVar = cp50.g.a;
                    rh10 rh10Var = new rh10(nq50Var, 1);
                    sh10 sh10Var = new sh10(nq50Var, 1);
                    Function1<? super wo50.b, Unit> function1 = new Function1() { // from class: oq50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object value;
                            wo50.b bVar = (wo50.b) obj2;
                            wwd0 wwd0Var = nq50Var.f;
                            do {
                                value = wwd0Var.getValue();
                            } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, bVar, null, 95)));
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    objT = d5zVarX1.t(cVar, c, gVar, rh10Var, sh10Var, function1, new c5z(0, d5zVarX1, d5z.class, "verifyUsingBiometric", "verifyUsingBiometric()Lkotlinx/coroutines/flow/Flow;", 0), this);
                    if (objT == y5bVar) {
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
            objT = obj;
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$startCheckAgainTimer$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
        public /* synthetic */ long a;
        public final /* synthetic */ nq50<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(nq50<T> nq50Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = nq50Var;
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
            final long j = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.T1(new Function1() { // from class: qq50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Object[] objArr = {Integer.valueOf(((int) j) / 1000)};
                    StringUiText stringUiText = vch0.a;
                    return d120.b.c((d120.b) obj2, new c120.a(new ResourceUiText(R.string.common_otp_verify__you_can_check_again_in_vnum_s, ay0.S(objArr))), uxs.DISABLE, 19);
                }
            });
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$startCheckAgainTimer$2", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ nq50<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nq50<T> nq50Var, v1b<? super d> v1bVar) {
            super(1, v1bVar);
            this.a = nq50Var;
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
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.T1(new rq50());
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$startOTPTimer$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
        public /* synthetic */ long a;
        public final /* synthetic */ nq50<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(nq50<T> nq50Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = nq50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.b, v1bVar);
            eVar.a = ((Number) obj).longValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
            return ((e) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object[] objArr;
            long j = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.f;
            do {
                value = wwd0Var.getValue();
                objArr = new Object[]{String.valueOf(j / 1000)};
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, new i6z.a(new ResourceUiText(R.string.register_login_int__countdown_sec, ay0.S(objArr))), null, null, null, 119)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$startOTPTimer$2", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ nq50<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(nq50<T> nq50Var, v1b<? super f> v1bVar) {
            super(1, v1bVar);
            this.a = nq50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new f(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((f) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.a.f;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, i6z.b.a, null, null, null, 119)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq50(fq50 fq50Var, rdd0 rdd0Var) {
        super(rdd0Var);
        fq50Var.getClass();
        rdd0Var.getClass();
        this.e = fq50Var;
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new sq50(WebSocketProtocol.PAYLOAD_SHORT, new ResourceUiText(R.string.common_otp_verify__send_otp)));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ku90<vo50> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
        ku90<UiText> ku90Var2 = new ku90<>();
        this.y = ku90Var2;
        this.z = e1i.a(ku90Var2);
        this.G = new ResourceUiText(R.string.common_otp_verify__otp_verified);
    }

    public static uf00 L1(String str) {
        char[] charArray = str.toCharArray();
        charArray.getClass();
        ArrayList arrayList = new ArrayList(6);
        int i = 0;
        while (i < 6) {
            Character chValueOf = (i < 0 || i >= charArray.length) ? null : Character.valueOf(charArray[i]);
            arrayList.add(Character.valueOf(chValueOf != null ? chValueOf.charValue() : ' '));
            i++;
        }
        return a4h.f(arrayList);
    }

    @Override // defpackage.b42
    public void E1() {
        wwd0 wwd0Var;
        Object value;
        sq50 sq50Var;
        ResourceUiText resourceUiText;
        ArrayList arrayList;
        uf00 uf00VarL1 = L1(M1().a);
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
            sq50Var = (sq50) value;
            Object[] objArr = {6, M1().b};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_otp_verify__reverse_otp_kindly_press_the_send_button_enter_digit_otp_tip, ay0.S(objArr));
            List<OtpSelection> list = z1().a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((OtpSelection) obj) != y1()) {
                    arrayList.add(obj);
                }
            }
        } while (!wwd0Var.g(value, sq50.a(sq50Var, resourceUiText, uf00VarL1, null, a4h.f(arrayList), null, null, 105)));
        S1();
        b42.J1(this, new mbf0(C1()));
    }

    public abstract lyh<lk50<Unit>> K1(String str);

    public final OTPResponse.Reverse M1() {
        OTPResponse oTPResponse = z1().c;
        if (!(oTPResponse instanceof OTPResponse.Reverse)) {
            oTPResponse = null;
        }
        OTPResponse.Reverse reverse = (OTPResponse.Reverse) oTPResponse;
        return reverse == null ? new OTPResponse.Reverse(0) : reverse;
    }

    /* JADX INFO: renamed from: N1 */
    public abstract ResourceUiText getI();

    public ResourceUiText O1() {
        return this.G;
    }

    public void P1(cp50 cp50Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        sq50 sq50Var;
        cp50Var.getClass();
        boolean zEquals = cp50Var.equals(cp50.p.a);
        fq50 fq50Var = this.e;
        wwd0 wwd0Var = this.f;
        ku90<vo50> ku90Var = this.v;
        if (zEquals) {
            ku90Var.a(new vo50.e(M1().b, M1().a));
            do {
                value4 = wwd0Var.getValue();
                sq50Var = (sq50) value4;
            } while (!wwd0Var.g(value4, sq50.a(sq50Var, null, null, null, null, new wo50.e(new d120.b(cp50.g.a, new c120.a(vch0.a), uxs.DISABLE, sq50Var.c)), null, 95)));
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - M1().c) + M1().d;
            to50 to50Var = this.C;
            if ((to50Var != null ? to50Var.a : 0L) < jElapsedRealtime) {
                this.C = to50Var != null ? new to50(jElapsedRealtime, to50Var.b) : null;
            }
            R1();
            jvd0 jvd0Var = this.F;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            et7 et7VarD = o8i0.d(this);
            String str = z1().b;
            String str2 = M1().a;
            jq50 jq50Var = new jq50(this, null);
            fq50Var.getClass();
            str.getClass();
            str2.getClass();
            this.F = ej5.c(et7VarD, null, null, new dq50(jq50Var, fq50Var, str, str2, null), 3);
            I1(new lbf0(0), k00.d);
            return;
        }
        cp50.g gVar = cp50.g.a;
        if (cp50Var.equals(gVar)) {
            jvd0 jvd0Var2 = this.D;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            jvd0 jvd0Var3 = this.F;
            if (jvd0Var3 != null) {
                jvd0Var3.cancel((CancellationException) null);
            }
            h5b h5bVar = this.B;
            if (h5bVar != null) {
                h5bVar.a();
            }
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, sq50.a((sq50) value3, null, null, null, null, new wo50.c(null), null, 95)));
            return;
        }
        if (cp50Var.equals(cp50.f.a)) {
            jvd0 jvd0Var4 = this.D;
            if (jvd0Var4 != null) {
                jvd0Var4.cancel((CancellationException) null);
            }
            jvd0 jvd0Var5 = this.F;
            if (jvd0Var5 != null) {
                jvd0Var5.cancel((CancellationException) null);
            }
            h5b h5bVar2 = this.B;
            if (h5bVar2 != null) {
                h5bVar2.a();
            }
            jvd0 jvd0Var6 = this.F;
            if (jvd0Var6 != null) {
                jvd0Var6.cancel((CancellationException) null);
            }
            h5b h5bVar3 = this.B;
            if (h5bVar3 != null) {
                h5bVar3.a();
            }
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, sq50.a((sq50) value2, null, null, null, null, new wo50.c(cp50.a.a), null, 95)));
            return;
        }
        if (cp50Var.equals(cp50.a.a)) {
            ku90Var.a(vo50.a.a);
            b42.J1(this, new kbf0(0));
            return;
        }
        if (cp50Var.equals(cp50.l.a)) {
            R1();
            jvd0 jvd0Var7 = this.E;
            if (jvd0Var7 != null) {
                jvd0Var7.cancel((CancellationException) null);
            }
            String str3 = z1().b;
            String str4 = M1().a;
            fq50Var.getClass();
            str3.getClass();
            str4.getClass();
            this.E = kzh.d(new g1i(bm50.a(new eq50(fq50Var.a.e(str3, str4), fq50Var)), new lq50(this, null)), o8i0.d(this));
            return;
        }
        if (cp50Var.equals(cp50.i.a)) {
            ku90Var.a(new vo50.b(B1()));
            return;
        }
        if (cp50Var.equals(cp50.j.a)) {
            S1();
            OtpSelection otpSelectionY1 = y1();
            this.D = kzh.d(new g1i(Q1(otpSelectionY1), new pq50(this, otpSelectionY1, null)), o8i0.d(this));
            return;
        }
        if (cp50Var instanceof cp50.m) {
            ej5.c(o8i0.d(this), null, null, new a(null, cp50Var, this), 3);
            b42.J1(this, new nbf0(((cp50.m) cp50Var).a.b));
            return;
        }
        if (cp50Var.equals(cp50.h.a)) {
            kzh.d(new g1i(K1(M1().a), new mq50(this, null)), o8i0.d(this));
            return;
        }
        if (cp50Var.equals(cp50.k.a)) {
            ku90Var.a(vo50.c.a);
            I1(new ebf0(0), k00.d);
            return;
        }
        if (cp50Var.equals(cp50.n.a)) {
            h5b h5bVar4 = this.A;
            if (h5bVar4 != null) {
                h5bVar4.c();
            }
            h5b h5bVar5 = this.B;
            if (h5bVar5 != null) {
                h5bVar5.c();
                return;
            }
            return;
        }
        if (cp50Var.equals(cp50.o.a)) {
            h5b h5bVar6 = this.A;
            if (h5bVar6 != null) {
                h5bVar6.b();
            }
            h5b h5bVar7 = this.B;
            if (h5bVar7 != null) {
                h5bVar7.b();
                return;
            }
            return;
        }
        if (cp50Var instanceof cp50.e) {
            ej5.c(o8i0.d(this), null, null, new b(null, cp50Var, this), 3);
            return;
        }
        if (cp50Var instanceof cp50.b) {
            d5z d5zVarX1 = x1();
            if (d5zVarX1 != null) {
                d5zVarX1.Y(((cp50.b) cp50Var).a.a, gVar, new iq50(this, 0));
                return;
            }
            return;
        }
        if (cp50Var.equals(cp50.c.a)) {
            d5z d5zVarX2 = x1();
            if (d5zVarX2 != null) {
                d5zVarX2.e1();
                return;
            }
            return;
        }
        if (!cp50Var.equals(cp50.d.a)) {
            uhc.a();
        } else {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, null, null, 63)));
        }
    }

    public abstract lyh<lk50<OTPResponse>> Q1(OtpSelection otpSelection);

    public final void R1() {
        h5b h5bVar = this.B;
        if (h5bVar != null) {
            h5bVar.a();
        }
        h5b h5bVar2 = new h5b(o8i0.d(this), 10000L, new c(this, null), new d(this, null));
        this.B = h5bVar2;
        h5bVar2.d();
    }

    public final void S1() {
        h5b h5bVar = this.A;
        if (h5bVar != null) {
            h5bVar.a();
        }
        h5b h5bVar2 = new h5b(o8i0.d(this), RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS, new e(this, null), new f(this, null));
        this.A = h5bVar2;
        h5bVar2.d();
    }

    public final void T1(Function1<? super d120.b, d120.b> function1) {
        d120.b bVarInvoke;
        wwd0 wwd0Var = this.f;
        wo50 wo50Var = ((sq50) wwd0Var.getValue()).f;
        if (!(wo50Var instanceof wo50.e)) {
            wo50Var = null;
        }
        wo50.e eVar = (wo50.e) wo50Var;
        if (eVar != null) {
            d120 d120Var = eVar.a;
            if (!(d120Var instanceof d120.b)) {
                d120Var = null;
            }
            d120.b bVar = (d120.b) d120Var;
            wo50.e eVar2 = (bVar == null || (bVarInvoke = function1.invoke(bVar)) == null) ? null : new wo50.e(bVarInvoke);
            if (eVar2 != null) {
                sq50 sq50VarA = sq50.a((sq50) wwd0Var.getValue(), null, null, null, null, eVar2, null, 95);
                wwd0Var.getClass();
                wwd0Var.k(null, sq50VarA);
            }
        }
    }
}
