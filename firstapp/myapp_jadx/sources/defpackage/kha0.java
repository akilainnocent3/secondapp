package defpackage;

import com.sportybet.android.social.data.local.SocShareCodeCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class kha0 implements gha0 {
    public final lv50 a;
    public final aag<SocShareCodeCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SocShareCodeCursorEntity socShareCodeCursorEntity = (SocShareCodeCursorEntity) obj;
            hq60Var.getClass();
            socShareCodeCursorEntity.getClass();
            hq60Var.L(1, socShareCodeCursorEntity.getUsername());
            hq60Var.q(2, socShareCodeCursorEntity.getPageNo());
            hq60Var.q(3, socShareCodeCursorEntity.getPageSize());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_share_code_cursor_table` (`username`,`pageNo`,`pageSize`) VALUES (?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SocShareCodeCursorEntity socShareCodeCursorEntity = (SocShareCodeCursorEntity) obj;
            hq60Var.getClass();
            socShareCodeCursorEntity.getClass();
            hq60Var.L(1, socShareCodeCursorEntity.getUsername());
            hq60Var.q(2, socShareCodeCursorEntity.getPageNo());
            hq60Var.q(3, socShareCodeCursorEntity.getPageSize());
            hq60Var.L(4, socShareCodeCursorEntity.getUsername());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_share_code_cursor_table` SET `username` = ?,`pageNo` = ?,`pageSize` = ? WHERE `username` = ?";
        }
    }

    public kha0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.gha0
    public final Object a(final String str, rha0 rha0Var) {
        return qlc.c(rha0Var, this.a, new Function1() { // from class: iha0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM social_share_code_cursor_table WHERE username = ?");
                try {
                    hq60VarH1.L(1, str2);
                    return hq60VarH1.D1() ? new SocShareCodeCursorEntity(hq60VarH1.k1(l0b.b(hq60VarH1, "username")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageNo")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageSize"))) : null;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.gha0
    public final Object b(final SocShareCodeCursorEntity socShareCodeCursorEntity, sha0 sha0Var) {
        Object objC = qlc.c(sha0Var, this.a, new Function1() { // from class: hha0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.c(vp60Var, socShareCodeCursorEntity);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.gha0
    public final Object c(final String str, sha0 sha0Var) {
        Object objC = qlc.c(sha0Var, this.a, new Function1() { // from class: jha0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_share_code_cursor_table  WHERE username = ?");
                try {
                    hq60VarH1.L(1, str2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
