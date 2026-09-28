package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class eye {
    public static final eye a;
    public static final eye b;
    public static final eye c;
    public static final eye d;
    public static final /* synthetic */ eye[] e;

    static {
        eye eyeVar = new eye("UserEnteredEditableDob", 0);
        a = eyeVar;
        eye eyeVar2 = new eye("VerifiedAndLockedDob", 1);
        b = eyeVar2;
        eye eyeVar3 = new eye("AwaitingNinVerification", 2);
        c = eyeVar3;
        eye eyeVar4 = new eye("EmptyAndEditable", 3);
        d = eyeVar4;
        e = new eye[]{eyeVar, eyeVar2, eyeVar3, eyeVar4};
    }

    public eye() {
        throw null;
    }

    public static eye valueOf(String str) {
        return (eye) Enum.valueOf(eye.class, str);
    }

    public static eye[] values() {
        return (eye[]) e.clone();
    }
}
