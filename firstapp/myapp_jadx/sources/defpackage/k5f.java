package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public enum k5f {
    WIN(R.string.bet_history__won, R.color.bg_brand_sub_secondary_d_darker, R.color.text_brand_sub_primary_d_lighter, Integer.valueOf(R.drawable.ic__feature__won), R.drawable.ic__feature__match_status_won),
    LOSE(R.string.bet_history__lost, R.color.bg_surface_primary, R.color.text_secondary, null, R.drawable.ic__feature__match_status_lost);

    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final int e;

    k5f(int i, int i2, int i3, Integer num, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = i4;
    }
}
