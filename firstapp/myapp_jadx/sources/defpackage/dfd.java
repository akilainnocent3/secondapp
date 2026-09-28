package defpackage;

import com.sportygames.newcms.CMSRes;

/* JADX INFO: loaded from: classes7.dex */
public class dfd extends jp5 implements zi40 {
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
    public dfd(on5 on5Var) {
        super(on5Var);
        on5Var.getClass();
        this.b = a.class.hashCode();
        this.c = on5.h(this, this, "sg_exit_dialog", "you_may_like", null, null, 12);
        this.d = on5.h(this, this, "sg_common_dialog_message", "exit_confirm_msg", null, null, 12);
        this.e = on5.h(this, this, "sg_common_dialog_message", "exit_btn", null, null, 12);
        this.f = on5.h(this, this, "sg_common_dialog_message", "stay_btn", null, null, 12);
        this.g = on5.h(this, this, "sg_common_dialog_message", "unavailable_country", null, null, 12);
        this.h = on5.h(this, this, "sg_common_dialog_message", "blocked_msg", null, null, 12);
    }

    @Override // defpackage.zi40
    public final CMSRes a() {
        return this.e;
    }

    @Override // defpackage.zi40
    public final CMSRes c() {
        return this.c;
    }

    @Override // defpackage.zi40
    public final CMSRes l() {
        return this.f;
    }

    @Override // defpackage.zi40
    public final CMSRes o() {
        return this.d;
    }

    @Override // defpackage.jp5
    public final int t() {
        return this.b;
    }
}
