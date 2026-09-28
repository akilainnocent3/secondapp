package com.sporty.android.platform.features.kyc.domain.uploadfile;

import android.os.Bundle;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.kyc.domain.uploadfile.KycFileSubmissionBottomSheetActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.azm;
import defpackage.bb40;
import defpackage.ftp;
import defpackage.op8;
import defpackage.pwx;
import defpackage.rlf;
import defpackage.zi50;
import defpackage.zn8;
import defpackage.ztl;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/uploadfile/KycFileSubmissionBottomSheetActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lbb40;", "Lrlf;", "<init>", "()V", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KycFileSubmissionBottomSheetActivity extends ztl implements zux, pwx, bb40, rlf {
    public static final a c = new a();
    public azm b;

    public static final class a {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final ftp ftpVar;
        Object bVar;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("action");
        if (stringExtra != null) {
            c.getClass();
            try {
                zi50.a aVar = zi50.b;
                bVar = ftp.valueOf(stringExtra);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj = ftp.b;
            if (bVar instanceof zi50.b) {
                bVar = obj;
            }
            ftpVar = (ftp) bVar;
            if (ftpVar == null) {
                ftpVar = ftp.b;
            }
        } else {
            ftpVar = ftp.b;
        }
        zn8.a(this, new op8(-39798651, new Function2() { // from class: qsp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a aVar3 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                KycFileSubmissionBottomSheetActivity.a aVar4 = KycFileSubmissionBottomSheetActivity.c;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ftp ftpVar2 = ftpVar;
                    final KycFileSubmissionBottomSheetActivity kycFileSubmissionBottomSheetActivity = this;
                    o0z.a(null, null, null, null, null, pp8.b(717953140, new Function2() { // from class: rsp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            StringUiText stringUiText;
                            a aVar5 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            KycFileSubmissionBottomSheetActivity.a aVar6 = KycFileSubmissionBottomSheetActivity.c;
                            int i = 1;
                            int i2 = 0;
                            if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                d dVarE = j.e(d.a.b, 1.0f);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar5.m());
                                ne00 ne00VarO = aVar5.o();
                                d dVarC = c.c(aVar5, dVarE);
                                yka.k.getClass();
                                tsr.a aVar7 = yka.a.b;
                                if (aVar5.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar5.D();
                                if (aVar5.g()) {
                                    aVar5.F(aVar7);
                                } else {
                                    aVar5.p();
                                }
                                hlh0.a(aVar5, aivVarC, yka.a.f);
                                hlh0.a(aVar5, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                                }
                                hlh0.a(aVar5, dVarC, yka.a.d);
                                String strA = cb40.a(R.string.wap_home__welcome_reward_verification_processing, new Object[0], aVar5);
                                StringUiText stringUiText2 = vch0.a;
                                StringUiText stringUiText3 = new StringUiText(strA);
                                ftp ftpVar3 = ftp.a;
                                ftp ftpVar4 = ftpVar2;
                                if (ftpVar4 == ftpVar3) {
                                    aVar5.N(-1821520123);
                                    stringUiText = new StringUiText(cb40.a(R.string.wap_home__check_transaction, new Object[0], aVar5));
                                    aVar5.H();
                                } else {
                                    aVar5.N(-1821384343);
                                    stringUiText = new StringUiText(cb40.a(R.string.wap_home__go_to_deposit, new Object[0], aVar5));
                                    aVar5.H();
                                }
                                StringUiText stringUiText4 = stringUiText;
                                KycFileSubmissionBottomSheetActivity kycFileSubmissionBottomSheetActivity2 = kycFileSubmissionBottomSheetActivity;
                                boolean zA = aVar5.A(kycFileSubmissionBottomSheetActivity2) | aVar5.d(ftpVar4.ordinal());
                                Object objY = aVar5.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new ssp(i2, kycFileSubmissionBottomSheetActivity2, ftpVar4);
                                    aVar5.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                uxs uxsVar = uxs.ENABLE;
                                m2g m2gVar = m2g.a;
                                m2gVar.getClass();
                                function0.getClass();
                                z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", stringUiText4, uxsVar, m2gVar, function0));
                                qyd0 qyd0Var = oib0.a;
                                long j = ((lib0) aVar5.O(qyd0Var)).b1;
                                long j2 = ((lib0) aVar5.O(qyd0Var)).o;
                                long j3 = ((lib0) aVar5.O(qyd0Var)).o;
                                iyf0 iyf0Var = iyf0.a;
                                boolean zA2 = aVar5.A(kycFileSubmissionBottomSheetActivity2);
                                Object objY2 = aVar5.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new s32(kycFileSubmissionBottomSheetActivity2, i);
                                    aVar5.r(objY2);
                                }
                                jib0.d(null, stringUiText3, null, j, j2, j3, iyf0Var, null, cVar, null, null, null, (Function0) objY2, null, null, null, g89.a, aVar5, 1572864, 1575936, 52869);
                                aVar5.s();
                            } else {
                                aVar5.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
