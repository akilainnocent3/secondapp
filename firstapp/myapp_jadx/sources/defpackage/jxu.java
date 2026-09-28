package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class jxu implements mpg.a {
    public final /* synthetic */ MatchEventActivity a;

    public jxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // mpg.a
    public final void h(mpg mpgVar) {
        int i = MatchEventActivity.a0;
        this.a.P1(mpgVar, false);
    }

    @Override // mpg.a
    public final void i(mpg mpgVar) {
        String str = mpgVar.a;
        str.getClass();
        a5o.q qVar = new a5o.q(str);
        int i = MatchEventActivity.a0;
        MatchEventActivity matchEventActivity = this.a;
        matchEventActivity.U1(qVar);
        z5v z5vVarI1 = matchEventActivity.I1();
        String str2 = mpgVar.c;
        str2.getClass();
        ej5.c(o8i0.d(z5vVarI1), null, null, new x5v(z5vVarI1, str2, null), 3);
    }
}
