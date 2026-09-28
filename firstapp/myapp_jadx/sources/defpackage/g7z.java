package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.model.AuthenticationMethodData;
import com.sporty.android.platform.features.newotp.model.OtpAuthenticationData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$init$1", f = "OtpSelectorViewModel.kt", l = {77, 86}, m = "invokeSuspend", v = 2)
public final class g7z extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c7z<OtpData> b;

    public static final /* synthetic */ class a extends saj implements Function1<lk50<? extends AuthenticationMethodData>, Unit> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends AuthenticationMethodData> lk50Var) {
            lk50<? extends AuthenticationMethodData> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            c7z c7zVar = (c7z) this.receiver;
            wwd0 wwd0Var = c7zVar.f;
            if (lk50Var2 instanceof lk50.b) {
                wwd0Var.setValue(z6z.d.a);
            } else if (lk50Var2 instanceof lk50.c) {
                AuthenticationMethodData authenticationMethodData = (AuthenticationMethodData) ((lk50.c) lk50Var2).a;
                if (authenticationMethodData.getAccountVerificationResult() != null && (authenticationMethodData.getAccountVerificationResult() instanceof lk50.c)) {
                    z6z.c cVar = new z6z.c(o6z.a.a);
                    wwd0Var.getClass();
                    wwd0Var.k(null, cVar);
                } else if (authenticationMethodData.getOtpAuthenticationData() != null) {
                    ej5.c(o8i0.d(c7zVar), null, null, new d7z(authenticationMethodData.getOtpAuthenticationData(), c7zVar, null), 3);
                } else if (Intrinsics.g(authenticationMethodData.getAccountVerificationResult(), lk50.b.a)) {
                    wwd0Var.setValue(z6z.d.a);
                } else {
                    StringUiText stringUiText = vch0.a;
                    z6z.b bVar = new z6z.b(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you));
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar);
                }
            } else {
                if (!(lk50Var2 instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                z6z.b bVar2 = new z6z.b(((lk50.a) lk50Var2).b);
                wwd0Var.getClass();
                wwd0Var.k(null, bVar2);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<AuthenticationMethodData> {
        public final /* synthetic */ s78 a;

        @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$init$1$invokeSuspend$lambda$0$$inlined$map$1", f = "OtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: g7z$b$b, reason: collision with other inner class name */
        public static final class C0594b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: g7z$b$b$a */
            @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$init$1$invokeSuspend$lambda$0$$inlined$map$1$2", f = "OtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0594b.this.emit(null, this);
                }
            }

            public C0594b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    AuthenticationMethodData authenticationMethodData = new AuthenticationMethodData((OtpAuthenticationData) obj, null);
                    aVar.b = 1;
                    if (this.a.emit(authenticationMethodData, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public b(s78 s78Var) {
            this.a = s78Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super AuthenticationMethodData> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                C0594b c0594b = new C0594b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0594b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7z(c7z<OtpData> c7zVar, v1b<? super g7z> v1bVar) {
        super(2, v1bVar);
        this.b = c7zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g7z(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g7z) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (((defpackage.nxg0) r6).c1(r1, r4, r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (defpackage.bm50.a(r6.S1()).collect(new defpackage.e7z(r6), r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L14:
            defpackage.uj50.b(r12)
            goto L56
        L18:
            defpackage.uj50.b(r12)
            c7z<com.sporty.android.platform.features.newotp.util.OtpData> r6 = r11.b
            boolean r12 = r6 instanceof defpackage.nxg0
            if (r12 == 0) goto L40
            r12 = r6
            nxg0 r12 = (defpackage.nxg0) r12
            f7z r1 = new f7z
            r2 = 0
            r1.<init>(r6, r2)
            g7z$a r4 = new g7z$a
            java.lang.String r9 = "processTrustedDeviceAuthResults(Lcom/sporty/android/common/network/data/Results;)V"
            r10 = 0
            r5 = 1
            java.lang.Class<c7z> r7 = defpackage.c7z.class
            java.lang.String r8 = "processTrustedDeviceAuthResults"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.a = r3
            java.lang.Object r11 = r12.c1(r1, r4, r11)
            if (r11 != r0) goto L56
            goto L55
        L40:
            r11.a = r2
            s78 r12 = r6.S1()
            yzh r12 = defpackage.bm50.a(r12)
            e7z r1 = new e7z
            r1.<init>(r6)
            java.lang.Object r11 = r12.collect(r1, r11)
            if (r11 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
