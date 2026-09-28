package defpackage;

import com.sportybet.android.social.data.local.SocialFollowerCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class i9a0 implements e9a0 {
    public final lv50 a;
    public final aag<SocialFollowerCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SocialFollowerCursorEntity socialFollowerCursorEntity = (SocialFollowerCursorEntity) obj;
            hq60Var.getClass();
            socialFollowerCursorEntity.getClass();
            hq60Var.L(1, socialFollowerCursorEntity.getAccount());
            hq60Var.q(2, socialFollowerCursorEntity.getPageNo());
            hq60Var.q(3, socialFollowerCursorEntity.getPageSize());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_follower_cursor_table` (`account`,`pageNo`,`pageSize`) VALUES (?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SocialFollowerCursorEntity socialFollowerCursorEntity = (SocialFollowerCursorEntity) obj;
            hq60Var.getClass();
            socialFollowerCursorEntity.getClass();
            hq60Var.L(1, socialFollowerCursorEntity.getAccount());
            hq60Var.q(2, socialFollowerCursorEntity.getPageNo());
            hq60Var.q(3, socialFollowerCursorEntity.getPageSize());
            hq60Var.L(4, socialFollowerCursorEntity.getAccount());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_follower_cursor_table` SET `account` = ?,`pageNo` = ?,`pageSize` = ? WHERE `account` = ?";
        }
    }

    public i9a0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.e9a0
    public final Object a(final String str, s9a0 s9a0Var) {
        Object objC = qlc.c(s9a0Var, this.a, new Function1() { // from class: f9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_follower_cursor_table  WHERE account = ?");
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

    @Override // defpackage.e9a0
    public final Object b(final String str, r9a0 r9a0Var) {
        return qlc.c(r9a0Var, this.a, new Function1() { // from class: g9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM social_follower_cursor_table WHERE account = ?");
                try {
                    hq60VarH1.L(1, str2);
                    return hq60VarH1.D1() ? new SocialFollowerCursorEntity(hq60VarH1.k1(l0b.b(hq60VarH1, "account")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageNo")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageSize"))) : null;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.e9a0
    public final Object c(final SocialFollowerCursorEntity socialFollowerCursorEntity, s9a0 s9a0Var) {
        Object objC = qlc.c(s9a0Var, this.a, new Function1() { // from class: h9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.c(vp60Var, socialFollowerCursorEntity);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
