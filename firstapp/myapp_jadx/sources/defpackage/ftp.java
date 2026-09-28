package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ftp {
    public static final ftp a;
    public static final ftp b;
    public static final /* synthetic */ ftp[] c;

    static {
        ftp ftpVar = new ftp("TRANSACTION", 0);
        a = ftpVar;
        ftp ftpVar2 = new ftp("DEPOSIT", 1);
        b = ftpVar2;
        c = new ftp[]{ftpVar, ftpVar2};
    }

    public ftp() {
        throw null;
    }

    public static ftp valueOf(String str) {
        return (ftp) Enum.valueOf(ftp.class, str);
    }

    public static ftp[] values() {
        return (ftp[]) c.clone();
    }
}
