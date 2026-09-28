package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class qov {
    public final long a;
    public final String b;
    public final String c;
    public final b d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;

    public enum a implements m630 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        /* JADX INFO: Fake field, exist only in values array */
        MESSAGE_OPEN(2);

        public final int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.m630
        public final int getNumber() {
            return this.a;
        }
    }

    public enum b implements m630 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN(0),
        DATA_MESSAGE(1),
        /* JADX INFO: Fake field, exist only in values array */
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        public final int a;

        b(int i) {
            this.a = i;
        }

        @Override // defpackage.m630
        public final int getNumber() {
            return this.a;
        }
    }

    public enum c implements m630 {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_OS(0),
        ANDROID(1),
        /* JADX INFO: Fake field, exist only in values array */
        IOS(2),
        /* JADX INFO: Fake field, exist only in values array */
        WEB(3);

        public final int a;

        c(int i) {
            this.a = i;
        }

        @Override // defpackage.m630
        public final int getNumber() {
            return this.a;
        }
    }

    public qov(long j, String str, String str2, b bVar, String str3, String str4, int i, int i2, String str5, String str6, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = bVar;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
    }
}
