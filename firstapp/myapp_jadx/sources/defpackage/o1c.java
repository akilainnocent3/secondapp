package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditEntity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class o1c implements m1c {
    public final lv50 a;
    public final aag<CreatorCreditEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            CreatorCreditEntity creatorCreditEntity = (CreatorCreditEntity) obj;
            hq60Var.getClass();
            creatorCreditEntity.getClass();
            hq60Var.L(1, creatorCreditEntity.getBatchId());
            hq60Var.q(2, creatorCreditEntity.getClaimedAmount());
            hq60Var.L(3, creatorCreditEntity.getCurrency());
            hq60Var.q(4, creatorCreditEntity.getEndTime());
            hq60Var.q(5, creatorCreditEntity.getLastClaimedTime());
            hq60Var.q(6, creatorCreditEntity.getPotentialReward());
            hq60Var.q(7, creatorCreditEntity.getStartTime());
            hq60Var.q(8, creatorCreditEntity.getStatus());
            hq60Var.L(9, creatorCreditEntity.getUserId());
            hq60Var.q(10, creatorCreditEntity.getSourceIndex());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `creator_credit_table` (`batch_id`,`claimed_amount`,`currency`,`end_time`,`last_claimed_time`,`potential_reward`,`start_time`,`status`,`user_id`,`source_index`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            CreatorCreditEntity creatorCreditEntity = (CreatorCreditEntity) obj;
            hq60Var.getClass();
            creatorCreditEntity.getClass();
            hq60Var.L(1, creatorCreditEntity.getBatchId());
            hq60Var.q(2, creatorCreditEntity.getClaimedAmount());
            hq60Var.L(3, creatorCreditEntity.getCurrency());
            hq60Var.q(4, creatorCreditEntity.getEndTime());
            hq60Var.q(5, creatorCreditEntity.getLastClaimedTime());
            hq60Var.q(6, creatorCreditEntity.getPotentialReward());
            hq60Var.q(7, creatorCreditEntity.getStartTime());
            hq60Var.q(8, creatorCreditEntity.getStatus());
            hq60Var.L(9, creatorCreditEntity.getUserId());
            hq60Var.q(10, creatorCreditEntity.getSourceIndex());
            hq60Var.L(11, creatorCreditEntity.getBatchId());
            hq60Var.L(12, creatorCreditEntity.getUserId());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `creator_credit_table` SET `batch_id` = ?,`claimed_amount` = ?,`currency` = ?,`end_time` = ?,`last_claimed_time` = ?,`potential_reward` = ?,`start_time` = ?,`status` = ?,`user_id` = ?,`source_index` = ? WHERE `batch_id` = ? AND `user_id` = ?";
        }
    }

    public o1c(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.m1c
    public final p1c a(String str) {
        str.getClass();
        return new p1c(new bw50("SELECT * FROM creator_credit_table WHERE user_id = ? ORDER BY source_index ASC", new ce8(str, 1)), this, this.a, new String[]{"creator_credit_table"});
    }

    @Override // defpackage.m1c
    public final Object b(final ArrayList arrayList, r2c r2cVar) {
        Object objC = qlc.c(r2cVar, this.a, new Function1() { // from class: n1c
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

    @Override // defpackage.m1c
    public final Object c(String str, r2c r2cVar) {
        Object objC = qlc.c(r2cVar, this.a, new de8(str, 1), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
