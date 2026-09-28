package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class spj implements ulc0 {
    public final p7v b;
    public final v6v c;
    public final j7v d;
    public final String e;

    public spj(p7v p7vVar, v6v v6vVar, j7v j7vVar, String str) {
        this.b = p7vVar;
        this.c = v6vVar;
        this.d = j7vVar;
        this.e = str;
    }

    @Override // defpackage.ulc0
    public final v6v a() {
        return this.c;
    }

    @Override // defpackage.ulc0
    public final p7v b() {
        return this.b;
    }

    @Override // defpackage.ulc0
    public final Integer c() {
        return Integer.valueOf(this.d == j7v.a ? R.string.page_instant_virtual__lottie_sporty_legends_goal : R.string.page_instant_virtual__lottie_sporty_legends_no_goal);
    }

    @Override // defpackage.ulc0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.ulc0
    public final j7v getResult() {
        return this.d;
    }
}
