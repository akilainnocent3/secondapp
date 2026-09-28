package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditsHistoryCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class f2c implements b2c {
    public final lv50 a;
    public final aag<CreatorCreditsHistoryCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity = (CreatorCreditsHistoryCursorEntity) obj;
            hq60Var.getClass();
            creatorCreditsHistoryCursorEntity.getClass();
            hq60Var.L(1, creatorCreditsHistoryCursorEntity.getUserId());
            hq60Var.q(2, creatorCreditsHistoryCursorEntity.getPageNo());
            hq60Var.q(3, creatorCreditsHistoryCursorEntity.isClaimed() ? 1L : 0L);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `creator_credits_history_cursor_table` (`userId`,`pageNo`,`isClaimed`) VALUES (?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity = (CreatorCreditsHistoryCursorEntity) obj;
            hq60Var.getClass();
            creatorCreditsHistoryCursorEntity.getClass();
            hq60Var.L(1, creatorCreditsHistoryCursorEntity.getUserId());
            hq60Var.q(2, creatorCreditsHistoryCursorEntity.getPageNo());
            hq60Var.q(3, creatorCreditsHistoryCursorEntity.isClaimed() ? 1L : 0L);
            hq60Var.L(4, creatorCreditsHistoryCursorEntity.getUserId());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `creator_credits_history_cursor_table` SET `userId` = ?,`pageNo` = ?,`isClaimed` = ? WHERE `userId` = ?";
        }
    }

    public f2c(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.b2c
    public final Object a(final String str, final boolean z, m2c m2cVar) {
        return qlc.c(m2cVar, this.a, new Function1() { // from class: e2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity;
                String str2 = str;
                boolean z2 = z;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM creator_credits_history_cursor_table WHERE userId = ? AND isClaimed = ?");
                boolean z3 = true;
                try {
                    hq60VarH1.L(1, str2);
                    hq60VarH1.q(2, z2 ? 1L : 0L);
                    int iB = l0b.b(hq60VarH1, "userId");
                    int iB2 = l0b.b(hq60VarH1, "pageNo");
                    int iB3 = l0b.b(hq60VarH1, "isClaimed");
                    if (hq60VarH1.D1()) {
                        String strK1 = hq60VarH1.k1(iB);
                        int i = (int) hq60VarH1.getLong(iB2);
                        if (((int) hq60VarH1.getLong(iB3)) == 0) {
                            z3 = false;
                        }
                        creatorCreditsHistoryCursorEntity = new CreatorCreditsHistoryCursorEntity(strK1, i, z3);
                    } else {
                        creatorCreditsHistoryCursorEntity = null;
                    }
                    return creatorCreditsHistoryCursorEntity;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.b2c
    public final Object b(final String str, final boolean z, n2c n2cVar) {
        Object objC = qlc.c(n2cVar, this.a, new Function1() { // from class: d2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                boolean z2 = z;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM creator_credits_history_cursor_table  WHERE userId = ? AND isClaimed = ?");
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

    @Override // defpackage.b2c
    public final Object c(final CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity, n2c n2cVar) {
        Object objC = qlc.c(n2cVar, this.a, new Function1() { // from class: c2c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.c(vp60Var, creatorCreditsHistoryCursorEntity);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
