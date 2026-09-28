package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public enum poi {
    TERMS(Integer.valueOf(R.string.common_helps__title_t_and_c)),
    RESPONSIBLE_GAMING(Integer.valueOf(R.string.common_helps__responsible)),
    ABOUT_US(null),
    CONTACT_US(null),
    MER_REGULATIONS(Integer.valueOf(R.string.main_footer__mer_gambling_regulations)),
    PAIA(null),
    MONEY_POLICY(null);

    public final Integer a;

    poi(Integer num) {
        this.a = num;
    }
}
