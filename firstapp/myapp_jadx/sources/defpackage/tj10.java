package defpackage;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class tj10 extends p4 implements Serializable {
    private static final a d = new a(null);
    public final SecureRandom c;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public tj10(SecureRandom secureRandom) {
        this.c = secureRandom;
    }

    @Override // defpackage.p4
    public final Random h() {
        return this.c;
    }
}
