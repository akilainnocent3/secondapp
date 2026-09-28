package defpackage;

import com.sportybet.android.social.data.local.SocialFollowingCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class y9a0 implements u9a0 {
    public final lv50 a;
    public final aag<SocialFollowingCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SocialFollowingCursorEntity socialFollowingCursorEntity = (SocialFollowingCursorEntity) obj;
            hq60Var.getClass();
            socialFollowingCursorEntity.getClass();
            hq60Var.L(1, socialFollowingCursorEntity.getAccount());
            hq60Var.q(2, socialFollowingCursorEntity.getPageNo());
            hq60Var.q(3, socialFollowingCursorEntity.getPageSize());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_following_cursor_table` (`account`,`pageNo`,`pageSize`) VALUES (?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SocialFollowingCursorEntity socialFollowingCursorEntity = (SocialFollowingCursorEntity) obj;
            hq60Var.getClass();
            socialFollowingCursorEntity.getClass();
            hq60Var.L(1, socialFollowingCursorEntity.getAccount());
            hq60Var.q(2, socialFollowingCursorEntity.getPageNo());
            hq60Var.q(3, socialFollowingCursorEntity.getPageSize());
            hq60Var.L(4, socialFollowingCursorEntity.getAccount());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_following_cursor_table` SET `account` = ?,`pageNo` = ?,`pageSize` = ? WHERE `account` = ?";
        }
    }

    public y9a0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.u9a0
    public final Object a(final String str, gaa0 gaa0Var) {
        return qlc.c(gaa0Var, this.a, new Function1() { // from class: v9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM social_following_cursor_table WHERE account = ?");
                try {
                    hq60VarH1.L(1, str2);
                    return hq60VarH1.D1() ? new SocialFollowingCursorEntity(hq60VarH1.k1(l0b.b(hq60VarH1, "account")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageNo")), (int) hq60VarH1.getLong(l0b.b(hq60VarH1, "pageSize"))) : null;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.u9a0
    public final Object b(final SocialFollowingCursorEntity socialFollowingCursorEntity, haa0 haa0Var) {
        Object objC = qlc.c(haa0Var, this.a, new Function1() { // from class: x9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.c(vp60Var, socialFollowingCursorEntity);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.u9a0
    public final Object c(final String str, haa0 haa0Var) {
        Object objC = qlc.c(haa0Var, this.a, new Function1() { // from class: w9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_following_cursor_table  WHERE account = ?");
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
