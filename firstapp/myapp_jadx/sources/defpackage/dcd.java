package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.CMSRes;

/* JADX INFO: loaded from: classes7.dex */
public class dcd extends jp5 {
    public final int b;
    public final CMSRes c;
    public final CMSRes d;
    public final CMSRes e;
    public final CMSRes f;
    public final CMSRes g;
    public final CMSRes h;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcd(on5 on5Var) {
        super(on5Var);
        on5Var.getClass();
        this.b = a.class.hashCode();
        this.c = on5.h(this, this, "sg_common_dialog_message", "unavailable_country", null, Integer.valueOf(R.string.sg_common_dialog_message__unavailable_country), 4);
        this.d = on5.h(this, this, "sg_common_dialog_message", "msg_something_went_wrong", null, Integer.valueOf(R.string.sg_common_dialog_message__msg_something_went_wrong), 4);
        this.e = on5.h(this, this, "sg_common_dialog_message", "app_payout_outdated", null, Integer.valueOf(R.string.sg_common_dialog_message__app_payout_outdated), 4);
        this.f = on5.h(this, this, "sg_common_dialog_message", "err_something_wrong_try_later", null, Integer.valueOf(R.string.sg_common_dialog_message__err_something_wrong_try_later), 4);
        this.g = on5.h(this, this, "sg_common_dialog_message", "err_gift_not_applicable", null, Integer.valueOf(R.string.sg_common_dialog_message__err_gift_not_applicable), 4);
        this.h = on5.h(this, this, "sg_common_dialog_message", "blocked_msg", null, Integer.valueOf(R.string.sg_common_dialog_message__blocked_msg), 4);
    }

    @Override // defpackage.jp5
    public final int t() {
        return this.b;
    }
}
