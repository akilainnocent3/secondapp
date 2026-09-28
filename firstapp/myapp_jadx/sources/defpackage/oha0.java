package defpackage;

import com.sportybet.android.social.data.local.SocShareCodeEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class oha0 implements lha0 {
    public final lv50 a;
    public final fha0 c = new fha0();
    public final aag<SocShareCodeEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        public a() {
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            String str;
            SocShareCodeEntity socShareCodeEntity = (SocShareCodeEntity) obj;
            hq60Var.getClass();
            socShareCodeEntity.getClass();
            hq60Var.L(1, socShareCodeEntity.getUsername());
            hq60Var.L(2, socShareCodeEntity.getShareCode());
            hq60Var.i(3, socShareCodeEntity.getTotalOdds());
            hq60Var.q(4, socShareCodeEntity.getFoldsAmount());
            hq60Var.L(5, socShareCodeEntity.getUserId());
            hq60Var.q(6, socShareCodeEntity.getDeadline());
            hq60Var.q(7, socShareCodeEntity.getCreateTime());
            String strB = oha0.this.c.b(socShareCodeEntity.getShareCodeDetail());
            if (strB == null) {
                hq60Var.r(8);
            } else {
                hq60Var.L(8, strB);
            }
            String note = socShareCodeEntity.getNote();
            if (note == null) {
                hq60Var.r(9);
            } else {
                hq60Var.L(9, note);
            }
            z320 popularityLevel = socShareCodeEntity.getPopularityLevel();
            if (popularityLevel == null) {
                hq60Var.r(10);
            } else {
                int iOrdinal = popularityLevel.ordinal();
                if (iOrdinal == 0) {
                    str = "NEARLY_FULL";
                } else if (iOrdinal == 1) {
                    str = "HIGH_DEMAND";
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    str = "SAFE";
                }
                hq60Var.L(10, str);
            }
            hq60Var.q(11, socShareCodeEntity.isCreatorCode() ? 1L : 0L);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `social_share_code_table` (`username`,`share_code`,`total_odds`,`folds_amount`,`user_id`,`deadline`,`create_time`,`share_code_detail`,`note`,`popularity_level`,`is_creator_code`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        public b() {
        }

        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            String str;
            SocShareCodeEntity socShareCodeEntity = (SocShareCodeEntity) obj;
            hq60Var.getClass();
            socShareCodeEntity.getClass();
            hq60Var.L(1, socShareCodeEntity.getUsername());
            hq60Var.L(2, socShareCodeEntity.getShareCode());
            hq60Var.i(3, socShareCodeEntity.getTotalOdds());
            hq60Var.q(4, socShareCodeEntity.getFoldsAmount());
            hq60Var.L(5, socShareCodeEntity.getUserId());
            hq60Var.q(6, socShareCodeEntity.getDeadline());
            hq60Var.q(7, socShareCodeEntity.getCreateTime());
            String strB = oha0.this.c.b(socShareCodeEntity.getShareCodeDetail());
            if (strB == null) {
                hq60Var.r(8);
            } else {
                hq60Var.L(8, strB);
            }
            String note = socShareCodeEntity.getNote();
            if (note == null) {
                hq60Var.r(9);
            } else {
                hq60Var.L(9, note);
            }
            z320 popularityLevel = socShareCodeEntity.getPopularityLevel();
            if (popularityLevel == null) {
                hq60Var.r(10);
            } else {
                int iOrdinal = popularityLevel.ordinal();
                if (iOrdinal == 0) {
                    str = "NEARLY_FULL";
                } else if (iOrdinal == 1) {
                    str = "HIGH_DEMAND";
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    str = "SAFE";
                }
                hq60Var.L(10, str);
            }
            hq60Var.q(11, socShareCodeEntity.isCreatorCode() ? 1L : 0L);
            hq60Var.L(12, socShareCodeEntity.getShareCode());
            hq60Var.L(13, socShareCodeEntity.getUsername());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `social_share_code_table` SET `username` = ?,`share_code` = ?,`total_odds` = ?,`folds_amount` = ?,`user_id` = ?,`deadline` = ?,`create_time` = ?,`share_code_detail` = ?,`note` = ?,`popularity_level` = ?,`is_creator_code` = ? WHERE `share_code` = ? AND `username` = ?";
        }
    }

    public oha0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.lha0
    public final qha0 a(final String str) {
        return new qha0(new bw50("SELECT * FROM social_share_code_table WHERE username = ?", new Function1() { // from class: nha0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                hq60Var.L(1, str);
                return Unit.a;
            }
        }), this, this.a, new String[]{"social_share_code_table"});
    }

    @Override // defpackage.lha0
    public final Object b(String str, sha0 sha0Var) {
        Object objC = qlc.c(sha0Var, this.a, new mhx(1, str), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.lha0
    public final Object c(final ArrayList arrayList, sha0 sha0Var) {
        Object objC = qlc.c(sha0Var, this.a, new Function1() { // from class: mha0
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
