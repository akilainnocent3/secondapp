package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bue {
    public static final ResourceUiText a(aue aueVar) {
        if (aueVar instanceof aue.b) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__dob_gift_locked_tier_only_description);
        }
        if (aueVar instanceof aue.c) {
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__dob_gift_ready_to_claim_description);
        }
        if (aueVar instanceof aue.a) {
            StringUiText stringUiText3 = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__dob_gift_requires_verification_description);
        }
        if (!(aueVar instanceof aue.d)) {
            uhc.a();
            return null;
        }
        Object[] objArr = {((aue.d) aueVar).a};
        StringUiText stringUiText4 = vch0.a;
        return new ResourceUiText(R.string.page_loyalty__dob_gift_unqualified_tier_description, ay0.S(objArr));
    }

    public static final boolean b(aue aueVar) {
        if (aueVar instanceof aue.c) {
            return ((aue.c) aueVar).b;
        }
        if (aueVar instanceof aue.b) {
            return ((aue.b) aueVar).c;
        }
        if (aueVar instanceof aue.a) {
            return ((aue.a) aueVar).c;
        }
        if (aueVar instanceof aue.d) {
            return ((aue.d) aueVar).b;
        }
        uhc.a();
        return false;
    }

    public static final ResourceUiText c(aue aueVar) {
        if (aueVar instanceof aue.a) {
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_loyalty__dob_verification_gift);
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.page_loyalty__birthday_gift);
    }
}
