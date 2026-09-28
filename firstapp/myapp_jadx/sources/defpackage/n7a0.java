package defpackage;

import com.sportybet.android.social.data.local.SocFollowingCodeCursorEntity;

/* JADX INFO: loaded from: classes6.dex */
public final class n7a0 extends y3l {
    @Override // defpackage.y3l
    public final void a(hq60 hq60Var, Object obj) {
        SocFollowingCodeCursorEntity socFollowingCodeCursorEntity = (SocFollowingCodeCursorEntity) obj;
        hq60Var.getClass();
        socFollowingCodeCursorEntity.getClass();
        hq60Var.L(1, socFollowingCodeCursorEntity.getAccount());
        hq60Var.q(2, socFollowingCodeCursorEntity.getPageNo());
    }

    @Override // defpackage.y3l
    public final String b() {
        return "INSERT INTO `social_following_code_cursor_table` (`account`,`pageNo`) VALUES (?,?)";
    }
}
