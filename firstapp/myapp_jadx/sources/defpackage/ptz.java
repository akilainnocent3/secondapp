package defpackage;

import android.widget.TextView;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity$initViewModel$1$1", f = "PartnerWithdrawRequestDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ptz extends tje0 implements Function2<lk50<? extends mtz>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PartnerWithdrawRequestDetailsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptz(PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity, v1b<? super ptz> v1bVar) {
        super(2, v1bVar);
        this.b = partnerWithdrawRequestDetailsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ptz ptzVar = new ptz(this.b, v1bVar);
        ptzVar.a = obj;
        return ptzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends mtz> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ptz) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:234:0x055c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        md mdVar;
        Object objK;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Object stringUiText = null;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        mtz mtzVar = cVar != null ? (mtz) cVar.a : null;
        PartnerWithdrawRequestDetailsActivity partnerWithdrawRequestDetailsActivity = this.b;
        md mdVar2 = partnerWithdrawRequestDetailsActivity.e;
        if (mdVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mdVar2.b.setText(n4d.a(mtzVar != null ? mtzVar.d : null));
        md mdVar3 = partnerWithdrawRequestDetailsActivity.e;
        if (mdVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        mdVar3.f.setText(n4d.a(mtzVar != null ? mtzVar.i : null));
        md mdVar4 = partnerWithdrawRequestDetailsActivity.e;
        if (mdVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView = mdVar4.A;
        if (mtzVar == null || (str = mtzVar.c) == null) {
            str = "--";
        }
        textView.setText(str);
        md mdVar5 = partnerWithdrawRequestDetailsActivity.e;
        if (mdVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView textView2 = mdVar5.F;
        String str23 = partnerWithdrawRequestDetailsActivity.f;
        if (str23 == null) {
            Intrinsics.n("tradeId");
            throw null;
        }
        textView2.setText(str23);
        String str24 = mtzVar != null ? mtzVar.j : null;
        md mdVar6 = partnerWithdrawRequestDetailsActivity.e;
        if (str24 != null) {
            if (mdVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar6.B.setVisibility(0);
            md mdVar7 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar7.C.setVisibility(0);
            md mdVar8 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar8.C.setText(mtzVar.j);
        } else {
            if (mdVar6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar6.B.setVisibility(8);
            md mdVar9 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar9.C.setVisibility(8);
        }
        if ((mtzVar != null ? mtzVar.h : null) == null || mtzVar.h.compareTo(BigDecimal.ZERO) <= 0) {
            md mdVar10 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar10.e.setVisibility(8);
            md mdVar11 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar11.d.setVisibility(8);
        } else {
            md mdVar12 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar12.e.setVisibility(0);
            md mdVar13 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar13 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar13.d.setVisibility(0);
            md mdVar14 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar14.d.setText(n4d.a(mtzVar.h));
        }
        if (mtzVar == null) {
            mdVar = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar != null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar.z.setVisibility(8);
        } else if (b.k(cuz.SUBMITTED, cuz.APPROVED).contains(mtzVar.f)) {
            md mdVar15 = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar15.z.setVisibility(0);
        } else {
            mdVar = partnerWithdrawRequestDetailsActivity.e;
            if (mdVar != null) {
                Intrinsics.n("binding");
                throw null;
            }
            mdVar.z.setVisibility(8);
        }
        duz duzVar = partnerWithdrawRequestDetailsActivity.i;
        if (duzVar == null) {
            Intrinsics.n("timelineAdapter");
            throw null;
        }
        if (mtzVar != null) {
            SimpleDateFormat simpleDateFormat = euz.a;
            cuz cuzVar = mtzVar.f;
            BigDecimal bigDecimal = mtzVar.h;
            Date date = mtzVar.k;
            Date date2 = mtzVar.l;
            Date date3 = mtzVar.b;
            switch (cuzVar) {
                case SUBMITTED:
                    StringUiText stringUiText2 = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.page_withdraw__request_submitted);
                    if (date3 != null && (str2 = simpleDateFormat.format(date3)) != null) {
                        stringUiText = new StringUiText(str2);
                    }
                    objK = b.k(new fuz(true, false, true, resourceUiText, stringUiText, null), new fuz(false, false, false, new ResourceUiText(R.string.page_withdraw__waiting_for_partners_approval__NG), null, new ResourceUiText(R.string.page_withdraw__if_the_partner_did_not_approve_your_request_within_tip__NG)));
                    break;
                case APPROVED:
                    StringUiText stringUiText3 = vch0.a;
                    fuz fuzVar = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str4 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str4), null);
                    String str25 = mtzVar.g;
                    ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_withdraw__approved_pin_code_vpin__NG, ay0.S(new Object[]{str25 != null ? str25 : "--"}));
                    if (date != null && (str3 = simpleDateFormat.format(date)) != null) {
                        stringUiText = new StringUiText(str3);
                    }
                    objK = b.k(fuzVar, new fuz(true, false, true, resourceUiText2, stringUiText, new ResourceUiText(R.string.page_withdraw__take_the_pin_code_to_the_partner_then_expect_a_sms_tip__NG)), new fuz(false, false, false, new ResourceUiText(R.string.page_withdraw__withdrawal_successed), null, null));
                    break;
                case SUCCEED:
                    StringUiText stringUiText4 = vch0.a;
                    fuz fuzVar2 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str7 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str7), null);
                    fuz fuzVar3 = new fuz(true, true, true, new ResourceUiText(R.string.common_functions__approved), (date == null || (str6 = simpleDateFormat.format(date)) == null) ? null : new StringUiText(str6), null);
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_withdraw__withdrawal_successed);
                    if (date2 != null && (str5 = simpleDateFormat.format(date2)) != null) {
                        stringUiText = new StringUiText(str5);
                    }
                    objK = b.k(fuzVar2, fuzVar3, new fuz(true, false, false, resourceUiText3, stringUiText, null));
                    break;
                case FAILED:
                    StringUiText stringUiText5 = vch0.a;
                    fuz fuzVar4 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str10 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str10), null);
                    fuz fuzVar5 = new fuz(true, true, true, new ResourceUiText(R.string.common_functions__approved), (date == null || (str9 = simpleDateFormat.format(date)) == null) ? null : new StringUiText(str9), null);
                    ResourceUiText resourceUiText4 = new ResourceUiText(R.string.page_withdraw__withdrawal_failed);
                    if (date2 != null && (str8 = simpleDateFormat.format(date2)) != null) {
                        stringUiText = new StringUiText(str8);
                    }
                    objK = b.k(fuzVar4, fuzVar5, new fuz(true, false, false, resourceUiText4, stringUiText, new ResourceUiText(R.string.page_withdraw__a_full_refund_has_been_returned_to_your_balance__NG)));
                    break;
                case CANCELLED:
                    if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                        StringUiText stringUiText6 = vch0.a;
                        fuz fuzVar6 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str15 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str15), null);
                        fuz fuzVar7 = new fuz(true, true, true, new ResourceUiText(R.string.common_functions__approved), (date == null || (str14 = simpleDateFormat.format(date)) == null) ? null : new StringUiText(str14), null);
                        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.page_withdraw__cancelled_cancellation_fee_vfee, ay0.S(new Object[]{n4d.a(bigDecimal)}));
                        if (date2 != null && (str13 = simpleDateFormat.format(date2)) != null) {
                            stringUiText = new StringUiText(str13);
                        }
                        objK = b.k(fuzVar6, fuzVar7, new fuz(true, false, false, resourceUiText5, stringUiText, new ResourceUiText(R.string.page_withdraw__your_withdrawal_and_fee_to_partner_have_been_returned_to_your_balance)));
                    } else {
                        StringUiText stringUiText7 = vch0.a;
                        fuz fuzVar8 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str12 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str12), null);
                        ResourceUiText resourceUiText6 = new ResourceUiText(R.string.common_functions__cancelled);
                        if (date2 != null && (str11 = simpleDateFormat.format(date2)) != null) {
                            stringUiText = new StringUiText(str11);
                        }
                        objK = b.k(fuzVar8, new fuz(true, false, false, resourceUiText6, stringUiText, new ResourceUiText(R.string.page_withdraw__a_full_refund_has_been_returned_to_your_balance__NG)));
                    }
                    break;
                case REQUEST_REJECTED:
                    StringUiText stringUiText8 = vch0.a;
                    fuz fuzVar9 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str17 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str17), null);
                    ResourceUiText resourceUiText7 = new ResourceUiText(R.string.page_withdraw__request_rejected_by_partner__NG);
                    if (date2 != null && (str16 = simpleDateFormat.format(date2)) != null) {
                        stringUiText = new StringUiText(str16);
                    }
                    objK = b.k(fuzVar9, new fuz(true, false, false, resourceUiText7, stringUiText, new ResourceUiText(R.string.page_withdraw__a_full_refund_has_been_returned_to_your_balance_please_try_to_apply_request_to_other_partners)));
                    break;
                case REQUEST_EXPIRED:
                    StringUiText stringUiText9 = vch0.a;
                    fuz fuzVar10 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str19 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str19), null);
                    ResourceUiText resourceUiText8 = new ResourceUiText(R.string.page_withdraw__request_expired);
                    if (date2 != null && (str18 = simpleDateFormat.format(date2)) != null) {
                        stringUiText = new StringUiText(str18);
                    }
                    objK = b.k(fuzVar10, new fuz(true, false, false, resourceUiText8, stringUiText, new ResourceUiText(R.string.page_withdraw__a_full_refund_has_been_returned_to_your_balance__NG)));
                    break;
                case PIN_EXPIRED:
                    StringUiText stringUiText10 = vch0.a;
                    fuz fuzVar11 = new fuz(true, true, true, new ResourceUiText(R.string.page_withdraw__request_submitted), (date3 == null || (str22 = simpleDateFormat.format(date3)) == null) ? null : new StringUiText(str22), null);
                    fuz fuzVar12 = new fuz(true, true, true, new ResourceUiText(R.string.common_functions__approved), (date == null || (str21 = simpleDateFormat.format(date)) == null) ? null : new StringUiText(str21), null);
                    ResourceUiText resourceUiText9 = new ResourceUiText(R.string.page_withdraw__pin_code_expired);
                    if (date2 != null && (str20 = simpleDateFormat.format(date2)) != null) {
                        stringUiText = new StringUiText(str20);
                    }
                    objK = b.k(fuzVar11, fuzVar12, new fuz(true, false, false, resourceUiText9, stringUiText, new ResourceUiText(R.string.page_withdraw__a_full_refund_has_been_returned_to_your_balance__NG)));
                    break;
                default:
                    objK = m2g.a;
                    break;
            }
            stringUiText = objK;
        }
        duzVar.i(stringUiText);
        return Unit.a;
    }
}
