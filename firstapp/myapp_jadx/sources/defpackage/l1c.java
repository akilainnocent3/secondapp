package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditsCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class l1c implements i1c {
    public final lv50 a;
    public final aag<CreatorCreditsCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            CreatorCreditsCursorEntity creatorCreditsCursorEntity = (CreatorCreditsCursorEntity) obj;
            hq60Var.getClass();
            creatorCreditsCursorEntity.getClass();
            hq60Var.L(1, creatorCreditsCursorEntity.getUserId());
            hq60Var.q(2, creatorCreditsCursorEntity.getPageNo());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `creator_credits_cursor_table` (`userId`,`pageNo`) VALUES (?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            CreatorCreditsCursorEntity creatorCreditsCursorEntity = (CreatorCreditsCursorEntity) obj;
            hq60Var.getClass();
            creatorCreditsCursorEntity.getClass();
            hq60Var.L(1, creatorCreditsCursorEntity.getUserId());
            hq60Var.q(2, creatorCreditsCursorEntity.getPageNo());
            hq60Var.L(3, creatorCreditsCursorEntity.getUserId());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `creator_credits_cursor_table` SET `userId` = ?,`pageNo` = ? WHERE `userId` = ?";
        }
    }

    public l1c(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.i1c
    public final Object a(String str, r2c r2cVar) {
        Object objC = qlc.c(r2cVar, this.a, new be8(str, 1), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.i1c
    public final Object b(final CreatorCreditsCursorEntity creatorCreditsCursorEntity, r2c r2cVar) {
        Object objC = qlc.c(r2cVar, this.a, new Function1() { // from class: k1c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.c(vp60Var, creatorCreditsCursorEntity);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.i1c
    public final Object c(String str, q2c q2cVar) {
        return qlc.c(q2cVar, this.a, new j1c(str, 0), true, false);
    }
}
