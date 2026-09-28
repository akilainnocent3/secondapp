package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c7z<T extends OtpData> extends b42<T> {
    public final v8w e;
    public final wwd0 f;
    public final v340 i;
    public final ku90<l6z> v;
    public final t340 w;
    public jvd0 y;
    public boolean z;

    @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$handleEvent$10", f = "OtpSelectorViewModel.kt", l = {399}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c7z<T> b;
        public final /* synthetic */ o6z c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, o6z o6zVar, c7z c7zVar) {
            super(2, v1bVar);
            this.b = c7zVar;
            this.c = o6zVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                final c7z<T> c7zVar = this.b;
                d5z d5zVarX1 = c7zVar.x1();
                if (d5zVarX1 != null) {
                    qd4.c cVar = ((o6z.f) this.c).a;
                    j6c c = c7zVar.B1().getC();
                    o6z.k kVar = o6z.k.a;
                    dh7 dh7Var = new dh7(c7zVar, 2);
                    eh7 eh7Var = new eh7(c7zVar, i2);
                    Function1 function1 = new Function1() { // from class: b7z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object value;
                            Object objA;
                            j7z.b bVar = (j7z.b) obj2;
                            wwd0 wwd0Var = c7zVar.f;
                            do {
                                value = wwd0Var.getValue();
                                objA = (z6z) value;
                                z6z.a aVar = (z6z.a) (!(objA instanceof z6z.a) ? null : objA);
                                if (aVar != null) {
                                    objA = z6z.a.a(aVar, bVar, null, false, 1019);
                                }
                            } while (!wwd0Var.g(value, objA));
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    obj = d5z.S(d5zVarX1, cVar, c, kVar, dh7Var, eh7Var, function1, this);
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

    @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$handleEvent$6", f = "OtpSelectorViewModel.kt", l = {351}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o6z b;
        public final /* synthetic */ c7z<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, o6z o6zVar, c7z c7zVar) {
            super(2, v1bVar);
            this.b = o6zVar;
            this.c = c7zVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003c  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nc4 nc4Var;
            z6z.a aVarL1;
            y5b y5bVar = y5b.a;
            int i = this.a;
            c7z<T> c7zVar = this.c;
            if (i == 0) {
                uj50.b(obj);
                OtpSelection otpSelection = ((o6z.i) this.b).a;
                if (otpSelection == OtpSelection.Bio) {
                    d5z d5zVarX1 = c7zVar.x1();
                    if (d5zVarX1 != null) {
                        this.a = 1;
                        obj = d5zVarX1.P0(true, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        nc4Var = null;
                    }
                    aVarL1 = c7zVar.L1();
                    if (aVarL1 != null) {
                        z6z.a aVarA = z6z.a.a(aVarL1, null, nc4Var, false, 767);
                        wwd0 wwd0Var = c7zVar.f;
                        wwd0Var.getClass();
                        wwd0Var.k(null, aVarA);
                    }
                } else {
                    c7zVar.y = kzh.d(new g1i(c7zVar.U1(otpSelection), new i7z(c7zVar, otpSelection, null)), o8i0.d(c7zVar));
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            nc4Var = (nc4) obj;
            aVarL1 = c7zVar.L1();
            if (aVarL1 != null) {
                z6z.a aVarA2 = z6z.a.a(aVarL1, null, nc4Var, false, 767);
                wwd0 wwd0Var2 = c7zVar.f;
                wwd0Var2.getClass();
                wwd0Var2.k(null, aVarA2);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7z(v8w v8wVar, rdd0 rdd0Var) {
        super(rdd0Var);
        v8wVar.getClass();
        rdd0Var.getClass();
        this.e = v8wVar;
        wwd0 wwd0VarA = xwd0.a(z6z.d.a);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        ku90<l6z> ku90Var = new ku90<>();
        this.v = ku90Var;
        this.w = e1i.a(ku90Var);
    }

    @Override // defpackage.b42
    public final void E1() {
        ej5.c(o8i0.d(this), null, null, new g7z(this, null), 3);
    }

    public final void K1(OtpSelection otpSelection, OTPResponse oTPResponse, UiText uiText) {
        otpSelection.getClass();
        oTPResponse.getClass();
        this.c = OTPInternalData.a(z1(), null, null, oTPResponse, 3);
        this.v.a(new l6z.c(otpSelection, z1(), uiText));
    }

    public final z6z.a L1() {
        Object value = this.f.getValue();
        if (!(value instanceof z6z.a)) {
            value = null;
        }
        return (z6z.a) value;
    }

    public String M1() {
        return xib0.OTP_SELECTION;
    }

    public UiText N1() {
        return vch0.c(R.string.common_otp_verify__please_choose_one_way_to_receive_your_vnum_digit_code, 6);
    }

    public UiText O1() {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.common_otp_verify__verify_mobile_number);
    }

    public abstract lyh<String> P1();

    public Boolean Q1(uf00 uf00Var, z6z.a aVar) {
        return Boolean.FALSE;
    }

    public void R1(o6z o6zVar) {
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object value3;
        Object objA3;
        Object value4;
        Object objA4;
        Object value5;
        Object objA5;
        boolean z = o6zVar instanceof o6z.o;
        ku90<l6z> ku90Var = this.v;
        wwd0 wwd0Var = this.f;
        if (z) {
            if (!(wwd0Var.getValue() instanceof z6z.a)) {
                ku90Var.a(l6z.d.a);
                return;
            }
            do {
                value5 = wwd0Var.getValue();
                objA5 = (z6z) value5;
                z6z.a aVar = (z6z.a) (!(objA5 instanceof z6z.a) ? null : objA5);
                if (aVar != null) {
                    objA5 = z6z.a.a(aVar, null, null, true, 511);
                }
            } while (!wwd0Var.g(value5, objA5));
            return;
        }
        if (o6zVar instanceof o6z.l) {
            do {
                value4 = wwd0Var.getValue();
                objA4 = (z6z) value4;
                z6z.a aVar2 = (z6z.a) (!(objA4 instanceof z6z.a) ? null : objA4);
                if (aVar2 != null) {
                    objA4 = z6z.a.a(aVar2, null, null, false, 511);
                }
            } while (!wwd0Var.g(value4, objA4));
            return;
        }
        if (o6zVar instanceof o6z.j) {
            do {
                value3 = wwd0Var.getValue();
                objA3 = (z6z) value3;
                z6z.a aVar3 = (z6z.a) (!(objA3 instanceof z6z.a) ? null : objA3);
                if (aVar3 != null) {
                    objA3 = z6z.a.a(aVar3, null, null, false, 511);
                }
            } while (!wwd0Var.g(value3, objA3));
            ku90Var.a(l6z.d.a);
            return;
        }
        if (o6zVar instanceof o6z.b) {
            I1(new p7z("otp options"), k00.d);
            do {
                value2 = wwd0Var.getValue();
                objA2 = (z6z) value2;
                z6z.a aVar4 = (z6z.a) (!(objA2 instanceof z6z.a) ? null : objA2);
                if (aVar4 != null) {
                    objA2 = z6z.a.a(aVar4, null, null, false, 511);
                }
            } while (!wwd0Var.g(value2, objA2));
            ku90Var.a(l6z.a.a);
            Object value6 = wwd0Var.getValue();
            z6z.a aVar5 = (z6z.a) (value6 instanceof z6z.a ? value6 : null);
            if (!this.z) {
                b42.J1(this, new dbf0(0));
                return;
            } else if (aVar5 == null || !aVar5.g) {
                b42.J1(this, new pbf0(0));
                return;
            } else {
                b42.J1(this, new dbf0(0));
                return;
            }
        }
        if (o6zVar instanceof o6z.g) {
            z6z.a aVarL1 = L1();
            if (aVarL1 != null) {
                z6z.a aVarA = z6z.a.a(aVarL1, new j7z.c(null), null, false, 1019);
                wwd0Var.getClass();
                wwd0Var.k(null, aVarA);
            }
            jvd0 jvd0Var = this.y;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.y = null;
            return;
        }
        if (o6zVar instanceof o6z.i) {
            OtpSelection otpSelection = ((o6z.i) o6zVar).a;
            b42.J1(this, new ibf0(otpSelection.b));
            if (this.z && otpSelection == OtpSelection.TELEGRAM) {
                b42.J1(this, new obf0(0));
            }
            ej5.c(o8i0.d(this), null, null, new b(null, o6zVar, this), 3);
            return;
        }
        if (o6zVar instanceof o6z.m) {
            z6z.a aVarL2 = L1();
            if (aVarL2 != null) {
                z6z.a aVarA2 = z6z.a.a(aVarL2, new j7z.c(null), null, false, 1019);
                wwd0Var.getClass();
                wwd0Var.k(null, aVarA2);
                return;
            }
            return;
        }
        if (o6zVar.equals(o6z.k.a)) {
            z6z.c cVar = new z6z.c(o6z.b.a);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            return;
        }
        if (o6zVar.equals(o6z.n.a)) {
            ku90Var.a(l6z.b.a);
            return;
        }
        if (o6zVar.equals(o6z.h.a)) {
            do {
                value = wwd0Var.getValue();
                objA = (z6z) value;
                z6z.a aVar6 = (z6z.a) (!(objA instanceof z6z.a) ? null : objA);
                if (aVar6 != null) {
                    objA = z6z.a.a(aVar6, null, null, false, 959);
                }
            } while (!wwd0Var.g(value, objA));
            b42.J1(this, new gbf0(0));
            b42.J1(this, new tbf0(ubf0.TgUser, B1().getC()));
            return;
        }
        if (o6zVar.equals(o6z.a.a)) {
            ku90Var.a(new l6z.e(B1()));
            return;
        }
        if (o6zVar.equals(o6z.e.a)) {
            z6z.a aVarL3 = L1();
            if (aVarL3 != null) {
                z6z.a aVarA3 = z6z.a.a(aVarL3, null, null, false, 767);
                wwd0Var.getClass();
                wwd0Var.k(null, aVarA3);
                return;
            }
            return;
        }
        if (o6zVar instanceof o6z.f) {
            ej5.c(o8i0.d(this), null, null, new a(null, o6zVar, this), 3);
            return;
        }
        if (o6zVar instanceof o6z.c) {
            d5z d5zVarX1 = x1();
            if (d5zVarX1 != null) {
                d5zVarX1.K0(((o6z.c) o6zVar).a.a, o6z.m.a, new p3g(this, 2));
                return;
            }
            return;
        }
        if (!o6zVar.equals(o6z.d.a)) {
            uhc.a();
            return;
        }
        d5z d5zVarX2 = x1();
        if (d5zVarX2 != null) {
            d5zVarX2.e1();
        }
    }

    public final s78 S1() {
        return new s78(P1(), new a7z(this.e.c(B1().getB(), B1().getA(), StringsKt.a0(B1().getC().a, "android_")), this), new h7z(3, null));
    }

    public void T1(UiText uiText) {
        uiText.getClass();
        z6z.b bVar = new z6z.b(uiText);
        wwd0 wwd0Var = this.f;
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
    }

    public abstract lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection);
}
