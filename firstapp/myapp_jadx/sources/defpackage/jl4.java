package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ljl4;", "", "a", "b", "c", "d", "e", "f", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jl4 {

    @SerializedName("NEW")
    public static final jl4 a;

    @SerializedName("ACTIVE")
    public static final jl4 b;

    @SerializedName("EXPIRED")
    public static final jl4 c;

    @SerializedName("ALL_REWARDS_CLAIMED")
    public static final jl4 d;

    @SerializedName("TIER_NOT_REACHED")
    public static final jl4 e;

    @SerializedName("READY_TO_CLAIM")
    public static final jl4 f;
    public static final /* synthetic */ jl4[] i;

    static {
        jl4 jl4Var = new jl4("NEW", 0);
        a = jl4Var;
        jl4 jl4Var2 = new jl4("ACTIVE", 1);
        b = jl4Var2;
        jl4 jl4Var3 = new jl4("EXPIRED", 2);
        c = jl4Var3;
        jl4 jl4Var4 = new jl4("ALL_REWARDS_CLAIMED", 3);
        d = jl4Var4;
        jl4 jl4Var5 = new jl4("TIER_NOT_REACHED", 4);
        e = jl4Var5;
        jl4 jl4Var6 = new jl4("READY_TO_CLAIM", 5);
        f = jl4Var6;
        i = new jl4[]{jl4Var, jl4Var2, jl4Var3, jl4Var4, jl4Var5, jl4Var6};
    }

    public jl4() {
        throw null;
    }

    public static jl4 valueOf(String str) {
        return (jl4) Enum.valueOf(jl4.class, str);
    }

    public static jl4[] values() {
        return (jl4[]) i.clone();
    }
}
