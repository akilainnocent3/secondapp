package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lbnd0;", "", "a", "b", "c", "d", "e", "f", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bnd0 {

    @SerializedName("NEW")
    public static final bnd0 a;

    @SerializedName("ACTIVE")
    public static final bnd0 b;

    @SerializedName("EXPIRED")
    public static final bnd0 c;

    @SerializedName("ALL_REWARDS_CLAIMED")
    public static final bnd0 d;

    @SerializedName("TIER_NOT_REACHED")
    public static final bnd0 e;

    @SerializedName("READY_TO_CLAIM")
    public static final bnd0 f;
    public static final /* synthetic */ bnd0[] i;

    static {
        bnd0 bnd0Var = new bnd0("NEW", 0);
        a = bnd0Var;
        bnd0 bnd0Var2 = new bnd0("ACTIVE", 1);
        b = bnd0Var2;
        bnd0 bnd0Var3 = new bnd0("EXPIRED", 2);
        c = bnd0Var3;
        bnd0 bnd0Var4 = new bnd0("ALL_REWARDS_CLAIMED", 3);
        d = bnd0Var4;
        bnd0 bnd0Var5 = new bnd0("TIER_NOT_REACHED", 4);
        e = bnd0Var5;
        bnd0 bnd0Var6 = new bnd0("READY_TO_CLAIM", 5);
        f = bnd0Var6;
        i = new bnd0[]{bnd0Var, bnd0Var2, bnd0Var3, bnd0Var4, bnd0Var5, bnd0Var6};
    }

    public bnd0() {
        throw null;
    }

    public static bnd0 valueOf(String str) {
        return (bnd0) Enum.valueOf(bnd0.class, str);
    }

    public static bnd0[] values() {
        return (bnd0[]) i.clone();
    }
}
