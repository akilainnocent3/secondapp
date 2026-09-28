package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kch {
    public static final kch a;
    public static final kch b;
    public static final kch c;
    public static final kch d;
    public static final /* synthetic */ kch[] e;
    public static final /* synthetic */ uag f;

    static {
        kch kchVar = new kch("DYNAMIC_RANGE", 0);
        a = kchVar;
        kch kchVar2 = new kch("FPS_RANGE", 1);
        b = kchVar2;
        kch kchVar3 = new kch("VIDEO_STABILIZATION", 2);
        c = kchVar3;
        kch kchVar4 = new kch("IMAGE_FORMAT", 3);
        d = kchVar4;
        kch[] kchVarArr = {kchVar, kchVar2, kchVar3, kchVar4};
        e = kchVarArr;
        f = new uag(kchVarArr);
    }

    public kch() {
        throw null;
    }

    public static kch valueOf(String str) {
        return (kch) Enum.valueOf(kch.class, str);
    }

    public static kch[] values() {
        return (kch[]) e.clone();
    }
}
