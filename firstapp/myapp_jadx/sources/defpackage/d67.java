package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.RelativeLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.ChangeUserInfoActivity;
import java.net.ConnectException;

/* JADX INFO: loaded from: classes6.dex */
public final class d67 extends fte<BaseResponse<Boolean>> {
    public final /* synthetic */ ChangeUserInfoActivity a;

    public d67(ChangeUserInfoActivity changeUserInfoActivity) {
        this.a = changeUserInfoActivity;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        boolean z = th instanceof ConnectException;
        ChangeUserInfoActivity changeUserInfoActivity = this.a;
        if (!z) {
            changeUserInfoActivity.A1(changeUserInfoActivity.getCMSString(R.string.common_feedback__something_went_wrong_tip, new Object[0]));
        } else {
            int i = ChangeUserInfoActivity.L;
            changeUserInfoActivity.A1(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) baseResponse.data).booleanValue();
        ChangeUserInfoActivity changeUserInfoActivity = this.a;
        RelativeLayout relativeLayout = changeUserInfoActivity.E;
        if (!zBooleanValue) {
            relativeLayout.setVisibility(0);
            changeUserInfoActivity.F.setVisibility(8);
            changeUserInfoActivity.v.post(new Runnable() { // from class: c67
                @Override // java.lang.Runnable
                public final void run() {
                    ChangeUserInfoActivity changeUserInfoActivity2 = this.a.a;
                    changeUserInfoActivity2.v.requestFocus();
                    lop.c(changeUserInfoActivity2.v);
                    if (changeUserInfoActivity2.v.length() > 0) {
                        changeUserInfoActivity2.v.selectAll();
                    }
                }
            });
            return;
        }
        relativeLayout.setVisibility(8);
        changeUserInfoActivity.F.setVisibility(0);
        changeUserInfoActivity.G.setText(changeUserInfoActivity.c);
        String cMSString = changeUserInfoActivity.getCMSString(a8b.c().e(), new Object[0]);
        String cMSString2 = changeUserInfoActivity.getCMSString(R.string.my_account__note_once_your_email_address_is_verified_etc, cMSString);
        SpannableString spannableString = new SpannableString(cMSString2);
        int iIndexOf = cMSString2.indexOf(cMSString);
        spannableString.setSpan(new ForegroundColorSpan(changeUserInfoActivity.G.getContext().getColor(R.color.other002)), iIndexOf, cMSString.length() + iIndexOf, 34);
        changeUserInfoActivity.H.setText(spannableString);
    }
}
