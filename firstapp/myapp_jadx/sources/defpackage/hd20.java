package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.HashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class hd20 implements ma20 {
    public final /* synthetic */ PreMatchEventActivity a;

    public static final class a implements o88.a {
        public final /* synthetic */ PreMatchEventActivity a;
        public final /* synthetic */ CommentsData b;
        public final /* synthetic */ boolean c;

        public a(PreMatchEventActivity preMatchEventActivity, CommentsData commentsData, boolean z) {
            this.a = preMatchEventActivity;
            this.b = commentsData;
            this.c = z;
        }

        @Override // o88.a
        public final void a(n88 n88Var) {
            this.a.U1(n88Var, this.b, this.c);
        }
    }

    public hd20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // defpackage.ma20
    public final void a(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        PreMatchEventActivity preMatchEventActivity = this.a;
        Intent intent = new Intent(preMatchEventActivity, (Class<?>) ZoomImageActivity.class);
        intent.putExtra("param_fetch_uri", str);
        intent.putExtra("param_booking_code", str2);
        intent.putExtra("param_country_code", str3);
        preMatchEventActivity.startActivityForResult(intent, 2);
    }

    @Override // defpackage.ma20
    public final void b(int i, int i2) {
        PreMatchEventActivity preMatchEventActivity = this.a;
        preMatchEventActivity.G1 = i;
        of20 of20Var = preMatchEventActivity.R0;
        if (of20Var != null) {
            Integer num = preMatchEventActivity.H1.get(Integer.valueOf(i2));
            int iIntValue = num != null ? num.intValue() : 1;
            HashMap<Integer, c9p> map = of20Var.p0;
            c9p c9pVar = map.get(Integer.valueOf(i2));
            if (c9pVar != null) {
                c9pVar.cancel((CancellationException) null);
            }
            map.put(Integer.valueOf(i2), kzh.d(new wzh(new yzh(new g1i(ozh.c(new or60(new bf20(of20Var, iIntValue, i2, null)), of20Var.b), new cf20(of20Var, null)), new df20(of20Var, null)), new ef20(of20Var, i2, null)), o8i0.d(of20Var)));
        }
    }

    @Override // defpackage.ma20
    public final void c(CommentsData commentsData) {
        PreMatchEventActivity preMatchEventActivity = this.a;
        jt6 jt6Var = new jt6(1, preMatchEventActivity, commentsData);
        int i = PreMatchEventActivity.a2;
        preMatchEventActivity.getAccountHelper().demandAccount(preMatchEventActivity, new zb20(preMatchEventActivity, jt6Var));
    }

    @Override // defpackage.ma20
    public final void d(CommentsData commentsData, boolean z) {
        PreMatchEventActivity preMatchEventActivity = this.a;
        Fragment fragmentH = preMatchEventActivity.getSupportFragmentManager().H("CommentActionFragment");
        o88 o88Var = fragmentH instanceof o88 ? (o88) fragmentH : null;
        if (o88Var == null) {
            o88Var = new o88();
            Bundle bundle = new Bundle();
            bundle.putBoolean("SELF_COMMENT", z);
            o88Var.setArguments(bundle);
        } else if (o88Var.isAdded()) {
            return;
        }
        o88Var.show(preMatchEventActivity.getSupportFragmentManager(), "CommentActionFragment");
        o88Var.c = new a(preMatchEventActivity, commentsData, z);
    }

    @Override // defpackage.ma20
    public final void e(final int i, final int i2) {
        int i3 = PreMatchEventActivity.a2;
        final PreMatchEventActivity preMatchEventActivity = this.a;
        preMatchEventActivity.getAccountHelper().demandAccount(preMatchEventActivity, new tit() { // from class: gd20
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                PreMatchEventActivity preMatchEventActivity2 = preMatchEventActivity;
                preMatchEventActivity2.G1 = i;
                of20 of20Var = preMatchEventActivity2.R0;
                if (of20Var != null) {
                    ct90<bi50<String>> ct90VarB = of20Var.y.e(i2).d(wm70.c).b(va0.a());
                    kf20 kf20Var = new kf20(of20Var);
                    ct90VarB.a(kf20Var);
                    of20Var.x1(kf20Var);
                }
            }
        });
    }

    public final void f(j98 j98Var) {
        j98Var.getClass();
        of20 of20Var = this.a.R0;
        if (of20Var != null) {
            osa0.a(j98Var instanceof j98.a, of20Var.Y, null);
        }
    }
}
