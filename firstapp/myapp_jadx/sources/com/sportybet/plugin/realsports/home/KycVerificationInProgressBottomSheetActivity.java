package com.sportybet.plugin.realsports.home;

import android.os.Bundle;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.KycVerificationInProgressBottomSheetActivity;
import com.twilio.voice.VoiceException;
import defpackage.azm;
import defpackage.dul;
import defpackage.ftp;
import defpackage.k00;
import defpackage.op8;
import defpackage.osp;
import defpackage.pwx;
import defpackage.rdd0;
import defpackage.rlf;
import defpackage.wup;
import defpackage.zi50;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/home/KycVerificationInProgressBottomSheetActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lrlf;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KycVerificationInProgressBottomSheetActivity extends dul implements zux, pwx, rlf {
    public static final a d = new a();
    public azm b;
    public rdd0 c;

    public static final class a {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final wup wupVar;
        final ftp ftpVar;
        Object bVar;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("source");
        a aVar = d;
        if (stringExtra != null) {
            aVar.getClass();
            wupVar = wup.ME;
            if (!stringExtra.equals("me")) {
                wupVar = wup.HOME;
            }
        } else {
            wupVar = wup.HOME;
        }
        String stringExtra2 = getIntent().getStringExtra("action");
        if (stringExtra2 != null) {
            aVar.getClass();
            try {
                zi50.a aVar2 = zi50.b;
                bVar = ftp.valueOf(stringExtra2);
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj = ftp.a;
            if (bVar instanceof zi50.b) {
                bVar = obj;
            }
            ftpVar = (ftp) bVar;
            if (ftpVar == null) {
                ftpVar = ftp.a;
            }
        } else {
            ftpVar = ftp.a;
        }
        final boolean z = wupVar == wup.HOME;
        rdd0 rdd0Var = this.c;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        rdd0Var.a(new osp.s(wupVar), k00.d);
        zn8.a(this, new op8(1696749470, new Function2() { // from class: fup
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                StringUiText stringUiText;
                a aVar4 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                KycVerificationInProgressBottomSheetActivity.a aVar5 = KycVerificationInProgressBottomSheetActivity.d;
                if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ftp ftpVar2 = ftpVar;
                    int iOrdinal = ftpVar2.ordinal();
                    if (iOrdinal == 0) {
                        aVar4.N(-1511326876);
                        String strA = cb40.a(R.string.wap_home__check_transaction, new Object[0], aVar4);
                        StringUiText stringUiText2 = vch0.a;
                        stringUiText = new StringUiText(strA);
                        aVar4.H();
                    } else {
                        if (iOrdinal != 1) {
                            throw rg.a(-1511330569, aVar4);
                        }
                        aVar4.N(-1511323484);
                        String strA2 = cb40.a(R.string.wap_home__go_to_deposit, new Object[0], aVar4);
                        StringUiText stringUiText3 = vch0.a;
                        stringUiText = new StringUiText(strA2);
                        aVar4.H();
                    }
                    final StringUiText stringUiText4 = stringUiText;
                    final KycVerificationInProgressBottomSheetActivity kycVerificationInProgressBottomSheetActivity = this;
                    final wup wupVar2 = wupVar;
                    final boolean z2 = z;
                    o0z.a(null, null, null, null, null, pp8.b(1507006157, new Function2() { // from class: gup
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar6 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            KycVerificationInProgressBottomSheetActivity.a aVar7 = KycVerificationInProgressBottomSheetActivity.d;
                            int i = 1;
                            if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                d dVarE = j.e(d.a.b, 1.0f);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar6.m());
                                ne00 ne00VarO = aVar6.o();
                                d dVarC = c.c(aVar6, dVarE);
                                yka.k.getClass();
                                tsr.a aVar8 = yka.a.b;
                                if (aVar6.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar6.D();
                                if (aVar6.g()) {
                                    aVar6.F(aVar8);
                                } else {
                                    aVar6.p();
                                }
                                hlh0.a(aVar6, aivVarC, yka.a.f);
                                hlh0.a(aVar6, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar6, iHashCode, c1350a);
                                }
                                hlh0.a(aVar6, dVarC, yka.a.d);
                                String strA3 = cb40.a(R.string.wap_home__verification_in_progress, new Object[0], aVar6);
                                StringUiText stringUiText5 = vch0.a;
                                StringUiText stringUiText6 = new StringUiText(strA3);
                                final ftp ftpVar3 = ftpVar2;
                                boolean zD = aVar6.d(ftpVar3.ordinal());
                                final KycVerificationInProgressBottomSheetActivity kycVerificationInProgressBottomSheetActivity2 = kycVerificationInProgressBottomSheetActivity;
                                boolean zA = zD | aVar6.A(kycVerificationInProgressBottomSheetActivity2);
                                final wup wupVar3 = wupVar2;
                                boolean zD2 = zA | aVar6.d(wupVar3.ordinal());
                                Object objY = aVar6.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zD2 || objY == c0042a) {
                                    objY = new Function0() { // from class: hup
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            KycVerificationInProgressBottomSheetActivity.a aVar9 = KycVerificationInProgressBottomSheetActivity.d;
                                            int iOrdinal2 = ftpVar3.ordinal();
                                            String str = xOgHBQVl.YDO;
                                            KycVerificationInProgressBottomSheetActivity kycVerificationInProgressBottomSheetActivity3 = kycVerificationInProgressBottomSheetActivity2;
                                            if (iOrdinal2 == 0) {
                                                rdd0 rdd0Var2 = kycVerificationInProgressBottomSheetActivity3.c;
                                                if (rdd0Var2 == null) {
                                                    Intrinsics.n("sportyTrackingUseCase");
                                                    throw null;
                                                }
                                                rdd0Var2.a(new osp.t(wupVar3), k00.d);
                                                azm azmVar = kycVerificationInProgressBottomSheetActivity3.b;
                                                if (azmVar == null) {
                                                    Intrinsics.n(str);
                                                    throw null;
                                                }
                                                azmVar.d(wae.PAYSTACK_TRANS);
                                            } else {
                                                if (iOrdinal2 != 1) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                azm azmVar2 = kycVerificationInProgressBottomSheetActivity3.b;
                                                if (azmVar2 == null) {
                                                    Intrinsics.n(str);
                                                    throw null;
                                                }
                                                azmVar2.d(wae.DEPOSIT);
                                            }
                                            kycVerificationInProgressBottomSheetActivity3.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar6.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                uxs uxsVar = uxs.ENABLE;
                                m2g m2gVar = m2g.a;
                                m2gVar.getClass();
                                function0.getClass();
                                z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", stringUiText4, uxsVar, m2gVar, function0));
                                iyf0 iyf0Var = iyf0.a;
                                boolean zA2 = aVar6.A(kycVerificationInProgressBottomSheetActivity2);
                                Object objY2 = aVar6.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new yqf(kycVerificationInProgressBottomSheetActivity2, i);
                                    aVar6.r(objY2);
                                }
                                final boolean z3 = z2;
                                jib0.d(null, stringUiText6, null, 0L, 0L, 0L, iyf0Var, null, cVar, null, null, null, (Function0) objY2, null, null, pp8.b(1339381044, new gaj() { // from class: iup
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        a aVar9 = (a) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        KycVerificationInProgressBottomSheetActivity.a aVar10 = KycVerificationInProgressBottomSheetActivity.d;
                                        ((j78) obj6).getClass();
                                        int i2 = 1;
                                        if (!aVar9.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            aVar9.G();
                                        } else if (z3) {
                                            aVar9.N(1254620572);
                                            String strA4 = cb40.a(R.string.wap_home__check_my_profile, new Object[0], aVar9);
                                            imf0 imf0Var = ((ijb0) aVar9.O(kjb0.a)).n;
                                            long j = ((lib0) aVar9.O(oib0.a)).g;
                                            d dVarJ = h.j(j.g(d.a.b, 1.0f), 0.0f, ((cjb0) aVar9.O(ejb0.a)).f, 0.0f, 0.0f, 13);
                                            KycVerificationInProgressBottomSheetActivity kycVerificationInProgressBottomSheetActivity3 = kycVerificationInProgressBottomSheetActivity2;
                                            boolean zA3 = aVar9.A(kycVerificationInProgressBottomSheetActivity3);
                                            wup wupVar4 = wupVar3;
                                            boolean zD3 = zA3 | aVar9.d(wupVar4.ordinal());
                                            Object objY3 = aVar9.y();
                                            if (zD3 || objY3 == a.C0041a.a) {
                                                objY3 = new arf(i2, kycVerificationInProgressBottomSheetActivity3, wupVar4);
                                                aVar9.r(objY3);
                                            }
                                            lkf0.d(strA4, androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar9, 0, 0, 130040);
                                            aVar9.H();
                                        } else {
                                            aVar9.N(1255651694);
                                            aVar9.H();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar6), k89.a, aVar6, 1572864, 1772544, VoiceException.EXCEPTION_INVALID_TTL);
                                aVar6.s();
                            } else {
                                aVar6.G();
                            }
                            return Unit.a;
                        }
                    }, aVar4), aVar4, 196608);
                } else {
                    aVar4.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
