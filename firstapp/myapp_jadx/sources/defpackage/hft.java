package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hft {
    public final long a;
    public final a b;

    public enum a implements m630 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int a;

        a(int i) {
            this.a = i;
        }

        @Override // defpackage.m630
        public final int getNumber() {
            return this.a;
        }
    }

    public hft(long j, a aVar) {
        this.a = j;
        this.b = aVar;
    }
}
