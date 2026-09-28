package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class khb0 implements jhb0 {
    public final lv50 a;

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            hq60Var.getClass();
            ((phb0) obj).getClass();
            hq60Var.L(1, null);
            throw null;
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `sporty_bet_table` (`end_point`,`extra_identifier`,`by_user`,`response_json_string`) VALUES (?,?,?,?)";
        }
    }

    public khb0(lv50 lv50Var) {
        this.a = lv50Var;
        new a();
    }

    @Override // defpackage.jhb0
    public final Object a(String str, nhb0 nhb0Var) {
        return qlc.c(nhb0Var, this.a, new gbb(str, 1), true, false);
    }

    @Override // defpackage.jhb0
    public final Object b(w9 w9Var) {
        Object objC = qlc.c(w9Var, this.a, new fbb(1), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.jhb0
    public final Object c(mhb0 mhb0Var) {
        Object objC = qlc.c(mhb0Var, this.a, new hwp(1), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
