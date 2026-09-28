package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.CustomAlertDialogCallbackType;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$migratePhone$2", f = "AddNewMobileNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hk extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dk b;

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$migratePhone$2$1", f = "AddNewMobileNumberViewModel.kt", l = {435}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ dk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dk dkVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dkVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            dk dkVar = this.b;
            if (i == 0) {
                uj50.b(obj);
                ku90<com.sporty.android.common.uievent.a> ku90Var = dkVar.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__new_phone_number_added);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__kyc_migrate_phone_success_message, ay0.S(new Object[]{dkVar.e.getKycFailedUserPhone(), vtu.a(dkVar.e.getMainUserPhone())}));
                this.a = 1;
                obj = b.g(ku90Var, resourceUiText, resourceUiText2, null, null, null, null, this, 508);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((CustomAlertDialogCallbackType) obj) instanceof CustomAlertDialogCallbackType.Positive) {
                dkVar.y.a(PhoneMigrateEvent.DepositTransferSuccess.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(dk dkVar, v1b<? super hk> v1bVar) {
        super(2, v1bVar);
        this.b = dkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hk hkVar = new hk(this.b, v1bVar);
        hkVar.a = obj;
        return hkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hk) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        us00 dVar;
        dk dkVar = this.b;
        wwd0 wwd0Var = dkVar.E;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            wwd0Var.setValue(tzs.a.a);
            ej5.c(o8i0.d(dkVar), null, null, new a(dkVar, null), 3);
        } else if (lk50Var instanceof lk50.a) {
            wwd0Var.setValue(tzs.a.a);
            Throwable th = ((lk50.a) lk50Var).a;
            if (th instanceof SprThrowable) {
                SprThrowable sprThrowable = (SprThrowable) th;
                Integer num = new Integer(sprThrowable.getD());
                String e = sprThrowable.getE();
                if (num.intValue() == 11619) {
                    dVar = new us00.c(e);
                } else if (num.intValue() == 11620) {
                    dVar = new us00.b(e);
                } else if (num.intValue() == 12203) {
                    dVar = new us00.a(e);
                } else {
                    dVar = num.intValue() == 12237 ? new us00.d(e) : new us00.e(e);
                }
                dkVar.A1(dVar);
            } else {
                ku90<com.sporty.android.common.uievent.a> ku90Var = dkVar.v;
                StringUiText stringUiText = vch0.a;
                b.e(ku90Var, new ResourceUiText(R.string.page_payment__unable_to_add_number), null, vch0.b, null, null, null, null, 506);
            }
        } else {
            if (!(lk50Var instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            wwd0Var.setValue(tzs.b.a);
        }
        return Unit.a;
    }
}
