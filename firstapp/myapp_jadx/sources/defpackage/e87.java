package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;

/* JADX INFO: loaded from: classes7.dex */
public interface e87 extends gre0 {

    public static final class a implements e87 {
        public final int a;
        public final String b;

        public a(int i) {
            this.a = i;
            this.b = "Ch_BacktoIdle_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("BackToIdle(caveIndex="), this.a, ')');
        }
    }

    public static final class b implements e87 {
        public final int a;
        public final String b;

        public b(int i) {
            this.a = i;
            this.b = "Ch_Loop_Normal_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("Digging(caveIndex="), this.a, ')');
        }
    }

    public static final class c implements e87 {
        public final int a;
        public final String b;

        public c(int i) {
            this.a = i;
            this.b = "Ch_Idle_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("Idle(caveIndex="), this.a, ')');
        }
    }

    public static final class d implements e87 {
        public final int a;
        public final String b;

        public d(int i) {
            this.a = i;
            this.b = "Ch_IntoLoop_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("IntoDigging(caveIndex="), this.a, ')');
        }
    }

    public static final class e implements e87 {
        public static final e a = new e();
        public static final String b = "Ch_Switch";

        @Override // defpackage.gre0
        public final String a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1693224740;
        }

        public final String toString() {
            return "SwitchMap";
        }
    }

    public static final class g implements e87 {
        public final int a;
        public final String b;

        public g(int i) {
            this.a = i;
            this.b = "Ch_Winning_" + (i + 1);
        }

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("Wining(caveIndex="), this.a, ')');
        }
    }

    @Override // defpackage.gre0
    default int d() {
        sre0[] sre0VarArr = sre0.a;
        return 1;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class f implements e87 {
        public final int a;
        public final String b;

        @Override // defpackage.gre0
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("TurboDigging(caveIndex="), this.a, ')');
        }

        public f(int i) {
            this.a = i;
            this.b = sgwpmp.zcHnwYec + (i + 1);
        }
    }
}
