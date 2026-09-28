package defpackage;

import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class md20 implements gi20.c {
    public final /* synthetic */ PreMatchEventActivity a;

    public md20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // gi20.c
    public final void a(int i, String str) {
        mi20 mi20Var = this.a.M1;
        if (mi20Var != null) {
            mi20Var.B1(new ez4.a(str, i));
        }
    }

    @Override // gi20.c
    public final void c(String str) {
        mi20 mi20Var = this.a.M1;
        if (mi20Var != null) {
            mi20Var.B1(new ez4.c(str));
        }
    }

    @Override // gi20.c
    public final void b(String str) {
    }
}
