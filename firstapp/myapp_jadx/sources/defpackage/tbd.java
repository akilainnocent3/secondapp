package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.newcms.CMSRes;

/* JADX INFO: loaded from: classes7.dex */
public class tbd extends jp5 implements aje {
    public final int b;
    public final CMSRes c;
    public final CMSRes d;
    public final CMSRes e;
    public final CMSRes f;
    public final CMSRes g;
    public final CMSRes h;
    public final CMSRes i;
    public final CMSRes j;
    public final CMSRes k;
    public final CMSRes l;
    public final CMSRes m;
    public final CMSRes n;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbd(on5 on5Var) {
        super(on5Var);
        on5Var.getClass();
        this.b = a.class.hashCode();
        this.c = on5.h(this, this, "sg_common_dialog_message", "login_btn", null, Integer.valueOf(R.string.sg_common__login_btn), 4);
        this.d = on5.h(this, this, "sg_common_dialog_message", "exit_btn", null, Integer.valueOf(R.string.sg_common_dialog_message__exit_btn), 4);
        this.e = on5.h(this, this, "sg_common_dialog_message", "err_login", null, Integer.valueOf(R.string.sg_common_dialog_message__err_login), 4);
        this.f = on5.h(this, this, "sg_common_dialog_message", "ok_btn", null, Integer.valueOf(R.string.sg_common_dialog_message__ok_btn), 4);
        this.g = on5.h(this, this, "sg_common_dialog_message", "low_balance_message", null, null, 12);
        this.h = on5.h(this, this, "sg_common_dialog_message", "add_money_btn", null, null, 12);
        this.i = on5.h(this, this, "sg_common_dialog_message", "place_bet_message", null, Integer.valueOf(R.string.sg_common_dialog_message__place_bet_message), 4);
        this.j = on5.h(this, this, "sg_common_dialog_message", "cancel_btn", null, null, 12);
        this.k = on5.h(this, this, "sg_common_dialog_message", "confirm_btn", null, null, 12);
        this.l = on5.h(this, this, "sg_common_dialog_message", "yes_btn", null, null, 12);
        this.m = on5.h(this, this, "sg_common_dialog_message", "no_btn", null, null, 12);
        this.n = on5.h(this, this, "sg_common_dialog_message", "otb_dialog_msg", null, null, 12);
    }

    @Override // defpackage.aje
    public final CMSRes f() {
        return this.e;
    }

    @Override // defpackage.aje
    public final CMSRes g() {
        return this.c;
    }

    @Override // defpackage.aje
    public final CMSRes m() {
        return this.g;
    }

    @Override // defpackage.aje
    public final CMSRes n() {
        return this.h;
    }

    @Override // defpackage.aje
    public final CMSRes p() {
        return this.d;
    }

    @Override // defpackage.jp5
    public final int t() {
        return this.b;
    }
}
