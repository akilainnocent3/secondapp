package defpackage;

import com.sportybet.android.social.data.local.SocialFollowerEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o9a0 implements j9a0 {
    public final lv50 a;
    public final aag<SocialFollowerEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SocialFollowerEntity socialFollowerEntity = (SocialFollowerEntity) obj;
            hq60Var.getClass();
            socialFollowerEntity.getClass();
            hq60Var.L(1, socialFollowerEntity.getAccount());
            hq60Var.L(2, socialFollowerEntity.getNickname());
            hq60Var.L(3, socialFollowerEntity.getAvatarUrl());
            hq60Var.q(4, socialFollowerEntity.isFollowed() ? 1L : 0L);
            hq60Var.L(5, socialFollowerEntity.getUserType());
            hq60Var.q(6, socialFollowerEntity.getPageIndex());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_follower_table` (`account`,`nickname`,`avatar_url`,`is_followed`,`user_type`,`page_index`) VALUES (?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SocialFollowerEntity socialFollowerEntity = (SocialFollowerEntity) obj;
            hq60Var.getClass();
            socialFollowerEntity.getClass();
            hq60Var.L(1, socialFollowerEntity.getAccount());
            hq60Var.L(2, socialFollowerEntity.getNickname());
            hq60Var.L(3, socialFollowerEntity.getAvatarUrl());
            hq60Var.q(4, socialFollowerEntity.isFollowed() ? 1L : 0L);
            hq60Var.L(5, socialFollowerEntity.getUserType());
            hq60Var.q(6, socialFollowerEntity.getPageIndex());
            hq60Var.L(7, socialFollowerEntity.getAccount());
            hq60Var.L(8, socialFollowerEntity.getNickname());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_follower_table` SET `account` = ?,`nickname` = ?,`avatar_url` = ?,`is_followed` = ?,`user_type` = ?,`page_index` = ? WHERE `account` = ? AND `nickname` = ?";
        }
    }

    public o9a0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.j9a0
    public final q9a0 a(final String str) {
        return new q9a0(new bw50("SELECT * FROM social_follower_table WHERE account = ? ORDER BY page_index ASC", new Function1() { // from class: n9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                hq60Var.L(1, str);
                return Unit.a;
            }
        }), this, this.a, new String[]{"social_follower_table"});
    }

    @Override // defpackage.j9a0
    public final Object b(final String str, final boolean z, tje0 tje0Var) {
        Object objC = qlc.c(tje0Var, this.a, new Function1() { // from class: k9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                boolean z2 = z;
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("UPDATE social_follower_table SET is_followed = ? WHERE nickname = ?");
                try {
                    hq60VarH1.q(1, z2 ? 1L : 0L);
                    hq60VarH1.L(2, str2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.j9a0
    public final Object c(final String str, s9a0 s9a0Var) {
        Object objC = qlc.c(s9a0Var, this.a, new Function1() { // from class: l9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_follower_table WHERE account = ?");
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

    @Override // defpackage.j9a0
    public final Object d(final ArrayList arrayList, s9a0 s9a0Var) {
        Object objC = qlc.c(s9a0Var, this.a, new Function1() { // from class: m9a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.b(vp60Var, arrayList);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
