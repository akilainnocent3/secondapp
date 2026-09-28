package defpackage;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public enum zu0 implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public final int a;

    public static final class a implements Internal.EnumVerifier {
        public static final a a = new a();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            zu0 zu0Var;
            if (i == 0) {
                zu0Var = zu0.APPLICATION_PROCESS_STATE_UNKNOWN;
            } else if (i == 1) {
                zu0Var = zu0.FOREGROUND;
            } else if (i != 2) {
                zu0Var = i != 3 ? null : zu0.FOREGROUND_BACKGROUND;
            } else {
                zu0Var = zu0.BACKGROUND;
            }
            return zu0Var != null;
        }
    }

    zu0(int i) {
        this.a = i;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.a;
    }
}
