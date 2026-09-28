package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class tx40 {
    public final a a;
    public final js40 b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("DEPOSIT_DIALOG", 0);
            a = aVar;
            a aVar2 = new a("REGISTRATION_SUCCESS_ACTIVITY", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public tx40(a aVar, boolean z, int i) {
        js40 js40Var = js40.CURRENT;
        z = (i & 8) != 0 ? false : z;
        this.a = aVar;
        this.b = js40Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx40)) {
            return false;
        }
        tx40 tx40Var = (tx40) obj;
        return this.a == tx40Var.a && this.b == tx40Var.b && this.c == tx40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationSuccessLaunchAction(target=");
        sb.append(this.a);
        sb.append(", variant=");
        sb.append(this.b);
        sb.append(", shouldReportCampaignConversion=false, isFacialRecognitionDeferred=");
        return mq0.a(sb, this.c, ")");
    }
}
