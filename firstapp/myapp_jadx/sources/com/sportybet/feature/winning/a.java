package com.sportybet.feature.winning;

import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public final C0417a a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ a(int i) {
        this(new C0417a(0), false, false, true, false);
    }

    public static a a(a aVar, C0417a c0417a, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            c0417a = aVar.a;
        }
        C0417a c0417a2 = c0417a;
        if ((i & 2) != 0) {
            z = aVar.b;
        }
        boolean z4 = z;
        boolean z5 = (i & 4) != 0 ? aVar.c : true;
        if ((i & 8) != 0) {
            z2 = aVar.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        aVar.getClass();
        c0417a2.getClass();
        return new a(c0417a2, z4, z5, z6, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinningUiState(soundIcon=");
        sb.append(this.a);
        sb.append(", showRemixBetNewFeatureDot=");
        sb.append(this.b);
        sb.append(", isRemixBetConfigurationResolved=");
        nng.a(", showTicketDetailButton=", ", useControlButtonLayout=", sb, this.c, this.d);
        return mq0.a(sb, this.e, ")");
    }

    /* JADX INFO: renamed from: com.sportybet.feature.winning.a$a, reason: collision with other inner class name */
    public static final class C0417a {
        public final boolean a;
        public final boolean b;

        public C0417a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0417a)) {
                return false;
            }
            C0417a c0417a = (C0417a) obj;
            return this.a == c0417a.a && this.b == c0417a.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "SoundIconState(isOn=" + this.a + ", isVisible=" + this.b + ")";
        }

        public /* synthetic */ C0417a(int i) {
            this(true, false);
        }

        public C0417a() {
            this(0);
        }
    }

    public a(C0417a c0417a, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = c0417a;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public a() {
        this(0);
    }
}
