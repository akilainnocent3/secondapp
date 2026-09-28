package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ofb0 {
    public static final ofb0 a;
    public static final ofb0 b;
    public static final /* synthetic */ ofb0[] c;

    static {
        ofb0 ofb0Var = new ofb0("TEAM", 0);
        a = ofb0Var;
        ofb0 ofb0Var2 = new ofb0("INDIVIDUAL", 1);
        b = ofb0Var2;
        c = new ofb0[]{ofb0Var, ofb0Var2};
    }

    public ofb0() {
        throw null;
    }

    public static ofb0 valueOf(String str) {
        return (ofb0) Enum.valueOf(ofb0.class, str);
    }

    public static ofb0[] values() {
        return (ofb0[]) c.clone();
    }
}
