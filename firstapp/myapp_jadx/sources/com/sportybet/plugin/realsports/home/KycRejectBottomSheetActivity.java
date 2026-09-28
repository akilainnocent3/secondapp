package com.sportybet.plugin.realsports.home;

import android.os.Bundle;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;
import com.twilio.voice.VoiceException;
import defpackage.azm;
import defpackage.bul;
import defpackage.lsp;
import defpackage.op8;
import defpackage.pwx;
import defpackage.rlf;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/plugin/realsports/home/KycRejectBottomSheetActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lrlf;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KycRejectBottomSheetActivity extends bul implements zux, pwx, rlf {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public lsp c;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra("reject_reason");
        if (stringExtra == null) {
            stringExtra = "";
        }
        final KycSource kycSourceFromValue = KycSource.INSTANCE.fromValue(getIntent().getStringExtra("source"));
        if (kycSourceFromValue == null) {
            kycSourceFromValue = KycSource.VERIFY;
        }
        zn8.a(this, new op8(1318207070, new Function2() { // from class: wtp
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = KycRejectBottomSheetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final KycRejectBottomSheetActivity kycRejectBottomSheetActivity = this.a;
                    final KycSource kycSource = kycSourceFromValue;
                    final String str = stringExtra;
                    o0z.a(null, null, null, null, null, pp8.b(-1269597811, new Function2() { // from class: xtp
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = KycRejectBottomSheetActivity.d;
                            int i3 = 1;
                            int i4 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                d dVarE = j.e(d.a.b, 1.0f);
                                aiv aivVarC = g75.c(ht.a.a, false);
                                int iHashCode = Long.hashCode(aVar2.m());
                                ne00 ne00VarO = aVar2.o();
                                d dVarC = c.c(aVar2, dVarE);
                                yka.k.getClass();
                                tsr.a aVar3 = yka.a.b;
                                if (aVar2.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar2.D();
                                if (aVar2.g()) {
                                    aVar2.F(aVar3);
                                } else {
                                    aVar2.p();
                                }
                                hlh0.a(aVar2, aivVarC, yka.a.f);
                                hlh0.a(aVar2, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                }
                                hlh0.a(aVar2, dVarC, yka.a.d);
                                String strA = cb40.a(R.string.common_functions__verify_failed, new Object[0], aVar2);
                                StringUiText stringUiText = vch0.a;
                                StringUiText stringUiText2 = new StringUiText(strA);
                                StringUiText stringUiText3 = new StringUiText(cb40.a(R.string.identity_verification__verify_again, new Object[0], aVar2));
                                final KycRejectBottomSheetActivity kycRejectBottomSheetActivity2 = kycRejectBottomSheetActivity;
                                boolean zA = aVar2.A(kycRejectBottomSheetActivity2);
                                KycSource kycSource2 = kycSource;
                                boolean zD = zA | aVar2.d(kycSource2.ordinal());
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zD || objY == c0042a) {
                                    objY = new qqf(i3, kycRejectBottomSheetActivity2, kycSource2);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                uxs uxsVar = uxs.ENABLE;
                                m2g m2gVar = m2g.a;
                                m2gVar.getClass();
                                function0.getClass();
                                z45.c cVar = new z45.c(new w45.c("bottom_sheet_primary_button", stringUiText3, uxsVar, m2gVar, function0));
                                iyf0 iyf0Var = iyf0.a;
                                boolean zA2 = aVar2.A(kycRejectBottomSheetActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new ytp(kycRejectBottomSheetActivity2, i4);
                                    aVar2.r(objY2);
                                }
                                op8 op8VarB = pp8.b(-177138700, new gaj() { // from class: ztp
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        a aVar4 = (a) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        int i5 = KycRejectBottomSheetActivity.d;
                                        ((j78) obj5).getClass();
                                        if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            String strA2 = cb40.a(R.string.common_functions__support, new Object[0], aVar4);
                                            imf0 imf0Var = ((ijb0) aVar4.O(kjb0.a)).n;
                                            long j = ((lib0) aVar4.O(oib0.a)).g;
                                            d dVarJ = h.j(j.g(d.a.b, 1.0f), 0.0f, ((cjb0) aVar4.O(ejb0.a)).f, 0.0f, 0.0f, 13);
                                            KycRejectBottomSheetActivity kycRejectBottomSheetActivity3 = kycRejectBottomSheetActivity2;
                                            boolean zA3 = aVar4.A(kycRejectBottomSheetActivity3);
                                            Object objY3 = aVar4.y();
                                            int i6 = 3;
                                            if (zA3 || objY3 == a.C0041a.a) {
                                                objY3 = new v9b(kycRejectBottomSheetActivity3, i6);
                                                aVar4.r(objY3);
                                            }
                                            lkf0.d(strA2, androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar4, 0, 0, 130040);
                                        } else {
                                            aVar4.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                final String str2 = str;
                                jib0.d(null, stringUiText2, null, 0L, 0L, 0L, iyf0Var, null, cVar, null, null, null, (Function0) objY2, null, null, op8VarB, pp8.b(-501147083, new gaj() { // from class: aup
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        a aVar4 = (a) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        int i5 = KycRejectBottomSheetActivity.d;
                                        ((j78) obj5).getClass();
                                        if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            lkf0.d(str2, null, ((lib0) aVar4.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar4.O(kjb0.a)).k, aVar4, 0, 0, 131066);
                                        } else {
                                            aVar4.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 1572864, 1772544, VoiceException.EXCEPTION_INVALID_TTL);
                                aVar2.s();
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
