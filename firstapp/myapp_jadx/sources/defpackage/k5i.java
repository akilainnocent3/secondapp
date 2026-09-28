package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k5i implements j5i {
    public static final k5i a;
    public static final k5i b;
    public static final k5i c;
    public static final k5i d;
    public static final /* synthetic */ k5i[] e;

    static {
        k5i k5iVar = new k5i("Active", 0);
        a = k5iVar;
        k5i k5iVar2 = new k5i("ActiveParent", 1);
        b = k5iVar2;
        k5i k5iVar3 = new k5i("Captured", 2);
        c = k5iVar3;
        k5i k5iVar4 = new k5i("Inactive", 3);
        d = k5iVar4;
        e = new k5i[]{k5iVar, k5iVar2, k5iVar3, k5iVar4};
    }

    public k5i() {
        throw null;
    }

    public static k5i valueOf(String str) {
        return (k5i) Enum.valueOf(k5i.class, str);
    }

    public static k5i[] values() {
        return (k5i[]) e.clone();
    }

    @Override // defpackage.j5i
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                uhc.a();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.j5i
    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        uhc.a();
        return false;
    }
}
