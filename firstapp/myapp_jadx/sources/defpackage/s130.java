package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$initializeProfileData$2", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s130 extends tje0 implements jaj<AccountInfo, PrimaryPhoneConfig, EmailChangeConfigResponse, Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ AccountInfo a;
    public /* synthetic */ PrimaryPhoneConfig b;
    public /* synthetic */ EmailChangeConfigResponse c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ a230 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s130(a230 a230Var, v1b<? super s130> v1bVar) {
        super(5, v1bVar);
        this.e = a230Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        eye eyeVar;
        boolean z;
        boolean z2;
        Date dateA;
        Long lS0;
        AccountInfo accountInfo = this.a;
        PrimaryPhoneConfig primaryPhoneConfig = this.b;
        EmailChangeConfigResponse emailChangeConfigResponse = this.c;
        boolean z3 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        a230 a230Var = this.e;
        psm psmVar = a230Var.a;
        String withdrawLimitAmount = primaryPhoneConfig.getWithdrawLimitAmount();
        if (StringsKt.U(withdrawLimitAmount)) {
            withdrawLimitAmount = null;
        }
        PrimaryPhoneConfig primaryPhoneConfigCopy$default = PrimaryPhoneConfig.copy$default(primaryPhoneConfig, false, false, false, 0, false, 0, false, 0, String.format(Locale.US, "%,.2f", BigDecimal.valueOf((withdrawLimitAmount == null || (lS0 = StringsKt.s0(withdrawLimitAmount)) == null) ? 0L : lS0.longValue())), 0, 767, null);
        boolean zN = psmVar.n();
        boolean zU = StringsKt.U(accountInfo.getBirthday());
        boolean ninDobVerificationEnabled = accountInfo.getNinDobVerificationEnabled();
        boolean dobVerifiedByNin = accountInfo.getDobVerifiedByNin();
        boolean editableBirthday = accountInfo.getEditableBirthday();
        if (zN && ninDobVerificationEnabled && !dobVerifiedByNin) {
            eyeVar = eye.c;
        } else if (zU || !editableBirthday || ninDobVerificationEnabled) {
            eyeVar = (zU || (!dobVerifiedByNin && editableBirthday)) ? eye.d : eye.b;
        } else {
            eyeVar = eye.a;
        }
        eye eyeVar2 = eyeVar;
        String birthday = accountInfo.getBirthday();
        String strL = "";
        if (!StringsKt.U(birthday) && (dateA = pwf0.a(birthday, "yyyyMMdd", false, owf0.a)) != null) {
            Locale locale = Locale.US;
            locale.getClass();
            strL = bwf0.l(dateA, "dd/MM/yyyy", locale, 0, 0);
        }
        wwd0 wwd0Var = a230Var.z;
        while (true) {
            Object value = wwd0Var.getValue();
            j130 j130Var = (j130) value;
            if (accountInfo.getNinEnabled() && psmVar.n()) {
                z2 = true;
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            String str = strL;
            eye eyeVar3 = eyeVar2;
            boolean z4 = z2;
            EmailChangeConfigResponse emailChangeConfigResponse2 = emailChangeConfigResponse;
            if (wwd0Var.g(value, j130.a(j130Var, accountInfo, primaryPhoneConfigCopy$default, emailChangeConfigResponse2, z4, gwe.a(j130Var.e, strL, false, eyeVar2, (eyeVar2 == eye.d || eyeVar2 == eye.a) ? z : false, 2), z3, false, false, null, 448))) {
                return Unit.a;
            }
            emailChangeConfigResponse = emailChangeConfigResponse2;
            eyeVar2 = eyeVar3;
            strL = str;
        }
    }

    @Override // defpackage.jaj
    public final Object l(AccountInfo accountInfo, PrimaryPhoneConfig primaryPhoneConfig, EmailChangeConfigResponse emailChangeConfigResponse, Boolean bool, v1b<? super Unit> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        s130 s130Var = new s130(this.e, v1bVar);
        s130Var.a = accountInfo;
        s130Var.b = primaryPhoneConfig;
        s130Var.c = emailChangeConfigResponse;
        s130Var.d = zBooleanValue;
        return s130Var.invokeSuspend(Unit.a);
    }
}
