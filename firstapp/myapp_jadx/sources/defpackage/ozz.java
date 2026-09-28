package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ozz {
    public static final ozz a;
    public static final ozz b;
    public static final ozz c;
    public static final ozz d;
    public static final ozz e;
    public static final ozz f;
    public static final ozz i;
    public static final /* synthetic */ ozz[] v;

    static {
        ozz ozzVar = new ozz("Invalid", 0);
        a = ozzVar;
        ozz ozzVar2 = new ozz("Cancelled", 1);
        b = ozzVar2;
        ozz ozzVar3 = new ozz("InitialPending", 2);
        c = ozzVar3;
        ozz ozzVar4 = new ozz("RecomposePending", 3);
        d = ozzVar4;
        ozz ozzVar5 = new ozz("Recomposing", 4);
        e = ozzVar5;
        ozz ozzVar6 = new ozz("ApplyPending", 5);
        f = ozzVar6;
        ozz ozzVar7 = new ozz("Applied", 6);
        i = ozzVar7;
        v = new ozz[]{ozzVar, ozzVar2, ozzVar3, ozzVar4, ozzVar5, ozzVar6, ozzVar7};
    }

    public ozz() {
        throw null;
    }

    public static ozz valueOf(String str) {
        return (ozz) Enum.valueOf(ozz.class, str);
    }

    public static ozz[] values() {
        return (ozz[]) v.clone();
    }
}
