package defpackage;

import com.sportybet.android.social.data.local.SocFollowingCodeEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class r7a0 implements q7a0 {
    public final fha0 a = new fha0();

    public static final class a extends y3l {
        public a() {
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SocFollowingCodeEntity socFollowingCodeEntity = (SocFollowingCodeEntity) obj;
            hq60Var.getClass();
            socFollowingCodeEntity.getClass();
            hq60Var.L(1, socFollowingCodeEntity.getAccount());
            hq60Var.q(2, socFollowingCodeEntity.getPageIndex());
            hq60Var.L(3, socFollowingCodeEntity.getNickname());
            hq60Var.L(4, socFollowingCodeEntity.getAvatarUrl());
            hq60Var.L(5, socFollowingCodeEntity.getCountry());
            hq60Var.L(6, socFollowingCodeEntity.getUserType());
            hq60Var.L(7, socFollowingCodeEntity.getShareCode());
            hq60Var.i(8, socFollowingCodeEntity.getTotalOdds());
            hq60Var.q(9, socFollowingCodeEntity.getFoldsAmount());
            hq60Var.L(10, socFollowingCodeEntity.getUserId());
            hq60Var.q(11, socFollowingCodeEntity.getDeadline());
            hq60Var.q(12, socFollowingCodeEntity.getCreateTime());
            String strB = r7a0.this.a.b(socFollowingCodeEntity.getShareCodeDetail());
            if (strB == null) {
                hq60Var.r(13);
            } else {
                hq60Var.L(13, strB);
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_following_code_table` (`account`,`page_index`,`nickname`,`avatar_url`,`country`,`user_type`,`share_code`,`total_odds`,`folds_amount`,`user_id`,`deadline`,`create_time`,`share_code_detail`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        public b() {
        }

        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SocFollowingCodeEntity socFollowingCodeEntity = (SocFollowingCodeEntity) obj;
            hq60Var.getClass();
            socFollowingCodeEntity.getClass();
            hq60Var.L(1, socFollowingCodeEntity.getAccount());
            hq60Var.q(2, socFollowingCodeEntity.getPageIndex());
            hq60Var.L(3, socFollowingCodeEntity.getNickname());
            hq60Var.L(4, socFollowingCodeEntity.getAvatarUrl());
            hq60Var.L(5, socFollowingCodeEntity.getCountry());
            hq60Var.L(6, socFollowingCodeEntity.getUserType());
            hq60Var.L(7, socFollowingCodeEntity.getShareCode());
            hq60Var.i(8, socFollowingCodeEntity.getTotalOdds());
            hq60Var.q(9, socFollowingCodeEntity.getFoldsAmount());
            hq60Var.L(10, socFollowingCodeEntity.getUserId());
            hq60Var.q(11, socFollowingCodeEntity.getDeadline());
            hq60Var.q(12, socFollowingCodeEntity.getCreateTime());
            String strB = r7a0.this.a.b(socFollowingCodeEntity.getShareCodeDetail());
            if (strB == null) {
                hq60Var.r(13);
            } else {
                hq60Var.L(13, strB);
            }
            hq60Var.L(14, socFollowingCodeEntity.getShareCode());
            hq60Var.L(15, socFollowingCodeEntity.getAccount());
            hq60Var.L(16, socFollowingCodeEntity.getNickname());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_following_code_table` SET `account` = ?,`page_index` = ?,`nickname` = ?,`avatar_url` = ?,`country` = ?,`user_type` = ?,`share_code` = ?,`total_odds` = ?,`folds_amount` = ?,`user_id` = ?,`deadline` = ?,`create_time` = ?,`share_code_detail` = ? WHERE `share_code` = ? AND `account` = ? AND `nickname` = ?";
        }
    }

    public r7a0(lv50 lv50Var) {
        new a();
        new b();
    }
}
