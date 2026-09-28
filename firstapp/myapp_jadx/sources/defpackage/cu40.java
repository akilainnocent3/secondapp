package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterOtpSelectorViewModel$autoLaunch$1", f = "RegisterOtpSelectorViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cu40 extends tje0 implements Function2<lk50<? extends OTPResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ du40 b;
    public final /* synthetic */ OtpSelection c;
    public final /* synthetic */ UiText d;
    public final /* synthetic */ z6z.a e;

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.register.RegisterOtpSelectorViewModel$autoLaunch$1$1", f = "RegisterOtpSelectorViewModel.kt", l = {144}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ du40 b;
        public final /* synthetic */ z6z.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(du40 du40Var, z6z.a aVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = du40Var;
            this.c = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            OtpSelection otpSelection = OtpSelection.SMS;
            ResourceUiText resourceUiText = du40.E;
            du40 du40Var = this.b;
            kzh.d(new g1i(du40Var.U1(otpSelection), new cu40(du40Var, otpSelection, resourceUiText, this.c, null)), o8i0.d(du40Var));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu40(du40 du40Var, OtpSelection otpSelection, UiText uiText, z6z.a aVar, v1b<? super cu40> v1bVar) {
        super(2, v1bVar);
        this.b = du40Var;
        this.c = otpSelection;
        this.d = uiText;
        this.e = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cu40 cu40Var = new cu40(this.b, this.c, this.d, this.e, v1bVar);
        cu40Var.a = obj;
        return cu40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OTPResponse> lk50Var, v1b<? super Unit> v1bVar) {
        return ((cu40) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final du40 du40Var = this.b;
        wwd0 wwd0Var = du40Var.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            Unit unit = Unit.a;
        } else {
            boolean z = lk50Var instanceof lk50.c;
            z6z.a aVar = this.e;
            OtpSelection otpSelection = this.c;
            if (z) {
                OTPResponse oTPResponse = (OTPResponse) ((lk50.c) lk50Var).a;
                ResourceUiText resourceUiText = du40.E;
                du40Var.K1(otpSelection, oTPResponse, this.d);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                lk50.a aVar2 = (lk50.a) lk50Var;
                ResourceUiText resourceUiText2 = du40.E;
                if (otpSelection != OtpSelection.TELEGRAM) {
                    Integer numG = bm50.g(aVar2);
                    du40Var.I1(new m7z(7, null, null, otpSelection.b, m7z.a.a(numG), numG), k00.c);
                    z6z.a aVarA = z6z.a.a(aVar, b42.A1(du40Var, aVar2, new Function1() { // from class: bu40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return du40Var.z1().a.size() <= 1 ? o6z.b.a : o6z.m.a;
                        }
                    }), null, false, 1019);
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVarA);
                } else {
                    if (CollectionsKt.M(du40.F, bm50.g(aVar2)) && du40Var.z1().a.contains(OtpSelection.SMS)) {
                        ej5.c(o8i0.d(du40Var), null, null, new a(du40Var, aVar, null), 3);
                    } else {
                        Integer numG2 = bm50.g(aVar2);
                        du40Var.I1(new m7z(7, null, null, otpSelection.b, m7z.a.a(numG2), numG2), k00.c);
                        z6z.a aVarA2 = z6z.a.a(aVar, b42.A1(du40Var, aVar2, new Function1() { // from class: bu40
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return du40Var.z1().a.size() <= 1 ? o6z.b.a : o6z.m.a;
                            }
                        }), null, false, 1019);
                        wwd0Var.getClass();
                        wwd0Var.k(null, aVarA2);
                    }
                }
            }
        }
        return Unit.a;
    }
}
