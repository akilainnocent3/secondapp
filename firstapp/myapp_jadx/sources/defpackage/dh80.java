package defpackage;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public enum dh80 implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public final int a;

    public static final class a implements Internal.EnumVerifier {
        public static final a a = new a();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return dh80.a(i) != null;
        }
    }

    dh80(int i) {
        this.a = i;
    }

    public static dh80 a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.a;
    }
}
