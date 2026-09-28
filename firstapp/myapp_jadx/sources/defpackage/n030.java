package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.nin.NINVerificationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileFragment$collectProfile$1", f = "ProfileFragment.kt", l = {573}, m = "invokeSuspend", v = 2)
public final class n030 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d030 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ d030 a;

        public a(d030 d030Var) {
            this.a = d030Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            j130 j130Var = (j130) obj;
            ohp<Object>[] ohpVarArr = d030.S;
            final d030 d030Var = this.a;
            mla.i(d030Var.n0().E, new op8(-1262827872, new rfb(1, j130Var, d030Var), true));
            boolean z = j130Var.g;
            final AccountInfo accountInfo = j130Var.a;
            if (z) {
                d030Var.n0().D.setVisibility(8);
                d030Var.n0().G.K();
            } else if (j130Var.h) {
                d030Var.n0().D.setVisibility(8);
                d030Var.n0().G.J(sn5.d(d030Var, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
            } else {
                d030Var.n0().D.setVisibility(0);
                d030Var.n0().G.E();
                if (accountInfo != null) {
                    d030Var.G = accountInfo.getNickname();
                    d030Var.L = !accountInfo.getNicknameVerified();
                    d030Var.N = accountInfo.getEditableFirstName();
                    d030Var.M = accountInfo.getEditableLastName();
                    accountInfo.getEditableBirthday();
                    d030Var.E = accountInfo.getLastName();
                    d030Var.D = accountInfo.getFirstName();
                    accountInfo.getBirthday();
                    accountInfo.getPhone();
                    d030Var.n0().O.setRightText(d030Var.G);
                    d030Var.n0().O.setLineTextEditable(d030Var.G, d030Var.L, 8);
                    d030Var.v0();
                }
                final PrimaryPhoneConfig primaryPhoneConfig = j130Var.b;
                final boolean phoneReviewed = accountInfo.getPhoneReviewed();
                final String phone = accountInfo.getPhone();
                ComposeView composeView = d030Var.n0().I;
                final String json = sh8.b().toJson(primaryPhoneConfig);
                mla.i(composeView, new op8(1682511973, new Function2() { // from class: b030
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ohp<Object>[] ohpVarArr2 = d030.S;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            String strA = cb40.a(R.string.wap_profile__phone, new Object[0], aVar);
                            String strA2 = phone;
                            strA2.getClass();
                            if (TextUtils.isDigitsOnly(strA2) && strA2.length() > 5) {
                                strA2 = fu5.a("(?<=\\d{2})\\d(?=\\d{1})", strA2, "*");
                            }
                            String str = strA2;
                            boolean functionEnabled = primaryPhoneConfig.getFunctionEnabled();
                            nz20[] nz20VarArr = nz20.a;
                            final boolean z2 = phoneReviewed;
                            boolean zB = aVar.b(z2);
                            final d030 d030Var2 = d030Var;
                            boolean zA = zB | aVar.A(d030Var2);
                            final String str2 = json;
                            boolean zM = zA | aVar.M(str2);
                            Object objY = aVar.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: uz20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ohp<Object>[] ohpVarArr3 = d030.S;
                                        boolean z3 = z2;
                                        d030 d030Var3 = d030Var2;
                                        if (z3) {
                                            bs20.a(NavHostFragment.a.a(d030Var3));
                                        } else {
                                            yfx yfxVarA = NavHostFragment.a.a(d030Var3);
                                            String str3 = str2;
                                            str3.getClass();
                                            zix zixVarA = bjx.a(new r8a(1, new kkx()));
                                            yfxVarA.getClass();
                                            yfx.i(yfxVarA, "primary_phone_instructions_route/".concat(str3), zixVarA, 4);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            i130.b(null, strA, str, functionEnabled, z2, 0L, null, (Function0) objY, aVar, 1572864);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                composeView.setVisibility(phone.length() > 0 ? 0 : 8);
                mla.i(d030Var.n0().C, new op8(-365301185, new i030(d030Var, accountInfo), true));
                mla.i(d030Var.n0().H, new op8(1640009000, new Function2() { // from class: j030
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final AccountInfo accountInfo2 = accountInfo;
                            Boolean ninVerified = accountInfo2.getNinVerified();
                            boolean zBooleanValue = ninVerified != null ? ninVerified.booleanValue() : false;
                            final d030 d030Var2 = d030Var;
                            boolean zA = aVar.A(d030Var2) | aVar.A(accountInfo2);
                            Object objY = aVar.y();
                            if (zA || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: l030
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        AccountInfo accountInfo3 = accountInfo2;
                                        Integer nameUpdateStatus = accountInfo3.getNameUpdateStatus();
                                        boolean z2 = nameUpdateStatus != null && nameUpdateStatus.intValue() == 20;
                                        boolean ninNameUpdateEnabled = accountInfo3.getNinNameUpdateEnabled();
                                        ohp<Object>[] ohpVarArr2 = d030.S;
                                        d030 d030Var3 = d030Var2;
                                        String strD = sn5.d(d030Var3, R.string.identity_verification__name_update_block_nin_alert_description, new Object[0]);
                                        String strD2 = sn5.d(d030Var3, R.string.identity_verification__heads_up, new Object[0]);
                                        String strD3 = sn5.d(d030Var3, R.string.common_functions__ok, new Object[0]);
                                        wie wieVar = new wie();
                                        wieVar.a = strD;
                                        wieVar.c = "Cancel";
                                        wieVar.b = strD3;
                                        wieVar.f = false;
                                        wieVar.e = true;
                                        wieVar.w = null;
                                        wieVar.v = null;
                                        wieVar.i = true;
                                        wieVar.d = strD2;
                                        wieVar.z = R.color.text_type1_secondary;
                                        wieVar.y = R.color.brand_secondary;
                                        wieVar.A = R.color.text_type1_primary;
                                        wieVar.B = 0;
                                        wieVar.C = 1;
                                        wieVar.D = false;
                                        wieVar.E = true;
                                        wieVar.F = false;
                                        if (z2) {
                                            FragmentManager childFragmentManager = d030Var3.getChildFragmentManager();
                                            childFragmentManager.getClass();
                                            wieVar.show(childFragmentManager, "nameUpdatePending");
                                        } else {
                                            Intent intent = new Intent(d030Var3.requireContext(), (Class<?>) NINVerificationActivity.class);
                                            intent.putExtra("first_name", d030Var3.D);
                                            intent.putExtra("last_name", d030Var3.E);
                                            intent.putExtra("is_name_update_on", ninNameUpdateEnabled);
                                            d030Var3.startActivity(intent);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            u4x.a(0, aVar, null, (Function0) objY, zBooleanValue);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                if (j130Var.d) {
                    d030Var.n0().H.setVisibility(0);
                } else {
                    d030Var.n0().H.setVisibility(8);
                }
                boolean zIsTelegramBindEnabled = accountInfo.isTelegramBindEnabled();
                final boolean zIsTelegramBound = accountInfo.isTelegramBound();
                mla.i(d030Var.n0().J, new op8(1500804658, new Function2() { // from class: c030
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Object value;
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ohp<Object>[] ohpVarArr2 = d030.S;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d030 d030Var2 = d030Var;
                            vaf0 vaf0VarR0 = d030Var2.r0();
                            if (!vaf0VarR0.f) {
                                wwd0 wwd0Var = vaf0VarR0.i;
                                do {
                                    value = wwd0Var.getValue();
                                } while (!wwd0Var.g(value, qaf0.a((qaf0) value, null, zIsTelegramBound, 1)));
                                vaf0VarR0.f = true;
                            }
                            ytw ytwVarC = wyh.c(d030Var2.r0().v, aVar, 0, 7);
                            oaf0 oaf0Var = (oaf0) wyh.c(d030Var2.r0().y, aVar, 0, 7).getValue();
                            vaf0 vaf0VarR1 = d030Var2.r0();
                            boolean zA = aVar.A(vaf0VarR1);
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY == c0042a) {
                                r030 r030Var = new r030(1, vaf0VarR1, vaf0.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/account/telegram/TelegramBindingEvent;)V", 0);
                                aVar.r(r030Var);
                                objY = r030Var;
                            }
                            ccf0.b(oaf0Var, (Function1) ((chp) objY), aVar, 0);
                            boolean z2 = ((qaf0) ytwVarC.getValue()).b;
                            uxs uxsVar = ((qaf0) ytwVarC.getValue()).a;
                            boolean zA2 = aVar.A(d030Var2);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new uf7(d030Var2, 2);
                                aVar.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            boolean zA3 = aVar.A(d030Var2);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                objY3 = new t2g(d030Var2, 1);
                                aVar.r(objY3);
                            }
                            ccf0.a(null, z2, uxsVar, function0, (Function0) objY3, aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                d030Var.n0().J.setVisibility(zIsTelegramBindEnabled ? 0 : 8);
                String str = d030Var.F;
                if (str == null) {
                    str = "";
                }
                final String str2 = str;
                final EmailChangeConfigResponse emailChangeConfigResponse = j130Var.c;
                final boolean z2 = j130Var.f;
                final boolean z3 = !z2 || emailChangeConfigResponse.getMainSwitchEnabled();
                mla.i(d030Var.n0().K, new op8(-215425559, new Function2() { // from class: a030
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ohp<Object>[] ohpVarArr2 = d030.S;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final d030 d030Var2 = d030Var;
                            boolean zA = aVar.A(d030Var2);
                            final EmailChangeConfigResponse emailChangeConfigResponse2 = emailChangeConfigResponse;
                            boolean zA2 = zA | aVar.A(emailChangeConfigResponse2);
                            final boolean z4 = z2;
                            boolean zB = zA2 | aVar.b(z4);
                            Object objY = aVar.y();
                            if (zB || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: tz20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ohp<Object>[] ohpVarArr3 = d030.S;
                                        d030Var2.t0(emailChangeConfigResponse2, z4);
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            rz20.a(0, aVar, str2, (Function0) objY, z3);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
                if (d030Var.K) {
                    d030Var.K = false;
                    d030Var.t0(j130Var.c, j130Var.f);
                }
                final gwe gweVar = j130Var.e;
                mla.i(d030Var.n0().F, new op8(-919662463, new Function2() { // from class: zz20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ohp<Object>[] ohpVarArr2 = d030.S;
                        int i = 2;
                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            o0z.a(null, null, null, null, null, pp8.b(-1845625552, new yf2(i, gweVar, d030Var), aVar), aVar, 196608);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n030(v1b v1bVar, d030 d030Var) {
        super(2, v1bVar);
        this.b = d030Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n030(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((n030) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to n030 for r5v2 'this'  v1b
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
            goto L35
        L14:
            defpackage.uj50.b(r6)
            ohp<java.lang.Object>[] r6 = defpackage.d030.S
            d030 r6 = r5.b
            a230 r1 = r6.s0()
            wwd0 r1 = r1.z
            v340 r1 = defpackage.e1i.b(r1)
            n030$a r4 = new n030$a
            r4.<init>(r6)
            r5.a = r3
            uwd0<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L35
            return r0
        L35:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n030.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
