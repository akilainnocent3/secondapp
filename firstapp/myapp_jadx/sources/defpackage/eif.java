package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.android.widget.HintView;
import com.sportybet.model.KYCReminderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$observeKYCReminderState$1", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eif extends tje0 implements Function2<KYCReminderState.Success, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yhf b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[KYCReminder.VerificationStatus.values().length];
            try {
                iArr[KYCReminder.VerificationStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KYCReminder.VerificationStatus.PENDING_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KYCReminder.VerificationStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eif(yhf yhfVar, v1b<? super eif> v1bVar) {
        super(2, v1bVar);
        this.b = yhfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eif eifVar = new eif(this.b, v1bVar);
        eifVar.a = obj;
        return eifVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KYCReminderState.Success success, v1b<? super Unit> v1bVar) {
        return ((eif) create(success, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        KYCReminderState.Success success = (KYCReminderState.Success) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final KYCReminder kycReminder = success.getKycReminder();
        final yhf yhfVar = this.b;
        sif sifVarP0 = yhfVar.P0();
        Context contextRequireContext = yhfVar.requireContext();
        contextRequireContext.getClass();
        kycReminder.getClass();
        if (contextRequireContext.getSharedPreferences("kyc_reminder", 0).getBoolean(sifVarP0.X0.a(kycReminder), false) || kycReminder.getReminder() != KYCReminder.Reminder.SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION) {
            pvi pviVar = yhfVar.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            pviVar.G.setVisibility(8);
        } else {
            final KYCReminder.Details details = kycReminder.getDetails();
            int i = a.a[success.getKycReminder().getVerificationStatus().ordinal()];
            if (i == 1) {
                pvi pviVar2 = yhfVar.X;
                if (pviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                yhfVar.V0(pviVar2.G, kycReminder, sn5.d(yhfVar, R.string.page_withdraw__vaccount_under_review, details != null ? details.getBankName() : null), sn5.d(yhfVar, R.string.common_functions__more_details, new Object[0]), HintView.a.a, new View.OnClickListener() { // from class: aif
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        yhf yhfVar2 = yhfVar;
                        sif sifVarP1 = yhfVar2.P0();
                        Context contextRequireContext2 = yhfVar2.requireContext();
                        contextRequireContext2.getClass();
                        cup cupVar = sifVarP1.X0;
                        cupVar.getClass();
                        vn20.f(contextRequireContext2, "kyc_reminder", cupVar.a(kycReminder), true, true);
                        Context contextRequireContext3 = yhfVar2.requireContext();
                        contextRequireContext3.getClass();
                        KYCReminder.Details details2 = details;
                        js.d(contextRequireContext3, R.string.identity_verification__under_review, sn5.d(yhfVar2, R.string.identity_verification__vbank_vaccount_still_under_review, details2 != null ? details2.getBankName() : null), null, null, 48);
                    }
                });
            } else if (i != 2) {
                pvi pviVar3 = yhfVar.X;
                if (i != 3) {
                    if (pviVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    pviVar3.G.setVisibility(8);
                } else {
                    if (pviVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    yhfVar.V0(pviVar3.G, kycReminder, sn5.d(yhfVar, R.string.page_withdraw__vaccount_verification_failed, details != null ? details.getBankName() : null), sn5.d(yhfVar, R.string.common_functions__more_details, new Object[0]), HintView.a.b, new View.OnClickListener() { // from class: cif
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            yhf yhfVar2 = yhfVar;
                            sif sifVarP1 = yhfVar2.P0();
                            Context contextRequireContext2 = yhfVar2.requireContext();
                            contextRequireContext2.getClass();
                            cup cupVar = sifVarP1.X0;
                            cupVar.getClass();
                            KYCReminder kYCReminder = kycReminder;
                            vn20.f(contextRequireContext2, "kyc_reminder", cupVar.a(kYCReminder), true, true);
                            Context contextRequireContext3 = yhfVar2.requireContext();
                            contextRequireContext3.getClass();
                            String strD = sn5.d(yhfVar2, R.string.common_feedback__verification_failed, new Object[0]);
                            KYCReminder.Details details2 = details;
                            js.b(contextRequireContext3, strD, sn5.d(yhfVar2, R.string.identity_verification__vbank_vaccount_verification_failed_content_by_vreason, details2 != null ? details2.getBankName() : null, details2 != null ? details2.getBankAccountNumber() : null, kYCReminder.getRejectReason()), sn5.d(yhfVar2, R.string.identity_verification__resubmit, new Object[0]), sn5.d(yhfVar2, R.string.common_functions__cancel, new Object[0]), new dif(0, yhfVar2, details2), null, 136);
                        }
                    });
                }
            } else {
                pvi pviVar4 = yhfVar.X;
                if (pviVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                yhfVar.V0(pviVar4.G, kycReminder, sn5.d(yhfVar, R.string.page_withdraw__vaccount_verify, details != null ? details.getBankName() : null), sn5.d(yhfVar, R.string.page_payment__verify_account, new Object[0]), HintView.a.a, new View.OnClickListener() { // from class: bif
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        yhf yhfVar2 = yhfVar;
                        sif sifVarP1 = yhfVar2.P0();
                        Context contextRequireContext2 = yhfVar2.requireContext();
                        contextRequireContext2.getClass();
                        cup cupVar = sifVarP1.X0;
                        cupVar.getClass();
                        vn20.f(contextRequireContext2, "kyc_reminder", cupVar.a(kycReminder), true, true);
                        e eVarRequireActivity = yhfVar2.requireActivity();
                        KYCActivity.Companion companion = KYCActivity.E;
                        e eVarRequireActivity2 = yhfVar2.requireActivity();
                        eVarRequireActivity2.getClass();
                        KYCReminder.Details details2 = details;
                        yrh0.s(eVarRequireActivity, companion.newInstanceForBankAccountVerification(eVarRequireActivity2, details2 != null ? details2.getAssetId() : null), true);
                    }
                });
            }
        }
        return Unit.a;
    }
}
