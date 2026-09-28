package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sporty.android.core.model.kyc.phonemigration.VerifyNameMatchResult;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ik implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ dk b;

    @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$verifyNameMatch$$inlined$handleApiResult$default$1", f = "AddNewMobileNumberViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return ik.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dk b;

        @c0d(c = "com.sportybet.android.payment.deposit.presentation.viewmodel.AddNewMobileNumberViewModel$verifyNameMatch$$inlined$handleApiResult$default$1$2", f = "AddNewMobileNumberViewModel.kt", l = {50}, m = "emit", v = 2)
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
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, dk dkVar) {
            this.a = myhVar;
            this.b = dkVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            us00 dVar;
            dk dkVar = this.b;
            wwd0 wwd0Var = dkVar.E;
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
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    VerifyNameMatchResult verifyNameMatchResult = (VerifyNameMatchResult) ((lk50.c) lk50Var).a;
                    wwd0Var.setValue(tzs.a.a);
                    dkVar.i.put("name_matched_verify_token", verifyNameMatchResult.getToken());
                    boolean otpForMainAccountEnabled = dkVar.e.getOtpForMainAccountEnabled();
                    PhoneMigrateParams phoneMigrateParams = dkVar.e;
                    if (otpForMainAccountEnabled) {
                        dkVar.y.a(new PhoneMigrateEvent.LaunchMainOTP(dkVar.z1(phoneMigrateParams.getMainUserPhone(), dkVar.b.P(), phoneMigrateParams.getPasswordVerifyToken(), true)));
                    } else {
                        boolean otpForSubsidiaryAccountEnabled = phoneMigrateParams.getOtpForSubsidiaryAccountEnabled();
                        PhoneMigrateParams phoneMigrateParams2 = dkVar.e;
                        if (otpForSubsidiaryAccountEnabled) {
                            dkVar.y1(phoneMigrateParams2);
                        } else {
                            dkVar.x1(phoneMigrateParams2);
                        }
                    }
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
                        com.sporty.android.common.uievent.b.e(ku90Var, new ResourceUiText(R.string.page_payment__unable_to_add_number), null, vch0.b, null, null, null, null, 506);
                    }
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0Var.setValue(tzs.b.a);
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
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

    public ik(yzh yzhVar, dk dkVar) {
        this.a = yzhVar;
        this.b = dkVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
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
