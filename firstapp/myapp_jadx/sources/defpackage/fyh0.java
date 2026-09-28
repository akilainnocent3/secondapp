package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.account.mfa.Verify2FAFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mfa.Verify2FAFragment$collectMFAEvent$1", f = "Verify2FAFragment.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class fyh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Verify2FAFragment b;

    public static final class a<T> implements myh {
        public final /* synthetic */ Verify2FAFragment a;

        public a(Verify2FAFragment verify2FAFragment) {
            this.a = verify2FAFragment;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            fcu fcuVar = (fcu) obj;
            int iOrdinal = fcuVar.ordinal();
            final Verify2FAFragment verify2FAFragment = this.a;
            switch (iOrdinal) {
                case 0:
                    tyi tyiVar = verify2FAFragment.B;
                    if (tyiVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    tyiVar.i.a(60);
                    verify2FAFragment.q0();
                    break;
                    break;
                case 1:
                    zyf0.c(0, sn5.d(verify2FAFragment, R.string.common_otp_verify__code_sent, new Object[0]));
                    tyi tyiVar2 = verify2FAFragment.B;
                    if (tyiVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    tyiVar2.i.a(60);
                    verify2FAFragment.q0();
                    break;
                    break;
                case 2:
                    String strD = sn5.d(verify2FAFragment, R.string.page_withdraw__account_limit, new Object[0]);
                    Context contextRequireContext = verify2FAFragment.requireContext();
                    contextRequireContext.getClass();
                    verify2FAFragment.o0(strD, fcuVar.a.g(contextRequireContext), null, new cyh0(verify2FAFragment));
                    break;
                case 3:
                    verify2FAFragment.o0(sn5.d(verify2FAFragment, R.string.component_bvn__verification_failed, new Object[0]), sn5.d(verify2FAFragment, R.string.common_otp_verify__incorrect_code_desc, new Object[0]), null, new byh0(verify2FAFragment));
                    break;
                case 4:
                    e eVarA = rvi.a(verify2FAFragment);
                    FragmentManager supportFragmentManager = eVarA != null ? eVarA.getSupportFragmentManager() : null;
                    if (supportFragmentManager != null) {
                        String strD2 = sn5.d(verify2FAFragment, R.string.page_login__rate_limit_exceeded_please_try_later_or_contact_customer_service, new Object[0]);
                        String strD3 = sn5.d(verify2FAFragment, R.string.common_functions__ok, new Object[0]);
                        String strD4 = sn5.d(verify2FAFragment, R.string.common_functions__live_chat, new Object[0]);
                        String strD5 = sn5.d(verify2FAFragment, R.string.component_bvn__verification_failed, new Object[0]);
                        wie.b bVar = new wie.b() { // from class: zxh0
                            @Override // wie.b
                            public final void b() {
                                verify2FAFragment.n0();
                            }
                        };
                        wie.a aVar = new wie.a() { // from class: ayh0
                            @Override // wie.a
                            public final void d() {
                                Verify2FAFragment verify2FAFragment2 = verify2FAFragment;
                                if (verify2FAFragment2.getContext() != null) {
                                    d0n d0nVar = verify2FAFragment2.F;
                                    if (d0nVar == null) {
                                        Intrinsics.n("utils");
                                        throw null;
                                    }
                                    Context contextRequireContext2 = verify2FAFragment2.requireContext();
                                    contextRequireContext2.getClass();
                                    d0nVar.b(contextRequireContext2, snb0.TWO_FA);
                                }
                                e eVarRequireActivity = verify2FAFragment2.requireActivity();
                                eVarRequireActivity.getClass();
                                eVarRequireActivity.getOnBackPressedDispatcher().d();
                            }
                        };
                        wie wieVar = new wie();
                        wieVar.a = strD2;
                        wieVar.c = strD4;
                        wieVar.b = strD3;
                        wieVar.f = true;
                        wieVar.e = true;
                        wieVar.w = aVar;
                        wieVar.v = bVar;
                        wieVar.i = true;
                        wieVar.d = strD5;
                        wieVar.z = R.color.text_type1_secondary;
                        wieVar.y = R.color.brand_secondary;
                        wieVar.A = R.color.text_type1_primary;
                        wieVar.B = 0;
                        wieVar.C = 1;
                        wieVar.D = true;
                        wieVar.E = true;
                        wieVar.F = false;
                        wieVar.show(supportFragmentManager, "account_limit_dialog");
                    }
                    break;
                case 5:
                    tyi tyiVar3 = verify2FAFragment.B;
                    if (tyiVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    lop.b(tyiVar3.v, Boolean.FALSE);
                    verify2FAFragment.n0();
                    ocu ocuVar = verify2FAFragment.C;
                    if (ocuVar == null) {
                        Intrinsics.n("viewModel");
                        throw null;
                    }
                    ej5.c(o8i0.d(ocuVar), null, null, new xcu(ocuVar, null), 3);
                    break;
                    break;
                case 6:
                case 7:
                case 8:
                default:
                    String strD6 = sn5.d(verify2FAFragment, R.string.component_bvn__verification_failed, new Object[0]);
                    Context contextRequireContext2 = verify2FAFragment.requireContext();
                    contextRequireContext2.getClass();
                    verify2FAFragment.o0(strD6, fcuVar.a.g(contextRequireContext2), null, new eyh0(verify2FAFragment));
                    break;
                case 9:
                    verify2FAFragment.n0();
                    break;
                case 10:
                    verify2FAFragment.o0(sn5.d(verify2FAFragment, R.string.component_bvn__verification_failed, new Object[0]), sn5.d(verify2FAFragment, R.string.common_feedback__facial_recognition_error, new Object[0]), sn5.d(verify2FAFragment, R.string.common_functions__retry, new Object[0]), new dyh0(verify2FAFragment));
                    break;
                case 11:
                    verify2FAFragment.getParentFragmentManager().m0("RETRY_LOGIN_FROM_VERIFY", new Bundle(0));
                    verify2FAFragment.n0();
                    break;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyh0(v1b v1bVar, Verify2FAFragment verify2FAFragment) {
        super(2, v1bVar);
        this.b = verify2FAFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fyh0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((fyh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to fyh0 for r5v3 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L10:
            defpackage.uj50.b(r6)
            goto L2f
        L14:
            defpackage.uj50.b(r6)
            com.sportybet.android.account.mfa.Verify2FAFragment r6 = r5.b
            ocu r1 = r6.C
            if (r1 == 0) goto L33
            t340 r1 = r1.y
            fyh0$a r4 = new fyh0$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        L33:
            java.lang.String r5 = "viewModel"
            kotlin.jvm.internal.Intrinsics.n(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
