package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventPagingCursorEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ude0 implements sde0 {
    public final lv50 a;
    public final aag<SubscribedEventPagingCursorEntity> b = new aag<>(new a(), new b());

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            SubscribedEventPagingCursorEntity subscribedEventPagingCursorEntity = (SubscribedEventPagingCursorEntity) obj;
            hq60Var.getClass();
            subscribedEventPagingCursorEntity.getClass();
            hq60Var.L(1, subscribedEventPagingCursorEntity.getAccount());
            hq60Var.q(2, subscribedEventPagingCursorEntity.getPageNo());
            hq60Var.q(3, subscribedEventPagingCursorEntity.getPageSize());
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT INTO `match_alert_cursor_table` (`account`,`pageNo`,`pageSize`) VALUES (?,?,?)";
        }
    }

    public static final class b extends bjb0 {
        @Override // defpackage.bjb0
        public final void F(hq60 hq60Var, Object obj) {
            SubscribedEventPagingCursorEntity subscribedEventPagingCursorEntity = (SubscribedEventPagingCursorEntity) obj;
            hq60Var.getClass();
            subscribedEventPagingCursorEntity.getClass();
            hq60Var.L(1, subscribedEventPagingCursorEntity.getAccount());
            hq60Var.q(2, subscribedEventPagingCursorEntity.getPageNo());
            hq60Var.q(3, subscribedEventPagingCursorEntity.getPageSize());
            hq60Var.L(4, subscribedEventPagingCursorEntity.getAccount());
        }

        @Override // defpackage.bjb0
        public final String G() {
            return "UPDATE `match_alert_cursor_table` SET `account` = ?,`pageNo` = ?,`pageSize` = ? WHERE `account` = ?";
        }
    }

    public ude0(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.sde0
    public final Object a(SubscribedEventPagingCursorEntity subscribedEventPagingCursorEntity, kuu kuuVar) {
        Object objC = qlc.c(kuuVar, this.a, new e420(1, this, subscribedEventPagingCursorEntity), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.sde0
    public final Object b(final String str, kuu kuuVar) {
        Object objC = qlc.c(kuuVar, this.a, new Function1() { // from class: tde0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM match_alert_cursor_table WHERE (? IS NOT NULL AND account = ?) ");
                String str2 = str;
                try {
                    if (str2 == null) {
                        hq60VarH1.r(1);
                    } else {
                        hq60VarH1.L(1, str2);
                    }
                    if (str2 == null) {
                        hq60VarH1.r(2);
                    } else {
                        hq60VarH1.L(2, str2);
                    }
                    hq60VarH1.D1();
                    hq60VarH1.close();
                    return Unit.a;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.sde0
    public final Object c(String str, juu juuVar) {
        return qlc.c(juuVar, this.a, new rwa0(str, 1), true, false);
    }
}
