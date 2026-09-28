package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
@fae
public final class gug0 {
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    public static Drawable a(Context context) {
        int i;
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 0) {
            i = R.drawable.spr_live_boost;
        } else if (iA == 1) {
            i = R.drawable.spr_live_boost_sw;
        } else if (iA == 2) {
            i = R.drawable.spr_live_boost_es_mx;
        } else if (iA == 3) {
            i = R.drawable.spr_live_boost_pt_br;
        } else if (iA == 4) {
            i = R.drawable.spr_live_boost;
        } else {
            if (iA != 5) {
                uhc.a();
                return null;
            }
            i = R.drawable.spr_live_boost_fr_fr;
        }
        return gr0.a(context, i);
    }

    public static Drawable b(Context context) {
        int i;
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 0) {
            i = R.drawable.spr_odds_boost;
        } else if (iA == 1) {
            i = R.drawable.spr_odds_boost_sw;
        } else if (iA == 2) {
            i = R.drawable.spr_odds_boost_es_mx;
        } else if (iA == 3) {
            i = R.drawable.spr_odds_boost_pt_br;
        } else if (iA == 4) {
            i = R.drawable.spr_odds_boost_pt_mz;
        } else {
            if (iA != 5) {
                uhc.a();
                return null;
            }
            i = R.drawable.spr_odds_boost_fr_fr;
        }
        return gr0.a(context, i);
    }

    public static final Drawable c(Context context) {
        context.getClass();
        Drawable drawableA = gr0.a(context, d(context));
        if (drawableA == null) {
            return null;
        }
        aef.b(drawableA, context, R.color.custom_brand_secondary_variable_type3_type1);
        return drawableA;
    }

    public static final int d(Context context) {
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 1) {
            return R.drawable.ic_one_bet_cut_sw;
        }
        if (iA == 2) {
            return R.drawable.ic_one_bet_cut_es_mx;
        }
        if (iA != 3) {
            return iA != 4 ? R.drawable.ic_one_bet_cut : R.drawable.ic_one_bet_cut_pt_mz;
        }
        return R.drawable.ic_one_bet_cut_pt_br;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    public static Drawable e(Context context) {
        int i;
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 0) {
            i = R.drawable.spr_sport_sim_label;
        } else if (iA == 1) {
            i = R.drawable.spr_sport_sim_label_sw;
        } else if (iA == 2) {
            i = R.drawable.spr_sport_sim_label_es_mx;
        } else if (iA == 3) {
            i = R.drawable.spr_sport_sim_label_pt_br;
        } else if (iA == 4) {
            i = R.drawable.spr_sport_sim_label;
        } else {
            if (iA != 5) {
                uhc.a();
                return null;
            }
            i = R.drawable.spr_sport_sim_label_fr_fr;
        }
        return gr0.a(context, i);
    }

    public static Drawable f(Context context) {
        int i;
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 0) {
            i = R.drawable.spr_sports_hot;
        } else if (iA == 1) {
            i = R.drawable.spr_sports_hot_sw;
        } else if (iA == 2 || iA == 3 || iA == 4) {
            i = R.drawable.spr_sports_hot_es_mx;
        } else {
            if (iA != 5) {
                uhc.a();
                return null;
            }
            i = R.drawable.spr_sports_hot_fr_fr;
        }
        return gr0.a(context, i);
    }

    public static Drawable g(Context context) {
        int i;
        context.getClass();
        int iA = fug0.a(hug0.a, context);
        if (iA == 1) {
            i = R.drawable.ic_spr_live_virtual_sw;
        } else if (iA == 2) {
            i = R.drawable.ic_spr_live_virtual_es_mx;
        } else if (iA != 4) {
            i = iA != 5 ? R.drawable.ic_spr_live_virtual : R.drawable.ic_spr_live_virtual_fr_fr;
        } else {
            i = R.drawable.ic_spr_live_virtual_pt_mz;
        }
        return gr0.a(context, i);
    }
}
