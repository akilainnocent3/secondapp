package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class j2c implements g2c {
    public final lv50 a;
    public final aag<CreatorCreditHistoryEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            CreatorCreditHistoryEntity creatorCreditHistoryEntity = (CreatorCreditHistoryEntity) obj;
            hq60Var.getClass();
            creatorCreditHistoryEntity.getClass();
            hq60Var.L(1, creatorCreditHistoryEntity.getBatchId());
            hq60Var.q(2, creatorCreditHistoryEntity.getClaimedAmount());
            hq60Var.L(3, creatorCreditHistoryEntity.getCurrency());
            hq60Var.q(4, creatorCreditHistoryEntity.getEndTime());
            hq60Var.q(5, creatorCreditHistoryEntity.getLastClaimedTime());
            hq60Var.q(6, creatorCreditHistoryEntity.getPotentialReward());
            hq60Var.q(7, creatorCreditHistoryEntity.getStartTime());
            hq60Var.q(8, creatorCreditHistoryEntity.getStatus());
            hq60Var.L(9, creatorCreditHistoryEntity.getUserId());
            hq60Var.q(10, creatorCreditHistoryEntity.isClaimed() ? 1L : 0L);
            hq60Var.q(11, creatorCreditHistoryEntity.getSourceIndex());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `creator_credit_history_table` (`batch_id`,`claimed_amount`,`currency`,`end_time`,`last_claimed_time`,`potential_reward`,`start_time`,`status`,`user_id`,`is_claimed`,`source_index`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            CreatorCreditHistoryEntity creatorCreditHistoryEntity = (CreatorCreditHistoryEntity) obj;
            hq60Var.getClass();
            creatorCreditHistoryEntity.getClass();
            hq60Var.L(1, creatorCreditHistoryEntity.getBatchId());
            hq60Var.q(2, creatorCreditHistoryEntity.getClaimedAmount());
            hq60Var.L(3, creatorCreditHistoryEntity.getCurrency());
            hq60Var.q(4, creatorCreditHistoryEntity.getEndTime());
            hq60Var.q(5, creatorCreditHistoryEntity.getLastClaimedTime());
            hq60Var.q(6, creatorCreditHistoryEntity.getPotentialReward());
            hq60Var.q(7, creatorCreditHistoryEntity.getStartTime());
            hq60Var.q(8, creatorCreditHistoryEntity.getStatus());
            hq60Var.L(9, creatorCreditHistoryEntity.getUserId());
            hq60Var.q(10, creatorCreditHistoryEntity.isClaimed() ? 1L : 0L);
            hq60Var.q(11, creatorCreditHistoryEntity.getSourceIndex());
            hq60Var.L(12, creatorCreditHistoryEntity.getBatchId());
            hq60Var.L(13, creatorCreditHistoryEntity.getUserId());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `creator_credit_history_table` SET `batch_id` = ?,`claimed_amount` = ?,`currency` = ?,`end_time` = ?,`last_claimed_time` = ?,`potential_reward` = ?,`start_time` = ?,`status` = ?,`user_id` = ?,`is_claimed` = ?,`source_index` = ? WHERE `batch_id` = ? AND `user_id` = ?";
        }
    }

    public j2c(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.g2c
    public final l2c a(final String str, final boolean z) {
        str.getClass();
        return new l2c(new bw50("SELECT * FROM creator_credit_history_table WHERE user_id = ? AND is_claimed = ? ORDER BY source_index ASC", new Function1() { // from class: i2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                hq60Var.L(1, str);
                hq60Var.q(2, z ? 1L : 0L);
                return Unit.a;
            }
        }), this, this.a, new String[]{"creator_credit_history_table"});
    }

    @Override // defpackage.g2c
    public final Object b(final String str, final boolean z, n2c n2cVar) {
        Object objC = qlc.c(n2cVar, this.a, new Function1() { // from class: h2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                boolean z2 = z;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM creator_credit_history_table WHERE user_id = ? AND is_claimed = ?");
                try {
                    hq60VarH1.L(1, str2);
                    hq60VarH1.q(2, z2 ? 1L : 0L);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.g2c
    public final Object c(ArrayList arrayList, n2c n2cVar) {
        Object objC = qlc.c(n2cVar, this.a, new bf8(1, this, arrayList), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
