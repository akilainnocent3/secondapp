package defpackage;

import com.sportybet.android.social.data.local.SocFollowingCodeCursorEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class o7a0 extends bjb0 {
    @Override // defpackage.bjb0
    public final void F(hq60 hq60Var, Object obj) {
        SocFollowingCodeCursorEntity socFollowingCodeCursorEntity = (SocFollowingCodeCursorEntity) obj;
        hq60Var.getClass();
        socFollowingCodeCursorEntity.getClass();
        hq60Var.L(1, socFollowingCodeCursorEntity.getAccount());
        hq60Var.q(2, socFollowingCodeCursorEntity.getPageNo());
        hq60Var.L(3, socFollowingCodeCursorEntity.getAccount());
    }

    @Override // defpackage.bjb0
    public final String G() {
        return "UPDATE `social_following_code_cursor_table` SET `account` = ?,`pageNo` = ? WHERE `account` = ?";
    }
}
