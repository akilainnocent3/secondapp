package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX INFO: loaded from: classes7.dex */
public class vfd extends jp5 implements vd90 {
    public final int b;
    public final CMSRes c;
    public final CMSRes d;
    public final CMSRes e;
    public final CMSRes f;
    public final CMSRes g;
    public final CMSRes h;
    public final CMSRes i;
    public final CMSRes j;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfd(on5 on5Var) {
        super(on5Var);
        on5Var.getClass();
        this.b = a.class.hashCode();
        this.c = on5.h(this, this, "sg_ham_menu", "music", null, null, 12);
        this.d = on5.h(this, this, "sg_ham_menu", "sound", null, null, 12);
        this.e = on5.h(this, this, "sg_ham_menu", "one_tap_bet", null, null, 12);
        this.f = on5.h(this, this, "sg_ham_menu", "turbo", null, null, 12);
        this.g = on5.h(this, this, "sg_ham_menu", "how_to_play", null, null, 12);
        this.h = on5.h(this, this, "sg_ham_menu", "bet_history", null, null, 12);
        this.i = on5.h(this, this, "sg_ham_menu", "hello_guest", null, null, 12);
        this.j = on5.h(this, this, "sg_common_dialog_message", "add_money_btn", null, null, 12);
    }

    @Override // defpackage.vd90
    public final CMSRes j() {
        return this.j;
    }

    @Override // defpackage.jp5
    public final int t() {
        return this.b;
    }
}
