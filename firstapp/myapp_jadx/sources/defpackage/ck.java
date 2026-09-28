package defpackage;

import com.sporty.android.core.model.patron.BindNewPhoneApiResult;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ck implements pdd0 {
    public final bag a;
    public final BindNewPhoneApiResult b;

    public ck(bag bagVar, BindNewPhoneApiResult bindNewPhoneApiResult) {
        bagVar.getClass();
        bindNewPhoneApiResult.getClass();
        this.a = bagVar;
        this.b = bindNewPhoneApiResult;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        String str;
        Pair pair = new Pair("entrance", this.a.K0());
        BindNewPhoneApiResult bindNewPhoneApiResult = this.b;
        if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.Success) {
            str = "Success";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.InvalidPhoneNumber) {
            str = "Invalid Phone Number";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.PhoneAlreadyRegisteredToAnotherAcc) {
            str = "Phone Already Registered To Another Account";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.PhoneAlreadyBoundedToCurrentAcc) {
            str = "Phone Already Bound To Current Account";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.MultiPhoneDisabled) {
            str = "Multi Phone Disabled";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.ReachedPhoneNumberLimit) {
            str = "Reached Phone Number Limit";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.NameConfirmNotVerified) {
            str = "Name Confirm Not Verified";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.NameUnverifiable) {
            str = "Name Unverifiable";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.NameMismatched) {
            str = "Name Mismatched";
        } else if (bindNewPhoneApiResult instanceof BindNewPhoneApiResult.HubtelApiFail) {
            str = "Hubtel Api Fail";
        } else {
            if (!(bindNewPhoneApiResult instanceof BindNewPhoneApiResult.UnknownError)) {
                uhc.a();
                return null;
            }
            str = "Unknown Error";
        }
        return kpu.d(pair, new Pair(AnalyticsParam.EVENT_PARAM_RESULT, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return Intrinsics.g(this.a, ckVar.a) && Intrinsics.g(this.b, ckVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "add_number__submit";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubmitEvent(entrance=" + this.a + ", result=" + this.b + ")";
    }
}
