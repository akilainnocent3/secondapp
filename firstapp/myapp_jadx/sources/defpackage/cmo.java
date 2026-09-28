package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cmo implements bmo {
    public final psm a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public cmo(psm psmVar) {
        this.a = psmVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.bmo
    public final Integer a(String str) {
        Integer numValueOf = Integer.valueOf(R.drawable.ic__sports__football);
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -715617392:
                if (str.equals("sr:sport:1")) {
                    return numValueOf;
                }
                return null;
            case -715617391:
                if (str.equals("sr:sport:2")) {
                    return Integer.valueOf(R.drawable.ic__sports__basketball);
                }
                return null;
            case -715617390:
                if (str.equals("sr:sport:3")) {
                    return numValueOf;
                }
                return null;
            case -513544908:
                if (str.equals("sr:sport:1-1")) {
                    return numValueOf;
                }
                return null;
            case -513544907:
                if (str.equals("sr:sport:1-2")) {
                    return numValueOf;
                }
                return null;
            case 404585818:
                if (str.equals("sr:sport:1-3-1")) {
                    return numValueOf;
                }
                return null;
            case 404585819:
                if (str.equals("sr:sport:1-3-2")) {
                    return numValueOf;
                }
                return null;
            case 404672400:
                if (str.equals("sr:sport:10000")) {
                    return numValueOf;
                }
                return null;
            case 1259979936:
                if (str.equals("sr:sport:1000")) {
                    return Integer.valueOf(R.drawable.ic__sports__dog_racing);
                }
                return null;
            default:
                return null;
        }
    }

    public final Integer b(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -715617392:
                if (str.equals("sr:sport:1")) {
                    return Integer.valueOf(R.drawable.ic__sports__instant_virtual);
                }
                return null;
            case -715617391:
                if (str.equals("sr:sport:2")) {
                    return Integer.valueOf(R.drawable.ic__sports__iv_basketball);
                }
                return null;
            case -715617390:
                if (str.equals("sr:sport:3")) {
                    return Integer.valueOf(R.drawable.ic__sports__sporty_legend);
                }
                return null;
            case -513544908:
                str.equals("sr:sport:1-1");
                return null;
            case -513544907:
                if (str.equals("sr:sport:1-2")) {
                    return Integer.valueOf(R.drawable.ic__sports__sporty_penalty);
                }
                return null;
            case 404585818:
                if (str.equals("sr:sport:1-3-1")) {
                    return Integer.valueOf(R.drawable.ic__sports__instant_african_cup);
                }
                return null;
            case 404585819:
                if (str.equals("sr:sport:1-3-2")) {
                    return Integer.valueOf(R.drawable.ic__sports__instant_world_cup);
                }
                return null;
            case 404672400:
                if (str.equals("sr:sport:10000")) {
                    return Integer.valueOf(R.drawable.ic__sports__scheduled_v);
                }
                return null;
            case 1259979936:
                if (str.equals("sr:sport:1000")) {
                    return Integer.valueOf(R.drawable.ic__sports__instant_dog_racing);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer c(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -715617392:
                if (str.equals("sr:sport:1")) {
                    return Integer.valueOf(a.a[this.a.getCountryCode().ordinal()] == 1 ? R.string.common_functions__instant_virtuals__ZA : R.string.common_functions__instant_virtuals);
                }
                return null;
            case -715617391:
                if (str.equals("sr:sport:2")) {
                    return Integer.valueOf(R.string.common_functions__instant_basketball);
                }
                return null;
            case -715617390:
                if (str.equals("sr:sport:3")) {
                    return Integer.valueOf(R.string.common_functions__sporty_legends);
                }
                return null;
            case -513544908:
                if (str.equals("sr:sport:1-1")) {
                    return Integer.valueOf(R.string.common_games__build_and_go);
                }
                return null;
            case -513544907:
                if (str.equals("sr:sport:1-2")) {
                    return Integer.valueOf(R.string.common_functions__sporty_penalty);
                }
                return null;
            case 404585818:
                if (str.equals("sr:sport:1-3-1")) {
                    return Integer.valueOf(R.string.common_functions__sporty_african_cup);
                }
                return null;
            case 404585819:
                if (str.equals("sr:sport:1-3-2")) {
                    return Integer.valueOf(R.string.common_functions__instant_world_cup);
                }
                return null;
            case 404672400:
                if (str.equals("sr:sport:10000")) {
                    return Integer.valueOf(R.string.common_functions__scheduled_football);
                }
                return null;
            case 1259979936:
                if (str.equals("sr:sport:1000")) {
                    return Integer.valueOf(R.string.common_functions__instant_racing_dog);
                }
                return null;
            default:
                return null;
        }
    }
}
